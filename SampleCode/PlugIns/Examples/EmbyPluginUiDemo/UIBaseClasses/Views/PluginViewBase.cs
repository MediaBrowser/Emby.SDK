namespace EmbyPluginUiDemo.UIBaseClasses.Views
{
    using System;
    using System.Threading.Tasks;

    using MediaBrowser.Model.Dto;
    using MediaBrowser.Model.Events;
    using MediaBrowser.Model.GenericEdit;
    using MediaBrowser.Model.Plugins.UI.Views;
    using MediaBrowser.Model.Plugins.UI.Views.Enums;

    internal abstract class PluginViewBase : IPluginUIView, IPluginViewWithOptions
    {
        protected PluginViewBase(string pluginId)
        {
            this.PluginId = pluginId;
        }

        public event EventHandler<GenericEventArgs<IPluginUIView>> UIViewInfoChanged;

        public virtual string Caption => this.ContentData.EditorTitle;

        public virtual string SubCaption => this.ContentData.EditorDescription;

        public string PluginId { get; protected set; }

        public IEditableObject ContentData
        {
            get
            {
                return this.ContentDataCore;
            }

            set
            {
                this.ContentDataCore = value;
            }
        }

        public UserDto User { get; set; }

        public string RedirectViewUrl { get; set; }

        /// <summary>Gets or sets a URL, pointing to help information for this specific view.</summary>
        /// <value>The help URL.</value>
        /// <remarks>
        ///   <para>Applies to</para>
        ///   <list type="bullet">
        ///     <item>Page Views (<see cref="T:MediaBrowser.Model.Plugins.UI.Views.IPluginPageView" />)</item>
        ///     <item>Dialog Views (<see cref="T:MediaBrowser.Model.Plugins.UI.Views.IPluginDialogView" />)</item>
        ///     <item>Wizard Views (<see cref="T:MediaBrowser.Model.Plugins.UI.Views.IPluginWizardView" />)</item>
        ///   </list>
        /// </remarks>
        public Uri HelpUrl { get; set; }

        /// <summary>Gets or sets the action to be taken when the plugin view is exited.</summary>
        /// <value>The query close action.</value>
        /// <remarks>
        ///   <para>Use this to specify what should happen when the user exits a view by navigating back,
        ///         pressing cancel or mouse-clicking or tapping outside of a dialog.
        ///   </para>
        ///   <para>The default is <see cref="F:MediaBrowser.Model.Plugins.UI.Views.Enums.QueryCloseAction.None" /></para>
        ///   <para>Applies to</para>
        ///   <list type="bullet">
        ///     <item>Page Views (<see cref="T:MediaBrowser.Model.Plugins.UI.Views.IPluginPageView" />)</item>
        ///     <item>Dialog Views (<see cref="T:MediaBrowser.Model.Plugins.UI.Views.IPluginDialogView" />)</item>
        ///   </list>
        /// </remarks>
        public QueryCloseAction QueryCloseAction { get; set; }

        /// <summary>Gets or sets the action to be taken when leaving a Wizard View.</summary>
        /// <value>The wizard hiding behavior.</value>
        /// <remarks>
        ///   <para>Use this to specify what should happen when the user exits a wizard view by navigating away,
        ///         mouse-clicking or tapping outside of the wizard.
        ///   </para>
        ///   <para>Please note that it can make sense to use different values at different stages of
        ///         a wizard progress. For example, the initial wizard page should always be set to
        ///         <see cref="F:MediaBrowser.Model.Plugins.UI.Views.Enums.WizardHidingBehavior.AutoCancel" /> as there is not state that
        ///         would need to be retained.
        ///   </para>
        ///   <para>The default is <see cref="F:MediaBrowser.Model.Plugins.UI.Views.Enums.WizardHidingBehavior.AutoCancel" /></para>
        ///   <para>Applies to</para>
        ///   <list type="bullet">
        ///     <item>Wizard Views (<see cref="T:MediaBrowser.Model.Plugins.UI.Views.IPluginWizardView" />)</item>
        ///   </list>
        /// </remarks>
        public WizardHidingBehavior WizardHidingBehavior { get; set; }

        /// <summary>Gets or sets how a Page View should be presented in cases of limited screen space (like TV mode).</summary>
        /// <value>The compact view appearance.</value>
        public CompactViewAppearance CompactViewAppearance { get; set; }

        /// <summary>Gets or sets the preferred dialog size.</summary>
        /// <value>The preferred dialog display size.</value>
        /// <remarks>
        ///   <para>Please note that in case of TV or mobile display modes, dialogs may always be shown
        ///         as full-screen.</para>
        ///   <para>The default is <see cref="F:MediaBrowser.Model.Plugins.UI.Views.Enums.DialogSize.AutoFit" /></para>
        ///   <para>Applies to</para>
        ///   <list type="bullet">
        ///     <item>Dialog Views (<see cref="T:MediaBrowser.Model.Plugins.UI.Views.IPluginDialogView" />)</item>
        ///   </list>
        /// </remarks>
        public DialogSize DialogSize { get; set; }

        public string OKButtonCaption { get; set; }

        public DialogAction PrimaryDialogAction { get; set; }

        protected IEditableObject ContentDataCore { get; set; }

        public virtual bool IsCommandAllowed(string commandKey)
        {
            return true;
        }

        public virtual Task<IPluginUIView> RunCommand(string itemId, string commandId, string data)
        {
            return Task.FromResult<IPluginUIView>(null);
        }

        public virtual Task Cancel()
        {
            return Task.CompletedTask;
        }

        public virtual void OnDialogResult(IPluginUIView dialogView, bool completedOk, object data)
        {
        }

        protected virtual void RaiseUIViewInfoChanged()
        {
            this.UIViewInfoChanged?.Invoke(this, new GenericEventArgs<IPluginUIView>(this));
        }

        protected virtual void RaiseUIViewInfoChanged(GenericEventArgs<IPluginUIView> e)
        {
            this.UIViewInfoChanged?.Invoke(this, e);
        }

        public virtual PluginViewOptions ViewOptions
        {
            get
            {
                return new PluginViewOptions
                {
                    HelpUrl = this.HelpUrl,
                    CompactViewAppearance = this.CompactViewAppearance,
                    QueryCloseAction = this.QueryCloseAction,
                    DialogSize = this.DialogSize,
                    OKButtonCaption = this.OKButtonCaption,
                    PrimaryDialogAction = this.PrimaryDialogAction,
                    WizardHidingBehavior = this.WizardHidingBehavior,
                };
            }
        }
    }
}
