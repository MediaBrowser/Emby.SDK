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
import UserItemShareLevel from './UserItemShareLevel';

/**
* The UserLibraryUpdateUserItemAccess model module.
* @module model/UserLibraryUpdateUserItemAccess
* @version 4.8.10.0
*/
export default class UserLibraryUpdateUserItemAccess {
    /**
    * Constructs a new <code>UserLibraryUpdateUserItemAccess</code>.
    * @alias module:model/UserLibraryUpdateUserItemAccess
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UserLibraryUpdateUserItemAccess</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UserLibraryUpdateUserItemAccess} obj Optional instance to populate.
    * @return {module:model/UserLibraryUpdateUserItemAccess} The populated <code>UserLibraryUpdateUserItemAccess</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserLibraryUpdateUserItemAccess();
                        
            
            if (data.hasOwnProperty('ItemIds')) {
                obj['ItemIds'] = ApiClient.convertToType(data['ItemIds'], ['String']);
            }
            if (data.hasOwnProperty('UserIds')) {
                obj['UserIds'] = ApiClient.convertToType(data['UserIds'], ['String']);
            }
            if (data.hasOwnProperty('ItemAccess')) {
                obj['ItemAccess'] = UserItemShareLevel.constructFromObject(data['ItemAccess']);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<String>} ItemIds
    */
    'ItemIds' = undefined;
    /**
    * @member {Array.<String>} UserIds
    */
    'UserIds' = undefined;
    /**
    * @member {module:model/UserItemShareLevel} ItemAccess
    */
    'ItemAccess' = undefined;




}
