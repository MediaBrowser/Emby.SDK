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
    /// DlnaProfilesDlnaProfile
    /// </summary>
    [DataContract]
        public partial class DlnaProfilesDlnaProfile :  IEquatable<DlnaProfilesDlnaProfile>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DlnaProfilesDlnaProfile" /> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="path">path.</param>
        /// <param name="userId">userId.</param>
        /// <param name="albumArtPn">albumArtPn.</param>
        /// <param name="maxAlbumArtWidth">maxAlbumArtWidth.</param>
        /// <param name="maxAlbumArtHeight">maxAlbumArtHeight.</param>
        /// <param name="maxIconWidth">maxIconWidth.</param>
        /// <param name="maxIconHeight">maxIconHeight.</param>
        /// <param name="friendlyName">friendlyName.</param>
        /// <param name="manufacturer">manufacturer.</param>
        /// <param name="manufacturerUrl">manufacturerUrl.</param>
        /// <param name="modelName">modelName.</param>
        /// <param name="modelDescription">modelDescription.</param>
        /// <param name="modelNumber">modelNumber.</param>
        /// <param name="modelUrl">modelUrl.</param>
        /// <param name="serialNumber">serialNumber.</param>
        /// <param name="enableAlbumArtInDidl">enableAlbumArtInDidl.</param>
        /// <param name="enableSingleAlbumArtLimit">enableSingleAlbumArtLimit.</param>
        /// <param name="enableSingleSubtitleLimit">enableSingleSubtitleLimit.</param>
        /// <param name="protocolInfo">protocolInfo.</param>
        /// <param name="timelineOffsetSeconds">timelineOffsetSeconds.</param>
        /// <param name="requiresPlainVideoItems">requiresPlainVideoItems.</param>
        /// <param name="requiresPlainFolders">requiresPlainFolders.</param>
        /// <param name="ignoreTranscodeByteRangeRequests">ignoreTranscodeByteRangeRequests.</param>
        /// <param name="supportsSamsungBookmark">supportsSamsungBookmark.</param>
        /// <param name="identification">identification.</param>
        /// <param name="protocolInfoDetection">protocolInfoDetection.</param>
        /// <param name="name">The name..</param>
        /// <param name="id">id.</param>
        /// <param name="supportedMediaTypes">supportedMediaTypes.</param>
        /// <param name="maxStreamingBitrate">maxStreamingBitrate.</param>
        /// <param name="musicStreamingTranscodingBitrate">musicStreamingTranscodingBitrate.</param>
        /// <param name="maxStaticMusicBitrate">maxStaticMusicBitrate.</param>
        /// <param name="declaredFeatures">declaredFeatures.</param>
        /// <param name="directPlayProfiles">The direct play profiles..</param>
        /// <param name="transcodingProfiles">The transcoding profiles..</param>
        /// <param name="containerProfiles">containerProfiles.</param>
        /// <param name="codecProfiles">codecProfiles.</param>
        /// <param name="responseProfiles">responseProfiles.</param>
        /// <param name="subtitleProfiles">subtitleProfiles.</param>
        public DlnaProfilesDlnaProfile(DlnaProfilesDeviceProfileType type = default(DlnaProfilesDeviceProfileType), string path = default(string), string userId = default(string), string albumArtPn = default(string), int? maxAlbumArtWidth = default(int?), int? maxAlbumArtHeight = default(int?), int? maxIconWidth = default(int?), int? maxIconHeight = default(int?), string friendlyName = default(string), string manufacturer = default(string), string manufacturerUrl = default(string), string modelName = default(string), string modelDescription = default(string), string modelNumber = default(string), string modelUrl = default(string), string serialNumber = default(string), bool? enableAlbumArtInDidl = default(bool?), bool? enableSingleAlbumArtLimit = default(bool?), bool? enableSingleSubtitleLimit = default(bool?), string protocolInfo = default(string), int? timelineOffsetSeconds = default(int?), bool? requiresPlainVideoItems = default(bool?), bool? requiresPlainFolders = default(bool?), bool? ignoreTranscodeByteRangeRequests = default(bool?), bool? supportsSamsungBookmark = default(bool?), DlnaProfilesDeviceIdentification identification = default(DlnaProfilesDeviceIdentification), DlnaProfilesProtocolInfoDetection protocolInfoDetection = default(DlnaProfilesProtocolInfoDetection), string name = default(string), string id = default(string), string supportedMediaTypes = default(string), long? maxStreamingBitrate = default(long?), int? musicStreamingTranscodingBitrate = default(int?), int? maxStaticMusicBitrate = default(int?), List<string> declaredFeatures = default(List<string>), List<DirectPlayProfile> directPlayProfiles = default(List<DirectPlayProfile>), List<TranscodingProfile> transcodingProfiles = default(List<TranscodingProfile>), List<ContainerProfile> containerProfiles = default(List<ContainerProfile>), List<CodecProfile> codecProfiles = default(List<CodecProfile>), List<ResponseProfile> responseProfiles = default(List<ResponseProfile>), List<SubtitleProfile> subtitleProfiles = default(List<SubtitleProfile>))
        {
            this.Type = type;
            this.Path = path;
            this.UserId = userId;
            this.AlbumArtPn = albumArtPn;
            this.MaxAlbumArtWidth = maxAlbumArtWidth;
            this.MaxAlbumArtHeight = maxAlbumArtHeight;
            this.MaxIconWidth = maxIconWidth;
            this.MaxIconHeight = maxIconHeight;
            this.FriendlyName = friendlyName;
            this.Manufacturer = manufacturer;
            this.ManufacturerUrl = manufacturerUrl;
            this.ModelName = modelName;
            this.ModelDescription = modelDescription;
            this.ModelNumber = modelNumber;
            this.ModelUrl = modelUrl;
            this.SerialNumber = serialNumber;
            this.EnableAlbumArtInDidl = enableAlbumArtInDidl;
            this.EnableSingleAlbumArtLimit = enableSingleAlbumArtLimit;
            this.EnableSingleSubtitleLimit = enableSingleSubtitleLimit;
            this.ProtocolInfo = protocolInfo;
            this.TimelineOffsetSeconds = timelineOffsetSeconds;
            this.RequiresPlainVideoItems = requiresPlainVideoItems;
            this.RequiresPlainFolders = requiresPlainFolders;
            this.IgnoreTranscodeByteRangeRequests = ignoreTranscodeByteRangeRequests;
            this.SupportsSamsungBookmark = supportsSamsungBookmark;
            this.Identification = identification;
            this.ProtocolInfoDetection = protocolInfoDetection;
            this.Name = name;
            this.Id = id;
            this.SupportedMediaTypes = supportedMediaTypes;
            this.MaxStreamingBitrate = maxStreamingBitrate;
            this.MusicStreamingTranscodingBitrate = musicStreamingTranscodingBitrate;
            this.MaxStaticMusicBitrate = maxStaticMusicBitrate;
            this.DeclaredFeatures = declaredFeatures;
            this.DirectPlayProfiles = directPlayProfiles;
            this.TranscodingProfiles = transcodingProfiles;
            this.ContainerProfiles = containerProfiles;
            this.CodecProfiles = codecProfiles;
            this.ResponseProfiles = responseProfiles;
            this.SubtitleProfiles = subtitleProfiles;
        }
        
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public DlnaProfilesDeviceProfileType Type { get; set; }

        /// <summary>
        /// Gets or Sets Path
        /// </summary>
        [DataMember(Name="Path", EmitDefaultValue=false)]
        public string Path { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name="UserId", EmitDefaultValue=false)]
        public string UserId { get; set; }

        /// <summary>
        /// Gets or Sets AlbumArtPn
        /// </summary>
        [DataMember(Name="AlbumArtPn", EmitDefaultValue=false)]
        public string AlbumArtPn { get; set; }

        /// <summary>
        /// Gets or Sets MaxAlbumArtWidth
        /// </summary>
        [DataMember(Name="MaxAlbumArtWidth", EmitDefaultValue=false)]
        public int? MaxAlbumArtWidth { get; set; }

        /// <summary>
        /// Gets or Sets MaxAlbumArtHeight
        /// </summary>
        [DataMember(Name="MaxAlbumArtHeight", EmitDefaultValue=false)]
        public int? MaxAlbumArtHeight { get; set; }

        /// <summary>
        /// Gets or Sets MaxIconWidth
        /// </summary>
        [DataMember(Name="MaxIconWidth", EmitDefaultValue=false)]
        public int? MaxIconWidth { get; set; }

        /// <summary>
        /// Gets or Sets MaxIconHeight
        /// </summary>
        [DataMember(Name="MaxIconHeight", EmitDefaultValue=false)]
        public int? MaxIconHeight { get; set; }

        /// <summary>
        /// Gets or Sets FriendlyName
        /// </summary>
        [DataMember(Name="FriendlyName", EmitDefaultValue=false)]
        public string FriendlyName { get; set; }

        /// <summary>
        /// Gets or Sets Manufacturer
        /// </summary>
        [DataMember(Name="Manufacturer", EmitDefaultValue=false)]
        public string Manufacturer { get; set; }

        /// <summary>
        /// Gets or Sets ManufacturerUrl
        /// </summary>
        [DataMember(Name="ManufacturerUrl", EmitDefaultValue=false)]
        public string ManufacturerUrl { get; set; }

        /// <summary>
        /// Gets or Sets ModelName
        /// </summary>
        [DataMember(Name="ModelName", EmitDefaultValue=false)]
        public string ModelName { get; set; }

        /// <summary>
        /// Gets or Sets ModelDescription
        /// </summary>
        [DataMember(Name="ModelDescription", EmitDefaultValue=false)]
        public string ModelDescription { get; set; }

        /// <summary>
        /// Gets or Sets ModelNumber
        /// </summary>
        [DataMember(Name="ModelNumber", EmitDefaultValue=false)]
        public string ModelNumber { get; set; }

        /// <summary>
        /// Gets or Sets ModelUrl
        /// </summary>
        [DataMember(Name="ModelUrl", EmitDefaultValue=false)]
        public string ModelUrl { get; set; }

        /// <summary>
        /// Gets or Sets SerialNumber
        /// </summary>
        [DataMember(Name="SerialNumber", EmitDefaultValue=false)]
        public string SerialNumber { get; set; }

        /// <summary>
        /// Gets or Sets EnableAlbumArtInDidl
        /// </summary>
        [DataMember(Name="EnableAlbumArtInDidl", EmitDefaultValue=false)]
        public bool? EnableAlbumArtInDidl { get; set; }

        /// <summary>
        /// Gets or Sets EnableSingleAlbumArtLimit
        /// </summary>
        [DataMember(Name="EnableSingleAlbumArtLimit", EmitDefaultValue=false)]
        public bool? EnableSingleAlbumArtLimit { get; set; }

        /// <summary>
        /// Gets or Sets EnableSingleSubtitleLimit
        /// </summary>
        [DataMember(Name="EnableSingleSubtitleLimit", EmitDefaultValue=false)]
        public bool? EnableSingleSubtitleLimit { get; set; }

        /// <summary>
        /// Gets or Sets ProtocolInfo
        /// </summary>
        [DataMember(Name="ProtocolInfo", EmitDefaultValue=false)]
        public string ProtocolInfo { get; set; }

        /// <summary>
        /// Gets or Sets TimelineOffsetSeconds
        /// </summary>
        [DataMember(Name="TimelineOffsetSeconds", EmitDefaultValue=false)]
        public int? TimelineOffsetSeconds { get; set; }

        /// <summary>
        /// Gets or Sets RequiresPlainVideoItems
        /// </summary>
        [DataMember(Name="RequiresPlainVideoItems", EmitDefaultValue=false)]
        public bool? RequiresPlainVideoItems { get; set; }

        /// <summary>
        /// Gets or Sets RequiresPlainFolders
        /// </summary>
        [DataMember(Name="RequiresPlainFolders", EmitDefaultValue=false)]
        public bool? RequiresPlainFolders { get; set; }

        /// <summary>
        /// Gets or Sets IgnoreTranscodeByteRangeRequests
        /// </summary>
        [DataMember(Name="IgnoreTranscodeByteRangeRequests", EmitDefaultValue=false)]
        public bool? IgnoreTranscodeByteRangeRequests { get; set; }

        /// <summary>
        /// Gets or Sets SupportsSamsungBookmark
        /// </summary>
        [DataMember(Name="SupportsSamsungBookmark", EmitDefaultValue=false)]
        public bool? SupportsSamsungBookmark { get; set; }

        /// <summary>
        /// Gets or Sets Identification
        /// </summary>
        [DataMember(Name="Identification", EmitDefaultValue=false)]
        public DlnaProfilesDeviceIdentification Identification { get; set; }

        /// <summary>
        /// Gets or Sets ProtocolInfoDetection
        /// </summary>
        [DataMember(Name="ProtocolInfoDetection", EmitDefaultValue=false)]
        public DlnaProfilesProtocolInfoDetection ProtocolInfoDetection { get; set; }

        /// <summary>
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets SupportedMediaTypes
        /// </summary>
        [DataMember(Name="SupportedMediaTypes", EmitDefaultValue=false)]
        public string SupportedMediaTypes { get; set; }

        /// <summary>
        /// Gets or Sets MaxStreamingBitrate
        /// </summary>
        [DataMember(Name="MaxStreamingBitrate", EmitDefaultValue=false)]
        public long? MaxStreamingBitrate { get; set; }

        /// <summary>
        /// Gets or Sets MusicStreamingTranscodingBitrate
        /// </summary>
        [DataMember(Name="MusicStreamingTranscodingBitrate", EmitDefaultValue=false)]
        public int? MusicStreamingTranscodingBitrate { get; set; }

        /// <summary>
        /// Gets or Sets MaxStaticMusicBitrate
        /// </summary>
        [DataMember(Name="MaxStaticMusicBitrate", EmitDefaultValue=false)]
        public int? MaxStaticMusicBitrate { get; set; }

        /// <summary>
        /// Gets or Sets DeclaredFeatures
        /// </summary>
        [DataMember(Name="DeclaredFeatures", EmitDefaultValue=false)]
        public List<string> DeclaredFeatures { get; set; }

        /// <summary>
        /// The direct play profiles.
        /// </summary>
        /// <value>The direct play profiles.</value>
        [DataMember(Name="DirectPlayProfiles", EmitDefaultValue=false)]
        public List<DirectPlayProfile> DirectPlayProfiles { get; set; }

        /// <summary>
        /// The transcoding profiles.
        /// </summary>
        /// <value>The transcoding profiles.</value>
        [DataMember(Name="TranscodingProfiles", EmitDefaultValue=false)]
        public List<TranscodingProfile> TranscodingProfiles { get; set; }

        /// <summary>
        /// Gets or Sets ContainerProfiles
        /// </summary>
        [DataMember(Name="ContainerProfiles", EmitDefaultValue=false)]
        public List<ContainerProfile> ContainerProfiles { get; set; }

        /// <summary>
        /// Gets or Sets CodecProfiles
        /// </summary>
        [DataMember(Name="CodecProfiles", EmitDefaultValue=false)]
        public List<CodecProfile> CodecProfiles { get; set; }

        /// <summary>
        /// Gets or Sets ResponseProfiles
        /// </summary>
        [DataMember(Name="ResponseProfiles", EmitDefaultValue=false)]
        public List<ResponseProfile> ResponseProfiles { get; set; }

        /// <summary>
        /// Gets or Sets SubtitleProfiles
        /// </summary>
        [DataMember(Name="SubtitleProfiles", EmitDefaultValue=false)]
        public List<SubtitleProfile> SubtitleProfiles { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DlnaProfilesDlnaProfile {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  AlbumArtPn: ").Append(AlbumArtPn).Append("\n");
            sb.Append("  MaxAlbumArtWidth: ").Append(MaxAlbumArtWidth).Append("\n");
            sb.Append("  MaxAlbumArtHeight: ").Append(MaxAlbumArtHeight).Append("\n");
            sb.Append("  MaxIconWidth: ").Append(MaxIconWidth).Append("\n");
            sb.Append("  MaxIconHeight: ").Append(MaxIconHeight).Append("\n");
            sb.Append("  FriendlyName: ").Append(FriendlyName).Append("\n");
            sb.Append("  Manufacturer: ").Append(Manufacturer).Append("\n");
            sb.Append("  ManufacturerUrl: ").Append(ManufacturerUrl).Append("\n");
            sb.Append("  ModelName: ").Append(ModelName).Append("\n");
            sb.Append("  ModelDescription: ").Append(ModelDescription).Append("\n");
            sb.Append("  ModelNumber: ").Append(ModelNumber).Append("\n");
            sb.Append("  ModelUrl: ").Append(ModelUrl).Append("\n");
            sb.Append("  SerialNumber: ").Append(SerialNumber).Append("\n");
            sb.Append("  EnableAlbumArtInDidl: ").Append(EnableAlbumArtInDidl).Append("\n");
            sb.Append("  EnableSingleAlbumArtLimit: ").Append(EnableSingleAlbumArtLimit).Append("\n");
            sb.Append("  EnableSingleSubtitleLimit: ").Append(EnableSingleSubtitleLimit).Append("\n");
            sb.Append("  ProtocolInfo: ").Append(ProtocolInfo).Append("\n");
            sb.Append("  TimelineOffsetSeconds: ").Append(TimelineOffsetSeconds).Append("\n");
            sb.Append("  RequiresPlainVideoItems: ").Append(RequiresPlainVideoItems).Append("\n");
            sb.Append("  RequiresPlainFolders: ").Append(RequiresPlainFolders).Append("\n");
            sb.Append("  IgnoreTranscodeByteRangeRequests: ").Append(IgnoreTranscodeByteRangeRequests).Append("\n");
            sb.Append("  SupportsSamsungBookmark: ").Append(SupportsSamsungBookmark).Append("\n");
            sb.Append("  Identification: ").Append(Identification).Append("\n");
            sb.Append("  ProtocolInfoDetection: ").Append(ProtocolInfoDetection).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  SupportedMediaTypes: ").Append(SupportedMediaTypes).Append("\n");
            sb.Append("  MaxStreamingBitrate: ").Append(MaxStreamingBitrate).Append("\n");
            sb.Append("  MusicStreamingTranscodingBitrate: ").Append(MusicStreamingTranscodingBitrate).Append("\n");
            sb.Append("  MaxStaticMusicBitrate: ").Append(MaxStaticMusicBitrate).Append("\n");
            sb.Append("  DeclaredFeatures: ").Append(DeclaredFeatures).Append("\n");
            sb.Append("  DirectPlayProfiles: ").Append(DirectPlayProfiles).Append("\n");
            sb.Append("  TranscodingProfiles: ").Append(TranscodingProfiles).Append("\n");
            sb.Append("  ContainerProfiles: ").Append(ContainerProfiles).Append("\n");
            sb.Append("  CodecProfiles: ").Append(CodecProfiles).Append("\n");
            sb.Append("  ResponseProfiles: ").Append(ResponseProfiles).Append("\n");
            sb.Append("  SubtitleProfiles: ").Append(SubtitleProfiles).Append("\n");
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
            return this.Equals(input as DlnaProfilesDlnaProfile);
        }

        /// <summary>
        /// Returns true if DlnaProfilesDlnaProfile instances are equal
        /// </summary>
        /// <param name="input">Instance of DlnaProfilesDlnaProfile to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DlnaProfilesDlnaProfile input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Path == input.Path ||
                    (this.Path != null &&
                    this.Path.Equals(input.Path))
                ) && 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.AlbumArtPn == input.AlbumArtPn ||
                    (this.AlbumArtPn != null &&
                    this.AlbumArtPn.Equals(input.AlbumArtPn))
                ) && 
                (
                    this.MaxAlbumArtWidth == input.MaxAlbumArtWidth ||
                    (this.MaxAlbumArtWidth != null &&
                    this.MaxAlbumArtWidth.Equals(input.MaxAlbumArtWidth))
                ) && 
                (
                    this.MaxAlbumArtHeight == input.MaxAlbumArtHeight ||
                    (this.MaxAlbumArtHeight != null &&
                    this.MaxAlbumArtHeight.Equals(input.MaxAlbumArtHeight))
                ) && 
                (
                    this.MaxIconWidth == input.MaxIconWidth ||
                    (this.MaxIconWidth != null &&
                    this.MaxIconWidth.Equals(input.MaxIconWidth))
                ) && 
                (
                    this.MaxIconHeight == input.MaxIconHeight ||
                    (this.MaxIconHeight != null &&
                    this.MaxIconHeight.Equals(input.MaxIconHeight))
                ) && 
                (
                    this.FriendlyName == input.FriendlyName ||
                    (this.FriendlyName != null &&
                    this.FriendlyName.Equals(input.FriendlyName))
                ) && 
                (
                    this.Manufacturer == input.Manufacturer ||
                    (this.Manufacturer != null &&
                    this.Manufacturer.Equals(input.Manufacturer))
                ) && 
                (
                    this.ManufacturerUrl == input.ManufacturerUrl ||
                    (this.ManufacturerUrl != null &&
                    this.ManufacturerUrl.Equals(input.ManufacturerUrl))
                ) && 
                (
                    this.ModelName == input.ModelName ||
                    (this.ModelName != null &&
                    this.ModelName.Equals(input.ModelName))
                ) && 
                (
                    this.ModelDescription == input.ModelDescription ||
                    (this.ModelDescription != null &&
                    this.ModelDescription.Equals(input.ModelDescription))
                ) && 
                (
                    this.ModelNumber == input.ModelNumber ||
                    (this.ModelNumber != null &&
                    this.ModelNumber.Equals(input.ModelNumber))
                ) && 
                (
                    this.ModelUrl == input.ModelUrl ||
                    (this.ModelUrl != null &&
                    this.ModelUrl.Equals(input.ModelUrl))
                ) && 
                (
                    this.SerialNumber == input.SerialNumber ||
                    (this.SerialNumber != null &&
                    this.SerialNumber.Equals(input.SerialNumber))
                ) && 
                (
                    this.EnableAlbumArtInDidl == input.EnableAlbumArtInDidl ||
                    (this.EnableAlbumArtInDidl != null &&
                    this.EnableAlbumArtInDidl.Equals(input.EnableAlbumArtInDidl))
                ) && 
                (
                    this.EnableSingleAlbumArtLimit == input.EnableSingleAlbumArtLimit ||
                    (this.EnableSingleAlbumArtLimit != null &&
                    this.EnableSingleAlbumArtLimit.Equals(input.EnableSingleAlbumArtLimit))
                ) && 
                (
                    this.EnableSingleSubtitleLimit == input.EnableSingleSubtitleLimit ||
                    (this.EnableSingleSubtitleLimit != null &&
                    this.EnableSingleSubtitleLimit.Equals(input.EnableSingleSubtitleLimit))
                ) && 
                (
                    this.ProtocolInfo == input.ProtocolInfo ||
                    (this.ProtocolInfo != null &&
                    this.ProtocolInfo.Equals(input.ProtocolInfo))
                ) && 
                (
                    this.TimelineOffsetSeconds == input.TimelineOffsetSeconds ||
                    (this.TimelineOffsetSeconds != null &&
                    this.TimelineOffsetSeconds.Equals(input.TimelineOffsetSeconds))
                ) && 
                (
                    this.RequiresPlainVideoItems == input.RequiresPlainVideoItems ||
                    (this.RequiresPlainVideoItems != null &&
                    this.RequiresPlainVideoItems.Equals(input.RequiresPlainVideoItems))
                ) && 
                (
                    this.RequiresPlainFolders == input.RequiresPlainFolders ||
                    (this.RequiresPlainFolders != null &&
                    this.RequiresPlainFolders.Equals(input.RequiresPlainFolders))
                ) && 
                (
                    this.IgnoreTranscodeByteRangeRequests == input.IgnoreTranscodeByteRangeRequests ||
                    (this.IgnoreTranscodeByteRangeRequests != null &&
                    this.IgnoreTranscodeByteRangeRequests.Equals(input.IgnoreTranscodeByteRangeRequests))
                ) && 
                (
                    this.SupportsSamsungBookmark == input.SupportsSamsungBookmark ||
                    (this.SupportsSamsungBookmark != null &&
                    this.SupportsSamsungBookmark.Equals(input.SupportsSamsungBookmark))
                ) && 
                (
                    this.Identification == input.Identification ||
                    (this.Identification != null &&
                    this.Identification.Equals(input.Identification))
                ) && 
                (
                    this.ProtocolInfoDetection == input.ProtocolInfoDetection ||
                    (this.ProtocolInfoDetection != null &&
                    this.ProtocolInfoDetection.Equals(input.ProtocolInfoDetection))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.SupportedMediaTypes == input.SupportedMediaTypes ||
                    (this.SupportedMediaTypes != null &&
                    this.SupportedMediaTypes.Equals(input.SupportedMediaTypes))
                ) && 
                (
                    this.MaxStreamingBitrate == input.MaxStreamingBitrate ||
                    (this.MaxStreamingBitrate != null &&
                    this.MaxStreamingBitrate.Equals(input.MaxStreamingBitrate))
                ) && 
                (
                    this.MusicStreamingTranscodingBitrate == input.MusicStreamingTranscodingBitrate ||
                    (this.MusicStreamingTranscodingBitrate != null &&
                    this.MusicStreamingTranscodingBitrate.Equals(input.MusicStreamingTranscodingBitrate))
                ) && 
                (
                    this.MaxStaticMusicBitrate == input.MaxStaticMusicBitrate ||
                    (this.MaxStaticMusicBitrate != null &&
                    this.MaxStaticMusicBitrate.Equals(input.MaxStaticMusicBitrate))
                ) && 
                (
                    this.DeclaredFeatures == input.DeclaredFeatures ||
                    this.DeclaredFeatures != null &&
                    input.DeclaredFeatures != null &&
                    this.DeclaredFeatures.SequenceEqual(input.DeclaredFeatures)
                ) && 
                (
                    this.DirectPlayProfiles == input.DirectPlayProfiles ||
                    this.DirectPlayProfiles != null &&
                    input.DirectPlayProfiles != null &&
                    this.DirectPlayProfiles.SequenceEqual(input.DirectPlayProfiles)
                ) && 
                (
                    this.TranscodingProfiles == input.TranscodingProfiles ||
                    this.TranscodingProfiles != null &&
                    input.TranscodingProfiles != null &&
                    this.TranscodingProfiles.SequenceEqual(input.TranscodingProfiles)
                ) && 
                (
                    this.ContainerProfiles == input.ContainerProfiles ||
                    this.ContainerProfiles != null &&
                    input.ContainerProfiles != null &&
                    this.ContainerProfiles.SequenceEqual(input.ContainerProfiles)
                ) && 
                (
                    this.CodecProfiles == input.CodecProfiles ||
                    this.CodecProfiles != null &&
                    input.CodecProfiles != null &&
                    this.CodecProfiles.SequenceEqual(input.CodecProfiles)
                ) && 
                (
                    this.ResponseProfiles == input.ResponseProfiles ||
                    this.ResponseProfiles != null &&
                    input.ResponseProfiles != null &&
                    this.ResponseProfiles.SequenceEqual(input.ResponseProfiles)
                ) && 
                (
                    this.SubtitleProfiles == input.SubtitleProfiles ||
                    this.SubtitleProfiles != null &&
                    input.SubtitleProfiles != null &&
                    this.SubtitleProfiles.SequenceEqual(input.SubtitleProfiles)
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
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.Path != null)
                    hashCode = hashCode * 59 + this.Path.GetHashCode();
                if (this.UserId != null)
                    hashCode = hashCode * 59 + this.UserId.GetHashCode();
                if (this.AlbumArtPn != null)
                    hashCode = hashCode * 59 + this.AlbumArtPn.GetHashCode();
                if (this.MaxAlbumArtWidth != null)
                    hashCode = hashCode * 59 + this.MaxAlbumArtWidth.GetHashCode();
                if (this.MaxAlbumArtHeight != null)
                    hashCode = hashCode * 59 + this.MaxAlbumArtHeight.GetHashCode();
                if (this.MaxIconWidth != null)
                    hashCode = hashCode * 59 + this.MaxIconWidth.GetHashCode();
                if (this.MaxIconHeight != null)
                    hashCode = hashCode * 59 + this.MaxIconHeight.GetHashCode();
                if (this.FriendlyName != null)
                    hashCode = hashCode * 59 + this.FriendlyName.GetHashCode();
                if (this.Manufacturer != null)
                    hashCode = hashCode * 59 + this.Manufacturer.GetHashCode();
                if (this.ManufacturerUrl != null)
                    hashCode = hashCode * 59 + this.ManufacturerUrl.GetHashCode();
                if (this.ModelName != null)
                    hashCode = hashCode * 59 + this.ModelName.GetHashCode();
                if (this.ModelDescription != null)
                    hashCode = hashCode * 59 + this.ModelDescription.GetHashCode();
                if (this.ModelNumber != null)
                    hashCode = hashCode * 59 + this.ModelNumber.GetHashCode();
                if (this.ModelUrl != null)
                    hashCode = hashCode * 59 + this.ModelUrl.GetHashCode();
                if (this.SerialNumber != null)
                    hashCode = hashCode * 59 + this.SerialNumber.GetHashCode();
                if (this.EnableAlbumArtInDidl != null)
                    hashCode = hashCode * 59 + this.EnableAlbumArtInDidl.GetHashCode();
                if (this.EnableSingleAlbumArtLimit != null)
                    hashCode = hashCode * 59 + this.EnableSingleAlbumArtLimit.GetHashCode();
                if (this.EnableSingleSubtitleLimit != null)
                    hashCode = hashCode * 59 + this.EnableSingleSubtitleLimit.GetHashCode();
                if (this.ProtocolInfo != null)
                    hashCode = hashCode * 59 + this.ProtocolInfo.GetHashCode();
                if (this.TimelineOffsetSeconds != null)
                    hashCode = hashCode * 59 + this.TimelineOffsetSeconds.GetHashCode();
                if (this.RequiresPlainVideoItems != null)
                    hashCode = hashCode * 59 + this.RequiresPlainVideoItems.GetHashCode();
                if (this.RequiresPlainFolders != null)
                    hashCode = hashCode * 59 + this.RequiresPlainFolders.GetHashCode();
                if (this.IgnoreTranscodeByteRangeRequests != null)
                    hashCode = hashCode * 59 + this.IgnoreTranscodeByteRangeRequests.GetHashCode();
                if (this.SupportsSamsungBookmark != null)
                    hashCode = hashCode * 59 + this.SupportsSamsungBookmark.GetHashCode();
                if (this.Identification != null)
                    hashCode = hashCode * 59 + this.Identification.GetHashCode();
                if (this.ProtocolInfoDetection != null)
                    hashCode = hashCode * 59 + this.ProtocolInfoDetection.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.SupportedMediaTypes != null)
                    hashCode = hashCode * 59 + this.SupportedMediaTypes.GetHashCode();
                if (this.MaxStreamingBitrate != null)
                    hashCode = hashCode * 59 + this.MaxStreamingBitrate.GetHashCode();
                if (this.MusicStreamingTranscodingBitrate != null)
                    hashCode = hashCode * 59 + this.MusicStreamingTranscodingBitrate.GetHashCode();
                if (this.MaxStaticMusicBitrate != null)
                    hashCode = hashCode * 59 + this.MaxStaticMusicBitrate.GetHashCode();
                if (this.DeclaredFeatures != null)
                    hashCode = hashCode * 59 + this.DeclaredFeatures.GetHashCode();
                if (this.DirectPlayProfiles != null)
                    hashCode = hashCode * 59 + this.DirectPlayProfiles.GetHashCode();
                if (this.TranscodingProfiles != null)
                    hashCode = hashCode * 59 + this.TranscodingProfiles.GetHashCode();
                if (this.ContainerProfiles != null)
                    hashCode = hashCode * 59 + this.ContainerProfiles.GetHashCode();
                if (this.CodecProfiles != null)
                    hashCode = hashCode * 59 + this.CodecProfiles.GetHashCode();
                if (this.ResponseProfiles != null)
                    hashCode = hashCode * 59 + this.ResponseProfiles.GetHashCode();
                if (this.SubtitleProfiles != null)
                    hashCode = hashCode * 59 + this.SubtitleProfiles.GetHashCode();
                return hashCode;
            }
        }

    }
}
