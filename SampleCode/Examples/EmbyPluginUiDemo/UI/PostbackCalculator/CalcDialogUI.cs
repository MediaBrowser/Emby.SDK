namespace EmbyPluginUiDemo.UI.PostbackCalculator
{
    using System.ComponentModel;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;
    using MediaBrowser.Model.Attributes;

    public class CalcDialogUI : EditableOptionsBase
    {
        public enum OperationType
        {
            Add,
            Subtract,
            Multiply,
            Divide,
        }

        public override string EditorTitle => "AutoPostBack Calculator Demo";

        public override string EditorDescription =>
            "By applying the AutoPostBack attribute to one or more properties, the specified command will be "
            + "sent to the server each time when the input value is changed at the client.";

        [Browsable(false)]
        public string ErrorText { get; set; }

        [DisplayName("Operand 1")]
        [Description("Long integer")]
        [AutoPostBack(CalcPageView.PostBackCommand, nameof(Operand1))]
        public long Operand1 { get; set; }

        [DisplayName("Operation")]
        [Description("Long integer")]
        [AutoPostBack(CalcPageView.PostBackCommand, nameof(Operation))]
        public OperationType Operation { get; set; }

        ////[DisplayName("Operand 2")]
        [Description("Long integer")]
        [AutoPostBack(CalcPageView.PostBackCommand, nameof(Operand2))]
        public long Operand2 { get; set; }

        public SpacerItem Spacer { get; set; } = new SpacerItem();

        [VisibleCondition(nameof(ErrorText), SimpleCondition.IsNotNullOrEmpty)]
        public LabelItem ErrorLabel
        {
            get
            {
                return new LabelItem(this.ErrorText);
            }

            set
            {
            }
        }

        [VisibleCondition(nameof(ErrorText), SimpleCondition.IsNull)]
        [EnabledCondition(nameof(Result), SimpleCondition.IsNull)]
        public double Result { get; set; }
    }
}
