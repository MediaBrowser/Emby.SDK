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
import io.swagger.client.model.CodecProfile;
import io.swagger.client.model.ContainerProfile;
import io.swagger.client.model.DirectPlayProfile;
import io.swagger.client.model.ResponseProfile;
import io.swagger.client.model.SubtitleProfile;
import io.swagger.client.model.TranscodingProfile;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DeviceProfile
 */


public class DeviceProfile {
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
  private List<DirectPlayProfile> directPlayProfiles = null;

  @SerializedName("TranscodingProfiles")
  private List<TranscodingProfile> transcodingProfiles = null;

  @SerializedName("ContainerProfiles")
  private List<ContainerProfile> containerProfiles = null;

  @SerializedName("CodecProfiles")
  private List<CodecProfile> codecProfiles = null;

  @SerializedName("ResponseProfiles")
  private List<ResponseProfile> responseProfiles = null;

  @SerializedName("SubtitleProfiles")
  private List<SubtitleProfile> subtitleProfiles = null;

  public DeviceProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name.
   * @return name
  **/
  @Schema(description = "The name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeviceProfile id(String id) {
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

  public DeviceProfile supportedMediaTypes(String supportedMediaTypes) {
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

  public DeviceProfile maxStreamingBitrate(Long maxStreamingBitrate) {
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

  public DeviceProfile musicStreamingTranscodingBitrate(Integer musicStreamingTranscodingBitrate) {
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

  public DeviceProfile maxStaticMusicBitrate(Integer maxStaticMusicBitrate) {
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

  public DeviceProfile directPlayProfiles(List<DirectPlayProfile> directPlayProfiles) {
    this.directPlayProfiles = directPlayProfiles;
    return this;
  }

  public DeviceProfile addDirectPlayProfilesItem(DirectPlayProfile directPlayProfilesItem) {
    if (this.directPlayProfiles == null) {
      this.directPlayProfiles = new ArrayList<DirectPlayProfile>();
    }
    this.directPlayProfiles.add(directPlayProfilesItem);
    return this;
  }

   /**
   * The direct play profiles.
   * @return directPlayProfiles
  **/
  @Schema(description = "The direct play profiles.")
  public List<DirectPlayProfile> getDirectPlayProfiles() {
    return directPlayProfiles;
  }

  public void setDirectPlayProfiles(List<DirectPlayProfile> directPlayProfiles) {
    this.directPlayProfiles = directPlayProfiles;
  }

  public DeviceProfile transcodingProfiles(List<TranscodingProfile> transcodingProfiles) {
    this.transcodingProfiles = transcodingProfiles;
    return this;
  }

  public DeviceProfile addTranscodingProfilesItem(TranscodingProfile transcodingProfilesItem) {
    if (this.transcodingProfiles == null) {
      this.transcodingProfiles = new ArrayList<TranscodingProfile>();
    }
    this.transcodingProfiles.add(transcodingProfilesItem);
    return this;
  }

   /**
   * The transcoding profiles.
   * @return transcodingProfiles
  **/
  @Schema(description = "The transcoding profiles.")
  public List<TranscodingProfile> getTranscodingProfiles() {
    return transcodingProfiles;
  }

  public void setTranscodingProfiles(List<TranscodingProfile> transcodingProfiles) {
    this.transcodingProfiles = transcodingProfiles;
  }

  public DeviceProfile containerProfiles(List<ContainerProfile> containerProfiles) {
    this.containerProfiles = containerProfiles;
    return this;
  }

  public DeviceProfile addContainerProfilesItem(ContainerProfile containerProfilesItem) {
    if (this.containerProfiles == null) {
      this.containerProfiles = new ArrayList<ContainerProfile>();
    }
    this.containerProfiles.add(containerProfilesItem);
    return this;
  }

   /**
   * Get containerProfiles
   * @return containerProfiles
  **/
  @Schema(description = "")
  public List<ContainerProfile> getContainerProfiles() {
    return containerProfiles;
  }

  public void setContainerProfiles(List<ContainerProfile> containerProfiles) {
    this.containerProfiles = containerProfiles;
  }

  public DeviceProfile codecProfiles(List<CodecProfile> codecProfiles) {
    this.codecProfiles = codecProfiles;
    return this;
  }

  public DeviceProfile addCodecProfilesItem(CodecProfile codecProfilesItem) {
    if (this.codecProfiles == null) {
      this.codecProfiles = new ArrayList<CodecProfile>();
    }
    this.codecProfiles.add(codecProfilesItem);
    return this;
  }

   /**
   * Get codecProfiles
   * @return codecProfiles
  **/
  @Schema(description = "")
  public List<CodecProfile> getCodecProfiles() {
    return codecProfiles;
  }

  public void setCodecProfiles(List<CodecProfile> codecProfiles) {
    this.codecProfiles = codecProfiles;
  }

  public DeviceProfile responseProfiles(List<ResponseProfile> responseProfiles) {
    this.responseProfiles = responseProfiles;
    return this;
  }

  public DeviceProfile addResponseProfilesItem(ResponseProfile responseProfilesItem) {
    if (this.responseProfiles == null) {
      this.responseProfiles = new ArrayList<ResponseProfile>();
    }
    this.responseProfiles.add(responseProfilesItem);
    return this;
  }

   /**
   * Get responseProfiles
   * @return responseProfiles
  **/
  @Schema(description = "")
  public List<ResponseProfile> getResponseProfiles() {
    return responseProfiles;
  }

  public void setResponseProfiles(List<ResponseProfile> responseProfiles) {
    this.responseProfiles = responseProfiles;
  }

  public DeviceProfile subtitleProfiles(List<SubtitleProfile> subtitleProfiles) {
    this.subtitleProfiles = subtitleProfiles;
    return this;
  }

  public DeviceProfile addSubtitleProfilesItem(SubtitleProfile subtitleProfilesItem) {
    if (this.subtitleProfiles == null) {
      this.subtitleProfiles = new ArrayList<SubtitleProfile>();
    }
    this.subtitleProfiles.add(subtitleProfilesItem);
    return this;
  }

   /**
   * Get subtitleProfiles
   * @return subtitleProfiles
  **/
  @Schema(description = "")
  public List<SubtitleProfile> getSubtitleProfiles() {
    return subtitleProfiles;
  }

  public void setSubtitleProfiles(List<SubtitleProfile> subtitleProfiles) {
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
    DeviceProfile deviceProfile = (DeviceProfile) o;
    return Objects.equals(this.name, deviceProfile.name) &&
        Objects.equals(this.id, deviceProfile.id) &&
        Objects.equals(this.supportedMediaTypes, deviceProfile.supportedMediaTypes) &&
        Objects.equals(this.maxStreamingBitrate, deviceProfile.maxStreamingBitrate) &&
        Objects.equals(this.musicStreamingTranscodingBitrate, deviceProfile.musicStreamingTranscodingBitrate) &&
        Objects.equals(this.maxStaticMusicBitrate, deviceProfile.maxStaticMusicBitrate) &&
        Objects.equals(this.directPlayProfiles, deviceProfile.directPlayProfiles) &&
        Objects.equals(this.transcodingProfiles, deviceProfile.transcodingProfiles) &&
        Objects.equals(this.containerProfiles, deviceProfile.containerProfiles) &&
        Objects.equals(this.codecProfiles, deviceProfile.codecProfiles) &&
        Objects.equals(this.responseProfiles, deviceProfile.responseProfiles) &&
        Objects.equals(this.subtitleProfiles, deviceProfile.subtitleProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, supportedMediaTypes, maxStreamingBitrate, musicStreamingTranscodingBitrate, maxStaticMusicBitrate, directPlayProfiles, transcodingProfiles, containerProfiles, codecProfiles, responseProfiles, subtitleProfiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceProfile {\n");
    
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
