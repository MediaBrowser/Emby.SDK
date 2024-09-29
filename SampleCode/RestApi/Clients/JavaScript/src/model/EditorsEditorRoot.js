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
import ActionsPostbackAction from './ActionsPostbackAction';
import CommonEditorTypes from './CommonEditorTypes';
import ConditionsPropertyCondition from './ConditionsPropertyCondition';
import EditorsEditorBase from './EditorsEditorBase';
import EditorsEditorButtonItem from './EditorsEditorButtonItem';

/**
* The EditorsEditorRoot model module.
* @module model/EditorsEditorRoot
* @version 4.8.10.0
*/
export default class EditorsEditorRoot {
    /**
    * Constructs a new <code>EditorsEditorRoot</code>.
    * @alias module:model/EditorsEditorRoot
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EditorsEditorRoot</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EditorsEditorRoot} obj Optional instance to populate.
    * @return {module:model/EditorsEditorRoot} The populated <code>EditorsEditorRoot</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EditorsEditorRoot();
                        
            
            if (data.hasOwnProperty('PropertyConditions')) {
                obj['PropertyConditions'] = ApiClient.convertToType(data['PropertyConditions'], [ConditionsPropertyCondition]);
            }
            if (data.hasOwnProperty('PostbackActions')) {
                obj['PostbackActions'] = ApiClient.convertToType(data['PostbackActions'], [ActionsPostbackAction]);
            }
            if (data.hasOwnProperty('TitleButton')) {
                obj['TitleButton'] = EditorsEditorButtonItem.constructFromObject(data['TitleButton']);
            }
            if (data.hasOwnProperty('EditorItems')) {
                obj['EditorItems'] = ApiClient.convertToType(data['EditorItems'], [EditorsEditorBase]);
            }
            if (data.hasOwnProperty('EditorType')) {
                obj['EditorType'] = CommonEditorTypes.constructFromObject(data['EditorType']);
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
            if (data.hasOwnProperty('FeatureRequiresPremiere')) {
                obj['FeatureRequiresPremiere'] = ApiClient.convertToType(data['FeatureRequiresPremiere'], 'Boolean');
            }
            if (data.hasOwnProperty('ParentId')) {
                obj['ParentId'] = ApiClient.convertToType(data['ParentId'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/ConditionsPropertyCondition>} PropertyConditions
    */
    'PropertyConditions' = undefined;
    /**
    * @member {Array.<module:model/ActionsPostbackAction>} PostbackActions
    */
    'PostbackActions' = undefined;
    /**
    * @member {module:model/EditorsEditorButtonItem} TitleButton
    */
    'TitleButton' = undefined;
    /**
    * @member {Array.<module:model/EditorsEditorBase>} EditorItems
    */
    'EditorItems' = undefined;
    /**
    * @member {module:model/CommonEditorTypes} EditorType
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
    * @member {Boolean} FeatureRequiresPremiere
    */
    'FeatureRequiresPremiere' = undefined;
    /**
    * @member {String} ParentId
    */
    'ParentId' = undefined;




}
