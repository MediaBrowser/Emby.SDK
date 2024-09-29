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
import RemoteImageInfo from './RemoteImageInfo';

/**
* The RemoteImageResult model module.
* @module model/RemoteImageResult
* @version 4.8.10.0
*/
export default class RemoteImageResult {
    /**
    * Constructs a new <code>RemoteImageResult</code>.
    * Class RemoteImageResult.  
    * @alias module:model/RemoteImageResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>RemoteImageResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/RemoteImageResult} obj Optional instance to populate.
    * @return {module:model/RemoteImageResult} The populated <code>RemoteImageResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RemoteImageResult();
                        
            
            if (data.hasOwnProperty('Images')) {
                obj['Images'] = ApiClient.convertToType(data['Images'], [RemoteImageInfo]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
            if (data.hasOwnProperty('Providers')) {
                obj['Providers'] = ApiClient.convertToType(data['Providers'], ['String']);
            }
        }
        return obj;
    }

    /**
    * The images.
    * @member {Array.<module:model/RemoteImageInfo>} Images
    */
    'Images' = undefined;
    /**
    * The total record count.
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;
    /**
    * The providers.
    * @member {Array.<String>} Providers
    */
    'Providers' = undefined;




}
