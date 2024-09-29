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
import ConnectUserLinkType from './ConnectUserLinkType';
import UserConfiguration from './UserConfiguration';
import UserItemShareLevel from './UserItemShareLevel';
import UserPolicy from './UserPolicy';

/**
* The UserDto model module.
* @module model/UserDto
* @version 4.8.10.0
*/
export default class UserDto {
    /**
    * Constructs a new <code>UserDto</code>.
    * Class UserDto  
    * @alias module:model/UserDto
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UserDto</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UserDto} obj Optional instance to populate.
    * @return {module:model/UserDto} The populated <code>UserDto</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserDto();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('ServerId')) {
                obj['ServerId'] = ApiClient.convertToType(data['ServerId'], 'String');
            }
            if (data.hasOwnProperty('ServerName')) {
                obj['ServerName'] = ApiClient.convertToType(data['ServerName'], 'String');
            }
            if (data.hasOwnProperty('Prefix')) {
                obj['Prefix'] = ApiClient.convertToType(data['Prefix'], 'String');
            }
            if (data.hasOwnProperty('ConnectUserName')) {
                obj['ConnectUserName'] = ApiClient.convertToType(data['ConnectUserName'], 'String');
            }
            if (data.hasOwnProperty('DateCreated')) {
                obj['DateCreated'] = ApiClient.convertToType(data['DateCreated'], 'Date');
            }
            if (data.hasOwnProperty('ConnectLinkType')) {
                obj['ConnectLinkType'] = ConnectUserLinkType.constructFromObject(data['ConnectLinkType']);
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('PrimaryImageTag')) {
                obj['PrimaryImageTag'] = ApiClient.convertToType(data['PrimaryImageTag'], 'String');
            }
            if (data.hasOwnProperty('HasPassword')) {
                obj['HasPassword'] = ApiClient.convertToType(data['HasPassword'], 'Boolean');
            }
            if (data.hasOwnProperty('HasConfiguredPassword')) {
                obj['HasConfiguredPassword'] = ApiClient.convertToType(data['HasConfiguredPassword'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableAutoLogin')) {
                obj['EnableAutoLogin'] = ApiClient.convertToType(data['EnableAutoLogin'], 'Boolean');
            }
            if (data.hasOwnProperty('LastLoginDate')) {
                obj['LastLoginDate'] = ApiClient.convertToType(data['LastLoginDate'], 'Date');
            }
            if (data.hasOwnProperty('LastActivityDate')) {
                obj['LastActivityDate'] = ApiClient.convertToType(data['LastActivityDate'], 'Date');
            }
            if (data.hasOwnProperty('Configuration')) {
                obj['Configuration'] = UserConfiguration.constructFromObject(data['Configuration']);
            }
            if (data.hasOwnProperty('Policy')) {
                obj['Policy'] = UserPolicy.constructFromObject(data['Policy']);
            }
            if (data.hasOwnProperty('PrimaryImageAspectRatio')) {
                obj['PrimaryImageAspectRatio'] = ApiClient.convertToType(data['PrimaryImageAspectRatio'], 'Number');
            }
            if (data.hasOwnProperty('HasConfiguredEasyPassword')) {
                obj['HasConfiguredEasyPassword'] = ApiClient.convertToType(data['HasConfiguredEasyPassword'], 'Boolean');
            }
            if (data.hasOwnProperty('UserItemShareLevel')) {
                obj['UserItemShareLevel'] = UserItemShareLevel.constructFromObject(data['UserItemShareLevel']);
            }
        }
        return obj;
    }

    /**
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * The server identifier.
    * @member {String} ServerId
    */
    'ServerId' = undefined;
    /**
    * The name of the server. This is not used by the server and is for client\\-side usage only.
    * @member {String} ServerName
    */
    'ServerName' = undefined;
    /**
    * @member {String} Prefix
    */
    'Prefix' = undefined;
    /**
    * The name of the connect user.
    * @member {String} ConnectUserName
    */
    'ConnectUserName' = undefined;
    /**
    * @member {Date} DateCreated
    */
    'DateCreated' = undefined;
    /**
    * @member {module:model/ConnectUserLinkType} ConnectLinkType
    */
    'ConnectLinkType' = undefined;
    /**
    * The id.
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * The primary image tag.
    * @member {String} PrimaryImageTag
    */
    'PrimaryImageTag' = undefined;
    /**
    * A value indicating whether this instance has password.
    * @member {Boolean} HasPassword
    */
    'HasPassword' = undefined;
    /**
    * A value indicating whether this instance has configured password.
    * @member {Boolean} HasConfiguredPassword
    */
    'HasConfiguredPassword' = undefined;
    /**
    * @member {Boolean} EnableAutoLogin
    */
    'EnableAutoLogin' = undefined;
    /**
    * The last login date.
    * @member {Date} LastLoginDate
    */
    'LastLoginDate' = undefined;
    /**
    * The last activity date.
    * @member {Date} LastActivityDate
    */
    'LastActivityDate' = undefined;
    /**
    * @member {module:model/UserConfiguration} Configuration
    */
    'Configuration' = undefined;
    /**
    * @member {module:model/UserPolicy} Policy
    */
    'Policy' = undefined;
    /**
    * The primary image aspect ratio.
    * @member {Number} PrimaryImageAspectRatio
    */
    'PrimaryImageAspectRatio' = undefined;
    /**
    * @member {Boolean} HasConfiguredEasyPassword
    */
    'HasConfiguredEasyPassword' = undefined;
    /**
    * @member {module:model/UserItemShareLevel} UserItemShareLevel
    */
    'UserItemShareLevel' = undefined;




}
