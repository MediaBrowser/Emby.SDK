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
    /// A class combining both &#x60;Emby.Media.Model.Types.ProfileInformation&#x60; and &#x60;Emby.Media.Model.Types.LevelInformation&#x60;.  
    /// </summary>
    [DataContract]
        public partial class ProfileLevelInformation :  IEquatable<ProfileLevelInformation>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ProfileLevelInformation" /> class.
        /// </summary>
        /// <param name="profile">profile.</param>
        /// <param name="level">level.</param>
        public ProfileLevelInformation(ProfileInformation profile = default(ProfileInformation), LevelInformation level = default(LevelInformation))
        {
            this.Profile = profile;
            this.Level = level;
        }
        
        /// <summary>
        /// Gets or Sets Profile
        /// </summary>
        [DataMember(Name="Profile", EmitDefaultValue=false)]
        public ProfileInformation Profile { get; set; }

        /// <summary>
        /// Gets or Sets Level
        /// </summary>
        [DataMember(Name="Level", EmitDefaultValue=false)]
        public LevelInformation Level { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProfileLevelInformation {\n");
            sb.Append("  Profile: ").Append(Profile).Append("\n");
            sb.Append("  Level: ").Append(Level).Append("\n");
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
            return this.Equals(input as ProfileLevelInformation);
        }

        /// <summary>
        /// Returns true if ProfileLevelInformation instances are equal
        /// </summary>
        /// <param name="input">Instance of ProfileLevelInformation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProfileLevelInformation input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Profile == input.Profile ||
                    (this.Profile != null &&
                    this.Profile.Equals(input.Profile))
                ) && 
                (
                    this.Level == input.Level ||
                    (this.Level != null &&
                    this.Level.Equals(input.Level))
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
                if (this.Profile != null)
                    hashCode = hashCode * 59 + this.Profile.GetHashCode();
                if (this.Level != null)
                    hashCode = hashCode * 59 + this.Level.GetHashCode();
                return hashCode;
            }
        }

    }
}
