// <copyright file="ConfigWizardTypeSelection.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.ConfigWizard.TypeSelection
{
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using EmbyPluginUiDemo.Model;
    using EmbyPluginUiDemo.Model.Selections;
    using EmbyPluginUiDemo.UIBaseClasses.Views;
    using MediaBrowser.Model.Plugins.UI;
    using MediaBrowser.Model.Plugins.UI.Views;

    internal class ConfigWizardTypeSelection : PluginWizardView
    {
        private readonly ItemTypeSelection itemTypeSelection;
        private readonly ConfigWizardManager wizardManager;
        private List<DemoItemType> usedItemTypes;

        public ConfigWizardTypeSelection(ConfigWizardManager wizardManager, string pluginId)
            : base(pluginId)
        {
            this.wizardManager = wizardManager;
            this.ContentData = new ConfigWizardTypeSelectionUI();
            this.PluginId = pluginId;
            this.itemTypeSelection = new ItemTypeSelection();
            this.ConfigWizardTypeSelectionUI.SetSelectOptions(this.itemTypeSelection);
            this.usedItemTypes = new List<DemoItemType>();
            this.AllowBack = true;
        }

        public override string Caption => "Choose Item Types";

        public ConfigWizardTypeSelectionUI ConfigWizardTypeSelectionUI => this.ContentData as ConfigWizardTypeSelectionUI;

        public override Task OnCancelCommand()
        {
            return this.wizardManager.OnCancel();
        }

        public override Task<IPluginUIView> OnNextCommand(string providerId, string commandId, string data)
        {
            this.ConfigWizardTypeSelectionUI.GetSelection(this.itemTypeSelection);
            var demoSetup = this.wizardManager.DemoSetup;

            demoSetup.ItemTypes = this.itemTypeSelection.SelectedItemsTyped.Select(e => e.Item).ToList();

            if (demoSetup.ItemTypes.Count == 0)
            {
                throw new EmbyUserException("Please select at least one item type", null);
            }

            var duplicateItemTypes = demoSetup.ItemTypes
                .Where(e => this.usedItemTypes.Contains(e))
                .ToList();

            if (duplicateItemTypes.Any())
            {
                var dic = this.itemTypeSelection.ItemsTyped.ToDictionary(e => e.Item, e => e);
                foreach (var itemType in duplicateItemTypes)
                {
                    dic[itemType].IsSelected = false;
                }

                throw new EmbyUserException("Item types for which a configuration exists already cannot be selected", null);
            }

            if (demoSetup.ItemTypes.Count > 1 &&
                (demoSetup.ItemTypes.Contains(DemoItemType.Games) || demoSetup.ItemTypes.Contains(DemoItemType.Albums)))
            {
                throw new EmbyUserException("Game genres and music genres cannot be combined with other item types", null);
            }

            return this.wizardManager.OnNextCommand(providerId, commandId, this);
        }
    }
}