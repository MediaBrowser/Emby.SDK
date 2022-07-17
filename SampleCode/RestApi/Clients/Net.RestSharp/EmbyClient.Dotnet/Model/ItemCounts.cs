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
    /// ItemCounts
    /// </summary>
    [DataContract]
        public partial class ItemCounts :  IEquatable<ItemCounts>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ItemCounts" /> class.
        /// </summary>
        /// <param name="movieCount">movieCount.</param>
        /// <param name="seriesCount">seriesCount.</param>
        /// <param name="episodeCount">episodeCount.</param>
        /// <param name="gameCount">gameCount.</param>
        /// <param name="artistCount">artistCount.</param>
        /// <param name="programCount">programCount.</param>
        /// <param name="gameSystemCount">gameSystemCount.</param>
        /// <param name="trailerCount">trailerCount.</param>
        /// <param name="songCount">songCount.</param>
        /// <param name="albumCount">albumCount.</param>
        /// <param name="musicVideoCount">musicVideoCount.</param>
        /// <param name="boxSetCount">boxSetCount.</param>
        /// <param name="bookCount">bookCount.</param>
        /// <param name="itemCount">itemCount.</param>
        public ItemCounts(int? movieCount = default(int?), int? seriesCount = default(int?), int? episodeCount = default(int?), int? gameCount = default(int?), int? artistCount = default(int?), int? programCount = default(int?), int? gameSystemCount = default(int?), int? trailerCount = default(int?), int? songCount = default(int?), int? albumCount = default(int?), int? musicVideoCount = default(int?), int? boxSetCount = default(int?), int? bookCount = default(int?), int? itemCount = default(int?))
        {
            this.MovieCount = movieCount;
            this.SeriesCount = seriesCount;
            this.EpisodeCount = episodeCount;
            this.GameCount = gameCount;
            this.ArtistCount = artistCount;
            this.ProgramCount = programCount;
            this.GameSystemCount = gameSystemCount;
            this.TrailerCount = trailerCount;
            this.SongCount = songCount;
            this.AlbumCount = albumCount;
            this.MusicVideoCount = musicVideoCount;
            this.BoxSetCount = boxSetCount;
            this.BookCount = bookCount;
            this.ItemCount = itemCount;
        }
        
        /// <summary>
        /// Gets or Sets MovieCount
        /// </summary>
        [DataMember(Name="MovieCount", EmitDefaultValue=false)]
        public int? MovieCount { get; set; }

        /// <summary>
        /// Gets or Sets SeriesCount
        /// </summary>
        [DataMember(Name="SeriesCount", EmitDefaultValue=false)]
        public int? SeriesCount { get; set; }

        /// <summary>
        /// Gets or Sets EpisodeCount
        /// </summary>
        [DataMember(Name="EpisodeCount", EmitDefaultValue=false)]
        public int? EpisodeCount { get; set; }

        /// <summary>
        /// Gets or Sets GameCount
        /// </summary>
        [DataMember(Name="GameCount", EmitDefaultValue=false)]
        public int? GameCount { get; set; }

        /// <summary>
        /// Gets or Sets ArtistCount
        /// </summary>
        [DataMember(Name="ArtistCount", EmitDefaultValue=false)]
        public int? ArtistCount { get; set; }

        /// <summary>
        /// Gets or Sets ProgramCount
        /// </summary>
        [DataMember(Name="ProgramCount", EmitDefaultValue=false)]
        public int? ProgramCount { get; set; }

        /// <summary>
        /// Gets or Sets GameSystemCount
        /// </summary>
        [DataMember(Name="GameSystemCount", EmitDefaultValue=false)]
        public int? GameSystemCount { get; set; }

        /// <summary>
        /// Gets or Sets TrailerCount
        /// </summary>
        [DataMember(Name="TrailerCount", EmitDefaultValue=false)]
        public int? TrailerCount { get; set; }

        /// <summary>
        /// Gets or Sets SongCount
        /// </summary>
        [DataMember(Name="SongCount", EmitDefaultValue=false)]
        public int? SongCount { get; set; }

        /// <summary>
        /// Gets or Sets AlbumCount
        /// </summary>
        [DataMember(Name="AlbumCount", EmitDefaultValue=false)]
        public int? AlbumCount { get; set; }

        /// <summary>
        /// Gets or Sets MusicVideoCount
        /// </summary>
        [DataMember(Name="MusicVideoCount", EmitDefaultValue=false)]
        public int? MusicVideoCount { get; set; }

        /// <summary>
        /// Gets or Sets BoxSetCount
        /// </summary>
        [DataMember(Name="BoxSetCount", EmitDefaultValue=false)]
        public int? BoxSetCount { get; set; }

        /// <summary>
        /// Gets or Sets BookCount
        /// </summary>
        [DataMember(Name="BookCount", EmitDefaultValue=false)]
        public int? BookCount { get; set; }

        /// <summary>
        /// Gets or Sets ItemCount
        /// </summary>
        [DataMember(Name="ItemCount", EmitDefaultValue=false)]
        public int? ItemCount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ItemCounts {\n");
            sb.Append("  MovieCount: ").Append(MovieCount).Append("\n");
            sb.Append("  SeriesCount: ").Append(SeriesCount).Append("\n");
            sb.Append("  EpisodeCount: ").Append(EpisodeCount).Append("\n");
            sb.Append("  GameCount: ").Append(GameCount).Append("\n");
            sb.Append("  ArtistCount: ").Append(ArtistCount).Append("\n");
            sb.Append("  ProgramCount: ").Append(ProgramCount).Append("\n");
            sb.Append("  GameSystemCount: ").Append(GameSystemCount).Append("\n");
            sb.Append("  TrailerCount: ").Append(TrailerCount).Append("\n");
            sb.Append("  SongCount: ").Append(SongCount).Append("\n");
            sb.Append("  AlbumCount: ").Append(AlbumCount).Append("\n");
            sb.Append("  MusicVideoCount: ").Append(MusicVideoCount).Append("\n");
            sb.Append("  BoxSetCount: ").Append(BoxSetCount).Append("\n");
            sb.Append("  BookCount: ").Append(BookCount).Append("\n");
            sb.Append("  ItemCount: ").Append(ItemCount).Append("\n");
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
            return this.Equals(input as ItemCounts);
        }

        /// <summary>
        /// Returns true if ItemCounts instances are equal
        /// </summary>
        /// <param name="input">Instance of ItemCounts to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ItemCounts input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.MovieCount == input.MovieCount ||
                    (this.MovieCount != null &&
                    this.MovieCount.Equals(input.MovieCount))
                ) && 
                (
                    this.SeriesCount == input.SeriesCount ||
                    (this.SeriesCount != null &&
                    this.SeriesCount.Equals(input.SeriesCount))
                ) && 
                (
                    this.EpisodeCount == input.EpisodeCount ||
                    (this.EpisodeCount != null &&
                    this.EpisodeCount.Equals(input.EpisodeCount))
                ) && 
                (
                    this.GameCount == input.GameCount ||
                    (this.GameCount != null &&
                    this.GameCount.Equals(input.GameCount))
                ) && 
                (
                    this.ArtistCount == input.ArtistCount ||
                    (this.ArtistCount != null &&
                    this.ArtistCount.Equals(input.ArtistCount))
                ) && 
                (
                    this.ProgramCount == input.ProgramCount ||
                    (this.ProgramCount != null &&
                    this.ProgramCount.Equals(input.ProgramCount))
                ) && 
                (
                    this.GameSystemCount == input.GameSystemCount ||
                    (this.GameSystemCount != null &&
                    this.GameSystemCount.Equals(input.GameSystemCount))
                ) && 
                (
                    this.TrailerCount == input.TrailerCount ||
                    (this.TrailerCount != null &&
                    this.TrailerCount.Equals(input.TrailerCount))
                ) && 
                (
                    this.SongCount == input.SongCount ||
                    (this.SongCount != null &&
                    this.SongCount.Equals(input.SongCount))
                ) && 
                (
                    this.AlbumCount == input.AlbumCount ||
                    (this.AlbumCount != null &&
                    this.AlbumCount.Equals(input.AlbumCount))
                ) && 
                (
                    this.MusicVideoCount == input.MusicVideoCount ||
                    (this.MusicVideoCount != null &&
                    this.MusicVideoCount.Equals(input.MusicVideoCount))
                ) && 
                (
                    this.BoxSetCount == input.BoxSetCount ||
                    (this.BoxSetCount != null &&
                    this.BoxSetCount.Equals(input.BoxSetCount))
                ) && 
                (
                    this.BookCount == input.BookCount ||
                    (this.BookCount != null &&
                    this.BookCount.Equals(input.BookCount))
                ) && 
                (
                    this.ItemCount == input.ItemCount ||
                    (this.ItemCount != null &&
                    this.ItemCount.Equals(input.ItemCount))
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
                if (this.MovieCount != null)
                    hashCode = hashCode * 59 + this.MovieCount.GetHashCode();
                if (this.SeriesCount != null)
                    hashCode = hashCode * 59 + this.SeriesCount.GetHashCode();
                if (this.EpisodeCount != null)
                    hashCode = hashCode * 59 + this.EpisodeCount.GetHashCode();
                if (this.GameCount != null)
                    hashCode = hashCode * 59 + this.GameCount.GetHashCode();
                if (this.ArtistCount != null)
                    hashCode = hashCode * 59 + this.ArtistCount.GetHashCode();
                if (this.ProgramCount != null)
                    hashCode = hashCode * 59 + this.ProgramCount.GetHashCode();
                if (this.GameSystemCount != null)
                    hashCode = hashCode * 59 + this.GameSystemCount.GetHashCode();
                if (this.TrailerCount != null)
                    hashCode = hashCode * 59 + this.TrailerCount.GetHashCode();
                if (this.SongCount != null)
                    hashCode = hashCode * 59 + this.SongCount.GetHashCode();
                if (this.AlbumCount != null)
                    hashCode = hashCode * 59 + this.AlbumCount.GetHashCode();
                if (this.MusicVideoCount != null)
                    hashCode = hashCode * 59 + this.MusicVideoCount.GetHashCode();
                if (this.BoxSetCount != null)
                    hashCode = hashCode * 59 + this.BoxSetCount.GetHashCode();
                if (this.BookCount != null)
                    hashCode = hashCode * 59 + this.BookCount.GetHashCode();
                if (this.ItemCount != null)
                    hashCode = hashCode * 59 + this.ItemCount.GetHashCode();
                return hashCode;
            }
        }

    }
}
