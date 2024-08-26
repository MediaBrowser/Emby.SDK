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
import LibraryOptionInfo from './LibraryOptionInfo';
import LibraryTypeOptions from './LibraryTypeOptions';

/**
* The LibraryOptionsResult model module.
* @module model/LibraryOptionsResult
* @version 4.9.0.30
*/
export default class LibraryOptionsResult {
    /**
    * Constructs a new <code>LibraryOptionsResult</code>.
    * @alias module:model/LibraryOptionsResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryOptionsResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryOptionsResult} obj Optional instance to populate.
    * @return {module:model/LibraryOptionsResult} The populated <code>LibraryOptionsResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryOptionsResult();
                        
            
            if (data.hasOwnProperty('MetadataSavers')) {
                obj['MetadataSavers'] = ApiClient.convertToType(data['MetadataSavers'], [LibraryOptionInfo]);
            }
            if (data.hasOwnProperty('MetadataReaders')) {
                obj['MetadataReaders'] = ApiClient.convertToType(data['MetadataReaders'], [LibraryOptionInfo]);
            }
            if (data.hasOwnProperty('SubtitleFetchers')) {
                obj['SubtitleFetchers'] = ApiClient.convertToType(data['SubtitleFetchers'], [LibraryOptionInfo]);
            }
            if (data.hasOwnProperty('LyricsFetchers')) {
                obj['LyricsFetchers'] = ApiClient.convertToType(data['LyricsFetchers'], [LibraryOptionInfo]);
            }
            if (data.hasOwnProperty('TypeOptions')) {
                obj['TypeOptions'] = ApiClient.convertToType(data['TypeOptions'], [LibraryTypeOptions]);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/LibraryOptionInfo>} MetadataSavers
    */
    'MetadataSavers' = undefined;
    /**
    * @member {Array.<module:model/LibraryOptionInfo>} MetadataReaders
    */
    'MetadataReaders' = undefined;
    /**
    * @member {Array.<module:model/LibraryOptionInfo>} SubtitleFetchers
    */
    'SubtitleFetchers' = undefined;
    /**
    * @member {Array.<module:model/LibraryOptionInfo>} LyricsFetchers
    */
    'LyricsFetchers' = undefined;
    /**
    * @member {Array.<module:model/LibraryTypeOptions>} TypeOptions
    */
    'TypeOptions' = undefined;




}
