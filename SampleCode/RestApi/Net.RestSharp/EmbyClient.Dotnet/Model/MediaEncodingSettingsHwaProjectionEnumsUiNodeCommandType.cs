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
    /// Defines MediaEncoding.Settings.Hwa.Projection.Enums.UiNodeCommandType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType
    {
        /// <summary>
        /// Enum Configure for value: Configure
        /// </summary>
        [EnumMember(Value = "Configure")]
        Configure = 1,
        /// <summary>
        /// Enum Conditions for value: Conditions
        /// </summary>
        [EnumMember(Value = "Conditions")]
        Conditions = 2,
        /// <summary>
        /// Enum LoadLimits for value: LoadLimits
        /// </summary>
        [EnumMember(Value = "LoadLimits")]
        LoadLimits = 3,
        /// <summary>
        /// Enum LoadBalancing for value: LoadBalancing
        /// </summary>
        [EnumMember(Value = "LoadBalancing")]
        LoadBalancing = 4,
        /// <summary>
        /// Enum ToggleEnabled for value: ToggleEnabled
        /// </summary>
        [EnumMember(Value = "ToggleEnabled")]
        ToggleEnabled = 5,
        /// <summary>
        /// Enum Move for value: Move
        /// </summary>
        [EnumMember(Value = "Move")]
        Move = 6,
        /// <summary>
        /// Enum Insert for value: Insert
        /// </summary>
        [EnumMember(Value = "Insert")]
        Insert = 7,
        /// <summary>
        /// Enum Delete for value: Delete
        /// </summary>
        [EnumMember(Value = "Delete")]
        Delete = 8,
        /// <summary>
        /// Enum InsertGpuConfig for value: InsertGpuConfig
        /// </summary>
        [EnumMember(Value = "InsertGpuConfig")]
        InsertGpuConfig = 9,
        /// <summary>
        /// Enum InsertGraph for value: InsertGraph
        /// </summary>
        [EnumMember(Value = "InsertGraph")]
        InsertGraph = 10,
        /// <summary>
        /// Enum InsertLoadBalancer for value: InsertLoadBalancer
        /// </summary>
        [EnumMember(Value = "InsertLoadBalancer")]
        InsertLoadBalancer = 11,
        /// <summary>
        /// Enum InsertErrorOut for value: InsertErrorOut
        /// </summary>
        [EnumMember(Value = "InsertErrorOut")]
        InsertErrorOut = 12    }
}
