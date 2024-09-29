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
* The QueueItem model module.
* @module model/QueueItem
* @version 4.8.10.0
*/
export default class QueueItem {
    /**
    * Constructs a new <code>QueueItem</code>.
    * @alias module:model/QueueItem
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueueItem</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueueItem} obj Optional instance to populate.
    * @return {module:model/QueueItem} The populated <code>QueueItem</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueueItem();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'Number');
            }
            if (data.hasOwnProperty('PlaylistItemId')) {
                obj['PlaylistItemId'] = ApiClient.convertToType(data['PlaylistItemId'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Number} Id
    */
    'Id' = undefined;
    /**
    * @member {String} PlaylistItemId
    */
    'PlaylistItemId' = undefined;




}
