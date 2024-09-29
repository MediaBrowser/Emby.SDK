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
import TaskCompletionStatus from './TaskCompletionStatus';

/**
* The TaskResult model module.
* @module model/TaskResult
* @version 4.8.10.0
*/
export default class TaskResult {
    /**
    * Constructs a new <code>TaskResult</code>.
    * Class TaskExecutionInfo  
    * @alias module:model/TaskResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>TaskResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/TaskResult} obj Optional instance to populate.
    * @return {module:model/TaskResult} The populated <code>TaskResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TaskResult();
                        
            
            if (data.hasOwnProperty('StartTimeUtc')) {
                obj['StartTimeUtc'] = ApiClient.convertToType(data['StartTimeUtc'], 'Date');
            }
            if (data.hasOwnProperty('EndTimeUtc')) {
                obj['EndTimeUtc'] = ApiClient.convertToType(data['EndTimeUtc'], 'Date');
            }
            if (data.hasOwnProperty('Status')) {
                obj['Status'] = TaskCompletionStatus.constructFromObject(data['Status']);
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
    * The start time UTC.
    * @member {Date} StartTimeUtc
    */
    'StartTimeUtc' = undefined;
    /**
    * The end time UTC.
    * @member {Date} EndTimeUtc
    */
    'EndTimeUtc' = undefined;
    /**
    * @member {module:model/TaskCompletionStatus} Status
    */
    'Status' = undefined;
    /**
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * The key.
    * @member {String} Key
    */
    'Key' = undefined;
    /**
    * The id.
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * The error message.
    * @member {String} ErrorMessage
    */
    'ErrorMessage' = undefined;
    /**
    * The long error message.
    * @member {String} LongErrorMessage
    */
    'LongErrorMessage' = undefined;




}
