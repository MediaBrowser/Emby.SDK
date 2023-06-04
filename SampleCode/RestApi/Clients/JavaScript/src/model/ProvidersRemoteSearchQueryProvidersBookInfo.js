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
import ProvidersBookInfo from './ProvidersBookInfo';

/**
* The ProvidersRemoteSearchQueryProvidersBookInfo model module.
* @module model/ProvidersRemoteSearchQueryProvidersBookInfo
* @version 4.8.0.38
*/
export default class ProvidersRemoteSearchQueryProvidersBookInfo {
    /**
    * Constructs a new <code>ProvidersRemoteSearchQueryProvidersBookInfo</code>.
    * @alias module:model/ProvidersRemoteSearchQueryProvidersBookInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ProvidersRemoteSearchQueryProvidersBookInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ProvidersRemoteSearchQueryProvidersBookInfo} obj Optional instance to populate.
    * @return {module:model/ProvidersRemoteSearchQueryProvidersBookInfo} The populated <code>ProvidersRemoteSearchQueryProvidersBookInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProvidersRemoteSearchQueryProvidersBookInfo();
                        
            
            if (data.hasOwnProperty('SearchInfo')) {
                obj['SearchInfo'] = ProvidersBookInfo.constructFromObject(data['SearchInfo']);
            }
            if (data.hasOwnProperty('ItemId')) {
                obj['ItemId'] = ApiClient.convertToType(data['ItemId'], 'Number');
            }
            if (data.hasOwnProperty('SearchProviderName')) {
                obj['SearchProviderName'] = ApiClient.convertToType(data['SearchProviderName'], 'String');
            }
            if (data.hasOwnProperty('Providers')) {
                obj['Providers'] = ApiClient.convertToType(data['Providers'], ['String']);
            }
            if (data.hasOwnProperty('IncludeDisabledProviders')) {
                obj['IncludeDisabledProviders'] = ApiClient.convertToType(data['IncludeDisabledProviders'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/ProvidersBookInfo} SearchInfo
    */
    'SearchInfo' = undefined;
    /**
    * @member {Number} ItemId
    */
    'ItemId' = undefined;
    /**
    * @member {String} SearchProviderName
    */
    'SearchProviderName' = undefined;
    /**
    * @member {Array.<String>} Providers
    */
    'Providers' = undefined;
    /**
    * @member {Boolean} IncludeDisabledProviders
    */
    'IncludeDisabledProviders' = undefined;




}
