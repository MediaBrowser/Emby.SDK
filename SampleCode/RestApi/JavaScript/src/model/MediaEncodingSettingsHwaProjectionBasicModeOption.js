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
* The MediaEncodingSettingsHwaProjectionBasicModeOption model module.
* @module model/MediaEncodingSettingsHwaProjectionBasicModeOption
* @version 4.11.0.19
*/
export default class MediaEncodingSettingsHwaProjectionBasicModeOption {
    /**
    * Constructs a new <code>MediaEncodingSettingsHwaProjectionBasicModeOption</code>.
    * @alias module:model/MediaEncodingSettingsHwaProjectionBasicModeOption
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingSettingsHwaProjectionBasicModeOption</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingSettingsHwaProjectionBasicModeOption} obj Optional instance to populate.
    * @return {module:model/MediaEncodingSettingsHwaProjectionBasicModeOption} The populated <code>MediaEncodingSettingsHwaProjectionBasicModeOption</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingSettingsHwaProjectionBasicModeOption();
                        
            
            if (data.hasOwnProperty('NodeId')) {
                obj['NodeId'] = ApiClient.convertToType(data['NodeId'], 'String');
            }
            if (data.hasOwnProperty('Text')) {
                obj['Text'] = ApiClient.convertToType(data['Text'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} NodeId
    */
    'NodeId' = undefined;
    /**
    * @member {String} Text
    */
    'Text' = undefined;




}
