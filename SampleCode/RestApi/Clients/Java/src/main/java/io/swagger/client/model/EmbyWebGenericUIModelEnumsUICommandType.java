/*
 * Emby Server REST API (BETA)
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
 * Gets or Sets Emby.Web.GenericUI.Model.Enums.UICommandType
 */
@JsonAdapter(EmbyWebGenericUIModelEnumsUICommandType.Adapter.class)
public enum EmbyWebGenericUIModelEnumsUICommandType {
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

  EmbyWebGenericUIModelEnumsUICommandType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EmbyWebGenericUIModelEnumsUICommandType fromValue(String input) {
    for (EmbyWebGenericUIModelEnumsUICommandType b : EmbyWebGenericUIModelEnumsUICommandType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EmbyWebGenericUIModelEnumsUICommandType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EmbyWebGenericUIModelEnumsUICommandType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public EmbyWebGenericUIModelEnumsUICommandType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return EmbyWebGenericUIModelEnumsUICommandType.fromValue((String)(value));
    }
  }
}
