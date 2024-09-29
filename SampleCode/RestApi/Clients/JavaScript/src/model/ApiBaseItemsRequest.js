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
import DayOfWeek from './DayOfWeek';
import LibraryItemLinkType from './LibraryItemLinkType';
import LiveTvKeywordType from './LiveTvKeywordType';

/**
* The ApiBaseItemsRequest model module.
* @module model/ApiBaseItemsRequest
* @version 4.8.10.0
*/
export default class ApiBaseItemsRequest {
    /**
    * Constructs a new <code>ApiBaseItemsRequest</code>.
    * @alias module:model/ApiBaseItemsRequest
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ApiBaseItemsRequest</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ApiBaseItemsRequest} obj Optional instance to populate.
    * @return {module:model/ApiBaseItemsRequest} The populated <code>ApiBaseItemsRequest</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApiBaseItemsRequest();
                        
            
            if (data.hasOwnProperty('Is4K')) {
                obj['Is4K'] = ApiClient.convertToType(data['Is4K'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableTotalRecordCount')) {
                obj['EnableTotalRecordCount'] = ApiClient.convertToType(data['EnableTotalRecordCount'], 'Boolean');
            }
            if (data.hasOwnProperty('RecordingKeyword')) {
                obj['RecordingKeyword'] = ApiClient.convertToType(data['RecordingKeyword'], 'String');
            }
            if (data.hasOwnProperty('RecordingKeywordType')) {
                obj['RecordingKeywordType'] = LiveTvKeywordType.constructFromObject(data['RecordingKeywordType']);
            }
            if (data.hasOwnProperty('RandomSeed')) {
                obj['RandomSeed'] = ApiClient.convertToType(data['RandomSeed'], 'Number');
            }
            if (data.hasOwnProperty('GenreIds')) {
                obj['GenreIds'] = ApiClient.convertToType(data['GenreIds'], 'String');
            }
            if (data.hasOwnProperty('CollectionIds')) {
                obj['CollectionIds'] = ApiClient.convertToType(data['CollectionIds'], 'String');
            }
            if (data.hasOwnProperty('TagIds')) {
                obj['TagIds'] = ApiClient.convertToType(data['TagIds'], 'String');
            }
            if (data.hasOwnProperty('ExcludeTagIds')) {
                obj['ExcludeTagIds'] = ApiClient.convertToType(data['ExcludeTagIds'], 'String');
            }
            if (data.hasOwnProperty('ExcludeArtistIds')) {
                obj['ExcludeArtistIds'] = ApiClient.convertToType(data['ExcludeArtistIds'], 'String');
            }
            if (data.hasOwnProperty('AlbumArtistIds')) {
                obj['AlbumArtistIds'] = ApiClient.convertToType(data['AlbumArtistIds'], 'String');
            }
            if (data.hasOwnProperty('ContributingArtistIds')) {
                obj['ContributingArtistIds'] = ApiClient.convertToType(data['ContributingArtistIds'], 'String');
            }
            if (data.hasOwnProperty('AlbumIds')) {
                obj['AlbumIds'] = ApiClient.convertToType(data['AlbumIds'], 'String');
            }
            if (data.hasOwnProperty('OuterIds')) {
                obj['OuterIds'] = ApiClient.convertToType(data['OuterIds'], 'String');
            }
            if (data.hasOwnProperty('ListItemIds')) {
                obj['ListItemIds'] = ApiClient.convertToType(data['ListItemIds'], 'String');
            }
            if (data.hasOwnProperty('AudioLanguages')) {
                obj['AudioLanguages'] = ApiClient.convertToType(data['AudioLanguages'], 'String');
            }
            if (data.hasOwnProperty('SubtitleLanguages')) {
                obj['SubtitleLanguages'] = ApiClient.convertToType(data['SubtitleLanguages'], 'String');
            }
            if (data.hasOwnProperty('CanEditItems')) {
                obj['CanEditItems'] = ApiClient.convertToType(data['CanEditItems'], 'Boolean');
            }
            if (data.hasOwnProperty('GroupItemsInto')) {
                obj['GroupItemsInto'] = LibraryItemLinkType.constructFromObject(data['GroupItemsInto']);
            }
            if (data.hasOwnProperty('MinWidth')) {
                obj['MinWidth'] = ApiClient.convertToType(data['MinWidth'], 'Number');
            }
            if (data.hasOwnProperty('MinHeight')) {
                obj['MinHeight'] = ApiClient.convertToType(data['MinHeight'], 'Number');
            }
            if (data.hasOwnProperty('MaxWidth')) {
                obj['MaxWidth'] = ApiClient.convertToType(data['MaxWidth'], 'Number');
            }
            if (data.hasOwnProperty('MaxHeight')) {
                obj['MaxHeight'] = ApiClient.convertToType(data['MaxHeight'], 'Number');
            }
            if (data.hasOwnProperty('GroupProgramsBySeries')) {
                obj['GroupProgramsBySeries'] = ApiClient.convertToType(data['GroupProgramsBySeries'], 'Boolean');
            }
            if (data.hasOwnProperty('AirDays')) {
                obj['AirDays'] = ApiClient.convertToType(data['AirDays'], [DayOfWeek]);
            }
            if (data.hasOwnProperty('IsAiring')) {
                obj['IsAiring'] = ApiClient.convertToType(data['IsAiring'], 'Boolean');
            }
            if (data.hasOwnProperty('HasAired')) {
                obj['HasAired'] = ApiClient.convertToType(data['HasAired'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} Is4K
    */
    'Is4K' = undefined;
    /**
    * @member {Boolean} EnableTotalRecordCount
    */
    'EnableTotalRecordCount' = undefined;
    /**
    * @member {String} RecordingKeyword
    */
    'RecordingKeyword' = undefined;
    /**
    * @member {module:model/LiveTvKeywordType} RecordingKeywordType
    */
    'RecordingKeywordType' = undefined;
    /**
    * @member {Number} RandomSeed
    */
    'RandomSeed' = undefined;
    /**
    * @member {String} GenreIds
    */
    'GenreIds' = undefined;
    /**
    * @member {String} CollectionIds
    */
    'CollectionIds' = undefined;
    /**
    * @member {String} TagIds
    */
    'TagIds' = undefined;
    /**
    * @member {String} ExcludeTagIds
    */
    'ExcludeTagIds' = undefined;
    /**
    * @member {String} ExcludeArtistIds
    */
    'ExcludeArtistIds' = undefined;
    /**
    * @member {String} AlbumArtistIds
    */
    'AlbumArtistIds' = undefined;
    /**
    * @member {String} ContributingArtistIds
    */
    'ContributingArtistIds' = undefined;
    /**
    * @member {String} AlbumIds
    */
    'AlbumIds' = undefined;
    /**
    * @member {String} OuterIds
    */
    'OuterIds' = undefined;
    /**
    * @member {String} ListItemIds
    */
    'ListItemIds' = undefined;
    /**
    * @member {String} AudioLanguages
    */
    'AudioLanguages' = undefined;
    /**
    * @member {String} SubtitleLanguages
    */
    'SubtitleLanguages' = undefined;
    /**
    * @member {Boolean} CanEditItems
    */
    'CanEditItems' = undefined;
    /**
    * @member {module:model/LibraryItemLinkType} GroupItemsInto
    */
    'GroupItemsInto' = undefined;
    /**
    * @member {Number} MinWidth
    */
    'MinWidth' = undefined;
    /**
    * @member {Number} MinHeight
    */
    'MinHeight' = undefined;
    /**
    * @member {Number} MaxWidth
    */
    'MaxWidth' = undefined;
    /**
    * @member {Number} MaxHeight
    */
    'MaxHeight' = undefined;
    /**
    * @member {Boolean} GroupProgramsBySeries
    */
    'GroupProgramsBySeries' = undefined;
    /**
    * @member {Array.<module:model/DayOfWeek>} AirDays
    */
    'AirDays' = undefined;
    /**
    * @member {Boolean} IsAiring
    */
    'IsAiring' = undefined;
    /**
    * @member {Boolean} HasAired
    */
    'HasAired' = undefined;




}
