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
import ProgressEvent from './ProgressEvent';

/**
* The MediaEncodingApiOnPlaybackProgress model module.
* @module model/MediaEncodingApiOnPlaybackProgress
* @version 4.8.0.35
*/
export default class MediaEncodingApiOnPlaybackProgress {
    /**
    * Constructs a new <code>MediaEncodingApiOnPlaybackProgress</code>.
    * @alias module:model/MediaEncodingApiOnPlaybackProgress
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingApiOnPlaybackProgress</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingApiOnPlaybackProgress} obj Optional instance to populate.
    * @return {module:model/MediaEncodingApiOnPlaybackProgress} The populated <code>MediaEncodingApiOnPlaybackProgress</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingApiOnPlaybackProgress();
                        
            
            if (data.hasOwnProperty('PlaylistIndex')) {
                obj['PlaylistIndex'] = ApiClient.convertToType(data['PlaylistIndex'], 'Number');
            }
            if (data.hasOwnProperty('PlaylistLength')) {
                obj['PlaylistLength'] = ApiClient.convertToType(data['PlaylistLength'], 'Number');
            }
            if (data.hasOwnProperty('EventName')) {
                obj['EventName'] = ProgressEvent.constructFromObject(data['EventName']);
            }
        }
        return obj;
    }

    /**
    * @member {Number} PlaylistIndex
    */
    'PlaylistIndex' = undefined;
    /**
    * @member {Number} PlaylistLength
    */
    'PlaylistLength' = undefined;
    /**
    * @member {module:model/ProgressEvent} EventName
    */
    'EventName' = undefined;




}
