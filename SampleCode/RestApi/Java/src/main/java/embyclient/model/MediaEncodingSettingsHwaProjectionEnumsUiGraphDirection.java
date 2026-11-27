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
 * Gets or Sets MediaEncoding.Settings.Hwa.Projection.Enums.UiGraphDirection
 */
@JsonAdapter(MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection.Adapter.class)
public enum MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection {
  TOPDOWN("TopDown"),
  LEFTRIGHT("LeftRight"),
  UNORDEREDHORIZONTAL("UnorderedHorizontal");

  private String value;

  MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection fromValue(String input) {
    for (MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection b : MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection> {
    @Override
    public void write(final JsonWriter jsonWriter, final MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection.fromValue((String)(value));
    }
  }
}
