/*
 * Emby Server REST API (BETA)
 * 
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ConfigurationAccessSchedule;
import io.swagger.client.model.ConfigurationUnratedItem;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * UsersUserPolicy
 */


public class UsersUserPolicy {
  @SerializedName("IsAdministrator")
  private Boolean isAdministrator = null;

  @SerializedName("IsHidden")
  private Boolean isHidden = null;

  @SerializedName("IsHiddenRemotely")
  private Boolean isHiddenRemotely = null;

  @SerializedName("IsHiddenFromUnusedDevices")
  private Boolean isHiddenFromUnusedDevices = null;

  @SerializedName("IsDisabled")
  private Boolean isDisabled = null;

  @SerializedName("MaxParentalRating")
  private Integer maxParentalRating = null;

  @SerializedName("AllowTagOrRating")
  private Boolean allowTagOrRating = null;

  @SerializedName("BlockedTags")
  private List<String> blockedTags = null;

  @SerializedName("IsTagBlockingModeInclusive")
  private Boolean isTagBlockingModeInclusive = null;

  @SerializedName("IncludeTags")
  private List<String> includeTags = null;

  @SerializedName("EnableUserPreferenceAccess")
  private Boolean enableUserPreferenceAccess = null;

  @SerializedName("AccessSchedules")
  private List<ConfigurationAccessSchedule> accessSchedules = null;

  @SerializedName("BlockUnratedItems")
  private List<ConfigurationUnratedItem> blockUnratedItems = null;

  @SerializedName("EnableRemoteControlOfOtherUsers")
  private Boolean enableRemoteControlOfOtherUsers = null;

  @SerializedName("EnableSharedDeviceControl")
  private Boolean enableSharedDeviceControl = null;

  @SerializedName("EnableRemoteAccess")
  private Boolean enableRemoteAccess = null;

  @SerializedName("EnableLiveTvManagement")
  private Boolean enableLiveTvManagement = null;

  @SerializedName("EnableLiveTvAccess")
  private Boolean enableLiveTvAccess = null;

  @SerializedName("EnableMediaPlayback")
  private Boolean enableMediaPlayback = null;

  @SerializedName("EnableAudioPlaybackTranscoding")
  private Boolean enableAudioPlaybackTranscoding = null;

  @SerializedName("EnableVideoPlaybackTranscoding")
  private Boolean enableVideoPlaybackTranscoding = null;

  @SerializedName("EnablePlaybackRemuxing")
  private Boolean enablePlaybackRemuxing = null;

  @SerializedName("EnableContentDeletion")
  private Boolean enableContentDeletion = null;

  @SerializedName("EnableContentDeletionFromFolders")
  private List<String> enableContentDeletionFromFolders = null;

  @SerializedName("EnableContentDownloading")
  private Boolean enableContentDownloading = null;

  @SerializedName("EnableSubtitleDownloading")
  private Boolean enableSubtitleDownloading = null;

  @SerializedName("EnableSubtitleManagement")
  private Boolean enableSubtitleManagement = null;

  @SerializedName("EnableSyncTranscoding")
  private Boolean enableSyncTranscoding = null;

  @SerializedName("EnableMediaConversion")
  private Boolean enableMediaConversion = null;

  @SerializedName("EnabledChannels")
  private List<String> enabledChannels = null;

  @SerializedName("EnableAllChannels")
  private Boolean enableAllChannels = null;

  @SerializedName("EnabledFolders")
  private List<String> enabledFolders = null;

  @SerializedName("EnableAllFolders")
  private Boolean enableAllFolders = null;

  @SerializedName("InvalidLoginAttemptCount")
  private Integer invalidLoginAttemptCount = null;

  @SerializedName("EnablePublicSharing")
  private Boolean enablePublicSharing = null;

  @SerializedName("BlockedMediaFolders")
  private List<String> blockedMediaFolders = null;

  @SerializedName("RemoteClientBitrateLimit")
  private Integer remoteClientBitrateLimit = null;

  @SerializedName("AuthenticationProviderId")
  private String authenticationProviderId = null;

  @SerializedName("ExcludedSubFolders")
  private List<String> excludedSubFolders = null;

  @SerializedName("SimultaneousStreamLimit")
  private Integer simultaneousStreamLimit = null;

  @SerializedName("EnabledDevices")
  private List<String> enabledDevices = null;

  @SerializedName("EnableAllDevices")
  private Boolean enableAllDevices = null;

  public UsersUserPolicy isAdministrator(Boolean isAdministrator) {
    this.isAdministrator = isAdministrator;
    return this;
  }

   /**
   * Get isAdministrator
   * @return isAdministrator
  **/
  @Schema(description = "")
  public Boolean isIsAdministrator() {
    return isAdministrator;
  }

  public void setIsAdministrator(Boolean isAdministrator) {
    this.isAdministrator = isAdministrator;
  }

  public UsersUserPolicy isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Get isHidden
   * @return isHidden
  **/
  @Schema(description = "")
  public Boolean isIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public UsersUserPolicy isHiddenRemotely(Boolean isHiddenRemotely) {
    this.isHiddenRemotely = isHiddenRemotely;
    return this;
  }

   /**
   * Get isHiddenRemotely
   * @return isHiddenRemotely
  **/
  @Schema(description = "")
  public Boolean isIsHiddenRemotely() {
    return isHiddenRemotely;
  }

  public void setIsHiddenRemotely(Boolean isHiddenRemotely) {
    this.isHiddenRemotely = isHiddenRemotely;
  }

  public UsersUserPolicy isHiddenFromUnusedDevices(Boolean isHiddenFromUnusedDevices) {
    this.isHiddenFromUnusedDevices = isHiddenFromUnusedDevices;
    return this;
  }

   /**
   * Get isHiddenFromUnusedDevices
   * @return isHiddenFromUnusedDevices
  **/
  @Schema(description = "")
  public Boolean isIsHiddenFromUnusedDevices() {
    return isHiddenFromUnusedDevices;
  }

  public void setIsHiddenFromUnusedDevices(Boolean isHiddenFromUnusedDevices) {
    this.isHiddenFromUnusedDevices = isHiddenFromUnusedDevices;
  }

  public UsersUserPolicy isDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
    return this;
  }

   /**
   * Get isDisabled
   * @return isDisabled
  **/
  @Schema(description = "")
  public Boolean isIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }

  public UsersUserPolicy maxParentalRating(Integer maxParentalRating) {
    this.maxParentalRating = maxParentalRating;
    return this;
  }

   /**
   * Get maxParentalRating
   * @return maxParentalRating
  **/
  @Schema(description = "")
  public Integer getMaxParentalRating() {
    return maxParentalRating;
  }

  public void setMaxParentalRating(Integer maxParentalRating) {
    this.maxParentalRating = maxParentalRating;
  }

  public UsersUserPolicy allowTagOrRating(Boolean allowTagOrRating) {
    this.allowTagOrRating = allowTagOrRating;
    return this;
  }

   /**
   * Get allowTagOrRating
   * @return allowTagOrRating
  **/
  @Schema(description = "")
  public Boolean isAllowTagOrRating() {
    return allowTagOrRating;
  }

  public void setAllowTagOrRating(Boolean allowTagOrRating) {
    this.allowTagOrRating = allowTagOrRating;
  }

  public UsersUserPolicy blockedTags(List<String> blockedTags) {
    this.blockedTags = blockedTags;
    return this;
  }

  public UsersUserPolicy addBlockedTagsItem(String blockedTagsItem) {
    if (this.blockedTags == null) {
      this.blockedTags = new ArrayList<String>();
    }
    this.blockedTags.add(blockedTagsItem);
    return this;
  }

   /**
   * Get blockedTags
   * @return blockedTags
  **/
  @Schema(description = "")
  public List<String> getBlockedTags() {
    return blockedTags;
  }

  public void setBlockedTags(List<String> blockedTags) {
    this.blockedTags = blockedTags;
  }

  public UsersUserPolicy isTagBlockingModeInclusive(Boolean isTagBlockingModeInclusive) {
    this.isTagBlockingModeInclusive = isTagBlockingModeInclusive;
    return this;
  }

   /**
   * Get isTagBlockingModeInclusive
   * @return isTagBlockingModeInclusive
  **/
  @Schema(description = "")
  public Boolean isIsTagBlockingModeInclusive() {
    return isTagBlockingModeInclusive;
  }

  public void setIsTagBlockingModeInclusive(Boolean isTagBlockingModeInclusive) {
    this.isTagBlockingModeInclusive = isTagBlockingModeInclusive;
  }

  public UsersUserPolicy includeTags(List<String> includeTags) {
    this.includeTags = includeTags;
    return this;
  }

  public UsersUserPolicy addIncludeTagsItem(String includeTagsItem) {
    if (this.includeTags == null) {
      this.includeTags = new ArrayList<String>();
    }
    this.includeTags.add(includeTagsItem);
    return this;
  }

   /**
   * Get includeTags
   * @return includeTags
  **/
  @Schema(description = "")
  public List<String> getIncludeTags() {
    return includeTags;
  }

  public void setIncludeTags(List<String> includeTags) {
    this.includeTags = includeTags;
  }

  public UsersUserPolicy enableUserPreferenceAccess(Boolean enableUserPreferenceAccess) {
    this.enableUserPreferenceAccess = enableUserPreferenceAccess;
    return this;
  }

   /**
   * Get enableUserPreferenceAccess
   * @return enableUserPreferenceAccess
  **/
  @Schema(description = "")
  public Boolean isEnableUserPreferenceAccess() {
    return enableUserPreferenceAccess;
  }

  public void setEnableUserPreferenceAccess(Boolean enableUserPreferenceAccess) {
    this.enableUserPreferenceAccess = enableUserPreferenceAccess;
  }

  public UsersUserPolicy accessSchedules(List<ConfigurationAccessSchedule> accessSchedules) {
    this.accessSchedules = accessSchedules;
    return this;
  }

  public UsersUserPolicy addAccessSchedulesItem(ConfigurationAccessSchedule accessSchedulesItem) {
    if (this.accessSchedules == null) {
      this.accessSchedules = new ArrayList<ConfigurationAccessSchedule>();
    }
    this.accessSchedules.add(accessSchedulesItem);
    return this;
  }

   /**
   * Get accessSchedules
   * @return accessSchedules
  **/
  @Schema(description = "")
  public List<ConfigurationAccessSchedule> getAccessSchedules() {
    return accessSchedules;
  }

  public void setAccessSchedules(List<ConfigurationAccessSchedule> accessSchedules) {
    this.accessSchedules = accessSchedules;
  }

  public UsersUserPolicy blockUnratedItems(List<ConfigurationUnratedItem> blockUnratedItems) {
    this.blockUnratedItems = blockUnratedItems;
    return this;
  }

  public UsersUserPolicy addBlockUnratedItemsItem(ConfigurationUnratedItem blockUnratedItemsItem) {
    if (this.blockUnratedItems == null) {
      this.blockUnratedItems = new ArrayList<ConfigurationUnratedItem>();
    }
    this.blockUnratedItems.add(blockUnratedItemsItem);
    return this;
  }

   /**
   * Get blockUnratedItems
   * @return blockUnratedItems
  **/
  @Schema(description = "")
  public List<ConfigurationUnratedItem> getBlockUnratedItems() {
    return blockUnratedItems;
  }

  public void setBlockUnratedItems(List<ConfigurationUnratedItem> blockUnratedItems) {
    this.blockUnratedItems = blockUnratedItems;
  }

  public UsersUserPolicy enableRemoteControlOfOtherUsers(Boolean enableRemoteControlOfOtherUsers) {
    this.enableRemoteControlOfOtherUsers = enableRemoteControlOfOtherUsers;
    return this;
  }

   /**
   * Get enableRemoteControlOfOtherUsers
   * @return enableRemoteControlOfOtherUsers
  **/
  @Schema(description = "")
  public Boolean isEnableRemoteControlOfOtherUsers() {
    return enableRemoteControlOfOtherUsers;
  }

  public void setEnableRemoteControlOfOtherUsers(Boolean enableRemoteControlOfOtherUsers) {
    this.enableRemoteControlOfOtherUsers = enableRemoteControlOfOtherUsers;
  }

  public UsersUserPolicy enableSharedDeviceControl(Boolean enableSharedDeviceControl) {
    this.enableSharedDeviceControl = enableSharedDeviceControl;
    return this;
  }

   /**
   * Get enableSharedDeviceControl
   * @return enableSharedDeviceControl
  **/
  @Schema(description = "")
  public Boolean isEnableSharedDeviceControl() {
    return enableSharedDeviceControl;
  }

  public void setEnableSharedDeviceControl(Boolean enableSharedDeviceControl) {
    this.enableSharedDeviceControl = enableSharedDeviceControl;
  }

  public UsersUserPolicy enableRemoteAccess(Boolean enableRemoteAccess) {
    this.enableRemoteAccess = enableRemoteAccess;
    return this;
  }

   /**
   * Get enableRemoteAccess
   * @return enableRemoteAccess
  **/
  @Schema(description = "")
  public Boolean isEnableRemoteAccess() {
    return enableRemoteAccess;
  }

  public void setEnableRemoteAccess(Boolean enableRemoteAccess) {
    this.enableRemoteAccess = enableRemoteAccess;
  }

  public UsersUserPolicy enableLiveTvManagement(Boolean enableLiveTvManagement) {
    this.enableLiveTvManagement = enableLiveTvManagement;
    return this;
  }

   /**
   * Get enableLiveTvManagement
   * @return enableLiveTvManagement
  **/
  @Schema(description = "")
  public Boolean isEnableLiveTvManagement() {
    return enableLiveTvManagement;
  }

  public void setEnableLiveTvManagement(Boolean enableLiveTvManagement) {
    this.enableLiveTvManagement = enableLiveTvManagement;
  }

  public UsersUserPolicy enableLiveTvAccess(Boolean enableLiveTvAccess) {
    this.enableLiveTvAccess = enableLiveTvAccess;
    return this;
  }

   /**
   * Get enableLiveTvAccess
   * @return enableLiveTvAccess
  **/
  @Schema(description = "")
  public Boolean isEnableLiveTvAccess() {
    return enableLiveTvAccess;
  }

  public void setEnableLiveTvAccess(Boolean enableLiveTvAccess) {
    this.enableLiveTvAccess = enableLiveTvAccess;
  }

  public UsersUserPolicy enableMediaPlayback(Boolean enableMediaPlayback) {
    this.enableMediaPlayback = enableMediaPlayback;
    return this;
  }

   /**
   * Get enableMediaPlayback
   * @return enableMediaPlayback
  **/
  @Schema(description = "")
  public Boolean isEnableMediaPlayback() {
    return enableMediaPlayback;
  }

  public void setEnableMediaPlayback(Boolean enableMediaPlayback) {
    this.enableMediaPlayback = enableMediaPlayback;
  }

  public UsersUserPolicy enableAudioPlaybackTranscoding(Boolean enableAudioPlaybackTranscoding) {
    this.enableAudioPlaybackTranscoding = enableAudioPlaybackTranscoding;
    return this;
  }

   /**
   * Get enableAudioPlaybackTranscoding
   * @return enableAudioPlaybackTranscoding
  **/
  @Schema(description = "")
  public Boolean isEnableAudioPlaybackTranscoding() {
    return enableAudioPlaybackTranscoding;
  }

  public void setEnableAudioPlaybackTranscoding(Boolean enableAudioPlaybackTranscoding) {
    this.enableAudioPlaybackTranscoding = enableAudioPlaybackTranscoding;
  }

  public UsersUserPolicy enableVideoPlaybackTranscoding(Boolean enableVideoPlaybackTranscoding) {
    this.enableVideoPlaybackTranscoding = enableVideoPlaybackTranscoding;
    return this;
  }

   /**
   * Get enableVideoPlaybackTranscoding
   * @return enableVideoPlaybackTranscoding
  **/
  @Schema(description = "")
  public Boolean isEnableVideoPlaybackTranscoding() {
    return enableVideoPlaybackTranscoding;
  }

  public void setEnableVideoPlaybackTranscoding(Boolean enableVideoPlaybackTranscoding) {
    this.enableVideoPlaybackTranscoding = enableVideoPlaybackTranscoding;
  }

  public UsersUserPolicy enablePlaybackRemuxing(Boolean enablePlaybackRemuxing) {
    this.enablePlaybackRemuxing = enablePlaybackRemuxing;
    return this;
  }

   /**
   * Get enablePlaybackRemuxing
   * @return enablePlaybackRemuxing
  **/
  @Schema(description = "")
  public Boolean isEnablePlaybackRemuxing() {
    return enablePlaybackRemuxing;
  }

  public void setEnablePlaybackRemuxing(Boolean enablePlaybackRemuxing) {
    this.enablePlaybackRemuxing = enablePlaybackRemuxing;
  }

  public UsersUserPolicy enableContentDeletion(Boolean enableContentDeletion) {
    this.enableContentDeletion = enableContentDeletion;
    return this;
  }

   /**
   * Get enableContentDeletion
   * @return enableContentDeletion
  **/
  @Schema(description = "")
  public Boolean isEnableContentDeletion() {
    return enableContentDeletion;
  }

  public void setEnableContentDeletion(Boolean enableContentDeletion) {
    this.enableContentDeletion = enableContentDeletion;
  }

  public UsersUserPolicy enableContentDeletionFromFolders(List<String> enableContentDeletionFromFolders) {
    this.enableContentDeletionFromFolders = enableContentDeletionFromFolders;
    return this;
  }

  public UsersUserPolicy addEnableContentDeletionFromFoldersItem(String enableContentDeletionFromFoldersItem) {
    if (this.enableContentDeletionFromFolders == null) {
      this.enableContentDeletionFromFolders = new ArrayList<String>();
    }
    this.enableContentDeletionFromFolders.add(enableContentDeletionFromFoldersItem);
    return this;
  }

   /**
   * Get enableContentDeletionFromFolders
   * @return enableContentDeletionFromFolders
  **/
  @Schema(description = "")
  public List<String> getEnableContentDeletionFromFolders() {
    return enableContentDeletionFromFolders;
  }

  public void setEnableContentDeletionFromFolders(List<String> enableContentDeletionFromFolders) {
    this.enableContentDeletionFromFolders = enableContentDeletionFromFolders;
  }

  public UsersUserPolicy enableContentDownloading(Boolean enableContentDownloading) {
    this.enableContentDownloading = enableContentDownloading;
    return this;
  }

   /**
   * Get enableContentDownloading
   * @return enableContentDownloading
  **/
  @Schema(description = "")
  public Boolean isEnableContentDownloading() {
    return enableContentDownloading;
  }

  public void setEnableContentDownloading(Boolean enableContentDownloading) {
    this.enableContentDownloading = enableContentDownloading;
  }

  public UsersUserPolicy enableSubtitleDownloading(Boolean enableSubtitleDownloading) {
    this.enableSubtitleDownloading = enableSubtitleDownloading;
    return this;
  }

   /**
   * Get enableSubtitleDownloading
   * @return enableSubtitleDownloading
  **/
  @Schema(description = "")
  public Boolean isEnableSubtitleDownloading() {
    return enableSubtitleDownloading;
  }

  public void setEnableSubtitleDownloading(Boolean enableSubtitleDownloading) {
    this.enableSubtitleDownloading = enableSubtitleDownloading;
  }

  public UsersUserPolicy enableSubtitleManagement(Boolean enableSubtitleManagement) {
    this.enableSubtitleManagement = enableSubtitleManagement;
    return this;
  }

   /**
   * Get enableSubtitleManagement
   * @return enableSubtitleManagement
  **/
  @Schema(description = "")
  public Boolean isEnableSubtitleManagement() {
    return enableSubtitleManagement;
  }

  public void setEnableSubtitleManagement(Boolean enableSubtitleManagement) {
    this.enableSubtitleManagement = enableSubtitleManagement;
  }

  public UsersUserPolicy enableSyncTranscoding(Boolean enableSyncTranscoding) {
    this.enableSyncTranscoding = enableSyncTranscoding;
    return this;
  }

   /**
   * Get enableSyncTranscoding
   * @return enableSyncTranscoding
  **/
  @Schema(description = "")
  public Boolean isEnableSyncTranscoding() {
    return enableSyncTranscoding;
  }

  public void setEnableSyncTranscoding(Boolean enableSyncTranscoding) {
    this.enableSyncTranscoding = enableSyncTranscoding;
  }

  public UsersUserPolicy enableMediaConversion(Boolean enableMediaConversion) {
    this.enableMediaConversion = enableMediaConversion;
    return this;
  }

   /**
   * Get enableMediaConversion
   * @return enableMediaConversion
  **/
  @Schema(description = "")
  public Boolean isEnableMediaConversion() {
    return enableMediaConversion;
  }

  public void setEnableMediaConversion(Boolean enableMediaConversion) {
    this.enableMediaConversion = enableMediaConversion;
  }

  public UsersUserPolicy enabledChannels(List<String> enabledChannels) {
    this.enabledChannels = enabledChannels;
    return this;
  }

  public UsersUserPolicy addEnabledChannelsItem(String enabledChannelsItem) {
    if (this.enabledChannels == null) {
      this.enabledChannels = new ArrayList<String>();
    }
    this.enabledChannels.add(enabledChannelsItem);
    return this;
  }

   /**
   * Get enabledChannels
   * @return enabledChannels
  **/
  @Schema(description = "")
  public List<String> getEnabledChannels() {
    return enabledChannels;
  }

  public void setEnabledChannels(List<String> enabledChannels) {
    this.enabledChannels = enabledChannels;
  }

  public UsersUserPolicy enableAllChannels(Boolean enableAllChannels) {
    this.enableAllChannels = enableAllChannels;
    return this;
  }

   /**
   * Get enableAllChannels
   * @return enableAllChannels
  **/
  @Schema(description = "")
  public Boolean isEnableAllChannels() {
    return enableAllChannels;
  }

  public void setEnableAllChannels(Boolean enableAllChannels) {
    this.enableAllChannels = enableAllChannels;
  }

  public UsersUserPolicy enabledFolders(List<String> enabledFolders) {
    this.enabledFolders = enabledFolders;
    return this;
  }

  public UsersUserPolicy addEnabledFoldersItem(String enabledFoldersItem) {
    if (this.enabledFolders == null) {
      this.enabledFolders = new ArrayList<String>();
    }
    this.enabledFolders.add(enabledFoldersItem);
    return this;
  }

   /**
   * Get enabledFolders
   * @return enabledFolders
  **/
  @Schema(description = "")
  public List<String> getEnabledFolders() {
    return enabledFolders;
  }

  public void setEnabledFolders(List<String> enabledFolders) {
    this.enabledFolders = enabledFolders;
  }

  public UsersUserPolicy enableAllFolders(Boolean enableAllFolders) {
    this.enableAllFolders = enableAllFolders;
    return this;
  }

   /**
   * Get enableAllFolders
   * @return enableAllFolders
  **/
  @Schema(description = "")
  public Boolean isEnableAllFolders() {
    return enableAllFolders;
  }

  public void setEnableAllFolders(Boolean enableAllFolders) {
    this.enableAllFolders = enableAllFolders;
  }

  public UsersUserPolicy invalidLoginAttemptCount(Integer invalidLoginAttemptCount) {
    this.invalidLoginAttemptCount = invalidLoginAttemptCount;
    return this;
  }

   /**
   * Get invalidLoginAttemptCount
   * @return invalidLoginAttemptCount
  **/
  @Schema(description = "")
  public Integer getInvalidLoginAttemptCount() {
    return invalidLoginAttemptCount;
  }

  public void setInvalidLoginAttemptCount(Integer invalidLoginAttemptCount) {
    this.invalidLoginAttemptCount = invalidLoginAttemptCount;
  }

  public UsersUserPolicy enablePublicSharing(Boolean enablePublicSharing) {
    this.enablePublicSharing = enablePublicSharing;
    return this;
  }

   /**
   * Get enablePublicSharing
   * @return enablePublicSharing
  **/
  @Schema(description = "")
  public Boolean isEnablePublicSharing() {
    return enablePublicSharing;
  }

  public void setEnablePublicSharing(Boolean enablePublicSharing) {
    this.enablePublicSharing = enablePublicSharing;
  }

  public UsersUserPolicy blockedMediaFolders(List<String> blockedMediaFolders) {
    this.blockedMediaFolders = blockedMediaFolders;
    return this;
  }

  public UsersUserPolicy addBlockedMediaFoldersItem(String blockedMediaFoldersItem) {
    if (this.blockedMediaFolders == null) {
      this.blockedMediaFolders = new ArrayList<String>();
    }
    this.blockedMediaFolders.add(blockedMediaFoldersItem);
    return this;
  }

   /**
   * Get blockedMediaFolders
   * @return blockedMediaFolders
  **/
  @Schema(description = "")
  public List<String> getBlockedMediaFolders() {
    return blockedMediaFolders;
  }

  public void setBlockedMediaFolders(List<String> blockedMediaFolders) {
    this.blockedMediaFolders = blockedMediaFolders;
  }

  public UsersUserPolicy remoteClientBitrateLimit(Integer remoteClientBitrateLimit) {
    this.remoteClientBitrateLimit = remoteClientBitrateLimit;
    return this;
  }

   /**
   * Get remoteClientBitrateLimit
   * @return remoteClientBitrateLimit
  **/
  @Schema(description = "")
  public Integer getRemoteClientBitrateLimit() {
    return remoteClientBitrateLimit;
  }

  public void setRemoteClientBitrateLimit(Integer remoteClientBitrateLimit) {
    this.remoteClientBitrateLimit = remoteClientBitrateLimit;
  }

  public UsersUserPolicy authenticationProviderId(String authenticationProviderId) {
    this.authenticationProviderId = authenticationProviderId;
    return this;
  }

   /**
   * Get authenticationProviderId
   * @return authenticationProviderId
  **/
  @Schema(description = "")
  public String getAuthenticationProviderId() {
    return authenticationProviderId;
  }

  public void setAuthenticationProviderId(String authenticationProviderId) {
    this.authenticationProviderId = authenticationProviderId;
  }

  public UsersUserPolicy excludedSubFolders(List<String> excludedSubFolders) {
    this.excludedSubFolders = excludedSubFolders;
    return this;
  }

  public UsersUserPolicy addExcludedSubFoldersItem(String excludedSubFoldersItem) {
    if (this.excludedSubFolders == null) {
      this.excludedSubFolders = new ArrayList<String>();
    }
    this.excludedSubFolders.add(excludedSubFoldersItem);
    return this;
  }

   /**
   * Get excludedSubFolders
   * @return excludedSubFolders
  **/
  @Schema(description = "")
  public List<String> getExcludedSubFolders() {
    return excludedSubFolders;
  }

  public void setExcludedSubFolders(List<String> excludedSubFolders) {
    this.excludedSubFolders = excludedSubFolders;
  }

  public UsersUserPolicy simultaneousStreamLimit(Integer simultaneousStreamLimit) {
    this.simultaneousStreamLimit = simultaneousStreamLimit;
    return this;
  }

   /**
   * Get simultaneousStreamLimit
   * @return simultaneousStreamLimit
  **/
  @Schema(description = "")
  public Integer getSimultaneousStreamLimit() {
    return simultaneousStreamLimit;
  }

  public void setSimultaneousStreamLimit(Integer simultaneousStreamLimit) {
    this.simultaneousStreamLimit = simultaneousStreamLimit;
  }

  public UsersUserPolicy enabledDevices(List<String> enabledDevices) {
    this.enabledDevices = enabledDevices;
    return this;
  }

  public UsersUserPolicy addEnabledDevicesItem(String enabledDevicesItem) {
    if (this.enabledDevices == null) {
      this.enabledDevices = new ArrayList<String>();
    }
    this.enabledDevices.add(enabledDevicesItem);
    return this;
  }

   /**
   * Get enabledDevices
   * @return enabledDevices
  **/
  @Schema(description = "")
  public List<String> getEnabledDevices() {
    return enabledDevices;
  }

  public void setEnabledDevices(List<String> enabledDevices) {
    this.enabledDevices = enabledDevices;
  }

  public UsersUserPolicy enableAllDevices(Boolean enableAllDevices) {
    this.enableAllDevices = enableAllDevices;
    return this;
  }

   /**
   * Get enableAllDevices
   * @return enableAllDevices
  **/
  @Schema(description = "")
  public Boolean isEnableAllDevices() {
    return enableAllDevices;
  }

  public void setEnableAllDevices(Boolean enableAllDevices) {
    this.enableAllDevices = enableAllDevices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersUserPolicy usersUserPolicy = (UsersUserPolicy) o;
    return Objects.equals(this.isAdministrator, usersUserPolicy.isAdministrator) &&
        Objects.equals(this.isHidden, usersUserPolicy.isHidden) &&
        Objects.equals(this.isHiddenRemotely, usersUserPolicy.isHiddenRemotely) &&
        Objects.equals(this.isHiddenFromUnusedDevices, usersUserPolicy.isHiddenFromUnusedDevices) &&
        Objects.equals(this.isDisabled, usersUserPolicy.isDisabled) &&
        Objects.equals(this.maxParentalRating, usersUserPolicy.maxParentalRating) &&
        Objects.equals(this.allowTagOrRating, usersUserPolicy.allowTagOrRating) &&
        Objects.equals(this.blockedTags, usersUserPolicy.blockedTags) &&
        Objects.equals(this.isTagBlockingModeInclusive, usersUserPolicy.isTagBlockingModeInclusive) &&
        Objects.equals(this.includeTags, usersUserPolicy.includeTags) &&
        Objects.equals(this.enableUserPreferenceAccess, usersUserPolicy.enableUserPreferenceAccess) &&
        Objects.equals(this.accessSchedules, usersUserPolicy.accessSchedules) &&
        Objects.equals(this.blockUnratedItems, usersUserPolicy.blockUnratedItems) &&
        Objects.equals(this.enableRemoteControlOfOtherUsers, usersUserPolicy.enableRemoteControlOfOtherUsers) &&
        Objects.equals(this.enableSharedDeviceControl, usersUserPolicy.enableSharedDeviceControl) &&
        Objects.equals(this.enableRemoteAccess, usersUserPolicy.enableRemoteAccess) &&
        Objects.equals(this.enableLiveTvManagement, usersUserPolicy.enableLiveTvManagement) &&
        Objects.equals(this.enableLiveTvAccess, usersUserPolicy.enableLiveTvAccess) &&
        Objects.equals(this.enableMediaPlayback, usersUserPolicy.enableMediaPlayback) &&
        Objects.equals(this.enableAudioPlaybackTranscoding, usersUserPolicy.enableAudioPlaybackTranscoding) &&
        Objects.equals(this.enableVideoPlaybackTranscoding, usersUserPolicy.enableVideoPlaybackTranscoding) &&
        Objects.equals(this.enablePlaybackRemuxing, usersUserPolicy.enablePlaybackRemuxing) &&
        Objects.equals(this.enableContentDeletion, usersUserPolicy.enableContentDeletion) &&
        Objects.equals(this.enableContentDeletionFromFolders, usersUserPolicy.enableContentDeletionFromFolders) &&
        Objects.equals(this.enableContentDownloading, usersUserPolicy.enableContentDownloading) &&
        Objects.equals(this.enableSubtitleDownloading, usersUserPolicy.enableSubtitleDownloading) &&
        Objects.equals(this.enableSubtitleManagement, usersUserPolicy.enableSubtitleManagement) &&
        Objects.equals(this.enableSyncTranscoding, usersUserPolicy.enableSyncTranscoding) &&
        Objects.equals(this.enableMediaConversion, usersUserPolicy.enableMediaConversion) &&
        Objects.equals(this.enabledChannels, usersUserPolicy.enabledChannels) &&
        Objects.equals(this.enableAllChannels, usersUserPolicy.enableAllChannels) &&
        Objects.equals(this.enabledFolders, usersUserPolicy.enabledFolders) &&
        Objects.equals(this.enableAllFolders, usersUserPolicy.enableAllFolders) &&
        Objects.equals(this.invalidLoginAttemptCount, usersUserPolicy.invalidLoginAttemptCount) &&
        Objects.equals(this.enablePublicSharing, usersUserPolicy.enablePublicSharing) &&
        Objects.equals(this.blockedMediaFolders, usersUserPolicy.blockedMediaFolders) &&
        Objects.equals(this.remoteClientBitrateLimit, usersUserPolicy.remoteClientBitrateLimit) &&
        Objects.equals(this.authenticationProviderId, usersUserPolicy.authenticationProviderId) &&
        Objects.equals(this.excludedSubFolders, usersUserPolicy.excludedSubFolders) &&
        Objects.equals(this.simultaneousStreamLimit, usersUserPolicy.simultaneousStreamLimit) &&
        Objects.equals(this.enabledDevices, usersUserPolicy.enabledDevices) &&
        Objects.equals(this.enableAllDevices, usersUserPolicy.enableAllDevices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAdministrator, isHidden, isHiddenRemotely, isHiddenFromUnusedDevices, isDisabled, maxParentalRating, allowTagOrRating, blockedTags, isTagBlockingModeInclusive, includeTags, enableUserPreferenceAccess, accessSchedules, blockUnratedItems, enableRemoteControlOfOtherUsers, enableSharedDeviceControl, enableRemoteAccess, enableLiveTvManagement, enableLiveTvAccess, enableMediaPlayback, enableAudioPlaybackTranscoding, enableVideoPlaybackTranscoding, enablePlaybackRemuxing, enableContentDeletion, enableContentDeletionFromFolders, enableContentDownloading, enableSubtitleDownloading, enableSubtitleManagement, enableSyncTranscoding, enableMediaConversion, enabledChannels, enableAllChannels, enabledFolders, enableAllFolders, invalidLoginAttemptCount, enablePublicSharing, blockedMediaFolders, remoteClientBitrateLimit, authenticationProviderId, excludedSubFolders, simultaneousStreamLimit, enabledDevices, enableAllDevices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersUserPolicy {\n");
    
    sb.append("    isAdministrator: ").append(toIndentedString(isAdministrator)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    isHiddenRemotely: ").append(toIndentedString(isHiddenRemotely)).append("\n");
    sb.append("    isHiddenFromUnusedDevices: ").append(toIndentedString(isHiddenFromUnusedDevices)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    maxParentalRating: ").append(toIndentedString(maxParentalRating)).append("\n");
    sb.append("    allowTagOrRating: ").append(toIndentedString(allowTagOrRating)).append("\n");
    sb.append("    blockedTags: ").append(toIndentedString(blockedTags)).append("\n");
    sb.append("    isTagBlockingModeInclusive: ").append(toIndentedString(isTagBlockingModeInclusive)).append("\n");
    sb.append("    includeTags: ").append(toIndentedString(includeTags)).append("\n");
    sb.append("    enableUserPreferenceAccess: ").append(toIndentedString(enableUserPreferenceAccess)).append("\n");
    sb.append("    accessSchedules: ").append(toIndentedString(accessSchedules)).append("\n");
    sb.append("    blockUnratedItems: ").append(toIndentedString(blockUnratedItems)).append("\n");
    sb.append("    enableRemoteControlOfOtherUsers: ").append(toIndentedString(enableRemoteControlOfOtherUsers)).append("\n");
    sb.append("    enableSharedDeviceControl: ").append(toIndentedString(enableSharedDeviceControl)).append("\n");
    sb.append("    enableRemoteAccess: ").append(toIndentedString(enableRemoteAccess)).append("\n");
    sb.append("    enableLiveTvManagement: ").append(toIndentedString(enableLiveTvManagement)).append("\n");
    sb.append("    enableLiveTvAccess: ").append(toIndentedString(enableLiveTvAccess)).append("\n");
    sb.append("    enableMediaPlayback: ").append(toIndentedString(enableMediaPlayback)).append("\n");
    sb.append("    enableAudioPlaybackTranscoding: ").append(toIndentedString(enableAudioPlaybackTranscoding)).append("\n");
    sb.append("    enableVideoPlaybackTranscoding: ").append(toIndentedString(enableVideoPlaybackTranscoding)).append("\n");
    sb.append("    enablePlaybackRemuxing: ").append(toIndentedString(enablePlaybackRemuxing)).append("\n");
    sb.append("    enableContentDeletion: ").append(toIndentedString(enableContentDeletion)).append("\n");
    sb.append("    enableContentDeletionFromFolders: ").append(toIndentedString(enableContentDeletionFromFolders)).append("\n");
    sb.append("    enableContentDownloading: ").append(toIndentedString(enableContentDownloading)).append("\n");
    sb.append("    enableSubtitleDownloading: ").append(toIndentedString(enableSubtitleDownloading)).append("\n");
    sb.append("    enableSubtitleManagement: ").append(toIndentedString(enableSubtitleManagement)).append("\n");
    sb.append("    enableSyncTranscoding: ").append(toIndentedString(enableSyncTranscoding)).append("\n");
    sb.append("    enableMediaConversion: ").append(toIndentedString(enableMediaConversion)).append("\n");
    sb.append("    enabledChannels: ").append(toIndentedString(enabledChannels)).append("\n");
    sb.append("    enableAllChannels: ").append(toIndentedString(enableAllChannels)).append("\n");
    sb.append("    enabledFolders: ").append(toIndentedString(enabledFolders)).append("\n");
    sb.append("    enableAllFolders: ").append(toIndentedString(enableAllFolders)).append("\n");
    sb.append("    invalidLoginAttemptCount: ").append(toIndentedString(invalidLoginAttemptCount)).append("\n");
    sb.append("    enablePublicSharing: ").append(toIndentedString(enablePublicSharing)).append("\n");
    sb.append("    blockedMediaFolders: ").append(toIndentedString(blockedMediaFolders)).append("\n");
    sb.append("    remoteClientBitrateLimit: ").append(toIndentedString(remoteClientBitrateLimit)).append("\n");
    sb.append("    authenticationProviderId: ").append(toIndentedString(authenticationProviderId)).append("\n");
    sb.append("    excludedSubFolders: ").append(toIndentedString(excludedSubFolders)).append("\n");
    sb.append("    simultaneousStreamLimit: ").append(toIndentedString(simultaneousStreamLimit)).append("\n");
    sb.append("    enabledDevices: ").append(toIndentedString(enabledDevices)).append("\n");
    sb.append("    enableAllDevices: ").append(toIndentedString(enableAllDevices)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
