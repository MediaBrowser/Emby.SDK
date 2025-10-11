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
import PartyInfo from './PartyInfo';

/**
* The PartyInfoResult model module.
* @module model/PartyInfoResult
* @version 4.9.2.3
*/
export default class PartyInfoResult {
    /**
    * Constructs a new <code>PartyInfoResult</code>.
    * @alias module:model/PartyInfoResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PartyInfoResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PartyInfoResult} obj Optional instance to populate.
    * @return {module:model/PartyInfoResult} The populated <code>PartyInfoResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PartyInfoResult();
                        
            
            if (data.hasOwnProperty('PartyInfo')) {
                obj['PartyInfo'] = PartyInfo.constructFromObject(data['PartyInfo']);
            }
        }
        return obj;
    }

    /**
    * @member {module:model/PartyInfo} PartyInfo
    */
    'PartyInfo' = undefined;




}
