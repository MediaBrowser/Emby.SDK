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
        /// <param name="id">The identifier..</param>
        /// <param name="internalId">internalId.</param>
        /// <param name="reportedDeviceId">reportedDeviceId.</param>
        /// <param name="lastUserName">The last name of the user..</param>
        /// <param name="appName">The name of the application..</param>
        /// <param name="appVersion">The application version..</param>
        /// <param name="lastUserId">The last user identifier..</param>
        /// <param name="dateLastActivity">dateLastActivity.</param>
        /// <param name="iconUrl">iconUrl.</param>
        /// <param name="ipAddress">ipAddress.</param>
        public DevicesDeviceInfo(string name = default(string), string id = default(string), long? internalId = default(long?), string reportedDeviceId = default(string), string lastUserName = default(string), string appName = default(string), string appVersion = default(string), string lastUserId = default(string), DateTimeOffset? dateLastActivity = default(DateTimeOffset?), string iconUrl = default(string), string ipAddress = default(string))
        {
            this.Name = name;
            this.Id = id;
            this.InternalId = internalId;
            this.ReportedDeviceId = reportedDeviceId;
            this.LastUserName = lastUserName;
            this.AppName = appName;
            this.AppVersion = appVersion;
            this.LastUserId = lastUserId;
            this.DateLastActivity = dateLastActivity;
            this.IconUrl = iconUrl;
            this.IpAddress = ipAddress;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The identifier.
        /// </summary>
        /// <value>The identifier.</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets InternalId
        /// </summary>
        [DataMember(Name="InternalId", EmitDefaultValue=false)]
        public long? InternalId { get; set; }

        /// <summary>
        /// Gets or Sets ReportedDeviceId
        /// </summary>
        [DataMember(Name="ReportedDeviceId", EmitDefaultValue=false)]
        public string ReportedDeviceId { get; set; }

        /// <summary>
        /// The last name of the user.
        /// </summary>
        /// <value>The last name of the user.</value>
        [DataMember(Name="LastUserName", EmitDefaultValue=false)]
        public string LastUserName { get; set; }

        /// <summary>
        /// The name of the application.
        /// </summary>
        /// <value>The name of the application.</value>
        [DataMember(Name="AppName", EmitDefaultValue=false)]
        public string AppName { get; set; }

        /// <summary>
        /// The application version.
        /// </summary>
        /// <value>The application version.</value>
        [DataMember(Name="AppVersion", EmitDefaultValue=false)]
        public string AppVersion { get; set; }

        /// <summary>
        /// The last user identifier.
        /// </summary>
        /// <value>The last user identifier.</value>
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
        /// Gets or Sets IpAddress
        /// </summary>
        [DataMember(Name="IpAddress", EmitDefaultValue=false)]
        public string IpAddress { get; set; }

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
            sb.Append("  InternalId: ").Append(InternalId).Append("\n");
            sb.Append("  ReportedDeviceId: ").Append(ReportedDeviceId).Append("\n");
            sb.Append("  LastUserName: ").Append(LastUserName).Append("\n");
            sb.Append("  AppName: ").Append(AppName).Append("\n");
            sb.Append("  AppVersion: ").Append(AppVersion).Append("\n");
            sb.Append("  LastUserId: ").Append(LastUserId).Append("\n");
            sb.Append("  DateLastActivity: ").Append(DateLastActivity).Append("\n");
            sb.Append("  IconUrl: ").Append(IconUrl).Append("\n");
            sb.Append("  IpAddress: ").Append(IpAddress).Append("\n");
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
                    this.InternalId == input.InternalId ||
                    (this.InternalId != null &&
                    this.InternalId.Equals(input.InternalId))
                ) && 
                (
                    this.ReportedDeviceId == input.ReportedDeviceId ||
                    (this.ReportedDeviceId != null &&
                    this.ReportedDeviceId.Equals(input.ReportedDeviceId))
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
                ) && 
                (
                    this.IpAddress == input.IpAddress ||
                    (this.IpAddress != null &&
                    this.IpAddress.Equals(input.IpAddress))
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
                if (this.InternalId != null)
                    hashCode = hashCode * 59 + this.InternalId.GetHashCode();
                if (this.ReportedDeviceId != null)
                    hashCode = hashCode * 59 + this.ReportedDeviceId.GetHashCode();
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
                if (this.IpAddress != null)
                    hashCode = hashCode * 59 + this.IpAddress.GetHashCode();
                return hashCode;
            }
        }

    }
}
