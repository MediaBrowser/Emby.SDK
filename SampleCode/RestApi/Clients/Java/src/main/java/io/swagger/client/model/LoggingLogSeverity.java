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
 * Enum LogSeverity  
 */
@JsonAdapter(LoggingLogSeverity.Adapter.class)
public enum LoggingLogSeverity {
  INFO("Info"),
  DEBUG("Debug"),
  WARN("Warn"),
  ERROR("Error"),
  FATAL("Fatal");

  private String value;

  LoggingLogSeverity(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LoggingLogSeverity fromValue(String input) {
    for (LoggingLogSeverity b : LoggingLogSeverity.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LoggingLogSeverity> {
    @Override
    public void write(final JsonWriter jsonWriter, final LoggingLogSeverity enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public LoggingLogSeverity read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return LoggingLogSeverity.fromValue((String)(value));
    }
  }
}
