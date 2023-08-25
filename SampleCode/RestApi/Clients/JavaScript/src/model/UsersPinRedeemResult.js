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

/**
* The UsersPinRedeemResult model module.
* @module model/UsersPinRedeemResult
* @version 4.8.0.43
*/
export default class UsersPinRedeemResult {
    /**
    * Constructs a new <code>UsersPinRedeemResult</code>.
    * @alias module:model/UsersPinRedeemResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UsersPinRedeemResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UsersPinRedeemResult} obj Optional instance to populate.
    * @return {module:model/UsersPinRedeemResult} The populated <code>UsersPinRedeemResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UsersPinRedeemResult();
                        
            
            if (data.hasOwnProperty('Success')) {
                obj['Success'] = ApiClient.convertToType(data['Success'], 'Boolean');
            }
            if (data.hasOwnProperty('UsersReset')) {
                obj['UsersReset'] = ApiClient.convertToType(data['UsersReset'], ['String']);
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} Success
    */
    'Success' = undefined;
    /**
    * @member {Array.<String>} UsersReset
    */
    'UsersReset' = undefined;




}
