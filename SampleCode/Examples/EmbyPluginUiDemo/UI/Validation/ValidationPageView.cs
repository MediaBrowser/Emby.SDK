namespace EmbyPluginUiDemo.UI.Validation
{
    using System.Threading.Tasks;

    using Emby.Web.GenericEdit;

    using EmbyPluginUiDemo.UIBaseClasses.Views;

    using MediaBrowser.Model.Plugins;
    using MediaBrowser.Model.Plugins.UI.Views;

    internal class ValidationPageView : PluginPageView
    {
        public ValidationPageView(PluginInfo pluginInfo)
        : base(pluginInfo.Id)
        {
            this.ContentData = new ValidationUI();
        }

        public ValidationUI ValidationUI => this.ContentData as ValidationUI;

        public override Task<IPluginUIView> OnSaveCommand(string itemId, string commandId, string data)
        {
            if (this.ContentData is EditableOptionsBase editableOptions)
            {
                editableOptions.ValidateOrThrow();
            }

            return Task.FromResult((IPluginUIView)this);
        }
    }
}
