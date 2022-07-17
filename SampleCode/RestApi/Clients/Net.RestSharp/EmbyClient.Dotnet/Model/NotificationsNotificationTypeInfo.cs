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
    /// NotificationsNotificationTypeInfo
    /// </summary>
    [DataContract]
        public partial class NotificationsNotificationTypeInfo :  IEquatable<NotificationsNotificationTypeInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NotificationsNotificationTypeInfo" /> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="name">name.</param>
        /// <param name="enabled">enabled.</param>
        /// <param name="category">category.</param>
        /// <param name="isBasedOnUserEvent">isBasedOnUserEvent.</param>
        public NotificationsNotificationTypeInfo(string type = default(string), string name = default(string), bool? enabled = default(bool?), string category = default(string), bool? isBasedOnUserEvent = default(bool?))
        {
            this.Type = type;
            this.Name = name;
            this.Enabled = enabled;
            this.Category = category;
            this.IsBasedOnUserEvent = isBasedOnUserEvent;
        }
        
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Enabled
        /// </summary>
        [DataMember(Name="Enabled", EmitDefaultValue=false)]
        public bool? Enabled { get; set; }

        /// <summary>
        /// Gets or Sets Category
        /// </summary>
        [DataMember(Name="Category", EmitDefaultValue=false)]
        public string Category { get; set; }

        /// <summary>
        /// Gets or Sets IsBasedOnUserEvent
        /// </summary>
        [DataMember(Name="IsBasedOnUserEvent", EmitDefaultValue=false)]
        public bool? IsBasedOnUserEvent { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NotificationsNotificationTypeInfo {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Enabled: ").Append(Enabled).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  IsBasedOnUserEvent: ").Append(IsBasedOnUserEvent).Append("\n");
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
            return this.Equals(input as NotificationsNotificationTypeInfo);
        }

        /// <summary>
        /// Returns true if NotificationsNotificationTypeInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of NotificationsNotificationTypeInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NotificationsNotificationTypeInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Enabled == input.Enabled ||
                    (this.Enabled != null &&
                    this.Enabled.Equals(input.Enabled))
                ) && 
                (
                    this.Category == input.Category ||
                    (this.Category != null &&
                    this.Category.Equals(input.Category))
                ) && 
                (
                    this.IsBasedOnUserEvent == input.IsBasedOnUserEvent ||
                    (this.IsBasedOnUserEvent != null &&
                    this.IsBasedOnUserEvent.Equals(input.IsBasedOnUserEvent))
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
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Enabled != null)
                    hashCode = hashCode * 59 + this.Enabled.GetHashCode();
                if (this.Category != null)
                    hashCode = hashCode * 59 + this.Category.GetHashCode();
                if (this.IsBasedOnUserEvent != null)
                    hashCode = hashCode * 59 + this.IsBasedOnUserEvent.GetHashCode();
                return hashCode;
            }
        }

    }
}
