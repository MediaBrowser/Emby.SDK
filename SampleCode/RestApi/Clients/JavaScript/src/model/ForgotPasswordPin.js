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
* The ForgotPasswordPin model module.
* @module model/ForgotPasswordPin
* @version 4.8.10.0
*/
export default class ForgotPasswordPin {
    /**
    * Constructs a new <code>ForgotPasswordPin</code>.
    * @alias module:model/ForgotPasswordPin
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ForgotPasswordPin</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ForgotPasswordPin} obj Optional instance to populate.
    * @return {module:model/ForgotPasswordPin} The populated <code>ForgotPasswordPin</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ForgotPasswordPin();
                        
            
            if (data.hasOwnProperty('Pin')) {
                obj['Pin'] = ApiClient.convertToType(data['Pin'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Pin
    */
    'Pin' = undefined;




}
