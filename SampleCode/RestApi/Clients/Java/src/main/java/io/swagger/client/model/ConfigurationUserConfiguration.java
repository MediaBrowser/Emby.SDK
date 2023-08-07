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
import io.swagger.client.model.ConfigurationSegmentSkipMode;
import io.swagger.client.model.ConfigurationSubtitlePlaybackMode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ConfigurationUserConfiguration
 */


public class ConfigurationUserConfiguration {
  @SerializedName("AudioLanguagePreference")
  private String audioLanguagePreference = null;

  @SerializedName("PlayDefaultAudioTrack")
  private Boolean playDefaultAudioTrack = null;

  @SerializedName("SubtitleLanguagePreference")
  private String subtitleLanguagePreference = null;

  @SerializedName("DisplayMissingEpisodes")
  private Boolean displayMissingEpisodes = null;

  @SerializedName("SubtitleMode")
  private ConfigurationSubtitlePlaybackMode subtitleMode = null;

  @SerializedName("OrderedViews")
  private List<String> orderedViews = null;

  @SerializedName("LatestItemsExcludes")
  private List<String> latestItemsExcludes = null;

  @SerializedName("MyMediaExcludes")
  private List<String> myMediaExcludes = null;

  @SerializedName("HidePlayedInLatest")
  private Boolean hidePlayedInLatest = null;

  @SerializedName("RememberAudioSelections")
  private Boolean rememberAudioSelections = null;

  @SerializedName("RememberSubtitleSelections")
  private Boolean rememberSubtitleSelections = null;

  @SerializedName("EnableNextEpisodeAutoPlay")
  private Boolean enableNextEpisodeAutoPlay = null;

  @SerializedName("ResumeRewindSeconds")
  private Integer resumeRewindSeconds = null;

  @SerializedName("IntroSkipMode")
  private ConfigurationSegmentSkipMode introSkipMode = null;

  @SerializedName("EnableLocalPassword")
  private Boolean enableLocalPassword = null;

  public ConfigurationUserConfiguration audioLanguagePreference(String audioLanguagePreference) {
    this.audioLanguagePreference = audioLanguagePreference;
    return this;
  }

   /**
   * Get audioLanguagePreference
   * @return audioLanguagePreference
  **/
  @Schema(description = "")
  public String getAudioLanguagePreference() {
    return audioLanguagePreference;
  }

  public void setAudioLanguagePreference(String audioLanguagePreference) {
    this.audioLanguagePreference = audioLanguagePreference;
  }

  public ConfigurationUserConfiguration playDefaultAudioTrack(Boolean playDefaultAudioTrack) {
    this.playDefaultAudioTrack = playDefaultAudioTrack;
    return this;
  }

   /**
   * Get playDefaultAudioTrack
   * @return playDefaultAudioTrack
  **/
  @Schema(description = "")
  public Boolean isPlayDefaultAudioTrack() {
    return playDefaultAudioTrack;
  }

  public void setPlayDefaultAudioTrack(Boolean playDefaultAudioTrack) {
    this.playDefaultAudioTrack = playDefaultAudioTrack;
  }

  public ConfigurationUserConfiguration subtitleLanguagePreference(String subtitleLanguagePreference) {
    this.subtitleLanguagePreference = subtitleLanguagePreference;
    return this;
  }

   /**
   * Get subtitleLanguagePreference
   * @return subtitleLanguagePreference
  **/
  @Schema(description = "")
  public String getSubtitleLanguagePreference() {
    return subtitleLanguagePreference;
  }

  public void setSubtitleLanguagePreference(String subtitleLanguagePreference) {
    this.subtitleLanguagePreference = subtitleLanguagePreference;
  }

  public ConfigurationUserConfiguration displayMissingEpisodes(Boolean displayMissingEpisodes) {
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

  public ConfigurationUserConfiguration subtitleMode(ConfigurationSubtitlePlaybackMode subtitleMode) {
    this.subtitleMode = subtitleMode;
    return this;
  }

   /**
   * Get subtitleMode
   * @return subtitleMode
  **/
  @Schema(description = "")
  public ConfigurationSubtitlePlaybackMode getSubtitleMode() {
    return subtitleMode;
  }

  public void setSubtitleMode(ConfigurationSubtitlePlaybackMode subtitleMode) {
    this.subtitleMode = subtitleMode;
  }

  public ConfigurationUserConfiguration orderedViews(List<String> orderedViews) {
    this.orderedViews = orderedViews;
    return this;
  }

  public ConfigurationUserConfiguration addOrderedViewsItem(String orderedViewsItem) {
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

  public ConfigurationUserConfiguration latestItemsExcludes(List<String> latestItemsExcludes) {
    this.latestItemsExcludes = latestItemsExcludes;
    return this;
  }

  public ConfigurationUserConfiguration addLatestItemsExcludesItem(String latestItemsExcludesItem) {
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

  public ConfigurationUserConfiguration myMediaExcludes(List<String> myMediaExcludes) {
    this.myMediaExcludes = myMediaExcludes;
    return this;
  }

  public ConfigurationUserConfiguration addMyMediaExcludesItem(String myMediaExcludesItem) {
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

  public ConfigurationUserConfiguration hidePlayedInLatest(Boolean hidePlayedInLatest) {
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

  public ConfigurationUserConfiguration rememberAudioSelections(Boolean rememberAudioSelections) {
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

  public ConfigurationUserConfiguration rememberSubtitleSelections(Boolean rememberSubtitleSelections) {
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

  public ConfigurationUserConfiguration enableNextEpisodeAutoPlay(Boolean enableNextEpisodeAutoPlay) {
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

  public ConfigurationUserConfiguration resumeRewindSeconds(Integer resumeRewindSeconds) {
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

  public ConfigurationUserConfiguration introSkipMode(ConfigurationSegmentSkipMode introSkipMode) {
    this.introSkipMode = introSkipMode;
    return this;
  }

   /**
   * Get introSkipMode
   * @return introSkipMode
  **/
  @Schema(description = "")
  public ConfigurationSegmentSkipMode getIntroSkipMode() {
    return introSkipMode;
  }

  public void setIntroSkipMode(ConfigurationSegmentSkipMode introSkipMode) {
    this.introSkipMode = introSkipMode;
  }

  public ConfigurationUserConfiguration enableLocalPassword(Boolean enableLocalPassword) {
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
    ConfigurationUserConfiguration configurationUserConfiguration = (ConfigurationUserConfiguration) o;
    return Objects.equals(this.audioLanguagePreference, configurationUserConfiguration.audioLanguagePreference) &&
        Objects.equals(this.playDefaultAudioTrack, configurationUserConfiguration.playDefaultAudioTrack) &&
        Objects.equals(this.subtitleLanguagePreference, configurationUserConfiguration.subtitleLanguagePreference) &&
        Objects.equals(this.displayMissingEpisodes, configurationUserConfiguration.displayMissingEpisodes) &&
        Objects.equals(this.subtitleMode, configurationUserConfiguration.subtitleMode) &&
        Objects.equals(this.orderedViews, configurationUserConfiguration.orderedViews) &&
        Objects.equals(this.latestItemsExcludes, configurationUserConfiguration.latestItemsExcludes) &&
        Objects.equals(this.myMediaExcludes, configurationUserConfiguration.myMediaExcludes) &&
        Objects.equals(this.hidePlayedInLatest, configurationUserConfiguration.hidePlayedInLatest) &&
        Objects.equals(this.rememberAudioSelections, configurationUserConfiguration.rememberAudioSelections) &&
        Objects.equals(this.rememberSubtitleSelections, configurationUserConfiguration.rememberSubtitleSelections) &&
        Objects.equals(this.enableNextEpisodeAutoPlay, configurationUserConfiguration.enableNextEpisodeAutoPlay) &&
        Objects.equals(this.resumeRewindSeconds, configurationUserConfiguration.resumeRewindSeconds) &&
        Objects.equals(this.introSkipMode, configurationUserConfiguration.introSkipMode) &&
        Objects.equals(this.enableLocalPassword, configurationUserConfiguration.enableLocalPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioLanguagePreference, playDefaultAudioTrack, subtitleLanguagePreference, displayMissingEpisodes, subtitleMode, orderedViews, latestItemsExcludes, myMediaExcludes, hidePlayedInLatest, rememberAudioSelections, rememberSubtitleSelections, enableNextEpisodeAutoPlay, resumeRewindSeconds, introSkipMode, enableLocalPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationUserConfiguration {\n");
    
    sb.append("    audioLanguagePreference: ").append(toIndentedString(audioLanguagePreference)).append("\n");
    sb.append("    playDefaultAudioTrack: ").append(toIndentedString(playDefaultAudioTrack)).append("\n");
    sb.append("    subtitleLanguagePreference: ").append(toIndentedString(subtitleLanguagePreference)).append("\n");
    sb.append("    displayMissingEpisodes: ").append(toIndentedString(displayMissingEpisodes)).append("\n");
    sb.append("    subtitleMode: ").append(toIndentedString(subtitleMode)).append("\n");
    sb.append("    orderedViews: ").append(toIndentedString(orderedViews)).append("\n");
    sb.append("    latestItemsExcludes: ").append(toIndentedString(latestItemsExcludes)).append("\n");
    sb.append("    myMediaExcludes: ").append(toIndentedString(myMediaExcludes)).append("\n");
    sb.append("    hidePlayedInLatest: ").append(toIndentedString(hidePlayedInLatest)).append("\n");
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
