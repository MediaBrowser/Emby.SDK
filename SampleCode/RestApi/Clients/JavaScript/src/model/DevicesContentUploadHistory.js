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
import DevicesLocalFileInfo from './DevicesLocalFileInfo';

/**
* The DevicesContentUploadHistory model module.
* @module model/DevicesContentUploadHistory
* @version 4.8.10.0
*/
export default class DevicesContentUploadHistory {
    /**
    * Constructs a new <code>DevicesContentUploadHistory</code>.
    * @alias module:model/DevicesContentUploadHistory
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DevicesContentUploadHistory</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DevicesContentUploadHistory} obj Optional instance to populate.
    * @return {module:model/DevicesContentUploadHistory} The populated <code>DevicesContentUploadHistory</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DevicesContentUploadHistory();
                        
            
            if (data.hasOwnProperty('DeviceId')) {
                obj['DeviceId'] = ApiClient.convertToType(data['DeviceId'], 'String');
            }
            if (data.hasOwnProperty('FilesUploaded')) {
                obj['FilesUploaded'] = ApiClient.convertToType(data['FilesUploaded'], [DevicesLocalFileInfo]);
            }
        }
        return obj;
    }

    /**
    * @member {String} DeviceId
    */
    'DeviceId' = undefined;
    /**
    * @member {Array.<module:model/DevicesLocalFileInfo>} FilesUploaded
    */
    'FilesUploaded' = undefined;




}
