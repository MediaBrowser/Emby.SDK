// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace EmbyClient.MsRest.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class EmbyWebGenericUIModelUITabPageInfo
    {
        /// <summary>
        /// Initializes a new instance of the
        /// EmbyWebGenericUIModelUITabPageInfo class.
        /// </summary>
        public EmbyWebGenericUIModelUITabPageInfo()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// EmbyWebGenericUIModelUITabPageInfo class.
        /// </summary>
        public EmbyWebGenericUIModelUITabPageInfo(string pageId = default(string), string displayName = default(string), string pluginId = default(string), string href = default(string), string navKey = default(string), int? index = default(int?))
        {
            PageId = pageId;
            DisplayName = displayName;
            PluginId = pluginId;
            Href = href;
            NavKey = navKey;
            Index = index;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "PageId")]
        public string PageId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "DisplayName")]
        public string DisplayName { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "PluginId")]
        public string PluginId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Href")]
        public string Href { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "NavKey")]
        public string NavKey { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Index")]
        public int? Index { get; set; }

    }
}