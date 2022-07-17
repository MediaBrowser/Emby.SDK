/*
 * Emby REST API
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
import io.swagger.client.model.EmbyWebGenericEditActionsPostbackAction;
import io.swagger.client.model.EmbyWebGenericEditCommonEditorTypes;
import io.swagger.client.model.EmbyWebGenericEditConditionsPropertyCondition;
import io.swagger.client.model.EmbyWebGenericEditEditorsEditorBase;
import io.swagger.client.model.EmbyWebGenericEditEditorsEditorButtonItem;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EmbyWebGenericEditEditorsEditorRoot
 */


public class EmbyWebGenericEditEditorsEditorRoot {
  @SerializedName("PropertyConditions")
  private List<EmbyWebGenericEditConditionsPropertyCondition> propertyConditions = null;

  @SerializedName("PostbackActions")
  private List<EmbyWebGenericEditActionsPostbackAction> postbackActions = null;

  @SerializedName("TitleButton")
  private EmbyWebGenericEditEditorsEditorButtonItem titleButton = null;

  @SerializedName("EditorItems")
  private List<EmbyWebGenericEditEditorsEditorBase> editorItems = null;

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

  public EmbyWebGenericEditEditorsEditorRoot propertyConditions(List<EmbyWebGenericEditConditionsPropertyCondition> propertyConditions) {
    this.propertyConditions = propertyConditions;
    return this;
  }

  public EmbyWebGenericEditEditorsEditorRoot addPropertyConditionsItem(EmbyWebGenericEditConditionsPropertyCondition propertyConditionsItem) {
    if (this.propertyConditions == null) {
      this.propertyConditions = new ArrayList<EmbyWebGenericEditConditionsPropertyCondition>();
    }
    this.propertyConditions.add(propertyConditionsItem);
    return this;
  }

   /**
   * Get propertyConditions
   * @return propertyConditions
  **/
  @Schema(description = "")
  public List<EmbyWebGenericEditConditionsPropertyCondition> getPropertyConditions() {
    return propertyConditions;
  }

  public void setPropertyConditions(List<EmbyWebGenericEditConditionsPropertyCondition> propertyConditions) {
    this.propertyConditions = propertyConditions;
  }

  public EmbyWebGenericEditEditorsEditorRoot postbackActions(List<EmbyWebGenericEditActionsPostbackAction> postbackActions) {
    this.postbackActions = postbackActions;
    return this;
  }

  public EmbyWebGenericEditEditorsEditorRoot addPostbackActionsItem(EmbyWebGenericEditActionsPostbackAction postbackActionsItem) {
    if (this.postbackActions == null) {
      this.postbackActions = new ArrayList<EmbyWebGenericEditActionsPostbackAction>();
    }
    this.postbackActions.add(postbackActionsItem);
    return this;
  }

   /**
   * Get postbackActions
   * @return postbackActions
  **/
  @Schema(description = "")
  public List<EmbyWebGenericEditActionsPostbackAction> getPostbackActions() {
    return postbackActions;
  }

  public void setPostbackActions(List<EmbyWebGenericEditActionsPostbackAction> postbackActions) {
    this.postbackActions = postbackActions;
  }

  public EmbyWebGenericEditEditorsEditorRoot titleButton(EmbyWebGenericEditEditorsEditorButtonItem titleButton) {
    this.titleButton = titleButton;
    return this;
  }

   /**
   * Get titleButton
   * @return titleButton
  **/
  @Schema(description = "")
  public EmbyWebGenericEditEditorsEditorButtonItem getTitleButton() {
    return titleButton;
  }

  public void setTitleButton(EmbyWebGenericEditEditorsEditorButtonItem titleButton) {
    this.titleButton = titleButton;
  }

  public EmbyWebGenericEditEditorsEditorRoot editorItems(List<EmbyWebGenericEditEditorsEditorBase> editorItems) {
    this.editorItems = editorItems;
    return this;
  }

  public EmbyWebGenericEditEditorsEditorRoot addEditorItemsItem(EmbyWebGenericEditEditorsEditorBase editorItemsItem) {
    if (this.editorItems == null) {
      this.editorItems = new ArrayList<EmbyWebGenericEditEditorsEditorBase>();
    }
    this.editorItems.add(editorItemsItem);
    return this;
  }

   /**
   * Get editorItems
   * @return editorItems
  **/
  @Schema(description = "")
  public List<EmbyWebGenericEditEditorsEditorBase> getEditorItems() {
    return editorItems;
  }

  public void setEditorItems(List<EmbyWebGenericEditEditorsEditorBase> editorItems) {
    this.editorItems = editorItems;
  }

  public EmbyWebGenericEditEditorsEditorRoot editorType(EmbyWebGenericEditCommonEditorTypes editorType) {
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

  public EmbyWebGenericEditEditorsEditorRoot name(String name) {
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

  public EmbyWebGenericEditEditorsEditorRoot id(String id) {
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

  public EmbyWebGenericEditEditorsEditorRoot allowEmpty(Boolean allowEmpty) {
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

  public EmbyWebGenericEditEditorsEditorRoot isReadOnly(Boolean isReadOnly) {
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

  public EmbyWebGenericEditEditorsEditorRoot isAdvanced(Boolean isAdvanced) {
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

  public EmbyWebGenericEditEditorsEditorRoot displayName(String displayName) {
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

  public EmbyWebGenericEditEditorsEditorRoot description(String description) {
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

  public EmbyWebGenericEditEditorsEditorRoot parentId(String parentId) {
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
    EmbyWebGenericEditEditorsEditorRoot embyWebGenericEditEditorsEditorRoot = (EmbyWebGenericEditEditorsEditorRoot) o;
    return Objects.equals(this.propertyConditions, embyWebGenericEditEditorsEditorRoot.propertyConditions) &&
        Objects.equals(this.postbackActions, embyWebGenericEditEditorsEditorRoot.postbackActions) &&
        Objects.equals(this.titleButton, embyWebGenericEditEditorsEditorRoot.titleButton) &&
        Objects.equals(this.editorItems, embyWebGenericEditEditorsEditorRoot.editorItems) &&
        Objects.equals(this.editorType, embyWebGenericEditEditorsEditorRoot.editorType) &&
        Objects.equals(this.name, embyWebGenericEditEditorsEditorRoot.name) &&
        Objects.equals(this.id, embyWebGenericEditEditorsEditorRoot.id) &&
        Objects.equals(this.allowEmpty, embyWebGenericEditEditorsEditorRoot.allowEmpty) &&
        Objects.equals(this.isReadOnly, embyWebGenericEditEditorsEditorRoot.isReadOnly) &&
        Objects.equals(this.isAdvanced, embyWebGenericEditEditorsEditorRoot.isAdvanced) &&
        Objects.equals(this.displayName, embyWebGenericEditEditorsEditorRoot.displayName) &&
        Objects.equals(this.description, embyWebGenericEditEditorsEditorRoot.description) &&
        Objects.equals(this.parentId, embyWebGenericEditEditorsEditorRoot.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyConditions, postbackActions, titleButton, editorItems, editorType, name, id, allowEmpty, isReadOnly, isAdvanced, displayName, description, parentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbyWebGenericEditEditorsEditorRoot {\n");
    
    sb.append("    propertyConditions: ").append(toIndentedString(propertyConditions)).append("\n");
    sb.append("    postbackActions: ").append(toIndentedString(postbackActions)).append("\n");
    sb.append("    titleButton: ").append(toIndentedString(titleButton)).append("\n");
    sb.append("    editorItems: ").append(toIndentedString(editorItems)).append("\n");
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
