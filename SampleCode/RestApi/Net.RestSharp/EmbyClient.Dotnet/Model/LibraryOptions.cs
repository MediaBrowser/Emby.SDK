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
    /// LibraryOptions
    /// </summary>
    [DataContract]
        public partial class LibraryOptions :  IEquatable<LibraryOptions>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LibraryOptions" /> class.
        /// </summary>
        /// <param name="enableArchiveMediaFiles">enableArchiveMediaFiles.</param>
        /// <param name="enablePhotos">enablePhotos.</param>
        /// <param name="enableRealtimeMonitor">enableRealtimeMonitor.</param>
        /// <param name="enableMarkerDetection">enableMarkerDetection.</param>
        /// <param name="enableMarkerDetectionDuringLibraryScan">enableMarkerDetectionDuringLibraryScan.</param>
        /// <param name="introDetectionFingerprintLength">introDetectionFingerprintLength.</param>
        /// <param name="enableChapterImageExtraction">enableChapterImageExtraction.</param>
        /// <param name="extractChapterImagesDuringLibraryScan">extractChapterImagesDuringLibraryScan.</param>
        /// <param name="downloadImagesInAdvance">downloadImagesInAdvance.</param>
        /// <param name="cacheImages">cacheImages.</param>
        /// <param name="excludeFromSearch">excludeFromSearch.</param>
        /// <param name="enablePlexIgnore">enablePlexIgnore.</param>
        /// <param name="pathInfos">pathInfos.</param>
        /// <param name="ignoreHiddenFiles">ignoreHiddenFiles.</param>
        /// <param name="ignoreFileExtensions">ignoreFileExtensions.</param>
        /// <param name="saveLocalMetadata">saveLocalMetadata.</param>
        /// <param name="saveMetadataHidden">saveMetadataHidden.</param>
        /// <param name="saveLocalThumbnailSets">saveLocalThumbnailSets.</param>
        /// <param name="importPlaylists">importPlaylists.</param>
        /// <param name="enableAutomaticSeriesGrouping">enableAutomaticSeriesGrouping.</param>
        /// <param name="shareEmbeddedMusicAlbumImages">shareEmbeddedMusicAlbumImages.</param>
        /// <param name="enableEmbeddedTitles">enableEmbeddedTitles.</param>
        /// <param name="enableAudioResume">enableAudioResume.</param>
        /// <param name="autoGenerateChapters">autoGenerateChapters.</param>
        /// <param name="mergeTopLevelFolders">mergeTopLevelFolders.</param>
        /// <param name="autoGenerateChapterIntervalMinutes">autoGenerateChapterIntervalMinutes.</param>
        /// <param name="automaticRefreshIntervalDays">automaticRefreshIntervalDays.</param>
        /// <param name="placeholderMetadataRefreshIntervalDays">placeholderMetadataRefreshIntervalDays.</param>
        /// <param name="preferredMetadataLanguage">The preferred metadata language..</param>
        /// <param name="preferredImageLanguage">preferredImageLanguage.</param>
        /// <param name="contentType">contentType.</param>
        /// <param name="metadataCountryCode">The metadata country code..</param>
        /// <param name="metadataSavers">metadataSavers.</param>
        /// <param name="disabledLocalMetadataReaders">disabledLocalMetadataReaders.</param>
        /// <param name="localMetadataReaderOrder">localMetadataReaderOrder.</param>
        /// <param name="disabledLyricsFetchers">disabledLyricsFetchers.</param>
        /// <param name="saveLyricsWithMedia">saveLyricsWithMedia.</param>
        /// <param name="lyricsDownloadMaxAgeDays">lyricsDownloadMaxAgeDays.</param>
        /// <param name="lyricsFetcherOrder">lyricsFetcherOrder.</param>
        /// <param name="lyricsDownloadLanguages">lyricsDownloadLanguages.</param>
        /// <param name="disabledSubtitleFetchers">disabledSubtitleFetchers.</param>
        /// <param name="subtitleFetcherOrder">subtitleFetcherOrder.</param>
        /// <param name="skipSubtitlesIfEmbeddedSubtitlesPresent">skipSubtitlesIfEmbeddedSubtitlesPresent.</param>
        /// <param name="skipSubtitlesIfAudioTrackMatches">skipSubtitlesIfAudioTrackMatches.</param>
        /// <param name="subtitleDownloadLanguages">subtitleDownloadLanguages.</param>
        /// <param name="subtitleDownloadMaxAgeDays">subtitleDownloadMaxAgeDays.</param>
        /// <param name="requirePerfectSubtitleMatch">requirePerfectSubtitleMatch.</param>
        /// <param name="saveSubtitlesWithMedia">saveSubtitlesWithMedia.</param>
        /// <param name="forcedSubtitlesOnly">forcedSubtitlesOnly.</param>
        /// <param name="hearingImpairedSubtitlesOnly">hearingImpairedSubtitlesOnly.</param>
        /// <param name="typeOptions">typeOptions.</param>
        /// <param name="collapseSingleItemFolders">collapseSingleItemFolders.</param>
        /// <param name="enableAdultMetadata">enableAdultMetadata.</param>
        /// <param name="importCollections">importCollections.</param>
        /// <param name="enableMultiVersionByFiles">enableMultiVersionByFiles.</param>
        /// <param name="enableMultiVersionByMetadata">enableMultiVersionByMetadata.</param>
        /// <param name="enableMultiPartItems">enableMultiPartItems.</param>
        /// <param name="minCollectionItems">minCollectionItems.</param>
        /// <param name="musicFolderStructure">musicFolderStructure.</param>
        /// <param name="minResumePct">The minimum percentage of an item that must be played in order for playstate to be updated..</param>
        /// <param name="maxResumePct">The maximum percentage of an item that can be played while still saving playstate. If this percentage is crossed playstate will be reset to the beginning and the item will be marked watched..</param>
        /// <param name="minResumeDurationSeconds">The minimum duration that an item must have in order to be eligible for playstate updates...</param>
        /// <param name="thumbnailImagesIntervalSeconds">thumbnailImagesIntervalSeconds.</param>
        /// <param name="sampleIgnoreSize">sampleIgnoreSize.</param>
        public LibraryOptions(bool? enableArchiveMediaFiles = default(bool?), bool? enablePhotos = default(bool?), bool? enableRealtimeMonitor = default(bool?), bool? enableMarkerDetection = default(bool?), bool? enableMarkerDetectionDuringLibraryScan = default(bool?), int? introDetectionFingerprintLength = default(int?), bool? enableChapterImageExtraction = default(bool?), bool? extractChapterImagesDuringLibraryScan = default(bool?), bool? downloadImagesInAdvance = default(bool?), bool? cacheImages = default(bool?), bool? excludeFromSearch = default(bool?), bool? enablePlexIgnore = default(bool?), List<MediaPathInfo> pathInfos = default(List<MediaPathInfo>), bool? ignoreHiddenFiles = default(bool?), List<string> ignoreFileExtensions = default(List<string>), bool? saveLocalMetadata = default(bool?), bool? saveMetadataHidden = default(bool?), bool? saveLocalThumbnailSets = default(bool?), bool? importPlaylists = default(bool?), bool? enableAutomaticSeriesGrouping = default(bool?), bool? shareEmbeddedMusicAlbumImages = default(bool?), bool? enableEmbeddedTitles = default(bool?), bool? enableAudioResume = default(bool?), bool? autoGenerateChapters = default(bool?), bool? mergeTopLevelFolders = default(bool?), int? autoGenerateChapterIntervalMinutes = default(int?), int? automaticRefreshIntervalDays = default(int?), int? placeholderMetadataRefreshIntervalDays = default(int?), string preferredMetadataLanguage = default(string), string preferredImageLanguage = default(string), string contentType = default(string), string metadataCountryCode = default(string), List<string> metadataSavers = default(List<string>), List<string> disabledLocalMetadataReaders = default(List<string>), List<string> localMetadataReaderOrder = default(List<string>), List<string> disabledLyricsFetchers = default(List<string>), bool? saveLyricsWithMedia = default(bool?), int? lyricsDownloadMaxAgeDays = default(int?), List<string> lyricsFetcherOrder = default(List<string>), List<string> lyricsDownloadLanguages = default(List<string>), List<string> disabledSubtitleFetchers = default(List<string>), List<string> subtitleFetcherOrder = default(List<string>), bool? skipSubtitlesIfEmbeddedSubtitlesPresent = default(bool?), bool? skipSubtitlesIfAudioTrackMatches = default(bool?), List<string> subtitleDownloadLanguages = default(List<string>), int? subtitleDownloadMaxAgeDays = default(int?), bool? requirePerfectSubtitleMatch = default(bool?), bool? saveSubtitlesWithMedia = default(bool?), bool? forcedSubtitlesOnly = default(bool?), bool? hearingImpairedSubtitlesOnly = default(bool?), List<TypeOptions> typeOptions = default(List<TypeOptions>), bool? collapseSingleItemFolders = default(bool?), bool? enableAdultMetadata = default(bool?), bool? importCollections = default(bool?), bool? enableMultiVersionByFiles = default(bool?), bool? enableMultiVersionByMetadata = default(bool?), bool? enableMultiPartItems = default(bool?), int? minCollectionItems = default(int?), string musicFolderStructure = default(string), int? minResumePct = default(int?), int? maxResumePct = default(int?), int? minResumeDurationSeconds = default(int?), int? thumbnailImagesIntervalSeconds = default(int?), int? sampleIgnoreSize = default(int?))
        {
            this.EnableArchiveMediaFiles = enableArchiveMediaFiles;
            this.EnablePhotos = enablePhotos;
            this.EnableRealtimeMonitor = enableRealtimeMonitor;
            this.EnableMarkerDetection = enableMarkerDetection;
            this.EnableMarkerDetectionDuringLibraryScan = enableMarkerDetectionDuringLibraryScan;
            this.IntroDetectionFingerprintLength = introDetectionFingerprintLength;
            this.EnableChapterImageExtraction = enableChapterImageExtraction;
            this.ExtractChapterImagesDuringLibraryScan = extractChapterImagesDuringLibraryScan;
            this.DownloadImagesInAdvance = downloadImagesInAdvance;
            this.CacheImages = cacheImages;
            this.ExcludeFromSearch = excludeFromSearch;
            this.EnablePlexIgnore = enablePlexIgnore;
            this.PathInfos = pathInfos;
            this.IgnoreHiddenFiles = ignoreHiddenFiles;
            this.IgnoreFileExtensions = ignoreFileExtensions;
            this.SaveLocalMetadata = saveLocalMetadata;
            this.SaveMetadataHidden = saveMetadataHidden;
            this.SaveLocalThumbnailSets = saveLocalThumbnailSets;
            this.ImportPlaylists = importPlaylists;
            this.EnableAutomaticSeriesGrouping = enableAutomaticSeriesGrouping;
            this.ShareEmbeddedMusicAlbumImages = shareEmbeddedMusicAlbumImages;
            this.EnableEmbeddedTitles = enableEmbeddedTitles;
            this.EnableAudioResume = enableAudioResume;
            this.AutoGenerateChapters = autoGenerateChapters;
            this.MergeTopLevelFolders = mergeTopLevelFolders;
            this.AutoGenerateChapterIntervalMinutes = autoGenerateChapterIntervalMinutes;
            this.AutomaticRefreshIntervalDays = automaticRefreshIntervalDays;
            this.PlaceholderMetadataRefreshIntervalDays = placeholderMetadataRefreshIntervalDays;
            this.PreferredMetadataLanguage = preferredMetadataLanguage;
            this.PreferredImageLanguage = preferredImageLanguage;
            this.ContentType = contentType;
            this.MetadataCountryCode = metadataCountryCode;
            this.MetadataSavers = metadataSavers;
            this.DisabledLocalMetadataReaders = disabledLocalMetadataReaders;
            this.LocalMetadataReaderOrder = localMetadataReaderOrder;
            this.DisabledLyricsFetchers = disabledLyricsFetchers;
            this.SaveLyricsWithMedia = saveLyricsWithMedia;
            this.LyricsDownloadMaxAgeDays = lyricsDownloadMaxAgeDays;
            this.LyricsFetcherOrder = lyricsFetcherOrder;
            this.LyricsDownloadLanguages = lyricsDownloadLanguages;
            this.DisabledSubtitleFetchers = disabledSubtitleFetchers;
            this.SubtitleFetcherOrder = subtitleFetcherOrder;
            this.SkipSubtitlesIfEmbeddedSubtitlesPresent = skipSubtitlesIfEmbeddedSubtitlesPresent;
            this.SkipSubtitlesIfAudioTrackMatches = skipSubtitlesIfAudioTrackMatches;
            this.SubtitleDownloadLanguages = subtitleDownloadLanguages;
            this.SubtitleDownloadMaxAgeDays = subtitleDownloadMaxAgeDays;
            this.RequirePerfectSubtitleMatch = requirePerfectSubtitleMatch;
            this.SaveSubtitlesWithMedia = saveSubtitlesWithMedia;
            this.ForcedSubtitlesOnly = forcedSubtitlesOnly;
            this.HearingImpairedSubtitlesOnly = hearingImpairedSubtitlesOnly;
            this.TypeOptions = typeOptions;
            this.CollapseSingleItemFolders = collapseSingleItemFolders;
            this.EnableAdultMetadata = enableAdultMetadata;
            this.ImportCollections = importCollections;
            this.EnableMultiVersionByFiles = enableMultiVersionByFiles;
            this.EnableMultiVersionByMetadata = enableMultiVersionByMetadata;
            this.EnableMultiPartItems = enableMultiPartItems;
            this.MinCollectionItems = minCollectionItems;
            this.MusicFolderStructure = musicFolderStructure;
            this.MinResumePct = minResumePct;
            this.MaxResumePct = maxResumePct;
            this.MinResumeDurationSeconds = minResumeDurationSeconds;
            this.ThumbnailImagesIntervalSeconds = thumbnailImagesIntervalSeconds;
            this.SampleIgnoreSize = sampleIgnoreSize;
        }
        
        /// <summary>
        /// Gets or Sets EnableArchiveMediaFiles
        /// </summary>
        [DataMember(Name="EnableArchiveMediaFiles", EmitDefaultValue=false)]
        public bool? EnableArchiveMediaFiles { get; set; }

        /// <summary>
        /// Gets or Sets EnablePhotos
        /// </summary>
        [DataMember(Name="EnablePhotos", EmitDefaultValue=false)]
        public bool? EnablePhotos { get; set; }

        /// <summary>
        /// Gets or Sets EnableRealtimeMonitor
        /// </summary>
        [DataMember(Name="EnableRealtimeMonitor", EmitDefaultValue=false)]
        public bool? EnableRealtimeMonitor { get; set; }

        /// <summary>
        /// Gets or Sets EnableMarkerDetection
        /// </summary>
        [DataMember(Name="EnableMarkerDetection", EmitDefaultValue=false)]
        public bool? EnableMarkerDetection { get; set; }

        /// <summary>
        /// Gets or Sets EnableMarkerDetectionDuringLibraryScan
        /// </summary>
        [DataMember(Name="EnableMarkerDetectionDuringLibraryScan", EmitDefaultValue=false)]
        public bool? EnableMarkerDetectionDuringLibraryScan { get; set; }

        /// <summary>
        /// Gets or Sets IntroDetectionFingerprintLength
        /// </summary>
        [DataMember(Name="IntroDetectionFingerprintLength", EmitDefaultValue=false)]
        public int? IntroDetectionFingerprintLength { get; set; }

        /// <summary>
        /// Gets or Sets EnableChapterImageExtraction
        /// </summary>
        [DataMember(Name="EnableChapterImageExtraction", EmitDefaultValue=false)]
        public bool? EnableChapterImageExtraction { get; set; }

        /// <summary>
        /// Gets or Sets ExtractChapterImagesDuringLibraryScan
        /// </summary>
        [DataMember(Name="ExtractChapterImagesDuringLibraryScan", EmitDefaultValue=false)]
        public bool? ExtractChapterImagesDuringLibraryScan { get; set; }

        /// <summary>
        /// Gets or Sets DownloadImagesInAdvance
        /// </summary>
        [DataMember(Name="DownloadImagesInAdvance", EmitDefaultValue=false)]
        public bool? DownloadImagesInAdvance { get; set; }

        /// <summary>
        /// Gets or Sets CacheImages
        /// </summary>
        [DataMember(Name="CacheImages", EmitDefaultValue=false)]
        public bool? CacheImages { get; set; }

        /// <summary>
        /// Gets or Sets ExcludeFromSearch
        /// </summary>
        [DataMember(Name="ExcludeFromSearch", EmitDefaultValue=false)]
        public bool? ExcludeFromSearch { get; set; }

        /// <summary>
        /// Gets or Sets EnablePlexIgnore
        /// </summary>
        [DataMember(Name="EnablePlexIgnore", EmitDefaultValue=false)]
        public bool? EnablePlexIgnore { get; set; }

        /// <summary>
        /// Gets or Sets PathInfos
        /// </summary>
        [DataMember(Name="PathInfos", EmitDefaultValue=false)]
        public List<MediaPathInfo> PathInfos { get; set; }

        /// <summary>
        /// Gets or Sets IgnoreHiddenFiles
        /// </summary>
        [DataMember(Name="IgnoreHiddenFiles", EmitDefaultValue=false)]
        public bool? IgnoreHiddenFiles { get; set; }

        /// <summary>
        /// Gets or Sets IgnoreFileExtensions
        /// </summary>
        [DataMember(Name="IgnoreFileExtensions", EmitDefaultValue=false)]
        public List<string> IgnoreFileExtensions { get; set; }

        /// <summary>
        /// Gets or Sets SaveLocalMetadata
        /// </summary>
        [DataMember(Name="SaveLocalMetadata", EmitDefaultValue=false)]
        public bool? SaveLocalMetadata { get; set; }

        /// <summary>
        /// Gets or Sets SaveMetadataHidden
        /// </summary>
        [DataMember(Name="SaveMetadataHidden", EmitDefaultValue=false)]
        public bool? SaveMetadataHidden { get; set; }

        /// <summary>
        /// Gets or Sets SaveLocalThumbnailSets
        /// </summary>
        [DataMember(Name="SaveLocalThumbnailSets", EmitDefaultValue=false)]
        public bool? SaveLocalThumbnailSets { get; set; }

        /// <summary>
        /// Gets or Sets ImportPlaylists
        /// </summary>
        [DataMember(Name="ImportPlaylists", EmitDefaultValue=false)]
        public bool? ImportPlaylists { get; set; }

        /// <summary>
        /// Gets or Sets EnableAutomaticSeriesGrouping
        /// </summary>
        [DataMember(Name="EnableAutomaticSeriesGrouping", EmitDefaultValue=false)]
        public bool? EnableAutomaticSeriesGrouping { get; set; }

        /// <summary>
        /// Gets or Sets ShareEmbeddedMusicAlbumImages
        /// </summary>
        [DataMember(Name="ShareEmbeddedMusicAlbumImages", EmitDefaultValue=false)]
        public bool? ShareEmbeddedMusicAlbumImages { get; set; }

        /// <summary>
        /// Gets or Sets EnableEmbeddedTitles
        /// </summary>
        [DataMember(Name="EnableEmbeddedTitles", EmitDefaultValue=false)]
        public bool? EnableEmbeddedTitles { get; set; }

        /// <summary>
        /// Gets or Sets EnableAudioResume
        /// </summary>
        [DataMember(Name="EnableAudioResume", EmitDefaultValue=false)]
        public bool? EnableAudioResume { get; set; }

        /// <summary>
        /// Gets or Sets AutoGenerateChapters
        /// </summary>
        [DataMember(Name="AutoGenerateChapters", EmitDefaultValue=false)]
        public bool? AutoGenerateChapters { get; set; }

        /// <summary>
        /// Gets or Sets MergeTopLevelFolders
        /// </summary>
        [DataMember(Name="MergeTopLevelFolders", EmitDefaultValue=false)]
        public bool? MergeTopLevelFolders { get; set; }

        /// <summary>
        /// Gets or Sets AutoGenerateChapterIntervalMinutes
        /// </summary>
        [DataMember(Name="AutoGenerateChapterIntervalMinutes", EmitDefaultValue=false)]
        public int? AutoGenerateChapterIntervalMinutes { get; set; }

        /// <summary>
        /// Gets or Sets AutomaticRefreshIntervalDays
        /// </summary>
        [DataMember(Name="AutomaticRefreshIntervalDays", EmitDefaultValue=false)]
        public int? AutomaticRefreshIntervalDays { get; set; }

        /// <summary>
        /// Gets or Sets PlaceholderMetadataRefreshIntervalDays
        /// </summary>
        [DataMember(Name="PlaceholderMetadataRefreshIntervalDays", EmitDefaultValue=false)]
        public int? PlaceholderMetadataRefreshIntervalDays { get; set; }

        /// <summary>
        /// The preferred metadata language.
        /// </summary>
        /// <value>The preferred metadata language.</value>
        [DataMember(Name="PreferredMetadataLanguage", EmitDefaultValue=false)]
        public string PreferredMetadataLanguage { get; set; }

        /// <summary>
        /// Gets or Sets PreferredImageLanguage
        /// </summary>
        [DataMember(Name="PreferredImageLanguage", EmitDefaultValue=false)]
        public string PreferredImageLanguage { get; set; }

        /// <summary>
        /// Gets or Sets ContentType
        /// </summary>
        [DataMember(Name="ContentType", EmitDefaultValue=false)]
        public string ContentType { get; set; }

        /// <summary>
        /// The metadata country code.
        /// </summary>
        /// <value>The metadata country code.</value>
        [DataMember(Name="MetadataCountryCode", EmitDefaultValue=false)]
        public string MetadataCountryCode { get; set; }

        /// <summary>
        /// Gets or Sets MetadataSavers
        /// </summary>
        [DataMember(Name="MetadataSavers", EmitDefaultValue=false)]
        public List<string> MetadataSavers { get; set; }

        /// <summary>
        /// Gets or Sets DisabledLocalMetadataReaders
        /// </summary>
        [DataMember(Name="DisabledLocalMetadataReaders", EmitDefaultValue=false)]
        public List<string> DisabledLocalMetadataReaders { get; set; }

        /// <summary>
        /// Gets or Sets LocalMetadataReaderOrder
        /// </summary>
        [DataMember(Name="LocalMetadataReaderOrder", EmitDefaultValue=false)]
        public List<string> LocalMetadataReaderOrder { get; set; }

        /// <summary>
        /// Gets or Sets DisabledLyricsFetchers
        /// </summary>
        [DataMember(Name="DisabledLyricsFetchers", EmitDefaultValue=false)]
        public List<string> DisabledLyricsFetchers { get; set; }

        /// <summary>
        /// Gets or Sets SaveLyricsWithMedia
        /// </summary>
        [DataMember(Name="SaveLyricsWithMedia", EmitDefaultValue=false)]
        public bool? SaveLyricsWithMedia { get; set; }

        /// <summary>
        /// Gets or Sets LyricsDownloadMaxAgeDays
        /// </summary>
        [DataMember(Name="LyricsDownloadMaxAgeDays", EmitDefaultValue=false)]
        public int? LyricsDownloadMaxAgeDays { get; set; }

        /// <summary>
        /// Gets or Sets LyricsFetcherOrder
        /// </summary>
        [DataMember(Name="LyricsFetcherOrder", EmitDefaultValue=false)]
        public List<string> LyricsFetcherOrder { get; set; }

        /// <summary>
        /// Gets or Sets LyricsDownloadLanguages
        /// </summary>
        [DataMember(Name="LyricsDownloadLanguages", EmitDefaultValue=false)]
        public List<string> LyricsDownloadLanguages { get; set; }

        /// <summary>
        /// Gets or Sets DisabledSubtitleFetchers
        /// </summary>
        [DataMember(Name="DisabledSubtitleFetchers", EmitDefaultValue=false)]
        public List<string> DisabledSubtitleFetchers { get; set; }

        /// <summary>
        /// Gets or Sets SubtitleFetcherOrder
        /// </summary>
        [DataMember(Name="SubtitleFetcherOrder", EmitDefaultValue=false)]
        public List<string> SubtitleFetcherOrder { get; set; }

        /// <summary>
        /// Gets or Sets SkipSubtitlesIfEmbeddedSubtitlesPresent
        /// </summary>
        [DataMember(Name="SkipSubtitlesIfEmbeddedSubtitlesPresent", EmitDefaultValue=false)]
        public bool? SkipSubtitlesIfEmbeddedSubtitlesPresent { get; set; }

        /// <summary>
        /// Gets or Sets SkipSubtitlesIfAudioTrackMatches
        /// </summary>
        [DataMember(Name="SkipSubtitlesIfAudioTrackMatches", EmitDefaultValue=false)]
        public bool? SkipSubtitlesIfAudioTrackMatches { get; set; }

        /// <summary>
        /// Gets or Sets SubtitleDownloadLanguages
        /// </summary>
        [DataMember(Name="SubtitleDownloadLanguages", EmitDefaultValue=false)]
        public List<string> SubtitleDownloadLanguages { get; set; }

        /// <summary>
        /// Gets or Sets SubtitleDownloadMaxAgeDays
        /// </summary>
        [DataMember(Name="SubtitleDownloadMaxAgeDays", EmitDefaultValue=false)]
        public int? SubtitleDownloadMaxAgeDays { get; set; }

        /// <summary>
        /// Gets or Sets RequirePerfectSubtitleMatch
        /// </summary>
        [DataMember(Name="RequirePerfectSubtitleMatch", EmitDefaultValue=false)]
        public bool? RequirePerfectSubtitleMatch { get; set; }

        /// <summary>
        /// Gets or Sets SaveSubtitlesWithMedia
        /// </summary>
        [DataMember(Name="SaveSubtitlesWithMedia", EmitDefaultValue=false)]
        public bool? SaveSubtitlesWithMedia { get; set; }

        /// <summary>
        /// Gets or Sets ForcedSubtitlesOnly
        /// </summary>
        [DataMember(Name="ForcedSubtitlesOnly", EmitDefaultValue=false)]
        public bool? ForcedSubtitlesOnly { get; set; }

        /// <summary>
        /// Gets or Sets HearingImpairedSubtitlesOnly
        /// </summary>
        [DataMember(Name="HearingImpairedSubtitlesOnly", EmitDefaultValue=false)]
        public bool? HearingImpairedSubtitlesOnly { get; set; }

        /// <summary>
        /// Gets or Sets TypeOptions
        /// </summary>
        [DataMember(Name="TypeOptions", EmitDefaultValue=false)]
        public List<TypeOptions> TypeOptions { get; set; }

        /// <summary>
        /// Gets or Sets CollapseSingleItemFolders
        /// </summary>
        [DataMember(Name="CollapseSingleItemFolders", EmitDefaultValue=false)]
        public bool? CollapseSingleItemFolders { get; set; }

        /// <summary>
        /// Gets or Sets EnableAdultMetadata
        /// </summary>
        [DataMember(Name="EnableAdultMetadata", EmitDefaultValue=false)]
        public bool? EnableAdultMetadata { get; set; }

        /// <summary>
        /// Gets or Sets ImportCollections
        /// </summary>
        [DataMember(Name="ImportCollections", EmitDefaultValue=false)]
        public bool? ImportCollections { get; set; }

        /// <summary>
        /// Gets or Sets EnableMultiVersionByFiles
        /// </summary>
        [DataMember(Name="EnableMultiVersionByFiles", EmitDefaultValue=false)]
        public bool? EnableMultiVersionByFiles { get; set; }

        /// <summary>
        /// Gets or Sets EnableMultiVersionByMetadata
        /// </summary>
        [DataMember(Name="EnableMultiVersionByMetadata", EmitDefaultValue=false)]
        public bool? EnableMultiVersionByMetadata { get; set; }

        /// <summary>
        /// Gets or Sets EnableMultiPartItems
        /// </summary>
        [DataMember(Name="EnableMultiPartItems", EmitDefaultValue=false)]
        public bool? EnableMultiPartItems { get; set; }

        /// <summary>
        /// Gets or Sets MinCollectionItems
        /// </summary>
        [DataMember(Name="MinCollectionItems", EmitDefaultValue=false)]
        public int? MinCollectionItems { get; set; }

        /// <summary>
        /// Gets or Sets MusicFolderStructure
        /// </summary>
        [DataMember(Name="MusicFolderStructure", EmitDefaultValue=false)]
        public string MusicFolderStructure { get; set; }

        /// <summary>
        /// The minimum percentage of an item that must be played in order for playstate to be updated.
        /// </summary>
        /// <value>The minimum percentage of an item that must be played in order for playstate to be updated.</value>
        [DataMember(Name="MinResumePct", EmitDefaultValue=false)]
        public int? MinResumePct { get; set; }

        /// <summary>
        /// The maximum percentage of an item that can be played while still saving playstate. If this percentage is crossed playstate will be reset to the beginning and the item will be marked watched.
        /// </summary>
        /// <value>The maximum percentage of an item that can be played while still saving playstate. If this percentage is crossed playstate will be reset to the beginning and the item will be marked watched.</value>
        [DataMember(Name="MaxResumePct", EmitDefaultValue=false)]
        public int? MaxResumePct { get; set; }

        /// <summary>
        /// The minimum duration that an item must have in order to be eligible for playstate updates..
        /// </summary>
        /// <value>The minimum duration that an item must have in order to be eligible for playstate updates..</value>
        [DataMember(Name="MinResumeDurationSeconds", EmitDefaultValue=false)]
        public int? MinResumeDurationSeconds { get; set; }

        /// <summary>
        /// Gets or Sets ThumbnailImagesIntervalSeconds
        /// </summary>
        [DataMember(Name="ThumbnailImagesIntervalSeconds", EmitDefaultValue=false)]
        public int? ThumbnailImagesIntervalSeconds { get; set; }

        /// <summary>
        /// Gets or Sets SampleIgnoreSize
        /// </summary>
        [DataMember(Name="SampleIgnoreSize", EmitDefaultValue=false)]
        public int? SampleIgnoreSize { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LibraryOptions {\n");
            sb.Append("  EnableArchiveMediaFiles: ").Append(EnableArchiveMediaFiles).Append("\n");
            sb.Append("  EnablePhotos: ").Append(EnablePhotos).Append("\n");
            sb.Append("  EnableRealtimeMonitor: ").Append(EnableRealtimeMonitor).Append("\n");
            sb.Append("  EnableMarkerDetection: ").Append(EnableMarkerDetection).Append("\n");
            sb.Append("  EnableMarkerDetectionDuringLibraryScan: ").Append(EnableMarkerDetectionDuringLibraryScan).Append("\n");
            sb.Append("  IntroDetectionFingerprintLength: ").Append(IntroDetectionFingerprintLength).Append("\n");
            sb.Append("  EnableChapterImageExtraction: ").Append(EnableChapterImageExtraction).Append("\n");
            sb.Append("  ExtractChapterImagesDuringLibraryScan: ").Append(ExtractChapterImagesDuringLibraryScan).Append("\n");
            sb.Append("  DownloadImagesInAdvance: ").Append(DownloadImagesInAdvance).Append("\n");
            sb.Append("  CacheImages: ").Append(CacheImages).Append("\n");
            sb.Append("  ExcludeFromSearch: ").Append(ExcludeFromSearch).Append("\n");
            sb.Append("  EnablePlexIgnore: ").Append(EnablePlexIgnore).Append("\n");
            sb.Append("  PathInfos: ").Append(PathInfos).Append("\n");
            sb.Append("  IgnoreHiddenFiles: ").Append(IgnoreHiddenFiles).Append("\n");
            sb.Append("  IgnoreFileExtensions: ").Append(IgnoreFileExtensions).Append("\n");
            sb.Append("  SaveLocalMetadata: ").Append(SaveLocalMetadata).Append("\n");
            sb.Append("  SaveMetadataHidden: ").Append(SaveMetadataHidden).Append("\n");
            sb.Append("  SaveLocalThumbnailSets: ").Append(SaveLocalThumbnailSets).Append("\n");
            sb.Append("  ImportPlaylists: ").Append(ImportPlaylists).Append("\n");
            sb.Append("  EnableAutomaticSeriesGrouping: ").Append(EnableAutomaticSeriesGrouping).Append("\n");
            sb.Append("  ShareEmbeddedMusicAlbumImages: ").Append(ShareEmbeddedMusicAlbumImages).Append("\n");
            sb.Append("  EnableEmbeddedTitles: ").Append(EnableEmbeddedTitles).Append("\n");
            sb.Append("  EnableAudioResume: ").Append(EnableAudioResume).Append("\n");
            sb.Append("  AutoGenerateChapters: ").Append(AutoGenerateChapters).Append("\n");
            sb.Append("  MergeTopLevelFolders: ").Append(MergeTopLevelFolders).Append("\n");
            sb.Append("  AutoGenerateChapterIntervalMinutes: ").Append(AutoGenerateChapterIntervalMinutes).Append("\n");
            sb.Append("  AutomaticRefreshIntervalDays: ").Append(AutomaticRefreshIntervalDays).Append("\n");
            sb.Append("  PlaceholderMetadataRefreshIntervalDays: ").Append(PlaceholderMetadataRefreshIntervalDays).Append("\n");
            sb.Append("  PreferredMetadataLanguage: ").Append(PreferredMetadataLanguage).Append("\n");
            sb.Append("  PreferredImageLanguage: ").Append(PreferredImageLanguage).Append("\n");
            sb.Append("  ContentType: ").Append(ContentType).Append("\n");
            sb.Append("  MetadataCountryCode: ").Append(MetadataCountryCode).Append("\n");
            sb.Append("  MetadataSavers: ").Append(MetadataSavers).Append("\n");
            sb.Append("  DisabledLocalMetadataReaders: ").Append(DisabledLocalMetadataReaders).Append("\n");
            sb.Append("  LocalMetadataReaderOrder: ").Append(LocalMetadataReaderOrder).Append("\n");
            sb.Append("  DisabledLyricsFetchers: ").Append(DisabledLyricsFetchers).Append("\n");
            sb.Append("  SaveLyricsWithMedia: ").Append(SaveLyricsWithMedia).Append("\n");
            sb.Append("  LyricsDownloadMaxAgeDays: ").Append(LyricsDownloadMaxAgeDays).Append("\n");
            sb.Append("  LyricsFetcherOrder: ").Append(LyricsFetcherOrder).Append("\n");
            sb.Append("  LyricsDownloadLanguages: ").Append(LyricsDownloadLanguages).Append("\n");
            sb.Append("  DisabledSubtitleFetchers: ").Append(DisabledSubtitleFetchers).Append("\n");
            sb.Append("  SubtitleFetcherOrder: ").Append(SubtitleFetcherOrder).Append("\n");
            sb.Append("  SkipSubtitlesIfEmbeddedSubtitlesPresent: ").Append(SkipSubtitlesIfEmbeddedSubtitlesPresent).Append("\n");
            sb.Append("  SkipSubtitlesIfAudioTrackMatches: ").Append(SkipSubtitlesIfAudioTrackMatches).Append("\n");
            sb.Append("  SubtitleDownloadLanguages: ").Append(SubtitleDownloadLanguages).Append("\n");
            sb.Append("  SubtitleDownloadMaxAgeDays: ").Append(SubtitleDownloadMaxAgeDays).Append("\n");
            sb.Append("  RequirePerfectSubtitleMatch: ").Append(RequirePerfectSubtitleMatch).Append("\n");
            sb.Append("  SaveSubtitlesWithMedia: ").Append(SaveSubtitlesWithMedia).Append("\n");
            sb.Append("  ForcedSubtitlesOnly: ").Append(ForcedSubtitlesOnly).Append("\n");
            sb.Append("  HearingImpairedSubtitlesOnly: ").Append(HearingImpairedSubtitlesOnly).Append("\n");
            sb.Append("  TypeOptions: ").Append(TypeOptions).Append("\n");
            sb.Append("  CollapseSingleItemFolders: ").Append(CollapseSingleItemFolders).Append("\n");
            sb.Append("  EnableAdultMetadata: ").Append(EnableAdultMetadata).Append("\n");
            sb.Append("  ImportCollections: ").Append(ImportCollections).Append("\n");
            sb.Append("  EnableMultiVersionByFiles: ").Append(EnableMultiVersionByFiles).Append("\n");
            sb.Append("  EnableMultiVersionByMetadata: ").Append(EnableMultiVersionByMetadata).Append("\n");
            sb.Append("  EnableMultiPartItems: ").Append(EnableMultiPartItems).Append("\n");
            sb.Append("  MinCollectionItems: ").Append(MinCollectionItems).Append("\n");
            sb.Append("  MusicFolderStructure: ").Append(MusicFolderStructure).Append("\n");
            sb.Append("  MinResumePct: ").Append(MinResumePct).Append("\n");
            sb.Append("  MaxResumePct: ").Append(MaxResumePct).Append("\n");
            sb.Append("  MinResumeDurationSeconds: ").Append(MinResumeDurationSeconds).Append("\n");
            sb.Append("  ThumbnailImagesIntervalSeconds: ").Append(ThumbnailImagesIntervalSeconds).Append("\n");
            sb.Append("  SampleIgnoreSize: ").Append(SampleIgnoreSize).Append("\n");
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
            return this.Equals(input as LibraryOptions);
        }

        /// <summary>
        /// Returns true if LibraryOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of LibraryOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LibraryOptions input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.EnableArchiveMediaFiles == input.EnableArchiveMediaFiles ||
                    (this.EnableArchiveMediaFiles != null &&
                    this.EnableArchiveMediaFiles.Equals(input.EnableArchiveMediaFiles))
                ) && 
                (
                    this.EnablePhotos == input.EnablePhotos ||
                    (this.EnablePhotos != null &&
                    this.EnablePhotos.Equals(input.EnablePhotos))
                ) && 
                (
                    this.EnableRealtimeMonitor == input.EnableRealtimeMonitor ||
                    (this.EnableRealtimeMonitor != null &&
                    this.EnableRealtimeMonitor.Equals(input.EnableRealtimeMonitor))
                ) && 
                (
                    this.EnableMarkerDetection == input.EnableMarkerDetection ||
                    (this.EnableMarkerDetection != null &&
                    this.EnableMarkerDetection.Equals(input.EnableMarkerDetection))
                ) && 
                (
                    this.EnableMarkerDetectionDuringLibraryScan == input.EnableMarkerDetectionDuringLibraryScan ||
                    (this.EnableMarkerDetectionDuringLibraryScan != null &&
                    this.EnableMarkerDetectionDuringLibraryScan.Equals(input.EnableMarkerDetectionDuringLibraryScan))
                ) && 
                (
                    this.IntroDetectionFingerprintLength == input.IntroDetectionFingerprintLength ||
                    (this.IntroDetectionFingerprintLength != null &&
                    this.IntroDetectionFingerprintLength.Equals(input.IntroDetectionFingerprintLength))
                ) && 
                (
                    this.EnableChapterImageExtraction == input.EnableChapterImageExtraction ||
                    (this.EnableChapterImageExtraction != null &&
                    this.EnableChapterImageExtraction.Equals(input.EnableChapterImageExtraction))
                ) && 
                (
                    this.ExtractChapterImagesDuringLibraryScan == input.ExtractChapterImagesDuringLibraryScan ||
                    (this.ExtractChapterImagesDuringLibraryScan != null &&
                    this.ExtractChapterImagesDuringLibraryScan.Equals(input.ExtractChapterImagesDuringLibraryScan))
                ) && 
                (
                    this.DownloadImagesInAdvance == input.DownloadImagesInAdvance ||
                    (this.DownloadImagesInAdvance != null &&
                    this.DownloadImagesInAdvance.Equals(input.DownloadImagesInAdvance))
                ) && 
                (
                    this.CacheImages == input.CacheImages ||
                    (this.CacheImages != null &&
                    this.CacheImages.Equals(input.CacheImages))
                ) && 
                (
                    this.ExcludeFromSearch == input.ExcludeFromSearch ||
                    (this.ExcludeFromSearch != null &&
                    this.ExcludeFromSearch.Equals(input.ExcludeFromSearch))
                ) && 
                (
                    this.EnablePlexIgnore == input.EnablePlexIgnore ||
                    (this.EnablePlexIgnore != null &&
                    this.EnablePlexIgnore.Equals(input.EnablePlexIgnore))
                ) && 
                (
                    this.PathInfos == input.PathInfos ||
                    this.PathInfos != null &&
                    input.PathInfos != null &&
                    this.PathInfos.SequenceEqual(input.PathInfos)
                ) && 
                (
                    this.IgnoreHiddenFiles == input.IgnoreHiddenFiles ||
                    (this.IgnoreHiddenFiles != null &&
                    this.IgnoreHiddenFiles.Equals(input.IgnoreHiddenFiles))
                ) && 
                (
                    this.IgnoreFileExtensions == input.IgnoreFileExtensions ||
                    this.IgnoreFileExtensions != null &&
                    input.IgnoreFileExtensions != null &&
                    this.IgnoreFileExtensions.SequenceEqual(input.IgnoreFileExtensions)
                ) && 
                (
                    this.SaveLocalMetadata == input.SaveLocalMetadata ||
                    (this.SaveLocalMetadata != null &&
                    this.SaveLocalMetadata.Equals(input.SaveLocalMetadata))
                ) && 
                (
                    this.SaveMetadataHidden == input.SaveMetadataHidden ||
                    (this.SaveMetadataHidden != null &&
                    this.SaveMetadataHidden.Equals(input.SaveMetadataHidden))
                ) && 
                (
                    this.SaveLocalThumbnailSets == input.SaveLocalThumbnailSets ||
                    (this.SaveLocalThumbnailSets != null &&
                    this.SaveLocalThumbnailSets.Equals(input.SaveLocalThumbnailSets))
                ) && 
                (
                    this.ImportPlaylists == input.ImportPlaylists ||
                    (this.ImportPlaylists != null &&
                    this.ImportPlaylists.Equals(input.ImportPlaylists))
                ) && 
                (
                    this.EnableAutomaticSeriesGrouping == input.EnableAutomaticSeriesGrouping ||
                    (this.EnableAutomaticSeriesGrouping != null &&
                    this.EnableAutomaticSeriesGrouping.Equals(input.EnableAutomaticSeriesGrouping))
                ) && 
                (
                    this.ShareEmbeddedMusicAlbumImages == input.ShareEmbeddedMusicAlbumImages ||
                    (this.ShareEmbeddedMusicAlbumImages != null &&
                    this.ShareEmbeddedMusicAlbumImages.Equals(input.ShareEmbeddedMusicAlbumImages))
                ) && 
                (
                    this.EnableEmbeddedTitles == input.EnableEmbeddedTitles ||
                    (this.EnableEmbeddedTitles != null &&
                    this.EnableEmbeddedTitles.Equals(input.EnableEmbeddedTitles))
                ) && 
                (
                    this.EnableAudioResume == input.EnableAudioResume ||
                    (this.EnableAudioResume != null &&
                    this.EnableAudioResume.Equals(input.EnableAudioResume))
                ) && 
                (
                    this.AutoGenerateChapters == input.AutoGenerateChapters ||
                    (this.AutoGenerateChapters != null &&
                    this.AutoGenerateChapters.Equals(input.AutoGenerateChapters))
                ) && 
                (
                    this.MergeTopLevelFolders == input.MergeTopLevelFolders ||
                    (this.MergeTopLevelFolders != null &&
                    this.MergeTopLevelFolders.Equals(input.MergeTopLevelFolders))
                ) && 
                (
                    this.AutoGenerateChapterIntervalMinutes == input.AutoGenerateChapterIntervalMinutes ||
                    (this.AutoGenerateChapterIntervalMinutes != null &&
                    this.AutoGenerateChapterIntervalMinutes.Equals(input.AutoGenerateChapterIntervalMinutes))
                ) && 
                (
                    this.AutomaticRefreshIntervalDays == input.AutomaticRefreshIntervalDays ||
                    (this.AutomaticRefreshIntervalDays != null &&
                    this.AutomaticRefreshIntervalDays.Equals(input.AutomaticRefreshIntervalDays))
                ) && 
                (
                    this.PlaceholderMetadataRefreshIntervalDays == input.PlaceholderMetadataRefreshIntervalDays ||
                    (this.PlaceholderMetadataRefreshIntervalDays != null &&
                    this.PlaceholderMetadataRefreshIntervalDays.Equals(input.PlaceholderMetadataRefreshIntervalDays))
                ) && 
                (
                    this.PreferredMetadataLanguage == input.PreferredMetadataLanguage ||
                    (this.PreferredMetadataLanguage != null &&
                    this.PreferredMetadataLanguage.Equals(input.PreferredMetadataLanguage))
                ) && 
                (
                    this.PreferredImageLanguage == input.PreferredImageLanguage ||
                    (this.PreferredImageLanguage != null &&
                    this.PreferredImageLanguage.Equals(input.PreferredImageLanguage))
                ) && 
                (
                    this.ContentType == input.ContentType ||
                    (this.ContentType != null &&
                    this.ContentType.Equals(input.ContentType))
                ) && 
                (
                    this.MetadataCountryCode == input.MetadataCountryCode ||
                    (this.MetadataCountryCode != null &&
                    this.MetadataCountryCode.Equals(input.MetadataCountryCode))
                ) && 
                (
                    this.MetadataSavers == input.MetadataSavers ||
                    this.MetadataSavers != null &&
                    input.MetadataSavers != null &&
                    this.MetadataSavers.SequenceEqual(input.MetadataSavers)
                ) && 
                (
                    this.DisabledLocalMetadataReaders == input.DisabledLocalMetadataReaders ||
                    this.DisabledLocalMetadataReaders != null &&
                    input.DisabledLocalMetadataReaders != null &&
                    this.DisabledLocalMetadataReaders.SequenceEqual(input.DisabledLocalMetadataReaders)
                ) && 
                (
                    this.LocalMetadataReaderOrder == input.LocalMetadataReaderOrder ||
                    this.LocalMetadataReaderOrder != null &&
                    input.LocalMetadataReaderOrder != null &&
                    this.LocalMetadataReaderOrder.SequenceEqual(input.LocalMetadataReaderOrder)
                ) && 
                (
                    this.DisabledLyricsFetchers == input.DisabledLyricsFetchers ||
                    this.DisabledLyricsFetchers != null &&
                    input.DisabledLyricsFetchers != null &&
                    this.DisabledLyricsFetchers.SequenceEqual(input.DisabledLyricsFetchers)
                ) && 
                (
                    this.SaveLyricsWithMedia == input.SaveLyricsWithMedia ||
                    (this.SaveLyricsWithMedia != null &&
                    this.SaveLyricsWithMedia.Equals(input.SaveLyricsWithMedia))
                ) && 
                (
                    this.LyricsDownloadMaxAgeDays == input.LyricsDownloadMaxAgeDays ||
                    (this.LyricsDownloadMaxAgeDays != null &&
                    this.LyricsDownloadMaxAgeDays.Equals(input.LyricsDownloadMaxAgeDays))
                ) && 
                (
                    this.LyricsFetcherOrder == input.LyricsFetcherOrder ||
                    this.LyricsFetcherOrder != null &&
                    input.LyricsFetcherOrder != null &&
                    this.LyricsFetcherOrder.SequenceEqual(input.LyricsFetcherOrder)
                ) && 
                (
                    this.LyricsDownloadLanguages == input.LyricsDownloadLanguages ||
                    this.LyricsDownloadLanguages != null &&
                    input.LyricsDownloadLanguages != null &&
                    this.LyricsDownloadLanguages.SequenceEqual(input.LyricsDownloadLanguages)
                ) && 
                (
                    this.DisabledSubtitleFetchers == input.DisabledSubtitleFetchers ||
                    this.DisabledSubtitleFetchers != null &&
                    input.DisabledSubtitleFetchers != null &&
                    this.DisabledSubtitleFetchers.SequenceEqual(input.DisabledSubtitleFetchers)
                ) && 
                (
                    this.SubtitleFetcherOrder == input.SubtitleFetcherOrder ||
                    this.SubtitleFetcherOrder != null &&
                    input.SubtitleFetcherOrder != null &&
                    this.SubtitleFetcherOrder.SequenceEqual(input.SubtitleFetcherOrder)
                ) && 
                (
                    this.SkipSubtitlesIfEmbeddedSubtitlesPresent == input.SkipSubtitlesIfEmbeddedSubtitlesPresent ||
                    (this.SkipSubtitlesIfEmbeddedSubtitlesPresent != null &&
                    this.SkipSubtitlesIfEmbeddedSubtitlesPresent.Equals(input.SkipSubtitlesIfEmbeddedSubtitlesPresent))
                ) && 
                (
                    this.SkipSubtitlesIfAudioTrackMatches == input.SkipSubtitlesIfAudioTrackMatches ||
                    (this.SkipSubtitlesIfAudioTrackMatches != null &&
                    this.SkipSubtitlesIfAudioTrackMatches.Equals(input.SkipSubtitlesIfAudioTrackMatches))
                ) && 
                (
                    this.SubtitleDownloadLanguages == input.SubtitleDownloadLanguages ||
                    this.SubtitleDownloadLanguages != null &&
                    input.SubtitleDownloadLanguages != null &&
                    this.SubtitleDownloadLanguages.SequenceEqual(input.SubtitleDownloadLanguages)
                ) && 
                (
                    this.SubtitleDownloadMaxAgeDays == input.SubtitleDownloadMaxAgeDays ||
                    (this.SubtitleDownloadMaxAgeDays != null &&
                    this.SubtitleDownloadMaxAgeDays.Equals(input.SubtitleDownloadMaxAgeDays))
                ) && 
                (
                    this.RequirePerfectSubtitleMatch == input.RequirePerfectSubtitleMatch ||
                    (this.RequirePerfectSubtitleMatch != null &&
                    this.RequirePerfectSubtitleMatch.Equals(input.RequirePerfectSubtitleMatch))
                ) && 
                (
                    this.SaveSubtitlesWithMedia == input.SaveSubtitlesWithMedia ||
                    (this.SaveSubtitlesWithMedia != null &&
                    this.SaveSubtitlesWithMedia.Equals(input.SaveSubtitlesWithMedia))
                ) && 
                (
                    this.ForcedSubtitlesOnly == input.ForcedSubtitlesOnly ||
                    (this.ForcedSubtitlesOnly != null &&
                    this.ForcedSubtitlesOnly.Equals(input.ForcedSubtitlesOnly))
                ) && 
                (
                    this.HearingImpairedSubtitlesOnly == input.HearingImpairedSubtitlesOnly ||
                    (this.HearingImpairedSubtitlesOnly != null &&
                    this.HearingImpairedSubtitlesOnly.Equals(input.HearingImpairedSubtitlesOnly))
                ) && 
                (
                    this.TypeOptions == input.TypeOptions ||
                    this.TypeOptions != null &&
                    input.TypeOptions != null &&
                    this.TypeOptions.SequenceEqual(input.TypeOptions)
                ) && 
                (
                    this.CollapseSingleItemFolders == input.CollapseSingleItemFolders ||
                    (this.CollapseSingleItemFolders != null &&
                    this.CollapseSingleItemFolders.Equals(input.CollapseSingleItemFolders))
                ) && 
                (
                    this.EnableAdultMetadata == input.EnableAdultMetadata ||
                    (this.EnableAdultMetadata != null &&
                    this.EnableAdultMetadata.Equals(input.EnableAdultMetadata))
                ) && 
                (
                    this.ImportCollections == input.ImportCollections ||
                    (this.ImportCollections != null &&
                    this.ImportCollections.Equals(input.ImportCollections))
                ) && 
                (
                    this.EnableMultiVersionByFiles == input.EnableMultiVersionByFiles ||
                    (this.EnableMultiVersionByFiles != null &&
                    this.EnableMultiVersionByFiles.Equals(input.EnableMultiVersionByFiles))
                ) && 
                (
                    this.EnableMultiVersionByMetadata == input.EnableMultiVersionByMetadata ||
                    (this.EnableMultiVersionByMetadata != null &&
                    this.EnableMultiVersionByMetadata.Equals(input.EnableMultiVersionByMetadata))
                ) && 
                (
                    this.EnableMultiPartItems == input.EnableMultiPartItems ||
                    (this.EnableMultiPartItems != null &&
                    this.EnableMultiPartItems.Equals(input.EnableMultiPartItems))
                ) && 
                (
                    this.MinCollectionItems == input.MinCollectionItems ||
                    (this.MinCollectionItems != null &&
                    this.MinCollectionItems.Equals(input.MinCollectionItems))
                ) && 
                (
                    this.MusicFolderStructure == input.MusicFolderStructure ||
                    (this.MusicFolderStructure != null &&
                    this.MusicFolderStructure.Equals(input.MusicFolderStructure))
                ) && 
                (
                    this.MinResumePct == input.MinResumePct ||
                    (this.MinResumePct != null &&
                    this.MinResumePct.Equals(input.MinResumePct))
                ) && 
                (
                    this.MaxResumePct == input.MaxResumePct ||
                    (this.MaxResumePct != null &&
                    this.MaxResumePct.Equals(input.MaxResumePct))
                ) && 
                (
                    this.MinResumeDurationSeconds == input.MinResumeDurationSeconds ||
                    (this.MinResumeDurationSeconds != null &&
                    this.MinResumeDurationSeconds.Equals(input.MinResumeDurationSeconds))
                ) && 
                (
                    this.ThumbnailImagesIntervalSeconds == input.ThumbnailImagesIntervalSeconds ||
                    (this.ThumbnailImagesIntervalSeconds != null &&
                    this.ThumbnailImagesIntervalSeconds.Equals(input.ThumbnailImagesIntervalSeconds))
                ) && 
                (
                    this.SampleIgnoreSize == input.SampleIgnoreSize ||
                    (this.SampleIgnoreSize != null &&
                    this.SampleIgnoreSize.Equals(input.SampleIgnoreSize))
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
                if (this.EnableArchiveMediaFiles != null)
                    hashCode = hashCode * 59 + this.EnableArchiveMediaFiles.GetHashCode();
                if (this.EnablePhotos != null)
                    hashCode = hashCode * 59 + this.EnablePhotos.GetHashCode();
                if (this.EnableRealtimeMonitor != null)
                    hashCode = hashCode * 59 + this.EnableRealtimeMonitor.GetHashCode();
                if (this.EnableMarkerDetection != null)
                    hashCode = hashCode * 59 + this.EnableMarkerDetection.GetHashCode();
                if (this.EnableMarkerDetectionDuringLibraryScan != null)
                    hashCode = hashCode * 59 + this.EnableMarkerDetectionDuringLibraryScan.GetHashCode();
                if (this.IntroDetectionFingerprintLength != null)
                    hashCode = hashCode * 59 + this.IntroDetectionFingerprintLength.GetHashCode();
                if (this.EnableChapterImageExtraction != null)
                    hashCode = hashCode * 59 + this.EnableChapterImageExtraction.GetHashCode();
                if (this.ExtractChapterImagesDuringLibraryScan != null)
                    hashCode = hashCode * 59 + this.ExtractChapterImagesDuringLibraryScan.GetHashCode();
                if (this.DownloadImagesInAdvance != null)
                    hashCode = hashCode * 59 + this.DownloadImagesInAdvance.GetHashCode();
                if (this.CacheImages != null)
                    hashCode = hashCode * 59 + this.CacheImages.GetHashCode();
                if (this.ExcludeFromSearch != null)
                    hashCode = hashCode * 59 + this.ExcludeFromSearch.GetHashCode();
                if (this.EnablePlexIgnore != null)
                    hashCode = hashCode * 59 + this.EnablePlexIgnore.GetHashCode();
                if (this.PathInfos != null)
                    hashCode = hashCode * 59 + this.PathInfos.GetHashCode();
                if (this.IgnoreHiddenFiles != null)
                    hashCode = hashCode * 59 + this.IgnoreHiddenFiles.GetHashCode();
                if (this.IgnoreFileExtensions != null)
                    hashCode = hashCode * 59 + this.IgnoreFileExtensions.GetHashCode();
                if (this.SaveLocalMetadata != null)
                    hashCode = hashCode * 59 + this.SaveLocalMetadata.GetHashCode();
                if (this.SaveMetadataHidden != null)
                    hashCode = hashCode * 59 + this.SaveMetadataHidden.GetHashCode();
                if (this.SaveLocalThumbnailSets != null)
                    hashCode = hashCode * 59 + this.SaveLocalThumbnailSets.GetHashCode();
                if (this.ImportPlaylists != null)
                    hashCode = hashCode * 59 + this.ImportPlaylists.GetHashCode();
                if (this.EnableAutomaticSeriesGrouping != null)
                    hashCode = hashCode * 59 + this.EnableAutomaticSeriesGrouping.GetHashCode();
                if (this.ShareEmbeddedMusicAlbumImages != null)
                    hashCode = hashCode * 59 + this.ShareEmbeddedMusicAlbumImages.GetHashCode();
                if (this.EnableEmbeddedTitles != null)
                    hashCode = hashCode * 59 + this.EnableEmbeddedTitles.GetHashCode();
                if (this.EnableAudioResume != null)
                    hashCode = hashCode * 59 + this.EnableAudioResume.GetHashCode();
                if (this.AutoGenerateChapters != null)
                    hashCode = hashCode * 59 + this.AutoGenerateChapters.GetHashCode();
                if (this.MergeTopLevelFolders != null)
                    hashCode = hashCode * 59 + this.MergeTopLevelFolders.GetHashCode();
                if (this.AutoGenerateChapterIntervalMinutes != null)
                    hashCode = hashCode * 59 + this.AutoGenerateChapterIntervalMinutes.GetHashCode();
                if (this.AutomaticRefreshIntervalDays != null)
                    hashCode = hashCode * 59 + this.AutomaticRefreshIntervalDays.GetHashCode();
                if (this.PlaceholderMetadataRefreshIntervalDays != null)
                    hashCode = hashCode * 59 + this.PlaceholderMetadataRefreshIntervalDays.GetHashCode();
                if (this.PreferredMetadataLanguage != null)
                    hashCode = hashCode * 59 + this.PreferredMetadataLanguage.GetHashCode();
                if (this.PreferredImageLanguage != null)
                    hashCode = hashCode * 59 + this.PreferredImageLanguage.GetHashCode();
                if (this.ContentType != null)
                    hashCode = hashCode * 59 + this.ContentType.GetHashCode();
                if (this.MetadataCountryCode != null)
                    hashCode = hashCode * 59 + this.MetadataCountryCode.GetHashCode();
                if (this.MetadataSavers != null)
                    hashCode = hashCode * 59 + this.MetadataSavers.GetHashCode();
                if (this.DisabledLocalMetadataReaders != null)
                    hashCode = hashCode * 59 + this.DisabledLocalMetadataReaders.GetHashCode();
                if (this.LocalMetadataReaderOrder != null)
                    hashCode = hashCode * 59 + this.LocalMetadataReaderOrder.GetHashCode();
                if (this.DisabledLyricsFetchers != null)
                    hashCode = hashCode * 59 + this.DisabledLyricsFetchers.GetHashCode();
                if (this.SaveLyricsWithMedia != null)
                    hashCode = hashCode * 59 + this.SaveLyricsWithMedia.GetHashCode();
                if (this.LyricsDownloadMaxAgeDays != null)
                    hashCode = hashCode * 59 + this.LyricsDownloadMaxAgeDays.GetHashCode();
                if (this.LyricsFetcherOrder != null)
                    hashCode = hashCode * 59 + this.LyricsFetcherOrder.GetHashCode();
                if (this.LyricsDownloadLanguages != null)
                    hashCode = hashCode * 59 + this.LyricsDownloadLanguages.GetHashCode();
                if (this.DisabledSubtitleFetchers != null)
                    hashCode = hashCode * 59 + this.DisabledSubtitleFetchers.GetHashCode();
                if (this.SubtitleFetcherOrder != null)
                    hashCode = hashCode * 59 + this.SubtitleFetcherOrder.GetHashCode();
                if (this.SkipSubtitlesIfEmbeddedSubtitlesPresent != null)
                    hashCode = hashCode * 59 + this.SkipSubtitlesIfEmbeddedSubtitlesPresent.GetHashCode();
                if (this.SkipSubtitlesIfAudioTrackMatches != null)
                    hashCode = hashCode * 59 + this.SkipSubtitlesIfAudioTrackMatches.GetHashCode();
                if (this.SubtitleDownloadLanguages != null)
                    hashCode = hashCode * 59 + this.SubtitleDownloadLanguages.GetHashCode();
                if (this.SubtitleDownloadMaxAgeDays != null)
                    hashCode = hashCode * 59 + this.SubtitleDownloadMaxAgeDays.GetHashCode();
                if (this.RequirePerfectSubtitleMatch != null)
                    hashCode = hashCode * 59 + this.RequirePerfectSubtitleMatch.GetHashCode();
                if (this.SaveSubtitlesWithMedia != null)
                    hashCode = hashCode * 59 + this.SaveSubtitlesWithMedia.GetHashCode();
                if (this.ForcedSubtitlesOnly != null)
                    hashCode = hashCode * 59 + this.ForcedSubtitlesOnly.GetHashCode();
                if (this.HearingImpairedSubtitlesOnly != null)
                    hashCode = hashCode * 59 + this.HearingImpairedSubtitlesOnly.GetHashCode();
                if (this.TypeOptions != null)
                    hashCode = hashCode * 59 + this.TypeOptions.GetHashCode();
                if (this.CollapseSingleItemFolders != null)
                    hashCode = hashCode * 59 + this.CollapseSingleItemFolders.GetHashCode();
                if (this.EnableAdultMetadata != null)
                    hashCode = hashCode * 59 + this.EnableAdultMetadata.GetHashCode();
                if (this.ImportCollections != null)
                    hashCode = hashCode * 59 + this.ImportCollections.GetHashCode();
                if (this.EnableMultiVersionByFiles != null)
                    hashCode = hashCode * 59 + this.EnableMultiVersionByFiles.GetHashCode();
                if (this.EnableMultiVersionByMetadata != null)
                    hashCode = hashCode * 59 + this.EnableMultiVersionByMetadata.GetHashCode();
                if (this.EnableMultiPartItems != null)
                    hashCode = hashCode * 59 + this.EnableMultiPartItems.GetHashCode();
                if (this.MinCollectionItems != null)
                    hashCode = hashCode * 59 + this.MinCollectionItems.GetHashCode();
                if (this.MusicFolderStructure != null)
                    hashCode = hashCode * 59 + this.MusicFolderStructure.GetHashCode();
                if (this.MinResumePct != null)
                    hashCode = hashCode * 59 + this.MinResumePct.GetHashCode();
                if (this.MaxResumePct != null)
                    hashCode = hashCode * 59 + this.MaxResumePct.GetHashCode();
                if (this.MinResumeDurationSeconds != null)
                    hashCode = hashCode * 59 + this.MinResumeDurationSeconds.GetHashCode();
                if (this.ThumbnailImagesIntervalSeconds != null)
                    hashCode = hashCode * 59 + this.ThumbnailImagesIntervalSeconds.GetHashCode();
                if (this.SampleIgnoreSize != null)
                    hashCode = hashCode * 59 + this.SampleIgnoreSize.GetHashCode();
                return hashCode;
            }
        }

    }
}
