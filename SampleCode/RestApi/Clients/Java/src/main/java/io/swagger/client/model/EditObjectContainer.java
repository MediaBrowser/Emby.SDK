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
import io.swagger.client.model.EditorsEditorRoot;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EditObjectContainer
 */


public class EditObjectContainer {
  @SerializedName("Object")
  private Object object = null;

  @SerializedName("DefaultObject")
  private Object defaultObject = null;

  @SerializedName("TypeName")
  private String typeName = null;

  @SerializedName("EditorRoot")
  private EditorsEditorRoot editorRoot = null;

  public EditObjectContainer object(Object object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @Schema(description = "")
  public Object getObject() {
    return object;
  }

  public void setObject(Object object) {
    this.object = object;
  }

  public EditObjectContainer defaultObject(Object defaultObject) {
    this.defaultObject = defaultObject;
    return this;
  }

   /**
   * Get defaultObject
   * @return defaultObject
  **/
  @Schema(description = "")
  public Object getDefaultObject() {
    return defaultObject;
  }

  public void setDefaultObject(Object defaultObject) {
    this.defaultObject = defaultObject;
  }

  public EditObjectContainer typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

   /**
   * Get typeName
   * @return typeName
  **/
  @Schema(description = "")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public EditObjectContainer editorRoot(EditorsEditorRoot editorRoot) {
    this.editorRoot = editorRoot;
    return this;
  }

   /**
   * Get editorRoot
   * @return editorRoot
  **/
  @Schema(description = "")
  public EditorsEditorRoot getEditorRoot() {
    return editorRoot;
  }

  public void setEditorRoot(EditorsEditorRoot editorRoot) {
    this.editorRoot = editorRoot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditObjectContainer editObjectContainer = (EditObjectContainer) o;
    return Objects.equals(this.object, editObjectContainer.object) &&
        Objects.equals(this.defaultObject, editObjectContainer.defaultObject) &&
        Objects.equals(this.typeName, editObjectContainer.typeName) &&
        Objects.equals(this.editorRoot, editObjectContainer.editorRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, defaultObject, typeName, editorRoot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditObjectContainer {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    defaultObject: ").append(toIndentedString(defaultObject)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    editorRoot: ").append(toIndentedString(editorRoot)).append("\n");
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
