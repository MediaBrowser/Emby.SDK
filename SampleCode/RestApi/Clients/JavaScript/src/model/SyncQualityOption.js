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
* The SyncQualityOption model module.
* @module model/SyncQualityOption
* @version 4.8.10.0
*/
export default class SyncQualityOption {
    /**
    * Constructs a new <code>SyncQualityOption</code>.
    * @alias module:model/SyncQualityOption
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncQualityOption</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncQualityOption} obj Optional instance to populate.
    * @return {module:model/SyncQualityOption} The populated <code>SyncQualityOption</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncQualityOption();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Description')) {
                obj['Description'] = ApiClient.convertToType(data['Description'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('IsDefault')) {
                obj['IsDefault'] = ApiClient.convertToType(data['IsDefault'], 'Boolean');
            }
            if (data.hasOwnProperty('IsOriginalQuality')) {
                obj['IsOriginalQuality'] = ApiClient.convertToType(data['IsOriginalQuality'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Description
    */
    'Description' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {Boolean} IsDefault
    */
    'IsDefault' = undefined;
    /**
    * @member {Boolean} IsOriginalQuality
    */
    'IsOriginalQuality' = undefined;




}
