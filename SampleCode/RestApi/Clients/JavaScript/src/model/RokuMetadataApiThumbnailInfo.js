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

/**
* The RokuMetadataApiThumbnailInfo model module.
* @module model/RokuMetadataApiThumbnailInfo
* @version 4.8.10.0
*/
export default class RokuMetadataApiThumbnailInfo {
    /**
    * Constructs a new <code>RokuMetadataApiThumbnailInfo</code>.
    * @alias module:model/RokuMetadataApiThumbnailInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>RokuMetadataApiThumbnailInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/RokuMetadataApiThumbnailInfo} obj Optional instance to populate.
    * @return {module:model/RokuMetadataApiThumbnailInfo} The populated <code>RokuMetadataApiThumbnailInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RokuMetadataApiThumbnailInfo();
                        
            
            if (data.hasOwnProperty('PositionTicks')) {
                obj['PositionTicks'] = ApiClient.convertToType(data['PositionTicks'], 'Number');
            }
            if (data.hasOwnProperty('ImageTag')) {
                obj['ImageTag'] = ApiClient.convertToType(data['ImageTag'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Number} PositionTicks
    */
    'PositionTicks' = undefined;
    /**
    * @member {String} ImageTag
    */
    'ImageTag' = undefined;




}
