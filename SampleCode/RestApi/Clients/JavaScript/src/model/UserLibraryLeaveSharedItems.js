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
* The UserLibraryLeaveSharedItems model module.
* @module model/UserLibraryLeaveSharedItems
* @version 4.8.10.0
*/
export default class UserLibraryLeaveSharedItems {
    /**
    * Constructs a new <code>UserLibraryLeaveSharedItems</code>.
    * @alias module:model/UserLibraryLeaveSharedItems
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UserLibraryLeaveSharedItems</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UserLibraryLeaveSharedItems} obj Optional instance to populate.
    * @return {module:model/UserLibraryLeaveSharedItems} The populated <code>UserLibraryLeaveSharedItems</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserLibraryLeaveSharedItems();
                        
            
            if (data.hasOwnProperty('ItemIds')) {
                obj['ItemIds'] = ApiClient.convertToType(data['ItemIds'], ['String']);
            }
            if (data.hasOwnProperty('UserId')) {
                obj['UserId'] = ApiClient.convertToType(data['UserId'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<String>} ItemIds
    */
    'ItemIds' = undefined;
    /**
    * @member {String} UserId
    */
    'UserId' = undefined;




}
