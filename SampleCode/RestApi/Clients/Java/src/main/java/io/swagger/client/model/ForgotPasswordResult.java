/*
 * Emby Server REST API
 * 
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ForgotPasswordAction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * ForgotPasswordResult
 */


public class ForgotPasswordResult {
  @SerializedName("Action")
  private ForgotPasswordAction action = null;

  @SerializedName("PinFile")
  private String pinFile = null;

  @SerializedName("PinExpirationDate")
  private OffsetDateTime pinExpirationDate = null;

  public ForgotPasswordResult action(ForgotPasswordAction action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public ForgotPasswordAction getAction() {
    return action;
  }

  public void setAction(ForgotPasswordAction action) {
    this.action = action;
  }

  public ForgotPasswordResult pinFile(String pinFile) {
    this.pinFile = pinFile;
    return this;
  }

   /**
   * The pin file.
   * @return pinFile
  **/
  @Schema(description = "The pin file.")
  public String getPinFile() {
    return pinFile;
  }

  public void setPinFile(String pinFile) {
    this.pinFile = pinFile;
  }

  public ForgotPasswordResult pinExpirationDate(OffsetDateTime pinExpirationDate) {
    this.pinExpirationDate = pinExpirationDate;
    return this;
  }

   /**
   * The pin expiration date.
   * @return pinExpirationDate
  **/
  @Schema(description = "The pin expiration date.")
  public OffsetDateTime getPinExpirationDate() {
    return pinExpirationDate;
  }

  public void setPinExpirationDate(OffsetDateTime pinExpirationDate) {
    this.pinExpirationDate = pinExpirationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForgotPasswordResult forgotPasswordResult = (ForgotPasswordResult) o;
    return Objects.equals(this.action, forgotPasswordResult.action) &&
        Objects.equals(this.pinFile, forgotPasswordResult.pinFile) &&
        Objects.equals(this.pinExpirationDate, forgotPasswordResult.pinExpirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, pinFile, pinExpirationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForgotPasswordResult {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    pinFile: ").append(toIndentedString(pinFile)).append("\n");
    sb.append("    pinExpirationDate: ").append(toIndentedString(pinExpirationDate)).append("\n");
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
