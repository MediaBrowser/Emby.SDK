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

/**
* The UserLibraryDeleteHomeSections model module.
* @module model/UserLibraryDeleteHomeSections
* @version 4.10.0.4
*/
export default class UserLibraryDeleteHomeSections {
    /**
    * Constructs a new <code>UserLibraryDeleteHomeSections</code>.
    * @alias module:model/UserLibraryDeleteHomeSections
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UserLibraryDeleteHomeSections</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UserLibraryDeleteHomeSections} obj Optional instance to populate.
    * @return {module:model/UserLibraryDeleteHomeSections} The populated <code>UserLibraryDeleteHomeSections</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserLibraryDeleteHomeSections();
                        
            
            if (data.hasOwnProperty('Ids')) {
                obj['Ids'] = ApiClient.convertToType(data['Ids'], ['String']);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<String>} Ids
    */
    'Ids' = undefined;




}
