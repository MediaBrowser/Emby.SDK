using System;
using Emby.Web.GenericEdit;

namespace EmbyPluginUiTemplate.UIBaseClasses.Store
{
    public class SimpleContentStore<TOptionType>
        where TOptionType : EditableOptionsBase, new()
    {
        private TOptionType options;

        protected readonly object LockObj = new object();

        protected SimpleContentStore()
        {
        }

        public virtual TOptionType GetOptions()
        {
            lock (this.LockObj)
            {
                if (this.options == null)
                {
                    this.options = new TOptionType();
                }

                return this.options;
            }
        }

        public virtual void SetOptions(TOptionType newOptions)
        {
            if (newOptions == null)
            {
                throw new ArgumentNullException(nameof(newOptions));
            }

            lock (this.LockObj)
            {
                this.options = newOptions;
            }
        }
    }
}
