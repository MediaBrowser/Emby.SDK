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
import ProvidersGameInfo from './ProvidersGameInfo';

/**
* The ProvidersRemoteSearchQueryProvidersGameInfo model module.
* @module model/ProvidersRemoteSearchQueryProvidersGameInfo
* @version 4.8.0.17
*/
export default class ProvidersRemoteSearchQueryProvidersGameInfo {
    /**
    * Constructs a new <code>ProvidersRemoteSearchQueryProvidersGameInfo</code>.
    * @alias module:model/ProvidersRemoteSearchQueryProvidersGameInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ProvidersRemoteSearchQueryProvidersGameInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ProvidersRemoteSearchQueryProvidersGameInfo} obj Optional instance to populate.
    * @return {module:model/ProvidersRemoteSearchQueryProvidersGameInfo} The populated <code>ProvidersRemoteSearchQueryProvidersGameInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProvidersRemoteSearchQueryProvidersGameInfo();
                        
            
            if (data.hasOwnProperty('SearchInfo')) {
                obj['SearchInfo'] = ProvidersGameInfo.constructFromObject(data['SearchInfo']);
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
    * @member {module:model/ProvidersGameInfo} SearchInfo
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
