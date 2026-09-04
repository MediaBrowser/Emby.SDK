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
* The SessionPartyMessage model module.
* @module model/SessionPartyMessage
* @version 4.10.0.31
*/
export default class SessionPartyMessage {
    /**
    * Constructs a new <code>SessionPartyMessage</code>.
    * @alias module:model/SessionPartyMessage
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SessionPartyMessage</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SessionPartyMessage} obj Optional instance to populate.
    * @return {module:model/SessionPartyMessage} The populated <code>SessionPartyMessage</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SessionPartyMessage();
                        
            
            if (data.hasOwnProperty('UserId')) {
                obj['UserId'] = ApiClient.convertToType(data['UserId'], 'Number');
            }
            if (data.hasOwnProperty('DateTime')) {
                obj['DateTime'] = ApiClient.convertToType(data['DateTime'], 'Date');
            }
            if (data.hasOwnProperty('Message')) {
                obj['Message'] = ApiClient.convertToType(data['Message'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Number} UserId
    */
    'UserId' = undefined;
    /**
    * @member {Date} DateTime
    */
    'DateTime' = undefined;
    /**
    * @member {String} Message
    */
    'Message' = undefined;




}
