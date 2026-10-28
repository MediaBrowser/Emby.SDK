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
 * Gets or Sets Enums.UiDialogSize
 */
@JsonAdapter(EnumsUiDialogSize.Adapter.class)
public enum EnumsUiDialogSize {
  AUTOFIT("AutoFit"),
  SMALL("Small"),
  MEDIUM("Medium"),
  MEDIUMTALL("MediumTall"),
  FULLSCREENBORDER("FullScreenBorder"),
  FULLSCREEN("FullScreen");

  private String value;

  EnumsUiDialogSize(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumsUiDialogSize fromValue(String input) {
    for (EnumsUiDialogSize b : EnumsUiDialogSize.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EnumsUiDialogSize> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumsUiDialogSize enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public EnumsUiDialogSize read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return EnumsUiDialogSize.fromValue((String)(value));
    }
  }
}
