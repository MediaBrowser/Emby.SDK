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
import io.swagger.client.model.EmbyWebGenericEditCommonEditorTypes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EmbyWebGenericEditEditorsEditorBase
 */


public class EmbyWebGenericEditEditorsEditorBase {
  @SerializedName("EditorType")
  private EmbyWebGenericEditCommonEditorTypes editorType = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("AllowEmpty")
  private Boolean allowEmpty = null;

  @SerializedName("IsReadOnly")
  private Boolean isReadOnly = null;

  @SerializedName("IsAdvanced")
  private Boolean isAdvanced = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ParentId")
  private String parentId = null;

  public EmbyWebGenericEditEditorsEditorBase editorType(EmbyWebGenericEditCommonEditorTypes editorType) {
    this.editorType = editorType;
    return this;
  }

   /**
   * Get editorType
   * @return editorType
  **/
  @Schema(description = "")
  public EmbyWebGenericEditCommonEditorTypes getEditorType() {
    return editorType;
  }

  public void setEditorType(EmbyWebGenericEditCommonEditorTypes editorType) {
    this.editorType = editorType;
  }

  public EmbyWebGenericEditEditorsEditorBase name(String name) {
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

  public EmbyWebGenericEditEditorsEditorBase id(String id) {
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

  public EmbyWebGenericEditEditorsEditorBase allowEmpty(Boolean allowEmpty) {
    this.allowEmpty = allowEmpty;
    return this;
  }

   /**
   * Get allowEmpty
   * @return allowEmpty
  **/
  @Schema(description = "")
  public Boolean isAllowEmpty() {
    return allowEmpty;
  }

  public void setAllowEmpty(Boolean allowEmpty) {
    this.allowEmpty = allowEmpty;
  }

  public EmbyWebGenericEditEditorsEditorBase isReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
    return this;
  }

   /**
   * Get isReadOnly
   * @return isReadOnly
  **/
  @Schema(description = "")
  public Boolean isIsReadOnly() {
    return isReadOnly;
  }

  public void setIsReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
  }

  public EmbyWebGenericEditEditorsEditorBase isAdvanced(Boolean isAdvanced) {
    this.isAdvanced = isAdvanced;
    return this;
  }

   /**
   * Get isAdvanced
   * @return isAdvanced
  **/
  @Schema(description = "")
  public Boolean isIsAdvanced() {
    return isAdvanced;
  }

  public void setIsAdvanced(Boolean isAdvanced) {
    this.isAdvanced = isAdvanced;
  }

  public EmbyWebGenericEditEditorsEditorBase displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public EmbyWebGenericEditEditorsEditorBase description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EmbyWebGenericEditEditorsEditorBase parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @Schema(description = "")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbyWebGenericEditEditorsEditorBase embyWebGenericEditEditorsEditorBase = (EmbyWebGenericEditEditorsEditorBase) o;
    return Objects.equals(this.editorType, embyWebGenericEditEditorsEditorBase.editorType) &&
        Objects.equals(this.name, embyWebGenericEditEditorsEditorBase.name) &&
        Objects.equals(this.id, embyWebGenericEditEditorsEditorBase.id) &&
        Objects.equals(this.allowEmpty, embyWebGenericEditEditorsEditorBase.allowEmpty) &&
        Objects.equals(this.isReadOnly, embyWebGenericEditEditorsEditorBase.isReadOnly) &&
        Objects.equals(this.isAdvanced, embyWebGenericEditEditorsEditorBase.isAdvanced) &&
        Objects.equals(this.displayName, embyWebGenericEditEditorsEditorBase.displayName) &&
        Objects.equals(this.description, embyWebGenericEditEditorsEditorBase.description) &&
        Objects.equals(this.parentId, embyWebGenericEditEditorsEditorBase.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editorType, name, id, allowEmpty, isReadOnly, isAdvanced, displayName, description, parentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyWebGenericEditEditorsEditorBase {\n");
    
    sb.append("    editorType: ").append(toIndentedString(editorType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    allowEmpty: ").append(toIndentedString(allowEmpty)).append("\n");
    sb.append("    isReadOnly: ").append(toIndentedString(isReadOnly)).append("\n");
    sb.append("    isAdvanced: ").append(toIndentedString(isAdvanced)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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
