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
* The ExternalIdInfo model module.
* @module model/ExternalIdInfo
* @version 4.8.10.0
*/
export default class ExternalIdInfo {
    /**
    * Constructs a new <code>ExternalIdInfo</code>.
    * @alias module:model/ExternalIdInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ExternalIdInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ExternalIdInfo} obj Optional instance to populate.
    * @return {module:model/ExternalIdInfo} The populated <code>ExternalIdInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ExternalIdInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Key')) {
                obj['Key'] = ApiClient.convertToType(data['Key'], 'String');
            }
            if (data.hasOwnProperty('Website')) {
                obj['Website'] = ApiClient.convertToType(data['Website'], 'String');
            }
            if (data.hasOwnProperty('UrlFormatString')) {
                obj['UrlFormatString'] = ApiClient.convertToType(data['UrlFormatString'], 'String');
            }
            if (data.hasOwnProperty('IsSupportedAsIdentifier')) {
                obj['IsSupportedAsIdentifier'] = ApiClient.convertToType(data['IsSupportedAsIdentifier'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * The key.
    * @member {String} Key
    */
    'Key' = undefined;
    /**
    * @member {String} Website
    */
    'Website' = undefined;
    /**
    * The URL format string.
    * @member {String} UrlFormatString
    */
    'UrlFormatString' = undefined;
    /**
    * @member {Boolean} IsSupportedAsIdentifier
    */
    'IsSupportedAsIdentifier' = undefined;




}
