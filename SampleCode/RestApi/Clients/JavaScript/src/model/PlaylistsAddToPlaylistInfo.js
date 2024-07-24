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
* The PlaylistsAddToPlaylistInfo model module.
* @module model/PlaylistsAddToPlaylistInfo
* @version 4.9.0.28
*/
export default class PlaylistsAddToPlaylistInfo {
    /**
    * Constructs a new <code>PlaylistsAddToPlaylistInfo</code>.
    * @alias module:model/PlaylistsAddToPlaylistInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PlaylistsAddToPlaylistInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PlaylistsAddToPlaylistInfo} obj Optional instance to populate.
    * @return {module:model/PlaylistsAddToPlaylistInfo} The populated <code>PlaylistsAddToPlaylistInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PlaylistsAddToPlaylistInfo();
                        
            
            if (data.hasOwnProperty('ItemCount')) {
                obj['ItemCount'] = ApiClient.convertToType(data['ItemCount'], 'Number');
            }
            if (data.hasOwnProperty('ContainsDuplicates')) {
                obj['ContainsDuplicates'] = ApiClient.convertToType(data['ContainsDuplicates'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {Number} ItemCount
    */
    'ItemCount' = undefined;
    /**
    * @member {Boolean} ContainsDuplicates
    */
    'ContainsDuplicates' = undefined;




}
