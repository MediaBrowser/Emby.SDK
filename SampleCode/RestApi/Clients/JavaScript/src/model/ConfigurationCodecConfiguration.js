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
* The ConfigurationCodecConfiguration model module.
* @module model/ConfigurationCodecConfiguration
* @version 4.8.0.37
*/
export default class ConfigurationCodecConfiguration {
    /**
    * Constructs a new <code>ConfigurationCodecConfiguration</code>.
    * @alias module:model/ConfigurationCodecConfiguration
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ConfigurationCodecConfiguration</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ConfigurationCodecConfiguration} obj Optional instance to populate.
    * @return {module:model/ConfigurationCodecConfiguration} The populated <code>ConfigurationCodecConfiguration</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConfigurationCodecConfiguration();
                        
            
            if (data.hasOwnProperty('IsEnabled')) {
                obj['IsEnabled'] = ApiClient.convertToType(data['IsEnabled'], 'Boolean');
            }
            if (data.hasOwnProperty('Priority')) {
                obj['Priority'] = ApiClient.convertToType(data['Priority'], 'Number');
            }
            if (data.hasOwnProperty('CodecId')) {
                obj['CodecId'] = ApiClient.convertToType(data['CodecId'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} IsEnabled
    */
    'IsEnabled' = undefined;
    /**
    * @member {Number} Priority
    */
    'Priority' = undefined;
    /**
    * @member {String} CodecId
    */
    'CodecId' = undefined;




}
