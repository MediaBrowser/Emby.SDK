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
import EditorsEditorRoot from './EditorsEditorRoot';

/**
* The EditObjectContainer model module.
* @module model/EditObjectContainer
* @version 4.8.10.0
*/
export default class EditObjectContainer {
    /**
    * Constructs a new <code>EditObjectContainer</code>.
    * @alias module:model/EditObjectContainer
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EditObjectContainer</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EditObjectContainer} obj Optional instance to populate.
    * @return {module:model/EditObjectContainer} The populated <code>EditObjectContainer</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EditObjectContainer();
                        
            
            if (data.hasOwnProperty('Object')) {
                obj['Object'] = ApiClient.convertToType(data['Object'], Object);
            }
            if (data.hasOwnProperty('DefaultObject')) {
                obj['DefaultObject'] = ApiClient.convertToType(data['DefaultObject'], Object);
            }
            if (data.hasOwnProperty('TypeName')) {
                obj['TypeName'] = ApiClient.convertToType(data['TypeName'], 'String');
            }
            if (data.hasOwnProperty('EditorRoot')) {
                obj['EditorRoot'] = EditorsEditorRoot.constructFromObject(data['EditorRoot']);
            }
        }
        return obj;
    }

    /**
    * @member {Object} Object
    */
    'Object' = undefined;
    /**
    * @member {Object} DefaultObject
    */
    'DefaultObject' = undefined;
    /**
    * @member {String} TypeName
    */
    'TypeName' = undefined;
    /**
    * @member {module:model/EditorsEditorRoot} EditorRoot
    */
    'EditorRoot' = undefined;




}
