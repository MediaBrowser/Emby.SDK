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
* The UserLibraryReportItemsSearched model module.
* @module model/UserLibraryReportItemsSearched
* @version 4.10.0.6
*/
export default class UserLibraryReportItemsSearched {
    /**
    * Constructs a new <code>UserLibraryReportItemsSearched</code>.
    * @alias module:model/UserLibraryReportItemsSearched
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UserLibraryReportItemsSearched</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UserLibraryReportItemsSearched} obj Optional instance to populate.
    * @return {module:model/UserLibraryReportItemsSearched} The populated <code>UserLibraryReportItemsSearched</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserLibraryReportItemsSearched();
                        
            
            if (data.hasOwnProperty('WasSearched')) {
                obj['WasSearched'] = ApiClient.convertToType(data['WasSearched'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} WasSearched
    */
    'WasSearched' = undefined;




}
