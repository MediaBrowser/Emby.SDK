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
* The LibraryRenameVirtualFolder model module.
* @module model/LibraryRenameVirtualFolder
* @version 4.8.10.0
*/
export default class LibraryRenameVirtualFolder {
    /**
    * Constructs a new <code>LibraryRenameVirtualFolder</code>.
    * @alias module:model/LibraryRenameVirtualFolder
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryRenameVirtualFolder</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryRenameVirtualFolder} obj Optional instance to populate.
    * @return {module:model/LibraryRenameVirtualFolder} The populated <code>LibraryRenameVirtualFolder</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryRenameVirtualFolder();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('NewName')) {
                obj['NewName'] = ApiClient.convertToType(data['NewName'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} NewName
    */
    'NewName' = undefined;




}
