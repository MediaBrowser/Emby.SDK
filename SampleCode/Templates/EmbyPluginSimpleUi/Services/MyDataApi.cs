// <copyright file="MyDataApi.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginSimpleUi.Services
{
    using System.Threading.Tasks;
    using EmbyPluginSimpleUi.Common;
    using MediaBrowser.Common;
    using MediaBrowser.Controller.Base;
    using MediaBrowser.Controller.Net;
    using MediaBrowser.Model.Entities;
    using MediaBrowser.Model.Services;

    [Authenticated]
    public class MyDataApi : CommonBase, IService
    {
        public MyDataApi(IApplicationHost appHost)
        : base(new ServiceRoot(appHost))
        {
        }

        public Task<VirtualFolderInfo> Get(GetSomeData request)
        {
            var targetFolder = this.Options.TargetFolder;
            var info = new VirtualFolderInfo { ItemId = request.Id, Name = targetFolder };

            return Task.FromResult(info);
        }
    }
}
