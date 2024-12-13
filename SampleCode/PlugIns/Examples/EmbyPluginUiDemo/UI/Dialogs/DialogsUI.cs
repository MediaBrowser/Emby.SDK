// <copyright file="BasicsUI.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.Dialogs
{
    using System.ComponentModel;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;
    using Emby.Web.GenericEdit.Factory;

    public class DialogsUI : EditableOptionsBase
    {
        public override string EditorTitle => "Dialogs and Wizards";

        public override string EditorDescription => "Demonstration of dialog and wizard UI";

        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        public CaptionItem CaptionSimpleButtons { get; set; } = new CaptionItem("Simple Dialog");

        public LabelItem LabelSimpleButtons { get; set; } = new LabelItem("This displays a dialog from the Metadata Cleaner Plugin " +
                                                                          "which provides a quick help overview " +
                                                                          "of the status and button items in the main view");

        public ButtonItem ButtonHelp { get; set; } = new ButtonItem("Show Help Dialog") { Icon = IconNames.help_outline, Data1 = "HelpDialog" };

        public CaptionItem CaptionSelectDialog { get; set; } = new CaptionItem("Search Dialog with Return Value");

        public LabelItem LabelSelectDialog { get; set; } = new LabelItem("In this demo, we are showing a dialog which allows searching in a " +
                                                                         "list of data and how to process a return value from the dialog on close");

        [DisplayName("Selected Item")]
        [ReadOnly(true)]
        public string SelectedItem { get; set; } = "";

        public ButtonItem ButtonSelectDialog { get; set; } = new ButtonItem("Choose Item") { Icon = IconNames.search, Data1 = "ChooseItem" };

        public CaptionItem CaptionFullScreens { get; set; } = new CaptionItem("Full-Screen Data Dialog");

        public LabelItem LabelFullScreenDialog { get; set; } = new LabelItem("This demo shows a full-screen dialog with a data grid ");

        public ButtonItem ButtonFullScreenDialog { get; set; } = new ButtonItem("Choose Item") { Icon = IconNames.search, Data1 = "FullScreenDialog" };

        public CaptionItem CaptionWizard { get; set; } = new CaptionItem("Wizard Demo");

        public LabelItem LabelWizard { get; set; } = new LabelItem("Please review the class ConfigWizardManager which demonstrates how to manage " +
                                                                   "state and wizard page navigation (previous/next). The second page also shows " +
                                                                   "the use of a multi-column grid for making selections");

        public ButtonItem Button4 { get; set; } = new ButtonItem("Show Setup Wizard")
        {
            Icon = IconNames.multiple_stop,
            Data1 = "ConfigWizard",
        };

        /// <summary>Gets the editor build options.</summary>
        /// <returns>The <see cref="EditorBuildOptions"/>.</returns>
        protected override EditorBuildOptions GetEditorBuildOptions()
        {
            var options = base.GetEditorBuildOptions();

            // ReadOnly Properties are not included by default. To show those properties
            // it is required to override GetEditorBuildOptions() and set IncludeReadOnly
            options.IncludeReadOnly = true;
            return options;
        }
    }
}
