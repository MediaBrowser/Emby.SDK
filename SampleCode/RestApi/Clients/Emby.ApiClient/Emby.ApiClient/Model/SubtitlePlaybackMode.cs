// <copyright file="SubtitlePlaybackMode.cs" company="Emby LLC">
// Emby.ApiClient. Autogenerated Code. No license applied. 
// </copyright>
// <autogenerated />
namespace Emby.ApiClient.Model
{
    using System;
    using System.Linq;
    using System.IO;
    using System.Text;
    using System.Collections;
    using System.Collections.Generic;
    using System.Collections.ObjectModel;
    using System.Runtime.Serialization;

    /// <summary>
    /// Defines SubtitlePlaybackMode
    /// </summary>
    /// <seealso>MediaBrowser.Model.Configuration.SubtitlePlaybackMode</seealso>
    public enum SubtitlePlaybackMode
    {
        /// <summary>
        /// Enum Default for value: Default
        /// </summary>
        [EnumMember(Value = "Default")]
        Default = 1,
        /// <summary>
        /// Enum Always for value: Always
        /// </summary>
        [EnumMember(Value = "Always")]
        Always = 2,
        /// <summary>
        /// Enum OnlyForced for value: OnlyForced
        /// </summary>
        [EnumMember(Value = "OnlyForced")]
        OnlyForced = 3,
        /// <summary>
        /// Enum None for value: None
        /// </summary>
        [EnumMember(Value = "None")]
        None = 4,
        /// <summary>
        /// Enum Smart for value: Smart
        /// </summary>
        [EnumMember(Value = "Smart")]
        Smart = 5,
        /// <summary>
        /// Enum HearingImpaired for value: HearingImpaired
        /// </summary>
        [EnumMember(Value = "HearingImpaired")]
        HearingImpaired = 6    }
}