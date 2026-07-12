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
import SessionPartyMessage from './SessionPartyMessage';

/**
* The QueryResultSessionPartyMessage model module.
* @module model/QueryResultSessionPartyMessage
* @version 4.10.0.19
*/
export default class QueryResultSessionPartyMessage {
    /**
    * Constructs a new <code>QueryResultSessionPartyMessage</code>.
    * @alias module:model/QueryResultSessionPartyMessage
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultSessionPartyMessage</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultSessionPartyMessage} obj Optional instance to populate.
    * @return {module:model/QueryResultSessionPartyMessage} The populated <code>QueryResultSessionPartyMessage</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultSessionPartyMessage();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [SessionPartyMessage]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/SessionPartyMessage>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
