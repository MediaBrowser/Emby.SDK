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
import LiveTvTimerInfoDto from './LiveTvTimerInfoDto';

/**
* The QueryResultLiveTvTimerInfoDto model module.
* @module model/QueryResultLiveTvTimerInfoDto
* @version 4.8.10.0
*/
export default class QueryResultLiveTvTimerInfoDto {
    /**
    * Constructs a new <code>QueryResultLiveTvTimerInfoDto</code>.
    * @alias module:model/QueryResultLiveTvTimerInfoDto
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultLiveTvTimerInfoDto</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultLiveTvTimerInfoDto} obj Optional instance to populate.
    * @return {module:model/QueryResultLiveTvTimerInfoDto} The populated <code>QueryResultLiveTvTimerInfoDto</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultLiveTvTimerInfoDto();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [LiveTvTimerInfoDto]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/LiveTvTimerInfoDto>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
