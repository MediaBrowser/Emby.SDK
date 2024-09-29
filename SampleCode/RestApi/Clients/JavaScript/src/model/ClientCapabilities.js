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
import DeviceProfile from './DeviceProfile';

/**
* The ClientCapabilities model module.
* @module model/ClientCapabilities
* @version 4.8.10.0
*/
export default class ClientCapabilities {
    /**
    * Constructs a new <code>ClientCapabilities</code>.
    * @alias module:model/ClientCapabilities
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ClientCapabilities</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ClientCapabilities} obj Optional instance to populate.
    * @return {module:model/ClientCapabilities} The populated <code>ClientCapabilities</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ClientCapabilities();
                        
            
            if (data.hasOwnProperty('PlayableMediaTypes')) {
                obj['PlayableMediaTypes'] = ApiClient.convertToType(data['PlayableMediaTypes'], ['String']);
            }
            if (data.hasOwnProperty('SupportedCommands')) {
                obj['SupportedCommands'] = ApiClient.convertToType(data['SupportedCommands'], ['String']);
            }
            if (data.hasOwnProperty('SupportsMediaControl')) {
                obj['SupportsMediaControl'] = ApiClient.convertToType(data['SupportsMediaControl'], 'Boolean');
            }
            if (data.hasOwnProperty('PushToken')) {
                obj['PushToken'] = ApiClient.convertToType(data['PushToken'], 'String');
            }
            if (data.hasOwnProperty('PushTokenType')) {
                obj['PushTokenType'] = ApiClient.convertToType(data['PushTokenType'], 'String');
            }
            if (data.hasOwnProperty('SupportsSync')) {
                obj['SupportsSync'] = ApiClient.convertToType(data['SupportsSync'], 'Boolean');
            }
            if (data.hasOwnProperty('DeviceProfile')) {
                obj['DeviceProfile'] = DeviceProfile.constructFromObject(data['DeviceProfile']);
            }
            if (data.hasOwnProperty('IconUrl')) {
                obj['IconUrl'] = ApiClient.convertToType(data['IconUrl'], 'String');
            }
            if (data.hasOwnProperty('AppId')) {
                obj['AppId'] = ApiClient.convertToType(data['AppId'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<String>} PlayableMediaTypes
    */
    'PlayableMediaTypes' = undefined;
    /**
    * @member {Array.<String>} SupportedCommands
    */
    'SupportedCommands' = undefined;
    /**
    * @member {Boolean} SupportsMediaControl
    */
    'SupportsMediaControl' = undefined;
    /**
    * @member {String} PushToken
    */
    'PushToken' = undefined;
    /**
    * @member {String} PushTokenType
    */
    'PushTokenType' = undefined;
    /**
    * @member {Boolean} SupportsSync
    */
    'SupportsSync' = undefined;
    /**
    * @member {module:model/DeviceProfile} DeviceProfile
    */
    'DeviceProfile' = undefined;
    /**
    * @member {String} IconUrl
    */
    'IconUrl' = undefined;
    /**
    * @member {String} AppId
    */
    'AppId' = undefined;




}
