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
import TrailerInfo from './TrailerInfo';

/**
* The RemoteSearchQueryTrailerInfo model module.
* @module model/RemoteSearchQueryTrailerInfo
* @version 4.8.3.0
*/
export default class RemoteSearchQueryTrailerInfo {
    /**
    * Constructs a new <code>RemoteSearchQueryTrailerInfo</code>.
    * @alias module:model/RemoteSearchQueryTrailerInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>RemoteSearchQueryTrailerInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/RemoteSearchQueryTrailerInfo} obj Optional instance to populate.
    * @return {module:model/RemoteSearchQueryTrailerInfo} The populated <code>RemoteSearchQueryTrailerInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RemoteSearchQueryTrailerInfo();
                        
            
            if (data.hasOwnProperty('SearchInfo')) {
                obj['SearchInfo'] = TrailerInfo.constructFromObject(data['SearchInfo']);
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
    * @member {module:model/TrailerInfo} SearchInfo
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
