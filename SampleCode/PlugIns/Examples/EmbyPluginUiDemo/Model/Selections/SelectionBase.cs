// <copyright file="SelectionBase.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.Model.Selections
{
    using System.Collections.Generic;
    using System.Linq;
    using MediaBrowser.Model.Serialization;

    public abstract class SelectionBase<T1, T2> : ISelectionBase
        where T1 : SelectionItemBase<T2>
    {
        // ReSharper disable once MemberInitializerValueIgnored
        private readonly List<T1> items = new List<T1>();

        protected SelectionBase()
        {
            this.items = new List<T1>();
        }

        [IgnoreDataMember]
        public IReadOnlyCollection<SelectionItemBase> SelectedItems => this.items.Where(e => e.IsSelected).ToList().AsReadOnly();

        [IgnoreDataMember]
        public IReadOnlyCollection<SelectionItemBase> Items => this.items.AsReadOnly();

        [IgnoreDataMember]
        public IReadOnlyCollection<T1> SelectedItemsTyped => this.items.Where(e => e.IsSelected).ToList().AsReadOnly();

        [IgnoreDataMember]
        public IList<T1> ItemsTyped
        {
            get
            {
                return this.items.ToList();
            }

            set
            {
                this.items.Clear();
                this.items.AddRange(value.ToList());
            }
        }

        public IList<string> SelectedKeys
        {
            get
            {
                return this.items?.Where(e => e.IsSelected).Select(e => e.Key).ToList();
            }

            set
            {
                this.SetFromKeys(value);
            }
        }

        [IgnoreDataMember]
        public int SelectedItemCount => this.SelectedItems.Count;

        [IgnoreDataMember]
        public int ItemCount => this.items.Count;

        [IgnoreDataMember]
        public bool IsFixed => this.SelectedItemCount == 1;

        [IgnoreDataMember]
        public bool IsVariable => this.SelectedItemCount > 1;

        protected List<T1> IntItems => this.items;

        public T1 this[int index] => this.items[index];

        public bool Contains(T2 item)
        {
            // ReSharper disable once StyleCop.SA1126
            return this.SelectedItemsTyped.Any(e => Equals(e.Item, item));
        }

        public string GetAsString()
        {
            return string.Join(",", this.items.Where(e => e.IsSelected).Select(e => e.Key));
        }

        public void SetFromKeys(IList<string> keys)
        {
            var selectionStrings = new HashSet<string>(keys);

            foreach (var item in this.items)
            {
                item.IsSelected = selectionStrings.Contains(item.Key);
            }
        }

        public void SetAll()
        {
            this.IntItems.ForEach(e => e.IsSelected = true);
        }

        public string CreateSummaryString()
        {
            if (this.SelectedItemCount == 0)
            {
                return string.Empty;
            }

            return this.CreateItemsString();
        }

        public string CreateItemsString()
        {
            return string.Join(", ", this.SelectedItemsTyped.Select(e => e.Description ?? e.DisplayName));
        }
    }
}
