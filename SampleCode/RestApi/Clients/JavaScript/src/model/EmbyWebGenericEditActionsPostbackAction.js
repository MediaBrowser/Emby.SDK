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
* The EmbyWebGenericEditActionsPostbackAction model module.
* @module model/EmbyWebGenericEditActionsPostbackAction
* @version 4.8.0.10
*/
export default class EmbyWebGenericEditActionsPostbackAction {
    /**
    * Constructs a new <code>EmbyWebGenericEditActionsPostbackAction</code>.
    * @alias module:model/EmbyWebGenericEditActionsPostbackAction
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyWebGenericEditActionsPostbackAction</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyWebGenericEditActionsPostbackAction} obj Optional instance to populate.
    * @return {module:model/EmbyWebGenericEditActionsPostbackAction} The populated <code>EmbyWebGenericEditActionsPostbackAction</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyWebGenericEditActionsPostbackAction();
                        
            
            if (data.hasOwnProperty('TargetEditorId')) {
                obj['TargetEditorId'] = ApiClient.convertToType(data['TargetEditorId'], 'String');
            }
            if (data.hasOwnProperty('PostbackCommandId')) {
                obj['PostbackCommandId'] = ApiClient.convertToType(data['PostbackCommandId'], 'String');
            }
            if (data.hasOwnProperty('CommandParameterPropertyId')) {
                obj['CommandParameterPropertyId'] = ApiClient.convertToType(data['CommandParameterPropertyId'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} TargetEditorId
    */
    'TargetEditorId' = undefined;
    /**
    * @member {String} PostbackCommandId
    */
    'PostbackCommandId' = undefined;
    /**
    * @member {String} CommandParameterPropertyId
    */
    'CommandParameterPropertyId' = undefined;




}
