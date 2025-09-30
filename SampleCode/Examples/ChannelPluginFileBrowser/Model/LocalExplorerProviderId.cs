// <copyright file="LocalExplorerProviderId.cs" company="Emby LLC">
// Copyright © Emby LLC. All rights reserved.
// </copyright>

namespace EmbyFileBrowser.Model
{
    using MediaBrowser.Controller.Entities;
    using MediaBrowser.Controller.Providers;
    using MediaBrowser.Model.Entities;

    public class LocalExplorerProviderId : IExternalId
    {
        public const string Id = "localexplorer";

        public string Key
        {
            get
            {
                return Id;
            }
        }

        public string Name
        {
            get
            {
                return "Local File/Folder";
            }
        }

        public string UrlFormatString
        {
            get
            {
                return "localexplorer:{0}";
            }
        }

        public bool Supports(IHasProviderIds item)
        {
            return item is BaseItem;
        }
    }
}