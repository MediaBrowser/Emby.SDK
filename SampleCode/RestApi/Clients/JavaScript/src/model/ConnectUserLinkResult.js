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
* The ConnectUserLinkResult model module.
* @module model/ConnectUserLinkResult
* @version 4.8.10.0
*/
export default class ConnectUserLinkResult {
    /**
    * Constructs a new <code>ConnectUserLinkResult</code>.
    * @alias module:model/ConnectUserLinkResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ConnectUserLinkResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ConnectUserLinkResult} obj Optional instance to populate.
    * @return {module:model/ConnectUserLinkResult} The populated <code>ConnectUserLinkResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConnectUserLinkResult();
                        
            
            if (data.hasOwnProperty('IsPending')) {
                obj['IsPending'] = ApiClient.convertToType(data['IsPending'], 'Boolean');
            }
            if (data.hasOwnProperty('IsNewUserInvitation')) {
                obj['IsNewUserInvitation'] = ApiClient.convertToType(data['IsNewUserInvitation'], 'Boolean');
            }
            if (data.hasOwnProperty('GuestDisplayName')) {
                obj['GuestDisplayName'] = ApiClient.convertToType(data['GuestDisplayName'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} IsPending
    */
    'IsPending' = undefined;
    /**
    * @member {Boolean} IsNewUserInvitation
    */
    'IsNewUserInvitation' = undefined;
    /**
    * @member {String} GuestDisplayName
    */
    'GuestDisplayName' = undefined;




}
