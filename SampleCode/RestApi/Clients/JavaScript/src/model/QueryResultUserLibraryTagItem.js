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
import UserLibraryTagItem from './UserLibraryTagItem';

/**
* The QueryResultUserLibraryTagItem model module.
* @module model/QueryResultUserLibraryTagItem
* @version 4.8.10.0
*/
export default class QueryResultUserLibraryTagItem {
    /**
    * Constructs a new <code>QueryResultUserLibraryTagItem</code>.
    * @alias module:model/QueryResultUserLibraryTagItem
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultUserLibraryTagItem</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultUserLibraryTagItem} obj Optional instance to populate.
    * @return {module:model/QueryResultUserLibraryTagItem} The populated <code>QueryResultUserLibraryTagItem</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultUserLibraryTagItem();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [UserLibraryTagItem]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/UserLibraryTagItem>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
