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
import MediaEncodingSettingsHwaProjectionHwaConfigView from './MediaEncodingSettingsHwaProjectionHwaConfigView';

/**
* The MediaEncodingSettingsApiHwaSaveHwaConfigResult model module.
* @module model/MediaEncodingSettingsApiHwaSaveHwaConfigResult
* @version 4.11.0.19
*/
export default class MediaEncodingSettingsApiHwaSaveHwaConfigResult {
    /**
    * Constructs a new <code>MediaEncodingSettingsApiHwaSaveHwaConfigResult</code>.
    * @alias module:model/MediaEncodingSettingsApiHwaSaveHwaConfigResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingSettingsApiHwaSaveHwaConfigResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingSettingsApiHwaSaveHwaConfigResult} obj Optional instance to populate.
    * @return {module:model/MediaEncodingSettingsApiHwaSaveHwaConfigResult} The populated <code>MediaEncodingSettingsApiHwaSaveHwaConfigResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingSettingsApiHwaSaveHwaConfigResult();
                        
            
            if (data.hasOwnProperty('WasSaved')) {
                obj['WasSaved'] = ApiClient.convertToType(data['WasSaved'], 'Boolean');
            }
            if (data.hasOwnProperty('GraphView')) {
                obj['GraphView'] = MediaEncodingSettingsHwaProjectionHwaConfigView.constructFromObject(data['GraphView']);
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} WasSaved
    */
    'WasSaved' = undefined;
    /**
    * @member {module:model/MediaEncodingSettingsHwaProjectionHwaConfigView} GraphView
    */
    'GraphView' = undefined;




}
