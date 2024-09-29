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
* The GlobalizationLocalizatonOption model module.
* @module model/GlobalizationLocalizatonOption
* @version 4.8.10.0
*/
export default class GlobalizationLocalizatonOption {
    /**
    * Constructs a new <code>GlobalizationLocalizatonOption</code>.
    * @alias module:model/GlobalizationLocalizatonOption
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>GlobalizationLocalizatonOption</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/GlobalizationLocalizatonOption} obj Optional instance to populate.
    * @return {module:model/GlobalizationLocalizatonOption} The populated <code>GlobalizationLocalizatonOption</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GlobalizationLocalizatonOption();
                        
            
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
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Value
    */
    'Value' = undefined;




}
