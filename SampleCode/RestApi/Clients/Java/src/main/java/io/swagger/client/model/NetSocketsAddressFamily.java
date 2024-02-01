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
 * Gets or Sets Net.Sockets.AddressFamily
 */
@JsonAdapter(NetSocketsAddressFamily.Adapter.class)
public enum NetSocketsAddressFamily {
  UNSPECIFIED("Unspecified"),
  UNIX("Unix"),
  INTERNETWORK("InterNetwork"),
  IMPLINK("ImpLink"),
  PUP("Pup"),
  CHAOS("Chaos"),
  NS("NS"),
  IPX("Ipx"),
  OSI("Osi"),
  ISO("Iso"),
  ECMA("Ecma"),
  DATAKIT("DataKit"),
  CCITT("Ccitt"),
  SNA("Sna"),
  DECNET("DecNet"),
  DATALINK("DataLink"),
  LAT("Lat"),
  HYPERCHANNEL("HyperChannel"),
  APPLETALK("AppleTalk"),
  NETBIOS("NetBios"),
  VOICEVIEW("VoiceView"),
  FIREFOX("FireFox"),
  BANYAN("Banyan"),
  ATM("Atm"),
  INTERNETWORKV6("InterNetworkV6"),
  CLUSTER("Cluster"),
  IEEE12844("Ieee12844"),
  IRDA("Irda"),
  NETWORKDESIGNERS("NetworkDesigners"),
  MAX("Max"),
  PACKET("Packet"),
  CONTROLLERAREANETWORK("ControllerAreaNetwork"),
  UNKNOWN("Unknown");

  private String value;

  NetSocketsAddressFamily(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NetSocketsAddressFamily fromValue(String input) {
    for (NetSocketsAddressFamily b : NetSocketsAddressFamily.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<NetSocketsAddressFamily> {
    @Override
    public void write(final JsonWriter jsonWriter, final NetSocketsAddressFamily enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public NetSocketsAddressFamily read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return NetSocketsAddressFamily.fromValue((String)(value));
    }
  }
}
