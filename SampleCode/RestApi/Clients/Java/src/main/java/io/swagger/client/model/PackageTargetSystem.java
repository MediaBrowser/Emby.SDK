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
 * Enum PackageType  
 */
@JsonAdapter(PackageTargetSystem.Adapter.class)
public enum PackageTargetSystem {
  SERVER("Server"),
  MBTHEATER("MBTheater"),
  MBCLASSIC("MBClassic"),
  OTHER("Other");

  private String value;

  PackageTargetSystem(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PackageTargetSystem fromValue(String input) {
    for (PackageTargetSystem b : PackageTargetSystem.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PackageTargetSystem> {
    @Override
    public void write(final JsonWriter jsonWriter, final PackageTargetSystem enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public PackageTargetSystem read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return PackageTargetSystem.fromValue((String)(value));
    }
  }
}
