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
* The BitRate model module.
* @module model/BitRate
* @version 4.8.10.0
*/
export default class BitRate {
    /**
    * Constructs a new <code>BitRate</code>.
    * A type for handling bit rates.      The purpose of this type is to avoid manual calculations and conversions in code,             unified handling and conversion as well as presentation through its various To\\*\\*\\*String methods.      &#x60;System.IComparable&#x60;      &#x60;System.IEquatable&#x60;1&#x60;  
    * @alias module:model/BitRate
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>BitRate</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/BitRate} obj Optional instance to populate.
    * @return {module:model/BitRate} The populated <code>BitRate</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BitRate();
                        
            
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
