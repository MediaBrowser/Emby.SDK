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
    /// ClientCapabilities
    /// </summary>
    [DataContract]
        public partial class ClientCapabilities :  IEquatable<ClientCapabilities>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientCapabilities" /> class.
        /// </summary>
        /// <param name="playableMediaTypes">playableMediaTypes.</param>
        /// <param name="supportedCommands">supportedCommands.</param>
        /// <param name="supportsMediaControl">supportsMediaControl.</param>
        /// <param name="pushToken">pushToken.</param>
        /// <param name="pushTokenType">pushTokenType.</param>
        /// <param name="supportsSync">supportsSync.</param>
        /// <param name="deviceProfile">deviceProfile.</param>
        /// <param name="iconUrl">iconUrl.</param>
        /// <param name="appId">appId.</param>
        public ClientCapabilities(List<string> playableMediaTypes = default(List<string>), List<string> supportedCommands = default(List<string>), bool? supportsMediaControl = default(bool?), string pushToken = default(string), string pushTokenType = default(string), bool? supportsSync = default(bool?), DeviceProfile deviceProfile = default(DeviceProfile), string iconUrl = default(string), string appId = default(string))
        {
            this.PlayableMediaTypes = playableMediaTypes;
            this.SupportedCommands = supportedCommands;
            this.SupportsMediaControl = supportsMediaControl;
            this.PushToken = pushToken;
            this.PushTokenType = pushTokenType;
            this.SupportsSync = supportsSync;
            this.DeviceProfile = deviceProfile;
            this.IconUrl = iconUrl;
            this.AppId = appId;
        }
        
        /// <summary>
        /// Gets or Sets PlayableMediaTypes
        /// </summary>
        [DataMember(Name="PlayableMediaTypes", EmitDefaultValue=false)]
        public List<string> PlayableMediaTypes { get; set; }

        /// <summary>
        /// Gets or Sets SupportedCommands
        /// </summary>
        [DataMember(Name="SupportedCommands", EmitDefaultValue=false)]
        public List<string> SupportedCommands { get; set; }

        /// <summary>
        /// Gets or Sets SupportsMediaControl
        /// </summary>
        [DataMember(Name="SupportsMediaControl", EmitDefaultValue=false)]
        public bool? SupportsMediaControl { get; set; }

        /// <summary>
        /// Gets or Sets PushToken
        /// </summary>
        [DataMember(Name="PushToken", EmitDefaultValue=false)]
        public string PushToken { get; set; }

        /// <summary>
        /// Gets or Sets PushTokenType
        /// </summary>
        [DataMember(Name="PushTokenType", EmitDefaultValue=false)]
        public string PushTokenType { get; set; }

        /// <summary>
        /// Gets or Sets SupportsSync
        /// </summary>
        [DataMember(Name="SupportsSync", EmitDefaultValue=false)]
        public bool? SupportsSync { get; set; }

        /// <summary>
        /// Gets or Sets DeviceProfile
        /// </summary>
        [DataMember(Name="DeviceProfile", EmitDefaultValue=false)]
        public DeviceProfile DeviceProfile { get; set; }

        /// <summary>
        /// Gets or Sets IconUrl
        /// </summary>
        [DataMember(Name="IconUrl", EmitDefaultValue=false)]
        public string IconUrl { get; set; }

        /// <summary>
        /// Gets or Sets AppId
        /// </summary>
        [DataMember(Name="AppId", EmitDefaultValue=false)]
        public string AppId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ClientCapabilities {\n");
            sb.Append("  PlayableMediaTypes: ").Append(PlayableMediaTypes).Append("\n");
            sb.Append("  SupportedCommands: ").Append(SupportedCommands).Append("\n");
            sb.Append("  SupportsMediaControl: ").Append(SupportsMediaControl).Append("\n");
            sb.Append("  PushToken: ").Append(PushToken).Append("\n");
            sb.Append("  PushTokenType: ").Append(PushTokenType).Append("\n");
            sb.Append("  SupportsSync: ").Append(SupportsSync).Append("\n");
            sb.Append("  DeviceProfile: ").Append(DeviceProfile).Append("\n");
            sb.Append("  IconUrl: ").Append(IconUrl).Append("\n");
            sb.Append("  AppId: ").Append(AppId).Append("\n");
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
            return this.Equals(input as ClientCapabilities);
        }

        /// <summary>
        /// Returns true if ClientCapabilities instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientCapabilities to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientCapabilities input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.PlayableMediaTypes == input.PlayableMediaTypes ||
                    this.PlayableMediaTypes != null &&
                    input.PlayableMediaTypes != null &&
                    this.PlayableMediaTypes.SequenceEqual(input.PlayableMediaTypes)
                ) && 
                (
                    this.SupportedCommands == input.SupportedCommands ||
                    this.SupportedCommands != null &&
                    input.SupportedCommands != null &&
                    this.SupportedCommands.SequenceEqual(input.SupportedCommands)
                ) && 
                (
                    this.SupportsMediaControl == input.SupportsMediaControl ||
                    (this.SupportsMediaControl != null &&
                    this.SupportsMediaControl.Equals(input.SupportsMediaControl))
                ) && 
                (
                    this.PushToken == input.PushToken ||
                    (this.PushToken != null &&
                    this.PushToken.Equals(input.PushToken))
                ) && 
                (
                    this.PushTokenType == input.PushTokenType ||
                    (this.PushTokenType != null &&
                    this.PushTokenType.Equals(input.PushTokenType))
                ) && 
                (
                    this.SupportsSync == input.SupportsSync ||
                    (this.SupportsSync != null &&
                    this.SupportsSync.Equals(input.SupportsSync))
                ) && 
                (
                    this.DeviceProfile == input.DeviceProfile ||
                    (this.DeviceProfile != null &&
                    this.DeviceProfile.Equals(input.DeviceProfile))
                ) && 
                (
                    this.IconUrl == input.IconUrl ||
                    (this.IconUrl != null &&
                    this.IconUrl.Equals(input.IconUrl))
                ) && 
                (
                    this.AppId == input.AppId ||
                    (this.AppId != null &&
                    this.AppId.Equals(input.AppId))
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
                if (this.PlayableMediaTypes != null)
                    hashCode = hashCode * 59 + this.PlayableMediaTypes.GetHashCode();
                if (this.SupportedCommands != null)
                    hashCode = hashCode * 59 + this.SupportedCommands.GetHashCode();
                if (this.SupportsMediaControl != null)
                    hashCode = hashCode * 59 + this.SupportsMediaControl.GetHashCode();
                if (this.PushToken != null)
                    hashCode = hashCode * 59 + this.PushToken.GetHashCode();
                if (this.PushTokenType != null)
                    hashCode = hashCode * 59 + this.PushTokenType.GetHashCode();
                if (this.SupportsSync != null)
                    hashCode = hashCode * 59 + this.SupportsSync.GetHashCode();
                if (this.DeviceProfile != null)
                    hashCode = hashCode * 59 + this.DeviceProfile.GetHashCode();
                if (this.IconUrl != null)
                    hashCode = hashCode * 59 + this.IconUrl.GetHashCode();
                if (this.AppId != null)
                    hashCode = hashCode * 59 + this.AppId.GetHashCode();
                return hashCode;
            }
        }

    }
}
