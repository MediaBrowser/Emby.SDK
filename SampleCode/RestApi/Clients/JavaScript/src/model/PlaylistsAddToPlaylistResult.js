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
* The PlaylistsAddToPlaylistResult model module.
* @module model/PlaylistsAddToPlaylistResult
* @version 4.8.10.0
*/
export default class PlaylistsAddToPlaylistResult {
    /**
    * Constructs a new <code>PlaylistsAddToPlaylistResult</code>.
    * @alias module:model/PlaylistsAddToPlaylistResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PlaylistsAddToPlaylistResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PlaylistsAddToPlaylistResult} obj Optional instance to populate.
    * @return {module:model/PlaylistsAddToPlaylistResult} The populated <code>PlaylistsAddToPlaylistResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PlaylistsAddToPlaylistResult();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('ItemAddedCount')) {
                obj['ItemAddedCount'] = ApiClient.convertToType(data['ItemAddedCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {Number} ItemAddedCount
    */
    'ItemAddedCount' = undefined;




}
