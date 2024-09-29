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
* The ApiSetChannelSortIndex model module.
* @module model/ApiSetChannelSortIndex
* @version 4.8.10.0
*/
export default class ApiSetChannelSortIndex {
    /**
    * Constructs a new <code>ApiSetChannelSortIndex</code>.
    * @alias module:model/ApiSetChannelSortIndex
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ApiSetChannelSortIndex</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ApiSetChannelSortIndex} obj Optional instance to populate.
    * @return {module:model/ApiSetChannelSortIndex} The populated <code>ApiSetChannelSortIndex</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApiSetChannelSortIndex();
                        
            
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
