/**
 * Emby Server REST API (BETA)
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
* The LibraryFullUserCopyDataOptions model module.
* @module model/LibraryFullUserCopyDataOptions
* @version 4.10.0.24
*/
export default class LibraryFullUserCopyDataOptions {
    /**
    * Constructs a new <code>LibraryFullUserCopyDataOptions</code>.
    * @alias module:model/LibraryFullUserCopyDataOptions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryFullUserCopyDataOptions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryFullUserCopyDataOptions} obj Optional instance to populate.
    * @return {module:model/LibraryFullUserCopyDataOptions} The populated <code>LibraryFullUserCopyDataOptions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryFullUserCopyDataOptions();
                        
            
            if (data.hasOwnProperty('DataOptions')) {
                obj['DataOptions'] = ApiClient.convertToType(data['DataOptions'], [NameIdPair]);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/NameIdPair>} DataOptions
    */
    'DataOptions' = undefined;




}
