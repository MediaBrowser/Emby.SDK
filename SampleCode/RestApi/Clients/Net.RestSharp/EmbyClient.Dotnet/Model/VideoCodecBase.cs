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
    /// VideoCodecBase
    /// </summary>
    [DataContract]
        public partial class VideoCodecBase :  IEquatable<VideoCodecBase>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VideoCodecBase" /> class.
        /// </summary>
        /// <param name="codecDeviceInfo">codecDeviceInfo.</param>
        /// <param name="codecKind">codecKind.</param>
        /// <param name="mediaTypeName">mediaTypeName.</param>
        /// <param name="videoMediaType">videoMediaType.</param>
        /// <param name="minWidth">minWidth.</param>
        /// <param name="maxWidth">maxWidth.</param>
        /// <param name="minHeight">minHeight.</param>
        /// <param name="maxHeight">maxHeight.</param>
        /// <param name="widthAlignment">widthAlignment.</param>
        /// <param name="heightAlignment">heightAlignment.</param>
        /// <param name="maxBitRate">maxBitRate.</param>
        /// <param name="supportedColorFormats">supportedColorFormats.</param>
        /// <param name="supportedColorFormatStrings">supportedColorFormatStrings.</param>
        /// <param name="profileAndLevelInformation">profileAndLevelInformation.</param>
        /// <param name="id">id.</param>
        /// <param name="direction">direction.</param>
        /// <param name="name">name.</param>
        /// <param name="description">description.</param>
        /// <param name="frameworkCodec">frameworkCodec.</param>
        /// <param name="isHardwareCodec">isHardwareCodec.</param>
        /// <param name="secondaryFramework">secondaryFramework.</param>
        /// <param name="secondaryFrameworkCodec">secondaryFrameworkCodec.</param>
        /// <param name="maxInstanceCount">maxInstanceCount.</param>
        /// <param name="isEnabledByDefault">isEnabledByDefault.</param>
        /// <param name="defaultPriority">defaultPriority.</param>
        public VideoCodecBase(CommonInterfacesICodecDeviceInfo codecDeviceInfo = default(CommonInterfacesICodecDeviceInfo), CodecKinds codecKind = default(CodecKinds), string mediaTypeName = default(string), VideoMediaTypes videoMediaType = default(VideoMediaTypes), int? minWidth = default(int?), int? maxWidth = default(int?), int? minHeight = default(int?), int? maxHeight = default(int?), int? widthAlignment = default(int?), int? heightAlignment = default(int?), BitRate maxBitRate = default(BitRate), List<ColorFormats> supportedColorFormats = default(List<ColorFormats>), List<string> supportedColorFormatStrings = default(List<string>), List<ProfileLevelInformation> profileAndLevelInformation = default(List<ProfileLevelInformation>), string id = default(string), CodecDirections direction = default(CodecDirections), string name = default(string), string description = default(string), string frameworkCodec = default(string), bool? isHardwareCodec = default(bool?), SecondaryFrameworks secondaryFramework = default(SecondaryFrameworks), string secondaryFrameworkCodec = default(string), int? maxInstanceCount = default(int?), bool? isEnabledByDefault = default(bool?), int? defaultPriority = default(int?))
        {
            this.CodecDeviceInfo = codecDeviceInfo;
            this.CodecKind = codecKind;
            this.MediaTypeName = mediaTypeName;
            this.VideoMediaType = videoMediaType;
            this.MinWidth = minWidth;
            this.MaxWidth = maxWidth;
            this.MinHeight = minHeight;
            this.MaxHeight = maxHeight;
            this.WidthAlignment = widthAlignment;
            this.HeightAlignment = heightAlignment;
            this.MaxBitRate = maxBitRate;
            this.SupportedColorFormats = supportedColorFormats;
            this.SupportedColorFormatStrings = supportedColorFormatStrings;
            this.ProfileAndLevelInformation = profileAndLevelInformation;
            this.Id = id;
            this.Direction = direction;
            this.Name = name;
            this.Description = description;
            this.FrameworkCodec = frameworkCodec;
            this.IsHardwareCodec = isHardwareCodec;
            this.SecondaryFramework = secondaryFramework;
            this.SecondaryFrameworkCodec = secondaryFrameworkCodec;
            this.MaxInstanceCount = maxInstanceCount;
            this.IsEnabledByDefault = isEnabledByDefault;
            this.DefaultPriority = defaultPriority;
        }
        
        /// <summary>
        /// Gets or Sets CodecDeviceInfo
        /// </summary>
        [DataMember(Name="CodecDeviceInfo", EmitDefaultValue=false)]
        public CommonInterfacesICodecDeviceInfo CodecDeviceInfo { get; set; }

        /// <summary>
        /// Gets or Sets CodecKind
        /// </summary>
        [DataMember(Name="CodecKind", EmitDefaultValue=false)]
        public CodecKinds CodecKind { get; set; }

        /// <summary>
        /// Gets or Sets MediaTypeName
        /// </summary>
        [DataMember(Name="MediaTypeName", EmitDefaultValue=false)]
        public string MediaTypeName { get; set; }

        /// <summary>
        /// Gets or Sets VideoMediaType
        /// </summary>
        [DataMember(Name="VideoMediaType", EmitDefaultValue=false)]
        public VideoMediaTypes VideoMediaType { get; set; }

        /// <summary>
        /// Gets or Sets MinWidth
        /// </summary>
        [DataMember(Name="MinWidth", EmitDefaultValue=false)]
        public int? MinWidth { get; set; }

        /// <summary>
        /// Gets or Sets MaxWidth
        /// </summary>
        [DataMember(Name="MaxWidth", EmitDefaultValue=false)]
        public int? MaxWidth { get; set; }

        /// <summary>
        /// Gets or Sets MinHeight
        /// </summary>
        [DataMember(Name="MinHeight", EmitDefaultValue=false)]
        public int? MinHeight { get; set; }

        /// <summary>
        /// Gets or Sets MaxHeight
        /// </summary>
        [DataMember(Name="MaxHeight", EmitDefaultValue=false)]
        public int? MaxHeight { get; set; }

        /// <summary>
        /// Gets or Sets WidthAlignment
        /// </summary>
        [DataMember(Name="WidthAlignment", EmitDefaultValue=false)]
        public int? WidthAlignment { get; set; }

        /// <summary>
        /// Gets or Sets HeightAlignment
        /// </summary>
        [DataMember(Name="HeightAlignment", EmitDefaultValue=false)]
        public int? HeightAlignment { get; set; }

        /// <summary>
        /// Gets or Sets MaxBitRate
        /// </summary>
        [DataMember(Name="MaxBitRate", EmitDefaultValue=false)]
        public BitRate MaxBitRate { get; set; }

        /// <summary>
        /// Gets or Sets SupportedColorFormats
        /// </summary>
        [DataMember(Name="SupportedColorFormats", EmitDefaultValue=false)]
        public List<ColorFormats> SupportedColorFormats { get; set; }

        /// <summary>
        /// Gets or Sets SupportedColorFormatStrings
        /// </summary>
        [DataMember(Name="SupportedColorFormatStrings", EmitDefaultValue=false)]
        public List<string> SupportedColorFormatStrings { get; set; }

        /// <summary>
        /// Gets or Sets ProfileAndLevelInformation
        /// </summary>
        [DataMember(Name="ProfileAndLevelInformation", EmitDefaultValue=false)]
        public List<ProfileLevelInformation> ProfileAndLevelInformation { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Direction
        /// </summary>
        [DataMember(Name="Direction", EmitDefaultValue=false)]
        public CodecDirections Direction { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name="Description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets FrameworkCodec
        /// </summary>
        [DataMember(Name="FrameworkCodec", EmitDefaultValue=false)]
        public string FrameworkCodec { get; set; }

        /// <summary>
        /// Gets or Sets IsHardwareCodec
        /// </summary>
        [DataMember(Name="IsHardwareCodec", EmitDefaultValue=false)]
        public bool? IsHardwareCodec { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryFramework
        /// </summary>
        [DataMember(Name="SecondaryFramework", EmitDefaultValue=false)]
        public SecondaryFrameworks SecondaryFramework { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryFrameworkCodec
        /// </summary>
        [DataMember(Name="SecondaryFrameworkCodec", EmitDefaultValue=false)]
        public string SecondaryFrameworkCodec { get; set; }

        /// <summary>
        /// Gets or Sets MaxInstanceCount
        /// </summary>
        [DataMember(Name="MaxInstanceCount", EmitDefaultValue=false)]
        public int? MaxInstanceCount { get; set; }

        /// <summary>
        /// Gets or Sets IsEnabledByDefault
        /// </summary>
        [DataMember(Name="IsEnabledByDefault", EmitDefaultValue=false)]
        public bool? IsEnabledByDefault { get; set; }

        /// <summary>
        /// Gets or Sets DefaultPriority
        /// </summary>
        [DataMember(Name="DefaultPriority", EmitDefaultValue=false)]
        public int? DefaultPriority { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VideoCodecBase {\n");
            sb.Append("  CodecDeviceInfo: ").Append(CodecDeviceInfo).Append("\n");
            sb.Append("  CodecKind: ").Append(CodecKind).Append("\n");
            sb.Append("  MediaTypeName: ").Append(MediaTypeName).Append("\n");
            sb.Append("  VideoMediaType: ").Append(VideoMediaType).Append("\n");
            sb.Append("  MinWidth: ").Append(MinWidth).Append("\n");
            sb.Append("  MaxWidth: ").Append(MaxWidth).Append("\n");
            sb.Append("  MinHeight: ").Append(MinHeight).Append("\n");
            sb.Append("  MaxHeight: ").Append(MaxHeight).Append("\n");
            sb.Append("  WidthAlignment: ").Append(WidthAlignment).Append("\n");
            sb.Append("  HeightAlignment: ").Append(HeightAlignment).Append("\n");
            sb.Append("  MaxBitRate: ").Append(MaxBitRate).Append("\n");
            sb.Append("  SupportedColorFormats: ").Append(SupportedColorFormats).Append("\n");
            sb.Append("  SupportedColorFormatStrings: ").Append(SupportedColorFormatStrings).Append("\n");
            sb.Append("  ProfileAndLevelInformation: ").Append(ProfileAndLevelInformation).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Direction: ").Append(Direction).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  FrameworkCodec: ").Append(FrameworkCodec).Append("\n");
            sb.Append("  IsHardwareCodec: ").Append(IsHardwareCodec).Append("\n");
            sb.Append("  SecondaryFramework: ").Append(SecondaryFramework).Append("\n");
            sb.Append("  SecondaryFrameworkCodec: ").Append(SecondaryFrameworkCodec).Append("\n");
            sb.Append("  MaxInstanceCount: ").Append(MaxInstanceCount).Append("\n");
            sb.Append("  IsEnabledByDefault: ").Append(IsEnabledByDefault).Append("\n");
            sb.Append("  DefaultPriority: ").Append(DefaultPriority).Append("\n");
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
            return this.Equals(input as VideoCodecBase);
        }

        /// <summary>
        /// Returns true if VideoCodecBase instances are equal
        /// </summary>
        /// <param name="input">Instance of VideoCodecBase to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VideoCodecBase input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CodecDeviceInfo == input.CodecDeviceInfo ||
                    (this.CodecDeviceInfo != null &&
                    this.CodecDeviceInfo.Equals(input.CodecDeviceInfo))
                ) && 
                (
                    this.CodecKind == input.CodecKind ||
                    (this.CodecKind != null &&
                    this.CodecKind.Equals(input.CodecKind))
                ) && 
                (
                    this.MediaTypeName == input.MediaTypeName ||
                    (this.MediaTypeName != null &&
                    this.MediaTypeName.Equals(input.MediaTypeName))
                ) && 
                (
                    this.VideoMediaType == input.VideoMediaType ||
                    (this.VideoMediaType != null &&
                    this.VideoMediaType.Equals(input.VideoMediaType))
                ) && 
                (
                    this.MinWidth == input.MinWidth ||
                    (this.MinWidth != null &&
                    this.MinWidth.Equals(input.MinWidth))
                ) && 
                (
                    this.MaxWidth == input.MaxWidth ||
                    (this.MaxWidth != null &&
                    this.MaxWidth.Equals(input.MaxWidth))
                ) && 
                (
                    this.MinHeight == input.MinHeight ||
                    (this.MinHeight != null &&
                    this.MinHeight.Equals(input.MinHeight))
                ) && 
                (
                    this.MaxHeight == input.MaxHeight ||
                    (this.MaxHeight != null &&
                    this.MaxHeight.Equals(input.MaxHeight))
                ) && 
                (
                    this.WidthAlignment == input.WidthAlignment ||
                    (this.WidthAlignment != null &&
                    this.WidthAlignment.Equals(input.WidthAlignment))
                ) && 
                (
                    this.HeightAlignment == input.HeightAlignment ||
                    (this.HeightAlignment != null &&
                    this.HeightAlignment.Equals(input.HeightAlignment))
                ) && 
                (
                    this.MaxBitRate == input.MaxBitRate ||
                    (this.MaxBitRate != null &&
                    this.MaxBitRate.Equals(input.MaxBitRate))
                ) && 
                (
                    this.SupportedColorFormats == input.SupportedColorFormats ||
                    this.SupportedColorFormats != null &&
                    input.SupportedColorFormats != null &&
                    this.SupportedColorFormats.SequenceEqual(input.SupportedColorFormats)
                ) && 
                (
                    this.SupportedColorFormatStrings == input.SupportedColorFormatStrings ||
                    this.SupportedColorFormatStrings != null &&
                    input.SupportedColorFormatStrings != null &&
                    this.SupportedColorFormatStrings.SequenceEqual(input.SupportedColorFormatStrings)
                ) && 
                (
                    this.ProfileAndLevelInformation == input.ProfileAndLevelInformation ||
                    this.ProfileAndLevelInformation != null &&
                    input.ProfileAndLevelInformation != null &&
                    this.ProfileAndLevelInformation.SequenceEqual(input.ProfileAndLevelInformation)
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Direction == input.Direction ||
                    (this.Direction != null &&
                    this.Direction.Equals(input.Direction))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.FrameworkCodec == input.FrameworkCodec ||
                    (this.FrameworkCodec != null &&
                    this.FrameworkCodec.Equals(input.FrameworkCodec))
                ) && 
                (
                    this.IsHardwareCodec == input.IsHardwareCodec ||
                    (this.IsHardwareCodec != null &&
                    this.IsHardwareCodec.Equals(input.IsHardwareCodec))
                ) && 
                (
                    this.SecondaryFramework == input.SecondaryFramework ||
                    (this.SecondaryFramework != null &&
                    this.SecondaryFramework.Equals(input.SecondaryFramework))
                ) && 
                (
                    this.SecondaryFrameworkCodec == input.SecondaryFrameworkCodec ||
                    (this.SecondaryFrameworkCodec != null &&
                    this.SecondaryFrameworkCodec.Equals(input.SecondaryFrameworkCodec))
                ) && 
                (
                    this.MaxInstanceCount == input.MaxInstanceCount ||
                    (this.MaxInstanceCount != null &&
                    this.MaxInstanceCount.Equals(input.MaxInstanceCount))
                ) && 
                (
                    this.IsEnabledByDefault == input.IsEnabledByDefault ||
                    (this.IsEnabledByDefault != null &&
                    this.IsEnabledByDefault.Equals(input.IsEnabledByDefault))
                ) && 
                (
                    this.DefaultPriority == input.DefaultPriority ||
                    (this.DefaultPriority != null &&
                    this.DefaultPriority.Equals(input.DefaultPriority))
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
                if (this.CodecDeviceInfo != null)
                    hashCode = hashCode * 59 + this.CodecDeviceInfo.GetHashCode();
                if (this.CodecKind != null)
                    hashCode = hashCode * 59 + this.CodecKind.GetHashCode();
                if (this.MediaTypeName != null)
                    hashCode = hashCode * 59 + this.MediaTypeName.GetHashCode();
                if (this.VideoMediaType != null)
                    hashCode = hashCode * 59 + this.VideoMediaType.GetHashCode();
                if (this.MinWidth != null)
                    hashCode = hashCode * 59 + this.MinWidth.GetHashCode();
                if (this.MaxWidth != null)
                    hashCode = hashCode * 59 + this.MaxWidth.GetHashCode();
                if (this.MinHeight != null)
                    hashCode = hashCode * 59 + this.MinHeight.GetHashCode();
                if (this.MaxHeight != null)
                    hashCode = hashCode * 59 + this.MaxHeight.GetHashCode();
                if (this.WidthAlignment != null)
                    hashCode = hashCode * 59 + this.WidthAlignment.GetHashCode();
                if (this.HeightAlignment != null)
                    hashCode = hashCode * 59 + this.HeightAlignment.GetHashCode();
                if (this.MaxBitRate != null)
                    hashCode = hashCode * 59 + this.MaxBitRate.GetHashCode();
                if (this.SupportedColorFormats != null)
                    hashCode = hashCode * 59 + this.SupportedColorFormats.GetHashCode();
                if (this.SupportedColorFormatStrings != null)
                    hashCode = hashCode * 59 + this.SupportedColorFormatStrings.GetHashCode();
                if (this.ProfileAndLevelInformation != null)
                    hashCode = hashCode * 59 + this.ProfileAndLevelInformation.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Direction != null)
                    hashCode = hashCode * 59 + this.Direction.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.FrameworkCodec != null)
                    hashCode = hashCode * 59 + this.FrameworkCodec.GetHashCode();
                if (this.IsHardwareCodec != null)
                    hashCode = hashCode * 59 + this.IsHardwareCodec.GetHashCode();
                if (this.SecondaryFramework != null)
                    hashCode = hashCode * 59 + this.SecondaryFramework.GetHashCode();
                if (this.SecondaryFrameworkCodec != null)
                    hashCode = hashCode * 59 + this.SecondaryFrameworkCodec.GetHashCode();
                if (this.MaxInstanceCount != null)
                    hashCode = hashCode * 59 + this.MaxInstanceCount.GetHashCode();
                if (this.IsEnabledByDefault != null)
                    hashCode = hashCode * 59 + this.IsEnabledByDefault.GetHashCode();
                if (this.DefaultPriority != null)
                    hashCode = hashCode * 59 + this.DefaultPriority.GetHashCode();
                return hashCode;
            }
        }

    }
}
