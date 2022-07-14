// <copyright file="DemoListGet.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace Emby.Plugin.GenericEditDemo.Api
{
    using System.Collections.Generic;

    using Emby.Plugin.GenericEditDemo.Data;

    using MediaBrowser.Controller.Net;
    using MediaBrowser.Model.Services;

    /// <summary>
    /// Class DemoGet.
    /// </summary>
    [Route("/GenericEditDemo/DemoTypes", "GET", Summary = "Gets a list of demos")]
    [Authenticated(Roles = "Admin")]
    public class DemoListGet : IReturn<IEnumerable<DemoTypeInfo>>
    {
        [ApiMember(Name = "DemoSet", Description = "Set of demos", IsRequired = true, DataType = "int", ParameterType = "query", Verb = "GET")]
        public int DemoSet { get; set; }
    }
}