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
* The PlaylistsPlaylistCreationResult model module.
* @module model/PlaylistsPlaylistCreationResult
* @version 4.8.10.0
*/
export default class PlaylistsPlaylistCreationResult {
    /**
    * Constructs a new <code>PlaylistsPlaylistCreationResult</code>.
    * @alias module:model/PlaylistsPlaylistCreationResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PlaylistsPlaylistCreationResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PlaylistsPlaylistCreationResult} obj Optional instance to populate.
    * @return {module:model/PlaylistsPlaylistCreationResult} The populated <code>PlaylistsPlaylistCreationResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PlaylistsPlaylistCreationResult();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
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
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {Number} ItemAddedCount
    */
    'ItemAddedCount' = undefined;




}
