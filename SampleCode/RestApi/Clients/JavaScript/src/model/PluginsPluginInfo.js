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
* The PluginsPluginInfo model module.
* @module model/PluginsPluginInfo
* @version 4.8.0.35
*/
export default class PluginsPluginInfo {
    /**
    * Constructs a new <code>PluginsPluginInfo</code>.
    * @alias module:model/PluginsPluginInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PluginsPluginInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PluginsPluginInfo} obj Optional instance to populate.
    * @return {module:model/PluginsPluginInfo} The populated <code>PluginsPluginInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PluginsPluginInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Version')) {
                obj['Version'] = ApiClient.convertToType(data['Version'], 'String');
            }
            if (data.hasOwnProperty('ConfigurationFileName')) {
                obj['ConfigurationFileName'] = ApiClient.convertToType(data['ConfigurationFileName'], 'String');
            }
            if (data.hasOwnProperty('Description')) {
                obj['Description'] = ApiClient.convertToType(data['Description'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('ImageTag')) {
                obj['ImageTag'] = ApiClient.convertToType(data['ImageTag'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Version
    */
    'Version' = undefined;
    /**
    * @member {String} ConfigurationFileName
    */
    'ConfigurationFileName' = undefined;
    /**
    * @member {String} Description
    */
    'Description' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} ImageTag
    */
    'ImageTag' = undefined;




}
