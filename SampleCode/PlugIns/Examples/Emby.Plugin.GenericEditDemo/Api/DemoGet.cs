// <copyright file="DemoGet.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace Emby.Plugin.GenericEditDemo.Api
{
    using Emby.Web.GenericEdit;

    using MediaBrowser.Controller.Net;
    using MediaBrowser.Model.Services;

    /// <summary>
    /// Class DemoGet.
    /// </summary>
    [Route("/GenericEditDemo/Demo", "GET", Summary = "Gets GenericEdit demo data")]
    [Authenticated(Roles = "Admin")]
    public class DemoGet : IReturn<EditObjectContainer>
    {
        [ApiMember(Name = "DemoSet", Description = "Set of demos", IsRequired = true, DataType = "int", ParameterType = "query", Verb = "GET")]
        public int DemoSet { get; set; }

        [ApiMember(Name = "DemoType", Description = "Type of demo object", IsRequired = true, DataType = "int", ParameterType = "query", Verb = "GET")]
        public int DemoType { get; set; }
    }
}