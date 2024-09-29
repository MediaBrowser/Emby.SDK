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
* The LibraryDeleteInfo model module.
* @module model/LibraryDeleteInfo
* @version 4.8.10.0
*/
export default class LibraryDeleteInfo {
    /**
    * Constructs a new <code>LibraryDeleteInfo</code>.
    * @alias module:model/LibraryDeleteInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryDeleteInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryDeleteInfo} obj Optional instance to populate.
    * @return {module:model/LibraryDeleteInfo} The populated <code>LibraryDeleteInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryDeleteInfo();
                        
            
            if (data.hasOwnProperty('Paths')) {
                obj['Paths'] = ApiClient.convertToType(data['Paths'], ['String']);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<String>} Paths
    */
    'Paths' = undefined;




}
