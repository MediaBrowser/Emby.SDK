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
import ImageOption from './ImageOption';
import ImageType from './ImageType';
import LibraryLibraryOptionInfo from './LibraryLibraryOptionInfo';

/**
* The LibraryLibraryTypeOptions model module.
* @module model/LibraryLibraryTypeOptions
* @version 4.8.10.0
*/
export default class LibraryLibraryTypeOptions {
    /**
    * Constructs a new <code>LibraryLibraryTypeOptions</code>.
    * @alias module:model/LibraryLibraryTypeOptions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryLibraryTypeOptions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryLibraryTypeOptions} obj Optional instance to populate.
    * @return {module:model/LibraryLibraryTypeOptions} The populated <code>LibraryLibraryTypeOptions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryLibraryTypeOptions();
                        
            
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('MetadataFetchers')) {
                obj['MetadataFetchers'] = ApiClient.convertToType(data['MetadataFetchers'], [LibraryLibraryOptionInfo]);
            }
            if (data.hasOwnProperty('ImageFetchers')) {
                obj['ImageFetchers'] = ApiClient.convertToType(data['ImageFetchers'], [LibraryLibraryOptionInfo]);
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
    * @member {Array.<module:model/LibraryLibraryOptionInfo>} MetadataFetchers
    */
    'MetadataFetchers' = undefined;
    /**
    * @member {Array.<module:model/LibraryLibraryOptionInfo>} ImageFetchers
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
