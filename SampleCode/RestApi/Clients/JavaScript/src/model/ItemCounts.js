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
* The ItemCounts model module.
* @module model/ItemCounts
* @version 4.8.0.13
*/
export default class ItemCounts {
    /**
    * Constructs a new <code>ItemCounts</code>.
    * @alias module:model/ItemCounts
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ItemCounts</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ItemCounts} obj Optional instance to populate.
    * @return {module:model/ItemCounts} The populated <code>ItemCounts</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ItemCounts();
                        
            
            if (data.hasOwnProperty('MovieCount')) {
                obj['MovieCount'] = ApiClient.convertToType(data['MovieCount'], 'Number');
            }
            if (data.hasOwnProperty('SeriesCount')) {
                obj['SeriesCount'] = ApiClient.convertToType(data['SeriesCount'], 'Number');
            }
            if (data.hasOwnProperty('EpisodeCount')) {
                obj['EpisodeCount'] = ApiClient.convertToType(data['EpisodeCount'], 'Number');
            }
            if (data.hasOwnProperty('GameCount')) {
                obj['GameCount'] = ApiClient.convertToType(data['GameCount'], 'Number');
            }
            if (data.hasOwnProperty('ArtistCount')) {
                obj['ArtistCount'] = ApiClient.convertToType(data['ArtistCount'], 'Number');
            }
            if (data.hasOwnProperty('ProgramCount')) {
                obj['ProgramCount'] = ApiClient.convertToType(data['ProgramCount'], 'Number');
            }
            if (data.hasOwnProperty('GameSystemCount')) {
                obj['GameSystemCount'] = ApiClient.convertToType(data['GameSystemCount'], 'Number');
            }
            if (data.hasOwnProperty('TrailerCount')) {
                obj['TrailerCount'] = ApiClient.convertToType(data['TrailerCount'], 'Number');
            }
            if (data.hasOwnProperty('SongCount')) {
                obj['SongCount'] = ApiClient.convertToType(data['SongCount'], 'Number');
            }
            if (data.hasOwnProperty('AlbumCount')) {
                obj['AlbumCount'] = ApiClient.convertToType(data['AlbumCount'], 'Number');
            }
            if (data.hasOwnProperty('MusicVideoCount')) {
                obj['MusicVideoCount'] = ApiClient.convertToType(data['MusicVideoCount'], 'Number');
            }
            if (data.hasOwnProperty('BoxSetCount')) {
                obj['BoxSetCount'] = ApiClient.convertToType(data['BoxSetCount'], 'Number');
            }
            if (data.hasOwnProperty('BookCount')) {
                obj['BookCount'] = ApiClient.convertToType(data['BookCount'], 'Number');
            }
            if (data.hasOwnProperty('ItemCount')) {
                obj['ItemCount'] = ApiClient.convertToType(data['ItemCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Number} MovieCount
    */
    'MovieCount' = undefined;
    /**
    * @member {Number} SeriesCount
    */
    'SeriesCount' = undefined;
    /**
    * @member {Number} EpisodeCount
    */
    'EpisodeCount' = undefined;
    /**
    * @member {Number} GameCount
    */
    'GameCount' = undefined;
    /**
    * @member {Number} ArtistCount
    */
    'ArtistCount' = undefined;
    /**
    * @member {Number} ProgramCount
    */
    'ProgramCount' = undefined;
    /**
    * @member {Number} GameSystemCount
    */
    'GameSystemCount' = undefined;
    /**
    * @member {Number} TrailerCount
    */
    'TrailerCount' = undefined;
    /**
    * @member {Number} SongCount
    */
    'SongCount' = undefined;
    /**
    * @member {Number} AlbumCount
    */
    'AlbumCount' = undefined;
    /**
    * @member {Number} MusicVideoCount
    */
    'MusicVideoCount' = undefined;
    /**
    * @member {Number} BoxSetCount
    */
    'BoxSetCount' = undefined;
    /**
    * @member {Number} BookCount
    */
    'BookCount' = undefined;
    /**
    * @member {Number} ItemCount
    */
    'ItemCount' = undefined;




}
