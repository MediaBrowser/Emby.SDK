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
import EmbyWebGenericUIModelEnumsUICommandType from './EmbyWebGenericUIModelEnumsUICommandType';

/**
* The EmbyWebGenericUIModelUICommand model module.
* @module model/EmbyWebGenericUIModelUICommand
* @version 4.8.0.25
*/
export default class EmbyWebGenericUIModelUICommand {
    /**
    * Constructs a new <code>EmbyWebGenericUIModelUICommand</code>.
    * @alias module:model/EmbyWebGenericUIModelUICommand
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyWebGenericUIModelUICommand</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyWebGenericUIModelUICommand} obj Optional instance to populate.
    * @return {module:model/EmbyWebGenericUIModelUICommand} The populated <code>EmbyWebGenericUIModelUICommand</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyWebGenericUIModelUICommand();
                        
            
            if (data.hasOwnProperty('CommandType')) {
                obj['CommandType'] = EmbyWebGenericUIModelEnumsUICommandType.constructFromObject(data['CommandType']);
            }
            if (data.hasOwnProperty('CommandId')) {
                obj['CommandId'] = ApiClient.convertToType(data['CommandId'], 'String');
            }
            if (data.hasOwnProperty('IsVisible')) {
                obj['IsVisible'] = ApiClient.convertToType(data['IsVisible'], 'Boolean');
            }
            if (data.hasOwnProperty('IsEnabled')) {
                obj['IsEnabled'] = ApiClient.convertToType(data['IsEnabled'], 'Boolean');
            }
            if (data.hasOwnProperty('Caption')) {
                obj['Caption'] = ApiClient.convertToType(data['Caption'], 'String');
            }
            if (data.hasOwnProperty('SetFocus')) {
                obj['SetFocus'] = ApiClient.convertToType(data['SetFocus'], 'Boolean');
            }
            if (data.hasOwnProperty('ConfirmationPrompt')) {
                obj['ConfirmationPrompt'] = ApiClient.convertToType(data['ConfirmationPrompt'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/EmbyWebGenericUIModelEnumsUICommandType} CommandType
    */
    'CommandType' = undefined;
    /**
    * @member {String} CommandId
    */
    'CommandId' = undefined;
    /**
    * @member {Boolean} IsVisible
    */
    'IsVisible' = undefined;
    /**
    * @member {Boolean} IsEnabled
    */
    'IsEnabled' = undefined;
    /**
    * @member {String} Caption
    */
    'Caption' = undefined;
    /**
    * @member {Boolean} SetFocus
    */
    'SetFocus' = undefined;
    /**
    * @member {String} ConfirmationPrompt
    */
    'ConfirmationPrompt' = undefined;




}
