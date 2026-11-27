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
 * Gets or Sets MediaEncoding.Settings.Hwa.Projection.Enums.UiNodeCommandType
 */
@JsonAdapter(MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType.Adapter.class)
public enum MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType {
  CONFIGURE("Configure"),
  CONDITIONS("Conditions"),
  LOADLIMITS("LoadLimits"),
  LOADBALANCING("LoadBalancing"),
  TOGGLEENABLED("ToggleEnabled"),
  MOVE("Move"),
  INSERT("Insert"),
  DELETE("Delete"),
  INSERTGPUCONFIG("InsertGpuConfig"),
  INSERTGRAPH("InsertGraph"),
  INSERTLOADBALANCER("InsertLoadBalancer"),
  INSERTERROROUT("InsertErrorOut");

  private String value;

  MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType fromValue(String input) {
    for (MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType b : MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType.fromValue((String)(value));
    }
  }
}
