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
* The LibraryRemoveVirtualFolder model module.
* @module model/LibraryRemoveVirtualFolder
* @version 4.8.10.0
*/
export default class LibraryRemoveVirtualFolder {
    /**
    * Constructs a new <code>LibraryRemoveVirtualFolder</code>.
    * @alias module:model/LibraryRemoveVirtualFolder
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryRemoveVirtualFolder</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryRemoveVirtualFolder} obj Optional instance to populate.
    * @return {module:model/LibraryRemoveVirtualFolder} The populated <code>LibraryRemoveVirtualFolder</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryRemoveVirtualFolder();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
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
    * @member {Boolean} RefreshLibrary
    */
    'RefreshLibrary' = undefined;




}
