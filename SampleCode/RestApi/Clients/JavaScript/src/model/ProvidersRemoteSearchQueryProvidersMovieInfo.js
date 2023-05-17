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
import ProvidersMovieInfo from './ProvidersMovieInfo';

/**
* The ProvidersRemoteSearchQueryProvidersMovieInfo model module.
* @module model/ProvidersRemoteSearchQueryProvidersMovieInfo
* @version 4.8.0.36
*/
export default class ProvidersRemoteSearchQueryProvidersMovieInfo {
    /**
    * Constructs a new <code>ProvidersRemoteSearchQueryProvidersMovieInfo</code>.
    * @alias module:model/ProvidersRemoteSearchQueryProvidersMovieInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ProvidersRemoteSearchQueryProvidersMovieInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ProvidersRemoteSearchQueryProvidersMovieInfo} obj Optional instance to populate.
    * @return {module:model/ProvidersRemoteSearchQueryProvidersMovieInfo} The populated <code>ProvidersRemoteSearchQueryProvidersMovieInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProvidersRemoteSearchQueryProvidersMovieInfo();
                        
            
            if (data.hasOwnProperty('SearchInfo')) {
                obj['SearchInfo'] = ProvidersMovieInfo.constructFromObject(data['SearchInfo']);
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
    * @member {module:model/ProvidersMovieInfo} SearchInfo
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
