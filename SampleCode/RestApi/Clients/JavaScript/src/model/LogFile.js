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

/**
* The LogFile model module.
* @module model/LogFile
* @version 4.8.0.47
*/
export default class LogFile {
    /**
    * Constructs a new <code>LogFile</code>.
    * @alias module:model/LogFile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LogFile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LogFile} obj Optional instance to populate.
    * @return {module:model/LogFile} The populated <code>LogFile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LogFile();
                        
            
            if (data.hasOwnProperty('DateCreated')) {
                obj['DateCreated'] = ApiClient.convertToType(data['DateCreated'], 'Date');
            }
            if (data.hasOwnProperty('DateModified')) {
                obj['DateModified'] = ApiClient.convertToType(data['DateModified'], 'Date');
            }
            if (data.hasOwnProperty('Size')) {
                obj['Size'] = ApiClient.convertToType(data['Size'], 'Number');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Date} DateCreated
    */
    'DateCreated' = undefined;
    /**
    * @member {Date} DateModified
    */
    'DateModified' = undefined;
    /**
    * @member {Number} Size
    */
    'Size' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;




}
