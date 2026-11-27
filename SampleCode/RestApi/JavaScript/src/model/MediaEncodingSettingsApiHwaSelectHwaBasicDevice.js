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
* The MediaEncodingSettingsApiHwaSelectHwaBasicDevice model module.
* @module model/MediaEncodingSettingsApiHwaSelectHwaBasicDevice
* @version 4.11.0.19
*/
export default class MediaEncodingSettingsApiHwaSelectHwaBasicDevice {
    /**
    * Constructs a new <code>MediaEncodingSettingsApiHwaSelectHwaBasicDevice</code>.
    * @alias module:model/MediaEncodingSettingsApiHwaSelectHwaBasicDevice
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingSettingsApiHwaSelectHwaBasicDevice</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingSettingsApiHwaSelectHwaBasicDevice} obj Optional instance to populate.
    * @return {module:model/MediaEncodingSettingsApiHwaSelectHwaBasicDevice} The populated <code>MediaEncodingSettingsApiHwaSelectHwaBasicDevice</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingSettingsApiHwaSelectHwaBasicDevice();
                        
            
            if (data.hasOwnProperty('NodeId')) {
                obj['NodeId'] = ApiClient.convertToType(data['NodeId'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} NodeId
    */
    'NodeId' = undefined;




}
