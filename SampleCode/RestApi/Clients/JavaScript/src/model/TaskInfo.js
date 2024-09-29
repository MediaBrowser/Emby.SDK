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
import TaskResult from './TaskResult';
import TaskState from './TaskState';
import TaskTriggerInfo from './TaskTriggerInfo';

/**
* The TaskInfo model module.
* @module model/TaskInfo
* @version 4.8.10.0
*/
export default class TaskInfo {
    /**
    * Constructs a new <code>TaskInfo</code>.
    * Class TaskInfo  
    * @alias module:model/TaskInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>TaskInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/TaskInfo} obj Optional instance to populate.
    * @return {module:model/TaskInfo} The populated <code>TaskInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TaskInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('State')) {
                obj['State'] = TaskState.constructFromObject(data['State']);
            }
            if (data.hasOwnProperty('CurrentProgressPercentage')) {
                obj['CurrentProgressPercentage'] = ApiClient.convertToType(data['CurrentProgressPercentage'], 'Number');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('LastExecutionResult')) {
                obj['LastExecutionResult'] = TaskResult.constructFromObject(data['LastExecutionResult']);
            }
            if (data.hasOwnProperty('Triggers')) {
                obj['Triggers'] = ApiClient.convertToType(data['Triggers'], [TaskTriggerInfo]);
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
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {module:model/TaskState} State
    */
    'State' = undefined;
    /**
    * The progress.
    * @member {Number} CurrentProgressPercentage
    */
    'CurrentProgressPercentage' = undefined;
    /**
    * The id.
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {module:model/TaskResult} LastExecutionResult
    */
    'LastExecutionResult' = undefined;
    /**
    * The triggers.
    * @member {Array.<module:model/TaskTriggerInfo>} Triggers
    */
    'Triggers' = undefined;
    /**
    * The description.
    * @member {String} Description
    */
    'Description' = undefined;
    /**
    * The category.
    * @member {String} Category
    */
    'Category' = undefined;
    /**
    * A value indicating whether this instance is hidden.
    * @member {Boolean} IsHidden
    */
    'IsHidden' = undefined;
    /**
    * The key.
    * @member {String} Key
    */
    'Key' = undefined;




}
