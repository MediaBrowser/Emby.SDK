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
* The ImageOption model module.
* @module model/ImageOption
* @version 4.8.10.0
*/
export default class ImageOption {
    /**
    * Constructs a new <code>ImageOption</code>.
    * @alias module:model/ImageOption
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ImageOption</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ImageOption} obj Optional instance to populate.
    * @return {module:model/ImageOption} The populated <code>ImageOption</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ImageOption();
                        
            
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ImageType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('Limit')) {
                obj['Limit'] = ApiClient.convertToType(data['Limit'], 'Number');
            }
            if (data.hasOwnProperty('MinWidth')) {
                obj['MinWidth'] = ApiClient.convertToType(data['MinWidth'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/ImageType} Type
    */
    'Type' = undefined;
    /**
    * The limit.
    * @member {Number} Limit
    */
    'Limit' = undefined;
    /**
    * The minimum width.
    * @member {Number} MinWidth
    */
    'MinWidth' = undefined;




}
