/*
 * Emby REST API
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
 * Gets or Sets Providers.MetadataRefreshMode
 */
@JsonAdapter(ProvidersMetadataRefreshMode.Adapter.class)
public enum ProvidersMetadataRefreshMode {
  VALIDATIONONLY("ValidationOnly"),
  DEFAULT("Default"),
  FULLREFRESH("FullRefresh");

  private String value;

  ProvidersMetadataRefreshMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProvidersMetadataRefreshMode fromValue(String input) {
    for (ProvidersMetadataRefreshMode b : ProvidersMetadataRefreshMode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProvidersMetadataRefreshMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProvidersMetadataRefreshMode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ProvidersMetadataRefreshMode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ProvidersMetadataRefreshMode.fromValue((String)(value));
    }
  }
}
