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
import ImageType from './ImageType';
import SyncModelItemFileType from './SyncModelItemFileType';

/**
* The SyncModelItemFileInfo model module.
* @module model/SyncModelItemFileInfo
* @version 4.8.0.10
*/
export default class SyncModelItemFileInfo {
    /**
    * Constructs a new <code>SyncModelItemFileInfo</code>.
    * @alias module:model/SyncModelItemFileInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncModelItemFileInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncModelItemFileInfo} obj Optional instance to populate.
    * @return {module:model/SyncModelItemFileInfo} The populated <code>SyncModelItemFileInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncModelItemFileInfo();
                        
            
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = SyncModelItemFileType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
            if (data.hasOwnProperty('ImageType')) {
                obj['ImageType'] = ImageType.constructFromObject(data['ImageType']);
            }
            if (data.hasOwnProperty('Index')) {
                obj['Index'] = ApiClient.convertToType(data['Index'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/SyncModelItemFileType} Type
    */
    'Type' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Path
    */
    'Path' = undefined;
    /**
    * @member {module:model/ImageType} ImageType
    */
    'ImageType' = undefined;
    /**
    * @member {Number} Index
    */
    'Index' = undefined;




}
