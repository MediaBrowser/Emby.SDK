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
* The EmbyLiveTVChannelManagementInfo model module.
* @module model/EmbyLiveTVChannelManagementInfo
* @version 4.8.0.14
*/
export default class EmbyLiveTVChannelManagementInfo {
    /**
    * Constructs a new <code>EmbyLiveTVChannelManagementInfo</code>.
    * @alias module:model/EmbyLiveTVChannelManagementInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyLiveTVChannelManagementInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyLiveTVChannelManagementInfo} obj Optional instance to populate.
    * @return {module:model/EmbyLiveTVChannelManagementInfo} The populated <code>EmbyLiveTVChannelManagementInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyLiveTVChannelManagementInfo();
                        
            
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
