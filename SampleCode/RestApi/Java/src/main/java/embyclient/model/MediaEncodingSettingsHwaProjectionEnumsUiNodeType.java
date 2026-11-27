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
 * Gets or Sets MediaEncoding.Settings.Hwa.Projection.Enums.UiNodeType
 */
@JsonAdapter(MediaEncodingSettingsHwaProjectionEnumsUiNodeType.Adapter.class)
public enum MediaEncodingSettingsHwaProjectionEnumsUiNodeType {
  UNKNOWN("Unknown"),
  ROOT("Root"),
  GRAPH("Graph"),
  LOADBALANCER("LoadBalancer"),
  GPUCONFIG("GpuConfig"),
  ERROROUT("ErrorOut"),
  UIHINT("UiHint"),
  DIVIDER("Divider");

  private String value;

  MediaEncodingSettingsHwaProjectionEnumsUiNodeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MediaEncodingSettingsHwaProjectionEnumsUiNodeType fromValue(String input) {
    for (MediaEncodingSettingsHwaProjectionEnumsUiNodeType b : MediaEncodingSettingsHwaProjectionEnumsUiNodeType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MediaEncodingSettingsHwaProjectionEnumsUiNodeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MediaEncodingSettingsHwaProjectionEnumsUiNodeType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public MediaEncodingSettingsHwaProjectionEnumsUiNodeType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return MediaEncodingSettingsHwaProjectionEnumsUiNodeType.fromValue((String)(value));
    }
  }
}
