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
import SortOrder from './SortOrder';

/**
* The DisplayPreferences model module.
* @module model/DisplayPreferences
* @version 4.8.0.38
*/
export default class DisplayPreferences {
    /**
    * Constructs a new <code>DisplayPreferences</code>.
    * @alias module:model/DisplayPreferences
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DisplayPreferences</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DisplayPreferences} obj Optional instance to populate.
    * @return {module:model/DisplayPreferences} The populated <code>DisplayPreferences</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DisplayPreferences();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('SortBy')) {
                obj['SortBy'] = ApiClient.convertToType(data['SortBy'], 'String');
            }
            if (data.hasOwnProperty('CustomPrefs')) {
                obj['CustomPrefs'] = ApiClient.convertToType(data['CustomPrefs'], {'String': 'String'});
            }
            if (data.hasOwnProperty('SortOrder')) {
                obj['SortOrder'] = SortOrder.constructFromObject(data['SortOrder']);
            }
            if (data.hasOwnProperty('Client')) {
                obj['Client'] = ApiClient.convertToType(data['Client'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} SortBy
    */
    'SortBy' = undefined;
    /**
    * @member {Object.<String, String>} CustomPrefs
    */
    'CustomPrefs' = undefined;
    /**
    * @member {module:model/SortOrder} SortOrder
    */
    'SortOrder' = undefined;
    /**
    * @member {String} Client
    */
    'Client' = undefined;




}
