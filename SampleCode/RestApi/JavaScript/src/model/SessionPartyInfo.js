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
import EntitiesUser from './EntitiesUser';
import SessionSessionInfo from './SessionSessionInfo';

/**
* The SessionPartyInfo model module.
* @module model/SessionPartyInfo
* @version 4.9.2.5
*/
export default class SessionPartyInfo {
    /**
    * Constructs a new <code>SessionPartyInfo</code>.
    * @alias module:model/SessionPartyInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SessionPartyInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SessionPartyInfo} obj Optional instance to populate.
    * @return {module:model/SessionPartyInfo} The populated <code>SessionPartyInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SessionPartyInfo();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Sessions')) {
                obj['Sessions'] = ApiClient.convertToType(data['Sessions'], [SessionSessionInfo]);
            }
            if (data.hasOwnProperty('Users')) {
                obj['Users'] = ApiClient.convertToType(data['Users'], [EntitiesUser]);
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {Array.<module:model/SessionSessionInfo>} Sessions
    */
    'Sessions' = undefined;
    /**
    * @member {Array.<module:model/EntitiesUser>} Users
    */
    'Users' = undefined;




}
