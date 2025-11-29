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
import DrawingImageOrientation from './DrawingImageOrientation';
import ImageType from './ImageType';

/**
* The EntitiesItemImageInfo model module.
* @module model/EntitiesItemImageInfo
* @version 4.9.2.7
*/
export default class EntitiesItemImageInfo {
    /**
    * Constructs a new <code>EntitiesItemImageInfo</code>.
    * @alias module:model/EntitiesItemImageInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EntitiesItemImageInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EntitiesItemImageInfo} obj Optional instance to populate.
    * @return {module:model/EntitiesItemImageInfo} The populated <code>EntitiesItemImageInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EntitiesItemImageInfo();
                        
            
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ImageType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('Orientation')) {
                obj['Orientation'] = DrawingImageOrientation.constructFromObject(data['Orientation']);
            }
            if (data.hasOwnProperty('DateModified')) {
                obj['DateModified'] = ApiClient.convertToType(data['DateModified'], 'Date');
            }
            if (data.hasOwnProperty('Width')) {
                obj['Width'] = ApiClient.convertToType(data['Width'], 'Number');
            }
            if (data.hasOwnProperty('Height')) {
                obj['Height'] = ApiClient.convertToType(data['Height'], 'Number');
            }
        }
        return obj;
    }

    /**
    * The path.
    * @member {String} Path
    */
    'Path' = undefined;
    /**
    * @member {module:model/ImageType} Type
    */
    'Type' = undefined;
    /**
    * @member {module:model/DrawingImageOrientation} Orientation
    */
    'Orientation' = undefined;
    /**
    * The date modified.
    * @member {Date} DateModified
    */
    'DateModified' = undefined;
    /**
    * @member {Number} Width
    */
    'Width' = undefined;
    /**
    * @member {Number} Height
    */
    'Height' = undefined;




}
