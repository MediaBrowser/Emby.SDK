/**
 * Emby Server REST API
 * Explore the Emby Server API
 *
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class CommonEditorTypes.
* @enum {}
* @readonly
*/
export default class CommonEditorTypes {
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
         * value: "DxDataGrid"
         * @const
         */
        dxDataGrid = "DxDataGrid";

        /**
         * value: "DxPivotGrid"
         * @const
         */
        dxPivotGrid = "DxPivotGrid";

        /**
         * value: "SpacerItem"
         * @const
         */
        spacerItem = "SpacerItem";


    /**
    * Returns a <code>CommonEditorTypes</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/CommonEditorTypes} The enum <code>CommonEditorTypes</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
