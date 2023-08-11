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
import TasksTaskResult from './TasksTaskResult';
import TasksTaskState from './TasksTaskState';
import TasksTaskTriggerInfo from './TasksTaskTriggerInfo';

/**
* The TasksTaskInfo model module.
* @module model/TasksTaskInfo
* @version 4.8.0.41
*/
export default class TasksTaskInfo {
    /**
    * Constructs a new <code>TasksTaskInfo</code>.
    * @alias module:model/TasksTaskInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>TasksTaskInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/TasksTaskInfo} obj Optional instance to populate.
    * @return {module:model/TasksTaskInfo} The populated <code>TasksTaskInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TasksTaskInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('State')) {
                obj['State'] = TasksTaskState.constructFromObject(data['State']);
            }
            if (data.hasOwnProperty('CurrentProgressPercentage')) {
                obj['CurrentProgressPercentage'] = ApiClient.convertToType(data['CurrentProgressPercentage'], 'Number');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('LastExecutionResult')) {
                obj['LastExecutionResult'] = TasksTaskResult.constructFromObject(data['LastExecutionResult']);
            }
            if (data.hasOwnProperty('Triggers')) {
                obj['Triggers'] = ApiClient.convertToType(data['Triggers'], [TasksTaskTriggerInfo]);
            }
            if (data.hasOwnProperty('Description')) {
                obj['Description'] = ApiClient.convertToType(data['Description'], 'String');
            }
            if (data.hasOwnProperty('Category')) {
                obj['Category'] = ApiClient.convertToType(data['Category'], 'String');
            }
            if (data.hasOwnProperty('IsHidden')) {
                obj['IsHidden'] = ApiClient.convertToType(data['IsHidden'], 'Boolean');
            }
            if (data.hasOwnProperty('Key')) {
                obj['Key'] = ApiClient.convertToType(data['Key'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {module:model/TasksTaskState} State
    */
    'State' = undefined;
    /**
    * @member {Number} CurrentProgressPercentage
    */
    'CurrentProgressPercentage' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {module:model/TasksTaskResult} LastExecutionResult
    */
    'LastExecutionResult' = undefined;
    /**
    * @member {Array.<module:model/TasksTaskTriggerInfo>} Triggers
    */
    'Triggers' = undefined;
    /**
    * @member {String} Description
    */
    'Description' = undefined;
    /**
    * @member {String} Category
    */
    'Category' = undefined;
    /**
    * @member {Boolean} IsHidden
    */
    'IsHidden' = undefined;
    /**
    * @member {String} Key
    */
    'Key' = undefined;




}
