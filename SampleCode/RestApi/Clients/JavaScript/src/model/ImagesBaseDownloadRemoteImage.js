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
* The ImagesBaseDownloadRemoteImage model module.
* @module model/ImagesBaseDownloadRemoteImage
* @version 4.9.0.27
*/
export default class ImagesBaseDownloadRemoteImage {
    /**
    * Constructs a new <code>ImagesBaseDownloadRemoteImage</code>.
    * @alias module:model/ImagesBaseDownloadRemoteImage
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ImagesBaseDownloadRemoteImage</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ImagesBaseDownloadRemoteImage} obj Optional instance to populate.
    * @return {module:model/ImagesBaseDownloadRemoteImage} The populated <code>ImagesBaseDownloadRemoteImage</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ImagesBaseDownloadRemoteImage();
                        
            
            if (data.hasOwnProperty('ImageIndex')) {
                obj['ImageIndex'] = ApiClient.convertToType(data['ImageIndex'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Number} ImageIndex
    */
    'ImageIndex' = undefined;




}
