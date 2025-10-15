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
    /// Class User  
    /// </summary>
    [DataContract]
        public partial class EntitiesUser :  IEquatable<EntitiesUser>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EntitiesUser" /> class.
        /// </summary>
        /// <param name="usesIdForConfigurationPath">From now on all user paths will be Id\\-based. This is for backwards compatibility..</param>
        /// <param name="password">The password..</param>
        /// <param name="easyPassword">easyPassword.</param>
        /// <param name="salt">salt.</param>
        /// <param name="connectUserName">connectUserName.</param>
        /// <param name="connectUserId">connectUserId.</param>
        /// <param name="connectLinkType">connectLinkType.</param>
        /// <param name="connectAccessKey">connectAccessKey.</param>
        /// <param name="imageInfos">imageInfos.</param>
        /// <param name="name">The name..</param>
        /// <param name="lastLoginDate">The last login date..</param>
        /// <param name="lastActivityDate">The last activity date..</param>
        /// <param name="playedPercentage">playedPercentage.</param>
        /// <param name="recursiveChildCountEqualsChildCount">recursiveChildCountEqualsChildCount.</param>
        /// <param name="originalParsedName">Internal use only.</param>
        /// <param name="isNameParsedFromFolder">Internal use only.</param>
        /// <param name="dateCreated">The date created..</param>
        /// <param name="importedCollections">importedCollections.</param>
        /// <param name="resolvedPresentationUniqueKey">resolvedPresentationUniqueKey.</param>
        public EntitiesUser(bool? usesIdForConfigurationPath = default(bool?), string password = default(string), string easyPassword = default(string), string salt = default(string), string connectUserName = default(string), string connectUserId = default(string), ConnectUserLinkType connectLinkType = default(ConnectUserLinkType), string connectAccessKey = default(string), List<EntitiesItemImageInfo> imageInfos = default(List<EntitiesItemImageInfo>), string name = default(string), DateTimeOffset? lastLoginDate = default(DateTimeOffset?), DateTimeOffset? lastActivityDate = default(DateTimeOffset?), double? playedPercentage = default(double?), bool? recursiveChildCountEqualsChildCount = default(bool?), string originalParsedName = default(string), bool? isNameParsedFromFolder = default(bool?), DateTimeOffset? dateCreated = default(DateTimeOffset?), List<LinkedItemInfo> importedCollections = default(List<LinkedItemInfo>), string resolvedPresentationUniqueKey = default(string))
        {
            this.UsesIdForConfigurationPath = usesIdForConfigurationPath;
            this.Password = password;
            this.EasyPassword = easyPassword;
            this.Salt = salt;
            this.ConnectUserName = connectUserName;
            this.ConnectUserId = connectUserId;
            this.ConnectLinkType = connectLinkType;
            this.ConnectAccessKey = connectAccessKey;
            this.ImageInfos = imageInfos;
            this.Name = name;
            this.LastLoginDate = lastLoginDate;
            this.LastActivityDate = lastActivityDate;
            this.PlayedPercentage = playedPercentage;
            this.RecursiveChildCountEqualsChildCount = recursiveChildCountEqualsChildCount;
            this.OriginalParsedName = originalParsedName;
            this.IsNameParsedFromFolder = isNameParsedFromFolder;
            this.DateCreated = dateCreated;
            this.ImportedCollections = importedCollections;
            this.ResolvedPresentationUniqueKey = resolvedPresentationUniqueKey;
        }
        
        /// <summary>
        /// From now on all user paths will be Id\\-based. This is for backwards compatibility.
        /// </summary>
        /// <value>From now on all user paths will be Id\\-based. This is for backwards compatibility.</value>
        [DataMember(Name="UsesIdForConfigurationPath", EmitDefaultValue=false)]
        public bool? UsesIdForConfigurationPath { get; set; }

        /// <summary>
        /// The password.
        /// </summary>
        /// <value>The password.</value>
        [DataMember(Name="Password", EmitDefaultValue=false)]
        public string Password { get; set; }

        /// <summary>
        /// Gets or Sets EasyPassword
        /// </summary>
        [DataMember(Name="EasyPassword", EmitDefaultValue=false)]
        public string EasyPassword { get; set; }

        /// <summary>
        /// Gets or Sets Salt
        /// </summary>
        [DataMember(Name="Salt", EmitDefaultValue=false)]
        public string Salt { get; set; }

        /// <summary>
        /// Gets or Sets ConnectUserName
        /// </summary>
        [DataMember(Name="ConnectUserName", EmitDefaultValue=false)]
        public string ConnectUserName { get; set; }

        /// <summary>
        /// Gets or Sets ConnectUserId
        /// </summary>
        [DataMember(Name="ConnectUserId", EmitDefaultValue=false)]
        public string ConnectUserId { get; set; }

        /// <summary>
        /// Gets or Sets ConnectLinkType
        /// </summary>
        [DataMember(Name="ConnectLinkType", EmitDefaultValue=false)]
        public ConnectUserLinkType ConnectLinkType { get; set; }

        /// <summary>
        /// Gets or Sets ConnectAccessKey
        /// </summary>
        [DataMember(Name="ConnectAccessKey", EmitDefaultValue=false)]
        public string ConnectAccessKey { get; set; }

        /// <summary>
        /// Gets or Sets ImageInfos
        /// </summary>
        [DataMember(Name="ImageInfos", EmitDefaultValue=false)]
        public List<EntitiesItemImageInfo> ImageInfos { get; set; }

        /// <summary>
        /// The name.
        /// </summary>
        /// <value>The name.</value>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The last login date.
        /// </summary>
        /// <value>The last login date.</value>
        [DataMember(Name="LastLoginDate", EmitDefaultValue=false)]
        public DateTimeOffset? LastLoginDate { get; set; }

        /// <summary>
        /// The last activity date.
        /// </summary>
        /// <value>The last activity date.</value>
        [DataMember(Name="LastActivityDate", EmitDefaultValue=false)]
        public DateTimeOffset? LastActivityDate { get; set; }

        /// <summary>
        /// Gets or Sets PlayedPercentage
        /// </summary>
        [DataMember(Name="PlayedPercentage", EmitDefaultValue=false)]
        public double? PlayedPercentage { get; set; }

        /// <summary>
        /// Gets or Sets RecursiveChildCountEqualsChildCount
        /// </summary>
        [DataMember(Name="RecursiveChildCountEqualsChildCount", EmitDefaultValue=false)]
        public bool? RecursiveChildCountEqualsChildCount { get; set; }

        /// <summary>
        /// Internal use only
        /// </summary>
        /// <value>Internal use only</value>
        [DataMember(Name="OriginalParsedName", EmitDefaultValue=false)]
        public string OriginalParsedName { get; set; }

        /// <summary>
        /// Internal use only
        /// </summary>
        /// <value>Internal use only</value>
        [DataMember(Name="IsNameParsedFromFolder", EmitDefaultValue=false)]
        public bool? IsNameParsedFromFolder { get; set; }

        /// <summary>
        /// The date created.
        /// </summary>
        /// <value>The date created.</value>
        [DataMember(Name="DateCreated", EmitDefaultValue=false)]
        public DateTimeOffset? DateCreated { get; set; }

        /// <summary>
        /// Gets or Sets ImportedCollections
        /// </summary>
        [DataMember(Name="ImportedCollections", EmitDefaultValue=false)]
        public List<LinkedItemInfo> ImportedCollections { get; set; }

        /// <summary>
        /// Gets or Sets ResolvedPresentationUniqueKey
        /// </summary>
        [DataMember(Name="ResolvedPresentationUniqueKey", EmitDefaultValue=false)]
        public string ResolvedPresentationUniqueKey { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EntitiesUser {\n");
            sb.Append("  UsesIdForConfigurationPath: ").Append(UsesIdForConfigurationPath).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  EasyPassword: ").Append(EasyPassword).Append("\n");
            sb.Append("  Salt: ").Append(Salt).Append("\n");
            sb.Append("  ConnectUserName: ").Append(ConnectUserName).Append("\n");
            sb.Append("  ConnectUserId: ").Append(ConnectUserId).Append("\n");
            sb.Append("  ConnectLinkType: ").Append(ConnectLinkType).Append("\n");
            sb.Append("  ConnectAccessKey: ").Append(ConnectAccessKey).Append("\n");
            sb.Append("  ImageInfos: ").Append(ImageInfos).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  LastLoginDate: ").Append(LastLoginDate).Append("\n");
            sb.Append("  LastActivityDate: ").Append(LastActivityDate).Append("\n");
            sb.Append("  PlayedPercentage: ").Append(PlayedPercentage).Append("\n");
            sb.Append("  RecursiveChildCountEqualsChildCount: ").Append(RecursiveChildCountEqualsChildCount).Append("\n");
            sb.Append("  OriginalParsedName: ").Append(OriginalParsedName).Append("\n");
            sb.Append("  IsNameParsedFromFolder: ").Append(IsNameParsedFromFolder).Append("\n");
            sb.Append("  DateCreated: ").Append(DateCreated).Append("\n");
            sb.Append("  ImportedCollections: ").Append(ImportedCollections).Append("\n");
            sb.Append("  ResolvedPresentationUniqueKey: ").Append(ResolvedPresentationUniqueKey).Append("\n");
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
            return this.Equals(input as EntitiesUser);
        }

        /// <summary>
        /// Returns true if EntitiesUser instances are equal
        /// </summary>
        /// <param name="input">Instance of EntitiesUser to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EntitiesUser input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.UsesIdForConfigurationPath == input.UsesIdForConfigurationPath ||
                    (this.UsesIdForConfigurationPath != null &&
                    this.UsesIdForConfigurationPath.Equals(input.UsesIdForConfigurationPath))
                ) && 
                (
                    this.Password == input.Password ||
                    (this.Password != null &&
                    this.Password.Equals(input.Password))
                ) && 
                (
                    this.EasyPassword == input.EasyPassword ||
                    (this.EasyPassword != null &&
                    this.EasyPassword.Equals(input.EasyPassword))
                ) && 
                (
                    this.Salt == input.Salt ||
                    (this.Salt != null &&
                    this.Salt.Equals(input.Salt))
                ) && 
                (
                    this.ConnectUserName == input.ConnectUserName ||
                    (this.ConnectUserName != null &&
                    this.ConnectUserName.Equals(input.ConnectUserName))
                ) && 
                (
                    this.ConnectUserId == input.ConnectUserId ||
                    (this.ConnectUserId != null &&
                    this.ConnectUserId.Equals(input.ConnectUserId))
                ) && 
                (
                    this.ConnectLinkType == input.ConnectLinkType ||
                    (this.ConnectLinkType != null &&
                    this.ConnectLinkType.Equals(input.ConnectLinkType))
                ) && 
                (
                    this.ConnectAccessKey == input.ConnectAccessKey ||
                    (this.ConnectAccessKey != null &&
                    this.ConnectAccessKey.Equals(input.ConnectAccessKey))
                ) && 
                (
                    this.ImageInfos == input.ImageInfos ||
                    this.ImageInfos != null &&
                    input.ImageInfos != null &&
                    this.ImageInfos.SequenceEqual(input.ImageInfos)
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.LastLoginDate == input.LastLoginDate ||
                    (this.LastLoginDate != null &&
                    this.LastLoginDate.Equals(input.LastLoginDate))
                ) && 
                (
                    this.LastActivityDate == input.LastActivityDate ||
                    (this.LastActivityDate != null &&
                    this.LastActivityDate.Equals(input.LastActivityDate))
                ) && 
                (
                    this.PlayedPercentage == input.PlayedPercentage ||
                    (this.PlayedPercentage != null &&
                    this.PlayedPercentage.Equals(input.PlayedPercentage))
                ) && 
                (
                    this.RecursiveChildCountEqualsChildCount == input.RecursiveChildCountEqualsChildCount ||
                    (this.RecursiveChildCountEqualsChildCount != null &&
                    this.RecursiveChildCountEqualsChildCount.Equals(input.RecursiveChildCountEqualsChildCount))
                ) && 
                (
                    this.OriginalParsedName == input.OriginalParsedName ||
                    (this.OriginalParsedName != null &&
                    this.OriginalParsedName.Equals(input.OriginalParsedName))
                ) && 
                (
                    this.IsNameParsedFromFolder == input.IsNameParsedFromFolder ||
                    (this.IsNameParsedFromFolder != null &&
                    this.IsNameParsedFromFolder.Equals(input.IsNameParsedFromFolder))
                ) && 
                (
                    this.DateCreated == input.DateCreated ||
                    (this.DateCreated != null &&
                    this.DateCreated.Equals(input.DateCreated))
                ) && 
                (
                    this.ImportedCollections == input.ImportedCollections ||
                    this.ImportedCollections != null &&
                    input.ImportedCollections != null &&
                    this.ImportedCollections.SequenceEqual(input.ImportedCollections)
                ) && 
                (
                    this.ResolvedPresentationUniqueKey == input.ResolvedPresentationUniqueKey ||
                    (this.ResolvedPresentationUniqueKey != null &&
                    this.ResolvedPresentationUniqueKey.Equals(input.ResolvedPresentationUniqueKey))
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
                if (this.UsesIdForConfigurationPath != null)
                    hashCode = hashCode * 59 + this.UsesIdForConfigurationPath.GetHashCode();
                if (this.Password != null)
                    hashCode = hashCode * 59 + this.Password.GetHashCode();
                if (this.EasyPassword != null)
                    hashCode = hashCode * 59 + this.EasyPassword.GetHashCode();
                if (this.Salt != null)
                    hashCode = hashCode * 59 + this.Salt.GetHashCode();
                if (this.ConnectUserName != null)
                    hashCode = hashCode * 59 + this.ConnectUserName.GetHashCode();
                if (this.ConnectUserId != null)
                    hashCode = hashCode * 59 + this.ConnectUserId.GetHashCode();
                if (this.ConnectLinkType != null)
                    hashCode = hashCode * 59 + this.ConnectLinkType.GetHashCode();
                if (this.ConnectAccessKey != null)
                    hashCode = hashCode * 59 + this.ConnectAccessKey.GetHashCode();
                if (this.ImageInfos != null)
                    hashCode = hashCode * 59 + this.ImageInfos.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.LastLoginDate != null)
                    hashCode = hashCode * 59 + this.LastLoginDate.GetHashCode();
                if (this.LastActivityDate != null)
                    hashCode = hashCode * 59 + this.LastActivityDate.GetHashCode();
                if (this.PlayedPercentage != null)
                    hashCode = hashCode * 59 + this.PlayedPercentage.GetHashCode();
                if (this.RecursiveChildCountEqualsChildCount != null)
                    hashCode = hashCode * 59 + this.RecursiveChildCountEqualsChildCount.GetHashCode();
                if (this.OriginalParsedName != null)
                    hashCode = hashCode * 59 + this.OriginalParsedName.GetHashCode();
                if (this.IsNameParsedFromFolder != null)
                    hashCode = hashCode * 59 + this.IsNameParsedFromFolder.GetHashCode();
                if (this.DateCreated != null)
                    hashCode = hashCode * 59 + this.DateCreated.GetHashCode();
                if (this.ImportedCollections != null)
                    hashCode = hashCode * 59 + this.ImportedCollections.GetHashCode();
                if (this.ResolvedPresentationUniqueKey != null)
                    hashCode = hashCode * 59 + this.ResolvedPresentationUniqueKey.GetHashCode();
                return hashCode;
            }
        }

    }
}
