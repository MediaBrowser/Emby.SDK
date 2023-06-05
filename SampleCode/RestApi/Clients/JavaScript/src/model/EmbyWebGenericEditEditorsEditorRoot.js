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
import EmbyWebGenericEditActionsPostbackAction from './EmbyWebGenericEditActionsPostbackAction';
import EmbyWebGenericEditCommonEditorTypes from './EmbyWebGenericEditCommonEditorTypes';
import EmbyWebGenericEditConditionsPropertyCondition from './EmbyWebGenericEditConditionsPropertyCondition';
import EmbyWebGenericEditEditorsEditorBase from './EmbyWebGenericEditEditorsEditorBase';
import EmbyWebGenericEditEditorsEditorButtonItem from './EmbyWebGenericEditEditorsEditorButtonItem';

/**
* The EmbyWebGenericEditEditorsEditorRoot model module.
* @module model/EmbyWebGenericEditEditorsEditorRoot
* @version 4.8.0.39
*/
export default class EmbyWebGenericEditEditorsEditorRoot {
    /**
    * Constructs a new <code>EmbyWebGenericEditEditorsEditorRoot</code>.
    * @alias module:model/EmbyWebGenericEditEditorsEditorRoot
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyWebGenericEditEditorsEditorRoot</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyWebGenericEditEditorsEditorRoot} obj Optional instance to populate.
    * @return {module:model/EmbyWebGenericEditEditorsEditorRoot} The populated <code>EmbyWebGenericEditEditorsEditorRoot</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyWebGenericEditEditorsEditorRoot();
                        
            
            if (data.hasOwnProperty('PropertyConditions')) {
                obj['PropertyConditions'] = ApiClient.convertToType(data['PropertyConditions'], [EmbyWebGenericEditConditionsPropertyCondition]);
            }
            if (data.hasOwnProperty('PostbackActions')) {
                obj['PostbackActions'] = ApiClient.convertToType(data['PostbackActions'], [EmbyWebGenericEditActionsPostbackAction]);
            }
            if (data.hasOwnProperty('TitleButton')) {
                obj['TitleButton'] = EmbyWebGenericEditEditorsEditorButtonItem.constructFromObject(data['TitleButton']);
            }
            if (data.hasOwnProperty('EditorItems')) {
                obj['EditorItems'] = ApiClient.convertToType(data['EditorItems'], [EmbyWebGenericEditEditorsEditorBase]);
            }
            if (data.hasOwnProperty('EditorType')) {
                obj['EditorType'] = EmbyWebGenericEditCommonEditorTypes.constructFromObject(data['EditorType']);
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('AllowEmpty')) {
                obj['AllowEmpty'] = ApiClient.convertToType(data['AllowEmpty'], 'Boolean');
            }
            if (data.hasOwnProperty('IsReadOnly')) {
                obj['IsReadOnly'] = ApiClient.convertToType(data['IsReadOnly'], 'Boolean');
            }
            if (data.hasOwnProperty('IsAdvanced')) {
                obj['IsAdvanced'] = ApiClient.convertToType(data['IsAdvanced'], 'Boolean');
            }
            if (data.hasOwnProperty('DisplayName')) {
                obj['DisplayName'] = ApiClient.convertToType(data['DisplayName'], 'String');
            }
            if (data.hasOwnProperty('Description')) {
                obj['Description'] = ApiClient.convertToType(data['Description'], 'String');
            }
            if (data.hasOwnProperty('ParentId')) {
                obj['ParentId'] = ApiClient.convertToType(data['ParentId'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/EmbyWebGenericEditConditionsPropertyCondition>} PropertyConditions
    */
    'PropertyConditions' = undefined;
    /**
    * @member {Array.<module:model/EmbyWebGenericEditActionsPostbackAction>} PostbackActions
    */
    'PostbackActions' = undefined;
    /**
    * @member {module:model/EmbyWebGenericEditEditorsEditorButtonItem} TitleButton
    */
    'TitleButton' = undefined;
    /**
    * @member {Array.<module:model/EmbyWebGenericEditEditorsEditorBase>} EditorItems
    */
    'EditorItems' = undefined;
    /**
    * @member {module:model/EmbyWebGenericEditCommonEditorTypes} EditorType
    */
    'EditorType' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {Boolean} AllowEmpty
    */
    'AllowEmpty' = undefined;
    /**
    * @member {Boolean} IsReadOnly
    */
    'IsReadOnly' = undefined;
    /**
    * @member {Boolean} IsAdvanced
    */
    'IsAdvanced' = undefined;
    /**
    * @member {String} DisplayName
    */
    'DisplayName' = undefined;
    /**
    * @member {String} Description
    */
    'Description' = undefined;
    /**
    * @member {String} ParentId
    */
    'ParentId' = undefined;




}
