// <copyright file="ConfigWizardFinishView.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.ConfigWizard.Finish
{
    using System.Linq;
    using System.Threading;
    using System.Threading.Tasks;
    using Emby.Media.Common.Extensions;
    using EmbyPluginUiDemo.UIBaseClasses.Views;
    using MediaBrowser.Model.Plugins;

    internal class ConfigWizardFinishView : PluginWizardView
    {
        private readonly ConfigWizardManager wizardManager;
        private readonly CancellationTokenSource tokenSource = new CancellationTokenSource();

        public ConfigWizardFinishView(ConfigWizardManager wizardManager, PluginInfo pluginInfo)
        : base(pluginInfo.Id)
        {
            this.wizardManager = wizardManager;
            this.ContentData = new ConfigWizardFinishUI();
            this.AllowNext = false;
            this.AllowFinish = true;
            this.AllowCancel = true;
            this.AllowBack = true;

            this.ConfigWizardFinishUI.SummaryLabel1.Text = string.Format(@"{0}: {1}", "Demo Subject", "Desc");

            this.ConfigWizardFinishUI.SummaryLabel1.Text = string.Format(@"{0}: {1}", "Item Types", string.Join(", ", this.wizardManager.DemoSetup.ItemTypes.Select(e => e.GetDescription())));
        }

        public ConfigWizardFinishUI ConfigWizardFinishUI => this.ContentData as ConfigWizardFinishUI;

        public override Task OnCancelCommand()
        {
            this.tokenSource.Cancel();
            return this.wizardManager.OnCancel();
        }

        public override Task OnFinishCommand(string providerId, string commandId, string data)
        {
            return this.wizardManager.OnFinishCommand(providerId, commandId, this);
        }
    }
}
