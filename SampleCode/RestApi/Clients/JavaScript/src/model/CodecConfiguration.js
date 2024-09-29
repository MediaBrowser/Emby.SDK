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
* The CodecConfiguration model module.
* @module model/CodecConfiguration
* @version 4.8.10.0
*/
export default class CodecConfiguration {
    /**
    * Constructs a new <code>CodecConfiguration</code>.
    * @alias module:model/CodecConfiguration
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>CodecConfiguration</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/CodecConfiguration} obj Optional instance to populate.
    * @return {module:model/CodecConfiguration} The populated <code>CodecConfiguration</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CodecConfiguration();
                        
            
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
    * A value indicating whether the codec is enabled.
    * @member {Boolean} IsEnabled
    */
    'IsEnabled' = undefined;
    /**
    * The selection priority for the codec.    Higher values mean higher priority.
    * @member {Number} Priority
    */
    'Priority' = undefined;
    /**
    * The codec identifier.
    * @member {String} CodecId
    */
    'CodecId' = undefined;




}
