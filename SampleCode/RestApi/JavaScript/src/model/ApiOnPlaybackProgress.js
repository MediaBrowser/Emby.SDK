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
import SleepTimerMode from './SleepTimerMode';

/**
* The ApiOnPlaybackProgress model module.
* @module model/ApiOnPlaybackProgress
* @version 4.9.2.4
*/
export default class ApiOnPlaybackProgress {
    /**
    * Constructs a new <code>ApiOnPlaybackProgress</code>.
    * @alias module:model/ApiOnPlaybackProgress
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ApiOnPlaybackProgress</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ApiOnPlaybackProgress} obj Optional instance to populate.
    * @return {module:model/ApiOnPlaybackProgress} The populated <code>ApiOnPlaybackProgress</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApiOnPlaybackProgress();
                        
            
            if (data.hasOwnProperty('PlaylistIndex')) {
                obj['PlaylistIndex'] = ApiClient.convertToType(data['PlaylistIndex'], 'Number');
            }
            if (data.hasOwnProperty('PlaylistLength')) {
                obj['PlaylistLength'] = ApiClient.convertToType(data['PlaylistLength'], 'Number');
            }
            if (data.hasOwnProperty('Shuffle')) {
                obj['Shuffle'] = ApiClient.convertToType(data['Shuffle'], 'Boolean');
            }
            if (data.hasOwnProperty('SleepTimerMode')) {
                obj['SleepTimerMode'] = SleepTimerMode.constructFromObject(data['SleepTimerMode']);
            }
            if (data.hasOwnProperty('SleepTimerEndTime')) {
                obj['SleepTimerEndTime'] = ApiClient.convertToType(data['SleepTimerEndTime'], 'Date');
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
    * @member {Boolean} Shuffle
    */
    'Shuffle' = undefined;
    /**
    * @member {module:model/SleepTimerMode} SleepTimerMode
    */
    'SleepTimerMode' = undefined;
    /**
    * @member {Date} SleepTimerEndTime
    */
    'SleepTimerEndTime' = undefined;
    /**
    * @member {module:model/ProgressEvent} EventName
    */
    'EventName' = undefined;




}
