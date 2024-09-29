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
import DynamicDayOfWeek from './DynamicDayOfWeek';

/**
* The AccessSchedule model module.
* @module model/AccessSchedule
* @version 4.8.10.0
*/
export default class AccessSchedule {
    /**
    * Constructs a new <code>AccessSchedule</code>.
    * @alias module:model/AccessSchedule
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>AccessSchedule</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/AccessSchedule} obj Optional instance to populate.
    * @return {module:model/AccessSchedule} The populated <code>AccessSchedule</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AccessSchedule();
                        
            
            if (data.hasOwnProperty('DayOfWeek')) {
                obj['DayOfWeek'] = DynamicDayOfWeek.constructFromObject(data['DayOfWeek']);
            }
            if (data.hasOwnProperty('StartHour')) {
                obj['StartHour'] = ApiClient.convertToType(data['StartHour'], 'Number');
            }
            if (data.hasOwnProperty('EndHour')) {
                obj['EndHour'] = ApiClient.convertToType(data['EndHour'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/DynamicDayOfWeek} DayOfWeek
    */
    'DayOfWeek' = undefined;
    /**
    * The start hour.
    * @member {Number} StartHour
    */
    'StartHour' = undefined;
    /**
    * The end hour.
    * @member {Number} EndHour
    */
    'EndHour' = undefined;




}
