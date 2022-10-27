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
import ScrollDirection from './ScrollDirection';
import SortOrder from './SortOrder';

/**
* The DisplayPreferences model module.
* @module model/DisplayPreferences
* @version 4.8.0.15
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
            if (data.hasOwnProperty('ViewType')) {
                obj['ViewType'] = ApiClient.convertToType(data['ViewType'], 'String');
            }
            if (data.hasOwnProperty('SortBy')) {
                obj['SortBy'] = ApiClient.convertToType(data['SortBy'], 'String');
            }
            if (data.hasOwnProperty('IndexBy')) {
                obj['IndexBy'] = ApiClient.convertToType(data['IndexBy'], 'String');
            }
            if (data.hasOwnProperty('RememberIndexing')) {
                obj['RememberIndexing'] = ApiClient.convertToType(data['RememberIndexing'], 'Boolean');
            }
            if (data.hasOwnProperty('PrimaryImageHeight')) {
                obj['PrimaryImageHeight'] = ApiClient.convertToType(data['PrimaryImageHeight'], 'Number');
            }
            if (data.hasOwnProperty('PrimaryImageWidth')) {
                obj['PrimaryImageWidth'] = ApiClient.convertToType(data['PrimaryImageWidth'], 'Number');
            }
            if (data.hasOwnProperty('CustomPrefs')) {
                obj['CustomPrefs'] = ApiClient.convertToType(data['CustomPrefs'], {'String': 'String'});
            }
            if (data.hasOwnProperty('ScrollDirection')) {
                obj['ScrollDirection'] = ScrollDirection.constructFromObject(data['ScrollDirection']);
            }
            if (data.hasOwnProperty('ShowBackdrop')) {
                obj['ShowBackdrop'] = ApiClient.convertToType(data['ShowBackdrop'], 'Boolean');
            }
            if (data.hasOwnProperty('RememberSorting')) {
                obj['RememberSorting'] = ApiClient.convertToType(data['RememberSorting'], 'Boolean');
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
    * @member {String} ViewType
    */
    'ViewType' = undefined;
    /**
    * @member {String} SortBy
    */
    'SortBy' = undefined;
    /**
    * @member {String} IndexBy
    */
    'IndexBy' = undefined;
    /**
    * @member {Boolean} RememberIndexing
    */
    'RememberIndexing' = undefined;
    /**
    * @member {Number} PrimaryImageHeight
    */
    'PrimaryImageHeight' = undefined;
    /**
    * @member {Number} PrimaryImageWidth
    */
    'PrimaryImageWidth' = undefined;
    /**
    * @member {Object.<String, String>} CustomPrefs
    */
    'CustomPrefs' = undefined;
    /**
    * @member {module:model/ScrollDirection} ScrollDirection
    */
    'ScrollDirection' = undefined;
    /**
    * @member {Boolean} ShowBackdrop
    */
    'ShowBackdrop' = undefined;
    /**
    * @member {Boolean} RememberSorting
    */
    'RememberSorting' = undefined;
    /**
    * @member {module:model/SortOrder} SortOrder
    */
    'SortOrder' = undefined;
    /**
    * @member {String} Client
    */
    'Client' = undefined;




}
