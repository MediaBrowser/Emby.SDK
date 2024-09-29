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
* The DevicesDeviceOptions model module.
* @module model/DevicesDeviceOptions
* @version 4.8.10.0
*/
export default class DevicesDeviceOptions {
    /**
    * Constructs a new <code>DevicesDeviceOptions</code>.
    * @alias module:model/DevicesDeviceOptions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DevicesDeviceOptions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DevicesDeviceOptions} obj Optional instance to populate.
    * @return {module:model/DevicesDeviceOptions} The populated <code>DevicesDeviceOptions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DevicesDeviceOptions();
                        
            
            if (data.hasOwnProperty('CustomName')) {
                obj['CustomName'] = ApiClient.convertToType(data['CustomName'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} CustomName
    */
    'CustomName' = undefined;




}
