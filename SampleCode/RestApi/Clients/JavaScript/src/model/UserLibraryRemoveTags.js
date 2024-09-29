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
* The UserLibraryRemoveTags model module.
* @module model/UserLibraryRemoveTags
* @version 4.8.10.0
*/
export default class UserLibraryRemoveTags {
    /**
    * Constructs a new <code>UserLibraryRemoveTags</code>.
    * @alias module:model/UserLibraryRemoveTags
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UserLibraryRemoveTags</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UserLibraryRemoveTags} obj Optional instance to populate.
    * @return {module:model/UserLibraryRemoveTags} The populated <code>UserLibraryRemoveTags</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserLibraryRemoveTags();
                        
            
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
