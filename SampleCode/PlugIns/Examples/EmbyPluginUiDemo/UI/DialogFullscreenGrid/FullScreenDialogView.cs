// <copyright file="UiViewShowPlaylistStreams.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.DialogFullscreenGrid
{
    using System.Collections.Generic;
    using System.Threading.Tasks;
    using EmbyPluginUiDemo.Model;
    using EmbyPluginUiDemo.UIBaseClasses.Views;
    using MediaBrowser.Controller.Entities;
    using MediaBrowser.Model.Plugins;

    internal sealed class FullScreenDialogView : PluginDialogView
    {
        private readonly List<GridDataItem> itemList;

        public FullScreenDialogView(PluginInfo pluginInfo, List<GridDataItem> itemList)
            : base(pluginInfo.Id)
        {
            this.itemList = itemList;
            this.ContentData = new ShowPlaylistStreamsUi(itemList);

            this.ShowDialogFullScreen = true;
            this.AllowOk = true;
            this.AllowCancel = true;
        }

        public override string Caption => "Full Screen Data Dialog";

        public override bool ShowDialogFullScreen { get; }

        public ShowPlaylistStreamsUi ShowEpgChannelsUi => this.ContentData as ShowPlaylistStreamsUi;

        public override Task Cancel()
        {
            return Task.CompletedTask;
        }

        public override Task OnOkCommand(string providerId, string commandId, string data)
        {
            return Task.CompletedTask;
        }
    }
}