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
    /// LiveTvListingsProviderInfo
    /// </summary>
    [DataContract]
        public partial class LiveTvListingsProviderInfo :  IEquatable<LiveTvListingsProviderInfo>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LiveTvListingsProviderInfo" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="setupUrl">setupUrl.</param>
        /// <param name="id">id.</param>
        /// <param name="type">type.</param>
        /// <param name="username">username.</param>
        /// <param name="password">password.</param>
        /// <param name="listingsId">listingsId.</param>
        /// <param name="zipCode">zipCode.</param>
        /// <param name="country">country.</param>
        /// <param name="path">path.</param>
        /// <param name="enabledTuners">enabledTuners.</param>
        /// <param name="enableAllTuners">enableAllTuners.</param>
        /// <param name="newsCategories">newsCategories.</param>
        /// <param name="sportsCategories">sportsCategories.</param>
        /// <param name="kidsCategories">kidsCategories.</param>
        /// <param name="movieCategories">movieCategories.</param>
        /// <param name="channelMappings">channelMappings.</param>
        /// <param name="tvgShiftTicks">tvgShiftTicks.</param>
        /// <param name="moviePrefix">moviePrefix.</param>
        /// <param name="preferredLanguage">preferredLanguage.</param>
        /// <param name="userAgent">userAgent.</param>
        /// <param name="dataVersion">dataVersion.</param>
        public LiveTvListingsProviderInfo(string name = default(string), string setupUrl = default(string), string id = default(string), string type = default(string), string username = default(string), string password = default(string), string listingsId = default(string), string zipCode = default(string), string country = default(string), string path = default(string), List<string> enabledTuners = default(List<string>), bool? enableAllTuners = default(bool?), List<string> newsCategories = default(List<string>), List<string> sportsCategories = default(List<string>), List<string> kidsCategories = default(List<string>), List<string> movieCategories = default(List<string>), List<NameValuePair> channelMappings = default(List<NameValuePair>), long? tvgShiftTicks = default(long?), string moviePrefix = default(string), string preferredLanguage = default(string), string userAgent = default(string), string dataVersion = default(string))
        {
            this.Name = name;
            this.SetupUrl = setupUrl;
            this.Id = id;
            this.Type = type;
            this.Username = username;
            this.Password = password;
            this.ListingsId = listingsId;
            this.ZipCode = zipCode;
            this.Country = country;
            this.Path = path;
            this.EnabledTuners = enabledTuners;
            this.EnableAllTuners = enableAllTuners;
            this.NewsCategories = newsCategories;
            this.SportsCategories = sportsCategories;
            this.KidsCategories = kidsCategories;
            this.MovieCategories = movieCategories;
            this.ChannelMappings = channelMappings;
            this.TvgShiftTicks = tvgShiftTicks;
            this.MoviePrefix = moviePrefix;
            this.PreferredLanguage = preferredLanguage;
            this.UserAgent = userAgent;
            this.DataVersion = dataVersion;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets SetupUrl
        /// </summary>
        [DataMember(Name="SetupUrl", EmitDefaultValue=false)]
        public string SetupUrl { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Username
        /// </summary>
        [DataMember(Name="Username", EmitDefaultValue=false)]
        public string Username { get; set; }

        /// <summary>
        /// Gets or Sets Password
        /// </summary>
        [DataMember(Name="Password", EmitDefaultValue=false)]
        public string Password { get; set; }

        /// <summary>
        /// Gets or Sets ListingsId
        /// </summary>
        [DataMember(Name="ListingsId", EmitDefaultValue=false)]
        public string ListingsId { get; set; }

        /// <summary>
        /// Gets or Sets ZipCode
        /// </summary>
        [DataMember(Name="ZipCode", EmitDefaultValue=false)]
        public string ZipCode { get; set; }

        /// <summary>
        /// Gets or Sets Country
        /// </summary>
        [DataMember(Name="Country", EmitDefaultValue=false)]
        public string Country { get; set; }

        /// <summary>
        /// Gets or Sets Path
        /// </summary>
        [DataMember(Name="Path", EmitDefaultValue=false)]
        public string Path { get; set; }

        /// <summary>
        /// Gets or Sets EnabledTuners
        /// </summary>
        [DataMember(Name="EnabledTuners", EmitDefaultValue=false)]
        public List<string> EnabledTuners { get; set; }

        /// <summary>
        /// Gets or Sets EnableAllTuners
        /// </summary>
        [DataMember(Name="EnableAllTuners", EmitDefaultValue=false)]
        public bool? EnableAllTuners { get; set; }

        /// <summary>
        /// Gets or Sets NewsCategories
        /// </summary>
        [DataMember(Name="NewsCategories", EmitDefaultValue=false)]
        public List<string> NewsCategories { get; set; }

        /// <summary>
        /// Gets or Sets SportsCategories
        /// </summary>
        [DataMember(Name="SportsCategories", EmitDefaultValue=false)]
        public List<string> SportsCategories { get; set; }

        /// <summary>
        /// Gets or Sets KidsCategories
        /// </summary>
        [DataMember(Name="KidsCategories", EmitDefaultValue=false)]
        public List<string> KidsCategories { get; set; }

        /// <summary>
        /// Gets or Sets MovieCategories
        /// </summary>
        [DataMember(Name="MovieCategories", EmitDefaultValue=false)]
        public List<string> MovieCategories { get; set; }

        /// <summary>
        /// Gets or Sets ChannelMappings
        /// </summary>
        [DataMember(Name="ChannelMappings", EmitDefaultValue=false)]
        public List<NameValuePair> ChannelMappings { get; set; }

        /// <summary>
        /// Gets or Sets TvgShiftTicks
        /// </summary>
        [DataMember(Name="TvgShiftTicks", EmitDefaultValue=false)]
        public long? TvgShiftTicks { get; set; }

        /// <summary>
        /// Gets or Sets MoviePrefix
        /// </summary>
        [DataMember(Name="MoviePrefix", EmitDefaultValue=false)]
        public string MoviePrefix { get; set; }

        /// <summary>
        /// Gets or Sets PreferredLanguage
        /// </summary>
        [DataMember(Name="PreferredLanguage", EmitDefaultValue=false)]
        public string PreferredLanguage { get; set; }

        /// <summary>
        /// Gets or Sets UserAgent
        /// </summary>
        [DataMember(Name="UserAgent", EmitDefaultValue=false)]
        public string UserAgent { get; set; }

        /// <summary>
        /// Gets or Sets DataVersion
        /// </summary>
        [DataMember(Name="DataVersion", EmitDefaultValue=false)]
        public string DataVersion { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LiveTvListingsProviderInfo {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  SetupUrl: ").Append(SetupUrl).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  ListingsId: ").Append(ListingsId).Append("\n");
            sb.Append("  ZipCode: ").Append(ZipCode).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  EnabledTuners: ").Append(EnabledTuners).Append("\n");
            sb.Append("  EnableAllTuners: ").Append(EnableAllTuners).Append("\n");
            sb.Append("  NewsCategories: ").Append(NewsCategories).Append("\n");
            sb.Append("  SportsCategories: ").Append(SportsCategories).Append("\n");
            sb.Append("  KidsCategories: ").Append(KidsCategories).Append("\n");
            sb.Append("  MovieCategories: ").Append(MovieCategories).Append("\n");
            sb.Append("  ChannelMappings: ").Append(ChannelMappings).Append("\n");
            sb.Append("  TvgShiftTicks: ").Append(TvgShiftTicks).Append("\n");
            sb.Append("  MoviePrefix: ").Append(MoviePrefix).Append("\n");
            sb.Append("  PreferredLanguage: ").Append(PreferredLanguage).Append("\n");
            sb.Append("  UserAgent: ").Append(UserAgent).Append("\n");
            sb.Append("  DataVersion: ").Append(DataVersion).Append("\n");
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
            return this.Equals(input as LiveTvListingsProviderInfo);
        }

        /// <summary>
        /// Returns true if LiveTvListingsProviderInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of LiveTvListingsProviderInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LiveTvListingsProviderInfo input)
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
                    this.SetupUrl == input.SetupUrl ||
                    (this.SetupUrl != null &&
                    this.SetupUrl.Equals(input.SetupUrl))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Username == input.Username ||
                    (this.Username != null &&
                    this.Username.Equals(input.Username))
                ) && 
                (
                    this.Password == input.Password ||
                    (this.Password != null &&
                    this.Password.Equals(input.Password))
                ) && 
                (
                    this.ListingsId == input.ListingsId ||
                    (this.ListingsId != null &&
                    this.ListingsId.Equals(input.ListingsId))
                ) && 
                (
                    this.ZipCode == input.ZipCode ||
                    (this.ZipCode != null &&
                    this.ZipCode.Equals(input.ZipCode))
                ) && 
                (
                    this.Country == input.Country ||
                    (this.Country != null &&
                    this.Country.Equals(input.Country))
                ) && 
                (
                    this.Path == input.Path ||
                    (this.Path != null &&
                    this.Path.Equals(input.Path))
                ) && 
                (
                    this.EnabledTuners == input.EnabledTuners ||
                    this.EnabledTuners != null &&
                    input.EnabledTuners != null &&
                    this.EnabledTuners.SequenceEqual(input.EnabledTuners)
                ) && 
                (
                    this.EnableAllTuners == input.EnableAllTuners ||
                    (this.EnableAllTuners != null &&
                    this.EnableAllTuners.Equals(input.EnableAllTuners))
                ) && 
                (
                    this.NewsCategories == input.NewsCategories ||
                    this.NewsCategories != null &&
                    input.NewsCategories != null &&
                    this.NewsCategories.SequenceEqual(input.NewsCategories)
                ) && 
                (
                    this.SportsCategories == input.SportsCategories ||
                    this.SportsCategories != null &&
                    input.SportsCategories != null &&
                    this.SportsCategories.SequenceEqual(input.SportsCategories)
                ) && 
                (
                    this.KidsCategories == input.KidsCategories ||
                    this.KidsCategories != null &&
                    input.KidsCategories != null &&
                    this.KidsCategories.SequenceEqual(input.KidsCategories)
                ) && 
                (
                    this.MovieCategories == input.MovieCategories ||
                    this.MovieCategories != null &&
                    input.MovieCategories != null &&
                    this.MovieCategories.SequenceEqual(input.MovieCategories)
                ) && 
                (
                    this.ChannelMappings == input.ChannelMappings ||
                    this.ChannelMappings != null &&
                    input.ChannelMappings != null &&
                    this.ChannelMappings.SequenceEqual(input.ChannelMappings)
                ) && 
                (
                    this.TvgShiftTicks == input.TvgShiftTicks ||
                    (this.TvgShiftTicks != null &&
                    this.TvgShiftTicks.Equals(input.TvgShiftTicks))
                ) && 
                (
                    this.MoviePrefix == input.MoviePrefix ||
                    (this.MoviePrefix != null &&
                    this.MoviePrefix.Equals(input.MoviePrefix))
                ) && 
                (
                    this.PreferredLanguage == input.PreferredLanguage ||
                    (this.PreferredLanguage != null &&
                    this.PreferredLanguage.Equals(input.PreferredLanguage))
                ) && 
                (
                    this.UserAgent == input.UserAgent ||
                    (this.UserAgent != null &&
                    this.UserAgent.Equals(input.UserAgent))
                ) && 
                (
                    this.DataVersion == input.DataVersion ||
                    (this.DataVersion != null &&
                    this.DataVersion.Equals(input.DataVersion))
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
                if (this.SetupUrl != null)
                    hashCode = hashCode * 59 + this.SetupUrl.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.Username != null)
                    hashCode = hashCode * 59 + this.Username.GetHashCode();
                if (this.Password != null)
                    hashCode = hashCode * 59 + this.Password.GetHashCode();
                if (this.ListingsId != null)
                    hashCode = hashCode * 59 + this.ListingsId.GetHashCode();
                if (this.ZipCode != null)
                    hashCode = hashCode * 59 + this.ZipCode.GetHashCode();
                if (this.Country != null)
                    hashCode = hashCode * 59 + this.Country.GetHashCode();
                if (this.Path != null)
                    hashCode = hashCode * 59 + this.Path.GetHashCode();
                if (this.EnabledTuners != null)
                    hashCode = hashCode * 59 + this.EnabledTuners.GetHashCode();
                if (this.EnableAllTuners != null)
                    hashCode = hashCode * 59 + this.EnableAllTuners.GetHashCode();
                if (this.NewsCategories != null)
                    hashCode = hashCode * 59 + this.NewsCategories.GetHashCode();
                if (this.SportsCategories != null)
                    hashCode = hashCode * 59 + this.SportsCategories.GetHashCode();
                if (this.KidsCategories != null)
                    hashCode = hashCode * 59 + this.KidsCategories.GetHashCode();
                if (this.MovieCategories != null)
                    hashCode = hashCode * 59 + this.MovieCategories.GetHashCode();
                if (this.ChannelMappings != null)
                    hashCode = hashCode * 59 + this.ChannelMappings.GetHashCode();
                if (this.TvgShiftTicks != null)
                    hashCode = hashCode * 59 + this.TvgShiftTicks.GetHashCode();
                if (this.MoviePrefix != null)
                    hashCode = hashCode * 59 + this.MoviePrefix.GetHashCode();
                if (this.PreferredLanguage != null)
                    hashCode = hashCode * 59 + this.PreferredLanguage.GetHashCode();
                if (this.UserAgent != null)
                    hashCode = hashCode * 59 + this.UserAgent.GetHashCode();
                if (this.DataVersion != null)
                    hashCode = hashCode * 59 + this.DataVersion.GetHashCode();
                return hashCode;
            }
        }

    }
}
