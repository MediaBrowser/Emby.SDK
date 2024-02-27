/*
 * EmbyClient.Dotnet
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = EmbyClient.Dotnet.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Model
{
    /// <summary>
    /// Defines Net.Sockets.AddressFamily
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum NetSocketsAddressFamily
    {
        /// <summary>
        /// Enum Unspecified for value: Unspecified
        /// </summary>
        [EnumMember(Value = "Unspecified")]
        Unspecified = 1,
        /// <summary>
        /// Enum Unix for value: Unix
        /// </summary>
        [EnumMember(Value = "Unix")]
        Unix = 2,
        /// <summary>
        /// Enum InterNetwork for value: InterNetwork
        /// </summary>
        [EnumMember(Value = "InterNetwork")]
        InterNetwork = 3,
        /// <summary>
        /// Enum ImpLink for value: ImpLink
        /// </summary>
        [EnumMember(Value = "ImpLink")]
        ImpLink = 4,
        /// <summary>
        /// Enum Pup for value: Pup
        /// </summary>
        [EnumMember(Value = "Pup")]
        Pup = 5,
        /// <summary>
        /// Enum Chaos for value: Chaos
        /// </summary>
        [EnumMember(Value = "Chaos")]
        Chaos = 6,
        /// <summary>
        /// Enum NS for value: NS
        /// </summary>
        [EnumMember(Value = "NS")]
        NS = 7,
        /// <summary>
        /// Enum Ipx for value: Ipx
        /// </summary>
        [EnumMember(Value = "Ipx")]
        Ipx = 8,
        /// <summary>
        /// Enum Iso for value: Iso
        /// </summary>
        [EnumMember(Value = "Iso")]
        Iso = 9,
        /// <summary>
        /// Enum Osi for value: Osi
        /// </summary>
        [EnumMember(Value = "Osi")]
        Osi = 10,
        /// <summary>
        /// Enum Ecma for value: Ecma
        /// </summary>
        [EnumMember(Value = "Ecma")]
        Ecma = 11,
        /// <summary>
        /// Enum DataKit for value: DataKit
        /// </summary>
        [EnumMember(Value = "DataKit")]
        DataKit = 12,
        /// <summary>
        /// Enum Ccitt for value: Ccitt
        /// </summary>
        [EnumMember(Value = "Ccitt")]
        Ccitt = 13,
        /// <summary>
        /// Enum Sna for value: Sna
        /// </summary>
        [EnumMember(Value = "Sna")]
        Sna = 14,
        /// <summary>
        /// Enum DecNet for value: DecNet
        /// </summary>
        [EnumMember(Value = "DecNet")]
        DecNet = 15,
        /// <summary>
        /// Enum DataLink for value: DataLink
        /// </summary>
        [EnumMember(Value = "DataLink")]
        DataLink = 16,
        /// <summary>
        /// Enum Lat for value: Lat
        /// </summary>
        [EnumMember(Value = "Lat")]
        Lat = 17,
        /// <summary>
        /// Enum HyperChannel for value: HyperChannel
        /// </summary>
        [EnumMember(Value = "HyperChannel")]
        HyperChannel = 18,
        /// <summary>
        /// Enum AppleTalk for value: AppleTalk
        /// </summary>
        [EnumMember(Value = "AppleTalk")]
        AppleTalk = 19,
        /// <summary>
        /// Enum NetBios for value: NetBios
        /// </summary>
        [EnumMember(Value = "NetBios")]
        NetBios = 20,
        /// <summary>
        /// Enum VoiceView for value: VoiceView
        /// </summary>
        [EnumMember(Value = "VoiceView")]
        VoiceView = 21,
        /// <summary>
        /// Enum FireFox for value: FireFox
        /// </summary>
        [EnumMember(Value = "FireFox")]
        FireFox = 22,
        /// <summary>
        /// Enum Banyan for value: Banyan
        /// </summary>
        [EnumMember(Value = "Banyan")]
        Banyan = 23,
        /// <summary>
        /// Enum Atm for value: Atm
        /// </summary>
        [EnumMember(Value = "Atm")]
        Atm = 24,
        /// <summary>
        /// Enum InterNetworkV6 for value: InterNetworkV6
        /// </summary>
        [EnumMember(Value = "InterNetworkV6")]
        InterNetworkV6 = 25,
        /// <summary>
        /// Enum Cluster for value: Cluster
        /// </summary>
        [EnumMember(Value = "Cluster")]
        Cluster = 26,
        /// <summary>
        /// Enum Ieee12844 for value: Ieee12844
        /// </summary>
        [EnumMember(Value = "Ieee12844")]
        Ieee12844 = 27,
        /// <summary>
        /// Enum Irda for value: Irda
        /// </summary>
        [EnumMember(Value = "Irda")]
        Irda = 28,
        /// <summary>
        /// Enum NetworkDesigners for value: NetworkDesigners
        /// </summary>
        [EnumMember(Value = "NetworkDesigners")]
        NetworkDesigners = 29,
        /// <summary>
        /// Enum Max for value: Max
        /// </summary>
        [EnumMember(Value = "Max")]
        Max = 30,
        /// <summary>
        /// Enum Packet for value: Packet
        /// </summary>
        [EnumMember(Value = "Packet")]
        Packet = 31,
        /// <summary>
        /// Enum ControllerAreaNetwork for value: ControllerAreaNetwork
        /// </summary>
        [EnumMember(Value = "ControllerAreaNetwork")]
        ControllerAreaNetwork = 32,
        /// <summary>
        /// Enum Unknown for value: Unknown
        /// </summary>
        [EnumMember(Value = "Unknown")]
        Unknown = 33    }
}
