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
import ElementsIconNames from './ElementsIconNames';
import MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType from './MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType';

/**
* The MediaEncodingSettingsHwaProjectionNodesUiNodeCommand model module.
* @module model/MediaEncodingSettingsHwaProjectionNodesUiNodeCommand
* @version 4.11.0.19
*/
export default class MediaEncodingSettingsHwaProjectionNodesUiNodeCommand {
    /**
    * Constructs a new <code>MediaEncodingSettingsHwaProjectionNodesUiNodeCommand</code>.
    * @alias module:model/MediaEncodingSettingsHwaProjectionNodesUiNodeCommand
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingSettingsHwaProjectionNodesUiNodeCommand</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingSettingsHwaProjectionNodesUiNodeCommand} obj Optional instance to populate.
    * @return {module:model/MediaEncodingSettingsHwaProjectionNodesUiNodeCommand} The populated <code>MediaEncodingSettingsHwaProjectionNodesUiNodeCommand</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingSettingsHwaProjectionNodesUiNodeCommand();
                        
            
            if (data.hasOwnProperty('CommandType')) {
                obj['CommandType'] = MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType.constructFromObject(data['CommandType']);
            }
            if (data.hasOwnProperty('Caption')) {
                obj['Caption'] = ApiClient.convertToType(data['Caption'], 'String');
            }
            if (data.hasOwnProperty('Icon')) {
                obj['Icon'] = ElementsIconNames.constructFromObject(data['Icon']);
            }
            if (data.hasOwnProperty('IsRemote')) {
                obj['IsRemote'] = ApiClient.convertToType(data['IsRemote'], 'Boolean');
            }
            if (data.hasOwnProperty('CommandData')) {
                obj['CommandData'] = ApiClient.convertToType(data['CommandData'], 'String');
            }
            if (data.hasOwnProperty('OpensForm')) {
                obj['OpensForm'] = ApiClient.convertToType(data['OpensForm'], 'Boolean');
            }
            if (data.hasOwnProperty('ConfirmationPrompt')) {
                obj['ConfirmationPrompt'] = ApiClient.convertToType(data['ConfirmationPrompt'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType} CommandType
    */
    'CommandType' = undefined;
    /**
    * @member {String} Caption
    */
    'Caption' = undefined;
    /**
    * @member {module:model/ElementsIconNames} Icon
    */
    'Icon' = undefined;
    /**
    * @member {Boolean} IsRemote
    */
    'IsRemote' = undefined;
    /**
    * @member {String} CommandData
    */
    'CommandData' = undefined;
    /**
    * @member {Boolean} OpensForm
    */
    'OpensForm' = undefined;
    /**
    * @member {String} ConfirmationPrompt
    */
    'ConfirmationPrompt' = undefined;




}
