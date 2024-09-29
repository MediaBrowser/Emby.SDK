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
import CommonPluginsIPlugin from './CommonPluginsIPlugin';
import PluginsConfigurationPageType from './PluginsConfigurationPageType';

/**
* The ApiConfigurationPageInfo model module.
* @module model/ApiConfigurationPageInfo
* @version 4.8.10.0
*/
export default class ApiConfigurationPageInfo {
    /**
    * Constructs a new <code>ApiConfigurationPageInfo</code>.
    * @alias module:model/ApiConfigurationPageInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ApiConfigurationPageInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ApiConfigurationPageInfo} obj Optional instance to populate.
    * @return {module:model/ApiConfigurationPageInfo} The populated <code>ApiConfigurationPageInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApiConfigurationPageInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('EnableInMainMenu')) {
                obj['EnableInMainMenu'] = ApiClient.convertToType(data['EnableInMainMenu'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableInUserMenu')) {
                obj['EnableInUserMenu'] = ApiClient.convertToType(data['EnableInUserMenu'], 'Boolean');
            }
            if (data.hasOwnProperty('FeatureId')) {
                obj['FeatureId'] = ApiClient.convertToType(data['FeatureId'], 'String');
            }
            if (data.hasOwnProperty('MenuSection')) {
                obj['MenuSection'] = ApiClient.convertToType(data['MenuSection'], 'String');
            }
            if (data.hasOwnProperty('MenuIcon')) {
                obj['MenuIcon'] = ApiClient.convertToType(data['MenuIcon'], 'String');
            }
            if (data.hasOwnProperty('DisplayName')) {
                obj['DisplayName'] = ApiClient.convertToType(data['DisplayName'], 'String');
            }
            if (data.hasOwnProperty('ConfigurationPageType')) {
                obj['ConfigurationPageType'] = PluginsConfigurationPageType.constructFromObject(data['ConfigurationPageType']);
            }
            if (data.hasOwnProperty('PluginId')) {
                obj['PluginId'] = ApiClient.convertToType(data['PluginId'], 'String');
            }
            if (data.hasOwnProperty('Href')) {
                obj['Href'] = ApiClient.convertToType(data['Href'], 'String');
            }
            if (data.hasOwnProperty('NavMenuId')) {
                obj['NavMenuId'] = ApiClient.convertToType(data['NavMenuId'], 'String');
            }
            if (data.hasOwnProperty('Plugin')) {
                obj['Plugin'] = CommonPluginsIPlugin.constructFromObject(data['Plugin']);
            }
            if (data.hasOwnProperty('Translations')) {
                obj['Translations'] = ApiClient.convertToType(data['Translations'], ['String']);
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {Boolean} EnableInMainMenu
    */
    'EnableInMainMenu' = undefined;
    /**
    * @member {Boolean} EnableInUserMenu
    */
    'EnableInUserMenu' = undefined;
    /**
    * @member {String} FeatureId
    */
    'FeatureId' = undefined;
    /**
    * @member {String} MenuSection
    */
    'MenuSection' = undefined;
    /**
    * @member {String} MenuIcon
    */
    'MenuIcon' = undefined;
    /**
    * @member {String} DisplayName
    */
    'DisplayName' = undefined;
    /**
    * @member {module:model/PluginsConfigurationPageType} ConfigurationPageType
    */
    'ConfigurationPageType' = undefined;
    /**
    * @member {String} PluginId
    */
    'PluginId' = undefined;
    /**
    * @member {String} Href
    */
    'Href' = undefined;
    /**
    * @member {String} NavMenuId
    */
    'NavMenuId' = undefined;
    /**
    * @member {module:model/CommonPluginsIPlugin} Plugin
    */
    'Plugin' = undefined;
    /**
    * @member {Array.<String>} Translations
    */
    'Translations' = undefined;




}
