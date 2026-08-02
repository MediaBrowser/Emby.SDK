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
import embyclient.model.SessionPartyMessage;
import embyclient.model.SessionSessionInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SessionPartyInfo
 */


public class SessionPartyInfo {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Sessions")
  private List<SessionSessionInfo> sessions = null;

  @SerializedName("Messages")
  private List<SessionPartyMessage> messages = null;

  @SerializedName("MasterSession")
  private SessionSessionInfo masterSession = null;

  public SessionPartyInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SessionPartyInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SessionPartyInfo sessions(List<SessionSessionInfo> sessions) {
    this.sessions = sessions;
    return this;
  }

  public SessionPartyInfo addSessionsItem(SessionSessionInfo sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new ArrayList<>();
    }
    this.sessions.add(sessionsItem);
    return this;
  }

   /**
   * Get sessions
   * @return sessions
  **/
  @Schema(description = "")
  public List<SessionSessionInfo> getSessions() {
    return sessions;
  }

  public void setSessions(List<SessionSessionInfo> sessions) {
    this.sessions = sessions;
  }

  public SessionPartyInfo messages(List<SessionPartyMessage> messages) {
    this.messages = messages;
    return this;
  }

  public SessionPartyInfo addMessagesItem(SessionPartyMessage messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @Schema(description = "")
  public List<SessionPartyMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<SessionPartyMessage> messages) {
    this.messages = messages;
  }

  public SessionPartyInfo masterSession(SessionSessionInfo masterSession) {
    this.masterSession = masterSession;
    return this;
  }

   /**
   * Get masterSession
   * @return masterSession
  **/
  @Schema(description = "")
  public SessionSessionInfo getMasterSession() {
    return masterSession;
  }

  public void setMasterSession(SessionSessionInfo masterSession) {
    this.masterSession = masterSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionPartyInfo sessionPartyInfo = (SessionPartyInfo) o;
    return Objects.equals(this.id, sessionPartyInfo.id) &&
        Objects.equals(this.name, sessionPartyInfo.name) &&
        Objects.equals(this.sessions, sessionPartyInfo.sessions) &&
        Objects.equals(this.messages, sessionPartyInfo.messages) &&
        Objects.equals(this.masterSession, sessionPartyInfo.masterSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, sessions, messages, masterSession);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionPartyInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    masterSession: ").append(toIndentedString(masterSession)).append("\n");
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
