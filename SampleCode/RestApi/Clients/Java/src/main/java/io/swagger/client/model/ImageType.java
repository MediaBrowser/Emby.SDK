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
 * Enum ImageType  
 */
@JsonAdapter(ImageType.Adapter.class)
public enum ImageType {
  PRIMARY("Primary"),
  ART("Art"),
  BACKDROP("Backdrop"),
  BANNER("Banner"),
  LOGO("Logo"),
  THUMB("Thumb"),
  DISC("Disc"),
  BOX("Box"),
  SCREENSHOT("Screenshot"),
  MENU("Menu"),
  CHAPTER("Chapter"),
  BOXREAR("BoxRear"),
  THUMBNAIL("Thumbnail"),
  LOGOLIGHT("LogoLight"),
  LOGOLIGHTCOLOR("LogoLightColor");

  private String value;

  ImageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ImageType fromValue(String input) {
    for (ImageType b : ImageType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ImageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ImageType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ImageType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ImageType.fromValue((String)(value));
    }
  }
}
