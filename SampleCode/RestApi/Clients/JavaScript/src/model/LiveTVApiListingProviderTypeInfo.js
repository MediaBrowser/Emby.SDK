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
* The LiveTVApiListingProviderTypeInfo model module.
* @module model/LiveTVApiListingProviderTypeInfo
* @version 4.8.0.65
*/
export default class LiveTVApiListingProviderTypeInfo {
    /**
    * Constructs a new <code>LiveTVApiListingProviderTypeInfo</code>.
    * @alias module:model/LiveTVApiListingProviderTypeInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTVApiListingProviderTypeInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTVApiListingProviderTypeInfo} obj Optional instance to populate.
    * @return {module:model/LiveTVApiListingProviderTypeInfo} The populated <code>LiveTVApiListingProviderTypeInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTVApiListingProviderTypeInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('SetupUrl')) {
                obj['SetupUrl'] = ApiClient.convertToType(data['SetupUrl'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} SetupUrl
    */
    'SetupUrl' = undefined;




}
