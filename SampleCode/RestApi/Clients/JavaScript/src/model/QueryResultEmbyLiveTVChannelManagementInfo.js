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
import EmbyLiveTVChannelManagementInfo from './EmbyLiveTVChannelManagementInfo';

/**
* The QueryResultEmbyLiveTVChannelManagementInfo model module.
* @module model/QueryResultEmbyLiveTVChannelManagementInfo
* @version 4.8.0.50
*/
export default class QueryResultEmbyLiveTVChannelManagementInfo {
    /**
    * Constructs a new <code>QueryResultEmbyLiveTVChannelManagementInfo</code>.
    * @alias module:model/QueryResultEmbyLiveTVChannelManagementInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultEmbyLiveTVChannelManagementInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultEmbyLiveTVChannelManagementInfo} obj Optional instance to populate.
    * @return {module:model/QueryResultEmbyLiveTVChannelManagementInfo} The populated <code>QueryResultEmbyLiveTVChannelManagementInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultEmbyLiveTVChannelManagementInfo();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [EmbyLiveTVChannelManagementInfo]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/EmbyLiveTVChannelManagementInfo>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
