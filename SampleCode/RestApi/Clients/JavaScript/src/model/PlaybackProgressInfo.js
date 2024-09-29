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
import BaseItemDto from './BaseItemDto';
import PlayMethod from './PlayMethod';
import ProgressEvent from './ProgressEvent';
import QueueItem from './QueueItem';
import RepeatMode from './RepeatMode';

/**
* The PlaybackProgressInfo model module.
* @module model/PlaybackProgressInfo
* @version 4.8.10.0
*/
export default class PlaybackProgressInfo {
    /**
    * Constructs a new <code>PlaybackProgressInfo</code>.
    * Class PlaybackProgressInfo.  
    * @alias module:model/PlaybackProgressInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PlaybackProgressInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PlaybackProgressInfo} obj Optional instance to populate.
    * @return {module:model/PlaybackProgressInfo} The populated <code>PlaybackProgressInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PlaybackProgressInfo();
                        
            
            if (data.hasOwnProperty('CanSeek')) {
                obj['CanSeek'] = ApiClient.convertToType(data['CanSeek'], 'Boolean');
            }
            if (data.hasOwnProperty('Item')) {
                obj['Item'] = BaseItemDto.constructFromObject(data['Item']);
            }
            if (data.hasOwnProperty('NowPlayingQueue')) {
                obj['NowPlayingQueue'] = ApiClient.convertToType(data['NowPlayingQueue'], [QueueItem]);
            }
            if (data.hasOwnProperty('PlaylistItemId')) {
                obj['PlaylistItemId'] = ApiClient.convertToType(data['PlaylistItemId'], 'String');
            }
            if (data.hasOwnProperty('ItemId')) {
                obj['ItemId'] = ApiClient.convertToType(data['ItemId'], 'String');
            }
            if (data.hasOwnProperty('SessionId')) {
                obj['SessionId'] = ApiClient.convertToType(data['SessionId'], 'String');
            }
            if (data.hasOwnProperty('MediaSourceId')) {
                obj['MediaSourceId'] = ApiClient.convertToType(data['MediaSourceId'], 'String');
            }
            if (data.hasOwnProperty('AudioStreamIndex')) {
                obj['AudioStreamIndex'] = ApiClient.convertToType(data['AudioStreamIndex'], 'Number');
            }
            if (data.hasOwnProperty('SubtitleStreamIndex')) {
                obj['SubtitleStreamIndex'] = ApiClient.convertToType(data['SubtitleStreamIndex'], 'Number');
            }
            if (data.hasOwnProperty('IsPaused')) {
                obj['IsPaused'] = ApiClient.convertToType(data['IsPaused'], 'Boolean');
            }
            if (data.hasOwnProperty('PlaylistIndex')) {
                obj['PlaylistIndex'] = ApiClient.convertToType(data['PlaylistIndex'], 'Number');
            }
            if (data.hasOwnProperty('PlaylistLength')) {
                obj['PlaylistLength'] = ApiClient.convertToType(data['PlaylistLength'], 'Number');
            }
            if (data.hasOwnProperty('IsMuted')) {
                obj['IsMuted'] = ApiClient.convertToType(data['IsMuted'], 'Boolean');
            }
            if (data.hasOwnProperty('PositionTicks')) {
                obj['PositionTicks'] = ApiClient.convertToType(data['PositionTicks'], 'Number');
            }
            if (data.hasOwnProperty('RunTimeTicks')) {
                obj['RunTimeTicks'] = ApiClient.convertToType(data['RunTimeTicks'], 'Number');
            }
            if (data.hasOwnProperty('PlaybackStartTimeTicks')) {
                obj['PlaybackStartTimeTicks'] = ApiClient.convertToType(data['PlaybackStartTimeTicks'], 'Number');
            }
            if (data.hasOwnProperty('VolumeLevel')) {
                obj['VolumeLevel'] = ApiClient.convertToType(data['VolumeLevel'], 'Number');
            }
            if (data.hasOwnProperty('Brightness')) {
                obj['Brightness'] = ApiClient.convertToType(data['Brightness'], 'Number');
            }
            if (data.hasOwnProperty('AspectRatio')) {
                obj['AspectRatio'] = ApiClient.convertToType(data['AspectRatio'], 'String');
            }
            if (data.hasOwnProperty('EventName')) {
                obj['EventName'] = ProgressEvent.constructFromObject(data['EventName']);
            }
            if (data.hasOwnProperty('PlayMethod')) {
                obj['PlayMethod'] = PlayMethod.constructFromObject(data['PlayMethod']);
            }
            if (data.hasOwnProperty('LiveStreamId')) {
                obj['LiveStreamId'] = ApiClient.convertToType(data['LiveStreamId'], 'String');
            }
            if (data.hasOwnProperty('PlaySessionId')) {
                obj['PlaySessionId'] = ApiClient.convertToType(data['PlaySessionId'], 'String');
            }
            if (data.hasOwnProperty('RepeatMode')) {
                obj['RepeatMode'] = RepeatMode.constructFromObject(data['RepeatMode']);
            }
            if (data.hasOwnProperty('Shuffle')) {
                obj['Shuffle'] = ApiClient.convertToType(data['Shuffle'], 'Boolean');
            }
            if (data.hasOwnProperty('SubtitleOffset')) {
                obj['SubtitleOffset'] = ApiClient.convertToType(data['SubtitleOffset'], 'Number');
            }
            if (data.hasOwnProperty('PlaybackRate')) {
                obj['PlaybackRate'] = ApiClient.convertToType(data['PlaybackRate'], 'Number');
            }
            if (data.hasOwnProperty('PlaylistItemIds')) {
                obj['PlaylistItemIds'] = ApiClient.convertToType(data['PlaylistItemIds'], ['String']);
            }
        }
        return obj;
    }

    /**
    * A value indicating whether this instance can seek.
    * @member {Boolean} CanSeek
    */
    'CanSeek' = undefined;
    /**
    * @member {module:model/BaseItemDto} Item
    */
    'Item' = undefined;
    /**
    * @member {Array.<module:model/QueueItem>} NowPlayingQueue
    */
    'NowPlayingQueue' = undefined;
    /**
    * @member {String} PlaylistItemId
    */
    'PlaylistItemId' = undefined;
    /**
    * The item identifier.
    * @member {String} ItemId
    */
    'ItemId' = undefined;
    /**
    * The session id.
    * @member {String} SessionId
    */
    'SessionId' = undefined;
    /**
    * The media version identifier.
    * @member {String} MediaSourceId
    */
    'MediaSourceId' = undefined;
    /**
    * The index of the audio stream.
    * @member {Number} AudioStreamIndex
    */
    'AudioStreamIndex' = undefined;
    /**
    * The index of the subtitle stream.
    * @member {Number} SubtitleStreamIndex
    */
    'SubtitleStreamIndex' = undefined;
    /**
    * A value indicating whether this instance is paused.
    * @member {Boolean} IsPaused
    */
    'IsPaused' = undefined;
    /**
    * @member {Number} PlaylistIndex
    */
    'PlaylistIndex' = undefined;
    /**
    * @member {Number} PlaylistLength
    */
    'PlaylistLength' = undefined;
    /**
    * A value indicating whether this instance is muted.
    * @member {Boolean} IsMuted
    */
    'IsMuted' = undefined;
    /**
    * The position ticks.
    * @member {Number} PositionTicks
    */
    'PositionTicks' = undefined;
    /**
    * @member {Number} RunTimeTicks
    */
    'RunTimeTicks' = undefined;
    /**
    * @member {Number} PlaybackStartTimeTicks
    */
    'PlaybackStartTimeTicks' = undefined;
    /**
    * The volume level.
    * @member {Number} VolumeLevel
    */
    'VolumeLevel' = undefined;
    /**
    * @member {Number} Brightness
    */
    'Brightness' = undefined;
    /**
    * @member {String} AspectRatio
    */
    'AspectRatio' = undefined;
    /**
    * @member {module:model/ProgressEvent} EventName
    */
    'EventName' = undefined;
    /**
    * @member {module:model/PlayMethod} PlayMethod
    */
    'PlayMethod' = undefined;
    /**
    * The live stream identifier.
    * @member {String} LiveStreamId
    */
    'LiveStreamId' = undefined;
    /**
    * The play session identifier.
    * @member {String} PlaySessionId
    */
    'PlaySessionId' = undefined;
    /**
    * @member {module:model/RepeatMode} RepeatMode
    */
    'RepeatMode' = undefined;
    /**
    * @member {Boolean} Shuffle
    */
    'Shuffle' = undefined;
    /**
    * @member {Number} SubtitleOffset
    */
    'SubtitleOffset' = undefined;
    /**
    * @member {Number} PlaybackRate
    */
    'PlaybackRate' = undefined;
    /**
    * @member {Array.<String>} PlaylistItemIds
    */
    'PlaylistItemIds' = undefined;




}
