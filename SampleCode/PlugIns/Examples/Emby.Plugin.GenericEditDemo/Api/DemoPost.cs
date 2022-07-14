// <copyright file="DemoPost.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace Emby.Plugin.GenericEditDemo.Api
{
    using System.IO;
    using MediaBrowser.Controller.Net;
    using MediaBrowser.Model.Services;

    /// <summary>
    /// Class DemoPost.
    /// </summary>
    [Route("/GenericEditDemo/Demo", "POST", Summary = "Updates GenericEdit demo data")]
    [Authenticated(Roles = "Admin")]
    public class DemoPost : IRequiresRequestStream, IReturnVoid
    {
        /// <summary>Gets or sets the raw Http Request Input Stream.</summary>
        public Stream RequestStream { get; set; }

        [ApiMember(Name = "DemoSet", Description = "Set of demos", IsRequired = true, DataType = "int", ParameterType = "query", Verb = "POST")]
        public int DemoSet { get; set; }

        [ApiMember(Name = "DemoType", Description = "Type of demo object", IsRequired = true, DataType = "int", ParameterType = "query", Verb = "POST")]
        public int DemoType { get; set; }
    }
}