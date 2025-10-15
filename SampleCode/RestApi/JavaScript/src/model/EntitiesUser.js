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
import ConnectUserLinkType from './ConnectUserLinkType';
import EntitiesItemImageInfo from './EntitiesItemImageInfo';
import LinkedItemInfo from './LinkedItemInfo';

/**
* The EntitiesUser model module.
* @module model/EntitiesUser
* @version 4.9.2.4
*/
export default class EntitiesUser {
    /**
    * Constructs a new <code>EntitiesUser</code>.
    * Class User  
    * @alias module:model/EntitiesUser
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EntitiesUser</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EntitiesUser} obj Optional instance to populate.
    * @return {module:model/EntitiesUser} The populated <code>EntitiesUser</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EntitiesUser();
                        
            
            if (data.hasOwnProperty('UsesIdForConfigurationPath')) {
                obj['UsesIdForConfigurationPath'] = ApiClient.convertToType(data['UsesIdForConfigurationPath'], 'Boolean');
            }
            if (data.hasOwnProperty('Password')) {
                obj['Password'] = ApiClient.convertToType(data['Password'], 'String');
            }
            if (data.hasOwnProperty('EasyPassword')) {
                obj['EasyPassword'] = ApiClient.convertToType(data['EasyPassword'], 'String');
            }
            if (data.hasOwnProperty('Salt')) {
                obj['Salt'] = ApiClient.convertToType(data['Salt'], 'String');
            }
            if (data.hasOwnProperty('ConnectUserName')) {
                obj['ConnectUserName'] = ApiClient.convertToType(data['ConnectUserName'], 'String');
            }
            if (data.hasOwnProperty('ConnectUserId')) {
                obj['ConnectUserId'] = ApiClient.convertToType(data['ConnectUserId'], 'String');
            }
            if (data.hasOwnProperty('ConnectLinkType')) {
                obj['ConnectLinkType'] = ConnectUserLinkType.constructFromObject(data['ConnectLinkType']);
            }
            if (data.hasOwnProperty('ConnectAccessKey')) {
                obj['ConnectAccessKey'] = ApiClient.convertToType(data['ConnectAccessKey'], 'String');
            }
            if (data.hasOwnProperty('ImageInfos')) {
                obj['ImageInfos'] = ApiClient.convertToType(data['ImageInfos'], [EntitiesItemImageInfo]);
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('LastLoginDate')) {
                obj['LastLoginDate'] = ApiClient.convertToType(data['LastLoginDate'], 'Date');
            }
            if (data.hasOwnProperty('LastActivityDate')) {
                obj['LastActivityDate'] = ApiClient.convertToType(data['LastActivityDate'], 'Date');
            }
            if (data.hasOwnProperty('PlayedPercentage')) {
                obj['PlayedPercentage'] = ApiClient.convertToType(data['PlayedPercentage'], 'Number');
            }
            if (data.hasOwnProperty('RecursiveChildCountEqualsChildCount')) {
                obj['RecursiveChildCountEqualsChildCount'] = ApiClient.convertToType(data['RecursiveChildCountEqualsChildCount'], 'Boolean');
            }
            if (data.hasOwnProperty('OriginalParsedName')) {
                obj['OriginalParsedName'] = ApiClient.convertToType(data['OriginalParsedName'], 'String');
            }
            if (data.hasOwnProperty('IsNameParsedFromFolder')) {
                obj['IsNameParsedFromFolder'] = ApiClient.convertToType(data['IsNameParsedFromFolder'], 'Boolean');
            }
            if (data.hasOwnProperty('DateCreated')) {
                obj['DateCreated'] = ApiClient.convertToType(data['DateCreated'], 'Date');
            }
            if (data.hasOwnProperty('ImportedCollections')) {
                obj['ImportedCollections'] = ApiClient.convertToType(data['ImportedCollections'], [LinkedItemInfo]);
            }
            if (data.hasOwnProperty('ResolvedPresentationUniqueKey')) {
                obj['ResolvedPresentationUniqueKey'] = ApiClient.convertToType(data['ResolvedPresentationUniqueKey'], 'String');
            }
        }
        return obj;
    }

    /**
    * From now on all user paths will be Id\\-based. This is for backwards compatibility.
    * @member {Boolean} UsesIdForConfigurationPath
    */
    'UsesIdForConfigurationPath' = undefined;
    /**
    * The password.
    * @member {String} Password
    */
    'Password' = undefined;
    /**
    * @member {String} EasyPassword
    */
    'EasyPassword' = undefined;
    /**
    * @member {String} Salt
    */
    'Salt' = undefined;
    /**
    * @member {String} ConnectUserName
    */
    'ConnectUserName' = undefined;
    /**
    * @member {String} ConnectUserId
    */
    'ConnectUserId' = undefined;
    /**
    * @member {module:model/ConnectUserLinkType} ConnectLinkType
    */
    'ConnectLinkType' = undefined;
    /**
    * @member {String} ConnectAccessKey
    */
    'ConnectAccessKey' = undefined;
    /**
    * @member {Array.<module:model/EntitiesItemImageInfo>} ImageInfos
    */
    'ImageInfos' = undefined;
    /**
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
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
    * @member {Number} PlayedPercentage
    */
    'PlayedPercentage' = undefined;
    /**
    * @member {Boolean} RecursiveChildCountEqualsChildCount
    */
    'RecursiveChildCountEqualsChildCount' = undefined;
    /**
    * Internal use only
    * @member {String} OriginalParsedName
    */
    'OriginalParsedName' = undefined;
    /**
    * Internal use only
    * @member {Boolean} IsNameParsedFromFolder
    */
    'IsNameParsedFromFolder' = undefined;
    /**
    * The date created.
    * @member {Date} DateCreated
    */
    'DateCreated' = undefined;
    /**
    * @member {Array.<module:model/LinkedItemInfo>} ImportedCollections
    */
    'ImportedCollections' = undefined;
    /**
    * @member {String} ResolvedPresentationUniqueKey
    */
    'ResolvedPresentationUniqueKey' = undefined;




}
