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
* The GlobalizationCountryInfo model module.
* @module model/GlobalizationCountryInfo
* @version 4.8.10.0
*/
export default class GlobalizationCountryInfo {
    /**
    * Constructs a new <code>GlobalizationCountryInfo</code>.
    * Class CountryInfo  
    * @alias module:model/GlobalizationCountryInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>GlobalizationCountryInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/GlobalizationCountryInfo} obj Optional instance to populate.
    * @return {module:model/GlobalizationCountryInfo} The populated <code>GlobalizationCountryInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GlobalizationCountryInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('DisplayName')) {
                obj['DisplayName'] = ApiClient.convertToType(data['DisplayName'], 'String');
            }
            if (data.hasOwnProperty('EnglishName')) {
                obj['EnglishName'] = ApiClient.convertToType(data['EnglishName'], 'String');
            }
            if (data.hasOwnProperty('TwoLetterISORegionName')) {
                obj['TwoLetterISORegionName'] = ApiClient.convertToType(data['TwoLetterISORegionName'], 'String');
            }
            if (data.hasOwnProperty('ThreeLetterISORegionName')) {
                obj['ThreeLetterISORegionName'] = ApiClient.convertToType(data['ThreeLetterISORegionName'], 'String');
            }
        }
        return obj;
    }

    /**
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * The display name.
    * @member {String} DisplayName
    */
    'DisplayName' = undefined;
    /**
    * The English name.
    * @member {String} EnglishName
    */
    'EnglishName' = undefined;
    /**
    * The name of the two letter ISO region.
    * @member {String} TwoLetterISORegionName
    */
    'TwoLetterISORegionName' = undefined;
    /**
    * The name of the three letter ISO region.
    * @member {String} ThreeLetterISORegionName
    */
    'ThreeLetterISORegionName' = undefined;




}
