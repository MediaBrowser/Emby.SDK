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
    /// Defines MarkerType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum MarkerType
    {
        /// <summary>
        /// Enum Chapter for value: Chapter
        /// </summary>
        [EnumMember(Value = "Chapter")]
        Chapter = 1,
        /// <summary>
        /// Enum IntroStart for value: IntroStart
        /// </summary>
        [EnumMember(Value = "IntroStart")]
        IntroStart = 2,
        /// <summary>
        /// Enum IntroEnd for value: IntroEnd
        /// </summary>
        [EnumMember(Value = "IntroEnd")]
        IntroEnd = 3,
        /// <summary>
        /// Enum CreditsStart for value: CreditsStart
        /// </summary>
        [EnumMember(Value = "CreditsStart")]
        CreditsStart = 4    }
}
