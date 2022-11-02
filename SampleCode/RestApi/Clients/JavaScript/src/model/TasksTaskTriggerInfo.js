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
import DayOfWeek from './DayOfWeek';
import TasksSystemEvent from './TasksSystemEvent';

/**
* The TasksTaskTriggerInfo model module.
* @module model/TasksTaskTriggerInfo
* @version 4.8.0.16
*/
export default class TasksTaskTriggerInfo {
    /**
    * Constructs a new <code>TasksTaskTriggerInfo</code>.
    * @alias module:model/TasksTaskTriggerInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>TasksTaskTriggerInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/TasksTaskTriggerInfo} obj Optional instance to populate.
    * @return {module:model/TasksTaskTriggerInfo} The populated <code>TasksTaskTriggerInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TasksTaskTriggerInfo();
                        
            
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
                obj['SystemEvent'] = TasksSystemEvent.constructFromObject(data['SystemEvent']);
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
    * @member {String} Type
    */
    'Type' = undefined;
    /**
    * @member {Number} TimeOfDayTicks
    */
    'TimeOfDayTicks' = undefined;
    /**
    * @member {Number} IntervalTicks
    */
    'IntervalTicks' = undefined;
    /**
    * @member {module:model/TasksSystemEvent} SystemEvent
    */
    'SystemEvent' = undefined;
    /**
    * @member {module:model/DayOfWeek} DayOfWeek
    */
    'DayOfWeek' = undefined;
    /**
    * @member {Number} MaxRuntimeTicks
    */
    'MaxRuntimeTicks' = undefined;




}
