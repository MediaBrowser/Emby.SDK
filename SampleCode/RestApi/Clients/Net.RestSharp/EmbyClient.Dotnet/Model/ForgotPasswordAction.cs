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
    /// Defines ForgotPasswordAction
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum ForgotPasswordAction
    {
        /// <summary>
        /// Enum ContactAdmin for value: ContactAdmin
        /// </summary>
        [EnumMember(Value = "ContactAdmin")]
        ContactAdmin = 1,
        /// <summary>
        /// Enum PinCode for value: PinCode
        /// </summary>
        [EnumMember(Value = "PinCode")]
        PinCode = 2    }
}
