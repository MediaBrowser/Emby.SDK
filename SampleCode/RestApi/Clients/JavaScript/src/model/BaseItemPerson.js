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
import PersonType from './PersonType';

/**
* The BaseItemPerson model module.
* @module model/BaseItemPerson
* @version 4.8.10.0
*/
export default class BaseItemPerson {
    /**
    * Constructs a new <code>BaseItemPerson</code>.
    * This is used by the api to get information about a Person within a BaseItem  
    * @alias module:model/BaseItemPerson
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>BaseItemPerson</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/BaseItemPerson} obj Optional instance to populate.
    * @return {module:model/BaseItemPerson} The populated <code>BaseItemPerson</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BaseItemPerson();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Role')) {
                obj['Role'] = ApiClient.convertToType(data['Role'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = PersonType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('PrimaryImageTag')) {
                obj['PrimaryImageTag'] = ApiClient.convertToType(data['PrimaryImageTag'], 'String');
            }
        }
        return obj;
    }

    /**
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * The identifier.
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * The role.
    * @member {String} Role
    */
    'Role' = undefined;
    /**
    * @member {module:model/PersonType} Type
    */
    'Type' = undefined;
    /**
    * The primary image tag.
    * @member {String} PrimaryImageTag
    */
    'PrimaryImageTag' = undefined;




}
