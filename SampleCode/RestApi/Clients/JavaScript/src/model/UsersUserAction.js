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
import UsersUserActionType from './UsersUserActionType';

/**
* The UsersUserAction model module.
* @module model/UsersUserAction
* @version 4.8.0.43
*/
export default class UsersUserAction {
    /**
    * Constructs a new <code>UsersUserAction</code>.
    * @alias module:model/UsersUserAction
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UsersUserAction</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UsersUserAction} obj Optional instance to populate.
    * @return {module:model/UsersUserAction} The populated <code>UsersUserAction</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UsersUserAction();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('ServerId')) {
                obj['ServerId'] = ApiClient.convertToType(data['ServerId'], 'String');
            }
            if (data.hasOwnProperty('UserId')) {
                obj['UserId'] = ApiClient.convertToType(data['UserId'], 'String');
            }
            if (data.hasOwnProperty('ItemId')) {
                obj['ItemId'] = ApiClient.convertToType(data['ItemId'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = UsersUserActionType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('Date')) {
                obj['Date'] = ApiClient.convertToType(data['Date'], 'Date');
            }
            if (data.hasOwnProperty('PositionTicks')) {
                obj['PositionTicks'] = ApiClient.convertToType(data['PositionTicks'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} ServerId
    */
    'ServerId' = undefined;
    /**
    * @member {String} UserId
    */
    'UserId' = undefined;
    /**
    * @member {String} ItemId
    */
    'ItemId' = undefined;
    /**
    * @member {module:model/UsersUserActionType} Type
    */
    'Type' = undefined;
    /**
    * @member {Date} Date
    */
    'Date' = undefined;
    /**
    * @member {Number} PositionTicks
    */
    'PositionTicks' = undefined;




}
