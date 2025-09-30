/**
 * Emby Server REST API (BETA)
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
* Enum class EnumsUICommandType.
* @enum {}
* @readonly
*/
export default class EnumsUICommandType {
        /**
         * value: "Custom"
         * @const
         */
        Custom = "Custom";

        /**
         * value: "WizardCancel"
         * @const
         */
        WizardCancel = "WizardCancel";

        /**
         * value: "WizardBack"
         * @const
         */
        WizardBack = "WizardBack";

        /**
         * value: "WizardNext"
         * @const
         */
        WizardNext = "WizardNext";

        /**
         * value: "WizardFinish"
         * @const
         */
        WizardFinish = "WizardFinish";

        /**
         * value: "DialogCancel"
         * @const
         */
        DialogCancel = "DialogCancel";

        /**
         * value: "DialogOk"
         * @const
         */
        DialogOk = "DialogOk";

        /**
         * value: "PageSave"
         * @const
         */
        PageSave = "PageSave";

        /**
         * value: "PageBack"
         * @const
         */
        PageBack = "PageBack";

        /**
         * value: "WizardButton1"
         * @const
         */
        WizardButton1 = "WizardButton1";

        /**
         * value: "WizardButton2"
         * @const
         */
        WizardButton2 = "WizardButton2";

        /**
         * value: "WizardButton3"
         * @const
         */
        WizardButton3 = "WizardButton3";


    /**
    * Returns a <code>EnumsUICommandType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/EnumsUICommandType} The enum <code>EnumsUICommandType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
