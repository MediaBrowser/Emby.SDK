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
import MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType from './MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType';

/**
* The MediaEncodingSettingsApiHwaCancelHwaNodeOptions model module.
* @module model/MediaEncodingSettingsApiHwaCancelHwaNodeOptions
* @version 4.11.0.19
*/
export default class MediaEncodingSettingsApiHwaCancelHwaNodeOptions {
    /**
    * Constructs a new <code>MediaEncodingSettingsApiHwaCancelHwaNodeOptions</code>.
    * @alias module:model/MediaEncodingSettingsApiHwaCancelHwaNodeOptions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingSettingsApiHwaCancelHwaNodeOptions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingSettingsApiHwaCancelHwaNodeOptions} obj Optional instance to populate.
    * @return {module:model/MediaEncodingSettingsApiHwaCancelHwaNodeOptions} The populated <code>MediaEncodingSettingsApiHwaCancelHwaNodeOptions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingSettingsApiHwaCancelHwaNodeOptions();
                        
            
            if (data.hasOwnProperty('NodeId')) {
                obj['NodeId'] = ApiClient.convertToType(data['NodeId'], 'String');
            }
            if (data.hasOwnProperty('EditorType')) {
                obj['EditorType'] = MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType.constructFromObject(data['EditorType']);
            }
        }
        return obj;
    }

    /**
    * @member {String} NodeId
    */
    'NodeId' = undefined;
    /**
    * @member {module:model/MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType} EditorType
    */
    'EditorType' = undefined;




}
