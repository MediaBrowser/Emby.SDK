namespace EmbyPluginUiDemo.UI.ChildCollections
{
    using System.Collections;
    using System.Collections.Generic;
    using Emby.Web.GenericEdit;
    using MediaBrowser.Model.GenericEdit;

    public class ChildCollectionItemCollection :
        List<ChildCollectionItem>,
        IEditableObjectCollection,
        IEnumerable<ChildCollectionItem>
    {
        public ChildCollectionItemCollection()
        {
        }

        public ChildCollectionItemCollection(IEnumerable<ChildCollectionItem> collection)
            : base(collection)
        {
        }

        public ChildCollectionItemCollection(int capacity)
            : base(capacity)
        {
        }

        IEnumerator<IEditableObject> IEnumerable<IEditableObject>.GetEnumerator() => (IEnumerator<IEditableObject>) this.GetEnumerator();
        IEnumerator<ChildCollectionItem> IEnumerable<ChildCollectionItem>.GetEnumerator() => (IEnumerator<ChildCollectionItem>) this.GetEnumerator();

        IEnumerator IEnumerable.GetEnumerator() => this.GetEnumerator();
    }
}