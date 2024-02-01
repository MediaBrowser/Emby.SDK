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
 * Gets or Sets Enums.UICommandType
 */
@JsonAdapter(EnumsUICommandType.Adapter.class)
public enum EnumsUICommandType {
  CUSTOM("Custom"),
  WIZARDCANCEL("WizardCancel"),
  WIZARDBACK("WizardBack"),
  WIZARDNEXT("WizardNext"),
  WIZARDFINISH("WizardFinish"),
  DIALOGCANCEL("DialogCancel"),
  DIALOGOK("DialogOk"),
  PAGESAVE("PageSave"),
  PAGEBACK("PageBack"),
  WIZARDBUTTON1("WizardButton1"),
  WIZARDBUTTON2("WizardButton2"),
  WIZARDBUTTON3("WizardButton3");

  private String value;

  EnumsUICommandType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumsUICommandType fromValue(String input) {
    for (EnumsUICommandType b : EnumsUICommandType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EnumsUICommandType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumsUICommandType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public EnumsUICommandType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return EnumsUICommandType.fromValue((String)(value));
    }
  }
}
