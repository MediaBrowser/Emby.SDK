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
* The ItemCounts model module.
* @module model/ItemCounts
* @version 4.8.10.0
*/
export default class ItemCounts {
    /**
    * Constructs a new <code>ItemCounts</code>.
    * Class LibrarySummary  
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
    * The movie count.
    * @member {Number} MovieCount
    */
    'MovieCount' = undefined;
    /**
    * The series count.
    * @member {Number} SeriesCount
    */
    'SeriesCount' = undefined;
    /**
    * The episode count.
    * @member {Number} EpisodeCount
    */
    'EpisodeCount' = undefined;
    /**
    * The game count.
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
    * The game system count.
    * @member {Number} GameSystemCount
    */
    'GameSystemCount' = undefined;
    /**
    * The trailer count.
    * @member {Number} TrailerCount
    */
    'TrailerCount' = undefined;
    /**
    * The song count.
    * @member {Number} SongCount
    */
    'SongCount' = undefined;
    /**
    * The album count.
    * @member {Number} AlbumCount
    */
    'AlbumCount' = undefined;
    /**
    * The music video count.
    * @member {Number} MusicVideoCount
    */
    'MusicVideoCount' = undefined;
    /**
    * The box set count.
    * @member {Number} BoxSetCount
    */
    'BoxSetCount' = undefined;
    /**
    * The book count.
    * @member {Number} BookCount
    */
    'BookCount' = undefined;
    /**
    * @member {Number} ItemCount
    */
    'ItemCount' = undefined;




}
