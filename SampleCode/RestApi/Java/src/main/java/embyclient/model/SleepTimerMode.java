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
 * Gets or Sets SleepTimerMode
 */
@JsonAdapter(SleepTimerMode.Adapter.class)
public enum SleepTimerMode {
  NONE("None"),
  AFTERITEM("AfterItem"),
  ATTIME("AtTime");

  private String value;

  SleepTimerMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SleepTimerMode fromValue(String input) {
    for (SleepTimerMode b : SleepTimerMode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SleepTimerMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final SleepTimerMode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SleepTimerMode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SleepTimerMode.fromValue((String)(value));
    }
  }
}
