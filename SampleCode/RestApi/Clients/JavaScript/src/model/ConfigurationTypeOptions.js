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
import ConfigurationImageOption from './ConfigurationImageOption';

/**
* The ConfigurationTypeOptions model module.
* @module model/ConfigurationTypeOptions
* @version 4.8.0.31
*/
export default class ConfigurationTypeOptions {
    /**
    * Constructs a new <code>ConfigurationTypeOptions</code>.
    * @alias module:model/ConfigurationTypeOptions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ConfigurationTypeOptions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ConfigurationTypeOptions} obj Optional instance to populate.
    * @return {module:model/ConfigurationTypeOptions} The populated <code>ConfigurationTypeOptions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConfigurationTypeOptions();
                        
            
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('MetadataFetchers')) {
                obj['MetadataFetchers'] = ApiClient.convertToType(data['MetadataFetchers'], ['String']);
            }
            if (data.hasOwnProperty('MetadataFetcherOrder')) {
                obj['MetadataFetcherOrder'] = ApiClient.convertToType(data['MetadataFetcherOrder'], ['String']);
            }
            if (data.hasOwnProperty('ImageFetchers')) {
                obj['ImageFetchers'] = ApiClient.convertToType(data['ImageFetchers'], ['String']);
            }
            if (data.hasOwnProperty('ImageFetcherOrder')) {
                obj['ImageFetcherOrder'] = ApiClient.convertToType(data['ImageFetcherOrder'], ['String']);
            }
            if (data.hasOwnProperty('ImageOptions')) {
                obj['ImageOptions'] = ApiClient.convertToType(data['ImageOptions'], [ConfigurationImageOption]);
            }
        }
        return obj;
    }

    /**
    * @member {String} Type
    */
    'Type' = undefined;
    /**
    * @member {Array.<String>} MetadataFetchers
    */
    'MetadataFetchers' = undefined;
    /**
    * @member {Array.<String>} MetadataFetcherOrder
    */
    'MetadataFetcherOrder' = undefined;
    /**
    * @member {Array.<String>} ImageFetchers
    */
    'ImageFetchers' = undefined;
    /**
    * @member {Array.<String>} ImageFetcherOrder
    */
    'ImageFetcherOrder' = undefined;
    /**
    * @member {Array.<module:model/ConfigurationImageOption>} ImageOptions
    */
    'ImageOptions' = undefined;




}
