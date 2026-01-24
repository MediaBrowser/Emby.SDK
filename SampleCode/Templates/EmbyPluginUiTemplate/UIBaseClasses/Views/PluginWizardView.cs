using System.Threading.Tasks;
using MediaBrowser.Model.Plugins.UI.Views;

namespace EmbyPluginUiTemplate.UIBaseClasses.Views
{
    internal abstract class PluginWizardView : PluginViewBase, IPluginWizardView
    {
        protected PluginWizardView(string pluginId)
        : base(pluginId)
        {
            this.AllowCancel = true;
            this.AllowNext = true;
        }

        public bool AllowCancel { get; set; }

        public bool AllowFinish { get; set; }

        public bool AllowBack { get; set; }

        public bool AllowNext { get; set; }

        public virtual Task OnCancelCommand()
        {
            return Task.CompletedTask;
        }

        public virtual Task<IPluginUIView> OnNextCommand(string providerId, string commandId, string data)
        {
            return Task.FromResult<IPluginUIView>(null);
        }

        public virtual Task OnFinishCommand(string providerId, string commandId, string data)
        {
            return Task.CompletedTask;
        }
    }
}
