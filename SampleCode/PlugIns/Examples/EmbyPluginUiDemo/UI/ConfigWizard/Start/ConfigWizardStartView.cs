// <copyright file="ConfigWizardStartView.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.ConfigWizard.Start
{
    using System.Threading.Tasks;
    using EmbyPluginUiDemo.UIBaseClasses.Views;
    using MediaBrowser.Model.Plugins.UI.Views;

    internal class ConfigWizardStartView : PluginWizardView
    {
        private readonly ConfigWizardManager wizardManager;

        public ConfigWizardStartView(ConfigWizardManager wizardManager, string pluginId)
        : base(pluginId)
        {
            this.wizardManager = wizardManager;
            this.ContentData = new ConfigWizardStartUI();
            this.PluginId = pluginId;
        }

        public ConfigWizardStartUI ConfigWizardStartUI => this.ContentData as ConfigWizardStartUI;

        public override Task OnCancelCommand()
        {
            return this.wizardManager.OnCancel();
        }

        public override Task<IPluginUIView> OnNextCommand(string providerId, string commandId, string data)
        {
            return this.wizardManager.OnNextCommand(providerId, commandId, this);
        }
    }
}
