/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.6
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ConfigurationDynamicDayOfWeek from './ConfigurationDynamicDayOfWeek';

/**
* The ConfigurationAccessSchedule model module.
* @module model/ConfigurationAccessSchedule
* @version 4.8.0.6
*/
export default class ConfigurationAccessSchedule {
    /**
    * Constructs a new <code>ConfigurationAccessSchedule</code>.
    * @alias module:model/ConfigurationAccessSchedule
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ConfigurationAccessSchedule</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ConfigurationAccessSchedule} obj Optional instance to populate.
    * @return {module:model/ConfigurationAccessSchedule} The populated <code>ConfigurationAccessSchedule</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConfigurationAccessSchedule();
                        
            
            if (data.hasOwnProperty('DayOfWeek')) {
                obj['DayOfWeek'] = ConfigurationDynamicDayOfWeek.constructFromObject(data['DayOfWeek']);
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
    * @member {module:model/ConfigurationDynamicDayOfWeek} DayOfWeek
    */
    'DayOfWeek' = undefined;
    /**
    * @member {Number} StartHour
    */
    'StartHour' = undefined;
    /**
    * @member {Number} EndHour
    */
    'EndHour' = undefined;




}
