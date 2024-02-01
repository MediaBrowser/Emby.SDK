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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Version
 */


public class Version {
  @SerializedName("Major")
  private Integer major = null;

  @SerializedName("Minor")
  private Integer minor = null;

  @SerializedName("Build")
  private Integer build = null;

  @SerializedName("Revision")
  private Integer revision = null;

  @SerializedName("MajorRevision")
  private Integer majorRevision = null;

  @SerializedName("MinorRevision")
  private Integer minorRevision = null;

  public Version major(Integer major) {
    this.major = major;
    return this;
  }

   /**
   * Get major
   * @return major
  **/
  @Schema(description = "")
  public Integer getMajor() {
    return major;
  }

  public void setMajor(Integer major) {
    this.major = major;
  }

  public Version minor(Integer minor) {
    this.minor = minor;
    return this;
  }

   /**
   * Get minor
   * @return minor
  **/
  @Schema(description = "")
  public Integer getMinor() {
    return minor;
  }

  public void setMinor(Integer minor) {
    this.minor = minor;
  }

  public Version build(Integer build) {
    this.build = build;
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @Schema(description = "")
  public Integer getBuild() {
    return build;
  }

  public void setBuild(Integer build) {
    this.build = build;
  }

  public Version revision(Integer revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * @return revision
  **/
  @Schema(description = "")
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  public Version majorRevision(Integer majorRevision) {
    this.majorRevision = majorRevision;
    return this;
  }

   /**
   * Get majorRevision
   * @return majorRevision
  **/
  @Schema(description = "")
  public Integer getMajorRevision() {
    return majorRevision;
  }

  public void setMajorRevision(Integer majorRevision) {
    this.majorRevision = majorRevision;
  }

  public Version minorRevision(Integer minorRevision) {
    this.minorRevision = minorRevision;
    return this;
  }

   /**
   * Get minorRevision
   * @return minorRevision
  **/
  @Schema(description = "")
  public Integer getMinorRevision() {
    return minorRevision;
  }

  public void setMinorRevision(Integer minorRevision) {
    this.minorRevision = minorRevision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Version version = (Version) o;
    return Objects.equals(this.major, version.major) &&
        Objects.equals(this.minor, version.minor) &&
        Objects.equals(this.build, version.build) &&
        Objects.equals(this.revision, version.revision) &&
        Objects.equals(this.majorRevision, version.majorRevision) &&
        Objects.equals(this.minorRevision, version.minorRevision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(major, minor, build, revision, majorRevision, minorRevision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    majorRevision: ").append(toIndentedString(majorRevision)).append("\n");
    sb.append("    minorRevision: ").append(toIndentedString(minorRevision)).append("\n");
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
