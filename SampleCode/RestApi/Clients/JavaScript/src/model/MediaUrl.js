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
* The MediaUrl model module.
* @module model/MediaUrl
* @version 4.8.10.0
*/
export default class MediaUrl {
    /**
    * Constructs a new <code>MediaUrl</code>.
    * @alias module:model/MediaUrl
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaUrl</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaUrl} obj Optional instance to populate.
    * @return {module:model/MediaUrl} The populated <code>MediaUrl</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaUrl();
                        
            
            if (data.hasOwnProperty('Url')) {
                obj['Url'] = ApiClient.convertToType(data['Url'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Url
    */
    'Url' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;




}
