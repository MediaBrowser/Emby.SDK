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
import ProviderIdDictionary from './ProviderIdDictionary';

/**
* The LinkedItemInfo model module.
* @module model/LinkedItemInfo
* @version 4.9.2.5
*/
export default class LinkedItemInfo {
    /**
    * Constructs a new <code>LinkedItemInfo</code>.
    * @alias module:model/LinkedItemInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LinkedItemInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LinkedItemInfo} obj Optional instance to populate.
    * @return {module:model/LinkedItemInfo} The populated <code>LinkedItemInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LinkedItemInfo();
                        
            
            if (data.hasOwnProperty('ProviderIds')) {
                obj['ProviderIds'] = ProviderIdDictionary.constructFromObject(data['ProviderIds']);
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/ProviderIdDictionary} ProviderIds
    */
    'ProviderIds' = undefined;
    /**
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * The identifier.
    * @member {Number} Id
    */
    'Id' = undefined;




}
