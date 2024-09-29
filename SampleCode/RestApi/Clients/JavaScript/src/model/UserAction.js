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
import UserActionType from './UserActionType';

/**
* The UserAction model module.
* @module model/UserAction
* @version 4.8.10.0
*/
export default class UserAction {
    /**
    * Constructs a new <code>UserAction</code>.
    * @alias module:model/UserAction
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UserAction</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UserAction} obj Optional instance to populate.
    * @return {module:model/UserAction} The populated <code>UserAction</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserAction();
                        
            
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
                obj['Type'] = UserActionType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('Date')) {
                obj['Date'] = ApiClient.convertToType(data['Date'], 'Date');
            }
            if (data.hasOwnProperty('PositionTicks')) {
                obj['PositionTicks'] = ApiClient.convertToType(data['PositionTicks'], 'Number');
            }
            if (data.hasOwnProperty('Played')) {
                obj['Played'] = ApiClient.convertToType(data['Played'], 'Boolean');
            }
            if (data.hasOwnProperty('IsFavorite')) {
                obj['IsFavorite'] = ApiClient.convertToType(data['IsFavorite'], 'Boolean');
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
    * @member {module:model/UserActionType} Type
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
    /**
    * @member {Boolean} Played
    */
    'Played' = undefined;
    /**
    * @member {Boolean} IsFavorite
    */
    'IsFavorite' = undefined;




}
