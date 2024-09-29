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
import EnumsUICommandType from './EnumsUICommandType';

/**
* The UICommand model module.
* @module model/UICommand
* @version 4.8.10.0
*/
export default class UICommand {
    /**
    * Constructs a new <code>UICommand</code>.
    * @alias module:model/UICommand
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UICommand</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UICommand} obj Optional instance to populate.
    * @return {module:model/UICommand} The populated <code>UICommand</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UICommand();
                        
            
            if (data.hasOwnProperty('CommandType')) {
                obj['CommandType'] = EnumsUICommandType.constructFromObject(data['CommandType']);
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
    * @member {module:model/EnumsUICommandType} CommandType
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
