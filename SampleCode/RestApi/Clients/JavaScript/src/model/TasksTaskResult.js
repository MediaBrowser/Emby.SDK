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
import TasksTaskCompletionStatus from './TasksTaskCompletionStatus';

/**
* The TasksTaskResult model module.
* @module model/TasksTaskResult
* @version 4.8.0.17
*/
export default class TasksTaskResult {
    /**
    * Constructs a new <code>TasksTaskResult</code>.
    * @alias module:model/TasksTaskResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>TasksTaskResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/TasksTaskResult} obj Optional instance to populate.
    * @return {module:model/TasksTaskResult} The populated <code>TasksTaskResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TasksTaskResult();
                        
            
            if (data.hasOwnProperty('StartTimeUtc')) {
                obj['StartTimeUtc'] = ApiClient.convertToType(data['StartTimeUtc'], 'Date');
            }
            if (data.hasOwnProperty('EndTimeUtc')) {
                obj['EndTimeUtc'] = ApiClient.convertToType(data['EndTimeUtc'], 'Date');
            }
            if (data.hasOwnProperty('Status')) {
                obj['Status'] = TasksTaskCompletionStatus.constructFromObject(data['Status']);
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Key')) {
                obj['Key'] = ApiClient.convertToType(data['Key'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('ErrorMessage')) {
                obj['ErrorMessage'] = ApiClient.convertToType(data['ErrorMessage'], 'String');
            }
            if (data.hasOwnProperty('LongErrorMessage')) {
                obj['LongErrorMessage'] = ApiClient.convertToType(data['LongErrorMessage'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Date} StartTimeUtc
    */
    'StartTimeUtc' = undefined;
    /**
    * @member {Date} EndTimeUtc
    */
    'EndTimeUtc' = undefined;
    /**
    * @member {module:model/TasksTaskCompletionStatus} Status
    */
    'Status' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Key
    */
    'Key' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} ErrorMessage
    */
    'ErrorMessage' = undefined;
    /**
    * @member {String} LongErrorMessage
    */
    'LongErrorMessage' = undefined;




}
