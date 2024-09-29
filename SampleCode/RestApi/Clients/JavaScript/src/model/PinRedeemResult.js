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
* The PinRedeemResult model module.
* @module model/PinRedeemResult
* @version 4.8.10.0
*/
export default class PinRedeemResult {
    /**
    * Constructs a new <code>PinRedeemResult</code>.
    * @alias module:model/PinRedeemResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PinRedeemResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PinRedeemResult} obj Optional instance to populate.
    * @return {module:model/PinRedeemResult} The populated <code>PinRedeemResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PinRedeemResult();
                        
            
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
    * A value indicating whether this `MediaBrowser.Model.Users.PinRedeemResult` is success.
    * @member {Boolean} Success
    */
    'Success' = undefined;
    /**
    * The users reset.
    * @member {Array.<String>} UsersReset
    */
    'UsersReset' = undefined;




}
