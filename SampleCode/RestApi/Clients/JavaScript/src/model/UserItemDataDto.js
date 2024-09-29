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

/**
* The UserItemDataDto model module.
* @module model/UserItemDataDto
* @version 4.8.10.0
*/
export default class UserItemDataDto {
    /**
    * Constructs a new <code>UserItemDataDto</code>.
    * Class UserItemDataDto  
    * @alias module:model/UserItemDataDto
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UserItemDataDto</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UserItemDataDto} obj Optional instance to populate.
    * @return {module:model/UserItemDataDto} The populated <code>UserItemDataDto</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserItemDataDto();
                        
            
            if (data.hasOwnProperty('Rating')) {
                obj['Rating'] = ApiClient.convertToType(data['Rating'], 'Number');
            }
            if (data.hasOwnProperty('PlayedPercentage')) {
                obj['PlayedPercentage'] = ApiClient.convertToType(data['PlayedPercentage'], 'Number');
            }
            if (data.hasOwnProperty('UnplayedItemCount')) {
                obj['UnplayedItemCount'] = ApiClient.convertToType(data['UnplayedItemCount'], 'Number');
            }
            if (data.hasOwnProperty('PlaybackPositionTicks')) {
                obj['PlaybackPositionTicks'] = ApiClient.convertToType(data['PlaybackPositionTicks'], 'Number');
            }
            if (data.hasOwnProperty('PlayCount')) {
                obj['PlayCount'] = ApiClient.convertToType(data['PlayCount'], 'Number');
            }
            if (data.hasOwnProperty('IsFavorite')) {
                obj['IsFavorite'] = ApiClient.convertToType(data['IsFavorite'], 'Boolean');
            }
            if (data.hasOwnProperty('LastPlayedDate')) {
                obj['LastPlayedDate'] = ApiClient.convertToType(data['LastPlayedDate'], 'Date');
            }
            if (data.hasOwnProperty('Played')) {
                obj['Played'] = ApiClient.convertToType(data['Played'], 'Boolean');
            }
            if (data.hasOwnProperty('Key')) {
                obj['Key'] = ApiClient.convertToType(data['Key'], 'String');
            }
            if (data.hasOwnProperty('ItemId')) {
                obj['ItemId'] = ApiClient.convertToType(data['ItemId'], 'String');
            }
            if (data.hasOwnProperty('ServerId')) {
                obj['ServerId'] = ApiClient.convertToType(data['ServerId'], 'String');
            }
        }
        return obj;
    }

    /**
    * The rating.
    * @member {Number} Rating
    */
    'Rating' = undefined;
    /**
    * The played percentage.
    * @member {Number} PlayedPercentage
    */
    'PlayedPercentage' = undefined;
    /**
    * The unplayed item count.
    * @member {Number} UnplayedItemCount
    */
    'UnplayedItemCount' = undefined;
    /**
    * The playback position ticks.
    * @member {Number} PlaybackPositionTicks
    */
    'PlaybackPositionTicks' = undefined;
    /**
    * The play count.
    * @member {Number} PlayCount
    */
    'PlayCount' = undefined;
    /**
    * A value indicating whether this instance is favorite.
    * @member {Boolean} IsFavorite
    */
    'IsFavorite' = undefined;
    /**
    * The last played date.
    * @member {Date} LastPlayedDate
    */
    'LastPlayedDate' = undefined;
    /**
    * A value indicating whether this `MediaBrowser.Model.Dto.UserItemDataDto` is played.
    * @member {Boolean} Played
    */
    'Played' = undefined;
    /**
    * The key.
    * @member {String} Key
    */
    'Key' = undefined;
    /**
    * The item identifier.
    * @member {String} ItemId
    */
    'ItemId' = undefined;
    /**
    * Used only by our Windows app. Not used by Emby Server.
    * @member {String} ServerId
    */
    'ServerId' = undefined;




}
