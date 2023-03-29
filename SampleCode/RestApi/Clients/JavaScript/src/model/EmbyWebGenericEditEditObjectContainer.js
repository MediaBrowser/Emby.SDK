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
import EmbyWebGenericEditEditorsEditorRoot from './EmbyWebGenericEditEditorsEditorRoot';

/**
* The EmbyWebGenericEditEditObjectContainer model module.
* @module model/EmbyWebGenericEditEditObjectContainer
* @version 4.8.0.27
*/
export default class EmbyWebGenericEditEditObjectContainer {
    /**
    * Constructs a new <code>EmbyWebGenericEditEditObjectContainer</code>.
    * @alias module:model/EmbyWebGenericEditEditObjectContainer
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyWebGenericEditEditObjectContainer</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyWebGenericEditEditObjectContainer} obj Optional instance to populate.
    * @return {module:model/EmbyWebGenericEditEditObjectContainer} The populated <code>EmbyWebGenericEditEditObjectContainer</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyWebGenericEditEditObjectContainer();
                        
            
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
                obj['EditorRoot'] = EmbyWebGenericEditEditorsEditorRoot.constructFromObject(data['EditorRoot']);
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
    * @member {module:model/EmbyWebGenericEditEditorsEditorRoot} EditorRoot
    */
    'EditorRoot' = undefined;




}
