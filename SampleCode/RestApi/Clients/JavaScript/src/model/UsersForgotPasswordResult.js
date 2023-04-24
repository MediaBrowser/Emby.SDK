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
import UsersForgotPasswordAction from './UsersForgotPasswordAction';

/**
* The UsersForgotPasswordResult model module.
* @module model/UsersForgotPasswordResult
* @version 4.8.0.31
*/
export default class UsersForgotPasswordResult {
    /**
    * Constructs a new <code>UsersForgotPasswordResult</code>.
    * @alias module:model/UsersForgotPasswordResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UsersForgotPasswordResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UsersForgotPasswordResult} obj Optional instance to populate.
    * @return {module:model/UsersForgotPasswordResult} The populated <code>UsersForgotPasswordResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UsersForgotPasswordResult();
                        
            
            if (data.hasOwnProperty('Action')) {
                obj['Action'] = UsersForgotPasswordAction.constructFromObject(data['Action']);
            }
            if (data.hasOwnProperty('PinFile')) {
                obj['PinFile'] = ApiClient.convertToType(data['PinFile'], 'String');
            }
            if (data.hasOwnProperty('PinExpirationDate')) {
                obj['PinExpirationDate'] = ApiClient.convertToType(data['PinExpirationDate'], 'Date');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/UsersForgotPasswordAction} Action
    */
    'Action' = undefined;
    /**
    * @member {String} PinFile
    */
    'PinFile' = undefined;
    /**
    * @member {Date} PinExpirationDate
    */
    'PinExpirationDate' = undefined;




}
