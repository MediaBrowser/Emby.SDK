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
import ForgotPasswordAction from './ForgotPasswordAction';

/**
* The ForgotPasswordResult model module.
* @module model/ForgotPasswordResult
* @version 4.8.10.0
*/
export default class ForgotPasswordResult {
    /**
    * Constructs a new <code>ForgotPasswordResult</code>.
    * @alias module:model/ForgotPasswordResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ForgotPasswordResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ForgotPasswordResult} obj Optional instance to populate.
    * @return {module:model/ForgotPasswordResult} The populated <code>ForgotPasswordResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ForgotPasswordResult();
                        
            
            if (data.hasOwnProperty('Action')) {
                obj['Action'] = ForgotPasswordAction.constructFromObject(data['Action']);
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
    * @member {module:model/ForgotPasswordAction} Action
    */
    'Action' = undefined;
    /**
    * The pin file.
    * @member {String} PinFile
    */
    'PinFile' = undefined;
    /**
    * The pin expiration date.
    * @member {Date} PinExpirationDate
    */
    'PinExpirationDate' = undefined;




}
