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
* The LiveTvGuideInfo model module.
* @module model/LiveTvGuideInfo
* @version 4.8.10.0
*/
export default class LiveTvGuideInfo {
    /**
    * Constructs a new <code>LiveTvGuideInfo</code>.
    * @alias module:model/LiveTvGuideInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTvGuideInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTvGuideInfo} obj Optional instance to populate.
    * @return {module:model/LiveTvGuideInfo} The populated <code>LiveTvGuideInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTvGuideInfo();
                        
            
            if (data.hasOwnProperty('StartDate')) {
                obj['StartDate'] = ApiClient.convertToType(data['StartDate'], 'Date');
            }
            if (data.hasOwnProperty('EndDate')) {
                obj['EndDate'] = ApiClient.convertToType(data['EndDate'], 'Date');
            }
        }
        return obj;
    }

    /**
    * The start date.
    * @member {Date} StartDate
    */
    'StartDate' = undefined;
    /**
    * The end date.
    * @member {Date} EndDate
    */
    'EndDate' = undefined;




}
