// <copyright file="FileBrowserChannel.cs" company="Emby LLC">
// Copyright © Emby LLC. All rights reserved.
// </copyright>

namespace EmbyFileBrowser.Operation
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Runtime.CompilerServices;
    using System.Threading;
    using System.Threading.Tasks;

    using EmbyFileBrowser.Common;
    using EmbyFileBrowser.Model;

    using MediaBrowser.Controller;
    using MediaBrowser.Controller.Channels;
    using MediaBrowser.Controller.Drawing;
    using MediaBrowser.Controller.Entities;
    using MediaBrowser.Controller.Library;
    using MediaBrowser.Controller.Providers;
    using MediaBrowser.Model.Channels;
    using MediaBrowser.Model.Configuration;
    using MediaBrowser.Model.Drawing;
    using MediaBrowser.Model.Dto;
    using MediaBrowser.Model.Entities;
    using MediaBrowser.Model.IO;
    using MediaBrowser.Model.Logging;

    public class FileBrowserChannel : CommonBase, IChannel
    {
        private readonly IFileSystem fileSystem;
        private readonly ILibraryManager libraryManager;
        private readonly IImageProcessor imageProcessor;

        public FileBrowserChannel(IServerApplicationHost appHost, ILogManager logManager)
            : base(new PluginServiceRoot(appHost, logManager))
        {
            this.fileSystem = this.GetService<IFileSystem>();
            this.imageProcessor = this.GetService<IImageProcessor>();
            this.libraryManager = this.GetService<ILibraryManager>();
        }

        public string Description => FileBrowserPlugin.PluginDescription;

        public string Name => FileBrowserPlugin.PluginName;

        public ChannelParentalRating ParentalRating => ChannelParentalRating.GeneralAudience;

        public Task<DynamicImageResponse> GetChannelImage(ImageType type, CancellationToken cancellationToken)
        {
            switch (type)
            {
                case ImageType.Thumb:
                case ImageType.Primary:
                    {
                        return Task.FromResult(
                            new DynamicImageResponse
                            {
                                Format = ImageFormat.Png,
                                Stream = typeof(FileBrowserPlugin).Assembly.GetManifestResourceStream(typeof(FileBrowserPlugin).Namespace + ".thumb.png"),
                            });
                    }
            }

            return null;
        }

        public Task<ChannelItemResult> GetChannelItems(InternalChannelItemQuery query, CancellationToken cancellationToken)
        {
            ChannelItemResult result;

            if (query.FolderId == null)
            {
                result = this.GetRootFolders(cancellationToken);
            }
            else
            {
                result = this.GetStreamItems(query, cancellationToken);
            }

            return Task.FromResult(result);
        }

        public IEnumerable<ImageType> GetSupportedChannelImages()
        {
            return new List<ImageType>
                   {
                       ImageType.Thumb,
                       ImageType.Primary,
                   };
        }

        private ChannelItemResult GetRootFolders(CancellationToken token)
        {
            var options = this.Plugin.GetPluginOptions();

            var rootFolders = new List<string>();
            if (options.RootFolder1.IsNotEmpty())
            {
                rootFolders.Add(options.RootFolder1);
            }

            if (options.RootFolder2.IsNotEmpty())
            {
                rootFolders.Add(options.RootFolder2);
            }

            if (options.RootFolder3.IsNotEmpty())
            {
                rootFolders.Add(options.RootFolder3);
            }

            var items = new List<ChannelItemInfo>();

            foreach (var folder in rootFolders)
            {
                var dir = this.fileSystem.GetDirectoryInfo(folder);
                if (dir.Exists)
                {
                    var channelItem = CreateFolderInfo(dir);

                    items.Add(channelItem);
                }
            }

            return new ChannelItemResult
            {
                Items = items.ToList(),
                TotalRecordCount = items.Count,
            };
        }

        private static ChannelItemInfo CreateFolderInfo(FileSystemMetadata dir)
        {
            var channelItem = new ChannelItemInfo
            {
                DateCreated = dir.CreationTimeUtc,
                DateModified = dir.CreationTimeUtc,
                FolderType = ChannelFolderType.Container,
                ForceUpdate = true,
                Id = dir.FullName,
                Name = dir.Name,
                OriginalTitle = dir.FullName,
                Overview = "", // TODO
                Type = ChannelItemType.Folder,
            };
            return channelItem;
        }

        private ChannelItemInfo CreateFilenfo(FileSystemMetadata file)
        {
            var contentType = ChannelMediaContentType.Clip;

            if (this.libraryManager.IsVideoFile(file, new LibraryOptions()))
            {
                contentType = ChannelMediaContentType.Movie;
            }
            else if (this.libraryManager.IsAudioFile(file, new LibraryOptions()))
            {
                contentType = ChannelMediaContentType.Song;
            }
            ////else if (file.Extension.IsNotEmpty() && imageProcessor.SupportedFileExtensions.Contains(file.Extension, StringComparer.OrdinalIgnoreCase))
            ////{
            ////    contentType = Photo => not yet...
            ////}

            var channelItem = new ChannelItemInfo
            {
                ContentType = ChannelMediaContentType.Clip,
                Type = ChannelItemType.Media,
                MediaSources = new List<MediaSourceInfo> { new MediaSourceInfo { Path = file.FullName } },
                DateCreated = file.CreationTimeUtc,
                DateModified = file.CreationTimeUtc,
                ForceUpdate = true,
                Id = file.FullName,
                Name = file.Name,
                OriginalTitle = file.FullName,
                Overview = "", // TODO
                ProviderIds = GetProviderIds(file.FullName),
            };

            return channelItem;
        }

        private static ProviderIdDictionary GetProviderIds(string path)
        {
            var dic = new ProviderIdDictionary();
            dic.Add(LocalExplorerProviderId.Id, path);
            return dic;
        }

        private ChannelItemResult GetStreamItems(InternalChannelItemQuery channelItemQuery, CancellationToken token)
        {
            if (!this.fileSystem.DirectoryExists(channelItemQuery.FolderId))
            {
                return new ChannelItemResult
                {
                    Items = new List<ChannelItemInfo>(),
                    TotalRecordCount = 0,
                };
            }

            var items = new List<ChannelItemInfo>();
            var entries = this.fileSystem.GetFileSystemEntries(channelItemQuery.FolderId);

            foreach (var entry in entries)
            {
                if (entry.IsDirectory)
                {
                    var channelItem = CreateFolderInfo(entry);
                    items.Add(channelItem);
                }
                else
                {
                    var channelItem = CreateFilenfo(entry);
                    items.Add(channelItem);
                }
            }

            return new ChannelItemResult
            {
                Items = items.ToList(),
                TotalRecordCount = items.Count,
            };
        }
    }
}