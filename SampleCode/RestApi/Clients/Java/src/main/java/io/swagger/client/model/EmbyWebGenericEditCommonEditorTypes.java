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
 * Gets or Sets Emby.Web.GenericEdit.Common.EditorTypes
 */
@JsonAdapter(EmbyWebGenericEditCommonEditorTypes.Adapter.class)
public enum EmbyWebGenericEditCommonEditorTypes {
  GROUP("Group"),
  TEXT("Text"),
  NUMERIC("Numeric"),
  BOOLEAN("Boolean"),
  SELECTSINGLE("SelectSingle"),
  SELECTMULTIPLE("SelectMultiple"),
  DATE("Date"),
  FILEPATH("FilePath"),
  FOLDERPATH("FolderPath"),
  STATUSITEM("StatusItem"),
  PROGRESSITEM("ProgressItem"),
  BUTTONITEM("ButtonItem"),
  BUTTONGROUP("ButtonGroup"),
  CAPTIONITEM("CaptionItem"),
  LABELITEM("LabelItem"),
  ITEMLIST("ItemList"),
  RADIOGROUP("RadioGroup"),
  DATAGRID("DataGrid"),
  PIVOTGRID("PivotGrid"),
  SPACERITEM("SpacerItem");

  private String value;

  EmbyWebGenericEditCommonEditorTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EmbyWebGenericEditCommonEditorTypes fromValue(String input) {
    for (EmbyWebGenericEditCommonEditorTypes b : EmbyWebGenericEditCommonEditorTypes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EmbyWebGenericEditCommonEditorTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final EmbyWebGenericEditCommonEditorTypes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public EmbyWebGenericEditCommonEditorTypes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return EmbyWebGenericEditCommonEditorTypes.fromValue((String)(value));
    }
  }
}
