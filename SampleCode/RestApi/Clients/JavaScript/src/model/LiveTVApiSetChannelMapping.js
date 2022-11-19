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

/**
* The LiveTVApiSetChannelMapping model module.
* @module model/LiveTVApiSetChannelMapping
* @version 4.8.0.18
*/
export default class LiveTVApiSetChannelMapping {
    /**
    * Constructs a new <code>LiveTVApiSetChannelMapping</code>.
    * @alias module:model/LiveTVApiSetChannelMapping
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTVApiSetChannelMapping</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTVApiSetChannelMapping} obj Optional instance to populate.
    * @return {module:model/LiveTVApiSetChannelMapping} The populated <code>LiveTVApiSetChannelMapping</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTVApiSetChannelMapping();
                        
            
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
