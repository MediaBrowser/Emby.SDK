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
* The GenericEditIEditObjectContainer model module.
* @module model/GenericEditIEditObjectContainer
* @version 4.8.10.0
*/
export default class GenericEditIEditObjectContainer {
    /**
    * Constructs a new <code>GenericEditIEditObjectContainer</code>.
    * @alias module:model/GenericEditIEditObjectContainer
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>GenericEditIEditObjectContainer</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/GenericEditIEditObjectContainer} obj Optional instance to populate.
    * @return {module:model/GenericEditIEditObjectContainer} The populated <code>GenericEditIEditObjectContainer</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GenericEditIEditObjectContainer();
                        
            
            if (data.hasOwnProperty('Object')) {
                obj['Object'] = ApiClient.convertToType(data['Object'], Object);
            }
            if (data.hasOwnProperty('DefaultObject')) {
                obj['DefaultObject'] = ApiClient.convertToType(data['DefaultObject'], Object);
            }
            if (data.hasOwnProperty('TypeName')) {
                obj['TypeName'] = ApiClient.convertToType(data['TypeName'], 'String');
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




}
