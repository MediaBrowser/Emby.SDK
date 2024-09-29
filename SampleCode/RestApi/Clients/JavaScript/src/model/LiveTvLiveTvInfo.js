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
* The LiveTvLiveTvInfo model module.
* @module model/LiveTvLiveTvInfo
* @version 4.8.10.0
*/
export default class LiveTvLiveTvInfo {
    /**
    * Constructs a new <code>LiveTvLiveTvInfo</code>.
    * @alias module:model/LiveTvLiveTvInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTvLiveTvInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTvLiveTvInfo} obj Optional instance to populate.
    * @return {module:model/LiveTvLiveTvInfo} The populated <code>LiveTvLiveTvInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTvLiveTvInfo();
                        
            
            if (data.hasOwnProperty('IsEnabled')) {
                obj['IsEnabled'] = ApiClient.convertToType(data['IsEnabled'], 'Boolean');
            }
            if (data.hasOwnProperty('EnabledUsers')) {
                obj['EnabledUsers'] = ApiClient.convertToType(data['EnabledUsers'], ['String']);
            }
        }
        return obj;
    }

    /**
    * A value indicating whether this instance is enabled.
    * @member {Boolean} IsEnabled
    */
    'IsEnabled' = undefined;
    /**
    * The enabled users.
    * @member {Array.<String>} EnabledUsers
    */
    'EnabledUsers' = undefined;




}
