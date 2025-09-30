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
    /// SyncJobItem
    /// </summary>
    [DataContract]
        public partial class SyncJobItem :  IEquatable<SyncJobItem>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SyncJobItem" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="jobId">jobId.</param>
        /// <param name="itemId">itemId.</param>
        /// <param name="itemName">itemName.</param>
        /// <param name="mediaSourceId">mediaSourceId.</param>
        /// <param name="mediaSource">mediaSource.</param>
        /// <param name="targetId">targetId.</param>
        /// <param name="internalTargetId">internalTargetId.</param>
        /// <param name="outputPath">outputPath.</param>
        /// <param name="status">status.</param>
        /// <param name="progress">progress.</param>
        /// <param name="dateCreated">dateCreated.</param>
        /// <param name="primaryImageItemId">primaryImageItemId.</param>
        /// <param name="primaryImageTag">primaryImageTag.</param>
        /// <param name="temporaryPath">temporaryPath.</param>
        /// <param name="additionalFiles">additionalFiles.</param>
        public SyncJobItem(long? id = default(long?), long? jobId = default(long?), long? itemId = default(long?), string itemName = default(string), string mediaSourceId = default(string), MediaSourceInfo mediaSource = default(MediaSourceInfo), string targetId = default(string), long? internalTargetId = default(long?), string outputPath = default(string), SyncJobItemStatus status = default(SyncJobItemStatus), double? progress = default(double?), DateTimeOffset? dateCreated = default(DateTimeOffset?), string primaryImageItemId = default(string), string primaryImageTag = default(string), string temporaryPath = default(string), List<ItemFileInfo> additionalFiles = default(List<ItemFileInfo>))
        {
            this.Id = id;
            this.JobId = jobId;
            this.ItemId = itemId;
            this.ItemName = itemName;
            this.MediaSourceId = mediaSourceId;
            this.MediaSource = mediaSource;
            this.TargetId = targetId;
            this.InternalTargetId = internalTargetId;
            this.OutputPath = outputPath;
            this.Status = status;
            this.Progress = progress;
            this.DateCreated = dateCreated;
            this.PrimaryImageItemId = primaryImageItemId;
            this.PrimaryImageTag = primaryImageTag;
            this.TemporaryPath = temporaryPath;
            this.AdditionalFiles = additionalFiles;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public long? Id { get; set; }

        /// <summary>
        /// Gets or Sets JobId
        /// </summary>
        [DataMember(Name="JobId", EmitDefaultValue=false)]
        public long? JobId { get; set; }

        /// <summary>
        /// Gets or Sets ItemId
        /// </summary>
        [DataMember(Name="ItemId", EmitDefaultValue=false)]
        public long? ItemId { get; set; }

        /// <summary>
        /// Gets or Sets ItemName
        /// </summary>
        [DataMember(Name="ItemName", EmitDefaultValue=false)]
        public string ItemName { get; set; }

        /// <summary>
        /// Gets or Sets MediaSourceId
        /// </summary>
        [DataMember(Name="MediaSourceId", EmitDefaultValue=false)]
        public string MediaSourceId { get; set; }

        /// <summary>
        /// Gets or Sets MediaSource
        /// </summary>
        [DataMember(Name="MediaSource", EmitDefaultValue=false)]
        public MediaSourceInfo MediaSource { get; set; }

        /// <summary>
        /// Gets or Sets TargetId
        /// </summary>
        [DataMember(Name="TargetId", EmitDefaultValue=false)]
        public string TargetId { get; set; }

        /// <summary>
        /// Gets or Sets InternalTargetId
        /// </summary>
        [DataMember(Name="InternalTargetId", EmitDefaultValue=false)]
        public long? InternalTargetId { get; set; }

        /// <summary>
        /// Gets or Sets OutputPath
        /// </summary>
        [DataMember(Name="OutputPath", EmitDefaultValue=false)]
        public string OutputPath { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="Status", EmitDefaultValue=false)]
        public SyncJobItemStatus Status { get; set; }

        /// <summary>
        /// Gets or Sets Progress
        /// </summary>
        [DataMember(Name="Progress", EmitDefaultValue=false)]
        public double? Progress { get; set; }

        /// <summary>
        /// Gets or Sets DateCreated
        /// </summary>
        [DataMember(Name="DateCreated", EmitDefaultValue=false)]
        public DateTimeOffset? DateCreated { get; set; }

        /// <summary>
        /// Gets or Sets PrimaryImageItemId
        /// </summary>
        [DataMember(Name="PrimaryImageItemId", EmitDefaultValue=false)]
        public string PrimaryImageItemId { get; set; }

        /// <summary>
        /// Gets or Sets PrimaryImageTag
        /// </summary>
        [DataMember(Name="PrimaryImageTag", EmitDefaultValue=false)]
        public string PrimaryImageTag { get; set; }

        /// <summary>
        /// Gets or Sets TemporaryPath
        /// </summary>
        [DataMember(Name="TemporaryPath", EmitDefaultValue=false)]
        public string TemporaryPath { get; set; }

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
            sb.Append("class SyncJobItem {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  JobId: ").Append(JobId).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  ItemName: ").Append(ItemName).Append("\n");
            sb.Append("  MediaSourceId: ").Append(MediaSourceId).Append("\n");
            sb.Append("  MediaSource: ").Append(MediaSource).Append("\n");
            sb.Append("  TargetId: ").Append(TargetId).Append("\n");
            sb.Append("  InternalTargetId: ").Append(InternalTargetId).Append("\n");
            sb.Append("  OutputPath: ").Append(OutputPath).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Progress: ").Append(Progress).Append("\n");
            sb.Append("  DateCreated: ").Append(DateCreated).Append("\n");
            sb.Append("  PrimaryImageItemId: ").Append(PrimaryImageItemId).Append("\n");
            sb.Append("  PrimaryImageTag: ").Append(PrimaryImageTag).Append("\n");
            sb.Append("  TemporaryPath: ").Append(TemporaryPath).Append("\n");
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
            return this.Equals(input as SyncJobItem);
        }

        /// <summary>
        /// Returns true if SyncJobItem instances are equal
        /// </summary>
        /// <param name="input">Instance of SyncJobItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SyncJobItem input)
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
                    this.JobId == input.JobId ||
                    (this.JobId != null &&
                    this.JobId.Equals(input.JobId))
                ) && 
                (
                    this.ItemId == input.ItemId ||
                    (this.ItemId != null &&
                    this.ItemId.Equals(input.ItemId))
                ) && 
                (
                    this.ItemName == input.ItemName ||
                    (this.ItemName != null &&
                    this.ItemName.Equals(input.ItemName))
                ) && 
                (
                    this.MediaSourceId == input.MediaSourceId ||
                    (this.MediaSourceId != null &&
                    this.MediaSourceId.Equals(input.MediaSourceId))
                ) && 
                (
                    this.MediaSource == input.MediaSource ||
                    (this.MediaSource != null &&
                    this.MediaSource.Equals(input.MediaSource))
                ) && 
                (
                    this.TargetId == input.TargetId ||
                    (this.TargetId != null &&
                    this.TargetId.Equals(input.TargetId))
                ) && 
                (
                    this.InternalTargetId == input.InternalTargetId ||
                    (this.InternalTargetId != null &&
                    this.InternalTargetId.Equals(input.InternalTargetId))
                ) && 
                (
                    this.OutputPath == input.OutputPath ||
                    (this.OutputPath != null &&
                    this.OutputPath.Equals(input.OutputPath))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.Progress == input.Progress ||
                    (this.Progress != null &&
                    this.Progress.Equals(input.Progress))
                ) && 
                (
                    this.DateCreated == input.DateCreated ||
                    (this.DateCreated != null &&
                    this.DateCreated.Equals(input.DateCreated))
                ) && 
                (
                    this.PrimaryImageItemId == input.PrimaryImageItemId ||
                    (this.PrimaryImageItemId != null &&
                    this.PrimaryImageItemId.Equals(input.PrimaryImageItemId))
                ) && 
                (
                    this.PrimaryImageTag == input.PrimaryImageTag ||
                    (this.PrimaryImageTag != null &&
                    this.PrimaryImageTag.Equals(input.PrimaryImageTag))
                ) && 
                (
                    this.TemporaryPath == input.TemporaryPath ||
                    (this.TemporaryPath != null &&
                    this.TemporaryPath.Equals(input.TemporaryPath))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.JobId != null)
                    hashCode = hashCode * 59 + this.JobId.GetHashCode();
                if (this.ItemId != null)
                    hashCode = hashCode * 59 + this.ItemId.GetHashCode();
                if (this.ItemName != null)
                    hashCode = hashCode * 59 + this.ItemName.GetHashCode();
                if (this.MediaSourceId != null)
                    hashCode = hashCode * 59 + this.MediaSourceId.GetHashCode();
                if (this.MediaSource != null)
                    hashCode = hashCode * 59 + this.MediaSource.GetHashCode();
                if (this.TargetId != null)
                    hashCode = hashCode * 59 + this.TargetId.GetHashCode();
                if (this.InternalTargetId != null)
                    hashCode = hashCode * 59 + this.InternalTargetId.GetHashCode();
                if (this.OutputPath != null)
                    hashCode = hashCode * 59 + this.OutputPath.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.Progress != null)
                    hashCode = hashCode * 59 + this.Progress.GetHashCode();
                if (this.DateCreated != null)
                    hashCode = hashCode * 59 + this.DateCreated.GetHashCode();
                if (this.PrimaryImageItemId != null)
                    hashCode = hashCode * 59 + this.PrimaryImageItemId.GetHashCode();
                if (this.PrimaryImageTag != null)
                    hashCode = hashCode * 59 + this.PrimaryImageTag.GetHashCode();
                if (this.TemporaryPath != null)
                    hashCode = hashCode * 59 + this.TemporaryPath.GetHashCode();
                if (this.AdditionalFiles != null)
                    hashCode = hashCode * 59 + this.AdditionalFiles.GetHashCode();
                return hashCode;
            }
        }

    }
}
