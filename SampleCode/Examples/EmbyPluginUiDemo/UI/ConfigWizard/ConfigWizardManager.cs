// <copyright file="ConfigWizardManager.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.ConfigWizard
{
    using System;
    using System.Collections.Generic;
    using System.Threading.Tasks;
    using EmbyPluginUiDemo.Model;
    using EmbyPluginUiDemo.UI.ConfigWizard.Finish;
    using EmbyPluginUiDemo.UI.ConfigWizard.Start;
    using EmbyPluginUiDemo.UI.ConfigWizard.TypeSelection;
    using EmbyPluginUiDemo.UIBaseClasses.Views;
    using MediaBrowser.Common;
    using MediaBrowser.Model.Dto;
    using MediaBrowser.Model.Plugins;
    using MediaBrowser.Model.Plugins.UI.Views;

    internal class ConfigWizardManager
    {
        private readonly IApplicationHost appHost;
        private readonly PluginInfo pluginInfo;

        public ConfigWizardManager(IApplicationHost appHost, DemoSetup demoSetup, PluginInfo pluginInfo)
        {
            this.appHost = appHost;
            this.pluginInfo = pluginInfo;
            this.DemoSetup = demoSetup;
            this.InitItemCounts();
        }

        public DemoSetup DemoSetup { get; }

        public ItemCounts ItemCounts { get; private set; }

        public Task OnCancel()
        {
            return Task.CompletedTask;
        }

        public Task OnFinishCommand(string providerId, string commandId, PluginWizardView wizardView)
        {
            return Task.CompletedTask;
        }

        public Task<IPluginUIView> OnNextCommand(string providerId, string commandId, PluginWizardView wizardView)
        {
            IPluginUIView nextView = null;

            if (wizardView.GetType() == typeof(ConfigWizardStartView))
            {
                nextView = new ConfigWizardTypeSelection(this, this.pluginInfo.Id);
            }

            if (nextView == null)
            {
                nextView = new ConfigWizardFinishView(this, this.pluginInfo);
            }

            return Task.FromResult(nextView);
        }

        public async Task<IPluginUIView> OnNextToRunWizardTask(string providerId, string commandId, PluginWizardView wizardView)
        {
            await this.OnFinishCommand(providerId, commandId, wizardView).ConfigureAwait(false);

            return null;

            ////var manager = new RunWizardManager(this.plugin, this.DemoSetup, this.pluginInfo, wizardView.User);
            ////var newView = new RunWizardStartView(manager, this.pluginInfo);

            ////return newView;
        }

        private static List<WizardStepFactory> GetWizardSteps()
        {
            return new List<WizardStepFactory>
                       {
                           // WizardStepFactory.Create<WizardSelectTestAreas>(),
                           // WizardStepFactory.Create<WizardSelectTestFiles>(),
                           // WizardStepFactory.Create<WizardSelectHwAccels>(),
                           // WizardStepFactory.Create<WizardSelectToneMappingType>(),
                           // WizardStepFactory.Create<WizardSelectFilterOperation>(),
                           // WizardStepFactory.Create<WizardSelectSubtitleProcessing>(),
                           // WizardStepFactory.Create<WizardSelectSubtitleOverlay>(),
                           // WizardStepFactory.Create<WizardSelectSubtitleOutput>(),
                           // WizardStepFactory.Create<WizardSelectTranscodeSegment>(),
                       };
        }

        private void InitItemCounts()
        {
        }

        private class WizardStepFactory
        {
            private WizardStepFactory(Type viewType)
            {
                this.ViewType = viewType;
            }

            public Type ViewType { get; }

            public static WizardStepFactory Create<T>()
                where T : ConfigWizardTypeSelection
            {
                return new WizardStepFactory(typeof(T));
            }

            public ConfigWizardTypeSelection CreateStep(ConfigWizardManager wizardManager, PluginInfo pluginInfo)
            {
                return Activator.CreateInstance(this.ViewType, wizardManager, pluginInfo.Id) as ConfigWizardTypeSelection;
            }
        }
    }
}