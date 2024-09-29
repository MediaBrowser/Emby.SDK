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
import AccessSchedule from './AccessSchedule';
import UnratedItem from './UnratedItem';

/**
* The UserPolicy model module.
* @module model/UserPolicy
* @version 4.8.10.0
*/
export default class UserPolicy {
    /**
    * Constructs a new <code>UserPolicy</code>.
    * @alias module:model/UserPolicy
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UserPolicy</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UserPolicy} obj Optional instance to populate.
    * @return {module:model/UserPolicy} The populated <code>UserPolicy</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserPolicy();
                        
            
            if (data.hasOwnProperty('IsAdministrator')) {
                obj['IsAdministrator'] = ApiClient.convertToType(data['IsAdministrator'], 'Boolean');
            }
            if (data.hasOwnProperty('IsHidden')) {
                obj['IsHidden'] = ApiClient.convertToType(data['IsHidden'], 'Boolean');
            }
            if (data.hasOwnProperty('IsHiddenRemotely')) {
                obj['IsHiddenRemotely'] = ApiClient.convertToType(data['IsHiddenRemotely'], 'Boolean');
            }
            if (data.hasOwnProperty('IsHiddenFromUnusedDevices')) {
                obj['IsHiddenFromUnusedDevices'] = ApiClient.convertToType(data['IsHiddenFromUnusedDevices'], 'Boolean');
            }
            if (data.hasOwnProperty('IsDisabled')) {
                obj['IsDisabled'] = ApiClient.convertToType(data['IsDisabled'], 'Boolean');
            }
            if (data.hasOwnProperty('LockedOutDate')) {
                obj['LockedOutDate'] = ApiClient.convertToType(data['LockedOutDate'], 'Number');
            }
            if (data.hasOwnProperty('MaxParentalRating')) {
                obj['MaxParentalRating'] = ApiClient.convertToType(data['MaxParentalRating'], 'Number');
            }
            if (data.hasOwnProperty('AllowTagOrRating')) {
                obj['AllowTagOrRating'] = ApiClient.convertToType(data['AllowTagOrRating'], 'Boolean');
            }
            if (data.hasOwnProperty('BlockedTags')) {
                obj['BlockedTags'] = ApiClient.convertToType(data['BlockedTags'], ['String']);
            }
            if (data.hasOwnProperty('IsTagBlockingModeInclusive')) {
                obj['IsTagBlockingModeInclusive'] = ApiClient.convertToType(data['IsTagBlockingModeInclusive'], 'Boolean');
            }
            if (data.hasOwnProperty('IncludeTags')) {
                obj['IncludeTags'] = ApiClient.convertToType(data['IncludeTags'], ['String']);
            }
            if (data.hasOwnProperty('EnableUserPreferenceAccess')) {
                obj['EnableUserPreferenceAccess'] = ApiClient.convertToType(data['EnableUserPreferenceAccess'], 'Boolean');
            }
            if (data.hasOwnProperty('AccessSchedules')) {
                obj['AccessSchedules'] = ApiClient.convertToType(data['AccessSchedules'], [AccessSchedule]);
            }
            if (data.hasOwnProperty('BlockUnratedItems')) {
                obj['BlockUnratedItems'] = ApiClient.convertToType(data['BlockUnratedItems'], [UnratedItem]);
            }
            if (data.hasOwnProperty('EnableRemoteControlOfOtherUsers')) {
                obj['EnableRemoteControlOfOtherUsers'] = ApiClient.convertToType(data['EnableRemoteControlOfOtherUsers'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableSharedDeviceControl')) {
                obj['EnableSharedDeviceControl'] = ApiClient.convertToType(data['EnableSharedDeviceControl'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableRemoteAccess')) {
                obj['EnableRemoteAccess'] = ApiClient.convertToType(data['EnableRemoteAccess'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableLiveTvManagement')) {
                obj['EnableLiveTvManagement'] = ApiClient.convertToType(data['EnableLiveTvManagement'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableLiveTvAccess')) {
                obj['EnableLiveTvAccess'] = ApiClient.convertToType(data['EnableLiveTvAccess'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableMediaPlayback')) {
                obj['EnableMediaPlayback'] = ApiClient.convertToType(data['EnableMediaPlayback'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableAudioPlaybackTranscoding')) {
                obj['EnableAudioPlaybackTranscoding'] = ApiClient.convertToType(data['EnableAudioPlaybackTranscoding'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableVideoPlaybackTranscoding')) {
                obj['EnableVideoPlaybackTranscoding'] = ApiClient.convertToType(data['EnableVideoPlaybackTranscoding'], 'Boolean');
            }
            if (data.hasOwnProperty('EnablePlaybackRemuxing')) {
                obj['EnablePlaybackRemuxing'] = ApiClient.convertToType(data['EnablePlaybackRemuxing'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableContentDeletion')) {
                obj['EnableContentDeletion'] = ApiClient.convertToType(data['EnableContentDeletion'], 'Boolean');
            }
            if (data.hasOwnProperty('RestrictedFeatures')) {
                obj['RestrictedFeatures'] = ApiClient.convertToType(data['RestrictedFeatures'], ['String']);
            }
            if (data.hasOwnProperty('EnableContentDeletionFromFolders')) {
                obj['EnableContentDeletionFromFolders'] = ApiClient.convertToType(data['EnableContentDeletionFromFolders'], ['String']);
            }
            if (data.hasOwnProperty('EnableContentDownloading')) {
                obj['EnableContentDownloading'] = ApiClient.convertToType(data['EnableContentDownloading'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableSubtitleDownloading')) {
                obj['EnableSubtitleDownloading'] = ApiClient.convertToType(data['EnableSubtitleDownloading'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableSubtitleManagement')) {
                obj['EnableSubtitleManagement'] = ApiClient.convertToType(data['EnableSubtitleManagement'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableSyncTranscoding')) {
                obj['EnableSyncTranscoding'] = ApiClient.convertToType(data['EnableSyncTranscoding'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableMediaConversion')) {
                obj['EnableMediaConversion'] = ApiClient.convertToType(data['EnableMediaConversion'], 'Boolean');
            }
            if (data.hasOwnProperty('EnabledChannels')) {
                obj['EnabledChannels'] = ApiClient.convertToType(data['EnabledChannels'], ['String']);
            }
            if (data.hasOwnProperty('EnableAllChannels')) {
                obj['EnableAllChannels'] = ApiClient.convertToType(data['EnableAllChannels'], 'Boolean');
            }
            if (data.hasOwnProperty('EnabledFolders')) {
                obj['EnabledFolders'] = ApiClient.convertToType(data['EnabledFolders'], ['String']);
            }
            if (data.hasOwnProperty('EnableAllFolders')) {
                obj['EnableAllFolders'] = ApiClient.convertToType(data['EnableAllFolders'], 'Boolean');
            }
            if (data.hasOwnProperty('InvalidLoginAttemptCount')) {
                obj['InvalidLoginAttemptCount'] = ApiClient.convertToType(data['InvalidLoginAttemptCount'], 'Number');
            }
            if (data.hasOwnProperty('EnablePublicSharing')) {
                obj['EnablePublicSharing'] = ApiClient.convertToType(data['EnablePublicSharing'], 'Boolean');
            }
            if (data.hasOwnProperty('BlockedMediaFolders')) {
                obj['BlockedMediaFolders'] = ApiClient.convertToType(data['BlockedMediaFolders'], ['String']);
            }
            if (data.hasOwnProperty('RemoteClientBitrateLimit')) {
                obj['RemoteClientBitrateLimit'] = ApiClient.convertToType(data['RemoteClientBitrateLimit'], 'Number');
            }
            if (data.hasOwnProperty('AuthenticationProviderId')) {
                obj['AuthenticationProviderId'] = ApiClient.convertToType(data['AuthenticationProviderId'], 'String');
            }
            if (data.hasOwnProperty('ExcludedSubFolders')) {
                obj['ExcludedSubFolders'] = ApiClient.convertToType(data['ExcludedSubFolders'], ['String']);
            }
            if (data.hasOwnProperty('SimultaneousStreamLimit')) {
                obj['SimultaneousStreamLimit'] = ApiClient.convertToType(data['SimultaneousStreamLimit'], 'Number');
            }
            if (data.hasOwnProperty('EnabledDevices')) {
                obj['EnabledDevices'] = ApiClient.convertToType(data['EnabledDevices'], ['String']);
            }
            if (data.hasOwnProperty('EnableAllDevices')) {
                obj['EnableAllDevices'] = ApiClient.convertToType(data['EnableAllDevices'], 'Boolean');
            }
            if (data.hasOwnProperty('AllowCameraUpload')) {
                obj['AllowCameraUpload'] = ApiClient.convertToType(data['AllowCameraUpload'], 'Boolean');
            }
            if (data.hasOwnProperty('AllowSharingPersonalItems')) {
                obj['AllowSharingPersonalItems'] = ApiClient.convertToType(data['AllowSharingPersonalItems'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * A value indicating whether this instance is administrator.
    * @member {Boolean} IsAdministrator
    */
    'IsAdministrator' = undefined;
    /**
    * A value indicating whether this instance is hidden.
    * @member {Boolean} IsHidden
    */
    'IsHidden' = undefined;
    /**
    * @member {Boolean} IsHiddenRemotely
    */
    'IsHiddenRemotely' = undefined;
    /**
    * @member {Boolean} IsHiddenFromUnusedDevices
    */
    'IsHiddenFromUnusedDevices' = undefined;
    /**
    * A value indicating whether this instance is disabled.
    * @member {Boolean} IsDisabled
    */
    'IsDisabled' = undefined;
    /**
    * @member {Number} LockedOutDate
    */
    'LockedOutDate' = undefined;
    /**
    * The max parental rating.
    * @member {Number} MaxParentalRating
    */
    'MaxParentalRating' = undefined;
    /**
    * @member {Boolean} AllowTagOrRating
    */
    'AllowTagOrRating' = undefined;
    /**
    * @member {Array.<String>} BlockedTags
    */
    'BlockedTags' = undefined;
    /**
    * @member {Boolean} IsTagBlockingModeInclusive
    */
    'IsTagBlockingModeInclusive' = undefined;
    /**
    * @member {Array.<String>} IncludeTags
    */
    'IncludeTags' = undefined;
    /**
    * @member {Boolean} EnableUserPreferenceAccess
    */
    'EnableUserPreferenceAccess' = undefined;
    /**
    * @member {Array.<module:model/AccessSchedule>} AccessSchedules
    */
    'AccessSchedules' = undefined;
    /**
    * @member {Array.<module:model/UnratedItem>} BlockUnratedItems
    */
    'BlockUnratedItems' = undefined;
    /**
    * @member {Boolean} EnableRemoteControlOfOtherUsers
    */
    'EnableRemoteControlOfOtherUsers' = undefined;
    /**
    * @member {Boolean} EnableSharedDeviceControl
    */
    'EnableSharedDeviceControl' = undefined;
    /**
    * @member {Boolean} EnableRemoteAccess
    */
    'EnableRemoteAccess' = undefined;
    /**
    * @member {Boolean} EnableLiveTvManagement
    */
    'EnableLiveTvManagement' = undefined;
    /**
    * @member {Boolean} EnableLiveTvAccess
    */
    'EnableLiveTvAccess' = undefined;
    /**
    * @member {Boolean} EnableMediaPlayback
    */
    'EnableMediaPlayback' = undefined;
    /**
    * @member {Boolean} EnableAudioPlaybackTranscoding
    */
    'EnableAudioPlaybackTranscoding' = undefined;
    /**
    * @member {Boolean} EnableVideoPlaybackTranscoding
    */
    'EnableVideoPlaybackTranscoding' = undefined;
    /**
    * @member {Boolean} EnablePlaybackRemuxing
    */
    'EnablePlaybackRemuxing' = undefined;
    /**
    * @member {Boolean} EnableContentDeletion
    */
    'EnableContentDeletion' = undefined;
    /**
    * @member {Array.<String>} RestrictedFeatures
    */
    'RestrictedFeatures' = undefined;
    /**
    * @member {Array.<String>} EnableContentDeletionFromFolders
    */
    'EnableContentDeletionFromFolders' = undefined;
    /**
    * @member {Boolean} EnableContentDownloading
    */
    'EnableContentDownloading' = undefined;
    /**
    * @member {Boolean} EnableSubtitleDownloading
    */
    'EnableSubtitleDownloading' = undefined;
    /**
    * @member {Boolean} EnableSubtitleManagement
    */
    'EnableSubtitleManagement' = undefined;
    /**
    * A value indicating whether \\[enable synchronize\\].
    * @member {Boolean} EnableSyncTranscoding
    */
    'EnableSyncTranscoding' = undefined;
    /**
    * @member {Boolean} EnableMediaConversion
    */
    'EnableMediaConversion' = undefined;
    /**
    * @member {Array.<String>} EnabledChannels
    */
    'EnabledChannels' = undefined;
    /**
    * @member {Boolean} EnableAllChannels
    */
    'EnableAllChannels' = undefined;
    /**
    * @member {Array.<String>} EnabledFolders
    */
    'EnabledFolders' = undefined;
    /**
    * @member {Boolean} EnableAllFolders
    */
    'EnableAllFolders' = undefined;
    /**
    * @member {Number} InvalidLoginAttemptCount
    */
    'InvalidLoginAttemptCount' = undefined;
    /**
    * @member {Boolean} EnablePublicSharing
    */
    'EnablePublicSharing' = undefined;
    /**
    * @member {Array.<String>} BlockedMediaFolders
    */
    'BlockedMediaFolders' = undefined;
    /**
    * @member {Number} RemoteClientBitrateLimit
    */
    'RemoteClientBitrateLimit' = undefined;
    /**
    * @member {String} AuthenticationProviderId
    */
    'AuthenticationProviderId' = undefined;
    /**
    * @member {Array.<String>} ExcludedSubFolders
    */
    'ExcludedSubFolders' = undefined;
    /**
    * @member {Number} SimultaneousStreamLimit
    */
    'SimultaneousStreamLimit' = undefined;
    /**
    * @member {Array.<String>} EnabledDevices
    */
    'EnabledDevices' = undefined;
    /**
    * @member {Boolean} EnableAllDevices
    */
    'EnableAllDevices' = undefined;
    /**
    * @member {Boolean} AllowCameraUpload
    */
    'AllowCameraUpload' = undefined;
    /**
    * @member {Boolean} AllowSharingPersonalItems
    */
    'AllowSharingPersonalItems' = undefined;




}
