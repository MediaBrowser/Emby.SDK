/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.6
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ConfigurationMediaPathInfo from './ConfigurationMediaPathInfo';

/**
* The LibraryUpdateMediaPath model module.
* @module model/LibraryUpdateMediaPath
* @version 4.8.0.6
*/
export default class LibraryUpdateMediaPath {
    /**
    * Constructs a new <code>LibraryUpdateMediaPath</code>.
    * @alias module:model/LibraryUpdateMediaPath
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryUpdateMediaPath</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryUpdateMediaPath} obj Optional instance to populate.
    * @return {module:model/LibraryUpdateMediaPath} The populated <code>LibraryUpdateMediaPath</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryUpdateMediaPath();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('PathInfo')) {
                obj['PathInfo'] = ConfigurationMediaPathInfo.constructFromObject(data['PathInfo']);
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {module:model/ConfigurationMediaPathInfo} PathInfo
    */
    'PathInfo' = undefined;




}
