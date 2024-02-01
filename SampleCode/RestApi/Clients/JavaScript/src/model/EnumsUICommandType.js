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
* Enum class EnumsUICommandType.
* @enum {}
* @readonly
*/
export default class EnumsUICommandType {
        /**
         * value: "Custom"
         * @const
         */
        custom = "Custom";

        /**
         * value: "WizardCancel"
         * @const
         */
        wizardCancel = "WizardCancel";

        /**
         * value: "WizardBack"
         * @const
         */
        wizardBack = "WizardBack";

        /**
         * value: "WizardNext"
         * @const
         */
        wizardNext = "WizardNext";

        /**
         * value: "WizardFinish"
         * @const
         */
        wizardFinish = "WizardFinish";

        /**
         * value: "DialogCancel"
         * @const
         */
        dialogCancel = "DialogCancel";

        /**
         * value: "DialogOk"
         * @const
         */
        dialogOk = "DialogOk";

        /**
         * value: "PageSave"
         * @const
         */
        pageSave = "PageSave";

        /**
         * value: "PageBack"
         * @const
         */
        pageBack = "PageBack";

        /**
         * value: "WizardButton1"
         * @const
         */
        wizardButton1 = "WizardButton1";

        /**
         * value: "WizardButton2"
         * @const
         */
        wizardButton2 = "WizardButton2";

        /**
         * value: "WizardButton3"
         * @const
         */
        wizardButton3 = "WizardButton3";


    /**
    * Returns a <code>EnumsUICommandType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/EnumsUICommandType} The enum <code>EnumsUICommandType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
