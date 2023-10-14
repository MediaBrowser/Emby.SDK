/*
 * EmbyClient.Dotnet
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = EmbyClient.Dotnet.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Model
{
    /// <summary>
    /// UITabPageInfo
    /// </summary>
    [DataContract]
        public partial class UITabPageInfo :  IEquatable<UITabPageInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UITabPageInfo" /> class.
        /// </summary>
        /// <param name="pageId">pageId.</param>
        /// <param name="displayName">displayName.</param>
        /// <param name="pluginId">pluginId.</param>
        /// <param name="href">href.</param>
        /// <param name="navKey">navKey.</param>
        /// <param name="index">index.</param>
        public UITabPageInfo(string pageId = default(string), string displayName = default(string), string pluginId = default(string), string href = default(string), string navKey = default(string), int? index = default(int?))
        {
            this.PageId = pageId;
            this.DisplayName = displayName;
            this.PluginId = pluginId;
            this.Href = href;
            this.NavKey = navKey;
            this.Index = index;
        }
        
        /// <summary>
        /// Gets or Sets PageId
        /// </summary>
        [DataMember(Name="PageId", EmitDefaultValue=false)]
        public string PageId { get; set; }

        /// <summary>
        /// Gets or Sets DisplayName
        /// </summary>
        [DataMember(Name="DisplayName", EmitDefaultValue=false)]
        public string DisplayName { get; set; }

        /// <summary>
        /// Gets or Sets PluginId
        /// </summary>
        [DataMember(Name="PluginId", EmitDefaultValue=false)]
        public string PluginId { get; set; }

        /// <summary>
        /// Gets or Sets Href
        /// </summary>
        [DataMember(Name="Href", EmitDefaultValue=false)]
        public string Href { get; set; }

        /// <summary>
        /// Gets or Sets NavKey
        /// </summary>
        [DataMember(Name="NavKey", EmitDefaultValue=false)]
        public string NavKey { get; set; }

        /// <summary>
        /// Gets or Sets Index
        /// </summary>
        [DataMember(Name="Index", EmitDefaultValue=false)]
        public int? Index { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UITabPageInfo {\n");
            sb.Append("  PageId: ").Append(PageId).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  PluginId: ").Append(PluginId).Append("\n");
            sb.Append("  Href: ").Append(Href).Append("\n");
            sb.Append("  NavKey: ").Append(NavKey).Append("\n");
            sb.Append("  Index: ").Append(Index).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as UITabPageInfo);
        }

        /// <summary>
        /// Returns true if UITabPageInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of UITabPageInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UITabPageInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.PageId == input.PageId ||
                    (this.PageId != null &&
                    this.PageId.Equals(input.PageId))
                ) && 
                (
                    this.DisplayName == input.DisplayName ||
                    (this.DisplayName != null &&
                    this.DisplayName.Equals(input.DisplayName))
                ) && 
                (
                    this.PluginId == input.PluginId ||
                    (this.PluginId != null &&
                    this.PluginId.Equals(input.PluginId))
                ) && 
                (
                    this.Href == input.Href ||
                    (this.Href != null &&
                    this.Href.Equals(input.Href))
                ) && 
                (
                    this.NavKey == input.NavKey ||
                    (this.NavKey != null &&
                    this.NavKey.Equals(input.NavKey))
                ) && 
                (
                    this.Index == input.Index ||
                    (this.Index != null &&
                    this.Index.Equals(input.Index))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.PageId != null)
                    hashCode = hashCode * 59 + this.PageId.GetHashCode();
                if (this.DisplayName != null)
                    hashCode = hashCode * 59 + this.DisplayName.GetHashCode();
                if (this.PluginId != null)
                    hashCode = hashCode * 59 + this.PluginId.GetHashCode();
                if (this.Href != null)
                    hashCode = hashCode * 59 + this.Href.GetHashCode();
                if (this.NavKey != null)
                    hashCode = hashCode * 59 + this.NavKey.GetHashCode();
                if (this.Index != null)
                    hashCode = hashCode * 59 + this.Index.GetHashCode();
                return hashCode;
            }
        }

    }
}
