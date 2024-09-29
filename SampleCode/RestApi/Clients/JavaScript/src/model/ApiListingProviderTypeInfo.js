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
* The ApiListingProviderTypeInfo model module.
* @module model/ApiListingProviderTypeInfo
* @version 4.8.10.0
*/
export default class ApiListingProviderTypeInfo {
    /**
    * Constructs a new <code>ApiListingProviderTypeInfo</code>.
    * @alias module:model/ApiListingProviderTypeInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ApiListingProviderTypeInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ApiListingProviderTypeInfo} obj Optional instance to populate.
    * @return {module:model/ApiListingProviderTypeInfo} The populated <code>ApiListingProviderTypeInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApiListingProviderTypeInfo();
                        
            
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
