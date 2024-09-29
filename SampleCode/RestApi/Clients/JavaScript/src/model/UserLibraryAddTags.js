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
import NameIdPair from './NameIdPair';

/**
* The UserLibraryAddTags model module.
* @module model/UserLibraryAddTags
* @version 4.8.10.0
*/
export default class UserLibraryAddTags {
    /**
    * Constructs a new <code>UserLibraryAddTags</code>.
    * @alias module:model/UserLibraryAddTags
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UserLibraryAddTags</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UserLibraryAddTags} obj Optional instance to populate.
    * @return {module:model/UserLibraryAddTags} The populated <code>UserLibraryAddTags</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserLibraryAddTags();
                        
            
            if (data.hasOwnProperty('Tags')) {
                obj['Tags'] = ApiClient.convertToType(data['Tags'], [NameIdPair]);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/NameIdPair>} Tags
    */
    'Tags' = undefined;




}
