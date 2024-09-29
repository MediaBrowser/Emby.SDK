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
* The SyncProfileOption model module.
* @module model/SyncProfileOption
* @version 4.8.10.0
*/
export default class SyncProfileOption {
    /**
    * Constructs a new <code>SyncProfileOption</code>.
    * @alias module:model/SyncProfileOption
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncProfileOption</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncProfileOption} obj Optional instance to populate.
    * @return {module:model/SyncProfileOption} The populated <code>SyncProfileOption</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncProfileOption();
                        
            
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
