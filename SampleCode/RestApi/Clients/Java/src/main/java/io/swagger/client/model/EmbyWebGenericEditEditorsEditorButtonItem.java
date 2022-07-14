/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
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
 * EmbyWebGenericEditEditorsEditorButtonItem
 */


public class EmbyWebGenericEditEditorsEditorButtonItem {
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

  public EmbyWebGenericEditEditorsEditorButtonItem editorType(EmbyWebGenericEditCommonEditorTypes editorType) {
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

  public EmbyWebGenericEditEditorsEditorButtonItem name(String name) {
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

  public EmbyWebGenericEditEditorsEditorButtonItem id(String id) {
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

  public EmbyWebGenericEditEditorsEditorButtonItem allowEmpty(Boolean allowEmpty) {
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

  public EmbyWebGenericEditEditorsEditorButtonItem isReadOnly(Boolean isReadOnly) {
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

  public EmbyWebGenericEditEditorsEditorButtonItem isAdvanced(Boolean isAdvanced) {
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

  public EmbyWebGenericEditEditorsEditorButtonItem displayName(String displayName) {
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

  public EmbyWebGenericEditEditorsEditorButtonItem description(String description) {
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

  public EmbyWebGenericEditEditorsEditorButtonItem parentId(String parentId) {
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
    EmbyWebGenericEditEditorsEditorButtonItem embyWebGenericEditEditorsEditorButtonItem = (EmbyWebGenericEditEditorsEditorButtonItem) o;
    return Objects.equals(this.editorType, embyWebGenericEditEditorsEditorButtonItem.editorType) &&
        Objects.equals(this.name, embyWebGenericEditEditorsEditorButtonItem.name) &&
        Objects.equals(this.id, embyWebGenericEditEditorsEditorButtonItem.id) &&
        Objects.equals(this.allowEmpty, embyWebGenericEditEditorsEditorButtonItem.allowEmpty) &&
        Objects.equals(this.isReadOnly, embyWebGenericEditEditorsEditorButtonItem.isReadOnly) &&
        Objects.equals(this.isAdvanced, embyWebGenericEditEditorsEditorButtonItem.isAdvanced) &&
        Objects.equals(this.displayName, embyWebGenericEditEditorsEditorButtonItem.displayName) &&
        Objects.equals(this.description, embyWebGenericEditEditorsEditorButtonItem.description) &&
        Objects.equals(this.parentId, embyWebGenericEditEditorsEditorButtonItem.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editorType, name, id, allowEmpty, isReadOnly, isAdvanced, displayName, description, parentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyWebGenericEditEditorsEditorButtonItem {\n");
    
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
