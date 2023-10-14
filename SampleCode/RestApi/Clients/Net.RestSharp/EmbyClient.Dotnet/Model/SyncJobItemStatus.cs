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
    /// Defines SyncJobItemStatus
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum SyncJobItemStatus
    {
        /// <summary>
        /// Enum Queued for value: Queued
        /// </summary>
        [EnumMember(Value = "Queued")]
        Queued = 1,
        /// <summary>
        /// Enum Converting for value: Converting
        /// </summary>
        [EnumMember(Value = "Converting")]
        Converting = 2,
        /// <summary>
        /// Enum ReadyToTransfer for value: ReadyToTransfer
        /// </summary>
        [EnumMember(Value = "ReadyToTransfer")]
        ReadyToTransfer = 3,
        /// <summary>
        /// Enum Transferring for value: Transferring
        /// </summary>
        [EnumMember(Value = "Transferring")]
        Transferring = 4,
        /// <summary>
        /// Enum Synced for value: Synced
        /// </summary>
        [EnumMember(Value = "Synced")]
        Synced = 5,
        /// <summary>
        /// Enum Failed for value: Failed
        /// </summary>
        [EnumMember(Value = "Failed")]
        Failed = 6    }
}
