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
import PlayMethod from './PlayMethod';
import RepeatMode from './RepeatMode';

/**
* The PlayerStateInfo model module.
* @module model/PlayerStateInfo
* @version 4.8.10.0
*/
export default class PlayerStateInfo {
    /**
    * Constructs a new <code>PlayerStateInfo</code>.
    * @alias module:model/PlayerStateInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PlayerStateInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PlayerStateInfo} obj Optional instance to populate.
    * @return {module:model/PlayerStateInfo} The populated <code>PlayerStateInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PlayerStateInfo();
                        
            
            if (data.hasOwnProperty('PositionTicks')) {
                obj['PositionTicks'] = ApiClient.convertToType(data['PositionTicks'], 'Number');
            }
            if (data.hasOwnProperty('CanSeek')) {
                obj['CanSeek'] = ApiClient.convertToType(data['CanSeek'], 'Boolean');
            }
            if (data.hasOwnProperty('IsPaused')) {
                obj['IsPaused'] = ApiClient.convertToType(data['IsPaused'], 'Boolean');
            }
            if (data.hasOwnProperty('IsMuted')) {
                obj['IsMuted'] = ApiClient.convertToType(data['IsMuted'], 'Boolean');
            }
            if (data.hasOwnProperty('VolumeLevel')) {
                obj['VolumeLevel'] = ApiClient.convertToType(data['VolumeLevel'], 'Number');
            }
            if (data.hasOwnProperty('AudioStreamIndex')) {
                obj['AudioStreamIndex'] = ApiClient.convertToType(data['AudioStreamIndex'], 'Number');
            }
            if (data.hasOwnProperty('SubtitleStreamIndex')) {
                obj['SubtitleStreamIndex'] = ApiClient.convertToType(data['SubtitleStreamIndex'], 'Number');
            }
            if (data.hasOwnProperty('MediaSourceId')) {
                obj['MediaSourceId'] = ApiClient.convertToType(data['MediaSourceId'], 'String');
            }
            if (data.hasOwnProperty('PlayMethod')) {
                obj['PlayMethod'] = PlayMethod.constructFromObject(data['PlayMethod']);
            }
            if (data.hasOwnProperty('RepeatMode')) {
                obj['RepeatMode'] = RepeatMode.constructFromObject(data['RepeatMode']);
            }
            if (data.hasOwnProperty('SubtitleOffset')) {
                obj['SubtitleOffset'] = ApiClient.convertToType(data['SubtitleOffset'], 'Number');
            }
            if (data.hasOwnProperty('Shuffle')) {
                obj['Shuffle'] = ApiClient.convertToType(data['Shuffle'], 'Boolean');
            }
            if (data.hasOwnProperty('PlaybackRate')) {
                obj['PlaybackRate'] = ApiClient.convertToType(data['PlaybackRate'], 'Number');
            }
        }
        return obj;
    }

    /**
    * The now playing position ticks.
    * @member {Number} PositionTicks
    */
    'PositionTicks' = undefined;
    /**
    * A value indicating whether this instance can seek.
    * @member {Boolean} CanSeek
    */
    'CanSeek' = undefined;
    /**
    * A value indicating whether this instance is paused.
    * @member {Boolean} IsPaused
    */
    'IsPaused' = undefined;
    /**
    * A value indicating whether this instance is muted.
    * @member {Boolean} IsMuted
    */
    'IsMuted' = undefined;
    /**
    * The volume level.
    * @member {Number} VolumeLevel
    */
    'VolumeLevel' = undefined;
    /**
    * The index of the now playing audio stream.
    * @member {Number} AudioStreamIndex
    */
    'AudioStreamIndex' = undefined;
    /**
    * The index of the now playing subtitle stream.
    * @member {Number} SubtitleStreamIndex
    */
    'SubtitleStreamIndex' = undefined;
    /**
    * The now playing media version identifier.
    * @member {String} MediaSourceId
    */
    'MediaSourceId' = undefined;
    /**
    * @member {module:model/PlayMethod} PlayMethod
    */
    'PlayMethod' = undefined;
    /**
    * @member {module:model/RepeatMode} RepeatMode
    */
    'RepeatMode' = undefined;
    /**
    * @member {Number} SubtitleOffset
    */
    'SubtitleOffset' = undefined;
    /**
    * @member {Boolean} Shuffle
    */
    'Shuffle' = undefined;
    /**
    * @member {Number} PlaybackRate
    */
    'PlaybackRate' = undefined;




}
