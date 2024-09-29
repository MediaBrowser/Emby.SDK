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
* The GetDirectoryContents model module.
* @module model/GetDirectoryContents
* @version 4.8.10.0
*/
export default class GetDirectoryContents {
    /**
    * Constructs a new <code>GetDirectoryContents</code>.
    * @alias module:model/GetDirectoryContents
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>GetDirectoryContents</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/GetDirectoryContents} obj Optional instance to populate.
    * @return {module:model/GetDirectoryContents} The populated <code>GetDirectoryContents</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetDirectoryContents();
                        
            
            if (data.hasOwnProperty('Username')) {
                obj['Username'] = ApiClient.convertToType(data['Username'], 'String');
            }
            if (data.hasOwnProperty('Password')) {
                obj['Password'] = ApiClient.convertToType(data['Password'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Username
    */
    'Username' = undefined;
    /**
    * @member {String} Password
    */
    'Password' = undefined;




}
