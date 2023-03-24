/*
 * EmbyClient.Dotnet.Beta
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
using SwaggerDateConverter = EmbyClient.Dotnet.Beta.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Beta.Model
{
    /// <summary>
    /// EmbyNotificationsUserNotificationInfo
    /// </summary>
    [DataContract]
        public partial class EmbyNotificationsUserNotificationInfo :  IEquatable<EmbyNotificationsUserNotificationInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EmbyNotificationsUserNotificationInfo" /> class.
        /// </summary>
        /// <param name="notifierKey">notifierKey.</param>
        /// <param name="setupModuleUrl">setupModuleUrl.</param>
        /// <param name="serviceName">serviceName.</param>
        /// <param name="friendlyName">friendlyName.</param>
        /// <param name="id">id.</param>
        /// <param name="enabled">enabled.</param>
        /// <param name="userIds">userIds.</param>
        /// <param name="libraryIds">libraryIds.</param>
        /// <param name="eventIds">eventIds.</param>
        /// <param name="userId">userId.</param>
        /// <param name="isSelfNotification">isSelfNotification.</param>
        /// <param name="options">options.</param>
        public EmbyNotificationsUserNotificationInfo(string notifierKey = default(string), string setupModuleUrl = default(string), string serviceName = default(string), string friendlyName = default(string), string id = default(string), bool? enabled = default(bool?), List<string> userIds = default(List<string>), List<string> libraryIds = default(List<string>), List<string> eventIds = default(List<string>), string userId = default(string), bool? isSelfNotification = default(bool?), Dictionary<string, string> options = default(Dictionary<string, string>))
        {
            this.NotifierKey = notifierKey;
            this.SetupModuleUrl = setupModuleUrl;
            this.ServiceName = serviceName;
            this.FriendlyName = friendlyName;
            this.Id = id;
            this.Enabled = enabled;
            this.UserIds = userIds;
            this.LibraryIds = libraryIds;
            this.EventIds = eventIds;
            this.UserId = userId;
            this.IsSelfNotification = isSelfNotification;
            this.Options = options;
        }
        
        /// <summary>
        /// Gets or Sets NotifierKey
        /// </summary>
        [DataMember(Name="NotifierKey", EmitDefaultValue=false)]
        public string NotifierKey { get; set; }

        /// <summary>
        /// Gets or Sets SetupModuleUrl
        /// </summary>
        [DataMember(Name="SetupModuleUrl", EmitDefaultValue=false)]
        public string SetupModuleUrl { get; set; }

        /// <summary>
        /// Gets or Sets ServiceName
        /// </summary>
        [DataMember(Name="ServiceName", EmitDefaultValue=false)]
        public string ServiceName { get; set; }

        /// <summary>
        /// Gets or Sets FriendlyName
        /// </summary>
        [DataMember(Name="FriendlyName", EmitDefaultValue=false)]
        public string FriendlyName { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Enabled
        /// </summary>
        [DataMember(Name="Enabled", EmitDefaultValue=false)]
        public bool? Enabled { get; set; }

        /// <summary>
        /// Gets or Sets UserIds
        /// </summary>
        [DataMember(Name="UserIds", EmitDefaultValue=false)]
        public List<string> UserIds { get; set; }

        /// <summary>
        /// Gets or Sets LibraryIds
        /// </summary>
        [DataMember(Name="LibraryIds", EmitDefaultValue=false)]
        public List<string> LibraryIds { get; set; }

        /// <summary>
        /// Gets or Sets EventIds
        /// </summary>
        [DataMember(Name="EventIds", EmitDefaultValue=false)]
        public List<string> EventIds { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public string UserId { get; set; }

        /// <summary>
        /// Gets or Sets IsSelfNotification
        /// </summary>
        [DataMember(Name="IsSelfNotification", EmitDefaultValue=false)]
        public bool? IsSelfNotification { get; set; }

        /// <summary>
        /// Gets or Sets Options
        /// </summary>
        [DataMember(Name="Options", EmitDefaultValue=false)]
        public Dictionary<string, string> Options { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EmbyNotificationsUserNotificationInfo {\n");
            sb.Append("  NotifierKey: ").Append(NotifierKey).Append("\n");
            sb.Append("  SetupModuleUrl: ").Append(SetupModuleUrl).Append("\n");
            sb.Append("  ServiceName: ").Append(ServiceName).Append("\n");
            sb.Append("  FriendlyName: ").Append(FriendlyName).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Enabled: ").Append(Enabled).Append("\n");
            sb.Append("  UserIds: ").Append(UserIds).Append("\n");
            sb.Append("  LibraryIds: ").Append(LibraryIds).Append("\n");
            sb.Append("  EventIds: ").Append(EventIds).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  IsSelfNotification: ").Append(IsSelfNotification).Append("\n");
            sb.Append("  Options: ").Append(Options).Append("\n");
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
            return this.Equals(input as EmbyNotificationsUserNotificationInfo);
        }

        /// <summary>
        /// Returns true if EmbyNotificationsUserNotificationInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of EmbyNotificationsUserNotificationInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EmbyNotificationsUserNotificationInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.NotifierKey == input.NotifierKey ||
                    (this.NotifierKey != null &&
                    this.NotifierKey.Equals(input.NotifierKey))
                ) && 
                (
                    this.SetupModuleUrl == input.SetupModuleUrl ||
                    (this.SetupModuleUrl != null &&
                    this.SetupModuleUrl.Equals(input.SetupModuleUrl))
                ) && 
                (
                    this.ServiceName == input.ServiceName ||
                    (this.ServiceName != null &&
                    this.ServiceName.Equals(input.ServiceName))
                ) && 
                (
                    this.FriendlyName == input.FriendlyName ||
                    (this.FriendlyName != null &&
                    this.FriendlyName.Equals(input.FriendlyName))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Enabled == input.Enabled ||
                    (this.Enabled != null &&
                    this.Enabled.Equals(input.Enabled))
                ) && 
                (
                    this.UserIds == input.UserIds ||
                    this.UserIds != null &&
                    input.UserIds != null &&
                    this.UserIds.SequenceEqual(input.UserIds)
                ) && 
                (
                    this.LibraryIds == input.LibraryIds ||
                    this.LibraryIds != null &&
                    input.LibraryIds != null &&
                    this.LibraryIds.SequenceEqual(input.LibraryIds)
                ) && 
                (
                    this.EventIds == input.EventIds ||
                    this.EventIds != null &&
                    input.EventIds != null &&
                    this.EventIds.SequenceEqual(input.EventIds)
                ) && 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.IsSelfNotification == input.IsSelfNotification ||
                    (this.IsSelfNotification != null &&
                    this.IsSelfNotification.Equals(input.IsSelfNotification))
                ) && 
                (
                    this.Options == input.Options ||
                    this.Options != null &&
                    input.Options != null &&
                    this.Options.SequenceEqual(input.Options)
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
                if (this.NotifierKey != null)
                    hashCode = hashCode * 59 + this.NotifierKey.GetHashCode();
                if (this.SetupModuleUrl != null)
                    hashCode = hashCode * 59 + this.SetupModuleUrl.GetHashCode();
                if (this.ServiceName != null)
                    hashCode = hashCode * 59 + this.ServiceName.GetHashCode();
                if (this.FriendlyName != null)
                    hashCode = hashCode * 59 + this.FriendlyName.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Enabled != null)
                    hashCode = hashCode * 59 + this.Enabled.GetHashCode();
                if (this.UserIds != null)
                    hashCode = hashCode * 59 + this.UserIds.GetHashCode();
                if (this.LibraryIds != null)
                    hashCode = hashCode * 59 + this.LibraryIds.GetHashCode();
                if (this.EventIds != null)
                    hashCode = hashCode * 59 + this.EventIds.GetHashCode();
                if (this.UserId != null)
                    hashCode = hashCode * 59 + this.UserId.GetHashCode();
                if (this.IsSelfNotification != null)
                    hashCode = hashCode * 59 + this.IsSelfNotification.GetHashCode();
                if (this.Options != null)
                    hashCode = hashCode * 59 + this.Options.GetHashCode();
                return hashCode;
            }
        }

    }
}
