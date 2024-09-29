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
* The ChannelManagementInfo model module.
* @module model/ChannelManagementInfo
* @version 4.8.10.0
*/
export default class ChannelManagementInfo {
    /**
    * Constructs a new <code>ChannelManagementInfo</code>.
    * @alias module:model/ChannelManagementInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ChannelManagementInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ChannelManagementInfo} obj Optional instance to populate.
    * @return {module:model/ChannelManagementInfo} The populated <code>ChannelManagementInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChannelManagementInfo();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;




}
