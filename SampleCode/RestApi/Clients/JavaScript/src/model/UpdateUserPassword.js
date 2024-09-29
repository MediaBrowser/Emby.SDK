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
* The UpdateUserPassword model module.
* @module model/UpdateUserPassword
* @version 4.8.10.0
*/
export default class UpdateUserPassword {
    /**
    * Constructs a new <code>UpdateUserPassword</code>.
    * @alias module:model/UpdateUserPassword
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UpdateUserPassword</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UpdateUserPassword} obj Optional instance to populate.
    * @return {module:model/UpdateUserPassword} The populated <code>UpdateUserPassword</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateUserPassword();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('NewPw')) {
                obj['NewPw'] = ApiClient.convertToType(data['NewPw'], 'String');
            }
            if (data.hasOwnProperty('ResetPassword')) {
                obj['ResetPassword'] = ApiClient.convertToType(data['ResetPassword'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} NewPw
    */
    'NewPw' = undefined;
    /**
    * @member {Boolean} ResetPassword
    */
    'ResetPassword' = undefined;




}
