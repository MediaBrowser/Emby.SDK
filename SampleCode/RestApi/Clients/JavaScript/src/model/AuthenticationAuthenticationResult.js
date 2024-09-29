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
import SessionSessionInfo from './SessionSessionInfo';
import UserDto from './UserDto';

/**
* The AuthenticationAuthenticationResult model module.
* @module model/AuthenticationAuthenticationResult
* @version 4.8.10.0
*/
export default class AuthenticationAuthenticationResult {
    /**
    * Constructs a new <code>AuthenticationAuthenticationResult</code>.
    * @alias module:model/AuthenticationAuthenticationResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>AuthenticationAuthenticationResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/AuthenticationAuthenticationResult} obj Optional instance to populate.
    * @return {module:model/AuthenticationAuthenticationResult} The populated <code>AuthenticationAuthenticationResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AuthenticationAuthenticationResult();
                        
            
            if (data.hasOwnProperty('User')) {
                obj['User'] = UserDto.constructFromObject(data['User']);
            }
            if (data.hasOwnProperty('SessionInfo')) {
                obj['SessionInfo'] = SessionSessionInfo.constructFromObject(data['SessionInfo']);
            }
            if (data.hasOwnProperty('AccessToken')) {
                obj['AccessToken'] = ApiClient.convertToType(data['AccessToken'], 'String');
            }
            if (data.hasOwnProperty('ServerId')) {
                obj['ServerId'] = ApiClient.convertToType(data['ServerId'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/UserDto} User
    */
    'User' = undefined;
    /**
    * @member {module:model/SessionSessionInfo} SessionInfo
    */
    'SessionInfo' = undefined;
    /**
    * The authentication token.
    * @member {String} AccessToken
    */
    'AccessToken' = undefined;
    /**
    * The server identifier.
    * @member {String} ServerId
    */
    'ServerId' = undefined;




}
