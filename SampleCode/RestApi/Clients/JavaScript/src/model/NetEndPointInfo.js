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
* The NetEndPointInfo model module.
* @module model/NetEndPointInfo
* @version 4.8.10.0
*/
export default class NetEndPointInfo {
    /**
    * Constructs a new <code>NetEndPointInfo</code>.
    * @alias module:model/NetEndPointInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>NetEndPointInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/NetEndPointInfo} obj Optional instance to populate.
    * @return {module:model/NetEndPointInfo} The populated <code>NetEndPointInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NetEndPointInfo();
                        
            
            if (data.hasOwnProperty('IsLocal')) {
                obj['IsLocal'] = ApiClient.convertToType(data['IsLocal'], 'Boolean');
            }
            if (data.hasOwnProperty('IsInNetwork')) {
                obj['IsInNetwork'] = ApiClient.convertToType(data['IsInNetwork'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} IsLocal
    */
    'IsLocal' = undefined;
    /**
    * @member {Boolean} IsInNetwork
    */
    'IsInNetwork' = undefined;




}
