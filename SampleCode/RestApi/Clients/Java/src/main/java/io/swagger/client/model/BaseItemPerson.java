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
import io.swagger.client.model.PersonType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This is used by the api to get information about a Person within a BaseItem  
 */
@Schema(description = "This is used by the api to get information about a Person within a BaseItem  ")

public class BaseItemPerson {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Role")
  private String role = null;

  @SerializedName("Type")
  private PersonType type = null;

  @SerializedName("PrimaryImageTag")
  private String primaryImageTag = null;

  public BaseItemPerson name(String name) {
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

  public BaseItemPerson id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier.
   * @return id
  **/
  @Schema(description = "The identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BaseItemPerson role(String role) {
    this.role = role;
    return this;
  }

   /**
   * The role.
   * @return role
  **/
  @Schema(description = "The role.")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public BaseItemPerson type(PersonType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public PersonType getType() {
    return type;
  }

  public void setType(PersonType type) {
    this.type = type;
  }

  public BaseItemPerson primaryImageTag(String primaryImageTag) {
    this.primaryImageTag = primaryImageTag;
    return this;
  }

   /**
   * The primary image tag.
   * @return primaryImageTag
  **/
  @Schema(description = "The primary image tag.")
  public String getPrimaryImageTag() {
    return primaryImageTag;
  }

  public void setPrimaryImageTag(String primaryImageTag) {
    this.primaryImageTag = primaryImageTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseItemPerson baseItemPerson = (BaseItemPerson) o;
    return Objects.equals(this.name, baseItemPerson.name) &&
        Objects.equals(this.id, baseItemPerson.id) &&
        Objects.equals(this.role, baseItemPerson.role) &&
        Objects.equals(this.type, baseItemPerson.type) &&
        Objects.equals(this.primaryImageTag, baseItemPerson.primaryImageTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, role, type, primaryImageTag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseItemPerson {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    primaryImageTag: ").append(toIndentedString(primaryImageTag)).append("\n");
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
