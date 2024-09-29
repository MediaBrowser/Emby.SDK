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
* The ApiSetChannelMapping model module.
* @module model/ApiSetChannelMapping
* @version 4.8.10.0
*/
export default class ApiSetChannelMapping {
    /**
    * Constructs a new <code>ApiSetChannelMapping</code>.
    * @alias module:model/ApiSetChannelMapping
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ApiSetChannelMapping</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ApiSetChannelMapping} obj Optional instance to populate.
    * @return {module:model/ApiSetChannelMapping} The populated <code>ApiSetChannelMapping</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApiSetChannelMapping();
                        
            
            if (data.hasOwnProperty('TunerChannelId')) {
                obj['TunerChannelId'] = ApiClient.convertToType(data['TunerChannelId'], 'String');
            }
            if (data.hasOwnProperty('ProviderChannelId')) {
                obj['ProviderChannelId'] = ApiClient.convertToType(data['ProviderChannelId'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} TunerChannelId
    */
    'TunerChannelId' = undefined;
    /**
    * @member {String} ProviderChannelId
    */
    'ProviderChannelId' = undefined;




}
