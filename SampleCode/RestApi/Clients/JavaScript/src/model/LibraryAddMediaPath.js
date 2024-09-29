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
import MediaPathInfo from './MediaPathInfo';

/**
* The LibraryAddMediaPath model module.
* @module model/LibraryAddMediaPath
* @version 4.8.10.0
*/
export default class LibraryAddMediaPath {
    /**
    * Constructs a new <code>LibraryAddMediaPath</code>.
    * @alias module:model/LibraryAddMediaPath
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryAddMediaPath</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryAddMediaPath} obj Optional instance to populate.
    * @return {module:model/LibraryAddMediaPath} The populated <code>LibraryAddMediaPath</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryAddMediaPath();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
            if (data.hasOwnProperty('PathInfo')) {
                obj['PathInfo'] = MediaPathInfo.constructFromObject(data['PathInfo']);
            }
            if (data.hasOwnProperty('RefreshLibrary')) {
                obj['RefreshLibrary'] = ApiClient.convertToType(data['RefreshLibrary'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} Path
    */
    'Path' = undefined;
    /**
    * @member {module:model/MediaPathInfo} PathInfo
    */
    'PathInfo' = undefined;
    /**
    * @member {Boolean} RefreshLibrary
    */
    'RefreshLibrary' = undefined;




}
