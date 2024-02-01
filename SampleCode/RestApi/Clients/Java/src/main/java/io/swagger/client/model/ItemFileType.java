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
 * Gets or Sets ItemFileType
 */
@JsonAdapter(ItemFileType.Adapter.class)
public enum ItemFileType {
  MEDIA("Media"),
  IMAGE("Image"),
  SUBTITLES("Subtitles");

  private String value;

  ItemFileType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ItemFileType fromValue(String input) {
    for (ItemFileType b : ItemFileType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ItemFileType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ItemFileType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ItemFileType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ItemFileType.fromValue((String)(value));
    }
  }
}
