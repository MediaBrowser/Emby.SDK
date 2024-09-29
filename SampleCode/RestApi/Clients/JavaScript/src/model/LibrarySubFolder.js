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
* The LibrarySubFolder model module.
* @module model/LibrarySubFolder
* @version 4.8.10.0
*/
export default class LibrarySubFolder {
    /**
    * Constructs a new <code>LibrarySubFolder</code>.
    * @alias module:model/LibrarySubFolder
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibrarySubFolder</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibrarySubFolder} obj Optional instance to populate.
    * @return {module:model/LibrarySubFolder} The populated <code>LibrarySubFolder</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibrarySubFolder();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
            if (data.hasOwnProperty('IsUserAccessConfigurable')) {
                obj['IsUserAccessConfigurable'] = ApiClient.convertToType(data['IsUserAccessConfigurable'], 'Boolean');
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
    * @member {String} Path
    */
    'Path' = undefined;
    /**
    * @member {Boolean} IsUserAccessConfigurable
    */
    'IsUserAccessConfigurable' = undefined;




}
