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
* The WakeOnLanInfo model module.
* @module model/WakeOnLanInfo
* @version 4.8.10.0
*/
export default class WakeOnLanInfo {
    /**
    * Constructs a new <code>WakeOnLanInfo</code>.
    * @alias module:model/WakeOnLanInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>WakeOnLanInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/WakeOnLanInfo} obj Optional instance to populate.
    * @return {module:model/WakeOnLanInfo} The populated <code>WakeOnLanInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new WakeOnLanInfo();
                        
            
            if (data.hasOwnProperty('MacAddress')) {
                obj['MacAddress'] = ApiClient.convertToType(data['MacAddress'], 'String');
            }
            if (data.hasOwnProperty('BroadcastAddress')) {
                obj['BroadcastAddress'] = ApiClient.convertToType(data['BroadcastAddress'], 'String');
            }
            if (data.hasOwnProperty('Port')) {
                obj['Port'] = ApiClient.convertToType(data['Port'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {String} MacAddress
    */
    'MacAddress' = undefined;
    /**
    * @member {String} BroadcastAddress
    */
    'BroadcastAddress' = undefined;
    /**
    * @member {Number} Port
    */
    'Port' = undefined;




}
