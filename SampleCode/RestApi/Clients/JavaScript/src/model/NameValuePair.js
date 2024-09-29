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
* The NameValuePair model module.
* @module model/NameValuePair
* @version 4.8.10.0
*/
export default class NameValuePair {
    /**
    * Constructs a new <code>NameValuePair</code>.
    * @alias module:model/NameValuePair
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>NameValuePair</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/NameValuePair} obj Optional instance to populate.
    * @return {module:model/NameValuePair} The populated <code>NameValuePair</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NameValuePair();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Value')) {
                obj['Value'] = ApiClient.convertToType(data['Value'], 'String');
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
    * The value.
    * @member {String} Value
    */
    'Value' = undefined;




}
