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
* The SessionUserInfo model module.
* @module model/SessionUserInfo
* @version 4.8.10.0
*/
export default class SessionUserInfo {
    /**
    * Constructs a new <code>SessionUserInfo</code>.
    * Class SessionUserInfo.  
    * @alias module:model/SessionUserInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SessionUserInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SessionUserInfo} obj Optional instance to populate.
    * @return {module:model/SessionUserInfo} The populated <code>SessionUserInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SessionUserInfo();
                        
            
            if (data.hasOwnProperty('UserId')) {
                obj['UserId'] = ApiClient.convertToType(data['UserId'], 'String');
            }
            if (data.hasOwnProperty('UserName')) {
                obj['UserName'] = ApiClient.convertToType(data['UserName'], 'String');
            }
            if (data.hasOwnProperty('UserInternalId')) {
                obj['UserInternalId'] = ApiClient.convertToType(data['UserInternalId'], 'Number');
            }
        }
        return obj;
    }

    /**
    * The user identifier.
    * @member {String} UserId
    */
    'UserId' = undefined;
    /**
    * The name of the user.
    * @member {String} UserName
    */
    'UserName' = undefined;
    /**
    * @member {Number} UserInternalId
    */
    'UserInternalId' = undefined;




}
