/**
 * Emby Server REST API (BETA)
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
* The LiveTVApiSetChannelSortIndex model module.
* @module model/LiveTVApiSetChannelSortIndex
* @version 4.8.0.58
*/
export default class LiveTVApiSetChannelSortIndex {
    /**
    * Constructs a new <code>LiveTVApiSetChannelSortIndex</code>.
    * @alias module:model/LiveTVApiSetChannelSortIndex
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTVApiSetChannelSortIndex</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTVApiSetChannelSortIndex} obj Optional instance to populate.
    * @return {module:model/LiveTVApiSetChannelSortIndex} The populated <code>LiveTVApiSetChannelSortIndex</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTVApiSetChannelSortIndex();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('ManagementId')) {
                obj['ManagementId'] = ApiClient.convertToType(data['ManagementId'], 'String');
            }
            if (data.hasOwnProperty('NewIndex')) {
                obj['NewIndex'] = ApiClient.convertToType(data['NewIndex'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} ManagementId
    */
    'ManagementId' = undefined;
    /**
    * @member {Number} NewIndex
    */
    'NewIndex' = undefined;




}
