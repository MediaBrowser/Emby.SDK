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
* The ForgotPassword model module.
* @module model/ForgotPassword
* @version 4.8.10.0
*/
export default class ForgotPassword {
    /**
    * Constructs a new <code>ForgotPassword</code>.
    * @alias module:model/ForgotPassword
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ForgotPassword</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ForgotPassword} obj Optional instance to populate.
    * @return {module:model/ForgotPassword} The populated <code>ForgotPassword</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ForgotPassword();
                        
            
            if (data.hasOwnProperty('EnteredUsername')) {
                obj['EnteredUsername'] = ApiClient.convertToType(data['EnteredUsername'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} EnteredUsername
    */
    'EnteredUsername' = undefined;




}
