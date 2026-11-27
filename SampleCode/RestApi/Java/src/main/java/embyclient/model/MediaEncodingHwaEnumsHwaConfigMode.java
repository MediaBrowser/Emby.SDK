/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets MediaEncoding.Hwa.Enums.HwaConfigMode
 */
@JsonAdapter(MediaEncodingHwaEnumsHwaConfigMode.Adapter.class)
public enum MediaEncodingHwaEnumsHwaConfigMode {
  BASIC("Basic"),
  ADVANCED("Advanced"),
  EXPERT("Expert");

  private String value;

  MediaEncodingHwaEnumsHwaConfigMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MediaEncodingHwaEnumsHwaConfigMode fromValue(String input) {
    for (MediaEncodingHwaEnumsHwaConfigMode b : MediaEncodingHwaEnumsHwaConfigMode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MediaEncodingHwaEnumsHwaConfigMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final MediaEncodingHwaEnumsHwaConfigMode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public MediaEncodingHwaEnumsHwaConfigMode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return MediaEncodingHwaEnumsHwaConfigMode.fromValue((String)(value));
    }
  }
}
