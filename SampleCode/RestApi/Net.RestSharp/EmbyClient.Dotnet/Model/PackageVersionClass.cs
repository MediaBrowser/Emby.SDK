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
    /// Enum PackageVersionClass  
    /// </summary>
    /// <value>Enum PackageVersionClass  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum PackageVersionClass
    {
        /// <summary>
        /// Enum Release for value: Release
        /// </summary>
        [EnumMember(Value = "Release")]
        Release = 1,
        /// <summary>
        /// Enum Beta for value: Beta
        /// </summary>
        [EnumMember(Value = "Beta")]
        Beta = 2,
        /// <summary>
        /// Enum Dev for value: Dev
        /// </summary>
        [EnumMember(Value = "Dev")]
        Dev = 3    }
}
