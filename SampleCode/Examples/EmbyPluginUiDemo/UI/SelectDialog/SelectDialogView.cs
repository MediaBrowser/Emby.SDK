// <copyright file="SelectDialogView.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.SelectDialog
{
    using System.Collections.Generic;
    using System.Globalization;
    using System.Linq;
    using System.Threading.Tasks;
    using Emby.Media.Common.Extensions;
    using EmbyPluginUiDemo.Model;
    using EmbyPluginUiDemo.UIBaseClasses.Views;
    using MediaBrowser.Controller.Entities;
    using MediaBrowser.Model.Plugins;
    using MediaBrowser.Model.Plugins.UI;
    using MediaBrowser.Model.Plugins.UI.Views;

    internal class SelectDialogView : PluginDialogView
    {
        public const string PostBack = nameof(PostBack);
        private readonly List<GridDataItem> itemList;

        public SelectDialogView(PluginInfo pluginInfo, List<GridDataItem> itemList)
        : base(pluginInfo.Id)
        {
            this.itemList = itemList;
            this.ContentData = new SelectDialogUI();
            this.SelectDialogUI.UpdatePhrasesList(this.itemList);
        }

        public override string Caption => "Select Item";

        public SelectDialogUI SelectDialogUI => this.ContentData as SelectDialogUI;

        public GridDataItem SelectedItem { get; set; }

        public override async Task<IPluginUIView> RunCommand(string itemId, string commandId, string data)
        {
            IPluginUIView newView = null;

            switch (commandId)
            {
                case PostBack:

                    this.SelectDialogUI.UpdatePhrasesList(this.itemList);
                    newView = this;
                    break;
            }

            if (newView != null)
            {
                return newView;
            }

            return await base.RunCommand(itemId, commandId, data).ConfigureAwait(false);
        }

        public override Task OnOkCommand(string providerId, string commandId, string data)
        {
            if (this.SelectDialogUI.SelectedItem.IsNotEmpty())
            {
                if (long.TryParse(this.SelectDialogUI.SelectedItem, out long selectId))
                {
                    this.SelectedItem = this.itemList.FirstOrDefault(e => e.InternalId == selectId);

                    if (this.SelectedItem != null)
                    {
                        return Task.CompletedTask;
                    }
                }
            }

            throw new EmbyUserException("Please select a phrase", null);
        }
    }
}
