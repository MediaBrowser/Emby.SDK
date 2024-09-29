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
import LibraryLibraryOptionInfo from './LibraryLibraryOptionInfo';
import LibraryLibraryTypeOptions from './LibraryLibraryTypeOptions';

/**
* The LibraryLibraryOptionsResult model module.
* @module model/LibraryLibraryOptionsResult
* @version 4.8.10.0
*/
export default class LibraryLibraryOptionsResult {
    /**
    * Constructs a new <code>LibraryLibraryOptionsResult</code>.
    * @alias module:model/LibraryLibraryOptionsResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryLibraryOptionsResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryLibraryOptionsResult} obj Optional instance to populate.
    * @return {module:model/LibraryLibraryOptionsResult} The populated <code>LibraryLibraryOptionsResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryLibraryOptionsResult();
                        
            
            if (data.hasOwnProperty('MetadataSavers')) {
                obj['MetadataSavers'] = ApiClient.convertToType(data['MetadataSavers'], [LibraryLibraryOptionInfo]);
            }
            if (data.hasOwnProperty('MetadataReaders')) {
                obj['MetadataReaders'] = ApiClient.convertToType(data['MetadataReaders'], [LibraryLibraryOptionInfo]);
            }
            if (data.hasOwnProperty('SubtitleFetchers')) {
                obj['SubtitleFetchers'] = ApiClient.convertToType(data['SubtitleFetchers'], [LibraryLibraryOptionInfo]);
            }
            if (data.hasOwnProperty('LyricsFetchers')) {
                obj['LyricsFetchers'] = ApiClient.convertToType(data['LyricsFetchers'], [LibraryLibraryOptionInfo]);
            }
            if (data.hasOwnProperty('TypeOptions')) {
                obj['TypeOptions'] = ApiClient.convertToType(data['TypeOptions'], [LibraryLibraryTypeOptions]);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/LibraryLibraryOptionInfo>} MetadataSavers
    */
    'MetadataSavers' = undefined;
    /**
    * @member {Array.<module:model/LibraryLibraryOptionInfo>} MetadataReaders
    */
    'MetadataReaders' = undefined;
    /**
    * @member {Array.<module:model/LibraryLibraryOptionInfo>} SubtitleFetchers
    */
    'SubtitleFetchers' = undefined;
    /**
    * @member {Array.<module:model/LibraryLibraryOptionInfo>} LyricsFetchers
    */
    'LyricsFetchers' = undefined;
    /**
    * @member {Array.<module:model/LibraryLibraryTypeOptions>} TypeOptions
    */
    'TypeOptions' = undefined;




}
