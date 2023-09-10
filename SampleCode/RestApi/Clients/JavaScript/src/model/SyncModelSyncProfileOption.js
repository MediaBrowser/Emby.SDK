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
* The SyncModelSyncProfileOption model module.
* @module model/SyncModelSyncProfileOption
* @version 4.8.0.46
*/
export default class SyncModelSyncProfileOption {
    /**
    * Constructs a new <code>SyncModelSyncProfileOption</code>.
    * @alias module:model/SyncModelSyncProfileOption
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncModelSyncProfileOption</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncModelSyncProfileOption} obj Optional instance to populate.
    * @return {module:model/SyncModelSyncProfileOption} The populated <code>SyncModelSyncProfileOption</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncModelSyncProfileOption();
                        
            
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
            if (data.hasOwnProperty('EnableQualityOptions')) {
                obj['EnableQualityOptions'] = ApiClient.convertToType(data['EnableQualityOptions'], 'Boolean');
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
    * @member {Boolean} EnableQualityOptions
    */
    'EnableQualityOptions' = undefined;




}
