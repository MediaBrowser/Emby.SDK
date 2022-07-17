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
    /// Defines LiveTv.RecordingStatus
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum LiveTvRecordingStatus
    {
        /// <summary>
        /// Enum New for value: New
        /// </summary>
        [EnumMember(Value = "New")]
        New = 1,
        /// <summary>
        /// Enum InProgress for value: InProgress
        /// </summary>
        [EnumMember(Value = "InProgress")]
        InProgress = 2,
        /// <summary>
        /// Enum Completed for value: Completed
        /// </summary>
        [EnumMember(Value = "Completed")]
        Completed = 3,
        /// <summary>
        /// Enum Cancelled for value: Cancelled
        /// </summary>
        [EnumMember(Value = "Cancelled")]
        Cancelled = 4,
        /// <summary>
        /// Enum ConflictedOk for value: ConflictedOk
        /// </summary>
        [EnumMember(Value = "ConflictedOk")]
        ConflictedOk = 5,
        /// <summary>
        /// Enum ConflictedNotOk for value: ConflictedNotOk
        /// </summary>
        [EnumMember(Value = "ConflictedNotOk")]
        ConflictedNotOk = 6,
        /// <summary>
        /// Enum Error for value: Error
        /// </summary>
        [EnumMember(Value = "Error")]
        Error = 7    }
}
