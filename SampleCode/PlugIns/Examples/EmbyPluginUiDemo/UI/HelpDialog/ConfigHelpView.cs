// <copyright file="ConfigHelpView.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.HelpDialog
{
    using System.Threading.Tasks;
    using EmbyPluginUiDemo.UIBaseClasses.Views;
    using MediaBrowser.Model.Plugins;

    internal class ConfigHelpView : PluginDialogView
    {
        public ConfigHelpView(PluginInfo pluginInfo)
        : base(pluginInfo.Id)
        {
            this.ContentData = new ConfigHelpUI();
            this.AllowCancel = true;
            this.OKButtonCaption = "OK";
        }

        public override string Caption => "Quick Help";

        public ConfigHelpUI ConfigHelpUI => this.ContentData as ConfigHelpUI;

        public override Task OnOkCommand(string providerId, string commandId, string data)
        {
            return Task.CompletedTask;
        }
    }
}
