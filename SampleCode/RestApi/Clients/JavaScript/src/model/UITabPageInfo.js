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
* The UITabPageInfo model module.
* @module model/UITabPageInfo
* @version 4.8.10.0
*/
export default class UITabPageInfo {
    /**
    * Constructs a new <code>UITabPageInfo</code>.
    * @alias module:model/UITabPageInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UITabPageInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UITabPageInfo} obj Optional instance to populate.
    * @return {module:model/UITabPageInfo} The populated <code>UITabPageInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UITabPageInfo();
                        
            
            if (data.hasOwnProperty('PageId')) {
                obj['PageId'] = ApiClient.convertToType(data['PageId'], 'String');
            }
            if (data.hasOwnProperty('DisplayName')) {
                obj['DisplayName'] = ApiClient.convertToType(data['DisplayName'], 'String');
            }
            if (data.hasOwnProperty('PluginId')) {
                obj['PluginId'] = ApiClient.convertToType(data['PluginId'], 'String');
            }
            if (data.hasOwnProperty('Href')) {
                obj['Href'] = ApiClient.convertToType(data['Href'], 'String');
            }
            if (data.hasOwnProperty('NavKey')) {
                obj['NavKey'] = ApiClient.convertToType(data['NavKey'], 'String');
            }
            if (data.hasOwnProperty('Index')) {
                obj['Index'] = ApiClient.convertToType(data['Index'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {String} PageId
    */
    'PageId' = undefined;
    /**
    * @member {String} DisplayName
    */
    'DisplayName' = undefined;
    /**
    * @member {String} PluginId
    */
    'PluginId' = undefined;
    /**
    * @member {String} Href
    */
    'Href' = undefined;
    /**
    * @member {String} NavKey
    */
    'NavKey' = undefined;
    /**
    * @member {Number} Index
    */
    'Index' = undefined;




}
