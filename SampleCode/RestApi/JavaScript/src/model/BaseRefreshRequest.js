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

/**
* The BaseRefreshRequest model module.
* @module model/BaseRefreshRequest
* @version 4.9.2.2
*/
export default class BaseRefreshRequest {
    /**
    * Constructs a new <code>BaseRefreshRequest</code>.
    * @alias module:model/BaseRefreshRequest
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>BaseRefreshRequest</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/BaseRefreshRequest} obj Optional instance to populate.
    * @return {module:model/BaseRefreshRequest} The populated <code>BaseRefreshRequest</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BaseRefreshRequest();
                        
            
            if (data.hasOwnProperty('ReplaceThumbnailImages')) {
                obj['ReplaceThumbnailImages'] = ApiClient.convertToType(data['ReplaceThumbnailImages'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} ReplaceThumbnailImages
    */
    'ReplaceThumbnailImages' = undefined;




}
