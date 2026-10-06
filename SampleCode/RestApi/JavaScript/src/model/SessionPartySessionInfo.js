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
import UserDto from './UserDto';

/**
* The SessionPartySessionInfo model module.
* @module model/SessionPartySessionInfo
* @version 4.11.0.6
*/
export default class SessionPartySessionInfo {
    /**
    * Constructs a new <code>SessionPartySessionInfo</code>.
    * @alias module:model/SessionPartySessionInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SessionPartySessionInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SessionPartySessionInfo} obj Optional instance to populate.
    * @return {module:model/SessionPartySessionInfo} The populated <code>SessionPartySessionInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SessionPartySessionInfo();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('User')) {
                obj['User'] = UserDto.constructFromObject(data['User']);
            }
            if (data.hasOwnProperty('IsHost')) {
                obj['IsHost'] = ApiClient.convertToType(data['IsHost'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {module:model/UserDto} User
    */
    'User' = undefined;
    /**
    * @member {Boolean} IsHost
    */
    'IsHost' = undefined;




}
