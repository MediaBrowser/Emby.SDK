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
 * Gets or Sets ForgotPasswordAction
 */
@JsonAdapter(ForgotPasswordAction.Adapter.class)
public enum ForgotPasswordAction {
  CONTACTADMIN("ContactAdmin"),
  PINCODE("PinCode");

  private String value;

  ForgotPasswordAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ForgotPasswordAction fromValue(String input) {
    for (ForgotPasswordAction b : ForgotPasswordAction.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ForgotPasswordAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final ForgotPasswordAction enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ForgotPasswordAction read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return ForgotPasswordAction.fromValue((String)(value));
    }
  }
}
