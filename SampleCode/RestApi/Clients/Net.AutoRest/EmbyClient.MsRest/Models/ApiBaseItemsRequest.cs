// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace EmbyClient.MsRest.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class ApiBaseItemsRequest
    {
        /// <summary>
        /// Initializes a new instance of the ApiBaseItemsRequest class.
        /// </summary>
        public ApiBaseItemsRequest()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the ApiBaseItemsRequest class.
        /// </summary>
        /// <param name="recordingKeywordType">Possible values include: 'Name',
        /// 'EpisodeTitle', 'Overview', 'Actor', 'Director'</param>
        /// <param name="groupItemsInto">Possible values include: 'Artists',
        /// 'AlbumArtists', 'Genres', 'Studios', 'Tags', 'Composers',
        /// 'Collections', 'Albums', 'CollectionFolders'</param>
        public ApiBaseItemsRequest(bool? is4K = default(bool?), bool? enableTotalRecordCount = default(bool?), string recordingKeyword = default(string), string recordingKeywordType = default(string), int? randomSeed = default(int?), string genreIds = default(string), string collectionIds = default(string), string tagIds = default(string), string excludeArtistIds = default(string), string albumArtistIds = default(string), string contributingArtistIds = default(string), string albumIds = default(string), string outerIds = default(string), string listItemIds = default(string), string audioLanguages = default(string), string subtitleLanguages = default(string), string groupItemsInto = default(string), int? minWidth = default(int?), int? minHeight = default(int?), int? maxWidth = default(int?), int? maxHeight = default(int?), bool? groupProgramsBySeries = default(bool?), IList<string> airDays = default(IList<string>), bool? isAiring = default(bool?), bool? hasAired = default(bool?))
        {
            Is4K = is4K;
            EnableTotalRecordCount = enableTotalRecordCount;
            RecordingKeyword = recordingKeyword;
            RecordingKeywordType = recordingKeywordType;
            RandomSeed = randomSeed;
            GenreIds = genreIds;
            CollectionIds = collectionIds;
            TagIds = tagIds;
            ExcludeArtistIds = excludeArtistIds;
            AlbumArtistIds = albumArtistIds;
            ContributingArtistIds = contributingArtistIds;
            AlbumIds = albumIds;
            OuterIds = outerIds;
            ListItemIds = listItemIds;
            AudioLanguages = audioLanguages;
            SubtitleLanguages = subtitleLanguages;
            GroupItemsInto = groupItemsInto;
            MinWidth = minWidth;
            MinHeight = minHeight;
            MaxWidth = maxWidth;
            MaxHeight = maxHeight;
            GroupProgramsBySeries = groupProgramsBySeries;
            AirDays = airDays;
            IsAiring = isAiring;
            HasAired = hasAired;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Is4K")]
        public bool? Is4K { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "EnableTotalRecordCount")]
        public bool? EnableTotalRecordCount { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "RecordingKeyword")]
        public string RecordingKeyword { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'Name', 'EpisodeTitle',
        /// 'Overview', 'Actor', 'Director'
        /// </summary>
        [JsonProperty(PropertyName = "RecordingKeywordType")]
        public string RecordingKeywordType { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "RandomSeed")]
        public int? RandomSeed { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "GenreIds")]
        public string GenreIds { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "CollectionIds")]
        public string CollectionIds { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "TagIds")]
        public string TagIds { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "ExcludeArtistIds")]
        public string ExcludeArtistIds { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "AlbumArtistIds")]
        public string AlbumArtistIds { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "ContributingArtistIds")]
        public string ContributingArtistIds { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "AlbumIds")]
        public string AlbumIds { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "OuterIds")]
        public string OuterIds { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "ListItemIds")]
        public string ListItemIds { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "AudioLanguages")]
        public string AudioLanguages { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "SubtitleLanguages")]
        public string SubtitleLanguages { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'Artists', 'AlbumArtists',
        /// 'Genres', 'Studios', 'Tags', 'Composers', 'Collections', 'Albums',
        /// 'CollectionFolders'
        /// </summary>
        [JsonProperty(PropertyName = "GroupItemsInto")]
        public string GroupItemsInto { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "MinWidth")]
        public int? MinWidth { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "MinHeight")]
        public int? MinHeight { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "MaxWidth")]
        public int? MaxWidth { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "MaxHeight")]
        public int? MaxHeight { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "GroupProgramsBySeries")]
        public bool? GroupProgramsBySeries { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "AirDays")]
        public IList<string> AirDays { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "IsAiring")]
        public bool? IsAiring { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "HasAired")]
        public bool? HasAired { get; set; }

    }
}