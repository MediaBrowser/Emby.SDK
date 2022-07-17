/**
 * Emby REST API
 * Explore the Emby Server API
 *
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import BaseItemPerson from './BaseItemPerson';
import ChapterInfo from './ChapterInfo';
import DayOfWeek from './DayOfWeek';
import DrawingImageOrientation from './DrawingImageOrientation';
import ExternalUrl from './ExternalUrl';
import LibraryPlayAccess from './LibraryPlayAccess';
import LiveTvTimerType from './LiveTvTimerType';
import LocationType from './LocationType';
import MediaSourceInfo from './MediaSourceInfo';
import MediaStream from './MediaStream';
import MediaUrl from './MediaUrl';
import MetadataFields from './MetadataFields';
import NameIdPair from './NameIdPair';
import NameLongIdPair from './NameLongIdPair';
import ProviderIdDictionary from './ProviderIdDictionary';
import UserItemDataDto from './UserItemDataDto';
import Video3DFormat from './Video3DFormat';

/**
* The BaseItemDto model module.
* @module model/BaseItemDto
* @version 4.7.5.0
*/
export default class BaseItemDto {
    /**
    * Constructs a new <code>BaseItemDto</code>.
    * @alias module:model/BaseItemDto
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>BaseItemDto</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/BaseItemDto} obj Optional instance to populate.
    * @return {module:model/BaseItemDto} The populated <code>BaseItemDto</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BaseItemDto();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('OriginalTitle')) {
                obj['OriginalTitle'] = ApiClient.convertToType(data['OriginalTitle'], 'String');
            }
            if (data.hasOwnProperty('ServerId')) {
                obj['ServerId'] = ApiClient.convertToType(data['ServerId'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Etag')) {
                obj['Etag'] = ApiClient.convertToType(data['Etag'], 'String');
            }
            if (data.hasOwnProperty('Prefix')) {
                obj['Prefix'] = ApiClient.convertToType(data['Prefix'], 'String');
            }
            if (data.hasOwnProperty('PlaylistItemId')) {
                obj['PlaylistItemId'] = ApiClient.convertToType(data['PlaylistItemId'], 'String');
            }
            if (data.hasOwnProperty('DateCreated')) {
                obj['DateCreated'] = ApiClient.convertToType(data['DateCreated'], 'Date');
            }
            if (data.hasOwnProperty('ExtraType')) {
                obj['ExtraType'] = ApiClient.convertToType(data['ExtraType'], 'String');
            }
            if (data.hasOwnProperty('SortIndexNumber')) {
                obj['SortIndexNumber'] = ApiClient.convertToType(data['SortIndexNumber'], 'Number');
            }
            if (data.hasOwnProperty('SortParentIndexNumber')) {
                obj['SortParentIndexNumber'] = ApiClient.convertToType(data['SortParentIndexNumber'], 'Number');
            }
            if (data.hasOwnProperty('AirsBeforeSeasonNumber')) {
                obj['AirsBeforeSeasonNumber'] = ApiClient.convertToType(data['AirsBeforeSeasonNumber'], 'Number');
            }
            if (data.hasOwnProperty('AirsAfterSeasonNumber')) {
                obj['AirsAfterSeasonNumber'] = ApiClient.convertToType(data['AirsAfterSeasonNumber'], 'Number');
            }
            if (data.hasOwnProperty('AirsBeforeEpisodeNumber')) {
                obj['AirsBeforeEpisodeNumber'] = ApiClient.convertToType(data['AirsBeforeEpisodeNumber'], 'Number');
            }
            if (data.hasOwnProperty('CanDelete')) {
                obj['CanDelete'] = ApiClient.convertToType(data['CanDelete'], 'Boolean');
            }
            if (data.hasOwnProperty('CanDownload')) {
                obj['CanDownload'] = ApiClient.convertToType(data['CanDownload'], 'Boolean');
            }
            if (data.hasOwnProperty('SupportsResume')) {
                obj['SupportsResume'] = ApiClient.convertToType(data['SupportsResume'], 'Boolean');
            }
            if (data.hasOwnProperty('PresentationUniqueKey')) {
                obj['PresentationUniqueKey'] = ApiClient.convertToType(data['PresentationUniqueKey'], 'String');
            }
            if (data.hasOwnProperty('PreferredMetadataLanguage')) {
                obj['PreferredMetadataLanguage'] = ApiClient.convertToType(data['PreferredMetadataLanguage'], 'String');
            }
            if (data.hasOwnProperty('PreferredMetadataCountryCode')) {
                obj['PreferredMetadataCountryCode'] = ApiClient.convertToType(data['PreferredMetadataCountryCode'], 'String');
            }
            if (data.hasOwnProperty('SupportsSync')) {
                obj['SupportsSync'] = ApiClient.convertToType(data['SupportsSync'], 'Boolean');
            }
            if (data.hasOwnProperty('Container')) {
                obj['Container'] = ApiClient.convertToType(data['Container'], 'String');
            }
            if (data.hasOwnProperty('SortName')) {
                obj['SortName'] = ApiClient.convertToType(data['SortName'], 'String');
            }
            if (data.hasOwnProperty('ForcedSortName')) {
                obj['ForcedSortName'] = ApiClient.convertToType(data['ForcedSortName'], 'String');
            }
            if (data.hasOwnProperty('Video3DFormat')) {
                obj['Video3DFormat'] = Video3DFormat.constructFromObject(data['Video3DFormat']);
            }
            if (data.hasOwnProperty('PremiereDate')) {
                obj['PremiereDate'] = ApiClient.convertToType(data['PremiereDate'], 'Date');
            }
            if (data.hasOwnProperty('ExternalUrls')) {
                obj['ExternalUrls'] = ApiClient.convertToType(data['ExternalUrls'], [ExternalUrl]);
            }
            if (data.hasOwnProperty('MediaSources')) {
                obj['MediaSources'] = ApiClient.convertToType(data['MediaSources'], [MediaSourceInfo]);
            }
            if (data.hasOwnProperty('CriticRating')) {
                obj['CriticRating'] = ApiClient.convertToType(data['CriticRating'], 'Number');
            }
            if (data.hasOwnProperty('GameSystemId')) {
                obj['GameSystemId'] = ApiClient.convertToType(data['GameSystemId'], 'Number');
            }
            if (data.hasOwnProperty('AsSeries')) {
                obj['AsSeries'] = ApiClient.convertToType(data['AsSeries'], 'Boolean');
            }
            if (data.hasOwnProperty('GameSystem')) {
                obj['GameSystem'] = ApiClient.convertToType(data['GameSystem'], 'String');
            }
            if (data.hasOwnProperty('ProductionLocations')) {
                obj['ProductionLocations'] = ApiClient.convertToType(data['ProductionLocations'], ['String']);
            }
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
            if (data.hasOwnProperty('OfficialRating')) {
                obj['OfficialRating'] = ApiClient.convertToType(data['OfficialRating'], 'String');
            }
            if (data.hasOwnProperty('CustomRating')) {
                obj['CustomRating'] = ApiClient.convertToType(data['CustomRating'], 'String');
            }
            if (data.hasOwnProperty('ChannelId')) {
                obj['ChannelId'] = ApiClient.convertToType(data['ChannelId'], 'String');
            }
            if (data.hasOwnProperty('ChannelName')) {
                obj['ChannelName'] = ApiClient.convertToType(data['ChannelName'], 'String');
            }
            if (data.hasOwnProperty('Overview')) {
                obj['Overview'] = ApiClient.convertToType(data['Overview'], 'String');
            }
            if (data.hasOwnProperty('Taglines')) {
                obj['Taglines'] = ApiClient.convertToType(data['Taglines'], ['String']);
            }
            if (data.hasOwnProperty('Genres')) {
                obj['Genres'] = ApiClient.convertToType(data['Genres'], ['String']);
            }
            if (data.hasOwnProperty('CommunityRating')) {
                obj['CommunityRating'] = ApiClient.convertToType(data['CommunityRating'], 'Number');
            }
            if (data.hasOwnProperty('RunTimeTicks')) {
                obj['RunTimeTicks'] = ApiClient.convertToType(data['RunTimeTicks'], 'Number');
            }
            if (data.hasOwnProperty('Size')) {
                obj['Size'] = ApiClient.convertToType(data['Size'], 'Number');
            }
            if (data.hasOwnProperty('FileName')) {
                obj['FileName'] = ApiClient.convertToType(data['FileName'], 'String');
            }
            if (data.hasOwnProperty('Bitrate')) {
                obj['Bitrate'] = ApiClient.convertToType(data['Bitrate'], 'Number');
            }
            if (data.hasOwnProperty('PlayAccess')) {
                obj['PlayAccess'] = LibraryPlayAccess.constructFromObject(data['PlayAccess']);
            }
            if (data.hasOwnProperty('ProductionYear')) {
                obj['ProductionYear'] = ApiClient.convertToType(data['ProductionYear'], 'Number');
            }
            if (data.hasOwnProperty('Number')) {
                obj['Number'] = ApiClient.convertToType(data['Number'], 'String');
            }
            if (data.hasOwnProperty('ChannelNumber')) {
                obj['ChannelNumber'] = ApiClient.convertToType(data['ChannelNumber'], 'String');
            }
            if (data.hasOwnProperty('IndexNumber')) {
                obj['IndexNumber'] = ApiClient.convertToType(data['IndexNumber'], 'Number');
            }
            if (data.hasOwnProperty('IndexNumberEnd')) {
                obj['IndexNumberEnd'] = ApiClient.convertToType(data['IndexNumberEnd'], 'Number');
            }
            if (data.hasOwnProperty('ParentIndexNumber')) {
                obj['ParentIndexNumber'] = ApiClient.convertToType(data['ParentIndexNumber'], 'Number');
            }
            if (data.hasOwnProperty('RemoteTrailers')) {
                obj['RemoteTrailers'] = ApiClient.convertToType(data['RemoteTrailers'], [MediaUrl]);
            }
            if (data.hasOwnProperty('ProviderIds')) {
                obj['ProviderIds'] = ProviderIdDictionary.constructFromObject(data['ProviderIds']);
            }
            if (data.hasOwnProperty('IsFolder')) {
                obj['IsFolder'] = ApiClient.convertToType(data['IsFolder'], 'Boolean');
            }
            if (data.hasOwnProperty('ParentId')) {
                obj['ParentId'] = ApiClient.convertToType(data['ParentId'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('People')) {
                obj['People'] = ApiClient.convertToType(data['People'], [BaseItemPerson]);
            }
            if (data.hasOwnProperty('Studios')) {
                obj['Studios'] = ApiClient.convertToType(data['Studios'], [NameLongIdPair]);
            }
            if (data.hasOwnProperty('GenreItems')) {
                obj['GenreItems'] = ApiClient.convertToType(data['GenreItems'], [NameLongIdPair]);
            }
            if (data.hasOwnProperty('TagItems')) {
                obj['TagItems'] = ApiClient.convertToType(data['TagItems'], [NameLongIdPair]);
            }
            if (data.hasOwnProperty('ParentLogoItemId')) {
                obj['ParentLogoItemId'] = ApiClient.convertToType(data['ParentLogoItemId'], 'String');
            }
            if (data.hasOwnProperty('ParentBackdropItemId')) {
                obj['ParentBackdropItemId'] = ApiClient.convertToType(data['ParentBackdropItemId'], 'String');
            }
            if (data.hasOwnProperty('ParentBackdropImageTags')) {
                obj['ParentBackdropImageTags'] = ApiClient.convertToType(data['ParentBackdropImageTags'], ['String']);
            }
            if (data.hasOwnProperty('LocalTrailerCount')) {
                obj['LocalTrailerCount'] = ApiClient.convertToType(data['LocalTrailerCount'], 'Number');
            }
            if (data.hasOwnProperty('UserData')) {
                obj['UserData'] = UserItemDataDto.constructFromObject(data['UserData']);
            }
            if (data.hasOwnProperty('RecursiveItemCount')) {
                obj['RecursiveItemCount'] = ApiClient.convertToType(data['RecursiveItemCount'], 'Number');
            }
            if (data.hasOwnProperty('ChildCount')) {
                obj['ChildCount'] = ApiClient.convertToType(data['ChildCount'], 'Number');
            }
            if (data.hasOwnProperty('SeriesName')) {
                obj['SeriesName'] = ApiClient.convertToType(data['SeriesName'], 'String');
            }
            if (data.hasOwnProperty('SeriesId')) {
                obj['SeriesId'] = ApiClient.convertToType(data['SeriesId'], 'String');
            }
            if (data.hasOwnProperty('SeasonId')) {
                obj['SeasonId'] = ApiClient.convertToType(data['SeasonId'], 'String');
            }
            if (data.hasOwnProperty('SpecialFeatureCount')) {
                obj['SpecialFeatureCount'] = ApiClient.convertToType(data['SpecialFeatureCount'], 'Number');
            }
            if (data.hasOwnProperty('DisplayPreferencesId')) {
                obj['DisplayPreferencesId'] = ApiClient.convertToType(data['DisplayPreferencesId'], 'String');
            }
            if (data.hasOwnProperty('Status')) {
                obj['Status'] = ApiClient.convertToType(data['Status'], 'String');
            }
            if (data.hasOwnProperty('AirDays')) {
                obj['AirDays'] = ApiClient.convertToType(data['AirDays'], [DayOfWeek]);
            }
            if (data.hasOwnProperty('Tags')) {
                obj['Tags'] = ApiClient.convertToType(data['Tags'], ['String']);
            }
            if (data.hasOwnProperty('PrimaryImageAspectRatio')) {
                obj['PrimaryImageAspectRatio'] = ApiClient.convertToType(data['PrimaryImageAspectRatio'], 'Number');
            }
            if (data.hasOwnProperty('Artists')) {
                obj['Artists'] = ApiClient.convertToType(data['Artists'], ['String']);
            }
            if (data.hasOwnProperty('ArtistItems')) {
                obj['ArtistItems'] = ApiClient.convertToType(data['ArtistItems'], [NameIdPair]);
            }
            if (data.hasOwnProperty('Composers')) {
                obj['Composers'] = ApiClient.convertToType(data['Composers'], [NameIdPair]);
            }
            if (data.hasOwnProperty('Album')) {
                obj['Album'] = ApiClient.convertToType(data['Album'], 'String');
            }
            if (data.hasOwnProperty('CollectionType')) {
                obj['CollectionType'] = ApiClient.convertToType(data['CollectionType'], 'String');
            }
            if (data.hasOwnProperty('DisplayOrder')) {
                obj['DisplayOrder'] = ApiClient.convertToType(data['DisplayOrder'], 'String');
            }
            if (data.hasOwnProperty('AlbumId')) {
                obj['AlbumId'] = ApiClient.convertToType(data['AlbumId'], 'String');
            }
            if (data.hasOwnProperty('AlbumPrimaryImageTag')) {
                obj['AlbumPrimaryImageTag'] = ApiClient.convertToType(data['AlbumPrimaryImageTag'], 'String');
            }
            if (data.hasOwnProperty('SeriesPrimaryImageTag')) {
                obj['SeriesPrimaryImageTag'] = ApiClient.convertToType(data['SeriesPrimaryImageTag'], 'String');
            }
            if (data.hasOwnProperty('AlbumArtist')) {
                obj['AlbumArtist'] = ApiClient.convertToType(data['AlbumArtist'], 'String');
            }
            if (data.hasOwnProperty('AlbumArtists')) {
                obj['AlbumArtists'] = ApiClient.convertToType(data['AlbumArtists'], [NameIdPair]);
            }
            if (data.hasOwnProperty('SeasonName')) {
                obj['SeasonName'] = ApiClient.convertToType(data['SeasonName'], 'String');
            }
            if (data.hasOwnProperty('MediaStreams')) {
                obj['MediaStreams'] = ApiClient.convertToType(data['MediaStreams'], [MediaStream]);
            }
            if (data.hasOwnProperty('PartCount')) {
                obj['PartCount'] = ApiClient.convertToType(data['PartCount'], 'Number');
            }
            if (data.hasOwnProperty('ImageTags')) {
                obj['ImageTags'] = ApiClient.convertToType(data['ImageTags'], {'String': 'String'});
            }
            if (data.hasOwnProperty('BackdropImageTags')) {
                obj['BackdropImageTags'] = ApiClient.convertToType(data['BackdropImageTags'], ['String']);
            }
            if (data.hasOwnProperty('ParentLogoImageTag')) {
                obj['ParentLogoImageTag'] = ApiClient.convertToType(data['ParentLogoImageTag'], 'String');
            }
            if (data.hasOwnProperty('SeriesStudio')) {
                obj['SeriesStudio'] = ApiClient.convertToType(data['SeriesStudio'], 'String');
            }
            if (data.hasOwnProperty('ParentThumbItemId')) {
                obj['ParentThumbItemId'] = ApiClient.convertToType(data['ParentThumbItemId'], 'String');
            }
            if (data.hasOwnProperty('ParentThumbImageTag')) {
                obj['ParentThumbImageTag'] = ApiClient.convertToType(data['ParentThumbImageTag'], 'String');
            }
            if (data.hasOwnProperty('Chapters')) {
                obj['Chapters'] = ApiClient.convertToType(data['Chapters'], [ChapterInfo]);
            }
            if (data.hasOwnProperty('LocationType')) {
                obj['LocationType'] = LocationType.constructFromObject(data['LocationType']);
            }
            if (data.hasOwnProperty('MediaType')) {
                obj['MediaType'] = ApiClient.convertToType(data['MediaType'], 'String');
            }
            if (data.hasOwnProperty('EndDate')) {
                obj['EndDate'] = ApiClient.convertToType(data['EndDate'], 'Date');
            }
            if (data.hasOwnProperty('LockedFields')) {
                obj['LockedFields'] = ApiClient.convertToType(data['LockedFields'], [MetadataFields]);
            }
            if (data.hasOwnProperty('LockData')) {
                obj['LockData'] = ApiClient.convertToType(data['LockData'], 'Boolean');
            }
            if (data.hasOwnProperty('Width')) {
                obj['Width'] = ApiClient.convertToType(data['Width'], 'Number');
            }
            if (data.hasOwnProperty('Height')) {
                obj['Height'] = ApiClient.convertToType(data['Height'], 'Number');
            }
            if (data.hasOwnProperty('CameraMake')) {
                obj['CameraMake'] = ApiClient.convertToType(data['CameraMake'], 'String');
            }
            if (data.hasOwnProperty('CameraModel')) {
                obj['CameraModel'] = ApiClient.convertToType(data['CameraModel'], 'String');
            }
            if (data.hasOwnProperty('Software')) {
                obj['Software'] = ApiClient.convertToType(data['Software'], 'String');
            }
            if (data.hasOwnProperty('ExposureTime')) {
                obj['ExposureTime'] = ApiClient.convertToType(data['ExposureTime'], 'Number');
            }
            if (data.hasOwnProperty('FocalLength')) {
                obj['FocalLength'] = ApiClient.convertToType(data['FocalLength'], 'Number');
            }
            if (data.hasOwnProperty('ImageOrientation')) {
                obj['ImageOrientation'] = DrawingImageOrientation.constructFromObject(data['ImageOrientation']);
            }
            if (data.hasOwnProperty('Aperture')) {
                obj['Aperture'] = ApiClient.convertToType(data['Aperture'], 'Number');
            }
            if (data.hasOwnProperty('ShutterSpeed')) {
                obj['ShutterSpeed'] = ApiClient.convertToType(data['ShutterSpeed'], 'Number');
            }
            if (data.hasOwnProperty('Latitude')) {
                obj['Latitude'] = ApiClient.convertToType(data['Latitude'], 'Number');
            }
            if (data.hasOwnProperty('Longitude')) {
                obj['Longitude'] = ApiClient.convertToType(data['Longitude'], 'Number');
            }
            if (data.hasOwnProperty('Altitude')) {
                obj['Altitude'] = ApiClient.convertToType(data['Altitude'], 'Number');
            }
            if (data.hasOwnProperty('IsoSpeedRating')) {
                obj['IsoSpeedRating'] = ApiClient.convertToType(data['IsoSpeedRating'], 'Number');
            }
            if (data.hasOwnProperty('SeriesTimerId')) {
                obj['SeriesTimerId'] = ApiClient.convertToType(data['SeriesTimerId'], 'String');
            }
            if (data.hasOwnProperty('ChannelPrimaryImageTag')) {
                obj['ChannelPrimaryImageTag'] = ApiClient.convertToType(data['ChannelPrimaryImageTag'], 'String');
            }
            if (data.hasOwnProperty('StartDate')) {
                obj['StartDate'] = ApiClient.convertToType(data['StartDate'], 'Date');
            }
            if (data.hasOwnProperty('CompletionPercentage')) {
                obj['CompletionPercentage'] = ApiClient.convertToType(data['CompletionPercentage'], 'Number');
            }
            if (data.hasOwnProperty('IsRepeat')) {
                obj['IsRepeat'] = ApiClient.convertToType(data['IsRepeat'], 'Boolean');
            }
            if (data.hasOwnProperty('IsNew')) {
                obj['IsNew'] = ApiClient.convertToType(data['IsNew'], 'Boolean');
            }
            if (data.hasOwnProperty('EpisodeTitle')) {
                obj['EpisodeTitle'] = ApiClient.convertToType(data['EpisodeTitle'], 'String');
            }
            if (data.hasOwnProperty('IsMovie')) {
                obj['IsMovie'] = ApiClient.convertToType(data['IsMovie'], 'Boolean');
            }
            if (data.hasOwnProperty('IsSports')) {
                obj['IsSports'] = ApiClient.convertToType(data['IsSports'], 'Boolean');
            }
            if (data.hasOwnProperty('IsSeries')) {
                obj['IsSeries'] = ApiClient.convertToType(data['IsSeries'], 'Boolean');
            }
            if (data.hasOwnProperty('IsLive')) {
                obj['IsLive'] = ApiClient.convertToType(data['IsLive'], 'Boolean');
            }
            if (data.hasOwnProperty('IsNews')) {
                obj['IsNews'] = ApiClient.convertToType(data['IsNews'], 'Boolean');
            }
            if (data.hasOwnProperty('IsKids')) {
                obj['IsKids'] = ApiClient.convertToType(data['IsKids'], 'Boolean');
            }
            if (data.hasOwnProperty('IsPremiere')) {
                obj['IsPremiere'] = ApiClient.convertToType(data['IsPremiere'], 'Boolean');
            }
            if (data.hasOwnProperty('TimerType')) {
                obj['TimerType'] = LiveTvTimerType.constructFromObject(data['TimerType']);
            }
            if (data.hasOwnProperty('Disabled')) {
                obj['Disabled'] = ApiClient.convertToType(data['Disabled'], 'Boolean');
            }
            if (data.hasOwnProperty('ManagementId')) {
                obj['ManagementId'] = ApiClient.convertToType(data['ManagementId'], 'String');
            }
            if (data.hasOwnProperty('TimerId')) {
                obj['TimerId'] = ApiClient.convertToType(data['TimerId'], 'String');
            }
            if (data.hasOwnProperty('CurrentProgram')) {
                obj['CurrentProgram'] = BaseItemDto.constructFromObject(data['CurrentProgram']);
            }
            if (data.hasOwnProperty('MovieCount')) {
                obj['MovieCount'] = ApiClient.convertToType(data['MovieCount'], 'Number');
            }
            if (data.hasOwnProperty('SeriesCount')) {
                obj['SeriesCount'] = ApiClient.convertToType(data['SeriesCount'], 'Number');
            }
            if (data.hasOwnProperty('AlbumCount')) {
                obj['AlbumCount'] = ApiClient.convertToType(data['AlbumCount'], 'Number');
            }
            if (data.hasOwnProperty('SongCount')) {
                obj['SongCount'] = ApiClient.convertToType(data['SongCount'], 'Number');
            }
            if (data.hasOwnProperty('MusicVideoCount')) {
                obj['MusicVideoCount'] = ApiClient.convertToType(data['MusicVideoCount'], 'Number');
            }
            if (data.hasOwnProperty('Subviews')) {
                obj['Subviews'] = ApiClient.convertToType(data['Subviews'], ['String']);
            }
            if (data.hasOwnProperty('ListingsProviderId')) {
                obj['ListingsProviderId'] = ApiClient.convertToType(data['ListingsProviderId'], 'String');
            }
            if (data.hasOwnProperty('ListingsChannelId')) {
                obj['ListingsChannelId'] = ApiClient.convertToType(data['ListingsChannelId'], 'String');
            }
            if (data.hasOwnProperty('ListingsPath')) {
                obj['ListingsPath'] = ApiClient.convertToType(data['ListingsPath'], 'String');
            }
            if (data.hasOwnProperty('ListingsId')) {
                obj['ListingsId'] = ApiClient.convertToType(data['ListingsId'], 'String');
            }
            if (data.hasOwnProperty('ListingsChannelName')) {
                obj['ListingsChannelName'] = ApiClient.convertToType(data['ListingsChannelName'], 'String');
            }
            if (data.hasOwnProperty('ListingsChannelNumber')) {
                obj['ListingsChannelNumber'] = ApiClient.convertToType(data['ListingsChannelNumber'], 'String');
            }
            if (data.hasOwnProperty('AffiliateCallSign')) {
                obj['AffiliateCallSign'] = ApiClient.convertToType(data['AffiliateCallSign'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} OriginalTitle
    */
    'OriginalTitle' = undefined;
    /**
    * @member {String} ServerId
    */
    'ServerId' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} Etag
    */
    'Etag' = undefined;
    /**
    * @member {String} Prefix
    */
    'Prefix' = undefined;
    /**
    * @member {String} PlaylistItemId
    */
    'PlaylistItemId' = undefined;
    /**
    * @member {Date} DateCreated
    */
    'DateCreated' = undefined;
    /**
    * @member {String} ExtraType
    */
    'ExtraType' = undefined;
    /**
    * @member {Number} SortIndexNumber
    */
    'SortIndexNumber' = undefined;
    /**
    * @member {Number} SortParentIndexNumber
    */
    'SortParentIndexNumber' = undefined;
    /**
    * @member {Number} AirsBeforeSeasonNumber
    */
    'AirsBeforeSeasonNumber' = undefined;
    /**
    * @member {Number} AirsAfterSeasonNumber
    */
    'AirsAfterSeasonNumber' = undefined;
    /**
    * @member {Number} AirsBeforeEpisodeNumber
    */
    'AirsBeforeEpisodeNumber' = undefined;
    /**
    * @member {Boolean} CanDelete
    */
    'CanDelete' = undefined;
    /**
    * @member {Boolean} CanDownload
    */
    'CanDownload' = undefined;
    /**
    * @member {Boolean} SupportsResume
    */
    'SupportsResume' = undefined;
    /**
    * @member {String} PresentationUniqueKey
    */
    'PresentationUniqueKey' = undefined;
    /**
    * @member {String} PreferredMetadataLanguage
    */
    'PreferredMetadataLanguage' = undefined;
    /**
    * @member {String} PreferredMetadataCountryCode
    */
    'PreferredMetadataCountryCode' = undefined;
    /**
    * @member {Boolean} SupportsSync
    */
    'SupportsSync' = undefined;
    /**
    * @member {String} Container
    */
    'Container' = undefined;
    /**
    * @member {String} SortName
    */
    'SortName' = undefined;
    /**
    * @member {String} ForcedSortName
    */
    'ForcedSortName' = undefined;
    /**
    * @member {module:model/Video3DFormat} Video3DFormat
    */
    'Video3DFormat' = undefined;
    /**
    * @member {Date} PremiereDate
    */
    'PremiereDate' = undefined;
    /**
    * @member {Array.<module:model/ExternalUrl>} ExternalUrls
    */
    'ExternalUrls' = undefined;
    /**
    * @member {Array.<module:model/MediaSourceInfo>} MediaSources
    */
    'MediaSources' = undefined;
    /**
    * @member {Number} CriticRating
    */
    'CriticRating' = undefined;
    /**
    * @member {Number} GameSystemId
    */
    'GameSystemId' = undefined;
    /**
    * @member {Boolean} AsSeries
    */
    'AsSeries' = undefined;
    /**
    * @member {String} GameSystem
    */
    'GameSystem' = undefined;
    /**
    * @member {Array.<String>} ProductionLocations
    */
    'ProductionLocations' = undefined;
    /**
    * @member {String} Path
    */
    'Path' = undefined;
    /**
    * @member {String} OfficialRating
    */
    'OfficialRating' = undefined;
    /**
    * @member {String} CustomRating
    */
    'CustomRating' = undefined;
    /**
    * @member {String} ChannelId
    */
    'ChannelId' = undefined;
    /**
    * @member {String} ChannelName
    */
    'ChannelName' = undefined;
    /**
    * @member {String} Overview
    */
    'Overview' = undefined;
    /**
    * @member {Array.<String>} Taglines
    */
    'Taglines' = undefined;
    /**
    * @member {Array.<String>} Genres
    */
    'Genres' = undefined;
    /**
    * @member {Number} CommunityRating
    */
    'CommunityRating' = undefined;
    /**
    * @member {Number} RunTimeTicks
    */
    'RunTimeTicks' = undefined;
    /**
    * @member {Number} Size
    */
    'Size' = undefined;
    /**
    * @member {String} FileName
    */
    'FileName' = undefined;
    /**
    * @member {Number} Bitrate
    */
    'Bitrate' = undefined;
    /**
    * @member {module:model/LibraryPlayAccess} PlayAccess
    */
    'PlayAccess' = undefined;
    /**
    * @member {Number} ProductionYear
    */
    'ProductionYear' = undefined;
    /**
    * @member {String} Number
    */
    'Number' = undefined;
    /**
    * @member {String} ChannelNumber
    */
    'ChannelNumber' = undefined;
    /**
    * @member {Number} IndexNumber
    */
    'IndexNumber' = undefined;
    /**
    * @member {Number} IndexNumberEnd
    */
    'IndexNumberEnd' = undefined;
    /**
    * @member {Number} ParentIndexNumber
    */
    'ParentIndexNumber' = undefined;
    /**
    * @member {Array.<module:model/MediaUrl>} RemoteTrailers
    */
    'RemoteTrailers' = undefined;
    /**
    * @member {module:model/ProviderIdDictionary} ProviderIds
    */
    'ProviderIds' = undefined;
    /**
    * @member {Boolean} IsFolder
    */
    'IsFolder' = undefined;
    /**
    * @member {String} ParentId
    */
    'ParentId' = undefined;
    /**
    * @member {String} Type
    */
    'Type' = undefined;
    /**
    * @member {Array.<module:model/BaseItemPerson>} People
    */
    'People' = undefined;
    /**
    * @member {Array.<module:model/NameLongIdPair>} Studios
    */
    'Studios' = undefined;
    /**
    * @member {Array.<module:model/NameLongIdPair>} GenreItems
    */
    'GenreItems' = undefined;
    /**
    * @member {Array.<module:model/NameLongIdPair>} TagItems
    */
    'TagItems' = undefined;
    /**
    * @member {String} ParentLogoItemId
    */
    'ParentLogoItemId' = undefined;
    /**
    * @member {String} ParentBackdropItemId
    */
    'ParentBackdropItemId' = undefined;
    /**
    * @member {Array.<String>} ParentBackdropImageTags
    */
    'ParentBackdropImageTags' = undefined;
    /**
    * @member {Number} LocalTrailerCount
    */
    'LocalTrailerCount' = undefined;
    /**
    * @member {module:model/UserItemDataDto} UserData
    */
    'UserData' = undefined;
    /**
    * @member {Number} RecursiveItemCount
    */
    'RecursiveItemCount' = undefined;
    /**
    * @member {Number} ChildCount
    */
    'ChildCount' = undefined;
    /**
    * @member {String} SeriesName
    */
    'SeriesName' = undefined;
    /**
    * @member {String} SeriesId
    */
    'SeriesId' = undefined;
    /**
    * @member {String} SeasonId
    */
    'SeasonId' = undefined;
    /**
    * @member {Number} SpecialFeatureCount
    */
    'SpecialFeatureCount' = undefined;
    /**
    * @member {String} DisplayPreferencesId
    */
    'DisplayPreferencesId' = undefined;
    /**
    * @member {String} Status
    */
    'Status' = undefined;
    /**
    * @member {Array.<module:model/DayOfWeek>} AirDays
    */
    'AirDays' = undefined;
    /**
    * @member {Array.<String>} Tags
    */
    'Tags' = undefined;
    /**
    * @member {Number} PrimaryImageAspectRatio
    */
    'PrimaryImageAspectRatio' = undefined;
    /**
    * @member {Array.<String>} Artists
    */
    'Artists' = undefined;
    /**
    * @member {Array.<module:model/NameIdPair>} ArtistItems
    */
    'ArtistItems' = undefined;
    /**
    * @member {Array.<module:model/NameIdPair>} Composers
    */
    'Composers' = undefined;
    /**
    * @member {String} Album
    */
    'Album' = undefined;
    /**
    * @member {String} CollectionType
    */
    'CollectionType' = undefined;
    /**
    * @member {String} DisplayOrder
    */
    'DisplayOrder' = undefined;
    /**
    * @member {String} AlbumId
    */
    'AlbumId' = undefined;
    /**
    * @member {String} AlbumPrimaryImageTag
    */
    'AlbumPrimaryImageTag' = undefined;
    /**
    * @member {String} SeriesPrimaryImageTag
    */
    'SeriesPrimaryImageTag' = undefined;
    /**
    * @member {String} AlbumArtist
    */
    'AlbumArtist' = undefined;
    /**
    * @member {Array.<module:model/NameIdPair>} AlbumArtists
    */
    'AlbumArtists' = undefined;
    /**
    * @member {String} SeasonName
    */
    'SeasonName' = undefined;
    /**
    * @member {Array.<module:model/MediaStream>} MediaStreams
    */
    'MediaStreams' = undefined;
    /**
    * @member {Number} PartCount
    */
    'PartCount' = undefined;
    /**
    * @member {Object.<String, String>} ImageTags
    */
    'ImageTags' = undefined;
    /**
    * @member {Array.<String>} BackdropImageTags
    */
    'BackdropImageTags' = undefined;
    /**
    * @member {String} ParentLogoImageTag
    */
    'ParentLogoImageTag' = undefined;
    /**
    * @member {String} SeriesStudio
    */
    'SeriesStudio' = undefined;
    /**
    * @member {String} ParentThumbItemId
    */
    'ParentThumbItemId' = undefined;
    /**
    * @member {String} ParentThumbImageTag
    */
    'ParentThumbImageTag' = undefined;
    /**
    * @member {Array.<module:model/ChapterInfo>} Chapters
    */
    'Chapters' = undefined;
    /**
    * @member {module:model/LocationType} LocationType
    */
    'LocationType' = undefined;
    /**
    * @member {String} MediaType
    */
    'MediaType' = undefined;
    /**
    * @member {Date} EndDate
    */
    'EndDate' = undefined;
    /**
    * @member {Array.<module:model/MetadataFields>} LockedFields
    */
    'LockedFields' = undefined;
    /**
    * @member {Boolean} LockData
    */
    'LockData' = undefined;
    /**
    * @member {Number} Width
    */
    'Width' = undefined;
    /**
    * @member {Number} Height
    */
    'Height' = undefined;
    /**
    * @member {String} CameraMake
    */
    'CameraMake' = undefined;
    /**
    * @member {String} CameraModel
    */
    'CameraModel' = undefined;
    /**
    * @member {String} Software
    */
    'Software' = undefined;
    /**
    * @member {Number} ExposureTime
    */
    'ExposureTime' = undefined;
    /**
    * @member {Number} FocalLength
    */
    'FocalLength' = undefined;
    /**
    * @member {module:model/DrawingImageOrientation} ImageOrientation
    */
    'ImageOrientation' = undefined;
    /**
    * @member {Number} Aperture
    */
    'Aperture' = undefined;
    /**
    * @member {Number} ShutterSpeed
    */
    'ShutterSpeed' = undefined;
    /**
    * @member {Number} Latitude
    */
    'Latitude' = undefined;
    /**
    * @member {Number} Longitude
    */
    'Longitude' = undefined;
    /**
    * @member {Number} Altitude
    */
    'Altitude' = undefined;
    /**
    * @member {Number} IsoSpeedRating
    */
    'IsoSpeedRating' = undefined;
    /**
    * @member {String} SeriesTimerId
    */
    'SeriesTimerId' = undefined;
    /**
    * @member {String} ChannelPrimaryImageTag
    */
    'ChannelPrimaryImageTag' = undefined;
    /**
    * @member {Date} StartDate
    */
    'StartDate' = undefined;
    /**
    * @member {Number} CompletionPercentage
    */
    'CompletionPercentage' = undefined;
    /**
    * @member {Boolean} IsRepeat
    */
    'IsRepeat' = undefined;
    /**
    * @member {Boolean} IsNew
    */
    'IsNew' = undefined;
    /**
    * @member {String} EpisodeTitle
    */
    'EpisodeTitle' = undefined;
    /**
    * @member {Boolean} IsMovie
    */
    'IsMovie' = undefined;
    /**
    * @member {Boolean} IsSports
    */
    'IsSports' = undefined;
    /**
    * @member {Boolean} IsSeries
    */
    'IsSeries' = undefined;
    /**
    * @member {Boolean} IsLive
    */
    'IsLive' = undefined;
    /**
    * @member {Boolean} IsNews
    */
    'IsNews' = undefined;
    /**
    * @member {Boolean} IsKids
    */
    'IsKids' = undefined;
    /**
    * @member {Boolean} IsPremiere
    */
    'IsPremiere' = undefined;
    /**
    * @member {module:model/LiveTvTimerType} TimerType
    */
    'TimerType' = undefined;
    /**
    * @member {Boolean} Disabled
    */
    'Disabled' = undefined;
    /**
    * @member {String} ManagementId
    */
    'ManagementId' = undefined;
    /**
    * @member {String} TimerId
    */
    'TimerId' = undefined;
    /**
    * @member {module:model/BaseItemDto} CurrentProgram
    */
    'CurrentProgram' = undefined;
    /**
    * @member {Number} MovieCount
    */
    'MovieCount' = undefined;
    /**
    * @member {Number} SeriesCount
    */
    'SeriesCount' = undefined;
    /**
    * @member {Number} AlbumCount
    */
    'AlbumCount' = undefined;
    /**
    * @member {Number} SongCount
    */
    'SongCount' = undefined;
    /**
    * @member {Number} MusicVideoCount
    */
    'MusicVideoCount' = undefined;
    /**
    * @member {Array.<String>} Subviews
    */
    'Subviews' = undefined;
    /**
    * @member {String} ListingsProviderId
    */
    'ListingsProviderId' = undefined;
    /**
    * @member {String} ListingsChannelId
    */
    'ListingsChannelId' = undefined;
    /**
    * @member {String} ListingsPath
    */
    'ListingsPath' = undefined;
    /**
    * @member {String} ListingsId
    */
    'ListingsId' = undefined;
    /**
    * @member {String} ListingsChannelName
    */
    'ListingsChannelName' = undefined;
    /**
    * @member {String} ListingsChannelNumber
    */
    'ListingsChannelNumber' = undefined;
    /**
    * @member {String} AffiliateCallSign
    */
    'AffiliateCallSign' = undefined;




}
