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
* The ApiSetChannelDisabled model module.
* @module model/ApiSetChannelDisabled
* @version 4.8.10.0
*/
export default class ApiSetChannelDisabled {
    /**
    * Constructs a new <code>ApiSetChannelDisabled</code>.
    * @alias module:model/ApiSetChannelDisabled
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ApiSetChannelDisabled</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ApiSetChannelDisabled} obj Optional instance to populate.
    * @return {module:model/ApiSetChannelDisabled} The populated <code>ApiSetChannelDisabled</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApiSetChannelDisabled();
                        
            
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
