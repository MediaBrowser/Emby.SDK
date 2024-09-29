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
import LiveTvKeepUntil from './LiveTvKeepUntil';
import LiveTvRecordingStatus from './LiveTvRecordingStatus';
import LiveTvTimerType from './LiveTvTimerType';

/**
* The LiveTvTimerInfoDto model module.
* @module model/LiveTvTimerInfoDto
* @version 4.8.10.0
*/
export default class LiveTvTimerInfoDto {
    /**
    * Constructs a new <code>LiveTvTimerInfoDto</code>.
    * @alias module:model/LiveTvTimerInfoDto
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTvTimerInfoDto</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTvTimerInfoDto} obj Optional instance to populate.
    * @return {module:model/LiveTvTimerInfoDto} The populated <code>LiveTvTimerInfoDto</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTvTimerInfoDto();
                        
            
            if (data.hasOwnProperty('Status')) {
                obj['Status'] = LiveTvRecordingStatus.constructFromObject(data['Status']);
            }
            if (data.hasOwnProperty('SeriesTimerId')) {
                obj['SeriesTimerId'] = ApiClient.convertToType(data['SeriesTimerId'], 'String');
            }
            if (data.hasOwnProperty('RunTimeTicks')) {
                obj['RunTimeTicks'] = ApiClient.convertToType(data['RunTimeTicks'], 'Number');
            }
            if (data.hasOwnProperty('ProgramInfo')) {
                obj['ProgramInfo'] = BaseItemDto.constructFromObject(data['ProgramInfo']);
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
    * @member {module:model/LiveTvRecordingStatus} Status
    */
    'Status' = undefined;
    /**
    * The series timer identifier.
    * @member {String} SeriesTimerId
    */
    'SeriesTimerId' = undefined;
    /**
    * The run time ticks.
    * @member {Number} RunTimeTicks
    */
    'RunTimeTicks' = undefined;
    /**
    * @member {module:model/BaseItemDto} ProgramInfo
    */
    'ProgramInfo' = undefined;
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
