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
* The UserLibraryOfficialRatingItem model module.
* @module model/UserLibraryOfficialRatingItem
* @version 4.8.10.0
*/
export default class UserLibraryOfficialRatingItem {
    /**
    * Constructs a new <code>UserLibraryOfficialRatingItem</code>.
    * @alias module:model/UserLibraryOfficialRatingItem
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UserLibraryOfficialRatingItem</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UserLibraryOfficialRatingItem} obj Optional instance to populate.
    * @return {module:model/UserLibraryOfficialRatingItem} The populated <code>UserLibraryOfficialRatingItem</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserLibraryOfficialRatingItem();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;




}
