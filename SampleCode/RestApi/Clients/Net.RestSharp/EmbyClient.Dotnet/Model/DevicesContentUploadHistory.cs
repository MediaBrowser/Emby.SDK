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
    /// DevicesContentUploadHistory
    /// </summary>
    [DataContract]
        public partial class DevicesContentUploadHistory :  IEquatable<DevicesContentUploadHistory>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DevicesContentUploadHistory" /> class.
        /// </summary>
        /// <param name="deviceId">deviceId.</param>
        /// <param name="filesUploaded">filesUploaded.</param>
        public DevicesContentUploadHistory(string deviceId = default(string), List<DevicesLocalFileInfo> filesUploaded = default(List<DevicesLocalFileInfo>))
        {
            this.DeviceId = deviceId;
            this.FilesUploaded = filesUploaded;
        }
        
        /// <summary>
        /// Gets or Sets DeviceId
        /// </summary>
        [DataMember(Name="DeviceId", EmitDefaultValue=false)]
        public string DeviceId { get; set; }

        /// <summary>
        /// Gets or Sets FilesUploaded
        /// </summary>
        [DataMember(Name="FilesUploaded", EmitDefaultValue=false)]
        public List<DevicesLocalFileInfo> FilesUploaded { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DevicesContentUploadHistory {\n");
            sb.Append("  DeviceId: ").Append(DeviceId).Append("\n");
            sb.Append("  FilesUploaded: ").Append(FilesUploaded).Append("\n");
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
            return this.Equals(input as DevicesContentUploadHistory);
        }

        /// <summary>
        /// Returns true if DevicesContentUploadHistory instances are equal
        /// </summary>
        /// <param name="input">Instance of DevicesContentUploadHistory to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DevicesContentUploadHistory input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DeviceId == input.DeviceId ||
                    (this.DeviceId != null &&
                    this.DeviceId.Equals(input.DeviceId))
                ) && 
                (
                    this.FilesUploaded == input.FilesUploaded ||
                    this.FilesUploaded != null &&
                    input.FilesUploaded != null &&
                    this.FilesUploaded.SequenceEqual(input.FilesUploaded)
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
                if (this.DeviceId != null)
                    hashCode = hashCode * 59 + this.DeviceId.GetHashCode();
                if (this.FilesUploaded != null)
                    hashCode = hashCode * 59 + this.FilesUploaded.GetHashCode();
                return hashCode;
            }
        }

    }
}
