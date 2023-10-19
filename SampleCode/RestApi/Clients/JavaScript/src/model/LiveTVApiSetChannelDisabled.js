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
* The LiveTVApiSetChannelDisabled model module.
* @module model/LiveTVApiSetChannelDisabled
* @version 4.8.0.55
*/
export default class LiveTVApiSetChannelDisabled {
    /**
    * Constructs a new <code>LiveTVApiSetChannelDisabled</code>.
    * @alias module:model/LiveTVApiSetChannelDisabled
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTVApiSetChannelDisabled</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTVApiSetChannelDisabled} obj Optional instance to populate.
    * @return {module:model/LiveTVApiSetChannelDisabled} The populated <code>LiveTVApiSetChannelDisabled</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTVApiSetChannelDisabled();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('ManagementId')) {
                obj['ManagementId'] = ApiClient.convertToType(data['ManagementId'], 'String');
            }
            if (data.hasOwnProperty('Disabled')) {
                obj['Disabled'] = ApiClient.convertToType(data['Disabled'], 'Boolean');
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
    * @member {Boolean} Disabled
    */
    'Disabled' = undefined;




}
