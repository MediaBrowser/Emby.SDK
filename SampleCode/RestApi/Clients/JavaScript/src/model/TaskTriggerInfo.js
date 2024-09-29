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
import DayOfWeek from './DayOfWeek';
import SystemEvent from './SystemEvent';

/**
* The TaskTriggerInfo model module.
* @module model/TaskTriggerInfo
* @version 4.8.10.0
*/
export default class TaskTriggerInfo {
    /**
    * Constructs a new <code>TaskTriggerInfo</code>.
    * Class TaskTriggerInfo  
    * @alias module:model/TaskTriggerInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>TaskTriggerInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/TaskTriggerInfo} obj Optional instance to populate.
    * @return {module:model/TaskTriggerInfo} The populated <code>TaskTriggerInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TaskTriggerInfo();
                        
            
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('TimeOfDayTicks')) {
                obj['TimeOfDayTicks'] = ApiClient.convertToType(data['TimeOfDayTicks'], 'Number');
            }
            if (data.hasOwnProperty('IntervalTicks')) {
                obj['IntervalTicks'] = ApiClient.convertToType(data['IntervalTicks'], 'Number');
            }
            if (data.hasOwnProperty('SystemEvent')) {
                obj['SystemEvent'] = SystemEvent.constructFromObject(data['SystemEvent']);
            }
            if (data.hasOwnProperty('DayOfWeek')) {
                obj['DayOfWeek'] = DayOfWeek.constructFromObject(data['DayOfWeek']);
            }
            if (data.hasOwnProperty('MaxRuntimeTicks')) {
                obj['MaxRuntimeTicks'] = ApiClient.convertToType(data['MaxRuntimeTicks'], 'Number');
            }
        }
        return obj;
    }

    /**
    * The type.
    * @member {String} Type
    */
    'Type' = undefined;
    /**
    * The time of day.
    * @member {Number} TimeOfDayTicks
    */
    'TimeOfDayTicks' = undefined;
    /**
    * The interval.
    * @member {Number} IntervalTicks
    */
    'IntervalTicks' = undefined;
    /**
    * @member {module:model/SystemEvent} SystemEvent
    */
    'SystemEvent' = undefined;
    /**
    * @member {module:model/DayOfWeek} DayOfWeek
    */
    'DayOfWeek' = undefined;
    /**
    * The maximum runtime ticks.
    * @member {Number} MaxRuntimeTicks
    */
    'MaxRuntimeTicks' = undefined;




}
