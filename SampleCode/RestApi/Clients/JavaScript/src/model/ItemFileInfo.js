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
import ImageType from './ImageType';
import ItemFileType from './ItemFileType';

/**
* The ItemFileInfo model module.
* @module model/ItemFileInfo
* @version 4.8.10.0
*/
export default class ItemFileInfo {
    /**
    * Constructs a new <code>ItemFileInfo</code>.
    * @alias module:model/ItemFileInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ItemFileInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ItemFileInfo} obj Optional instance to populate.
    * @return {module:model/ItemFileInfo} The populated <code>ItemFileInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ItemFileInfo();
                        
            
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ItemFileType.constructFromObject(data['Type']);
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
    * @member {module:model/ItemFileType} Type
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
