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

/**
* The LiveTvSeriesTimerInfoDto model module.
* @module model/LiveTvSeriesTimerInfoDto
* @version 4.8.10.0
*/
export default class LiveTvSeriesTimerInfoDto {
    /**
    * Constructs a new <code>LiveTvSeriesTimerInfoDto</code>.
    * Class SeriesTimerInfoDto.  
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
            if (data.hasOwnProperty('MatchExistingItemsWithAnyLibrary')) {
                obj['MatchExistingItemsWithAnyLibrary'] = ApiClient.convertToType(data['MatchExistingItemsWithAnyLibrary'], 'Boolean');
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
            if (data.hasOwnProperty('ChannelNumber')) {
                obj['ChannelNumber'] = ApiClient.convertToType(data['ChannelNumber'], 'String');
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
            if (data.hasOwnProperty('ParentFolderId')) {
                obj['ParentFolderId'] = ApiClient.convertToType(data['ParentFolderId'], 'String');
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
    * A value indicating whether \\[record any time\\].
    * @member {Boolean} RecordAnyTime
    */
    'RecordAnyTime' = undefined;
    /**
    * @member {Boolean} SkipEpisodesInLibrary
    */
    'SkipEpisodesInLibrary' = undefined;
    /**
    * @member {Boolean} MatchExistingItemsWithAnyLibrary
    */
    'MatchExistingItemsWithAnyLibrary' = undefined;
    /**
    * A value indicating whether \\[record any channel\\].
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
    * A value indicating whether \\[record new only\\].
    * @member {Boolean} RecordNewOnly
    */
    'RecordNewOnly' = undefined;
    /**
    * @member {Array.<String>} ChannelIds
    */
    'ChannelIds' = undefined;
    /**
    * The days.
    * @member {Array.<module:model/DayOfWeek>} Days
    */
    'Days' = undefined;
    /**
    * The image tags.
    * @member {Object.<String, String>} ImageTags
    */
    'ImageTags' = undefined;
    /**
    * The parent thumb item id.
    * @member {String} ParentThumbItemId
    */
    'ParentThumbItemId' = undefined;
    /**
    * The parent thumb image tag.
    * @member {String} ParentThumbImageTag
    */
    'ParentThumbImageTag' = undefined;
    /**
    * The parent primary image item identifier.
    * @member {String} ParentPrimaryImageItemId
    */
    'ParentPrimaryImageItemId' = undefined;
    /**
    * The parent primary image tag.
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
    * Id of the recording.
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} Type
    */
    'Type' = undefined;
    /**
    * The server identifier.
    * @member {String} ServerId
    */
    'ServerId' = undefined;
    /**
    * ChannelId of the recording.
    * @member {String} ChannelId
    */
    'ChannelId' = undefined;
    /**
    * ChannelName of the recording.
    * @member {String} ChannelName
    */
    'ChannelName' = undefined;
    /**
    * @member {String} ChannelNumber
    */
    'ChannelNumber' = undefined;
    /**
    * @member {String} ChannelPrimaryImageTag
    */
    'ChannelPrimaryImageTag' = undefined;
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
    * Description of the recording.
    * @member {String} Overview
    */
    'Overview' = undefined;
    /**
    * @member {String} ParentFolderId
    */
    'ParentFolderId' = undefined;
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
    * If the item does not have any backdrops, this will hold the Id of the Parent that has one.
    * @member {String} ParentBackdropItemId
    */
    'ParentBackdropItemId' = undefined;
    /**
    * The parent backdrop image tags.
    * @member {Array.<String>} ParentBackdropImageTags
    */
    'ParentBackdropImageTags' = undefined;
    /**
    * A value indicating whether this instance is post padding required.
    * @member {Boolean} IsPostPaddingRequired
    */
    'IsPostPaddingRequired' = undefined;
    /**
    * @member {module:model/LiveTvKeepUntil} KeepUntil
    */
    'KeepUntil' = undefined;




}
