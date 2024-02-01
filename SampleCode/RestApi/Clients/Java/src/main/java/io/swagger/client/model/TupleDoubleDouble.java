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
 * TupleDoubleDouble
 */


public class TupleDoubleDouble {
  @SerializedName("Item1")
  private Double item1 = null;

  @SerializedName("Item2")
  private Double item2 = null;

  public TupleDoubleDouble item1(Double item1) {
    this.item1 = item1;
    return this;
  }

   /**
   * Get item1
   * @return item1
  **/
  @Schema(description = "")
  public Double getItem1() {
    return item1;
  }

  public void setItem1(Double item1) {
    this.item1 = item1;
  }

  public TupleDoubleDouble item2(Double item2) {
    this.item2 = item2;
    return this;
  }

   /**
   * Get item2
   * @return item2
  **/
  @Schema(description = "")
  public Double getItem2() {
    return item2;
  }

  public void setItem2(Double item2) {
    this.item2 = item2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TupleDoubleDouble tupleDoubleDouble = (TupleDoubleDouble) o;
    return Objects.equals(this.item1, tupleDoubleDouble.item1) &&
        Objects.equals(this.item2, tupleDoubleDouble.item2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item1, item2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TupleDoubleDouble {\n");
    
    sb.append("    item1: ").append(toIndentedString(item1)).append("\n");
    sb.append("    item2: ").append(toIndentedString(item2)).append("\n");
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
