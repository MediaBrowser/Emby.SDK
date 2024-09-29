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
* The LibraryMediaUpdateInfo model module.
* @module model/LibraryMediaUpdateInfo
* @version 4.8.10.0
*/
export default class LibraryMediaUpdateInfo {
    /**
    * Constructs a new <code>LibraryMediaUpdateInfo</code>.
    * @alias module:model/LibraryMediaUpdateInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryMediaUpdateInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryMediaUpdateInfo} obj Optional instance to populate.
    * @return {module:model/LibraryMediaUpdateInfo} The populated <code>LibraryMediaUpdateInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryMediaUpdateInfo();
                        
            
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
            if (data.hasOwnProperty('UpdateType')) {
                obj['UpdateType'] = ApiClient.convertToType(data['UpdateType'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Path
    */
    'Path' = undefined;
    /**
    * @member {String} UpdateType
    */
    'UpdateType' = undefined;




}
