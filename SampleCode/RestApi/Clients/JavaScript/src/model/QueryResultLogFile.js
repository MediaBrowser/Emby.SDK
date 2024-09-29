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
import LogFile from './LogFile';

/**
* The QueryResultLogFile model module.
* @module model/QueryResultLogFile
* @version 4.8.10.0
*/
export default class QueryResultLogFile {
    /**
    * Constructs a new <code>QueryResultLogFile</code>.
    * @alias module:model/QueryResultLogFile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultLogFile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultLogFile} obj Optional instance to populate.
    * @return {module:model/QueryResultLogFile} The populated <code>QueryResultLogFile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultLogFile();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [LogFile]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/LogFile>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
