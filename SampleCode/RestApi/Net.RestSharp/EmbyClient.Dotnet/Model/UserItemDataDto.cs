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
    /// Class UserItemDataDto  
    /// </summary>
    [DataContract]
        public partial class UserItemDataDto :  IEquatable<UserItemDataDto>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserItemDataDto" /> class.
        /// </summary>
        /// <param name="rating">The rating..</param>
        /// <param name="playedPercentage">The played percentage..</param>
        /// <param name="unplayedItemCount">The unplayed item count..</param>
        /// <param name="playbackPositionTicks">The playback position ticks..</param>
        /// <param name="playCount">The play count..</param>
        /// <param name="isFavorite">A value indicating whether this instance is favorite..</param>
        /// <param name="lastPlayedDate">The last played date..</param>
        /// <param name="played">A value indicating whether this &#x60;MediaBrowser.Model.Dto.UserItemDataDto&#x60; is played..</param>
        /// <param name="key">The key..</param>
        /// <param name="itemId">The item identifier..</param>
        /// <param name="serverId">Used only by our Windows app. Not used by Emby Server..</param>
        public UserItemDataDto(double? rating = default(double?), double? playedPercentage = default(double?), int? unplayedItemCount = default(int?), long? playbackPositionTicks = default(long?), int? playCount = default(int?), bool? isFavorite = default(bool?), DateTimeOffset? lastPlayedDate = default(DateTimeOffset?), bool? played = default(bool?), string key = default(string), string itemId = default(string), string serverId = default(string))
        {
            this.Rating = rating;
            this.PlayedPercentage = playedPercentage;
            this.UnplayedItemCount = unplayedItemCount;
            this.PlaybackPositionTicks = playbackPositionTicks;
            this.PlayCount = playCount;
            this.IsFavorite = isFavorite;
            this.LastPlayedDate = lastPlayedDate;
            this.Played = played;
            this.Key = key;
            this.ItemId = itemId;
            this.ServerId = serverId;
        }
        
        /// <summary>
        /// The rating.
        /// </summary>
        /// <value>The rating.</value>
        [DataMember(Name="Rating", EmitDefaultValue=false)]
        public double? Rating { get; set; }

        /// <summary>
        /// The played percentage.
        /// </summary>
        /// <value>The played percentage.</value>
        [DataMember(Name="PlayedPercentage", EmitDefaultValue=false)]
        public double? PlayedPercentage { get; set; }

        /// <summary>
        /// The unplayed item count.
        /// </summary>
        /// <value>The unplayed item count.</value>
        [DataMember(Name="UnplayedItemCount", EmitDefaultValue=false)]
        public int? UnplayedItemCount { get; set; }

        /// <summary>
        /// The playback position ticks.
        /// </summary>
        /// <value>The playback position ticks.</value>
        [DataMember(Name="PlaybackPositionTicks", EmitDefaultValue=false)]
        public long? PlaybackPositionTicks { get; set; }

        /// <summary>
        /// The play count.
        /// </summary>
        /// <value>The play count.</value>
        [DataMember(Name="PlayCount", EmitDefaultValue=false)]
        public int? PlayCount { get; set; }

        /// <summary>
        /// A value indicating whether this instance is favorite.
        /// </summary>
        /// <value>A value indicating whether this instance is favorite.</value>
        [DataMember(Name="IsFavorite", EmitDefaultValue=false)]
        public bool? IsFavorite { get; set; }

        /// <summary>
        /// The last played date.
        /// </summary>
        /// <value>The last played date.</value>
        [DataMember(Name="LastPlayedDate", EmitDefaultValue=false)]
        public DateTimeOffset? LastPlayedDate { get; set; }

        /// <summary>
        /// A value indicating whether this &#x60;MediaBrowser.Model.Dto.UserItemDataDto&#x60; is played.
        /// </summary>
        /// <value>A value indicating whether this &#x60;MediaBrowser.Model.Dto.UserItemDataDto&#x60; is played.</value>
        [DataMember(Name="Played", EmitDefaultValue=false)]
        public bool? Played { get; set; }

        /// <summary>
        /// The key.
        /// </summary>
        /// <value>The key.</value>
        [DataMember(Name="Key", EmitDefaultValue=false)]
        public string Key { get; set; }

        /// <summary>
        /// The item identifier.
        /// </summary>
        /// <value>The item identifier.</value>
        [DataMember(Name="ItemId", EmitDefaultValue=false)]
        public string ItemId { get; set; }

        /// <summary>
        /// Used only by our Windows app. Not used by Emby Server.
        /// </summary>
        /// <value>Used only by our Windows app. Not used by Emby Server.</value>
        [DataMember(Name="ServerId", EmitDefaultValue=false)]
        public string ServerId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserItemDataDto {\n");
            sb.Append("  Rating: ").Append(Rating).Append("\n");
            sb.Append("  PlayedPercentage: ").Append(PlayedPercentage).Append("\n");
            sb.Append("  UnplayedItemCount: ").Append(UnplayedItemCount).Append("\n");
            sb.Append("  PlaybackPositionTicks: ").Append(PlaybackPositionTicks).Append("\n");
            sb.Append("  PlayCount: ").Append(PlayCount).Append("\n");
            sb.Append("  IsFavorite: ").Append(IsFavorite).Append("\n");
            sb.Append("  LastPlayedDate: ").Append(LastPlayedDate).Append("\n");
            sb.Append("  Played: ").Append(Played).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  ServerId: ").Append(ServerId).Append("\n");
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
            return this.Equals(input as UserItemDataDto);
        }

        /// <summary>
        /// Returns true if UserItemDataDto instances are equal
        /// </summary>
        /// <param name="input">Instance of UserItemDataDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserItemDataDto input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Rating == input.Rating ||
                    (this.Rating != null &&
                    this.Rating.Equals(input.Rating))
                ) && 
                (
                    this.PlayedPercentage == input.PlayedPercentage ||
                    (this.PlayedPercentage != null &&
                    this.PlayedPercentage.Equals(input.PlayedPercentage))
                ) && 
                (
                    this.UnplayedItemCount == input.UnplayedItemCount ||
                    (this.UnplayedItemCount != null &&
                    this.UnplayedItemCount.Equals(input.UnplayedItemCount))
                ) && 
                (
                    this.PlaybackPositionTicks == input.PlaybackPositionTicks ||
                    (this.PlaybackPositionTicks != null &&
                    this.PlaybackPositionTicks.Equals(input.PlaybackPositionTicks))
                ) && 
                (
                    this.PlayCount == input.PlayCount ||
                    (this.PlayCount != null &&
                    this.PlayCount.Equals(input.PlayCount))
                ) && 
                (
                    this.IsFavorite == input.IsFavorite ||
                    (this.IsFavorite != null &&
                    this.IsFavorite.Equals(input.IsFavorite))
                ) && 
                (
                    this.LastPlayedDate == input.LastPlayedDate ||
                    (this.LastPlayedDate != null &&
                    this.LastPlayedDate.Equals(input.LastPlayedDate))
                ) && 
                (
                    this.Played == input.Played ||
                    (this.Played != null &&
                    this.Played.Equals(input.Played))
                ) && 
                (
                    this.Key == input.Key ||
                    (this.Key != null &&
                    this.Key.Equals(input.Key))
                ) && 
                (
                    this.ItemId == input.ItemId ||
                    (this.ItemId != null &&
                    this.ItemId.Equals(input.ItemId))
                ) && 
                (
                    this.ServerId == input.ServerId ||
                    (this.ServerId != null &&
                    this.ServerId.Equals(input.ServerId))
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
                if (this.Rating != null)
                    hashCode = hashCode * 59 + this.Rating.GetHashCode();
                if (this.PlayedPercentage != null)
                    hashCode = hashCode * 59 + this.PlayedPercentage.GetHashCode();
                if (this.UnplayedItemCount != null)
                    hashCode = hashCode * 59 + this.UnplayedItemCount.GetHashCode();
                if (this.PlaybackPositionTicks != null)
                    hashCode = hashCode * 59 + this.PlaybackPositionTicks.GetHashCode();
                if (this.PlayCount != null)
                    hashCode = hashCode * 59 + this.PlayCount.GetHashCode();
                if (this.IsFavorite != null)
                    hashCode = hashCode * 59 + this.IsFavorite.GetHashCode();
                if (this.LastPlayedDate != null)
                    hashCode = hashCode * 59 + this.LastPlayedDate.GetHashCode();
                if (this.Played != null)
                    hashCode = hashCode * 59 + this.Played.GetHashCode();
                if (this.Key != null)
                    hashCode = hashCode * 59 + this.Key.GetHashCode();
                if (this.ItemId != null)
                    hashCode = hashCode * 59 + this.ItemId.GetHashCode();
                if (this.ServerId != null)
                    hashCode = hashCode * 59 + this.ServerId.GetHashCode();
                return hashCode;
            }
        }

    }
}
