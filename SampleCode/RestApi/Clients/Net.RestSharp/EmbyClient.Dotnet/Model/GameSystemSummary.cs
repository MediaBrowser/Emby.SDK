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
    /// GameSystemSummary
    /// </summary>
    [DataContract]
        public partial class GameSystemSummary :  IEquatable<GameSystemSummary>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GameSystemSummary" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="displayName">displayName.</param>
        /// <param name="gameCount">gameCount.</param>
        /// <param name="gameFileExtensions">gameFileExtensions.</param>
        /// <param name="clientInstalledGameCount">clientInstalledGameCount.</param>
        public GameSystemSummary(string name = default(string), string displayName = default(string), int? gameCount = default(int?), List<string> gameFileExtensions = default(List<string>), int? clientInstalledGameCount = default(int?))
        {
            this.Name = name;
            this.DisplayName = displayName;
            this.GameCount = gameCount;
            this.GameFileExtensions = gameFileExtensions;
            this.ClientInstalledGameCount = clientInstalledGameCount;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets DisplayName
        /// </summary>
        [DataMember(Name="DisplayName", EmitDefaultValue=false)]
        public string DisplayName { get; set; }

        /// <summary>
        /// Gets or Sets GameCount
        /// </summary>
        [DataMember(Name="GameCount", EmitDefaultValue=false)]
        public int? GameCount { get; set; }

        /// <summary>
        /// Gets or Sets GameFileExtensions
        /// </summary>
        [DataMember(Name="GameFileExtensions", EmitDefaultValue=false)]
        public List<string> GameFileExtensions { get; set; }

        /// <summary>
        /// Gets or Sets ClientInstalledGameCount
        /// </summary>
        [DataMember(Name="ClientInstalledGameCount", EmitDefaultValue=false)]
        public int? ClientInstalledGameCount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GameSystemSummary {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  GameCount: ").Append(GameCount).Append("\n");
            sb.Append("  GameFileExtensions: ").Append(GameFileExtensions).Append("\n");
            sb.Append("  ClientInstalledGameCount: ").Append(ClientInstalledGameCount).Append("\n");
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
            return this.Equals(input as GameSystemSummary);
        }

        /// <summary>
        /// Returns true if GameSystemSummary instances are equal
        /// </summary>
        /// <param name="input">Instance of GameSystemSummary to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GameSystemSummary input)
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
                    this.DisplayName == input.DisplayName ||
                    (this.DisplayName != null &&
                    this.DisplayName.Equals(input.DisplayName))
                ) && 
                (
                    this.GameCount == input.GameCount ||
                    (this.GameCount != null &&
                    this.GameCount.Equals(input.GameCount))
                ) && 
                (
                    this.GameFileExtensions == input.GameFileExtensions ||
                    this.GameFileExtensions != null &&
                    input.GameFileExtensions != null &&
                    this.GameFileExtensions.SequenceEqual(input.GameFileExtensions)
                ) && 
                (
                    this.ClientInstalledGameCount == input.ClientInstalledGameCount ||
                    (this.ClientInstalledGameCount != null &&
                    this.ClientInstalledGameCount.Equals(input.ClientInstalledGameCount))
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
                if (this.DisplayName != null)
                    hashCode = hashCode * 59 + this.DisplayName.GetHashCode();
                if (this.GameCount != null)
                    hashCode = hashCode * 59 + this.GameCount.GetHashCode();
                if (this.GameFileExtensions != null)
                    hashCode = hashCode * 59 + this.GameFileExtensions.GetHashCode();
                if (this.ClientInstalledGameCount != null)
                    hashCode = hashCode * 59 + this.ClientInstalledGameCount.GetHashCode();
                return hashCode;
            }
        }

    }
}
