/*
 * Emby Server REST API
 * 
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ExtendedVideoSubTypes
 */
@JsonAdapter(ExtendedVideoSubTypes.Adapter.class)
public enum ExtendedVideoSubTypes {
  NONE("None"),
  HDR10("Hdr10"),
  HYPERLOGGAMMA("HyperLogGamma"),
  HDR10PLUS0("Hdr10Plus0"),
  DOVIPROFILE02("DoviProfile02"),
  DOVIPROFILE10("DoviProfile10"),
  DOVIPROFILE22("DoviProfile22"),
  DOVIPROFILE30("DoviProfile30"),
  DOVIPROFILE42("DoviProfile42"),
  DOVIPROFILE50("DoviProfile50"),
  DOVIPROFILE61("DoviProfile61"),
  DOVIPROFILE76("DoviProfile76"),
  DOVIPROFILE81("DoviProfile81"),
  DOVIPROFILE82("DoviProfile82"),
  DOVIPROFILE83("DoviProfile83"),
  DOVIPROFILE84("DoviProfile84"),
  DOVIPROFILE85("DoviProfile85"),
  DOVIPROFILE92("DoviProfile92");

  private String value;

  ExtendedVideoSubTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExtendedVideoSubTypes fromValue(String input) {
    for (ExtendedVideoSubTypes b : ExtendedVideoSubTypes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ExtendedVideoSubTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExtendedVideoSubTypes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ExtendedVideoSubTypes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ExtendedVideoSubTypes.fromValue((String)(value));
    }
  }
}
