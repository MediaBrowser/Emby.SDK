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
* The SyncModelSyncQualityOption model module.
* @module model/SyncModelSyncQualityOption
* @version 4.8.0.35
*/
export default class SyncModelSyncQualityOption {
    /**
    * Constructs a new <code>SyncModelSyncQualityOption</code>.
    * @alias module:model/SyncModelSyncQualityOption
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncModelSyncQualityOption</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncModelSyncQualityOption} obj Optional instance to populate.
    * @return {module:model/SyncModelSyncQualityOption} The populated <code>SyncModelSyncQualityOption</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncModelSyncQualityOption();
                        
            
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
