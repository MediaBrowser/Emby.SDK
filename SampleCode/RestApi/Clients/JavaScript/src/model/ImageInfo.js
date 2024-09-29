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

/**
* The ImageInfo model module.
* @module model/ImageInfo
* @version 4.8.10.0
*/
export default class ImageInfo {
    /**
    * Constructs a new <code>ImageInfo</code>.
    * Class ImageInfo  
    * @alias module:model/ImageInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ImageInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ImageInfo} obj Optional instance to populate.
    * @return {module:model/ImageInfo} The populated <code>ImageInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ImageInfo();
                        
            
            if (data.hasOwnProperty('ImageType')) {
                obj['ImageType'] = ImageType.constructFromObject(data['ImageType']);
            }
            if (data.hasOwnProperty('ImageIndex')) {
                obj['ImageIndex'] = ApiClient.convertToType(data['ImageIndex'], 'Number');
            }
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
            if (data.hasOwnProperty('Filename')) {
                obj['Filename'] = ApiClient.convertToType(data['Filename'], 'String');
            }
            if (data.hasOwnProperty('Height')) {
                obj['Height'] = ApiClient.convertToType(data['Height'], 'Number');
            }
            if (data.hasOwnProperty('Width')) {
                obj['Width'] = ApiClient.convertToType(data['Width'], 'Number');
            }
            if (data.hasOwnProperty('Size')) {
                obj['Size'] = ApiClient.convertToType(data['Size'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/ImageType} ImageType
    */
    'ImageType' = undefined;
    /**
    * The index of the image.
    * @member {Number} ImageIndex
    */
    'ImageIndex' = undefined;
    /**
    * The path.
    * @member {String} Path
    */
    'Path' = undefined;
    /**
    * @member {String} Filename
    */
    'Filename' = undefined;
    /**
    * The height.
    * @member {Number} Height
    */
    'Height' = undefined;
    /**
    * The width.
    * @member {Number} Width
    */
    'Width' = undefined;
    /**
    * The size.
    * @member {Number} Size
    */
    'Size' = undefined;




}
