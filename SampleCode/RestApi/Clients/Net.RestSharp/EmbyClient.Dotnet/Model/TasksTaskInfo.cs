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
    /// TasksTaskInfo
    /// </summary>
    [DataContract]
        public partial class TasksTaskInfo :  IEquatable<TasksTaskInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TasksTaskInfo" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="state">state.</param>
        /// <param name="currentProgressPercentage">currentProgressPercentage.</param>
        /// <param name="id">id.</param>
        /// <param name="lastExecutionResult">lastExecutionResult.</param>
        /// <param name="triggers">triggers.</param>
        /// <param name="description">description.</param>
        /// <param name="category">category.</param>
        /// <param name="isHidden">isHidden.</param>
        /// <param name="key">key.</param>
        public TasksTaskInfo(string name = default(string), TasksTaskState state = default(TasksTaskState), double? currentProgressPercentage = default(double?), string id = default(string), TasksTaskResult lastExecutionResult = default(TasksTaskResult), List<TasksTaskTriggerInfo> triggers = default(List<TasksTaskTriggerInfo>), string description = default(string), string category = default(string), bool? isHidden = default(bool?), string key = default(string))
        {
            this.Name = name;
            this.State = state;
            this.CurrentProgressPercentage = currentProgressPercentage;
            this.Id = id;
            this.LastExecutionResult = lastExecutionResult;
            this.Triggers = triggers;
            this.Description = description;
            this.Category = category;
            this.IsHidden = isHidden;
            this.Key = key;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="State", EmitDefaultValue=false)]
        public TasksTaskState State { get; set; }

        /// <summary>
        /// Gets or Sets CurrentProgressPercentage
        /// </summary>
        [DataMember(Name="CurrentProgressPercentage", EmitDefaultValue=false)]
        public double? CurrentProgressPercentage { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets LastExecutionResult
        /// </summary>
        [DataMember(Name="LastExecutionResult", EmitDefaultValue=false)]
        public TasksTaskResult LastExecutionResult { get; set; }

        /// <summary>
        /// Gets or Sets Triggers
        /// </summary>
        [DataMember(Name="Triggers", EmitDefaultValue=false)]
        public List<TasksTaskTriggerInfo> Triggers { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name="Description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Category
        /// </summary>
        [DataMember(Name="Category", EmitDefaultValue=false)]
        public string Category { get; set; }

        /// <summary>
        /// Gets or Sets IsHidden
        /// </summary>
        [DataMember(Name="IsHidden", EmitDefaultValue=false)]
        public bool? IsHidden { get; set; }

        /// <summary>
        /// Gets or Sets Key
        /// </summary>
        [DataMember(Name="Key", EmitDefaultValue=false)]
        public string Key { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TasksTaskInfo {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  CurrentProgressPercentage: ").Append(CurrentProgressPercentage).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  LastExecutionResult: ").Append(LastExecutionResult).Append("\n");
            sb.Append("  Triggers: ").Append(Triggers).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  IsHidden: ").Append(IsHidden).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
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
            return this.Equals(input as TasksTaskInfo);
        }

        /// <summary>
        /// Returns true if TasksTaskInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of TasksTaskInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TasksTaskInfo input)
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
                    this.State == input.State ||
                    (this.State != null &&
                    this.State.Equals(input.State))
                ) && 
                (
                    this.CurrentProgressPercentage == input.CurrentProgressPercentage ||
                    (this.CurrentProgressPercentage != null &&
                    this.CurrentProgressPercentage.Equals(input.CurrentProgressPercentage))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.LastExecutionResult == input.LastExecutionResult ||
                    (this.LastExecutionResult != null &&
                    this.LastExecutionResult.Equals(input.LastExecutionResult))
                ) && 
                (
                    this.Triggers == input.Triggers ||
                    this.Triggers != null &&
                    input.Triggers != null &&
                    this.Triggers.SequenceEqual(input.Triggers)
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Category == input.Category ||
                    (this.Category != null &&
                    this.Category.Equals(input.Category))
                ) && 
                (
                    this.IsHidden == input.IsHidden ||
                    (this.IsHidden != null &&
                    this.IsHidden.Equals(input.IsHidden))
                ) && 
                (
                    this.Key == input.Key ||
                    (this.Key != null &&
                    this.Key.Equals(input.Key))
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
                if (this.State != null)
                    hashCode = hashCode * 59 + this.State.GetHashCode();
                if (this.CurrentProgressPercentage != null)
                    hashCode = hashCode * 59 + this.CurrentProgressPercentage.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.LastExecutionResult != null)
                    hashCode = hashCode * 59 + this.LastExecutionResult.GetHashCode();
                if (this.Triggers != null)
                    hashCode = hashCode * 59 + this.Triggers.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.Category != null)
                    hashCode = hashCode * 59 + this.Category.GetHashCode();
                if (this.IsHidden != null)
                    hashCode = hashCode * 59 + this.IsHidden.GetHashCode();
                if (this.Key != null)
                    hashCode = hashCode * 59 + this.Key.GetHashCode();
                return hashCode;
            }
        }

    }
}
