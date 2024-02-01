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
 * GenericEditIEditObjectContainer
 */


public class GenericEditIEditObjectContainer {
  @SerializedName("Object")
  private Object object = null;

  @SerializedName("DefaultObject")
  private Object defaultObject = null;

  @SerializedName("TypeName")
  private String typeName = null;

  public GenericEditIEditObjectContainer object(Object object) {
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

  public GenericEditIEditObjectContainer defaultObject(Object defaultObject) {
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

  public GenericEditIEditObjectContainer typeName(String typeName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericEditIEditObjectContainer genericEditIEditObjectContainer = (GenericEditIEditObjectContainer) o;
    return Objects.equals(this.object, genericEditIEditObjectContainer.object) &&
        Objects.equals(this.defaultObject, genericEditIEditObjectContainer.defaultObject) &&
        Objects.equals(this.typeName, genericEditIEditObjectContainer.typeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, defaultObject, typeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericEditIEditObjectContainer {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    defaultObject: ").append(toIndentedString(defaultObject)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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
