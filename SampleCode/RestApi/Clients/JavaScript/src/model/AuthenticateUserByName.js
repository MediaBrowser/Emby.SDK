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
* The AuthenticateUserByName model module.
* @module model/AuthenticateUserByName
* @version 4.8.10.0
*/
export default class AuthenticateUserByName {
    /**
    * Constructs a new <code>AuthenticateUserByName</code>.
    * @alias module:model/AuthenticateUserByName
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>AuthenticateUserByName</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/AuthenticateUserByName} obj Optional instance to populate.
    * @return {module:model/AuthenticateUserByName} The populated <code>AuthenticateUserByName</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AuthenticateUserByName();
                        
            
            if (data.hasOwnProperty('Username')) {
                obj['Username'] = ApiClient.convertToType(data['Username'], 'String');
            }
            if (data.hasOwnProperty('Pw')) {
                obj['Pw'] = ApiClient.convertToType(data['Pw'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Username
    */
    'Username' = undefined;
    /**
    * @member {String} Pw
    */
    'Pw' = undefined;




}
