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
import VirtualFolderInfo from './VirtualFolderInfo';

/**
* The QueryResultVirtualFolderInfo model module.
* @module model/QueryResultVirtualFolderInfo
* @version 4.8.10.0
*/
export default class QueryResultVirtualFolderInfo {
    /**
    * Constructs a new <code>QueryResultVirtualFolderInfo</code>.
    * @alias module:model/QueryResultVirtualFolderInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultVirtualFolderInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultVirtualFolderInfo} obj Optional instance to populate.
    * @return {module:model/QueryResultVirtualFolderInfo} The populated <code>QueryResultVirtualFolderInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultVirtualFolderInfo();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [VirtualFolderInfo]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/VirtualFolderInfo>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
