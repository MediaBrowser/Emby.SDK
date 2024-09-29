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
import UserLibraryOfficialRatingItem from './UserLibraryOfficialRatingItem';

/**
* The QueryResultUserLibraryOfficialRatingItem model module.
* @module model/QueryResultUserLibraryOfficialRatingItem
* @version 4.8.10.0
*/
export default class QueryResultUserLibraryOfficialRatingItem {
    /**
    * Constructs a new <code>QueryResultUserLibraryOfficialRatingItem</code>.
    * @alias module:model/QueryResultUserLibraryOfficialRatingItem
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultUserLibraryOfficialRatingItem</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultUserLibraryOfficialRatingItem} obj Optional instance to populate.
    * @return {module:model/QueryResultUserLibraryOfficialRatingItem} The populated <code>QueryResultUserLibraryOfficialRatingItem</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultUserLibraryOfficialRatingItem();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [UserLibraryOfficialRatingItem]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/UserLibraryOfficialRatingItem>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
