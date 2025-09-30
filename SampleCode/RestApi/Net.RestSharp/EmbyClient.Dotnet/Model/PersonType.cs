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
    /// Defines PersonType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum PersonType
    {
        /// <summary>
        /// Enum Actor for value: Actor
        /// </summary>
        [EnumMember(Value = "Actor")]
        Actor = 1,
        /// <summary>
        /// Enum Director for value: Director
        /// </summary>
        [EnumMember(Value = "Director")]
        Director = 2,
        /// <summary>
        /// Enum Writer for value: Writer
        /// </summary>
        [EnumMember(Value = "Writer")]
        Writer = 3,
        /// <summary>
        /// Enum Producer for value: Producer
        /// </summary>
        [EnumMember(Value = "Producer")]
        Producer = 4,
        /// <summary>
        /// Enum GuestStar for value: GuestStar
        /// </summary>
        [EnumMember(Value = "GuestStar")]
        GuestStar = 5,
        /// <summary>
        /// Enum Composer for value: Composer
        /// </summary>
        [EnumMember(Value = "Composer")]
        Composer = 6,
        /// <summary>
        /// Enum Conductor for value: Conductor
        /// </summary>
        [EnumMember(Value = "Conductor")]
        Conductor = 7,
        /// <summary>
        /// Enum Lyricist for value: Lyricist
        /// </summary>
        [EnumMember(Value = "Lyricist")]
        Lyricist = 8    }
}
