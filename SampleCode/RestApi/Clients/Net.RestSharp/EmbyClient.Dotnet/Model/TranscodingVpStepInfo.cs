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
    /// TranscodingVpStepInfo
    /// </summary>
    [DataContract]
        public partial class TranscodingVpStepInfo :  IEquatable<TranscodingVpStepInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TranscodingVpStepInfo" /> class.
        /// </summary>
        /// <param name="stepType">stepType.</param>
        /// <param name="stepTypeName">stepTypeName.</param>
        /// <param name="hardwareContextName">hardwareContextName.</param>
        /// <param name="isHardwareContext">isHardwareContext.</param>
        /// <param name="name">name.</param>
        /// <param name="_short">_short.</param>
        /// <param name="ffmpegName">ffmpegName.</param>
        /// <param name="ffmpegDescription">ffmpegDescription.</param>
        /// <param name="ffmpegOptions">ffmpegOptions.</param>
        /// <param name="param">param.</param>
        /// <param name="paramShort">paramShort.</param>
        public TranscodingVpStepInfo(TranscodingVpStepTypes stepType = default(TranscodingVpStepTypes), string stepTypeName = default(string), string hardwareContextName = default(string), bool? isHardwareContext = default(bool?), string name = default(string), string _short = default(string), string ffmpegName = default(string), string ffmpegDescription = default(string), string ffmpegOptions = default(string), string param = default(string), string paramShort = default(string))
        {
            this.StepType = stepType;
            this.StepTypeName = stepTypeName;
            this.HardwareContextName = hardwareContextName;
            this.IsHardwareContext = isHardwareContext;
            this.Name = name;
            this._Short = _short;
            this.FfmpegName = ffmpegName;
            this.FfmpegDescription = ffmpegDescription;
            this.FfmpegOptions = ffmpegOptions;
            this.Param = param;
            this.ParamShort = paramShort;
        }
        
        /// <summary>
        /// Gets or Sets StepType
        /// </summary>
        [DataMember(Name="StepType", EmitDefaultValue=false)]
        public TranscodingVpStepTypes StepType { get; set; }

        /// <summary>
        /// Gets or Sets StepTypeName
        /// </summary>
        [DataMember(Name="StepTypeName", EmitDefaultValue=false)]
        public string StepTypeName { get; set; }

        /// <summary>
        /// Gets or Sets HardwareContextName
        /// </summary>
        [DataMember(Name="HardwareContextName", EmitDefaultValue=false)]
        public string HardwareContextName { get; set; }

        /// <summary>
        /// Gets or Sets IsHardwareContext
        /// </summary>
        [DataMember(Name="IsHardwareContext", EmitDefaultValue=false)]
        public bool? IsHardwareContext { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets _Short
        /// </summary>
        [DataMember(Name="Short", EmitDefaultValue=false)]
        public string _Short { get; set; }

        /// <summary>
        /// Gets or Sets FfmpegName
        /// </summary>
        [DataMember(Name="FfmpegName", EmitDefaultValue=false)]
        public string FfmpegName { get; set; }

        /// <summary>
        /// Gets or Sets FfmpegDescription
        /// </summary>
        [DataMember(Name="FfmpegDescription", EmitDefaultValue=false)]
        public string FfmpegDescription { get; set; }

        /// <summary>
        /// Gets or Sets FfmpegOptions
        /// </summary>
        [DataMember(Name="FfmpegOptions", EmitDefaultValue=false)]
        public string FfmpegOptions { get; set; }

        /// <summary>
        /// Gets or Sets Param
        /// </summary>
        [DataMember(Name="Param", EmitDefaultValue=false)]
        public string Param { get; set; }

        /// <summary>
        /// Gets or Sets ParamShort
        /// </summary>
        [DataMember(Name="ParamShort", EmitDefaultValue=false)]
        public string ParamShort { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TranscodingVpStepInfo {\n");
            sb.Append("  StepType: ").Append(StepType).Append("\n");
            sb.Append("  StepTypeName: ").Append(StepTypeName).Append("\n");
            sb.Append("  HardwareContextName: ").Append(HardwareContextName).Append("\n");
            sb.Append("  IsHardwareContext: ").Append(IsHardwareContext).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  _Short: ").Append(_Short).Append("\n");
            sb.Append("  FfmpegName: ").Append(FfmpegName).Append("\n");
            sb.Append("  FfmpegDescription: ").Append(FfmpegDescription).Append("\n");
            sb.Append("  FfmpegOptions: ").Append(FfmpegOptions).Append("\n");
            sb.Append("  Param: ").Append(Param).Append("\n");
            sb.Append("  ParamShort: ").Append(ParamShort).Append("\n");
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
            return this.Equals(input as TranscodingVpStepInfo);
        }

        /// <summary>
        /// Returns true if TranscodingVpStepInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of TranscodingVpStepInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TranscodingVpStepInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.StepType == input.StepType ||
                    (this.StepType != null &&
                    this.StepType.Equals(input.StepType))
                ) && 
                (
                    this.StepTypeName == input.StepTypeName ||
                    (this.StepTypeName != null &&
                    this.StepTypeName.Equals(input.StepTypeName))
                ) && 
                (
                    this.HardwareContextName == input.HardwareContextName ||
                    (this.HardwareContextName != null &&
                    this.HardwareContextName.Equals(input.HardwareContextName))
                ) && 
                (
                    this.IsHardwareContext == input.IsHardwareContext ||
                    (this.IsHardwareContext != null &&
                    this.IsHardwareContext.Equals(input.IsHardwareContext))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this._Short == input._Short ||
                    (this._Short != null &&
                    this._Short.Equals(input._Short))
                ) && 
                (
                    this.FfmpegName == input.FfmpegName ||
                    (this.FfmpegName != null &&
                    this.FfmpegName.Equals(input.FfmpegName))
                ) && 
                (
                    this.FfmpegDescription == input.FfmpegDescription ||
                    (this.FfmpegDescription != null &&
                    this.FfmpegDescription.Equals(input.FfmpegDescription))
                ) && 
                (
                    this.FfmpegOptions == input.FfmpegOptions ||
                    (this.FfmpegOptions != null &&
                    this.FfmpegOptions.Equals(input.FfmpegOptions))
                ) && 
                (
                    this.Param == input.Param ||
                    (this.Param != null &&
                    this.Param.Equals(input.Param))
                ) && 
                (
                    this.ParamShort == input.ParamShort ||
                    (this.ParamShort != null &&
                    this.ParamShort.Equals(input.ParamShort))
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
                if (this.StepType != null)
                    hashCode = hashCode * 59 + this.StepType.GetHashCode();
                if (this.StepTypeName != null)
                    hashCode = hashCode * 59 + this.StepTypeName.GetHashCode();
                if (this.HardwareContextName != null)
                    hashCode = hashCode * 59 + this.HardwareContextName.GetHashCode();
                if (this.IsHardwareContext != null)
                    hashCode = hashCode * 59 + this.IsHardwareContext.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this._Short != null)
                    hashCode = hashCode * 59 + this._Short.GetHashCode();
                if (this.FfmpegName != null)
                    hashCode = hashCode * 59 + this.FfmpegName.GetHashCode();
                if (this.FfmpegDescription != null)
                    hashCode = hashCode * 59 + this.FfmpegDescription.GetHashCode();
                if (this.FfmpegOptions != null)
                    hashCode = hashCode * 59 + this.FfmpegOptions.GetHashCode();
                if (this.Param != null)
                    hashCode = hashCode * 59 + this.Param.GetHashCode();
                if (this.ParamShort != null)
                    hashCode = hashCode * 59 + this.ParamShort.GetHashCode();
                return hashCode;
            }
        }

    }
}
