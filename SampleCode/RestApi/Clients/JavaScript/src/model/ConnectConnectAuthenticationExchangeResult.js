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
* The ConnectConnectAuthenticationExchangeResult model module.
* @module model/ConnectConnectAuthenticationExchangeResult
* @version 4.8.10.0
*/
export default class ConnectConnectAuthenticationExchangeResult {
    /**
    * Constructs a new <code>ConnectConnectAuthenticationExchangeResult</code>.
    * @alias module:model/ConnectConnectAuthenticationExchangeResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ConnectConnectAuthenticationExchangeResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ConnectConnectAuthenticationExchangeResult} obj Optional instance to populate.
    * @return {module:model/ConnectConnectAuthenticationExchangeResult} The populated <code>ConnectConnectAuthenticationExchangeResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConnectConnectAuthenticationExchangeResult();
                        
            
            if (data.hasOwnProperty('LocalUserId')) {
                obj['LocalUserId'] = ApiClient.convertToType(data['LocalUserId'], 'String');
            }
            if (data.hasOwnProperty('AccessToken')) {
                obj['AccessToken'] = ApiClient.convertToType(data['AccessToken'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} LocalUserId
    */
    'LocalUserId' = undefined;
    /**
    * @member {String} AccessToken
    */
    'AccessToken' = undefined;




}
