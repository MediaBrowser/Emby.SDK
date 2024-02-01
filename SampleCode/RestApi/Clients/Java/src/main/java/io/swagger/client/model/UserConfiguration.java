/*
 * Emby Server REST API
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
import io.swagger.client.model.SegmentSkipMode;
import io.swagger.client.model.SubtitlePlaybackMode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Class UserConfiguration  
 */
@Schema(description = "Class UserConfiguration  ")

public class UserConfiguration {
  @SerializedName("AudioLanguagePreference")
  private String audioLanguagePreference = null;

  @SerializedName("PlayDefaultAudioTrack")
  private Boolean playDefaultAudioTrack = null;

  @SerializedName("SubtitleLanguagePreference")
  private String subtitleLanguagePreference = null;

  @SerializedName("ProfilePin")
  private String profilePin = null;

  @SerializedName("DisplayMissingEpisodes")
  private Boolean displayMissingEpisodes = null;

  @SerializedName("SubtitleMode")
  private SubtitlePlaybackMode subtitleMode = null;

  @SerializedName("OrderedViews")
  private List<String> orderedViews = null;

  @SerializedName("LatestItemsExcludes")
  private List<String> latestItemsExcludes = null;

  @SerializedName("MyMediaExcludes")
  private List<String> myMediaExcludes = null;

  @SerializedName("HidePlayedInLatest")
  private Boolean hidePlayedInLatest = null;

  @SerializedName("HidePlayedInMoreLikeThis")
  private Boolean hidePlayedInMoreLikeThis = null;

  @SerializedName("HidePlayedInSuggestions")
  private Boolean hidePlayedInSuggestions = null;

  @SerializedName("RememberAudioSelections")
  private Boolean rememberAudioSelections = null;

  @SerializedName("RememberSubtitleSelections")
  private Boolean rememberSubtitleSelections = null;

  @SerializedName("EnableNextEpisodeAutoPlay")
  private Boolean enableNextEpisodeAutoPlay = null;

  @SerializedName("ResumeRewindSeconds")
  private Integer resumeRewindSeconds = null;

  @SerializedName("IntroSkipMode")
  private SegmentSkipMode introSkipMode = null;

  @SerializedName("EnableLocalPassword")
  private Boolean enableLocalPassword = null;

  public UserConfiguration audioLanguagePreference(String audioLanguagePreference) {
    this.audioLanguagePreference = audioLanguagePreference;
    return this;
  }

   /**
   * The audio language preference.
   * @return audioLanguagePreference
  **/
  @Schema(description = "The audio language preference.")
  public String getAudioLanguagePreference() {
    return audioLanguagePreference;
  }

  public void setAudioLanguagePreference(String audioLanguagePreference) {
    this.audioLanguagePreference = audioLanguagePreference;
  }

  public UserConfiguration playDefaultAudioTrack(Boolean playDefaultAudioTrack) {
    this.playDefaultAudioTrack = playDefaultAudioTrack;
    return this;
  }

   /**
   * A value indicating whether \\[play default audio track\\].
   * @return playDefaultAudioTrack
  **/
  @Schema(description = "A value indicating whether \\[play default audio track\\].")
  public Boolean isPlayDefaultAudioTrack() {
    return playDefaultAudioTrack;
  }

  public void setPlayDefaultAudioTrack(Boolean playDefaultAudioTrack) {
    this.playDefaultAudioTrack = playDefaultAudioTrack;
  }

  public UserConfiguration subtitleLanguagePreference(String subtitleLanguagePreference) {
    this.subtitleLanguagePreference = subtitleLanguagePreference;
    return this;
  }

   /**
   * The subtitle language preference.
   * @return subtitleLanguagePreference
  **/
  @Schema(description = "The subtitle language preference.")
  public String getSubtitleLanguagePreference() {
    return subtitleLanguagePreference;
  }

  public void setSubtitleLanguagePreference(String subtitleLanguagePreference) {
    this.subtitleLanguagePreference = subtitleLanguagePreference;
  }

  public UserConfiguration profilePin(String profilePin) {
    this.profilePin = profilePin;
    return this;
  }

   /**
   * Get profilePin
   * @return profilePin
  **/
  @Schema(description = "")
  public String getProfilePin() {
    return profilePin;
  }

  public void setProfilePin(String profilePin) {
    this.profilePin = profilePin;
  }

  public UserConfiguration displayMissingEpisodes(Boolean displayMissingEpisodes) {
    this.displayMissingEpisodes = displayMissingEpisodes;
    return this;
  }

   /**
   * Get displayMissingEpisodes
   * @return displayMissingEpisodes
  **/
  @Schema(description = "")
  public Boolean isDisplayMissingEpisodes() {
    return displayMissingEpisodes;
  }

  public void setDisplayMissingEpisodes(Boolean displayMissingEpisodes) {
    this.displayMissingEpisodes = displayMissingEpisodes;
  }

  public UserConfiguration subtitleMode(SubtitlePlaybackMode subtitleMode) {
    this.subtitleMode = subtitleMode;
    return this;
  }

   /**
   * Get subtitleMode
   * @return subtitleMode
  **/
  @Schema(description = "")
  public SubtitlePlaybackMode getSubtitleMode() {
    return subtitleMode;
  }

  public void setSubtitleMode(SubtitlePlaybackMode subtitleMode) {
    this.subtitleMode = subtitleMode;
  }

  public UserConfiguration orderedViews(List<String> orderedViews) {
    this.orderedViews = orderedViews;
    return this;
  }

  public UserConfiguration addOrderedViewsItem(String orderedViewsItem) {
    if (this.orderedViews == null) {
      this.orderedViews = new ArrayList<String>();
    }
    this.orderedViews.add(orderedViewsItem);
    return this;
  }

   /**
   * Get orderedViews
   * @return orderedViews
  **/
  @Schema(description = "")
  public List<String> getOrderedViews() {
    return orderedViews;
  }

  public void setOrderedViews(List<String> orderedViews) {
    this.orderedViews = orderedViews;
  }

  public UserConfiguration latestItemsExcludes(List<String> latestItemsExcludes) {
    this.latestItemsExcludes = latestItemsExcludes;
    return this;
  }

  public UserConfiguration addLatestItemsExcludesItem(String latestItemsExcludesItem) {
    if (this.latestItemsExcludes == null) {
      this.latestItemsExcludes = new ArrayList<String>();
    }
    this.latestItemsExcludes.add(latestItemsExcludesItem);
    return this;
  }

   /**
   * Get latestItemsExcludes
   * @return latestItemsExcludes
  **/
  @Schema(description = "")
  public List<String> getLatestItemsExcludes() {
    return latestItemsExcludes;
  }

  public void setLatestItemsExcludes(List<String> latestItemsExcludes) {
    this.latestItemsExcludes = latestItemsExcludes;
  }

  public UserConfiguration myMediaExcludes(List<String> myMediaExcludes) {
    this.myMediaExcludes = myMediaExcludes;
    return this;
  }

  public UserConfiguration addMyMediaExcludesItem(String myMediaExcludesItem) {
    if (this.myMediaExcludes == null) {
      this.myMediaExcludes = new ArrayList<String>();
    }
    this.myMediaExcludes.add(myMediaExcludesItem);
    return this;
  }

   /**
   * Get myMediaExcludes
   * @return myMediaExcludes
  **/
  @Schema(description = "")
  public List<String> getMyMediaExcludes() {
    return myMediaExcludes;
  }

  public void setMyMediaExcludes(List<String> myMediaExcludes) {
    this.myMediaExcludes = myMediaExcludes;
  }

  public UserConfiguration hidePlayedInLatest(Boolean hidePlayedInLatest) {
    this.hidePlayedInLatest = hidePlayedInLatest;
    return this;
  }

   /**
   * Get hidePlayedInLatest
   * @return hidePlayedInLatest
  **/
  @Schema(description = "")
  public Boolean isHidePlayedInLatest() {
    return hidePlayedInLatest;
  }

  public void setHidePlayedInLatest(Boolean hidePlayedInLatest) {
    this.hidePlayedInLatest = hidePlayedInLatest;
  }

  public UserConfiguration hidePlayedInMoreLikeThis(Boolean hidePlayedInMoreLikeThis) {
    this.hidePlayedInMoreLikeThis = hidePlayedInMoreLikeThis;
    return this;
  }

   /**
   * Get hidePlayedInMoreLikeThis
   * @return hidePlayedInMoreLikeThis
  **/
  @Schema(description = "")
  public Boolean isHidePlayedInMoreLikeThis() {
    return hidePlayedInMoreLikeThis;
  }

  public void setHidePlayedInMoreLikeThis(Boolean hidePlayedInMoreLikeThis) {
    this.hidePlayedInMoreLikeThis = hidePlayedInMoreLikeThis;
  }

  public UserConfiguration hidePlayedInSuggestions(Boolean hidePlayedInSuggestions) {
    this.hidePlayedInSuggestions = hidePlayedInSuggestions;
    return this;
  }

   /**
   * Get hidePlayedInSuggestions
   * @return hidePlayedInSuggestions
  **/
  @Schema(description = "")
  public Boolean isHidePlayedInSuggestions() {
    return hidePlayedInSuggestions;
  }

  public void setHidePlayedInSuggestions(Boolean hidePlayedInSuggestions) {
    this.hidePlayedInSuggestions = hidePlayedInSuggestions;
  }

  public UserConfiguration rememberAudioSelections(Boolean rememberAudioSelections) {
    this.rememberAudioSelections = rememberAudioSelections;
    return this;
  }

   /**
   * Get rememberAudioSelections
   * @return rememberAudioSelections
  **/
  @Schema(description = "")
  public Boolean isRememberAudioSelections() {
    return rememberAudioSelections;
  }

  public void setRememberAudioSelections(Boolean rememberAudioSelections) {
    this.rememberAudioSelections = rememberAudioSelections;
  }

  public UserConfiguration rememberSubtitleSelections(Boolean rememberSubtitleSelections) {
    this.rememberSubtitleSelections = rememberSubtitleSelections;
    return this;
  }

   /**
   * Get rememberSubtitleSelections
   * @return rememberSubtitleSelections
  **/
  @Schema(description = "")
  public Boolean isRememberSubtitleSelections() {
    return rememberSubtitleSelections;
  }

  public void setRememberSubtitleSelections(Boolean rememberSubtitleSelections) {
    this.rememberSubtitleSelections = rememberSubtitleSelections;
  }

  public UserConfiguration enableNextEpisodeAutoPlay(Boolean enableNextEpisodeAutoPlay) {
    this.enableNextEpisodeAutoPlay = enableNextEpisodeAutoPlay;
    return this;
  }

   /**
   * Get enableNextEpisodeAutoPlay
   * @return enableNextEpisodeAutoPlay
  **/
  @Schema(description = "")
  public Boolean isEnableNextEpisodeAutoPlay() {
    return enableNextEpisodeAutoPlay;
  }

  public void setEnableNextEpisodeAutoPlay(Boolean enableNextEpisodeAutoPlay) {
    this.enableNextEpisodeAutoPlay = enableNextEpisodeAutoPlay;
  }

  public UserConfiguration resumeRewindSeconds(Integer resumeRewindSeconds) {
    this.resumeRewindSeconds = resumeRewindSeconds;
    return this;
  }

   /**
   * Get resumeRewindSeconds
   * @return resumeRewindSeconds
  **/
  @Schema(description = "")
  public Integer getResumeRewindSeconds() {
    return resumeRewindSeconds;
  }

  public void setResumeRewindSeconds(Integer resumeRewindSeconds) {
    this.resumeRewindSeconds = resumeRewindSeconds;
  }

  public UserConfiguration introSkipMode(SegmentSkipMode introSkipMode) {
    this.introSkipMode = introSkipMode;
    return this;
  }

   /**
   * Get introSkipMode
   * @return introSkipMode
  **/
  @Schema(description = "")
  public SegmentSkipMode getIntroSkipMode() {
    return introSkipMode;
  }

  public void setIntroSkipMode(SegmentSkipMode introSkipMode) {
    this.introSkipMode = introSkipMode;
  }

  public UserConfiguration enableLocalPassword(Boolean enableLocalPassword) {
    this.enableLocalPassword = enableLocalPassword;
    return this;
  }

   /**
   * Get enableLocalPassword
   * @return enableLocalPassword
  **/
  @Schema(description = "")
  public Boolean isEnableLocalPassword() {
    return enableLocalPassword;
  }

  public void setEnableLocalPassword(Boolean enableLocalPassword) {
    this.enableLocalPassword = enableLocalPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserConfiguration userConfiguration = (UserConfiguration) o;
    return Objects.equals(this.audioLanguagePreference, userConfiguration.audioLanguagePreference) &&
        Objects.equals(this.playDefaultAudioTrack, userConfiguration.playDefaultAudioTrack) &&
        Objects.equals(this.subtitleLanguagePreference, userConfiguration.subtitleLanguagePreference) &&
        Objects.equals(this.profilePin, userConfiguration.profilePin) &&
        Objects.equals(this.displayMissingEpisodes, userConfiguration.displayMissingEpisodes) &&
        Objects.equals(this.subtitleMode, userConfiguration.subtitleMode) &&
        Objects.equals(this.orderedViews, userConfiguration.orderedViews) &&
        Objects.equals(this.latestItemsExcludes, userConfiguration.latestItemsExcludes) &&
        Objects.equals(this.myMediaExcludes, userConfiguration.myMediaExcludes) &&
        Objects.equals(this.hidePlayedInLatest, userConfiguration.hidePlayedInLatest) &&
        Objects.equals(this.hidePlayedInMoreLikeThis, userConfiguration.hidePlayedInMoreLikeThis) &&
        Objects.equals(this.hidePlayedInSuggestions, userConfiguration.hidePlayedInSuggestions) &&
        Objects.equals(this.rememberAudioSelections, userConfiguration.rememberAudioSelections) &&
        Objects.equals(this.rememberSubtitleSelections, userConfiguration.rememberSubtitleSelections) &&
        Objects.equals(this.enableNextEpisodeAutoPlay, userConfiguration.enableNextEpisodeAutoPlay) &&
        Objects.equals(this.resumeRewindSeconds, userConfiguration.resumeRewindSeconds) &&
        Objects.equals(this.introSkipMode, userConfiguration.introSkipMode) &&
        Objects.equals(this.enableLocalPassword, userConfiguration.enableLocalPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioLanguagePreference, playDefaultAudioTrack, subtitleLanguagePreference, profilePin, displayMissingEpisodes, subtitleMode, orderedViews, latestItemsExcludes, myMediaExcludes, hidePlayedInLatest, hidePlayedInMoreLikeThis, hidePlayedInSuggestions, rememberAudioSelections, rememberSubtitleSelections, enableNextEpisodeAutoPlay, resumeRewindSeconds, introSkipMode, enableLocalPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserConfiguration {\n");
    
    sb.append("    audioLanguagePreference: ").append(toIndentedString(audioLanguagePreference)).append("\n");
    sb.append("    playDefaultAudioTrack: ").append(toIndentedString(playDefaultAudioTrack)).append("\n");
    sb.append("    subtitleLanguagePreference: ").append(toIndentedString(subtitleLanguagePreference)).append("\n");
    sb.append("    profilePin: ").append(toIndentedString(profilePin)).append("\n");
    sb.append("    displayMissingEpisodes: ").append(toIndentedString(displayMissingEpisodes)).append("\n");
    sb.append("    subtitleMode: ").append(toIndentedString(subtitleMode)).append("\n");
    sb.append("    orderedViews: ").append(toIndentedString(orderedViews)).append("\n");
    sb.append("    latestItemsExcludes: ").append(toIndentedString(latestItemsExcludes)).append("\n");
    sb.append("    myMediaExcludes: ").append(toIndentedString(myMediaExcludes)).append("\n");
    sb.append("    hidePlayedInLatest: ").append(toIndentedString(hidePlayedInLatest)).append("\n");
    sb.append("    hidePlayedInMoreLikeThis: ").append(toIndentedString(hidePlayedInMoreLikeThis)).append("\n");
    sb.append("    hidePlayedInSuggestions: ").append(toIndentedString(hidePlayedInSuggestions)).append("\n");
    sb.append("    rememberAudioSelections: ").append(toIndentedString(rememberAudioSelections)).append("\n");
    sb.append("    rememberSubtitleSelections: ").append(toIndentedString(rememberSubtitleSelections)).append("\n");
    sb.append("    enableNextEpisodeAutoPlay: ").append(toIndentedString(enableNextEpisodeAutoPlay)).append("\n");
    sb.append("    resumeRewindSeconds: ").append(toIndentedString(resumeRewindSeconds)).append("\n");
    sb.append("    introSkipMode: ").append(toIndentedString(introSkipMode)).append("\n");
    sb.append("    enableLocalPassword: ").append(toIndentedString(enableLocalPassword)).append("\n");
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
