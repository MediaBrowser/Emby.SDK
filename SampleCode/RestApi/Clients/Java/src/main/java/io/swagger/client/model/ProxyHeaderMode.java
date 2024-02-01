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
 * Gets or Sets ProxyHeaderMode
 */
@JsonAdapter(ProxyHeaderMode.Adapter.class)
public enum ProxyHeaderMode {
  NONE("None"),
  LANADDRESSESONLY("LanAddressesOnly"),
  REMOTEADDRESSESONLY("RemoteAddressesOnly"),
  ALLADDRESSES("AllAddresses");

  private String value;

  ProxyHeaderMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProxyHeaderMode fromValue(String input) {
    for (ProxyHeaderMode b : ProxyHeaderMode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProxyHeaderMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProxyHeaderMode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ProxyHeaderMode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ProxyHeaderMode.fromValue((String)(value));
    }
  }
}
