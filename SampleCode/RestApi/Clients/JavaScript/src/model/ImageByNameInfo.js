/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.3
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
* The ImageByNameInfo model module.
* @module model/ImageByNameInfo
* @version 4.8.0.3
*/
export default class ImageByNameInfo {
    /**
    * Constructs a new <code>ImageByNameInfo</code>.
    * @alias module:model/ImageByNameInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ImageByNameInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ImageByNameInfo} obj Optional instance to populate.
    * @return {module:model/ImageByNameInfo} The populated <code>ImageByNameInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ImageByNameInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Theme')) {
                obj['Theme'] = ApiClient.convertToType(data['Theme'], 'String');
            }
            if (data.hasOwnProperty('Context')) {
                obj['Context'] = ApiClient.convertToType(data['Context'], 'String');
            }
            if (data.hasOwnProperty('FileLength')) {
                obj['FileLength'] = ApiClient.convertToType(data['FileLength'], 'Number');
            }
            if (data.hasOwnProperty('Format')) {
                obj['Format'] = ApiClient.convertToType(data['Format'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Theme
    */
    'Theme' = undefined;
    /**
    * @member {String} Context
    */
    'Context' = undefined;
    /**
    * @member {Number} FileLength
    */
    'FileLength' = undefined;
    /**
    * @member {String} Format
    */
    'Format' = undefined;




}
