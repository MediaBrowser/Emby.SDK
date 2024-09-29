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
import RokuMetadataApiThumbnailInfo from './RokuMetadataApiThumbnailInfo';

/**
* The RokuMetadataApiThumbnailSetInfo model module.
* @module model/RokuMetadataApiThumbnailSetInfo
* @version 4.8.10.0
*/
export default class RokuMetadataApiThumbnailSetInfo {
    /**
    * Constructs a new <code>RokuMetadataApiThumbnailSetInfo</code>.
    * @alias module:model/RokuMetadataApiThumbnailSetInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>RokuMetadataApiThumbnailSetInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/RokuMetadataApiThumbnailSetInfo} obj Optional instance to populate.
    * @return {module:model/RokuMetadataApiThumbnailSetInfo} The populated <code>RokuMetadataApiThumbnailSetInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RokuMetadataApiThumbnailSetInfo();
                        
            
            if (data.hasOwnProperty('AspectRatio')) {
                obj['AspectRatio'] = ApiClient.convertToType(data['AspectRatio'], 'Number');
            }
            if (data.hasOwnProperty('Thumbnails')) {
                obj['Thumbnails'] = ApiClient.convertToType(data['Thumbnails'], [RokuMetadataApiThumbnailInfo]);
            }
        }
        return obj;
    }

    /**
    * @member {Number} AspectRatio
    */
    'AspectRatio' = undefined;
    /**
    * @member {Array.<module:model/RokuMetadataApiThumbnailInfo>} Thumbnails
    */
    'Thumbnails' = undefined;




}
