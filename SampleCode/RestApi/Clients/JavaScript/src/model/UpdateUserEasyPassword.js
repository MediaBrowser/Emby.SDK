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

/**
* The UpdateUserEasyPassword model module.
* @module model/UpdateUserEasyPassword
* @version 4.8.0.18
*/
export default class UpdateUserEasyPassword {
    /**
    * Constructs a new <code>UpdateUserEasyPassword</code>.
    * @alias module:model/UpdateUserEasyPassword
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UpdateUserEasyPassword</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UpdateUserEasyPassword} obj Optional instance to populate.
    * @return {module:model/UpdateUserEasyPassword} The populated <code>UpdateUserEasyPassword</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateUserEasyPassword();
                        
            
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
