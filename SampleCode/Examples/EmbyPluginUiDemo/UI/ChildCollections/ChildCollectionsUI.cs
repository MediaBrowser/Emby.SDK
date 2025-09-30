// <copyright file="NestingUI.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.ChildCollections
{
    using System.ComponentModel;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;

    public class ChildCollectionsUI : EditableOptionsBase
    {
        public override string EditorTitle => "Child Collections";

        public override string EditorDescription =>
            "When the repetition count is not fixed, it is also "
           + "possible to use an EditableObject collection to have"
           + "a dynamic number of child options. In this demo, a new " +
            "(empty) item gets added when the previous item is set to a non-empty value.";

        [DisplayName("Dynamic Collection of Child Options")]
        public ChildCollectionItemCollection Collection { get; set; } = new ChildCollectionItemCollection
                                                                   {
                                                                       new ChildCollectionItem(),
                                                                   };

        public SpacerItem Spacer3 { get; set; } = new SpacerItem();
    }
}
