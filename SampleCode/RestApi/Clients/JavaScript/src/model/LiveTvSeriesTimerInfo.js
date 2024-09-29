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
import DayOfWeek from './DayOfWeek';
import LiveTvKeepUntil from './LiveTvKeepUntil';
import LiveTvKeywordInfo from './LiveTvKeywordInfo';
import LiveTvTimerType from './LiveTvTimerType';
import ProviderIdDictionary from './ProviderIdDictionary';

/**
* The LiveTvSeriesTimerInfo model module.
* @module model/LiveTvSeriesTimerInfo
* @version 4.8.10.0
*/
export default class LiveTvSeriesTimerInfo {
    /**
    * Constructs a new <code>LiveTvSeriesTimerInfo</code>.
    * @alias module:model/LiveTvSeriesTimerInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTvSeriesTimerInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTvSeriesTimerInfo} obj Optional instance to populate.
    * @return {module:model/LiveTvSeriesTimerInfo} The populated <code>LiveTvSeriesTimerInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTvSeriesTimerInfo();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('ChannelId')) {
                obj['ChannelId'] = ApiClient.convertToType(data['ChannelId'], 'String');
            }
            if (data.hasOwnProperty('ChannelIds')) {
                obj['ChannelIds'] = ApiClient.convertToType(data['ChannelIds'], ['String']);
            }
            if (data.hasOwnProperty('ParentFolderId')) {
                obj['ParentFolderId'] = ApiClient.convertToType(data['ParentFolderId'], 'Number');
            }
            if (data.hasOwnProperty('ProgramId')) {
                obj['ProgramId'] = ApiClient.convertToType(data['ProgramId'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('ServiceName')) {
                obj['ServiceName'] = ApiClient.convertToType(data['ServiceName'], 'String');
            }
            if (data.hasOwnProperty('Overview')) {
                obj['Overview'] = ApiClient.convertToType(data['Overview'], 'String');
            }
            if (data.hasOwnProperty('StartDate')) {
                obj['StartDate'] = ApiClient.convertToType(data['StartDate'], 'Date');
            }
            if (data.hasOwnProperty('EndDate')) {
                obj['EndDate'] = ApiClient.convertToType(data['EndDate'], 'Date');
            }
            if (data.hasOwnProperty('RecordAnyTime')) {
                obj['RecordAnyTime'] = ApiClient.convertToType(data['RecordAnyTime'], 'Boolean');
            }
            if (data.hasOwnProperty('KeepUpTo')) {
                obj['KeepUpTo'] = ApiClient.convertToType(data['KeepUpTo'], 'Number');
            }
            if (data.hasOwnProperty('KeepUntil')) {
                obj['KeepUntil'] = LiveTvKeepUntil.constructFromObject(data['KeepUntil']);
            }
            if (data.hasOwnProperty('SkipEpisodesInLibrary')) {
                obj['SkipEpisodesInLibrary'] = ApiClient.convertToType(data['SkipEpisodesInLibrary'], 'Boolean');
            }
            if (data.hasOwnProperty('MatchExistingItemsWithAnyLibrary')) {
                obj['MatchExistingItemsWithAnyLibrary'] = ApiClient.convertToType(data['MatchExistingItemsWithAnyLibrary'], 'Boolean');
            }
            if (data.hasOwnProperty('RecordNewOnly')) {
                obj['RecordNewOnly'] = ApiClient.convertToType(data['RecordNewOnly'], 'Boolean');
            }
            if (data.hasOwnProperty('Days')) {
                obj['Days'] = ApiClient.convertToType(data['Days'], [DayOfWeek]);
            }
            if (data.hasOwnProperty('Priority')) {
                obj['Priority'] = ApiClient.convertToType(data['Priority'], 'Number');
            }
            if (data.hasOwnProperty('PrePaddingSeconds')) {
                obj['PrePaddingSeconds'] = ApiClient.convertToType(data['PrePaddingSeconds'], 'Number');
            }
            if (data.hasOwnProperty('PostPaddingSeconds')) {
                obj['PostPaddingSeconds'] = ApiClient.convertToType(data['PostPaddingSeconds'], 'Number');
            }
            if (data.hasOwnProperty('IsPrePaddingRequired')) {
                obj['IsPrePaddingRequired'] = ApiClient.convertToType(data['IsPrePaddingRequired'], 'Boolean');
            }
            if (data.hasOwnProperty('IsPostPaddingRequired')) {
                obj['IsPostPaddingRequired'] = ApiClient.convertToType(data['IsPostPaddingRequired'], 'Boolean');
            }
            if (data.hasOwnProperty('SeriesId')) {
                obj['SeriesId'] = ApiClient.convertToType(data['SeriesId'], 'String');
            }
            if (data.hasOwnProperty('ProviderIds')) {
                obj['ProviderIds'] = ProviderIdDictionary.constructFromObject(data['ProviderIds']);
            }
            if (data.hasOwnProperty('MaxRecordingSeconds')) {
                obj['MaxRecordingSeconds'] = ApiClient.convertToType(data['MaxRecordingSeconds'], 'Number');
            }
            if (data.hasOwnProperty('Keywords')) {
                obj['Keywords'] = ApiClient.convertToType(data['Keywords'], [LiveTvKeywordInfo]);
            }
            if (data.hasOwnProperty('TimerType')) {
                obj['TimerType'] = LiveTvTimerType.constructFromObject(data['TimerType']);
            }
        }
        return obj;
    }

    /**
    * Id of the recording.
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * ChannelId of the recording.
    * @member {String} ChannelId
    */
    'ChannelId' = undefined;
    /**
    * @member {Array.<String>} ChannelIds
    */
    'ChannelIds' = undefined;
    /**
    * @member {Number} ParentFolderId
    */
    'ParentFolderId' = undefined;
    /**
    * The program identifier.
    * @member {String} ProgramId
    */
    'ProgramId' = undefined;
    /**
    * Name of the recording.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} ServiceName
    */
    'ServiceName' = undefined;
    /**
    * Description of the recording.
    * @member {String} Overview
    */
    'Overview' = undefined;
    /**
    * The start date of the recording, in UTC.
    * @member {Date} StartDate
    */
    'StartDate' = undefined;
    /**
    * The end date of the recording, in UTC.
    * @member {Date} EndDate
    */
    'EndDate' = undefined;
    /**
    * A value indicating whether \\[record any time\\].
    * @member {Boolean} RecordAnyTime
    */
    'RecordAnyTime' = undefined;
    /**
    * @member {Number} KeepUpTo
    */
    'KeepUpTo' = undefined;
    /**
    * @member {module:model/LiveTvKeepUntil} KeepUntil
    */
    'KeepUntil' = undefined;
    /**
    * @member {Boolean} SkipEpisodesInLibrary
    */
    'SkipEpisodesInLibrary' = undefined;
    /**
    * @member {Boolean} MatchExistingItemsWithAnyLibrary
    */
    'MatchExistingItemsWithAnyLibrary' = undefined;
    /**
    * A value indicating whether \\[record new only\\].
    * @member {Boolean} RecordNewOnly
    */
    'RecordNewOnly' = undefined;
    /**
    * The days.
    * @member {Array.<module:model/DayOfWeek>} Days
    */
    'Days' = undefined;
    /**
    * The priority.
    * @member {Number} Priority
    */
    'Priority' = undefined;
    /**
    * The pre padding seconds.
    * @member {Number} PrePaddingSeconds
    */
    'PrePaddingSeconds' = undefined;
    /**
    * The post padding seconds.
    * @member {Number} PostPaddingSeconds
    */
    'PostPaddingSeconds' = undefined;
    /**
    * A value indicating whether this instance is pre padding required.
    * @member {Boolean} IsPrePaddingRequired
    */
    'IsPrePaddingRequired' = undefined;
    /**
    * A value indicating whether this instance is post padding required.
    * @member {Boolean} IsPostPaddingRequired
    */
    'IsPostPaddingRequired' = undefined;
    /**
    * The series identifier.
    * @member {String} SeriesId
    */
    'SeriesId' = undefined;
    /**
    * @member {module:model/ProviderIdDictionary} ProviderIds
    */
    'ProviderIds' = undefined;
    /**
    * @member {Number} MaxRecordingSeconds
    */
    'MaxRecordingSeconds' = undefined;
    /**
    * @member {Array.<module:model/LiveTvKeywordInfo>} Keywords
    */
    'Keywords' = undefined;
    /**
    * @member {module:model/LiveTvTimerType} TimerType
    */
    'TimerType' = undefined;




}
