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
import LibraryMediaUpdateInfo from './LibraryMediaUpdateInfo';

/**
* The LibraryPostUpdatedMedia model module.
* @module model/LibraryPostUpdatedMedia
* @version 4.8.10.0
*/
export default class LibraryPostUpdatedMedia {
    /**
    * Constructs a new <code>LibraryPostUpdatedMedia</code>.
    * @alias module:model/LibraryPostUpdatedMedia
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryPostUpdatedMedia</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryPostUpdatedMedia} obj Optional instance to populate.
    * @return {module:model/LibraryPostUpdatedMedia} The populated <code>LibraryPostUpdatedMedia</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryPostUpdatedMedia();
                        
            
            if (data.hasOwnProperty('Updates')) {
                obj['Updates'] = ApiClient.convertToType(data['Updates'], [LibraryMediaUpdateInfo]);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/LibraryMediaUpdateInfo>} Updates
    */
    'Updates' = undefined;




}
