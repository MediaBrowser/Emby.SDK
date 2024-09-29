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
import ChannelManagementInfo from './ChannelManagementInfo';

/**
* The QueryResultChannelManagementInfo model module.
* @module model/QueryResultChannelManagementInfo
* @version 4.8.10.0
*/
export default class QueryResultChannelManagementInfo {
    /**
    * Constructs a new <code>QueryResultChannelManagementInfo</code>.
    * @alias module:model/QueryResultChannelManagementInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultChannelManagementInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultChannelManagementInfo} obj Optional instance to populate.
    * @return {module:model/QueryResultChannelManagementInfo} The populated <code>QueryResultChannelManagementInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultChannelManagementInfo();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [ChannelManagementInfo]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/ChannelManagementInfo>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
