/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.6
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.DlnaCodecProfile;
import io.swagger.client.model.DlnaContainerProfile;
import io.swagger.client.model.DlnaDirectPlayProfile;
import io.swagger.client.model.DlnaResponseProfile;
import io.swagger.client.model.DlnaSubtitleProfile;
import io.swagger.client.model.DlnaTranscodingProfile;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DlnaDeviceProfile
 */


public class DlnaDeviceProfile {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("SupportedMediaTypes")
  private String supportedMediaTypes = null;

  @SerializedName("MaxStreamingBitrate")
  private Long maxStreamingBitrate = null;

  @SerializedName("MusicStreamingTranscodingBitrate")
  private Integer musicStreamingTranscodingBitrate = null;

  @SerializedName("MaxStaticMusicBitrate")
  private Integer maxStaticMusicBitrate = null;

  @SerializedName("DirectPlayProfiles")
  private List<DlnaDirectPlayProfile> directPlayProfiles = null;

  @SerializedName("TranscodingProfiles")
  private List<DlnaTranscodingProfile> transcodingProfiles = null;

  @SerializedName("ContainerProfiles")
  private List<DlnaContainerProfile> containerProfiles = null;

  @SerializedName("CodecProfiles")
  private List<DlnaCodecProfile> codecProfiles = null;

  @SerializedName("ResponseProfiles")
  private List<DlnaResponseProfile> responseProfiles = null;

  @SerializedName("SubtitleProfiles")
  private List<DlnaSubtitleProfile> subtitleProfiles = null;

  public DlnaDeviceProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DlnaDeviceProfile id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DlnaDeviceProfile supportedMediaTypes(String supportedMediaTypes) {
    this.supportedMediaTypes = supportedMediaTypes;
    return this;
  }

   /**
   * Get supportedMediaTypes
   * @return supportedMediaTypes
  **/
  @Schema(description = "")
  public String getSupportedMediaTypes() {
    return supportedMediaTypes;
  }

  public void setSupportedMediaTypes(String supportedMediaTypes) {
    this.supportedMediaTypes = supportedMediaTypes;
  }

  public DlnaDeviceProfile maxStreamingBitrate(Long maxStreamingBitrate) {
    this.maxStreamingBitrate = maxStreamingBitrate;
    return this;
  }

   /**
   * Get maxStreamingBitrate
   * @return maxStreamingBitrate
  **/
  @Schema(description = "")
  public Long getMaxStreamingBitrate() {
    return maxStreamingBitrate;
  }

  public void setMaxStreamingBitrate(Long maxStreamingBitrate) {
    this.maxStreamingBitrate = maxStreamingBitrate;
  }

  public DlnaDeviceProfile musicStreamingTranscodingBitrate(Integer musicStreamingTranscodingBitrate) {
    this.musicStreamingTranscodingBitrate = musicStreamingTranscodingBitrate;
    return this;
  }

   /**
   * Get musicStreamingTranscodingBitrate
   * @return musicStreamingTranscodingBitrate
  **/
  @Schema(description = "")
  public Integer getMusicStreamingTranscodingBitrate() {
    return musicStreamingTranscodingBitrate;
  }

  public void setMusicStreamingTranscodingBitrate(Integer musicStreamingTranscodingBitrate) {
    this.musicStreamingTranscodingBitrate = musicStreamingTranscodingBitrate;
  }

  public DlnaDeviceProfile maxStaticMusicBitrate(Integer maxStaticMusicBitrate) {
    this.maxStaticMusicBitrate = maxStaticMusicBitrate;
    return this;
  }

   /**
   * Get maxStaticMusicBitrate
   * @return maxStaticMusicBitrate
  **/
  @Schema(description = "")
  public Integer getMaxStaticMusicBitrate() {
    return maxStaticMusicBitrate;
  }

  public void setMaxStaticMusicBitrate(Integer maxStaticMusicBitrate) {
    this.maxStaticMusicBitrate = maxStaticMusicBitrate;
  }

  public DlnaDeviceProfile directPlayProfiles(List<DlnaDirectPlayProfile> directPlayProfiles) {
    this.directPlayProfiles = directPlayProfiles;
    return this;
  }

  public DlnaDeviceProfile addDirectPlayProfilesItem(DlnaDirectPlayProfile directPlayProfilesItem) {
    if (this.directPlayProfiles == null) {
      this.directPlayProfiles = new ArrayList<DlnaDirectPlayProfile>();
    }
    this.directPlayProfiles.add(directPlayProfilesItem);
    return this;
  }

   /**
   * Get directPlayProfiles
   * @return directPlayProfiles
  **/
  @Schema(description = "")
  public List<DlnaDirectPlayProfile> getDirectPlayProfiles() {
    return directPlayProfiles;
  }

  public void setDirectPlayProfiles(List<DlnaDirectPlayProfile> directPlayProfiles) {
    this.directPlayProfiles = directPlayProfiles;
  }

  public DlnaDeviceProfile transcodingProfiles(List<DlnaTranscodingProfile> transcodingProfiles) {
    this.transcodingProfiles = transcodingProfiles;
    return this;
  }

  public DlnaDeviceProfile addTranscodingProfilesItem(DlnaTranscodingProfile transcodingProfilesItem) {
    if (this.transcodingProfiles == null) {
      this.transcodingProfiles = new ArrayList<DlnaTranscodingProfile>();
    }
    this.transcodingProfiles.add(transcodingProfilesItem);
    return this;
  }

   /**
   * Get transcodingProfiles
   * @return transcodingProfiles
  **/
  @Schema(description = "")
  public List<DlnaTranscodingProfile> getTranscodingProfiles() {
    return transcodingProfiles;
  }

  public void setTranscodingProfiles(List<DlnaTranscodingProfile> transcodingProfiles) {
    this.transcodingProfiles = transcodingProfiles;
  }

  public DlnaDeviceProfile containerProfiles(List<DlnaContainerProfile> containerProfiles) {
    this.containerProfiles = containerProfiles;
    return this;
  }

  public DlnaDeviceProfile addContainerProfilesItem(DlnaContainerProfile containerProfilesItem) {
    if (this.containerProfiles == null) {
      this.containerProfiles = new ArrayList<DlnaContainerProfile>();
    }
    this.containerProfiles.add(containerProfilesItem);
    return this;
  }

   /**
   * Get containerProfiles
   * @return containerProfiles
  **/
  @Schema(description = "")
  public List<DlnaContainerProfile> getContainerProfiles() {
    return containerProfiles;
  }

  public void setContainerProfiles(List<DlnaContainerProfile> containerProfiles) {
    this.containerProfiles = containerProfiles;
  }

  public DlnaDeviceProfile codecProfiles(List<DlnaCodecProfile> codecProfiles) {
    this.codecProfiles = codecProfiles;
    return this;
  }

  public DlnaDeviceProfile addCodecProfilesItem(DlnaCodecProfile codecProfilesItem) {
    if (this.codecProfiles == null) {
      this.codecProfiles = new ArrayList<DlnaCodecProfile>();
    }
    this.codecProfiles.add(codecProfilesItem);
    return this;
  }

   /**
   * Get codecProfiles
   * @return codecProfiles
  **/
  @Schema(description = "")
  public List<DlnaCodecProfile> getCodecProfiles() {
    return codecProfiles;
  }

  public void setCodecProfiles(List<DlnaCodecProfile> codecProfiles) {
    this.codecProfiles = codecProfiles;
  }

  public DlnaDeviceProfile responseProfiles(List<DlnaResponseProfile> responseProfiles) {
    this.responseProfiles = responseProfiles;
    return this;
  }

  public DlnaDeviceProfile addResponseProfilesItem(DlnaResponseProfile responseProfilesItem) {
    if (this.responseProfiles == null) {
      this.responseProfiles = new ArrayList<DlnaResponseProfile>();
    }
    this.responseProfiles.add(responseProfilesItem);
    return this;
  }

   /**
   * Get responseProfiles
   * @return responseProfiles
  **/
  @Schema(description = "")
  public List<DlnaResponseProfile> getResponseProfiles() {
    return responseProfiles;
  }

  public void setResponseProfiles(List<DlnaResponseProfile> responseProfiles) {
    this.responseProfiles = responseProfiles;
  }

  public DlnaDeviceProfile subtitleProfiles(List<DlnaSubtitleProfile> subtitleProfiles) {
    this.subtitleProfiles = subtitleProfiles;
    return this;
  }

  public DlnaDeviceProfile addSubtitleProfilesItem(DlnaSubtitleProfile subtitleProfilesItem) {
    if (this.subtitleProfiles == null) {
      this.subtitleProfiles = new ArrayList<DlnaSubtitleProfile>();
    }
    this.subtitleProfiles.add(subtitleProfilesItem);
    return this;
  }

   /**
   * Get subtitleProfiles
   * @return subtitleProfiles
  **/
  @Schema(description = "")
  public List<DlnaSubtitleProfile> getSubtitleProfiles() {
    return subtitleProfiles;
  }

  public void setSubtitleProfiles(List<DlnaSubtitleProfile> subtitleProfiles) {
    this.subtitleProfiles = subtitleProfiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DlnaDeviceProfile dlnaDeviceProfile = (DlnaDeviceProfile) o;
    return Objects.equals(this.name, dlnaDeviceProfile.name) &&
        Objects.equals(this.id, dlnaDeviceProfile.id) &&
        Objects.equals(this.supportedMediaTypes, dlnaDeviceProfile.supportedMediaTypes) &&
        Objects.equals(this.maxStreamingBitrate, dlnaDeviceProfile.maxStreamingBitrate) &&
        Objects.equals(this.musicStreamingTranscodingBitrate, dlnaDeviceProfile.musicStreamingTranscodingBitrate) &&
        Objects.equals(this.maxStaticMusicBitrate, dlnaDeviceProfile.maxStaticMusicBitrate) &&
        Objects.equals(this.directPlayProfiles, dlnaDeviceProfile.directPlayProfiles) &&
        Objects.equals(this.transcodingProfiles, dlnaDeviceProfile.transcodingProfiles) &&
        Objects.equals(this.containerProfiles, dlnaDeviceProfile.containerProfiles) &&
        Objects.equals(this.codecProfiles, dlnaDeviceProfile.codecProfiles) &&
        Objects.equals(this.responseProfiles, dlnaDeviceProfile.responseProfiles) &&
        Objects.equals(this.subtitleProfiles, dlnaDeviceProfile.subtitleProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, supportedMediaTypes, maxStreamingBitrate, musicStreamingTranscodingBitrate, maxStaticMusicBitrate, directPlayProfiles, transcodingProfiles, containerProfiles, codecProfiles, responseProfiles, subtitleProfiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DlnaDeviceProfile {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    supportedMediaTypes: ").append(toIndentedString(supportedMediaTypes)).append("\n");
    sb.append("    maxStreamingBitrate: ").append(toIndentedString(maxStreamingBitrate)).append("\n");
    sb.append("    musicStreamingTranscodingBitrate: ").append(toIndentedString(musicStreamingTranscodingBitrate)).append("\n");
    sb.append("    maxStaticMusicBitrate: ").append(toIndentedString(maxStaticMusicBitrate)).append("\n");
    sb.append("    directPlayProfiles: ").append(toIndentedString(directPlayProfiles)).append("\n");
    sb.append("    transcodingProfiles: ").append(toIndentedString(transcodingProfiles)).append("\n");
    sb.append("    containerProfiles: ").append(toIndentedString(containerProfiles)).append("\n");
    sb.append("    codecProfiles: ").append(toIndentedString(codecProfiles)).append("\n");
    sb.append("    responseProfiles: ").append(toIndentedString(responseProfiles)).append("\n");
    sb.append("    subtitleProfiles: ").append(toIndentedString(subtitleProfiles)).append("\n");
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
