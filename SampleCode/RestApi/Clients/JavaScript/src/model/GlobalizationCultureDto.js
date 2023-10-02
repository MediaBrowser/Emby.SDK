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
* The GlobalizationCultureDto model module.
* @module model/GlobalizationCultureDto
* @version 4.8.0.50
*/
export default class GlobalizationCultureDto {
    /**
    * Constructs a new <code>GlobalizationCultureDto</code>.
    * @alias module:model/GlobalizationCultureDto
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>GlobalizationCultureDto</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/GlobalizationCultureDto} obj Optional instance to populate.
    * @return {module:model/GlobalizationCultureDto} The populated <code>GlobalizationCultureDto</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GlobalizationCultureDto();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('DisplayName')) {
                obj['DisplayName'] = ApiClient.convertToType(data['DisplayName'], 'String');
            }
            if (data.hasOwnProperty('TwoLetterISOLanguageName')) {
                obj['TwoLetterISOLanguageName'] = ApiClient.convertToType(data['TwoLetterISOLanguageName'], 'String');
            }
            if (data.hasOwnProperty('ThreeLetterISOLanguageName')) {
                obj['ThreeLetterISOLanguageName'] = ApiClient.convertToType(data['ThreeLetterISOLanguageName'], 'String');
            }
            if (data.hasOwnProperty('ThreeLetterISOLanguageNames')) {
                obj['ThreeLetterISOLanguageNames'] = ApiClient.convertToType(data['ThreeLetterISOLanguageNames'], ['String']);
            }
            if (data.hasOwnProperty('TwoLetterISOLanguageNames')) {
                obj['TwoLetterISOLanguageNames'] = ApiClient.convertToType(data['TwoLetterISOLanguageNames'], ['String']);
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} DisplayName
    */
    'DisplayName' = undefined;
    /**
    * @member {String} TwoLetterISOLanguageName
    */
    'TwoLetterISOLanguageName' = undefined;
    /**
    * @member {String} ThreeLetterISOLanguageName
    */
    'ThreeLetterISOLanguageName' = undefined;
    /**
    * @member {Array.<String>} ThreeLetterISOLanguageNames
    */
    'ThreeLetterISOLanguageNames' = undefined;
    /**
    * @member {Array.<String>} TwoLetterISOLanguageNames
    */
    'TwoLetterISOLanguageNames' = undefined;




}
