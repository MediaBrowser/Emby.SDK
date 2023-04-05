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
* The EmbyWebGenericUIApiEndpointsRunUICommand model module.
* @module model/EmbyWebGenericUIApiEndpointsRunUICommand
* @version 4.8.0.29
*/
export default class EmbyWebGenericUIApiEndpointsRunUICommand {
    /**
    * Constructs a new <code>EmbyWebGenericUIApiEndpointsRunUICommand</code>.
    * @alias module:model/EmbyWebGenericUIApiEndpointsRunUICommand
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyWebGenericUIApiEndpointsRunUICommand</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyWebGenericUIApiEndpointsRunUICommand} obj Optional instance to populate.
    * @return {module:model/EmbyWebGenericUIApiEndpointsRunUICommand} The populated <code>EmbyWebGenericUIApiEndpointsRunUICommand</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyWebGenericUIApiEndpointsRunUICommand();
                        
            
            if (data.hasOwnProperty('PageId')) {
                obj['PageId'] = ApiClient.convertToType(data['PageId'], 'String');
            }
            if (data.hasOwnProperty('CommandId')) {
                obj['CommandId'] = ApiClient.convertToType(data['CommandId'], 'String');
            }
            if (data.hasOwnProperty('Data')) {
                obj['Data'] = ApiClient.convertToType(data['Data'], 'String');
            }
            if (data.hasOwnProperty('ItemId')) {
                obj['ItemId'] = ApiClient.convertToType(data['ItemId'], 'String');
            }
            if (data.hasOwnProperty('ClientLocale')) {
                obj['ClientLocale'] = ApiClient.convertToType(data['ClientLocale'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} PageId
    */
    'PageId' = undefined;
    /**
    * @member {String} CommandId
    */
    'CommandId' = undefined;
    /**
    * @member {String} Data
    */
    'Data' = undefined;
    /**
    * @member {String} ItemId
    */
    'ItemId' = undefined;
    /**
    * @member {String} ClientLocale
    */
    'ClientLocale' = undefined;




}
