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
    /// DevicesDeviceInfo
    /// </summary>
    [DataContract]
        public partial class DevicesDeviceInfo :  IEquatable<DevicesDeviceInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DevicesDeviceInfo" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="id">id.</param>
        /// <param name="lastUserName">lastUserName.</param>
        /// <param name="appName">appName.</param>
        /// <param name="appVersion">appVersion.</param>
        /// <param name="lastUserId">lastUserId.</param>
        /// <param name="dateLastActivity">dateLastActivity.</param>
        /// <param name="iconUrl">iconUrl.</param>
        public DevicesDeviceInfo(string name = default(string), string id = default(string), string lastUserName = default(string), string appName = default(string), string appVersion = default(string), string lastUserId = default(string), DateTimeOffset? dateLastActivity = default(DateTimeOffset?), string iconUrl = default(string))
        {
            this.Name = name;
            this.Id = id;
            this.LastUserName = lastUserName;
            this.AppName = appName;
            this.AppVersion = appVersion;
            this.LastUserId = lastUserId;
            this.DateLastActivity = dateLastActivity;
            this.IconUrl = iconUrl;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets LastUserName
        /// </summary>
        [DataMember(Name="LastUserName", EmitDefaultValue=false)]
        public string LastUserName { get; set; }

        /// <summary>
        /// Gets or Sets AppName
        /// </summary>
        [DataMember(Name="AppName", EmitDefaultValue=false)]
        public string AppName { get; set; }

        /// <summary>
        /// Gets or Sets AppVersion
        /// </summary>
        [DataMember(Name="AppVersion", EmitDefaultValue=false)]
        public string AppVersion { get; set; }

        /// <summary>
        /// Gets or Sets LastUserId
        /// </summary>
        [DataMember(Name="LastUserId", EmitDefaultValue=false)]
        public string LastUserId { get; set; }

        /// <summary>
        /// Gets or Sets DateLastActivity
        /// </summary>
        [DataMember(Name="DateLastActivity", EmitDefaultValue=false)]
        public DateTimeOffset? DateLastActivity { get; set; }

        /// <summary>
        /// Gets or Sets IconUrl
        /// </summary>
        [DataMember(Name="IconUrl", EmitDefaultValue=false)]
        public string IconUrl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DevicesDeviceInfo {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  LastUserName: ").Append(LastUserName).Append("\n");
            sb.Append("  AppName: ").Append(AppName).Append("\n");
            sb.Append("  AppVersion: ").Append(AppVersion).Append("\n");
            sb.Append("  LastUserId: ").Append(LastUserId).Append("\n");
            sb.Append("  DateLastActivity: ").Append(DateLastActivity).Append("\n");
            sb.Append("  IconUrl: ").Append(IconUrl).Append("\n");
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
            return this.Equals(input as DevicesDeviceInfo);
        }

        /// <summary>
        /// Returns true if DevicesDeviceInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of DevicesDeviceInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DevicesDeviceInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.LastUserName == input.LastUserName ||
                    (this.LastUserName != null &&
                    this.LastUserName.Equals(input.LastUserName))
                ) && 
                (
                    this.AppName == input.AppName ||
                    (this.AppName != null &&
                    this.AppName.Equals(input.AppName))
                ) && 
                (
                    this.AppVersion == input.AppVersion ||
                    (this.AppVersion != null &&
                    this.AppVersion.Equals(input.AppVersion))
                ) && 
                (
                    this.LastUserId == input.LastUserId ||
                    (this.LastUserId != null &&
                    this.LastUserId.Equals(input.LastUserId))
                ) && 
                (
                    this.DateLastActivity == input.DateLastActivity ||
                    (this.DateLastActivity != null &&
                    this.DateLastActivity.Equals(input.DateLastActivity))
                ) && 
                (
                    this.IconUrl == input.IconUrl ||
                    (this.IconUrl != null &&
                    this.IconUrl.Equals(input.IconUrl))
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.LastUserName != null)
                    hashCode = hashCode * 59 + this.LastUserName.GetHashCode();
                if (this.AppName != null)
                    hashCode = hashCode * 59 + this.AppName.GetHashCode();
                if (this.AppVersion != null)
                    hashCode = hashCode * 59 + this.AppVersion.GetHashCode();
                if (this.LastUserId != null)
                    hashCode = hashCode * 59 + this.LastUserId.GetHashCode();
                if (this.DateLastActivity != null)
                    hashCode = hashCode * 59 + this.DateLastActivity.GetHashCode();
                if (this.IconUrl != null)
                    hashCode = hashCode * 59 + this.IconUrl.GetHashCode();
                return hashCode;
            }
        }

    }
}
