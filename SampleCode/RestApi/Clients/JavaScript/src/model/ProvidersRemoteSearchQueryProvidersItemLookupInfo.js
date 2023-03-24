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
import ProvidersItemLookupInfo from './ProvidersItemLookupInfo';

/**
* The ProvidersRemoteSearchQueryProvidersItemLookupInfo model module.
* @module model/ProvidersRemoteSearchQueryProvidersItemLookupInfo
* @version 4.8.0.26
*/
export default class ProvidersRemoteSearchQueryProvidersItemLookupInfo {
    /**
    * Constructs a new <code>ProvidersRemoteSearchQueryProvidersItemLookupInfo</code>.
    * @alias module:model/ProvidersRemoteSearchQueryProvidersItemLookupInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ProvidersRemoteSearchQueryProvidersItemLookupInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ProvidersRemoteSearchQueryProvidersItemLookupInfo} obj Optional instance to populate.
    * @return {module:model/ProvidersRemoteSearchQueryProvidersItemLookupInfo} The populated <code>ProvidersRemoteSearchQueryProvidersItemLookupInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProvidersRemoteSearchQueryProvidersItemLookupInfo();
                        
            
            if (data.hasOwnProperty('SearchInfo')) {
                obj['SearchInfo'] = ProvidersItemLookupInfo.constructFromObject(data['SearchInfo']);
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
    * @member {module:model/ProvidersItemLookupInfo} SearchInfo
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
