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
    /// RemoteSearchQueryGameInfo
    /// </summary>
    [DataContract]
        public partial class RemoteSearchQueryGameInfo :  IEquatable<RemoteSearchQueryGameInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RemoteSearchQueryGameInfo" /> class.
        /// </summary>
        /// <param name="searchInfo">searchInfo.</param>
        /// <param name="itemId">itemId.</param>
        /// <param name="searchProviderName">searchProviderName.</param>
        /// <param name="providers">providers.</param>
        /// <param name="includeDisabledProviders">includeDisabledProviders.</param>
        public RemoteSearchQueryGameInfo(GameInfo searchInfo = default(GameInfo), long? itemId = default(long?), string searchProviderName = default(string), List<string> providers = default(List<string>), bool? includeDisabledProviders = default(bool?))
        {
            this.SearchInfo = searchInfo;
            this.ItemId = itemId;
            this.SearchProviderName = searchProviderName;
            this.Providers = providers;
            this.IncludeDisabledProviders = includeDisabledProviders;
        }
        
        /// <summary>
        /// Gets or Sets SearchInfo
        /// </summary>
        [DataMember(Name="SearchInfo", EmitDefaultValue=false)]
        public GameInfo SearchInfo { get; set; }

        /// <summary>
        /// Gets or Sets ItemId
        /// </summary>
        [DataMember(Name="ItemId", EmitDefaultValue=false)]
        public long? ItemId { get; set; }

        /// <summary>
        /// Gets or Sets SearchProviderName
        /// </summary>
        [DataMember(Name="SearchProviderName", EmitDefaultValue=false)]
        public string SearchProviderName { get; set; }

        /// <summary>
        /// Gets or Sets Providers
        /// </summary>
        [DataMember(Name="Providers", EmitDefaultValue=false)]
        public List<string> Providers { get; set; }

        /// <summary>
        /// Gets or Sets IncludeDisabledProviders
        /// </summary>
        [DataMember(Name="IncludeDisabledProviders", EmitDefaultValue=false)]
        public bool? IncludeDisabledProviders { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RemoteSearchQueryGameInfo {\n");
            sb.Append("  SearchInfo: ").Append(SearchInfo).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  SearchProviderName: ").Append(SearchProviderName).Append("\n");
            sb.Append("  Providers: ").Append(Providers).Append("\n");
            sb.Append("  IncludeDisabledProviders: ").Append(IncludeDisabledProviders).Append("\n");
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
            return this.Equals(input as RemoteSearchQueryGameInfo);
        }

        /// <summary>
        /// Returns true if RemoteSearchQueryGameInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of RemoteSearchQueryGameInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RemoteSearchQueryGameInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.SearchInfo == input.SearchInfo ||
                    (this.SearchInfo != null &&
                    this.SearchInfo.Equals(input.SearchInfo))
                ) && 
                (
                    this.ItemId == input.ItemId ||
                    (this.ItemId != null &&
                    this.ItemId.Equals(input.ItemId))
                ) && 
                (
                    this.SearchProviderName == input.SearchProviderName ||
                    (this.SearchProviderName != null &&
                    this.SearchProviderName.Equals(input.SearchProviderName))
                ) && 
                (
                    this.Providers == input.Providers ||
                    this.Providers != null &&
                    input.Providers != null &&
                    this.Providers.SequenceEqual(input.Providers)
                ) && 
                (
                    this.IncludeDisabledProviders == input.IncludeDisabledProviders ||
                    (this.IncludeDisabledProviders != null &&
                    this.IncludeDisabledProviders.Equals(input.IncludeDisabledProviders))
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
                if (this.SearchInfo != null)
                    hashCode = hashCode * 59 + this.SearchInfo.GetHashCode();
                if (this.ItemId != null)
                    hashCode = hashCode * 59 + this.ItemId.GetHashCode();
                if (this.SearchProviderName != null)
                    hashCode = hashCode * 59 + this.SearchProviderName.GetHashCode();
                if (this.Providers != null)
                    hashCode = hashCode * 59 + this.Providers.GetHashCode();
                if (this.IncludeDisabledProviders != null)
                    hashCode = hashCode * 59 + this.IncludeDisabledProviders.GetHashCode();
                return hashCode;
            }
        }

    }
}
