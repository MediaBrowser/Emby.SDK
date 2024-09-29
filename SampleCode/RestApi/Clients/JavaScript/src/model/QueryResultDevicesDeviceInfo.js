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
import DevicesDeviceInfo from './DevicesDeviceInfo';

/**
* The QueryResultDevicesDeviceInfo model module.
* @module model/QueryResultDevicesDeviceInfo
* @version 4.8.10.0
*/
export default class QueryResultDevicesDeviceInfo {
    /**
    * Constructs a new <code>QueryResultDevicesDeviceInfo</code>.
    * @alias module:model/QueryResultDevicesDeviceInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultDevicesDeviceInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultDevicesDeviceInfo} obj Optional instance to populate.
    * @return {module:model/QueryResultDevicesDeviceInfo} The populated <code>QueryResultDevicesDeviceInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultDevicesDeviceInfo();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [DevicesDeviceInfo]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/DevicesDeviceInfo>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
