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

/**
* The LiveTvSeriesTimerInfoDto model module.
* @module model/LiveTvSeriesTimerInfoDto
* @version 4.8.0.21
*/
export default class LiveTvSeriesTimerInfoDto {
    /**
    * Constructs a new <code>LiveTvSeriesTimerInfoDto</code>.
    * @alias module:model/LiveTvSeriesTimerInfoDto
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTvSeriesTimerInfoDto</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTvSeriesTimerInfoDto} obj Optional instance to populate.
    * @return {module:model/LiveTvSeriesTimerInfoDto} The populated <code>LiveTvSeriesTimerInfoDto</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTvSeriesTimerInfoDto();
                        
            
            if (data.hasOwnProperty('RecordAnyTime')) {
                obj['RecordAnyTime'] = ApiClient.convertToType(data['RecordAnyTime'], 'Boolean');
            }
            if (data.hasOwnProperty('SkipEpisodesInLibrary')) {
                obj['SkipEpisodesInLibrary'] = ApiClient.convertToType(data['SkipEpisodesInLibrary'], 'Boolean');
            }
            if (data.hasOwnProperty('RecordAnyChannel')) {
                obj['RecordAnyChannel'] = ApiClient.convertToType(data['RecordAnyChannel'], 'Boolean');
            }
            if (data.hasOwnProperty('KeepUpTo')) {
                obj['KeepUpTo'] = ApiClient.convertToType(data['KeepUpTo'], 'Number');
            }
            if (data.hasOwnProperty('MaxRecordingSeconds')) {
                obj['MaxRecordingSeconds'] = ApiClient.convertToType(data['MaxRecordingSeconds'], 'Number');
            }
            if (data.hasOwnProperty('RecordNewOnly')) {
                obj['RecordNewOnly'] = ApiClient.convertToType(data['RecordNewOnly'], 'Boolean');
            }
            if (data.hasOwnProperty('ChannelIds')) {
                obj['ChannelIds'] = ApiClient.convertToType(data['ChannelIds'], ['String']);
            }
            if (data.hasOwnProperty('Days')) {
                obj['Days'] = ApiClient.convertToType(data['Days'], [DayOfWeek]);
            }
            if (data.hasOwnProperty('ImageTags')) {
                obj['ImageTags'] = ApiClient.convertToType(data['ImageTags'], {'String': 'String'});
            }
            if (data.hasOwnProperty('ParentThumbItemId')) {
                obj['ParentThumbItemId'] = ApiClient.convertToType(data['ParentThumbItemId'], 'String');
            }
            if (data.hasOwnProperty('ParentThumbImageTag')) {
                obj['ParentThumbImageTag'] = ApiClient.convertToType(data['ParentThumbImageTag'], 'String');
            }
            if (data.hasOwnProperty('ParentPrimaryImageItemId')) {
                obj['ParentPrimaryImageItemId'] = ApiClient.convertToType(data['ParentPrimaryImageItemId'], 'String');
            }
            if (data.hasOwnProperty('ParentPrimaryImageTag')) {
                obj['ParentPrimaryImageTag'] = ApiClient.convertToType(data['ParentPrimaryImageTag'], 'String');
            }
            if (data.hasOwnProperty('SeriesId')) {
                obj['SeriesId'] = ApiClient.convertToType(data['SeriesId'], 'String');
            }
            if (data.hasOwnProperty('Keywords')) {
                obj['Keywords'] = ApiClient.convertToType(data['Keywords'], [LiveTvKeywordInfo]);
            }
            if (data.hasOwnProperty('TimerType')) {
                obj['TimerType'] = LiveTvTimerType.constructFromObject(data['TimerType']);
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('ServerId')) {
                obj['ServerId'] = ApiClient.convertToType(data['ServerId'], 'String');
            }
            if (data.hasOwnProperty('ChannelId')) {
                obj['ChannelId'] = ApiClient.convertToType(data['ChannelId'], 'String');
            }
            if (data.hasOwnProperty('ChannelName')) {
                obj['ChannelName'] = ApiClient.convertToType(data['ChannelName'], 'String');
            }
            if (data.hasOwnProperty('ChannelPrimaryImageTag')) {
                obj['ChannelPrimaryImageTag'] = ApiClient.convertToType(data['ChannelPrimaryImageTag'], 'String');
            }
            if (data.hasOwnProperty('ProgramId')) {
                obj['ProgramId'] = ApiClient.convertToType(data['ProgramId'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
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
            if (data.hasOwnProperty('ParentBackdropItemId')) {
                obj['ParentBackdropItemId'] = ApiClient.convertToType(data['ParentBackdropItemId'], 'String');
            }
            if (data.hasOwnProperty('ParentBackdropImageTags')) {
                obj['ParentBackdropImageTags'] = ApiClient.convertToType(data['ParentBackdropImageTags'], ['String']);
            }
            if (data.hasOwnProperty('IsPostPaddingRequired')) {
                obj['IsPostPaddingRequired'] = ApiClient.convertToType(data['IsPostPaddingRequired'], 'Boolean');
            }
            if (data.hasOwnProperty('KeepUntil')) {
                obj['KeepUntil'] = LiveTvKeepUntil.constructFromObject(data['KeepUntil']);
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} RecordAnyTime
    */
    'RecordAnyTime' = undefined;
    /**
    * @member {Boolean} SkipEpisodesInLibrary
    */
    'SkipEpisodesInLibrary' = undefined;
    /**
    * @member {Boolean} RecordAnyChannel
    */
    'RecordAnyChannel' = undefined;
    /**
    * @member {Number} KeepUpTo
    */
    'KeepUpTo' = undefined;
    /**
    * @member {Number} MaxRecordingSeconds
    */
    'MaxRecordingSeconds' = undefined;
    /**
    * @member {Boolean} RecordNewOnly
    */
    'RecordNewOnly' = undefined;
    /**
    * @member {Array.<String>} ChannelIds
    */
    'ChannelIds' = undefined;
    /**
    * @member {Array.<module:model/DayOfWeek>} Days
    */
    'Days' = undefined;
    /**
    * @member {Object.<String, String>} ImageTags
    */
    'ImageTags' = undefined;
    /**
    * @member {String} ParentThumbItemId
    */
    'ParentThumbItemId' = undefined;
    /**
    * @member {String} ParentThumbImageTag
    */
    'ParentThumbImageTag' = undefined;
    /**
    * @member {String} ParentPrimaryImageItemId
    */
    'ParentPrimaryImageItemId' = undefined;
    /**
    * @member {String} ParentPrimaryImageTag
    */
    'ParentPrimaryImageTag' = undefined;
    /**
    * @member {String} SeriesId
    */
    'SeriesId' = undefined;
    /**
    * @member {Array.<module:model/LiveTvKeywordInfo>} Keywords
    */
    'Keywords' = undefined;
    /**
    * @member {module:model/LiveTvTimerType} TimerType
    */
    'TimerType' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} Type
    */
    'Type' = undefined;
    /**
    * @member {String} ServerId
    */
    'ServerId' = undefined;
    /**
    * @member {String} ChannelId
    */
    'ChannelId' = undefined;
    /**
    * @member {String} ChannelName
    */
    'ChannelName' = undefined;
    /**
    * @member {String} ChannelPrimaryImageTag
    */
    'ChannelPrimaryImageTag' = undefined;
    /**
    * @member {String} ProgramId
    */
    'ProgramId' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
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
    * @member {String} ParentBackdropItemId
    */
    'ParentBackdropItemId' = undefined;
    /**
    * @member {Array.<String>} ParentBackdropImageTags
    */
    'ParentBackdropImageTags' = undefined;
    /**
    * @member {Boolean} IsPostPaddingRequired
    */
    'IsPostPaddingRequired' = undefined;
    /**
    * @member {module:model/LiveTvKeepUntil} KeepUntil
    */
    'KeepUntil' = undefined;




}
