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
 * Gets or Sets Drawing.ImageOrientation
 */
@JsonAdapter(DrawingImageOrientation.Adapter.class)
public enum DrawingImageOrientation {
  TOPLEFT("TopLeft"),
  TOPRIGHT("TopRight"),
  BOTTOMRIGHT("BottomRight"),
  BOTTOMLEFT("BottomLeft"),
  LEFTTOP("LeftTop"),
  RIGHTTOP("RightTop"),
  RIGHTBOTTOM("RightBottom"),
  LEFTBOTTOM("LeftBottom");

  private String value;

  DrawingImageOrientation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DrawingImageOrientation fromValue(String input) {
    for (DrawingImageOrientation b : DrawingImageOrientation.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DrawingImageOrientation> {
    @Override
    public void write(final JsonWriter jsonWriter, final DrawingImageOrientation enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DrawingImageOrientation read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return DrawingImageOrientation.fromValue((String)(value));
    }
  }
}
