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
import ImageOption from './ImageOption';
import ImageType from './ImageType';
import LibraryOptionInfo from './LibraryOptionInfo';

/**
* The LibraryTypeOptions model module.
* @module model/LibraryTypeOptions
* @version 4.9.0.27
*/
export default class LibraryTypeOptions {
    /**
    * Constructs a new <code>LibraryTypeOptions</code>.
    * @alias module:model/LibraryTypeOptions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryTypeOptions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryTypeOptions} obj Optional instance to populate.
    * @return {module:model/LibraryTypeOptions} The populated <code>LibraryTypeOptions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryTypeOptions();
                        
            
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('MetadataFetchers')) {
                obj['MetadataFetchers'] = ApiClient.convertToType(data['MetadataFetchers'], [LibraryOptionInfo]);
            }
            if (data.hasOwnProperty('ImageFetchers')) {
                obj['ImageFetchers'] = ApiClient.convertToType(data['ImageFetchers'], [LibraryOptionInfo]);
            }
            if (data.hasOwnProperty('SupportedImageTypes')) {
                obj['SupportedImageTypes'] = ApiClient.convertToType(data['SupportedImageTypes'], [ImageType]);
            }
            if (data.hasOwnProperty('DefaultImageOptions')) {
                obj['DefaultImageOptions'] = ApiClient.convertToType(data['DefaultImageOptions'], [ImageOption]);
            }
        }
        return obj;
    }

    /**
    * @member {String} Type
    */
    'Type' = undefined;
    /**
    * @member {Array.<module:model/LibraryOptionInfo>} MetadataFetchers
    */
    'MetadataFetchers' = undefined;
    /**
    * @member {Array.<module:model/LibraryOptionInfo>} ImageFetchers
    */
    'ImageFetchers' = undefined;
    /**
    * @member {Array.<module:model/ImageType>} SupportedImageTypes
    */
    'SupportedImageTypes' = undefined;
    /**
    * @member {Array.<module:model/ImageOption>} DefaultImageOptions
    */
    'DefaultImageOptions' = undefined;




}
