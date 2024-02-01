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
 * Enum MetadataFields  
 */
@JsonAdapter(MetadataFields.Adapter.class)
public enum MetadataFields {
  CAST("Cast"),
  GENRES("Genres"),
  PRODUCTIONLOCATIONS("ProductionLocations"),
  STUDIOS("Studios"),
  TAGS("Tags"),
  NAME("Name"),
  OVERVIEW("Overview"),
  RUNTIME("Runtime"),
  OFFICIALRATING("OfficialRating"),
  COLLECTIONS("Collections"),
  CHANNELNUMBER("ChannelNumber"),
  SORTNAME("SortName"),
  ORIGINALTITLE("OriginalTitle"),
  SORTINDEXNUMBER("SortIndexNumber"),
  SORTPARENTINDEXNUMBER("SortParentIndexNumber"),
  COMMUNITYRATING("CommunityRating"),
  CRITICRATING("CriticRating"),
  TAGLINE("Tagline");

  private String value;

  MetadataFields(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MetadataFields fromValue(String input) {
    for (MetadataFields b : MetadataFields.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MetadataFields> {
    @Override
    public void write(final JsonWriter jsonWriter, final MetadataFields enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public MetadataFields read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return MetadataFields.fromValue((String)(value));
    }
  }
}
