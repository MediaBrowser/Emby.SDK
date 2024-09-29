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

/**
* The ActionsPostbackAction model module.
* @module model/ActionsPostbackAction
* @version 4.8.10.0
*/
export default class ActionsPostbackAction {
    /**
    * Constructs a new <code>ActionsPostbackAction</code>.
    * @alias module:model/ActionsPostbackAction
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ActionsPostbackAction</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ActionsPostbackAction} obj Optional instance to populate.
    * @return {module:model/ActionsPostbackAction} The populated <code>ActionsPostbackAction</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ActionsPostbackAction();
                        
            
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
