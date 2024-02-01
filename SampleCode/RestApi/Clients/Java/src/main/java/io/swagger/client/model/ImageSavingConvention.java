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
 * Gets or Sets ImageSavingConvention
 */
@JsonAdapter(ImageSavingConvention.Adapter.class)
public enum ImageSavingConvention {
  LEGACY("Legacy"),
  COMPATIBLE("Compatible");

  private String value;

  ImageSavingConvention(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ImageSavingConvention fromValue(String input) {
    for (ImageSavingConvention b : ImageSavingConvention.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ImageSavingConvention> {
    @Override
    public void write(final JsonWriter jsonWriter, final ImageSavingConvention enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ImageSavingConvention read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ImageSavingConvention.fromValue((String)(value));
    }
  }
}
