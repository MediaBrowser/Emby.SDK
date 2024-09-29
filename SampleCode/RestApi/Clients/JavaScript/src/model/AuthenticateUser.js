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
* The AuthenticateUser model module.
* @module model/AuthenticateUser
* @version 4.8.10.0
*/
export default class AuthenticateUser {
    /**
    * Constructs a new <code>AuthenticateUser</code>.
    * @alias module:model/AuthenticateUser
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>AuthenticateUser</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/AuthenticateUser} obj Optional instance to populate.
    * @return {module:model/AuthenticateUser} The populated <code>AuthenticateUser</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AuthenticateUser();
                        
            
            if (data.hasOwnProperty('Pw')) {
                obj['Pw'] = ApiClient.convertToType(data['Pw'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Pw
    */
    'Pw' = undefined;




}
