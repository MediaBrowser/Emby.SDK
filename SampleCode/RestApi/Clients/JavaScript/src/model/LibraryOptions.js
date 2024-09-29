/**
 * Emby Server REST API
 * Explore the Emby Server API
 *
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import MediaPathInfo from './MediaPathInfo';
import TypeOptions from './TypeOptions';

/**
* The LibraryOptions model module.
* @module model/LibraryOptions
* @version 4.8.10.0
*/
export default class LibraryOptions {
    /**
    * Constructs a new <code>LibraryOptions</code>.
    * @alias module:model/LibraryOptions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryOptions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryOptions} obj Optional instance to populate.
    * @return {module:model/LibraryOptions} The populated <code>LibraryOptions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryOptions();
                        
            
            if (data.hasOwnProperty('EnableArchiveMediaFiles')) {
                obj['EnableArchiveMediaFiles'] = ApiClient.convertToType(data['EnableArchiveMediaFiles'], 'Boolean');
            }
            if (data.hasOwnProperty('EnablePhotos')) {
                obj['EnablePhotos'] = ApiClient.convertToType(data['EnablePhotos'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableRealtimeMonitor')) {
                obj['EnableRealtimeMonitor'] = ApiClient.convertToType(data['EnableRealtimeMonitor'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableMarkerDetection')) {
                obj['EnableMarkerDetection'] = ApiClient.convertToType(data['EnableMarkerDetection'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableMarkerDetectionDuringLibraryScan')) {
                obj['EnableMarkerDetectionDuringLibraryScan'] = ApiClient.convertToType(data['EnableMarkerDetectionDuringLibraryScan'], 'Boolean');
            }
            if (data.hasOwnProperty('IntroDetectionFingerprintLength')) {
                obj['IntroDetectionFingerprintLength'] = ApiClient.convertToType(data['IntroDetectionFingerprintLength'], 'Number');
            }
            if (data.hasOwnProperty('EnableChapterImageExtraction')) {
                obj['EnableChapterImageExtraction'] = ApiClient.convertToType(data['EnableChapterImageExtraction'], 'Boolean');
            }
            if (data.hasOwnProperty('ExtractChapterImagesDuringLibraryScan')) {
                obj['ExtractChapterImagesDuringLibraryScan'] = ApiClient.convertToType(data['ExtractChapterImagesDuringLibraryScan'], 'Boolean');
            }
            if (data.hasOwnProperty('DownloadImagesInAdvance')) {
                obj['DownloadImagesInAdvance'] = ApiClient.convertToType(data['DownloadImagesInAdvance'], 'Boolean');
            }
            if (data.hasOwnProperty('CacheImages')) {
                obj['CacheImages'] = ApiClient.convertToType(data['CacheImages'], 'Boolean');
            }
            if (data.hasOwnProperty('PathInfos')) {
                obj['PathInfos'] = ApiClient.convertToType(data['PathInfos'], [MediaPathInfo]);
            }
            if (data.hasOwnProperty('IgnoreHiddenFiles')) {
                obj['IgnoreHiddenFiles'] = ApiClient.convertToType(data['IgnoreHiddenFiles'], 'Boolean');
            }
            if (data.hasOwnProperty('IgnoreFileExtensions')) {
                obj['IgnoreFileExtensions'] = ApiClient.convertToType(data['IgnoreFileExtensions'], ['String']);
            }
            if (data.hasOwnProperty('SaveLocalMetadata')) {
                obj['SaveLocalMetadata'] = ApiClient.convertToType(data['SaveLocalMetadata'], 'Boolean');
            }
            if (data.hasOwnProperty('SaveMetadataHidden')) {
                obj['SaveMetadataHidden'] = ApiClient.convertToType(data['SaveMetadataHidden'], 'Boolean');
            }
            if (data.hasOwnProperty('SaveLocalThumbnailSets')) {
                obj['SaveLocalThumbnailSets'] = ApiClient.convertToType(data['SaveLocalThumbnailSets'], 'Boolean');
            }
            if (data.hasOwnProperty('ImportPlaylists')) {
                obj['ImportPlaylists'] = ApiClient.convertToType(data['ImportPlaylists'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableAutomaticSeriesGrouping')) {
                obj['EnableAutomaticSeriesGrouping'] = ApiClient.convertToType(data['EnableAutomaticSeriesGrouping'], 'Boolean');
            }
            if (data.hasOwnProperty('ShareEmbeddedMusicAlbumImages')) {
                obj['ShareEmbeddedMusicAlbumImages'] = ApiClient.convertToType(data['ShareEmbeddedMusicAlbumImages'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableEmbeddedTitles')) {
                obj['EnableEmbeddedTitles'] = ApiClient.convertToType(data['EnableEmbeddedTitles'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableAudioResume')) {
                obj['EnableAudioResume'] = ApiClient.convertToType(data['EnableAudioResume'], 'Boolean');
            }
            if (data.hasOwnProperty('AutoGenerateChapters')) {
                obj['AutoGenerateChapters'] = ApiClient.convertToType(data['AutoGenerateChapters'], 'Boolean');
            }
            if (data.hasOwnProperty('AutomaticRefreshIntervalDays')) {
                obj['AutomaticRefreshIntervalDays'] = ApiClient.convertToType(data['AutomaticRefreshIntervalDays'], 'Number');
            }
            if (data.hasOwnProperty('PlaceholderMetadataRefreshIntervalDays')) {
                obj['PlaceholderMetadataRefreshIntervalDays'] = ApiClient.convertToType(data['PlaceholderMetadataRefreshIntervalDays'], 'Number');
            }
            if (data.hasOwnProperty('PreferredMetadataLanguage')) {
                obj['PreferredMetadataLanguage'] = ApiClient.convertToType(data['PreferredMetadataLanguage'], 'String');
            }
            if (data.hasOwnProperty('PreferredImageLanguage')) {
                obj['PreferredImageLanguage'] = ApiClient.convertToType(data['PreferredImageLanguage'], 'String');
            }
            if (data.hasOwnProperty('ContentType')) {
                obj['ContentType'] = ApiClient.convertToType(data['ContentType'], 'String');
            }
            if (data.hasOwnProperty('MetadataCountryCode')) {
                obj['MetadataCountryCode'] = ApiClient.convertToType(data['MetadataCountryCode'], 'String');
            }
            if (data.hasOwnProperty('MetadataSavers')) {
                obj['MetadataSavers'] = ApiClient.convertToType(data['MetadataSavers'], ['String']);
            }
            if (data.hasOwnProperty('DisabledLocalMetadataReaders')) {
                obj['DisabledLocalMetadataReaders'] = ApiClient.convertToType(data['DisabledLocalMetadataReaders'], ['String']);
            }
            if (data.hasOwnProperty('LocalMetadataReaderOrder')) {
                obj['LocalMetadataReaderOrder'] = ApiClient.convertToType(data['LocalMetadataReaderOrder'], ['String']);
            }
            if (data.hasOwnProperty('DisabledLyricsFetchers')) {
                obj['DisabledLyricsFetchers'] = ApiClient.convertToType(data['DisabledLyricsFetchers'], ['String']);
            }
            if (data.hasOwnProperty('SaveLyricsWithMedia')) {
                obj['SaveLyricsWithMedia'] = ApiClient.convertToType(data['SaveLyricsWithMedia'], 'Boolean');
            }
            if (data.hasOwnProperty('LyricsDownloadMaxAgeDays')) {
                obj['LyricsDownloadMaxAgeDays'] = ApiClient.convertToType(data['LyricsDownloadMaxAgeDays'], 'Number');
            }
            if (data.hasOwnProperty('LyricsFetcherOrder')) {
                obj['LyricsFetcherOrder'] = ApiClient.convertToType(data['LyricsFetcherOrder'], ['String']);
            }
            if (data.hasOwnProperty('LyricsDownloadLanguages')) {
                obj['LyricsDownloadLanguages'] = ApiClient.convertToType(data['LyricsDownloadLanguages'], ['String']);
            }
            if (data.hasOwnProperty('DisabledSubtitleFetchers')) {
                obj['DisabledSubtitleFetchers'] = ApiClient.convertToType(data['DisabledSubtitleFetchers'], ['String']);
            }
            if (data.hasOwnProperty('SubtitleFetcherOrder')) {
                obj['SubtitleFetcherOrder'] = ApiClient.convertToType(data['SubtitleFetcherOrder'], ['String']);
            }
            if (data.hasOwnProperty('SkipSubtitlesIfEmbeddedSubtitlesPresent')) {
                obj['SkipSubtitlesIfEmbeddedSubtitlesPresent'] = ApiClient.convertToType(data['SkipSubtitlesIfEmbeddedSubtitlesPresent'], 'Boolean');
            }
            if (data.hasOwnProperty('SkipSubtitlesIfAudioTrackMatches')) {
                obj['SkipSubtitlesIfAudioTrackMatches'] = ApiClient.convertToType(data['SkipSubtitlesIfAudioTrackMatches'], 'Boolean');
            }
            if (data.hasOwnProperty('SubtitleDownloadLanguages')) {
                obj['SubtitleDownloadLanguages'] = ApiClient.convertToType(data['SubtitleDownloadLanguages'], ['String']);
            }
            if (data.hasOwnProperty('SubtitleDownloadMaxAgeDays')) {
                obj['SubtitleDownloadMaxAgeDays'] = ApiClient.convertToType(data['SubtitleDownloadMaxAgeDays'], 'Number');
            }
            if (data.hasOwnProperty('RequirePerfectSubtitleMatch')) {
                obj['RequirePerfectSubtitleMatch'] = ApiClient.convertToType(data['RequirePerfectSubtitleMatch'], 'Boolean');
            }
            if (data.hasOwnProperty('SaveSubtitlesWithMedia')) {
                obj['SaveSubtitlesWithMedia'] = ApiClient.convertToType(data['SaveSubtitlesWithMedia'], 'Boolean');
            }
            if (data.hasOwnProperty('ForcedSubtitlesOnly')) {
                obj['ForcedSubtitlesOnly'] = ApiClient.convertToType(data['ForcedSubtitlesOnly'], 'Boolean');
            }
            if (data.hasOwnProperty('HearingImpairedSubtitlesOnly')) {
                obj['HearingImpairedSubtitlesOnly'] = ApiClient.convertToType(data['HearingImpairedSubtitlesOnly'], 'Boolean');
            }
            if (data.hasOwnProperty('TypeOptions')) {
                obj['TypeOptions'] = ApiClient.convertToType(data['TypeOptions'], [TypeOptions]);
            }
            if (data.hasOwnProperty('CollapseSingleItemFolders')) {
                obj['CollapseSingleItemFolders'] = ApiClient.convertToType(data['CollapseSingleItemFolders'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableAdultMetadata')) {
                obj['EnableAdultMetadata'] = ApiClient.convertToType(data['EnableAdultMetadata'], 'Boolean');
            }
            if (data.hasOwnProperty('ImportCollections')) {
                obj['ImportCollections'] = ApiClient.convertToType(data['ImportCollections'], 'Boolean');
            }
            if (data.hasOwnProperty('MinCollectionItems')) {
                obj['MinCollectionItems'] = ApiClient.convertToType(data['MinCollectionItems'], 'Number');
            }
            if (data.hasOwnProperty('MusicFolderStructure')) {
                obj['MusicFolderStructure'] = ApiClient.convertToType(data['MusicFolderStructure'], 'String');
            }
            if (data.hasOwnProperty('MinResumePct')) {
                obj['MinResumePct'] = ApiClient.convertToType(data['MinResumePct'], 'Number');
            }
            if (data.hasOwnProperty('MaxResumePct')) {
                obj['MaxResumePct'] = ApiClient.convertToType(data['MaxResumePct'], 'Number');
            }
            if (data.hasOwnProperty('MinResumeDurationSeconds')) {
                obj['MinResumeDurationSeconds'] = ApiClient.convertToType(data['MinResumeDurationSeconds'], 'Number');
            }
            if (data.hasOwnProperty('ThumbnailImagesIntervalSeconds')) {
                obj['ThumbnailImagesIntervalSeconds'] = ApiClient.convertToType(data['ThumbnailImagesIntervalSeconds'], 'Number');
            }
            if (data.hasOwnProperty('SampleIgnoreSize')) {
                obj['SampleIgnoreSize'] = ApiClient.convertToType(data['SampleIgnoreSize'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} EnableArchiveMediaFiles
    */
    'EnableArchiveMediaFiles' = undefined;
    /**
    * @member {Boolean} EnablePhotos
    */
    'EnablePhotos' = undefined;
    /**
    * @member {Boolean} EnableRealtimeMonitor
    */
    'EnableRealtimeMonitor' = undefined;
    /**
    * @member {Boolean} EnableMarkerDetection
    */
    'EnableMarkerDetection' = undefined;
    /**
    * @member {Boolean} EnableMarkerDetectionDuringLibraryScan
    */
    'EnableMarkerDetectionDuringLibraryScan' = undefined;
    /**
    * @member {Number} IntroDetectionFingerprintLength
    */
    'IntroDetectionFingerprintLength' = undefined;
    /**
    * @member {Boolean} EnableChapterImageExtraction
    */
    'EnableChapterImageExtraction' = undefined;
    /**
    * @member {Boolean} ExtractChapterImagesDuringLibraryScan
    */
    'ExtractChapterImagesDuringLibraryScan' = undefined;
    /**
    * @member {Boolean} DownloadImagesInAdvance
    */
    'DownloadImagesInAdvance' = undefined;
    /**
    * @member {Boolean} CacheImages
    */
    'CacheImages' = undefined;
    /**
    * @member {Array.<module:model/MediaPathInfo>} PathInfos
    */
    'PathInfos' = undefined;
    /**
    * @member {Boolean} IgnoreHiddenFiles
    */
    'IgnoreHiddenFiles' = undefined;
    /**
    * @member {Array.<String>} IgnoreFileExtensions
    */
    'IgnoreFileExtensions' = undefined;
    /**
    * @member {Boolean} SaveLocalMetadata
    */
    'SaveLocalMetadata' = undefined;
    /**
    * @member {Boolean} SaveMetadataHidden
    */
    'SaveMetadataHidden' = undefined;
    /**
    * @member {Boolean} SaveLocalThumbnailSets
    */
    'SaveLocalThumbnailSets' = undefined;
    /**
    * @member {Boolean} ImportPlaylists
    */
    'ImportPlaylists' = undefined;
    /**
    * @member {Boolean} EnableAutomaticSeriesGrouping
    */
    'EnableAutomaticSeriesGrouping' = undefined;
    /**
    * @member {Boolean} ShareEmbeddedMusicAlbumImages
    */
    'ShareEmbeddedMusicAlbumImages' = undefined;
    /**
    * @member {Boolean} EnableEmbeddedTitles
    */
    'EnableEmbeddedTitles' = undefined;
    /**
    * @member {Boolean} EnableAudioResume
    */
    'EnableAudioResume' = undefined;
    /**
    * @member {Boolean} AutoGenerateChapters
    */
    'AutoGenerateChapters' = undefined;
    /**
    * @member {Number} AutomaticRefreshIntervalDays
    */
    'AutomaticRefreshIntervalDays' = undefined;
    /**
    * @member {Number} PlaceholderMetadataRefreshIntervalDays
    */
    'PlaceholderMetadataRefreshIntervalDays' = undefined;
    /**
    * The preferred metadata language.
    * @member {String} PreferredMetadataLanguage
    */
    'PreferredMetadataLanguage' = undefined;
    /**
    * @member {String} PreferredImageLanguage
    */
    'PreferredImageLanguage' = undefined;
    /**
    * @member {String} ContentType
    */
    'ContentType' = undefined;
    /**
    * The metadata country code.
    * @member {String} MetadataCountryCode
    */
    'MetadataCountryCode' = undefined;
    /**
    * @member {Array.<String>} MetadataSavers
    */
    'MetadataSavers' = undefined;
    /**
    * @member {Array.<String>} DisabledLocalMetadataReaders
    */
    'DisabledLocalMetadataReaders' = undefined;
    /**
    * @member {Array.<String>} LocalMetadataReaderOrder
    */
    'LocalMetadataReaderOrder' = undefined;
    /**
    * @member {Array.<String>} DisabledLyricsFetchers
    */
    'DisabledLyricsFetchers' = undefined;
    /**
    * @member {Boolean} SaveLyricsWithMedia
    */
    'SaveLyricsWithMedia' = undefined;
    /**
    * @member {Number} LyricsDownloadMaxAgeDays
    */
    'LyricsDownloadMaxAgeDays' = undefined;
    /**
    * @member {Array.<String>} LyricsFetcherOrder
    */
    'LyricsFetcherOrder' = undefined;
    /**
    * @member {Array.<String>} LyricsDownloadLanguages
    */
    'LyricsDownloadLanguages' = undefined;
    /**
    * @member {Array.<String>} DisabledSubtitleFetchers
    */
    'DisabledSubtitleFetchers' = undefined;
    /**
    * @member {Array.<String>} SubtitleFetcherOrder
    */
    'SubtitleFetcherOrder' = undefined;
    /**
    * @member {Boolean} SkipSubtitlesIfEmbeddedSubtitlesPresent
    */
    'SkipSubtitlesIfEmbeddedSubtitlesPresent' = undefined;
    /**
    * @member {Boolean} SkipSubtitlesIfAudioTrackMatches
    */
    'SkipSubtitlesIfAudioTrackMatches' = undefined;
    /**
    * @member {Array.<String>} SubtitleDownloadLanguages
    */
    'SubtitleDownloadLanguages' = undefined;
    /**
    * @member {Number} SubtitleDownloadMaxAgeDays
    */
    'SubtitleDownloadMaxAgeDays' = undefined;
    /**
    * @member {Boolean} RequirePerfectSubtitleMatch
    */
    'RequirePerfectSubtitleMatch' = undefined;
    /**
    * @member {Boolean} SaveSubtitlesWithMedia
    */
    'SaveSubtitlesWithMedia' = undefined;
    /**
    * @member {Boolean} ForcedSubtitlesOnly
    */
    'ForcedSubtitlesOnly' = undefined;
    /**
    * @member {Boolean} HearingImpairedSubtitlesOnly
    */
    'HearingImpairedSubtitlesOnly' = undefined;
    /**
    * @member {Array.<module:model/TypeOptions>} TypeOptions
    */
    'TypeOptions' = undefined;
    /**
    * @member {Boolean} CollapseSingleItemFolders
    */
    'CollapseSingleItemFolders' = undefined;
    /**
    * @member {Boolean} EnableAdultMetadata
    */
    'EnableAdultMetadata' = undefined;
    /**
    * @member {Boolean} ImportCollections
    */
    'ImportCollections' = undefined;
    /**
    * @member {Number} MinCollectionItems
    */
    'MinCollectionItems' = undefined;
    /**
    * @member {String} MusicFolderStructure
    */
    'MusicFolderStructure' = undefined;
    /**
    * The minimum percentage of an item that must be played in order for playstate to be updated.
    * @member {Number} MinResumePct
    */
    'MinResumePct' = undefined;
    /**
    * The maximum percentage of an item that can be played while still saving playstate. If this percentage is crossed playstate will be reset to the beginning and the item will be marked watched.
    * @member {Number} MaxResumePct
    */
    'MaxResumePct' = undefined;
    /**
    * The minimum duration that an item must have in order to be eligible for playstate updates..
    * @member {Number} MinResumeDurationSeconds
    */
    'MinResumeDurationSeconds' = undefined;
    /**
    * @member {Number} ThumbnailImagesIntervalSeconds
    */
    'ThumbnailImagesIntervalSeconds' = undefined;
    /**
    * @member {Number} SampleIgnoreSize
    */
    'SampleIgnoreSize' = undefined;




}
