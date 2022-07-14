// <copyright file="DemoApiService.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace Emby.Plugin.GenericEditDemo.Api
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Linq;
    using System.Threading.Tasks;

    using Emby.Plugin.GenericEditDemo.Data;
    using Emby.Web.GenericEdit;

    using MediaBrowser.Controller;
    using MediaBrowser.Controller.Net;
    using MediaBrowser.Model.Serialization;
    using MediaBrowser.Model.Services;

    /// <summary>
    /// Implements the API service for the GenericEditDemo plugin.
    /// </summary>
    /// <seealso cref="IService" />
    /// <seealso cref="IRequiresRequest" />
    [Authenticated(Roles = "Admin")]
    public class DemoApiService : IService, IRequiresRequest
    {
        private readonly DemoDataManager dataManager;

        private readonly IHttpResultFactory resultFactory;

        private readonly IJsonSerializer serializer;

        /// <summary>Initializes a new instance of the <see cref="DemoApiService" /> class.</summary>
        /// <param name="resultFactory">The result factory.</param>
        /// <param name="applicationHost">The application host.</param>
        /// <param name="serializer">The serializer.</param>
        public DemoApiService(IHttpResultFactory resultFactory, IServerApplicationHost applicationHost, IJsonSerializer serializer)
        {
            this.resultFactory = resultFactory;
            this.serializer = serializer;
            var plugin = applicationHost.Plugins.OfType<Plugin>().First();
            this.dataManager = plugin.DataManager;
        }

        /// <summary>Gets or sets the request.</summary>
        /// <value>The request.</value>
        public IRequest Request { get; set; }

        /// <summary>Gets the list of available demos.</summary>
        /// <param name="request">The request.</param>
        /// <returns>A list of <see cref="DemoTypeInfo"/>.</returns>
        public object Get(DemoListGet request)
        {
            IList<DemoTypeInfo> list;

            switch (request.DemoSet)
            {
                case 1:
                    list = DemoTypeInfo.GetSet1DemoList();
                    break;
                case 2:
                    list = DemoTypeInfo.GetSet2DemoList();
                    break;
                default:
                    throw new ArgumentOutOfRangeException(nameof(request.DemoSet), request.DemoSet, null);
            }

            return this.resultFactory.GetResult(this.Request, list);
        }

        /// <summary>
        /// Gets the specified codec parameters.
        /// </summary>
        /// <param name="request">The request.</param>
        /// <returns>The codec parameters as serializable object.</returns>
        public object Get(DemoGet request)
        {
            var data = this.dataManager.GetDemoData(request.DemoSet, request.DemoType);
            var container = data.CreateEditContainer();
            return this.resultFactory.GetResult(this.Request, container);
        }

        /// <summary>Posts the specified configuraiton.</summary>
        /// <param name="request">The request.</param>
        /// <returns>The <see cref="Task" />.</returns>
        public async Task Post(DemoPost request)
        {
            if (request == null)
            {
                throw new ArgumentNullException(nameof(request));
            }

            using (var ms = new MemoryStream())
            {
                await request.RequestStream.CopyToAsync(ms).ConfigureAwait(false);

                var data = this.dataManager.GetDemoData(request.DemoSet, request.DemoType);
                var newData = data.DeserializeFromJsonStream(ms, this.serializer);
                this.dataManager.UpdateDemoData(newData as EditableObjectBase, request.DemoSet, request.DemoType);
            }
        }
    }
}