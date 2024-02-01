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
 * Gets or Sets Library.ItemLinkType
 */
@JsonAdapter(LibraryItemLinkType.Adapter.class)
public enum LibraryItemLinkType {
  ARTISTS("Artists"),
  ALBUMARTISTS("AlbumArtists"),
  GENRES("Genres"),
  STUDIOS("Studios"),
  TAGS("Tags"),
  COMPOSERS("Composers"),
  COLLECTIONS("Collections"),
  ALBUMS("Albums"),
  COLLECTIONFOLDERS("CollectionFolders");

  private String value;

  LibraryItemLinkType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LibraryItemLinkType fromValue(String input) {
    for (LibraryItemLinkType b : LibraryItemLinkType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LibraryItemLinkType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LibraryItemLinkType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public LibraryItemLinkType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return LibraryItemLinkType.fromValue((String)(value));
    }
  }
}
