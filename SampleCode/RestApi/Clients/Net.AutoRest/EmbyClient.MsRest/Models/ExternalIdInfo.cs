// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace EmbyClient.MsRest.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class ExternalIdInfo
    {
        /// <summary>
        /// Initializes a new instance of the ExternalIdInfo class.
        /// </summary>
        public ExternalIdInfo()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the ExternalIdInfo class.
        /// </summary>
        public ExternalIdInfo(string name = default(string), string key = default(string), string urlFormatString = default(string), bool? isSupportedAsIdentifier = default(bool?))
        {
            Name = name;
            Key = key;
            UrlFormatString = urlFormatString;
            IsSupportedAsIdentifier = isSupportedAsIdentifier;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Name")]
        public string Name { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Key")]
        public string Key { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "UrlFormatString")]
        public string UrlFormatString { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "IsSupportedAsIdentifier")]
        public bool? IsSupportedAsIdentifier { get; set; }

    }
}