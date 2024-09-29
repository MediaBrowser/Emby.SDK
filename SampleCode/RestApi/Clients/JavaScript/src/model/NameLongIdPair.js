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
* The NameLongIdPair model module.
* @module model/NameLongIdPair
* @version 4.8.10.0
*/
export default class NameLongIdPair {
    /**
    * Constructs a new <code>NameLongIdPair</code>.
    * @alias module:model/NameLongIdPair
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>NameLongIdPair</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/NameLongIdPair} obj Optional instance to populate.
    * @return {module:model/NameLongIdPair} The populated <code>NameLongIdPair</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NameLongIdPair();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'Number');
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
    * @member {Number} Id
    */
    'Id' = undefined;




}
