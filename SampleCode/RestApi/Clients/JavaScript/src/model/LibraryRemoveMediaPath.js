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
* The LibraryRemoveMediaPath model module.
* @module model/LibraryRemoveMediaPath
* @version 4.8.10.0
*/
export default class LibraryRemoveMediaPath {
    /**
    * Constructs a new <code>LibraryRemoveMediaPath</code>.
    * @alias module:model/LibraryRemoveMediaPath
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryRemoveMediaPath</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryRemoveMediaPath} obj Optional instance to populate.
    * @return {module:model/LibraryRemoveMediaPath} The populated <code>LibraryRemoveMediaPath</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryRemoveMediaPath();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
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
    * @member {Boolean} RefreshLibrary
    */
    'RefreshLibrary' = undefined;




}
