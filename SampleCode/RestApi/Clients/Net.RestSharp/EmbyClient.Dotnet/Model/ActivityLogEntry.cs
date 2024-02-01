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
    /// ActivityLogEntry
    /// </summary>
    [DataContract]
        public partial class ActivityLogEntry :  IEquatable<ActivityLogEntry>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ActivityLogEntry" /> class.
        /// </summary>
        /// <param name="id">The identifier..</param>
        /// <param name="name">The name..</param>
        /// <param name="overview">The overview..</param>
        /// <param name="shortOverview">The short overview..</param>
        /// <param name="type">The type..</param>
        /// <param name="itemId">The item identifier..</param>
        /// <param name="date">The date..</param>
        /// <param name="userId">The user identifier..</param>
        /// <param name="userPrimaryImageTag">The user primary image tag..</param>
        /// <param name="severity">severity.</param>
        public ActivityLogEntry(long? id = default(long?), string name = default(string), string overview = default(string), string shortOverview = default(string), string type = default(string), string itemId = default(string), DateTimeOffset? date = default(DateTimeOffset?), string userId = default(string), string userPrimaryImageTag = default(string), LoggingLogSeverity severity = default(LoggingLogSeverity))
        {
            this.Id = id;
            this.Name = name;
            this.Overview = overview;
            this.ShortOverview = shortOverview;
            this.Type = type;
            this.ItemId = itemId;
            this.Date = date;
            this.UserId = userId;
            this.UserPrimaryImageTag = userPrimaryImageTag;
            this.Severity = severity;
        }
        
        /// <summary>
        /// The identifier.
        /// </summary>
        /// <value>The identifier.</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public long? Id { get; set; }

        /// <summary>
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The overview.
        /// </summary>
        /// <value>The overview.</value>
        [DataMember(Name="Overview", EmitDefaultValue=false)]
        public string Overview { get; set; }

        /// <summary>
        /// The short overview.
        /// </summary>
        /// <value>The short overview.</value>
        [DataMember(Name="ShortOverview", EmitDefaultValue=false)]
        public string ShortOverview { get; set; }

        /// <summary>
        /// The type.
        /// </summary>
        /// <value>The type.</value>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// The item identifier.
        /// </summary>
        /// <value>The item identifier.</value>
        [DataMember(Name="ItemId", EmitDefaultValue=false)]
        public string ItemId { get; set; }

        /// <summary>
        /// The date.
        /// </summary>
        /// <value>The date.</value>
        [DataMember(Name="Date", EmitDefaultValue=false)]
        public DateTimeOffset? Date { get; set; }

        /// <summary>
        /// The user identifier.
        /// </summary>
        /// <value>The user identifier.</value>
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public string UserId { get; set; }

        /// <summary>
        /// The user primary image tag.
        /// </summary>
        /// <value>The user primary image tag.</value>
        [DataMember(Name="UserPrimaryImageTag", EmitDefaultValue=false)]
        public string UserPrimaryImageTag { get; set; }

        /// <summary>
        /// Gets or Sets Severity
        /// </summary>
        [DataMember(Name="Severity", EmitDefaultValue=false)]
        public LoggingLogSeverity Severity { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ActivityLogEntry {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Overview: ").Append(Overview).Append("\n");
            sb.Append("  ShortOverview: ").Append(ShortOverview).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  UserPrimaryImageTag: ").Append(UserPrimaryImageTag).Append("\n");
            sb.Append("  Severity: ").Append(Severity).Append("\n");
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
            return this.Equals(input as ActivityLogEntry);
        }

        /// <summary>
        /// Returns true if ActivityLogEntry instances are equal
        /// </summary>
        /// <param name="input">Instance of ActivityLogEntry to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ActivityLogEntry input)
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
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Overview == input.Overview ||
                    (this.Overview != null &&
                    this.Overview.Equals(input.Overview))
                ) && 
                (
                    this.ShortOverview == input.ShortOverview ||
                    (this.ShortOverview != null &&
                    this.ShortOverview.Equals(input.ShortOverview))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.ItemId == input.ItemId ||
                    (this.ItemId != null &&
                    this.ItemId.Equals(input.ItemId))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.UserPrimaryImageTag == input.UserPrimaryImageTag ||
                    (this.UserPrimaryImageTag != null &&
                    this.UserPrimaryImageTag.Equals(input.UserPrimaryImageTag))
                ) && 
                (
                    this.Severity == input.Severity ||
                    (this.Severity != null &&
                    this.Severity.Equals(input.Severity))
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Overview != null)
                    hashCode = hashCode * 59 + this.Overview.GetHashCode();
                if (this.ShortOverview != null)
                    hashCode = hashCode * 59 + this.ShortOverview.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.ItemId != null)
                    hashCode = hashCode * 59 + this.ItemId.GetHashCode();
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.UserId != null)
                    hashCode = hashCode * 59 + this.UserId.GetHashCode();
                if (this.UserPrimaryImageTag != null)
                    hashCode = hashCode * 59 + this.UserPrimaryImageTag.GetHashCode();
                if (this.Severity != null)
                    hashCode = hashCode * 59 + this.Severity.GetHashCode();
                return hashCode;
            }
        }

    }
}
