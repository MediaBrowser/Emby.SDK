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
import BaseItemDto from './BaseItemDto';
import LiveTvKeepUntil from './LiveTvKeepUntil';
import LiveTvRecordingStatus from './LiveTvRecordingStatus';
import LiveTvTimerType from './LiveTvTimerType';

/**
* The LiveTvTimerInfoDto model module.
* @module model/LiveTvTimerInfoDto
* @version 4.8.0.37
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
    * @member {String} SeriesTimerId
    */
    'SeriesTimerId' = undefined;
    /**
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
    * @member {String} ChannelNumber
    */
    'ChannelNumber' = undefined;
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
