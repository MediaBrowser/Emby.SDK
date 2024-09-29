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
import LiveTvSeriesTimerInfoDto from './LiveTvSeriesTimerInfoDto';

/**
* The QueryResultLiveTvSeriesTimerInfoDto model module.
* @module model/QueryResultLiveTvSeriesTimerInfoDto
* @version 4.8.10.0
*/
export default class QueryResultLiveTvSeriesTimerInfoDto {
    /**
    * Constructs a new <code>QueryResultLiveTvSeriesTimerInfoDto</code>.
    * @alias module:model/QueryResultLiveTvSeriesTimerInfoDto
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultLiveTvSeriesTimerInfoDto</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultLiveTvSeriesTimerInfoDto} obj Optional instance to populate.
    * @return {module:model/QueryResultLiveTvSeriesTimerInfoDto} The populated <code>QueryResultLiveTvSeriesTimerInfoDto</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultLiveTvSeriesTimerInfoDto();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [LiveTvSeriesTimerInfoDto]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/LiveTvSeriesTimerInfoDto>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
