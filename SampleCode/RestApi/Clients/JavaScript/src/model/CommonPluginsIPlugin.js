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
import Version from './Version';

/**
* The CommonPluginsIPlugin model module.
* @module model/CommonPluginsIPlugin
* @version 4.8.0.16
*/
export default class CommonPluginsIPlugin {
    /**
    * Constructs a new <code>CommonPluginsIPlugin</code>.
    * @alias module:model/CommonPluginsIPlugin
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>CommonPluginsIPlugin</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/CommonPluginsIPlugin} obj Optional instance to populate.
    * @return {module:model/CommonPluginsIPlugin} The populated <code>CommonPluginsIPlugin</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CommonPluginsIPlugin();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Description')) {
                obj['Description'] = ApiClient.convertToType(data['Description'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Version')) {
                obj['Version'] = Version.constructFromObject(data['Version']);
            }
            if (data.hasOwnProperty('AssemblyFilePath')) {
                obj['AssemblyFilePath'] = ApiClient.convertToType(data['AssemblyFilePath'], 'String');
            }
            if (data.hasOwnProperty('DataFolderPath')) {
                obj['DataFolderPath'] = ApiClient.convertToType(data['DataFolderPath'], 'String');
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
    * @member {module:model/Version} Version
    */
    'Version' = undefined;
    /**
    * @member {String} AssemblyFilePath
    */
    'AssemblyFilePath' = undefined;
    /**
    * @member {String} DataFolderPath
    */
    'DataFolderPath' = undefined;




}
