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
* The ExternalUrl model module.
* @module model/ExternalUrl
* @version 4.8.10.0
*/
export default class ExternalUrl {
    /**
    * Constructs a new <code>ExternalUrl</code>.
    * @alias module:model/ExternalUrl
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ExternalUrl</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ExternalUrl} obj Optional instance to populate.
    * @return {module:model/ExternalUrl} The populated <code>ExternalUrl</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ExternalUrl();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Url')) {
                obj['Url'] = ApiClient.convertToType(data['Url'], 'String');
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
    * The type of the item.
    * @member {String} Url
    */
    'Url' = undefined;




}
