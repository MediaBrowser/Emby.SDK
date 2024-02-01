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
 * Gets or Sets Common.EditorTypes
 */
@JsonAdapter(CommonEditorTypes.Adapter.class)
public enum CommonEditorTypes {
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
  DXDATAGRID("DxDataGrid"),
  DXPIVOTGRID("DxPivotGrid"),
  SPACERITEM("SpacerItem");

  private String value;

  CommonEditorTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CommonEditorTypes fromValue(String input) {
    for (CommonEditorTypes b : CommonEditorTypes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CommonEditorTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final CommonEditorTypes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public CommonEditorTypes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return CommonEditorTypes.fromValue((String)(value));
    }
  }
}
