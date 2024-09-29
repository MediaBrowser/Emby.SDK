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
* The PublicSystemInfo model module.
* @module model/PublicSystemInfo
* @version 4.8.10.0
*/
export default class PublicSystemInfo {
    /**
    * Constructs a new <code>PublicSystemInfo</code>.
    * @alias module:model/PublicSystemInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PublicSystemInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PublicSystemInfo} obj Optional instance to populate.
    * @return {module:model/PublicSystemInfo} The populated <code>PublicSystemInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PublicSystemInfo();
                        
            
            if (data.hasOwnProperty('LocalAddress')) {
                obj['LocalAddress'] = ApiClient.convertToType(data['LocalAddress'], 'String');
            }
            if (data.hasOwnProperty('LocalAddresses')) {
                obj['LocalAddresses'] = ApiClient.convertToType(data['LocalAddresses'], ['String']);
            }
            if (data.hasOwnProperty('WanAddress')) {
                obj['WanAddress'] = ApiClient.convertToType(data['WanAddress'], 'String');
            }
            if (data.hasOwnProperty('RemoteAddresses')) {
                obj['RemoteAddresses'] = ApiClient.convertToType(data['RemoteAddresses'], ['String']);
            }
            if (data.hasOwnProperty('ServerName')) {
                obj['ServerName'] = ApiClient.convertToType(data['ServerName'], 'String');
            }
            if (data.hasOwnProperty('Version')) {
                obj['Version'] = ApiClient.convertToType(data['Version'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
        }
        return obj;
    }

    /**
    * The local address.
    * @member {String} LocalAddress
    */
    'LocalAddress' = undefined;
    /**
    * @member {Array.<String>} LocalAddresses
    */
    'LocalAddresses' = undefined;
    /**
    * The wan address.
    * @member {String} WanAddress
    */
    'WanAddress' = undefined;
    /**
    * @member {Array.<String>} RemoteAddresses
    */
    'RemoteAddresses' = undefined;
    /**
    * The name of the server.
    * @member {String} ServerName
    */
    'ServerName' = undefined;
    /**
    * The version.
    * @member {String} Version
    */
    'Version' = undefined;
    /**
    * The id.
    * @member {String} Id
    */
    'Id' = undefined;




}
