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
    /// UserDto
    /// </summary>
    [DataContract]
        public partial class UserDto :  IEquatable<UserDto>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserDto" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="serverId">serverId.</param>
        /// <param name="serverName">serverName.</param>
        /// <param name="prefix">prefix.</param>
        /// <param name="connectUserName">connectUserName.</param>
        /// <param name="dateCreated">dateCreated.</param>
        /// <param name="connectLinkType">connectLinkType.</param>
        /// <param name="id">id.</param>
        /// <param name="primaryImageTag">primaryImageTag.</param>
        /// <param name="hasPassword">hasPassword.</param>
        /// <param name="hasConfiguredPassword">hasConfiguredPassword.</param>
        /// <param name="hasConfiguredEasyPassword">hasConfiguredEasyPassword.</param>
        /// <param name="enableAutoLogin">enableAutoLogin.</param>
        /// <param name="lastLoginDate">lastLoginDate.</param>
        /// <param name="lastActivityDate">lastActivityDate.</param>
        /// <param name="configuration">configuration.</param>
        /// <param name="policy">policy.</param>
        /// <param name="primaryImageAspectRatio">primaryImageAspectRatio.</param>
        public UserDto(string name = default(string), string serverId = default(string), string serverName = default(string), string prefix = default(string), string connectUserName = default(string), DateTimeOffset? dateCreated = default(DateTimeOffset?), ConnectUserLinkType connectLinkType = default(ConnectUserLinkType), string id = default(string), string primaryImageTag = default(string), bool? hasPassword = default(bool?), bool? hasConfiguredPassword = default(bool?), bool? hasConfiguredEasyPassword = default(bool?), bool? enableAutoLogin = default(bool?), DateTimeOffset? lastLoginDate = default(DateTimeOffset?), DateTimeOffset? lastActivityDate = default(DateTimeOffset?), ConfigurationUserConfiguration configuration = default(ConfigurationUserConfiguration), UsersUserPolicy policy = default(UsersUserPolicy), double? primaryImageAspectRatio = default(double?))
        {
            this.Name = name;
            this.ServerId = serverId;
            this.ServerName = serverName;
            this.Prefix = prefix;
            this.ConnectUserName = connectUserName;
            this.DateCreated = dateCreated;
            this.ConnectLinkType = connectLinkType;
            this.Id = id;
            this.PrimaryImageTag = primaryImageTag;
            this.HasPassword = hasPassword;
            this.HasConfiguredPassword = hasConfiguredPassword;
            this.HasConfiguredEasyPassword = hasConfiguredEasyPassword;
            this.EnableAutoLogin = enableAutoLogin;
            this.LastLoginDate = lastLoginDate;
            this.LastActivityDate = lastActivityDate;
            this.Configuration = configuration;
            this.Policy = policy;
            this.PrimaryImageAspectRatio = primaryImageAspectRatio;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets ServerId
        /// </summary>
        [DataMember(Name="ServerId", EmitDefaultValue=false)]
        public string ServerId { get; set; }

        /// <summary>
        /// Gets or Sets ServerName
        /// </summary>
        [DataMember(Name="ServerName", EmitDefaultValue=false)]
        public string ServerName { get; set; }

        /// <summary>
        /// Gets or Sets Prefix
        /// </summary>
        [DataMember(Name="Prefix", EmitDefaultValue=false)]
        public string Prefix { get; set; }

        /// <summary>
        /// Gets or Sets ConnectUserName
        /// </summary>
        [DataMember(Name="ConnectUserName", EmitDefaultValue=false)]
        public string ConnectUserName { get; set; }

        /// <summary>
        /// Gets or Sets DateCreated
        /// </summary>
        [DataMember(Name="DateCreated", EmitDefaultValue=false)]
        public DateTimeOffset? DateCreated { get; set; }

        /// <summary>
        /// Gets or Sets ConnectLinkType
        /// </summary>
        [DataMember(Name="ConnectLinkType", EmitDefaultValue=false)]
        public ConnectUserLinkType ConnectLinkType { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets PrimaryImageTag
        /// </summary>
        [DataMember(Name="PrimaryImageTag", EmitDefaultValue=false)]
        public string PrimaryImageTag { get; set; }

        /// <summary>
        /// Gets or Sets HasPassword
        /// </summary>
        [DataMember(Name="HasPassword", EmitDefaultValue=false)]
        public bool? HasPassword { get; set; }

        /// <summary>
        /// Gets or Sets HasConfiguredPassword
        /// </summary>
        [DataMember(Name="HasConfiguredPassword", EmitDefaultValue=false)]
        public bool? HasConfiguredPassword { get; set; }

        /// <summary>
        /// Gets or Sets HasConfiguredEasyPassword
        /// </summary>
        [DataMember(Name="HasConfiguredEasyPassword", EmitDefaultValue=false)]
        public bool? HasConfiguredEasyPassword { get; set; }

        /// <summary>
        /// Gets or Sets EnableAutoLogin
        /// </summary>
        [DataMember(Name="EnableAutoLogin", EmitDefaultValue=false)]
        public bool? EnableAutoLogin { get; set; }

        /// <summary>
        /// Gets or Sets LastLoginDate
        /// </summary>
        [DataMember(Name="LastLoginDate", EmitDefaultValue=false)]
        public DateTimeOffset? LastLoginDate { get; set; }

        /// <summary>
        /// Gets or Sets LastActivityDate
        /// </summary>
        [DataMember(Name="LastActivityDate", EmitDefaultValue=false)]
        public DateTimeOffset? LastActivityDate { get; set; }

        /// <summary>
        /// Gets or Sets Configuration
        /// </summary>
        [DataMember(Name="Configuration", EmitDefaultValue=false)]
        public ConfigurationUserConfiguration Configuration { get; set; }

        /// <summary>
        /// Gets or Sets Policy
        /// </summary>
        [DataMember(Name="Policy", EmitDefaultValue=false)]
        public UsersUserPolicy Policy { get; set; }

        /// <summary>
        /// Gets or Sets PrimaryImageAspectRatio
        /// </summary>
        [DataMember(Name="PrimaryImageAspectRatio", EmitDefaultValue=false)]
        public double? PrimaryImageAspectRatio { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserDto {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ServerId: ").Append(ServerId).Append("\n");
            sb.Append("  ServerName: ").Append(ServerName).Append("\n");
            sb.Append("  Prefix: ").Append(Prefix).Append("\n");
            sb.Append("  ConnectUserName: ").Append(ConnectUserName).Append("\n");
            sb.Append("  DateCreated: ").Append(DateCreated).Append("\n");
            sb.Append("  ConnectLinkType: ").Append(ConnectLinkType).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  PrimaryImageTag: ").Append(PrimaryImageTag).Append("\n");
            sb.Append("  HasPassword: ").Append(HasPassword).Append("\n");
            sb.Append("  HasConfiguredPassword: ").Append(HasConfiguredPassword).Append("\n");
            sb.Append("  HasConfiguredEasyPassword: ").Append(HasConfiguredEasyPassword).Append("\n");
            sb.Append("  EnableAutoLogin: ").Append(EnableAutoLogin).Append("\n");
            sb.Append("  LastLoginDate: ").Append(LastLoginDate).Append("\n");
            sb.Append("  LastActivityDate: ").Append(LastActivityDate).Append("\n");
            sb.Append("  Configuration: ").Append(Configuration).Append("\n");
            sb.Append("  Policy: ").Append(Policy).Append("\n");
            sb.Append("  PrimaryImageAspectRatio: ").Append(PrimaryImageAspectRatio).Append("\n");
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
            return this.Equals(input as UserDto);
        }

        /// <summary>
        /// Returns true if UserDto instances are equal
        /// </summary>
        /// <param name="input">Instance of UserDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserDto input)
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
                    this.ServerId == input.ServerId ||
                    (this.ServerId != null &&
                    this.ServerId.Equals(input.ServerId))
                ) && 
                (
                    this.ServerName == input.ServerName ||
                    (this.ServerName != null &&
                    this.ServerName.Equals(input.ServerName))
                ) && 
                (
                    this.Prefix == input.Prefix ||
                    (this.Prefix != null &&
                    this.Prefix.Equals(input.Prefix))
                ) && 
                (
                    this.ConnectUserName == input.ConnectUserName ||
                    (this.ConnectUserName != null &&
                    this.ConnectUserName.Equals(input.ConnectUserName))
                ) && 
                (
                    this.DateCreated == input.DateCreated ||
                    (this.DateCreated != null &&
                    this.DateCreated.Equals(input.DateCreated))
                ) && 
                (
                    this.ConnectLinkType == input.ConnectLinkType ||
                    (this.ConnectLinkType != null &&
                    this.ConnectLinkType.Equals(input.ConnectLinkType))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.PrimaryImageTag == input.PrimaryImageTag ||
                    (this.PrimaryImageTag != null &&
                    this.PrimaryImageTag.Equals(input.PrimaryImageTag))
                ) && 
                (
                    this.HasPassword == input.HasPassword ||
                    (this.HasPassword != null &&
                    this.HasPassword.Equals(input.HasPassword))
                ) && 
                (
                    this.HasConfiguredPassword == input.HasConfiguredPassword ||
                    (this.HasConfiguredPassword != null &&
                    this.HasConfiguredPassword.Equals(input.HasConfiguredPassword))
                ) && 
                (
                    this.HasConfiguredEasyPassword == input.HasConfiguredEasyPassword ||
                    (this.HasConfiguredEasyPassword != null &&
                    this.HasConfiguredEasyPassword.Equals(input.HasConfiguredEasyPassword))
                ) && 
                (
                    this.EnableAutoLogin == input.EnableAutoLogin ||
                    (this.EnableAutoLogin != null &&
                    this.EnableAutoLogin.Equals(input.EnableAutoLogin))
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
                    this.Configuration == input.Configuration ||
                    (this.Configuration != null &&
                    this.Configuration.Equals(input.Configuration))
                ) && 
                (
                    this.Policy == input.Policy ||
                    (this.Policy != null &&
                    this.Policy.Equals(input.Policy))
                ) && 
                (
                    this.PrimaryImageAspectRatio == input.PrimaryImageAspectRatio ||
                    (this.PrimaryImageAspectRatio != null &&
                    this.PrimaryImageAspectRatio.Equals(input.PrimaryImageAspectRatio))
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
                if (this.ServerId != null)
                    hashCode = hashCode * 59 + this.ServerId.GetHashCode();
                if (this.ServerName != null)
                    hashCode = hashCode * 59 + this.ServerName.GetHashCode();
                if (this.Prefix != null)
                    hashCode = hashCode * 59 + this.Prefix.GetHashCode();
                if (this.ConnectUserName != null)
                    hashCode = hashCode * 59 + this.ConnectUserName.GetHashCode();
                if (this.DateCreated != null)
                    hashCode = hashCode * 59 + this.DateCreated.GetHashCode();
                if (this.ConnectLinkType != null)
                    hashCode = hashCode * 59 + this.ConnectLinkType.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.PrimaryImageTag != null)
                    hashCode = hashCode * 59 + this.PrimaryImageTag.GetHashCode();
                if (this.HasPassword != null)
                    hashCode = hashCode * 59 + this.HasPassword.GetHashCode();
                if (this.HasConfiguredPassword != null)
                    hashCode = hashCode * 59 + this.HasConfiguredPassword.GetHashCode();
                if (this.HasConfiguredEasyPassword != null)
                    hashCode = hashCode * 59 + this.HasConfiguredEasyPassword.GetHashCode();
                if (this.EnableAutoLogin != null)
                    hashCode = hashCode * 59 + this.EnableAutoLogin.GetHashCode();
                if (this.LastLoginDate != null)
                    hashCode = hashCode * 59 + this.LastLoginDate.GetHashCode();
                if (this.LastActivityDate != null)
                    hashCode = hashCode * 59 + this.LastActivityDate.GetHashCode();
                if (this.Configuration != null)
                    hashCode = hashCode * 59 + this.Configuration.GetHashCode();
                if (this.Policy != null)
                    hashCode = hashCode * 59 + this.Policy.GetHashCode();
                if (this.PrimaryImageAspectRatio != null)
                    hashCode = hashCode * 59 + this.PrimaryImageAspectRatio.GetHashCode();
                return hashCode;
            }
        }

    }
}
