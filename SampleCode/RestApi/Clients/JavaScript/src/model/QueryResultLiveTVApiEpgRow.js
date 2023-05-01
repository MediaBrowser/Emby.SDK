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
import LiveTVApiEpgRow from './LiveTVApiEpgRow';

/**
* The QueryResultLiveTVApiEpgRow model module.
* @module model/QueryResultLiveTVApiEpgRow
* @version 4.8.0.33
*/
export default class QueryResultLiveTVApiEpgRow {
    /**
    * Constructs a new <code>QueryResultLiveTVApiEpgRow</code>.
    * @alias module:model/QueryResultLiveTVApiEpgRow
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultLiveTVApiEpgRow</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultLiveTVApiEpgRow} obj Optional instance to populate.
    * @return {module:model/QueryResultLiveTVApiEpgRow} The populated <code>QueryResultLiveTVApiEpgRow</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultLiveTVApiEpgRow();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [LiveTVApiEpgRow]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/LiveTVApiEpgRow>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
