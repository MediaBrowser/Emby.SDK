using System.ComponentModel;
using Emby.Web.GenericEdit;
using Emby.Web.GenericEdit.Elements;
using Emby.Web.GenericEdit.Validation;
using MediaBrowser.Model.Attributes;
using MediaBrowser.Model.Logging;

namespace EmbyPluginUiTemplate.UI.Basics
{
    public class MainPageUI : EditableOptionsBase
    {
        public override string EditorTitle => "MyPlugin Options";

        public override string EditorDescription => "This is a description text, shown at the top of the options page.\n"
                                                    + "The options below are just a few examples for creating UI elements.";

        [DisplayName("Output Folder")]
        [Description("Please choose a folder for plugin output")]
        [EditFolderPicker]
        public string TargetFolder { get; set; }

        [Description("The log level determines how messages will be logged")]
        public LogSeverity LogLevel { get; set; }

        [Description("This value is required and needs to have a minimum length of 10")]
        [MediaBrowser.Model.Attributes.Required]
        public string MessageFormat { get; set; }

        protected override void Validate(ValidationContext context)
        {
            if (!(this.MessageFormat?.Length >= 10))
            {
                context.AddValidationError(nameof(this.MessageFormat), "Minimum length is 10 characters");
            }
        }
            
        public SpacerItem Spacer2 { get; set; } = new SpacerItem();

        public CaptionItem CaptionButtonHandling { get; set; } = new CaptionItem("Button Interaction");

        public StatusItem StatusItem1 { get; set; } = new StatusItem("Status Item", "Operation not started yet", ItemStatus.Unavailable);

        public ButtonItem ActionButton1 { get; set; } = new ButtonItem("Do Work and Error") { Icon = IconNames.run_circle, Data1 = "ActionButton1" };
    }
}
