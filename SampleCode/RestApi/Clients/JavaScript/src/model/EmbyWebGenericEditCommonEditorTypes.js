/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.3
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class EmbyWebGenericEditCommonEditorTypes.
* @enum {}
* @readonly
*/
export default class EmbyWebGenericEditCommonEditorTypes {
        /**
         * value: "Group"
         * @const
         */
        group = "Group";

        /**
         * value: "Text"
         * @const
         */
        text = "Text";

        /**
         * value: "Numeric"
         * @const
         */
        numeric = "Numeric";

        /**
         * value: "Boolean"
         * @const
         */
        _boolean = "Boolean";

        /**
         * value: "SelectSingle"
         * @const
         */
        selectSingle = "SelectSingle";

        /**
         * value: "SelectMultiple"
         * @const
         */
        selectMultiple = "SelectMultiple";

        /**
         * value: "Date"
         * @const
         */
        _date = "Date";

        /**
         * value: "FilePath"
         * @const
         */
        filePath = "FilePath";

        /**
         * value: "FolderPath"
         * @const
         */
        folderPath = "FolderPath";

        /**
         * value: "StatusItem"
         * @const
         */
        statusItem = "StatusItem";

        /**
         * value: "ProgressItem"
         * @const
         */
        progressItem = "ProgressItem";

        /**
         * value: "ButtonItem"
         * @const
         */
        buttonItem = "ButtonItem";

        /**
         * value: "ButtonGroup"
         * @const
         */
        buttonGroup = "ButtonGroup";

        /**
         * value: "CaptionItem"
         * @const
         */
        captionItem = "CaptionItem";

        /**
         * value: "LabelItem"
         * @const
         */
        labelItem = "LabelItem";

        /**
         * value: "ItemList"
         * @const
         */
        itemList = "ItemList";

        /**
         * value: "RadioGroup"
         * @const
         */
        radioGroup = "RadioGroup";

        /**
         * value: "DataGrid"
         * @const
         */
        dataGrid = "DataGrid";

        /**
         * value: "PivotGrid"
         * @const
         */
        pivotGrid = "PivotGrid";

        /**
         * value: "SpacerItem"
         * @const
         */
        spacerItem = "SpacerItem";


    /**
    * Returns a <code>EmbyWebGenericEditCommonEditorTypes</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/EmbyWebGenericEditCommonEditorTypes} The enum <code>EmbyWebGenericEditCommonEditorTypes</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
