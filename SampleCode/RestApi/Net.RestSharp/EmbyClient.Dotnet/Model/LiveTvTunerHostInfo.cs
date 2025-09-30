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
    /// LiveTvTunerHostInfo
    /// </summary>
    [DataContract]
        public partial class LiveTvTunerHostInfo :  IEquatable<LiveTvTunerHostInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LiveTvTunerHostInfo" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="url">url.</param>
        /// <param name="type">type.</param>
        /// <param name="deviceId">deviceId.</param>
        /// <param name="friendlyName">friendlyName.</param>
        /// <param name="setupUrl">setupUrl.</param>
        /// <param name="importFavoritesOnly">importFavoritesOnly.</param>
        /// <param name="preferEpgChannelImages">preferEpgChannelImages.</param>
        /// <param name="preferEpgChannelNumbers">preferEpgChannelNumbers.</param>
        /// <param name="allowHWTranscoding">allowHWTranscoding.</param>
        /// <param name="allowMappingByNumber">allowMappingByNumber.</param>
        /// <param name="importGuideData">importGuideData.</param>
        /// <param name="source">source.</param>
        /// <param name="tunerCount">tunerCount.</param>
        /// <param name="userAgent">userAgent.</param>
        /// <param name="referrer">referrer.</param>
        /// <param name="providerOptions">providerOptions.</param>
        /// <param name="dataVersion">dataVersion.</param>
        public LiveTvTunerHostInfo(string id = default(string), string url = default(string), string type = default(string), string deviceId = default(string), string friendlyName = default(string), string setupUrl = default(string), bool? importFavoritesOnly = default(bool?), bool? preferEpgChannelImages = default(bool?), bool? preferEpgChannelNumbers = default(bool?), bool? allowHWTranscoding = default(bool?), bool? allowMappingByNumber = default(bool?), bool? importGuideData = default(bool?), string source = default(string), int? tunerCount = default(int?), string userAgent = default(string), string referrer = default(string), string providerOptions = default(string), int? dataVersion = default(int?))
        {
            this.Id = id;
            this.Url = url;
            this.Type = type;
            this.DeviceId = deviceId;
            this.FriendlyName = friendlyName;
            this.SetupUrl = setupUrl;
            this.ImportFavoritesOnly = importFavoritesOnly;
            this.PreferEpgChannelImages = preferEpgChannelImages;
            this.PreferEpgChannelNumbers = preferEpgChannelNumbers;
            this.AllowHWTranscoding = allowHWTranscoding;
            this.AllowMappingByNumber = allowMappingByNumber;
            this.ImportGuideData = importGuideData;
            this.Source = source;
            this.TunerCount = tunerCount;
            this.UserAgent = userAgent;
            this.Referrer = referrer;
            this.ProviderOptions = providerOptions;
            this.DataVersion = dataVersion;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Url
        /// </summary>
        [DataMember(Name="Url", EmitDefaultValue=false)]
        public string Url { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets DeviceId
        /// </summary>
        [DataMember(Name="DeviceId", EmitDefaultValue=false)]
        public string DeviceId { get; set; }

        /// <summary>
        /// Gets or Sets FriendlyName
        /// </summary>
        [DataMember(Name="FriendlyName", EmitDefaultValue=false)]
        public string FriendlyName { get; set; }

        /// <summary>
        /// Gets or Sets SetupUrl
        /// </summary>
        [DataMember(Name="SetupUrl", EmitDefaultValue=false)]
        public string SetupUrl { get; set; }

        /// <summary>
        /// Gets or Sets ImportFavoritesOnly
        /// </summary>
        [DataMember(Name="ImportFavoritesOnly", EmitDefaultValue=false)]
        public bool? ImportFavoritesOnly { get; set; }

        /// <summary>
        /// Gets or Sets PreferEpgChannelImages
        /// </summary>
        [DataMember(Name="PreferEpgChannelImages", EmitDefaultValue=false)]
        public bool? PreferEpgChannelImages { get; set; }

        /// <summary>
        /// Gets or Sets PreferEpgChannelNumbers
        /// </summary>
        [DataMember(Name="PreferEpgChannelNumbers", EmitDefaultValue=false)]
        public bool? PreferEpgChannelNumbers { get; set; }

        /// <summary>
        /// Gets or Sets AllowHWTranscoding
        /// </summary>
        [DataMember(Name="AllowHWTranscoding", EmitDefaultValue=false)]
        public bool? AllowHWTranscoding { get; set; }

        /// <summary>
        /// Gets or Sets AllowMappingByNumber
        /// </summary>
        [DataMember(Name="AllowMappingByNumber", EmitDefaultValue=false)]
        public bool? AllowMappingByNumber { get; set; }

        /// <summary>
        /// Gets or Sets ImportGuideData
        /// </summary>
        [DataMember(Name="ImportGuideData", EmitDefaultValue=false)]
        public bool? ImportGuideData { get; set; }

        /// <summary>
        /// Gets or Sets Source
        /// </summary>
        [DataMember(Name="Source", EmitDefaultValue=false)]
        public string Source { get; set; }

        /// <summary>
        /// Gets or Sets TunerCount
        /// </summary>
        [DataMember(Name="TunerCount", EmitDefaultValue=false)]
        public int? TunerCount { get; set; }

        /// <summary>
        /// Gets or Sets UserAgent
        /// </summary>
        [DataMember(Name="UserAgent", EmitDefaultValue=false)]
        public string UserAgent { get; set; }

        /// <summary>
        /// Gets or Sets Referrer
        /// </summary>
        [DataMember(Name="Referrer", EmitDefaultValue=false)]
        public string Referrer { get; set; }

        /// <summary>
        /// Gets or Sets ProviderOptions
        /// </summary>
        [DataMember(Name="ProviderOptions", EmitDefaultValue=false)]
        public string ProviderOptions { get; set; }

        /// <summary>
        /// Gets or Sets DataVersion
        /// </summary>
        [DataMember(Name="DataVersion", EmitDefaultValue=false)]
        public int? DataVersion { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LiveTvTunerHostInfo {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  DeviceId: ").Append(DeviceId).Append("\n");
            sb.Append("  FriendlyName: ").Append(FriendlyName).Append("\n");
            sb.Append("  SetupUrl: ").Append(SetupUrl).Append("\n");
            sb.Append("  ImportFavoritesOnly: ").Append(ImportFavoritesOnly).Append("\n");
            sb.Append("  PreferEpgChannelImages: ").Append(PreferEpgChannelImages).Append("\n");
            sb.Append("  PreferEpgChannelNumbers: ").Append(PreferEpgChannelNumbers).Append("\n");
            sb.Append("  AllowHWTranscoding: ").Append(AllowHWTranscoding).Append("\n");
            sb.Append("  AllowMappingByNumber: ").Append(AllowMappingByNumber).Append("\n");
            sb.Append("  ImportGuideData: ").Append(ImportGuideData).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
            sb.Append("  TunerCount: ").Append(TunerCount).Append("\n");
            sb.Append("  UserAgent: ").Append(UserAgent).Append("\n");
            sb.Append("  Referrer: ").Append(Referrer).Append("\n");
            sb.Append("  ProviderOptions: ").Append(ProviderOptions).Append("\n");
            sb.Append("  DataVersion: ").Append(DataVersion).Append("\n");
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
            return this.Equals(input as LiveTvTunerHostInfo);
        }

        /// <summary>
        /// Returns true if LiveTvTunerHostInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of LiveTvTunerHostInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LiveTvTunerHostInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.DeviceId == input.DeviceId ||
                    (this.DeviceId != null &&
                    this.DeviceId.Equals(input.DeviceId))
                ) && 
                (
                    this.FriendlyName == input.FriendlyName ||
                    (this.FriendlyName != null &&
                    this.FriendlyName.Equals(input.FriendlyName))
                ) && 
                (
                    this.SetupUrl == input.SetupUrl ||
                    (this.SetupUrl != null &&
                    this.SetupUrl.Equals(input.SetupUrl))
                ) && 
                (
                    this.ImportFavoritesOnly == input.ImportFavoritesOnly ||
                    (this.ImportFavoritesOnly != null &&
                    this.ImportFavoritesOnly.Equals(input.ImportFavoritesOnly))
                ) && 
                (
                    this.PreferEpgChannelImages == input.PreferEpgChannelImages ||
                    (this.PreferEpgChannelImages != null &&
                    this.PreferEpgChannelImages.Equals(input.PreferEpgChannelImages))
                ) && 
                (
                    this.PreferEpgChannelNumbers == input.PreferEpgChannelNumbers ||
                    (this.PreferEpgChannelNumbers != null &&
                    this.PreferEpgChannelNumbers.Equals(input.PreferEpgChannelNumbers))
                ) && 
                (
                    this.AllowHWTranscoding == input.AllowHWTranscoding ||
                    (this.AllowHWTranscoding != null &&
                    this.AllowHWTranscoding.Equals(input.AllowHWTranscoding))
                ) && 
                (
                    this.AllowMappingByNumber == input.AllowMappingByNumber ||
                    (this.AllowMappingByNumber != null &&
                    this.AllowMappingByNumber.Equals(input.AllowMappingByNumber))
                ) && 
                (
                    this.ImportGuideData == input.ImportGuideData ||
                    (this.ImportGuideData != null &&
                    this.ImportGuideData.Equals(input.ImportGuideData))
                ) && 
                (
                    this.Source == input.Source ||
                    (this.Source != null &&
                    this.Source.Equals(input.Source))
                ) && 
                (
                    this.TunerCount == input.TunerCount ||
                    (this.TunerCount != null &&
                    this.TunerCount.Equals(input.TunerCount))
                ) && 
                (
                    this.UserAgent == input.UserAgent ||
                    (this.UserAgent != null &&
                    this.UserAgent.Equals(input.UserAgent))
                ) && 
                (
                    this.Referrer == input.Referrer ||
                    (this.Referrer != null &&
                    this.Referrer.Equals(input.Referrer))
                ) && 
                (
                    this.ProviderOptions == input.ProviderOptions ||
                    (this.ProviderOptions != null &&
                    this.ProviderOptions.Equals(input.ProviderOptions))
                ) && 
                (
                    this.DataVersion == input.DataVersion ||
                    (this.DataVersion != null &&
                    this.DataVersion.Equals(input.DataVersion))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Url != null)
                    hashCode = hashCode * 59 + this.Url.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.DeviceId != null)
                    hashCode = hashCode * 59 + this.DeviceId.GetHashCode();
                if (this.FriendlyName != null)
                    hashCode = hashCode * 59 + this.FriendlyName.GetHashCode();
                if (this.SetupUrl != null)
                    hashCode = hashCode * 59 + this.SetupUrl.GetHashCode();
                if (this.ImportFavoritesOnly != null)
                    hashCode = hashCode * 59 + this.ImportFavoritesOnly.GetHashCode();
                if (this.PreferEpgChannelImages != null)
                    hashCode = hashCode * 59 + this.PreferEpgChannelImages.GetHashCode();
                if (this.PreferEpgChannelNumbers != null)
                    hashCode = hashCode * 59 + this.PreferEpgChannelNumbers.GetHashCode();
                if (this.AllowHWTranscoding != null)
                    hashCode = hashCode * 59 + this.AllowHWTranscoding.GetHashCode();
                if (this.AllowMappingByNumber != null)
                    hashCode = hashCode * 59 + this.AllowMappingByNumber.GetHashCode();
                if (this.ImportGuideData != null)
                    hashCode = hashCode * 59 + this.ImportGuideData.GetHashCode();
                if (this.Source != null)
                    hashCode = hashCode * 59 + this.Source.GetHashCode();
                if (this.TunerCount != null)
                    hashCode = hashCode * 59 + this.TunerCount.GetHashCode();
                if (this.UserAgent != null)
                    hashCode = hashCode * 59 + this.UserAgent.GetHashCode();
                if (this.Referrer != null)
                    hashCode = hashCode * 59 + this.Referrer.GetHashCode();
                if (this.ProviderOptions != null)
                    hashCode = hashCode * 59 + this.ProviderOptions.GetHashCode();
                if (this.DataVersion != null)
                    hashCode = hashCode * 59 + this.DataVersion.GetHashCode();
                return hashCode;
            }
        }

    }
}
