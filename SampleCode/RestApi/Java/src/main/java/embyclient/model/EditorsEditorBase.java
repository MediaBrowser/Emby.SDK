/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import embyclient.model.CommonEditorTypes;
import embyclient.model.EditorsEditorButtonItem;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EditorsEditorBase
 */


public class EditorsEditorBase {
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

  @SerializedName("ExtensionButtons")
  private List<EditorsEditorButtonItem> extensionButtons = null;

  @SerializedName("DescriptionSourceId")
  private String descriptionSourceId = null;

  public EditorsEditorBase editorType(CommonEditorTypes editorType) {
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

  public EditorsEditorBase name(String name) {
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

  public EditorsEditorBase id(String id) {
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

  public EditorsEditorBase allowEmpty(Boolean allowEmpty) {
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

  public EditorsEditorBase isReadOnly(Boolean isReadOnly) {
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

  public EditorsEditorBase isAdvanced(Boolean isAdvanced) {
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

  public EditorsEditorBase displayName(String displayName) {
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

  public EditorsEditorBase description(String description) {
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

  public EditorsEditorBase featureRequiresPremiere(Boolean featureRequiresPremiere) {
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

  public EditorsEditorBase parentId(String parentId) {
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

  public EditorsEditorBase extensionButtons(List<EditorsEditorButtonItem> extensionButtons) {
    this.extensionButtons = extensionButtons;
    return this;
  }

  public EditorsEditorBase addExtensionButtonsItem(EditorsEditorButtonItem extensionButtonsItem) {
    if (this.extensionButtons == null) {
      this.extensionButtons = new ArrayList<>();
    }
    this.extensionButtons.add(extensionButtonsItem);
    return this;
  }

   /**
   * Buttons attached to this editor (via &#x60;[IsButtonFor]&#x60; on a&#x60;Emby.Web.GenericEdit.Elements.ButtonItem&#x60; property naming this editor&#x27;s own property) \\- rendered             inline at the end of this editor&#x27;s own control (e.g. next to a dropdown/select) instead of             as a separate, standalone button/group elsewhere in the form.
   * @return extensionButtons
  **/
  @Schema(description = "Buttons attached to this editor (via `[IsButtonFor]` on a`Emby.Web.GenericEdit.Elements.ButtonItem` property naming this editor's own property) \\- rendered             inline at the end of this editor's own control (e.g. next to a dropdown/select) instead of             as a separate, standalone button/group elsewhere in the form.")
  public List<EditorsEditorButtonItem> getExtensionButtons() {
    return extensionButtons;
  }

  public void setExtensionButtons(List<EditorsEditorButtonItem> extensionButtons) {
    this.extensionButtons = extensionButtons;
  }

  public EditorsEditorBase descriptionSourceId(String descriptionSourceId) {
    this.descriptionSourceId = descriptionSourceId;
    return this;
  }

   /**
   * The id of a string property (attached via &#x60;[IsDescriptionFor]&#x60;            naming this editor&#x27;s own property) whose live value is displayed as this editor&#x27;s             description, refreshed dynamically whenever the value is re\\-pushed \\- in addition to (not             instead of) this editor&#x27;s own static &#x60;Emby.Web.GenericEdit.Editors.EditorBase.Description&#x60;.
   * @return descriptionSourceId
  **/
  @Schema(description = "The id of a string property (attached via `[IsDescriptionFor]`            naming this editor's own property) whose live value is displayed as this editor's             description, refreshed dynamically whenever the value is re\\-pushed \\- in addition to (not             instead of) this editor's own static `Emby.Web.GenericEdit.Editors.EditorBase.Description`.")
  public String getDescriptionSourceId() {
    return descriptionSourceId;
  }

  public void setDescriptionSourceId(String descriptionSourceId) {
    this.descriptionSourceId = descriptionSourceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditorsEditorBase editorsEditorBase = (EditorsEditorBase) o;
    return Objects.equals(this.editorType, editorsEditorBase.editorType) &&
        Objects.equals(this.name, editorsEditorBase.name) &&
        Objects.equals(this.id, editorsEditorBase.id) &&
        Objects.equals(this.allowEmpty, editorsEditorBase.allowEmpty) &&
        Objects.equals(this.isReadOnly, editorsEditorBase.isReadOnly) &&
        Objects.equals(this.isAdvanced, editorsEditorBase.isAdvanced) &&
        Objects.equals(this.displayName, editorsEditorBase.displayName) &&
        Objects.equals(this.description, editorsEditorBase.description) &&
        Objects.equals(this.featureRequiresPremiere, editorsEditorBase.featureRequiresPremiere) &&
        Objects.equals(this.parentId, editorsEditorBase.parentId) &&
        Objects.equals(this.extensionButtons, editorsEditorBase.extensionButtons) &&
        Objects.equals(this.descriptionSourceId, editorsEditorBase.descriptionSourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editorType, name, id, allowEmpty, isReadOnly, isAdvanced, displayName, description, featureRequiresPremiere, parentId, extensionButtons, descriptionSourceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditorsEditorBase {\n");
    
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
    sb.append("    extensionButtons: ").append(toIndentedString(extensionButtons)).append("\n");
    sb.append("    descriptionSourceId: ").append(toIndentedString(descriptionSourceId)).append("\n");
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
