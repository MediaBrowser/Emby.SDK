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
* The MediaEncodingSettingsApiHwaSaveHwaConfig model module.
* @module model/MediaEncodingSettingsApiHwaSaveHwaConfig
* @version 4.11.0.19
*/
export default class MediaEncodingSettingsApiHwaSaveHwaConfig {
    /**
    * Constructs a new <code>MediaEncodingSettingsApiHwaSaveHwaConfig</code>.
    * @alias module:model/MediaEncodingSettingsApiHwaSaveHwaConfig
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingSettingsApiHwaSaveHwaConfig</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingSettingsApiHwaSaveHwaConfig} obj Optional instance to populate.
    * @return {module:model/MediaEncodingSettingsApiHwaSaveHwaConfig} The populated <code>MediaEncodingSettingsApiHwaSaveHwaConfig</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingSettingsApiHwaSaveHwaConfig();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;




}
