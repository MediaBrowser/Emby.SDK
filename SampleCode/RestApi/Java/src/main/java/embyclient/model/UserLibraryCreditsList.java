/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import embyclient.model.PersonType;
import embyclient.model.RemoteSearchResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * UserLibraryCreditsList
 */


public class UserLibraryCreditsList {
  @SerializedName("PersonType")
  private PersonType personType = null;

  @SerializedName("Items")
  private List<RemoteSearchResult> items = null;

  public UserLibraryCreditsList personType(PersonType personType) {
    this.personType = personType;
    return this;
  }

   /**
   * Get personType
   * @return personType
  **/
  @Schema(description = "")
  public PersonType getPersonType() {
    return personType;
  }

  public void setPersonType(PersonType personType) {
    this.personType = personType;
  }

  public UserLibraryCreditsList items(List<RemoteSearchResult> items) {
    this.items = items;
    return this;
  }

  public UserLibraryCreditsList addItemsItem(RemoteSearchResult itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<RemoteSearchResult> getItems() {
    return items;
  }

  public void setItems(List<RemoteSearchResult> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLibraryCreditsList userLibraryCreditsList = (UserLibraryCreditsList) o;
    return Objects.equals(this.personType, userLibraryCreditsList.personType) &&
        Objects.equals(this.items, userLibraryCreditsList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personType, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLibraryCreditsList {\n");
    
    sb.append("    personType: ").append(toIndentedString(personType)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
