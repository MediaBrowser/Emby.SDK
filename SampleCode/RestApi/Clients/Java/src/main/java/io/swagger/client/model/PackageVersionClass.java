/*
 * Emby Server REST API
 * 
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Enum PackageVersionClass  
 */
@JsonAdapter(PackageVersionClass.Adapter.class)
public enum PackageVersionClass {
  RELEASE("Release"),
  BETA("Beta"),
  DEV("Dev");

  private String value;

  PackageVersionClass(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PackageVersionClass fromValue(String input) {
    for (PackageVersionClass b : PackageVersionClass.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PackageVersionClass> {
    @Override
    public void write(final JsonWriter jsonWriter, final PackageVersionClass enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public PackageVersionClass read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return PackageVersionClass.fromValue((String)(value));
    }
  }
}
