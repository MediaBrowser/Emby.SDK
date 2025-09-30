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
    /// Class TaskInfo  
    /// </summary>
    [DataContract]
        public partial class TaskInfo :  IEquatable<TaskInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TaskInfo" /> class.
        /// </summary>
        /// <param name="name">The name..</param>
        /// <param name="state">state.</param>
        /// <param name="currentProgressPercentage">The progress..</param>
        /// <param name="id">The id..</param>
        /// <param name="lastExecutionResult">lastExecutionResult.</param>
        /// <param name="triggers">The triggers..</param>
        /// <param name="description">The description..</param>
        /// <param name="category">The category..</param>
        /// <param name="isHidden">A value indicating whether this instance is hidden..</param>
        /// <param name="key">The key..</param>
        public TaskInfo(string name = default(string), TaskState state = default(TaskState), double? currentProgressPercentage = default(double?), string id = default(string), TaskResult lastExecutionResult = default(TaskResult), List<TaskTriggerInfo> triggers = default(List<TaskTriggerInfo>), string description = default(string), string category = default(string), bool? isHidden = default(bool?), string key = default(string))
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
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="State", EmitDefaultValue=false)]
        public TaskState State { get; set; }

        /// <summary>
        /// The progress.
        /// </summary>
        /// <value>The progress.</value>
        [DataMember(Name="CurrentProgressPercentage", EmitDefaultValue=false)]
        public double? CurrentProgressPercentage { get; set; }

        /// <summary>
        /// The id.
        /// </summary>
        /// <value>The id.</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets LastExecutionResult
        /// </summary>
        [DataMember(Name="LastExecutionResult", EmitDefaultValue=false)]
        public TaskResult LastExecutionResult { get; set; }

        /// <summary>
        /// The triggers.
        /// </summary>
        /// <value>The triggers.</value>
        [DataMember(Name="Triggers", EmitDefaultValue=false)]
        public List<TaskTriggerInfo> Triggers { get; set; }

        /// <summary>
        /// The description.
        /// </summary>
        /// <value>The description.</value>
        [DataMember(Name="Description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// The category.
        /// </summary>
        /// <value>The category.</value>
        [DataMember(Name="Category", EmitDefaultValue=false)]
        public string Category { get; set; }

        /// <summary>
        /// A value indicating whether this instance is hidden.
        /// </summary>
        /// <value>A value indicating whether this instance is hidden.</value>
        [DataMember(Name="IsHidden", EmitDefaultValue=false)]
        public bool? IsHidden { get; set; }

        /// <summary>
        /// The key.
        /// </summary>
        /// <value>The key.</value>
        [DataMember(Name="Key", EmitDefaultValue=false)]
        public string Key { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TaskInfo {\n");
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
            return this.Equals(input as TaskInfo);
        }

        /// <summary>
        /// Returns true if TaskInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of TaskInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TaskInfo input)
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
