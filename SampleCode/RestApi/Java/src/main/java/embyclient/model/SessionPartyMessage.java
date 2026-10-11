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
import embyclient.model.UserDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * SessionPartyMessage
 */


public class SessionPartyMessage {
  @SerializedName("DateTime")
  private OffsetDateTime dateTime = null;

  @SerializedName("MessageTranslationKey")
  private String messageTranslationKey = null;

  @SerializedName("MessageTranslationArguments")
  private List<String> messageTranslationArguments = null;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("UserId")
  private Long userId = null;

  @SerializedName("User")
  private UserDto user = null;

  public SessionPartyMessage dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Get dateTime
   * @return dateTime
  **/
  @Schema(description = "")
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public SessionPartyMessage messageTranslationKey(String messageTranslationKey) {
    this.messageTranslationKey = messageTranslationKey;
    return this;
  }

   /**
   * Get messageTranslationKey
   * @return messageTranslationKey
  **/
  @Schema(description = "")
  public String getMessageTranslationKey() {
    return messageTranslationKey;
  }

  public void setMessageTranslationKey(String messageTranslationKey) {
    this.messageTranslationKey = messageTranslationKey;
  }

  public SessionPartyMessage messageTranslationArguments(List<String> messageTranslationArguments) {
    this.messageTranslationArguments = messageTranslationArguments;
    return this;
  }

  public SessionPartyMessage addMessageTranslationArgumentsItem(String messageTranslationArgumentsItem) {
    if (this.messageTranslationArguments == null) {
      this.messageTranslationArguments = new ArrayList<>();
    }
    this.messageTranslationArguments.add(messageTranslationArgumentsItem);
    return this;
  }

   /**
   * Get messageTranslationArguments
   * @return messageTranslationArguments
  **/
  @Schema(description = "")
  public List<String> getMessageTranslationArguments() {
    return messageTranslationArguments;
  }

  public void setMessageTranslationArguments(List<String> messageTranslationArguments) {
    this.messageTranslationArguments = messageTranslationArguments;
  }

  public SessionPartyMessage message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SessionPartyMessage userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public SessionPartyMessage user(UserDto user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public UserDto getUser() {
    return user;
  }

  public void setUser(UserDto user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionPartyMessage sessionPartyMessage = (SessionPartyMessage) o;
    return Objects.equals(this.dateTime, sessionPartyMessage.dateTime) &&
        Objects.equals(this.messageTranslationKey, sessionPartyMessage.messageTranslationKey) &&
        Objects.equals(this.messageTranslationArguments, sessionPartyMessage.messageTranslationArguments) &&
        Objects.equals(this.message, sessionPartyMessage.message) &&
        Objects.equals(this.userId, sessionPartyMessage.userId) &&
        Objects.equals(this.user, sessionPartyMessage.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, messageTranslationKey, messageTranslationArguments, message, userId, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionPartyMessage {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    messageTranslationKey: ").append(toIndentedString(messageTranslationKey)).append("\n");
    sb.append("    messageTranslationArguments: ").append(toIndentedString(messageTranslationArguments)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
