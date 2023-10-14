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
    /// RunUICommand
    /// </summary>
    [DataContract]
        public partial class RunUICommand :  IEquatable<RunUICommand>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RunUICommand" /> class.
        /// </summary>
        /// <param name="pageId">pageId.</param>
        /// <param name="commandId">commandId.</param>
        /// <param name="data">data.</param>
        /// <param name="itemId">itemId.</param>
        /// <param name="clientLocale">clientLocale.</param>
        public RunUICommand(string pageId = default(string), string commandId = default(string), string data = default(string), string itemId = default(string), string clientLocale = default(string))
        {
            this.PageId = pageId;
            this.CommandId = commandId;
            this.Data = data;
            this.ItemId = itemId;
            this.ClientLocale = clientLocale;
        }
        
        /// <summary>
        /// Gets or Sets PageId
        /// </summary>
        [DataMember(Name="PageId", EmitDefaultValue=false)]
        public string PageId { get; set; }

        /// <summary>
        /// Gets or Sets CommandId
        /// </summary>
        [DataMember(Name="CommandId", EmitDefaultValue=false)]
        public string CommandId { get; set; }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name="Data", EmitDefaultValue=false)]
        public string Data { get; set; }

        /// <summary>
        /// Gets or Sets ItemId
        /// </summary>
        [DataMember(Name="ItemId", EmitDefaultValue=false)]
        public string ItemId { get; set; }

        /// <summary>
        /// Gets or Sets ClientLocale
        /// </summary>
        [DataMember(Name="ClientLocale", EmitDefaultValue=false)]
        public string ClientLocale { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RunUICommand {\n");
            sb.Append("  PageId: ").Append(PageId).Append("\n");
            sb.Append("  CommandId: ").Append(CommandId).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  ClientLocale: ").Append(ClientLocale).Append("\n");
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
            return this.Equals(input as RunUICommand);
        }

        /// <summary>
        /// Returns true if RunUICommand instances are equal
        /// </summary>
        /// <param name="input">Instance of RunUICommand to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RunUICommand input)
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
                    this.CommandId == input.CommandId ||
                    (this.CommandId != null &&
                    this.CommandId.Equals(input.CommandId))
                ) && 
                (
                    this.Data == input.Data ||
                    (this.Data != null &&
                    this.Data.Equals(input.Data))
                ) && 
                (
                    this.ItemId == input.ItemId ||
                    (this.ItemId != null &&
                    this.ItemId.Equals(input.ItemId))
                ) && 
                (
                    this.ClientLocale == input.ClientLocale ||
                    (this.ClientLocale != null &&
                    this.ClientLocale.Equals(input.ClientLocale))
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
                if (this.CommandId != null)
                    hashCode = hashCode * 59 + this.CommandId.GetHashCode();
                if (this.Data != null)
                    hashCode = hashCode * 59 + this.Data.GetHashCode();
                if (this.ItemId != null)
                    hashCode = hashCode * 59 + this.ItemId.GetHashCode();
                if (this.ClientLocale != null)
                    hashCode = hashCode * 59 + this.ClientLocale.GetHashCode();
                return hashCode;
            }
        }

    }
}
