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
    /// EmbyNotificationsApiNotificationsSummary
    /// </summary>
    [DataContract]
        public partial class EmbyNotificationsApiNotificationsSummary :  IEquatable<EmbyNotificationsApiNotificationsSummary>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EmbyNotificationsApiNotificationsSummary" /> class.
        /// </summary>
        /// <param name="unreadCount">unreadCount.</param>
        /// <param name="maxUnreadNotificationLevel">maxUnreadNotificationLevel.</param>
        public EmbyNotificationsApiNotificationsSummary(int? unreadCount = default(int?), NotificationsNotificationLevel maxUnreadNotificationLevel = default(NotificationsNotificationLevel))
        {
            this.UnreadCount = unreadCount;
            this.MaxUnreadNotificationLevel = maxUnreadNotificationLevel;
        }
        
        /// <summary>
        /// Gets or Sets UnreadCount
        /// </summary>
        [DataMember(Name="UnreadCount", EmitDefaultValue=false)]
        public int? UnreadCount { get; set; }

        /// <summary>
        /// Gets or Sets MaxUnreadNotificationLevel
        /// </summary>
        [DataMember(Name="MaxUnreadNotificationLevel", EmitDefaultValue=false)]
        public NotificationsNotificationLevel MaxUnreadNotificationLevel { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EmbyNotificationsApiNotificationsSummary {\n");
            sb.Append("  UnreadCount: ").Append(UnreadCount).Append("\n");
            sb.Append("  MaxUnreadNotificationLevel: ").Append(MaxUnreadNotificationLevel).Append("\n");
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
            return this.Equals(input as EmbyNotificationsApiNotificationsSummary);
        }

        /// <summary>
        /// Returns true if EmbyNotificationsApiNotificationsSummary instances are equal
        /// </summary>
        /// <param name="input">Instance of EmbyNotificationsApiNotificationsSummary to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EmbyNotificationsApiNotificationsSummary input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.UnreadCount == input.UnreadCount ||
                    (this.UnreadCount != null &&
                    this.UnreadCount.Equals(input.UnreadCount))
                ) && 
                (
                    this.MaxUnreadNotificationLevel == input.MaxUnreadNotificationLevel ||
                    (this.MaxUnreadNotificationLevel != null &&
                    this.MaxUnreadNotificationLevel.Equals(input.MaxUnreadNotificationLevel))
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
                if (this.UnreadCount != null)
                    hashCode = hashCode * 59 + this.UnreadCount.GetHashCode();
                if (this.MaxUnreadNotificationLevel != null)
                    hashCode = hashCode * 59 + this.MaxUnreadNotificationLevel.GetHashCode();
                return hashCode;
            }
        }

    }
}
