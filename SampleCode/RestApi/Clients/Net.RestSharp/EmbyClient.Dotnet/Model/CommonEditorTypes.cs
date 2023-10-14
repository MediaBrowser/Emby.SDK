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
    /// Defines Common.EditorTypes
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum CommonEditorTypes
    {
        /// <summary>
        /// Enum Group for value: Group
        /// </summary>
        [EnumMember(Value = "Group")]
        Group = 1,
        /// <summary>
        /// Enum Text for value: Text
        /// </summary>
        [EnumMember(Value = "Text")]
        Text = 2,
        /// <summary>
        /// Enum Numeric for value: Numeric
        /// </summary>
        [EnumMember(Value = "Numeric")]
        Numeric = 3,
        /// <summary>
        /// Enum Boolean for value: Boolean
        /// </summary>
        [EnumMember(Value = "Boolean")]
        Boolean = 4,
        /// <summary>
        /// Enum SelectSingle for value: SelectSingle
        /// </summary>
        [EnumMember(Value = "SelectSingle")]
        SelectSingle = 5,
        /// <summary>
        /// Enum SelectMultiple for value: SelectMultiple
        /// </summary>
        [EnumMember(Value = "SelectMultiple")]
        SelectMultiple = 6,
        /// <summary>
        /// Enum Date for value: Date
        /// </summary>
        [EnumMember(Value = "Date")]
        Date = 7,
        /// <summary>
        /// Enum FilePath for value: FilePath
        /// </summary>
        [EnumMember(Value = "FilePath")]
        FilePath = 8,
        /// <summary>
        /// Enum FolderPath for value: FolderPath
        /// </summary>
        [EnumMember(Value = "FolderPath")]
        FolderPath = 9,
        /// <summary>
        /// Enum StatusItem for value: StatusItem
        /// </summary>
        [EnumMember(Value = "StatusItem")]
        StatusItem = 10,
        /// <summary>
        /// Enum ProgressItem for value: ProgressItem
        /// </summary>
        [EnumMember(Value = "ProgressItem")]
        ProgressItem = 11,
        /// <summary>
        /// Enum ButtonItem for value: ButtonItem
        /// </summary>
        [EnumMember(Value = "ButtonItem")]
        ButtonItem = 12,
        /// <summary>
        /// Enum ButtonGroup for value: ButtonGroup
        /// </summary>
        [EnumMember(Value = "ButtonGroup")]
        ButtonGroup = 13,
        /// <summary>
        /// Enum CaptionItem for value: CaptionItem
        /// </summary>
        [EnumMember(Value = "CaptionItem")]
        CaptionItem = 14,
        /// <summary>
        /// Enum LabelItem for value: LabelItem
        /// </summary>
        [EnumMember(Value = "LabelItem")]
        LabelItem = 15,
        /// <summary>
        /// Enum ItemList for value: ItemList
        /// </summary>
        [EnumMember(Value = "ItemList")]
        ItemList = 16,
        /// <summary>
        /// Enum RadioGroup for value: RadioGroup
        /// </summary>
        [EnumMember(Value = "RadioGroup")]
        RadioGroup = 17,
        /// <summary>
        /// Enum DxDataGrid for value: DxDataGrid
        /// </summary>
        [EnumMember(Value = "DxDataGrid")]
        DxDataGrid = 18,
        /// <summary>
        /// Enum DxPivotGrid for value: DxPivotGrid
        /// </summary>
        [EnumMember(Value = "DxPivotGrid")]
        DxPivotGrid = 19,
        /// <summary>
        /// Enum SpacerItem for value: SpacerItem
        /// </summary>
        [EnumMember(Value = "SpacerItem")]
        SpacerItem = 20    }
}
