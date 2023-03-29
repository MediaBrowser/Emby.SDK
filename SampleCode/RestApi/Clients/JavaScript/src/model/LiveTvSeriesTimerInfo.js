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
import DayOfWeek from './DayOfWeek';
import LiveTvKeepUntil from './LiveTvKeepUntil';
import LiveTvKeywordInfo from './LiveTvKeywordInfo';
import LiveTvTimerType from './LiveTvTimerType';
import ProviderIdDictionary from './ProviderIdDictionary';

/**
* The LiveTvSeriesTimerInfo model module.
* @module model/LiveTvSeriesTimerInfo
* @version 4.8.0.27
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
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} ChannelId
    */
    'ChannelId' = undefined;
    /**
    * @member {Array.<String>} ChannelIds
    */
    'ChannelIds' = undefined;
    /**
    * @member {String} ProgramId
    */
    'ProgramId' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} ServiceName
    */
    'ServiceName' = undefined;
    /**
    * @member {String} Overview
    */
    'Overview' = undefined;
    /**
    * @member {Date} StartDate
    */
    'StartDate' = undefined;
    /**
    * @member {Date} EndDate
    */
    'EndDate' = undefined;
    /**
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
    * @member {Boolean} RecordNewOnly
    */
    'RecordNewOnly' = undefined;
    /**
    * @member {Array.<module:model/DayOfWeek>} Days
    */
    'Days' = undefined;
    /**
    * @member {Number} Priority
    */
    'Priority' = undefined;
    /**
    * @member {Number} PrePaddingSeconds
    */
    'PrePaddingSeconds' = undefined;
    /**
    * @member {Number} PostPaddingSeconds
    */
    'PostPaddingSeconds' = undefined;
    /**
    * @member {Boolean} IsPrePaddingRequired
    */
    'IsPrePaddingRequired' = undefined;
    /**
    * @member {Boolean} IsPostPaddingRequired
    */
    'IsPostPaddingRequired' = undefined;
    /**
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
