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
* The ConfigurationMediaPathInfo model module.
* @module model/ConfigurationMediaPathInfo
* @version 4.8.0.20
*/
export default class ConfigurationMediaPathInfo {
    /**
    * Constructs a new <code>ConfigurationMediaPathInfo</code>.
    * @alias module:model/ConfigurationMediaPathInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ConfigurationMediaPathInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ConfigurationMediaPathInfo} obj Optional instance to populate.
    * @return {module:model/ConfigurationMediaPathInfo} The populated <code>ConfigurationMediaPathInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConfigurationMediaPathInfo();
                        
            
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
            if (data.hasOwnProperty('NetworkPath')) {
                obj['NetworkPath'] = ApiClient.convertToType(data['NetworkPath'], 'String');
            }
            if (data.hasOwnProperty('Username')) {
                obj['Username'] = ApiClient.convertToType(data['Username'], 'String');
            }
            if (data.hasOwnProperty('Password')) {
                obj['Password'] = ApiClient.convertToType(data['Password'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Path
    */
    'Path' = undefined;
    /**
    * @member {String} NetworkPath
    */
    'NetworkPath' = undefined;
    /**
    * @member {String} Username
    */
    'Username' = undefined;
    /**
    * @member {String} Password
    */
    'Password' = undefined;




}
