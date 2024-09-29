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
import LibraryUserCopyOptions from './LibraryUserCopyOptions';

/**
* The CreateUserByName model module.
* @module model/CreateUserByName
* @version 4.8.10.0
*/
export default class CreateUserByName {
    /**
    * Constructs a new <code>CreateUserByName</code>.
    * @alias module:model/CreateUserByName
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>CreateUserByName</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/CreateUserByName} obj Optional instance to populate.
    * @return {module:model/CreateUserByName} The populated <code>CreateUserByName</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateUserByName();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('CopyFromUserId')) {
                obj['CopyFromUserId'] = ApiClient.convertToType(data['CopyFromUserId'], 'String');
            }
            if (data.hasOwnProperty('UserCopyOptions')) {
                obj['UserCopyOptions'] = ApiClient.convertToType(data['UserCopyOptions'], [LibraryUserCopyOptions]);
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} CopyFromUserId
    */
    'CopyFromUserId' = undefined;
    /**
    * @member {Array.<module:model/LibraryUserCopyOptions>} UserCopyOptions
    */
    'UserCopyOptions' = undefined;




}
