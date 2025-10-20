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
import SessionPartyInfo from './SessionPartyInfo';

/**
* The SessionPartyInfoResult model module.
* @module model/SessionPartyInfoResult
* @version 4.9.2.6
*/
export default class SessionPartyInfoResult {
    /**
    * Constructs a new <code>SessionPartyInfoResult</code>.
    * @alias module:model/SessionPartyInfoResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SessionPartyInfoResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SessionPartyInfoResult} obj Optional instance to populate.
    * @return {module:model/SessionPartyInfoResult} The populated <code>SessionPartyInfoResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SessionPartyInfoResult();
                        
            
            if (data.hasOwnProperty('PartyInfo')) {
                obj['PartyInfo'] = SessionPartyInfo.constructFromObject(data['PartyInfo']);
            }
        }
        return obj;
    }

    /**
    * @member {module:model/SessionPartyInfo} PartyInfo
    */
    'PartyInfo' = undefined;




}
