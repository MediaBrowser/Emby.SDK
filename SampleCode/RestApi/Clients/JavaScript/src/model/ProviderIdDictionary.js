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
* The ProviderIdDictionary model module.
* @module model/ProviderIdDictionary
* @version 4.8.10.0
*/
export default class ProviderIdDictionary {
    /**
    * Constructs a new <code>ProviderIdDictionary</code>.
    * @alias module:model/ProviderIdDictionary
    * @class
    * @extends Object
    */

    constructor() {
        
        
        return this;
    }

    /**
    * Constructs a <code>ProviderIdDictionary</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ProviderIdDictionary} obj Optional instance to populate.
    * @return {module:model/ProviderIdDictionary} The populated <code>ProviderIdDictionary</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProviderIdDictionary();
            ApiClient.constructFromObject(data, obj, 'String');
            
            
        }
        return obj;
    }





}
