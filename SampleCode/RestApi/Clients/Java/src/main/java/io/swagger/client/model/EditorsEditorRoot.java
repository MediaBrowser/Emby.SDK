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
import io.swagger.client.model.ActionsPostbackAction;
import io.swagger.client.model.CommonEditorTypes;
import io.swagger.client.model.ConditionsPropertyCondition;
import io.swagger.client.model.EditorsEditorBase;
import io.swagger.client.model.EditorsEditorButtonItem;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EditorsEditorRoot
 */


public class EditorsEditorRoot {
  @SerializedName("PropertyConditions")
  private List<ConditionsPropertyCondition> propertyConditions = null;

  @SerializedName("PostbackActions")
  private List<ActionsPostbackAction> postbackActions = null;

  @SerializedName("TitleButton")
  private EditorsEditorButtonItem titleButton = null;

  @SerializedName("EditorItems")
  private List<EditorsEditorBase> editorItems = null;

  @SerializedName("EditorType")
  private CommonEditorTypes editorType = null;

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

  @SerializedName("FeatureRequiresPremiere")
  private Boolean featureRequiresPremiere = null;

  @SerializedName("ParentId")
  private String parentId = null;

  public EditorsEditorRoot propertyConditions(List<ConditionsPropertyCondition> propertyConditions) {
    this.propertyConditions = propertyConditions;
    return this;
  }

  public EditorsEditorRoot addPropertyConditionsItem(ConditionsPropertyCondition propertyConditionsItem) {
    if (this.propertyConditions == null) {
      this.propertyConditions = new ArrayList<ConditionsPropertyCondition>();
    }
    this.propertyConditions.add(propertyConditionsItem);
    return this;
  }

   /**
   * Get propertyConditions
   * @return propertyConditions
  **/
  @Schema(description = "")
  public List<ConditionsPropertyCondition> getPropertyConditions() {
    return propertyConditions;
  }

  public void setPropertyConditions(List<ConditionsPropertyCondition> propertyConditions) {
    this.propertyConditions = propertyConditions;
  }

  public EditorsEditorRoot postbackActions(List<ActionsPostbackAction> postbackActions) {
    this.postbackActions = postbackActions;
    return this;
  }

  public EditorsEditorRoot addPostbackActionsItem(ActionsPostbackAction postbackActionsItem) {
    if (this.postbackActions == null) {
      this.postbackActions = new ArrayList<ActionsPostbackAction>();
    }
    this.postbackActions.add(postbackActionsItem);
    return this;
  }

   /**
   * Get postbackActions
   * @return postbackActions
  **/
  @Schema(description = "")
  public List<ActionsPostbackAction> getPostbackActions() {
    return postbackActions;
  }

  public void setPostbackActions(List<ActionsPostbackAction> postbackActions) {
    this.postbackActions = postbackActions;
  }

  public EditorsEditorRoot titleButton(EditorsEditorButtonItem titleButton) {
    this.titleButton = titleButton;
    return this;
  }

   /**
   * Get titleButton
   * @return titleButton
  **/
  @Schema(description = "")
  public EditorsEditorButtonItem getTitleButton() {
    return titleButton;
  }

  public void setTitleButton(EditorsEditorButtonItem titleButton) {
    this.titleButton = titleButton;
  }

  public EditorsEditorRoot editorItems(List<EditorsEditorBase> editorItems) {
    this.editorItems = editorItems;
    return this;
  }

  public EditorsEditorRoot addEditorItemsItem(EditorsEditorBase editorItemsItem) {
    if (this.editorItems == null) {
      this.editorItems = new ArrayList<EditorsEditorBase>();
    }
    this.editorItems.add(editorItemsItem);
    return this;
  }

   /**
   * Get editorItems
   * @return editorItems
  **/
  @Schema(description = "")
  public List<EditorsEditorBase> getEditorItems() {
    return editorItems;
  }

  public void setEditorItems(List<EditorsEditorBase> editorItems) {
    this.editorItems = editorItems;
  }

  public EditorsEditorRoot editorType(CommonEditorTypes editorType) {
    this.editorType = editorType;
    return this;
  }

   /**
   * Get editorType
   * @return editorType
  **/
  @Schema(description = "")
  public CommonEditorTypes getEditorType() {
    return editorType;
  }

  public void setEditorType(CommonEditorTypes editorType) {
    this.editorType = editorType;
  }

  public EditorsEditorRoot name(String name) {
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

  public EditorsEditorRoot id(String id) {
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

  public EditorsEditorRoot allowEmpty(Boolean allowEmpty) {
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

  public EditorsEditorRoot isReadOnly(Boolean isReadOnly) {
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

  public EditorsEditorRoot isAdvanced(Boolean isAdvanced) {
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

  public EditorsEditorRoot displayName(String displayName) {
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

  public EditorsEditorRoot description(String description) {
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

  public EditorsEditorRoot featureRequiresPremiere(Boolean featureRequiresPremiere) {
    this.featureRequiresPremiere = featureRequiresPremiere;
    return this;
  }

   /**
   * Get featureRequiresPremiere
   * @return featureRequiresPremiere
  **/
  @Schema(description = "")
  public Boolean isFeatureRequiresPremiere() {
    return featureRequiresPremiere;
  }

  public void setFeatureRequiresPremiere(Boolean featureRequiresPremiere) {
    this.featureRequiresPremiere = featureRequiresPremiere;
  }

  public EditorsEditorRoot parentId(String parentId) {
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
    EditorsEditorRoot editorsEditorRoot = (EditorsEditorRoot) o;
    return Objects.equals(this.propertyConditions, editorsEditorRoot.propertyConditions) &&
        Objects.equals(this.postbackActions, editorsEditorRoot.postbackActions) &&
        Objects.equals(this.titleButton, editorsEditorRoot.titleButton) &&
        Objects.equals(this.editorItems, editorsEditorRoot.editorItems) &&
        Objects.equals(this.editorType, editorsEditorRoot.editorType) &&
        Objects.equals(this.name, editorsEditorRoot.name) &&
        Objects.equals(this.id, editorsEditorRoot.id) &&
        Objects.equals(this.allowEmpty, editorsEditorRoot.allowEmpty) &&
        Objects.equals(this.isReadOnly, editorsEditorRoot.isReadOnly) &&
        Objects.equals(this.isAdvanced, editorsEditorRoot.isAdvanced) &&
        Objects.equals(this.displayName, editorsEditorRoot.displayName) &&
        Objects.equals(this.description, editorsEditorRoot.description) &&
        Objects.equals(this.featureRequiresPremiere, editorsEditorRoot.featureRequiresPremiere) &&
        Objects.equals(this.parentId, editorsEditorRoot.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyConditions, postbackActions, titleButton, editorItems, editorType, name, id, allowEmpty, isReadOnly, isAdvanced, displayName, description, featureRequiresPremiere, parentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditorsEditorRoot {\n");
    
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
    sb.append("    featureRequiresPremiere: ").append(toIndentedString(featureRequiresPremiere)).append("\n");
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
