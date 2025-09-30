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
    /// SyncedItem
    /// </summary>
    [DataContract]
        public partial class SyncedItem :  IEquatable<SyncedItem>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SyncedItem" /> class.
        /// </summary>
        /// <param name="serverId">serverId.</param>
        /// <param name="syncJobId">syncJobId.</param>
        /// <param name="syncJobName">syncJobName.</param>
        /// <param name="syncJobDateCreated">syncJobDateCreated.</param>
        /// <param name="syncJobItemId">syncJobItemId.</param>
        /// <param name="originalFileName">originalFileName.</param>
        /// <param name="item">item.</param>
        /// <param name="userId">userId.</param>
        /// <param name="additionalFiles">additionalFiles.</param>
        public SyncedItem(string serverId = default(string), long? syncJobId = default(long?), string syncJobName = default(string), DateTimeOffset? syncJobDateCreated = default(DateTimeOffset?), long? syncJobItemId = default(long?), string originalFileName = default(string), BaseItemDto item = default(BaseItemDto), string userId = default(string), List<ItemFileInfo> additionalFiles = default(List<ItemFileInfo>))
        {
            this.ServerId = serverId;
            this.SyncJobId = syncJobId;
            this.SyncJobName = syncJobName;
            this.SyncJobDateCreated = syncJobDateCreated;
            this.SyncJobItemId = syncJobItemId;
            this.OriginalFileName = originalFileName;
            this.Item = item;
            this.UserId = userId;
            this.AdditionalFiles = additionalFiles;
        }
        
        /// <summary>
        /// Gets or Sets ServerId
        /// </summary>
        [DataMember(Name="ServerId", EmitDefaultValue=false)]
        public string ServerId { get; set; }

        /// <summary>
        /// Gets or Sets SyncJobId
        /// </summary>
        [DataMember(Name="SyncJobId", EmitDefaultValue=false)]
        public long? SyncJobId { get; set; }

        /// <summary>
        /// Gets or Sets SyncJobName
        /// </summary>
        [DataMember(Name="SyncJobName", EmitDefaultValue=false)]
        public string SyncJobName { get; set; }

        /// <summary>
        /// Gets or Sets SyncJobDateCreated
        /// </summary>
        [DataMember(Name="SyncJobDateCreated", EmitDefaultValue=false)]
        public DateTimeOffset? SyncJobDateCreated { get; set; }

        /// <summary>
        /// Gets or Sets SyncJobItemId
        /// </summary>
        [DataMember(Name="SyncJobItemId", EmitDefaultValue=false)]
        public long? SyncJobItemId { get; set; }

        /// <summary>
        /// Gets or Sets OriginalFileName
        /// </summary>
        [DataMember(Name="OriginalFileName", EmitDefaultValue=false)]
        public string OriginalFileName { get; set; }

        /// <summary>
        /// Gets or Sets Item
        /// </summary>
        [DataMember(Name="Item", EmitDefaultValue=false)]
        public BaseItemDto Item { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public string UserId { get; set; }

        /// <summary>
        /// Gets or Sets AdditionalFiles
        /// </summary>
        [DataMember(Name="AdditionalFiles", EmitDefaultValue=false)]
        public List<ItemFileInfo> AdditionalFiles { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SyncedItem {\n");
            sb.Append("  ServerId: ").Append(ServerId).Append("\n");
            sb.Append("  SyncJobId: ").Append(SyncJobId).Append("\n");
            sb.Append("  SyncJobName: ").Append(SyncJobName).Append("\n");
            sb.Append("  SyncJobDateCreated: ").Append(SyncJobDateCreated).Append("\n");
            sb.Append("  SyncJobItemId: ").Append(SyncJobItemId).Append("\n");
            sb.Append("  OriginalFileName: ").Append(OriginalFileName).Append("\n");
            sb.Append("  Item: ").Append(Item).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  AdditionalFiles: ").Append(AdditionalFiles).Append("\n");
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
            return this.Equals(input as SyncedItem);
        }

        /// <summary>
        /// Returns true if SyncedItem instances are equal
        /// </summary>
        /// <param name="input">Instance of SyncedItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SyncedItem input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ServerId == input.ServerId ||
                    (this.ServerId != null &&
                    this.ServerId.Equals(input.ServerId))
                ) && 
                (
                    this.SyncJobId == input.SyncJobId ||
                    (this.SyncJobId != null &&
                    this.SyncJobId.Equals(input.SyncJobId))
                ) && 
                (
                    this.SyncJobName == input.SyncJobName ||
                    (this.SyncJobName != null &&
                    this.SyncJobName.Equals(input.SyncJobName))
                ) && 
                (
                    this.SyncJobDateCreated == input.SyncJobDateCreated ||
                    (this.SyncJobDateCreated != null &&
                    this.SyncJobDateCreated.Equals(input.SyncJobDateCreated))
                ) && 
                (
                    this.SyncJobItemId == input.SyncJobItemId ||
                    (this.SyncJobItemId != null &&
                    this.SyncJobItemId.Equals(input.SyncJobItemId))
                ) && 
                (
                    this.OriginalFileName == input.OriginalFileName ||
                    (this.OriginalFileName != null &&
                    this.OriginalFileName.Equals(input.OriginalFileName))
                ) && 
                (
                    this.Item == input.Item ||
                    (this.Item != null &&
                    this.Item.Equals(input.Item))
                ) && 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.AdditionalFiles == input.AdditionalFiles ||
                    this.AdditionalFiles != null &&
                    input.AdditionalFiles != null &&
                    this.AdditionalFiles.SequenceEqual(input.AdditionalFiles)
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
                if (this.ServerId != null)
                    hashCode = hashCode * 59 + this.ServerId.GetHashCode();
                if (this.SyncJobId != null)
                    hashCode = hashCode * 59 + this.SyncJobId.GetHashCode();
                if (this.SyncJobName != null)
                    hashCode = hashCode * 59 + this.SyncJobName.GetHashCode();
                if (this.SyncJobDateCreated != null)
                    hashCode = hashCode * 59 + this.SyncJobDateCreated.GetHashCode();
                if (this.SyncJobItemId != null)
                    hashCode = hashCode * 59 + this.SyncJobItemId.GetHashCode();
                if (this.OriginalFileName != null)
                    hashCode = hashCode * 59 + this.OriginalFileName.GetHashCode();
                if (this.Item != null)
                    hashCode = hashCode * 59 + this.Item.GetHashCode();
                if (this.UserId != null)
                    hashCode = hashCode * 59 + this.UserId.GetHashCode();
                if (this.AdditionalFiles != null)
                    hashCode = hashCode * 59 + this.AdditionalFiles.GetHashCode();
                return hashCode;
            }
        }

    }
}
