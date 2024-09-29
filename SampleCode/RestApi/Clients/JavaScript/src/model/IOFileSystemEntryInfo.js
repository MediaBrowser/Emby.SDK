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
import IOFileSystemEntryType from './IOFileSystemEntryType';

/**
* The IOFileSystemEntryInfo model module.
* @module model/IOFileSystemEntryInfo
* @version 4.8.10.0
*/
export default class IOFileSystemEntryInfo {
    /**
    * Constructs a new <code>IOFileSystemEntryInfo</code>.
    * Class FileSystemEntryInfo  
    * @alias module:model/IOFileSystemEntryInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>IOFileSystemEntryInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/IOFileSystemEntryInfo} obj Optional instance to populate.
    * @return {module:model/IOFileSystemEntryInfo} The populated <code>IOFileSystemEntryInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IOFileSystemEntryInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = IOFileSystemEntryType.constructFromObject(data['Type']);
            }
        }
        return obj;
    }

    /**
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * The path.
    * @member {String} Path
    */
    'Path' = undefined;
    /**
    * @member {module:model/IOFileSystemEntryType} Type
    */
    'Type' = undefined;




}
