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
* The MediaEncodingSettingsApiHwaExecuteHwaConfigCommand model module.
* @module model/MediaEncodingSettingsApiHwaExecuteHwaConfigCommand
* @version 4.11.0.19
*/
export default class MediaEncodingSettingsApiHwaExecuteHwaConfigCommand {
    /**
    * Constructs a new <code>MediaEncodingSettingsApiHwaExecuteHwaConfigCommand</code>.
    * @alias module:model/MediaEncodingSettingsApiHwaExecuteHwaConfigCommand
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingSettingsApiHwaExecuteHwaConfigCommand</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingSettingsApiHwaExecuteHwaConfigCommand} obj Optional instance to populate.
    * @return {module:model/MediaEncodingSettingsApiHwaExecuteHwaConfigCommand} The populated <code>MediaEncodingSettingsApiHwaExecuteHwaConfigCommand</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingSettingsApiHwaExecuteHwaConfigCommand();
                        
            
            if (data.hasOwnProperty('NodeId')) {
                obj['NodeId'] = ApiClient.convertToType(data['NodeId'], 'String');
            }
            if (data.hasOwnProperty('CommandType')) {
                obj['CommandType'] = MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType.constructFromObject(data['CommandType']);
            }
            if (data.hasOwnProperty('TargetId')) {
                obj['TargetId'] = ApiClient.convertToType(data['TargetId'], 'String');
            }
            if (data.hasOwnProperty('Data')) {
                obj['Data'] = ApiClient.convertToType(data['Data'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} NodeId
    */
    'NodeId' = undefined;
    /**
    * @member {module:model/MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType} CommandType
    */
    'CommandType' = undefined;
    /**
    * @member {String} TargetId
    */
    'TargetId' = undefined;
    /**
    * @member {String} Data
    */
    'Data' = undefined;




}
