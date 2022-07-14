/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.3
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import LibrarySubFolder from './LibrarySubFolder';

/**
* The LibraryMediaFolder model module.
* @module model/LibraryMediaFolder
* @version 4.8.0.3
*/
export default class LibraryMediaFolder {
    /**
    * Constructs a new <code>LibraryMediaFolder</code>.
    * @alias module:model/LibraryMediaFolder
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryMediaFolder</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryMediaFolder} obj Optional instance to populate.
    * @return {module:model/LibraryMediaFolder} The populated <code>LibraryMediaFolder</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryMediaFolder();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Guid')) {
                obj['Guid'] = ApiClient.convertToType(data['Guid'], 'String');
            }
            if (data.hasOwnProperty('SubFolders')) {
                obj['SubFolders'] = ApiClient.convertToType(data['SubFolders'], [LibrarySubFolder]);
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} Guid
    */
    'Guid' = undefined;
    /**
    * @member {Array.<module:model/LibrarySubFolder>} SubFolders
    */
    'SubFolders' = undefined;




}
