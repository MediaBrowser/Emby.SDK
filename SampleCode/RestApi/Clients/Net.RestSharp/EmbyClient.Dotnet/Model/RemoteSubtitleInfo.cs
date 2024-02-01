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
    /// RemoteSubtitleInfo
    /// </summary>
    [DataContract]
        public partial class RemoteSubtitleInfo :  IEquatable<RemoteSubtitleInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RemoteSubtitleInfo" /> class.
        /// </summary>
        /// <param name="threeLetterISOLanguageName">Use language instead to return the language specified by the subtitle provider.</param>
        /// <param name="id">id.</param>
        /// <param name="providerName">providerName.</param>
        /// <param name="name">name.</param>
        /// <param name="format">format.</param>
        /// <param name="author">author.</param>
        /// <param name="comment">comment.</param>
        /// <param name="dateCreated">dateCreated.</param>
        /// <param name="communityRating">communityRating.</param>
        /// <param name="downloadCount">downloadCount.</param>
        /// <param name="isHashMatch">isHashMatch.</param>
        /// <param name="isForced">isForced.</param>
        /// <param name="isHearingImpaired">isHearingImpaired.</param>
        /// <param name="language">language.</param>
        public RemoteSubtitleInfo(string threeLetterISOLanguageName = default(string), string id = default(string), string providerName = default(string), string name = default(string), string format = default(string), string author = default(string), string comment = default(string), DateTimeOffset? dateCreated = default(DateTimeOffset?), float? communityRating = default(float?), int? downloadCount = default(int?), bool? isHashMatch = default(bool?), bool? isForced = default(bool?), bool? isHearingImpaired = default(bool?), string language = default(string))
        {
            this.ThreeLetterISOLanguageName = threeLetterISOLanguageName;
            this.Id = id;
            this.ProviderName = providerName;
            this.Name = name;
            this.Format = format;
            this.Author = author;
            this.Comment = comment;
            this.DateCreated = dateCreated;
            this.CommunityRating = communityRating;
            this.DownloadCount = downloadCount;
            this.IsHashMatch = isHashMatch;
            this.IsForced = isForced;
            this.IsHearingImpaired = isHearingImpaired;
            this.Language = language;
        }
        
        /// <summary>
        /// Use language instead to return the language specified by the subtitle provider
        /// </summary>
        /// <value>Use language instead to return the language specified by the subtitle provider</value>
        [DataMember(Name="ThreeLetterISOLanguageName", EmitDefaultValue=false)]
        public string ThreeLetterISOLanguageName { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets ProviderName
        /// </summary>
        [DataMember(Name="ProviderName", EmitDefaultValue=false)]
        public string ProviderName { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Format
        /// </summary>
        [DataMember(Name="Format", EmitDefaultValue=false)]
        public string Format { get; set; }

        /// <summary>
        /// Gets or Sets Author
        /// </summary>
        [DataMember(Name="Author", EmitDefaultValue=false)]
        public string Author { get; set; }

        /// <summary>
        /// Gets or Sets Comment
        /// </summary>
        [DataMember(Name="Comment", EmitDefaultValue=false)]
        public string Comment { get; set; }

        /// <summary>
        /// Gets or Sets DateCreated
        /// </summary>
        [DataMember(Name="DateCreated", EmitDefaultValue=false)]
        public DateTimeOffset? DateCreated { get; set; }

        /// <summary>
        /// Gets or Sets CommunityRating
        /// </summary>
        [DataMember(Name="CommunityRating", EmitDefaultValue=false)]
        public float? CommunityRating { get; set; }

        /// <summary>
        /// Gets or Sets DownloadCount
        /// </summary>
        [DataMember(Name="DownloadCount", EmitDefaultValue=false)]
        public int? DownloadCount { get; set; }

        /// <summary>
        /// Gets or Sets IsHashMatch
        /// </summary>
        [DataMember(Name="IsHashMatch", EmitDefaultValue=false)]
        public bool? IsHashMatch { get; set; }

        /// <summary>
        /// Gets or Sets IsForced
        /// </summary>
        [DataMember(Name="IsForced", EmitDefaultValue=false)]
        public bool? IsForced { get; set; }

        /// <summary>
        /// Gets or Sets IsHearingImpaired
        /// </summary>
        [DataMember(Name="IsHearingImpaired", EmitDefaultValue=false)]
        public bool? IsHearingImpaired { get; set; }

        /// <summary>
        /// Gets or Sets Language
        /// </summary>
        [DataMember(Name="Language", EmitDefaultValue=false)]
        public string Language { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RemoteSubtitleInfo {\n");
            sb.Append("  ThreeLetterISOLanguageName: ").Append(ThreeLetterISOLanguageName).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ProviderName: ").Append(ProviderName).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Format: ").Append(Format).Append("\n");
            sb.Append("  Author: ").Append(Author).Append("\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
            sb.Append("  DateCreated: ").Append(DateCreated).Append("\n");
            sb.Append("  CommunityRating: ").Append(CommunityRating).Append("\n");
            sb.Append("  DownloadCount: ").Append(DownloadCount).Append("\n");
            sb.Append("  IsHashMatch: ").Append(IsHashMatch).Append("\n");
            sb.Append("  IsForced: ").Append(IsForced).Append("\n");
            sb.Append("  IsHearingImpaired: ").Append(IsHearingImpaired).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
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
            return this.Equals(input as RemoteSubtitleInfo);
        }

        /// <summary>
        /// Returns true if RemoteSubtitleInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of RemoteSubtitleInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RemoteSubtitleInfo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ThreeLetterISOLanguageName == input.ThreeLetterISOLanguageName ||
                    (this.ThreeLetterISOLanguageName != null &&
                    this.ThreeLetterISOLanguageName.Equals(input.ThreeLetterISOLanguageName))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.ProviderName == input.ProviderName ||
                    (this.ProviderName != null &&
                    this.ProviderName.Equals(input.ProviderName))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Format == input.Format ||
                    (this.Format != null &&
                    this.Format.Equals(input.Format))
                ) && 
                (
                    this.Author == input.Author ||
                    (this.Author != null &&
                    this.Author.Equals(input.Author))
                ) && 
                (
                    this.Comment == input.Comment ||
                    (this.Comment != null &&
                    this.Comment.Equals(input.Comment))
                ) && 
                (
                    this.DateCreated == input.DateCreated ||
                    (this.DateCreated != null &&
                    this.DateCreated.Equals(input.DateCreated))
                ) && 
                (
                    this.CommunityRating == input.CommunityRating ||
                    (this.CommunityRating != null &&
                    this.CommunityRating.Equals(input.CommunityRating))
                ) && 
                (
                    this.DownloadCount == input.DownloadCount ||
                    (this.DownloadCount != null &&
                    this.DownloadCount.Equals(input.DownloadCount))
                ) && 
                (
                    this.IsHashMatch == input.IsHashMatch ||
                    (this.IsHashMatch != null &&
                    this.IsHashMatch.Equals(input.IsHashMatch))
                ) && 
                (
                    this.IsForced == input.IsForced ||
                    (this.IsForced != null &&
                    this.IsForced.Equals(input.IsForced))
                ) && 
                (
                    this.IsHearingImpaired == input.IsHearingImpaired ||
                    (this.IsHearingImpaired != null &&
                    this.IsHearingImpaired.Equals(input.IsHearingImpaired))
                ) && 
                (
                    this.Language == input.Language ||
                    (this.Language != null &&
                    this.Language.Equals(input.Language))
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
                if (this.ThreeLetterISOLanguageName != null)
                    hashCode = hashCode * 59 + this.ThreeLetterISOLanguageName.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.ProviderName != null)
                    hashCode = hashCode * 59 + this.ProviderName.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Format != null)
                    hashCode = hashCode * 59 + this.Format.GetHashCode();
                if (this.Author != null)
                    hashCode = hashCode * 59 + this.Author.GetHashCode();
                if (this.Comment != null)
                    hashCode = hashCode * 59 + this.Comment.GetHashCode();
                if (this.DateCreated != null)
                    hashCode = hashCode * 59 + this.DateCreated.GetHashCode();
                if (this.CommunityRating != null)
                    hashCode = hashCode * 59 + this.CommunityRating.GetHashCode();
                if (this.DownloadCount != null)
                    hashCode = hashCode * 59 + this.DownloadCount.GetHashCode();
                if (this.IsHashMatch != null)
                    hashCode = hashCode * 59 + this.IsHashMatch.GetHashCode();
                if (this.IsForced != null)
                    hashCode = hashCode * 59 + this.IsForced.GetHashCode();
                if (this.IsHearingImpaired != null)
                    hashCode = hashCode * 59 + this.IsHearingImpaired.GetHashCode();
                if (this.Language != null)
                    hashCode = hashCode * 59 + this.Language.GetHashCode();
                return hashCode;
            }
        }

    }
}
