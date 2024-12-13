// <copyright file="GetSomeData.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginSimpleUi.Services
{
    using MediaBrowser.Controller.Net;
    using MediaBrowser.Model.Entities;
    using MediaBrowser.Model.Services;

    [Route("/MyApi/{Id}/Data", "GET", Summary = "Gets data for an item")]
    [Authenticated(Roles = "Admin")]
    public class GetSomeData : IReturn<VirtualFolderInfo>
    {
        [ApiMember(Name = "Id", Description = "The id of the item", IsRequired = true, DataType = "string", ParameterType = "path", Verb = "GET")]
        public string Id { get; set; }
    }
}