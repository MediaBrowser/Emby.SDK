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
* The EmbyMediaModelTypesBitRate model module.
* @module model/EmbyMediaModelTypesBitRate
* @version 4.8.0.10
*/
export default class EmbyMediaModelTypesBitRate {
    /**
    * Constructs a new <code>EmbyMediaModelTypesBitRate</code>.
    * @alias module:model/EmbyMediaModelTypesBitRate
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyMediaModelTypesBitRate</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyMediaModelTypesBitRate} obj Optional instance to populate.
    * @return {module:model/EmbyMediaModelTypesBitRate} The populated <code>EmbyMediaModelTypesBitRate</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyMediaModelTypesBitRate();
                        
            
            if (data.hasOwnProperty('bps')) {
                obj['bps'] = ApiClient.convertToType(data['bps'], 'Number');
            }
            if (data.hasOwnProperty('kbps')) {
                obj['kbps'] = ApiClient.convertToType(data['kbps'], 'Number');
            }
            if (data.hasOwnProperty('Mbps')) {
                obj['Mbps'] = ApiClient.convertToType(data['Mbps'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Number} bps
    */
    'bps' = undefined;
    /**
    * @member {Number} kbps
    */
    'kbps' = undefined;
    /**
    * @member {Number} Mbps
    */
    'Mbps' = undefined;




}
