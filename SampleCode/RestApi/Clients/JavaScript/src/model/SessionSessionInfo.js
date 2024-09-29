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
import PlayerStateInfo from './PlayerStateInfo';
import SessionUserInfo from './SessionUserInfo';
import TranscodingInfo from './TranscodingInfo';

/**
* The SessionSessionInfo model module.
* @module model/SessionSessionInfo
* @version 4.8.10.0
*/
export default class SessionSessionInfo {
    /**
    * Constructs a new <code>SessionSessionInfo</code>.
    * Class SessionInfo  
    * @alias module:model/SessionSessionInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SessionSessionInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SessionSessionInfo} obj Optional instance to populate.
    * @return {module:model/SessionSessionInfo} The populated <code>SessionSessionInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SessionSessionInfo();
                        
            
            if (data.hasOwnProperty('PlayState')) {
                obj['PlayState'] = PlayerStateInfo.constructFromObject(data['PlayState']);
            }
            if (data.hasOwnProperty('AdditionalUsers')) {
                obj['AdditionalUsers'] = ApiClient.convertToType(data['AdditionalUsers'], [SessionUserInfo]);
            }
            if (data.hasOwnProperty('RemoteEndPoint')) {
                obj['RemoteEndPoint'] = ApiClient.convertToType(data['RemoteEndPoint'], 'String');
            }
            if (data.hasOwnProperty('Protocol')) {
                obj['Protocol'] = ApiClient.convertToType(data['Protocol'], 'String');
            }
            if (data.hasOwnProperty('PlayableMediaTypes')) {
                obj['PlayableMediaTypes'] = ApiClient.convertToType(data['PlayableMediaTypes'], ['String']);
            }
            if (data.hasOwnProperty('PlaylistItemId')) {
                obj['PlaylistItemId'] = ApiClient.convertToType(data['PlaylistItemId'], 'String');
            }
            if (data.hasOwnProperty('PlaylistIndex')) {
                obj['PlaylistIndex'] = ApiClient.convertToType(data['PlaylistIndex'], 'Number');
            }
            if (data.hasOwnProperty('PlaylistLength')) {
                obj['PlaylistLength'] = ApiClient.convertToType(data['PlaylistLength'], 'Number');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('ServerId')) {
                obj['ServerId'] = ApiClient.convertToType(data['ServerId'], 'String');
            }
            if (data.hasOwnProperty('UserId')) {
                obj['UserId'] = ApiClient.convertToType(data['UserId'], 'String');
            }
            if (data.hasOwnProperty('UserName')) {
                obj['UserName'] = ApiClient.convertToType(data['UserName'], 'String');
            }
            if (data.hasOwnProperty('UserPrimaryImageTag')) {
                obj['UserPrimaryImageTag'] = ApiClient.convertToType(data['UserPrimaryImageTag'], 'String');
            }
            if (data.hasOwnProperty('Client')) {
                obj['Client'] = ApiClient.convertToType(data['Client'], 'String');
            }
            if (data.hasOwnProperty('LastActivityDate')) {
                obj['LastActivityDate'] = ApiClient.convertToType(data['LastActivityDate'], 'Date');
            }
            if (data.hasOwnProperty('DeviceName')) {
                obj['DeviceName'] = ApiClient.convertToType(data['DeviceName'], 'String');
            }
            if (data.hasOwnProperty('DeviceType')) {
                obj['DeviceType'] = ApiClient.convertToType(data['DeviceType'], 'String');
            }
            if (data.hasOwnProperty('NowPlayingItem')) {
                obj['NowPlayingItem'] = BaseItemDto.constructFromObject(data['NowPlayingItem']);
            }
            if (data.hasOwnProperty('InternalDeviceId')) {
                obj['InternalDeviceId'] = ApiClient.convertToType(data['InternalDeviceId'], 'Number');
            }
            if (data.hasOwnProperty('DeviceId')) {
                obj['DeviceId'] = ApiClient.convertToType(data['DeviceId'], 'String');
            }
            if (data.hasOwnProperty('ApplicationVersion')) {
                obj['ApplicationVersion'] = ApiClient.convertToType(data['ApplicationVersion'], 'String');
            }
            if (data.hasOwnProperty('AppIconUrl')) {
                obj['AppIconUrl'] = ApiClient.convertToType(data['AppIconUrl'], 'String');
            }
            if (data.hasOwnProperty('SupportedCommands')) {
                obj['SupportedCommands'] = ApiClient.convertToType(data['SupportedCommands'], ['String']);
            }
            if (data.hasOwnProperty('TranscodingInfo')) {
                obj['TranscodingInfo'] = TranscodingInfo.constructFromObject(data['TranscodingInfo']);
            }
            if (data.hasOwnProperty('SupportsRemoteControl')) {
                obj['SupportsRemoteControl'] = ApiClient.convertToType(data['SupportsRemoteControl'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/PlayerStateInfo} PlayState
    */
    'PlayState' = undefined;
    /**
    * @member {Array.<module:model/SessionUserInfo>} AdditionalUsers
    */
    'AdditionalUsers' = undefined;
    /**
    * The remote end point.
    * @member {String} RemoteEndPoint
    */
    'RemoteEndPoint' = undefined;
    /**
    * @member {String} Protocol
    */
    'Protocol' = undefined;
    /**
    * The playable media types.
    * @member {Array.<String>} PlayableMediaTypes
    */
    'PlayableMediaTypes' = undefined;
    /**
    * @member {String} PlaylistItemId
    */
    'PlaylistItemId' = undefined;
    /**
    * @member {Number} PlaylistIndex
    */
    'PlaylistIndex' = undefined;
    /**
    * @member {Number} PlaylistLength
    */
    'PlaylistLength' = undefined;
    /**
    * The id.
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} ServerId
    */
    'ServerId' = undefined;
    /**
    * The user id.
    * @member {String} UserId
    */
    'UserId' = undefined;
    /**
    * The username.
    * @member {String} UserName
    */
    'UserName' = undefined;
    /**
    * @member {String} UserPrimaryImageTag
    */
    'UserPrimaryImageTag' = undefined;
    /**
    * The type of the client.
    * @member {String} Client
    */
    'Client' = undefined;
    /**
    * The last activity date.
    * @member {Date} LastActivityDate
    */
    'LastActivityDate' = undefined;
    /**
    * The name of the device.
    * @member {String} DeviceName
    */
    'DeviceName' = undefined;
    /**
    * @member {String} DeviceType
    */
    'DeviceType' = undefined;
    /**
    * @member {module:model/BaseItemDto} NowPlayingItem
    */
    'NowPlayingItem' = undefined;
    /**
    * @member {Number} InternalDeviceId
    */
    'InternalDeviceId' = undefined;
    /**
    * The device id.
    * @member {String} DeviceId
    */
    'DeviceId' = undefined;
    /**
    * The application version.
    * @member {String} ApplicationVersion
    */
    'ApplicationVersion' = undefined;
    /**
    * The application icon URL.
    * @member {String} AppIconUrl
    */
    'AppIconUrl' = undefined;
    /**
    * The supported commands.
    * @member {Array.<String>} SupportedCommands
    */
    'SupportedCommands' = undefined;
    /**
    * @member {module:model/TranscodingInfo} TranscodingInfo
    */
    'TranscodingInfo' = undefined;
    /**
    * @member {Boolean} SupportsRemoteControl
    */
    'SupportsRemoteControl' = undefined;




}
