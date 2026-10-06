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

/**
* The EntitiesTVSeriesOrderInfo model module.
* @module model/EntitiesTVSeriesOrderInfo
* @version 4.11.0.6
*/
export default class EntitiesTVSeriesOrderInfo {
    /**
    * Constructs a new <code>EntitiesTVSeriesOrderInfo</code>.
    * @alias module:model/EntitiesTVSeriesOrderInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EntitiesTVSeriesOrderInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EntitiesTVSeriesOrderInfo} obj Optional instance to populate.
    * @return {module:model/EntitiesTVSeriesOrderInfo} The populated <code>EntitiesTVSeriesOrderInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EntitiesTVSeriesOrderInfo();
                        
            
            if (data.hasOwnProperty('ProviderKey')) {
                obj['ProviderKey'] = ApiClient.convertToType(data['ProviderKey'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} ProviderKey
    */
    'ProviderKey' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;




}
