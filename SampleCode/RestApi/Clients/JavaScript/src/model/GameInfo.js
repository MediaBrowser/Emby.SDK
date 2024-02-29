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
import GlobalizationCultureDto from './GlobalizationCultureDto';
import ProviderIdDictionary from './ProviderIdDictionary';

/**
* The GameInfo model module.
* @module model/GameInfo
* @version 4.8.3.0
*/
export default class GameInfo {
    /**
    * Constructs a new <code>GameInfo</code>.
    * @alias module:model/GameInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>GameInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/GameInfo} obj Optional instance to populate.
    * @return {module:model/GameInfo} The populated <code>GameInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GameInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('MetadataLanguage')) {
                obj['MetadataLanguage'] = ApiClient.convertToType(data['MetadataLanguage'], 'String');
            }
            if (data.hasOwnProperty('MetadataCountryCode')) {
                obj['MetadataCountryCode'] = ApiClient.convertToType(data['MetadataCountryCode'], 'String');
            }
            if (data.hasOwnProperty('MetadataLanguages')) {
                obj['MetadataLanguages'] = ApiClient.convertToType(data['MetadataLanguages'], [GlobalizationCultureDto]);
            }
            if (data.hasOwnProperty('ProviderIds')) {
                obj['ProviderIds'] = ProviderIdDictionary.constructFromObject(data['ProviderIds']);
            }
            if (data.hasOwnProperty('Year')) {
                obj['Year'] = ApiClient.convertToType(data['Year'], 'Number');
            }
            if (data.hasOwnProperty('IndexNumber')) {
                obj['IndexNumber'] = ApiClient.convertToType(data['IndexNumber'], 'Number');
            }
            if (data.hasOwnProperty('ParentIndexNumber')) {
                obj['ParentIndexNumber'] = ApiClient.convertToType(data['ParentIndexNumber'], 'Number');
            }
            if (data.hasOwnProperty('PremiereDate')) {
                obj['PremiereDate'] = ApiClient.convertToType(data['PremiereDate'], 'Date');
            }
            if (data.hasOwnProperty('IsAutomated')) {
                obj['IsAutomated'] = ApiClient.convertToType(data['IsAutomated'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableAdultMetadata')) {
                obj['EnableAdultMetadata'] = ApiClient.convertToType(data['EnableAdultMetadata'], 'Boolean');
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
    * The metadata language.
    * @member {String} MetadataLanguage
    */
    'MetadataLanguage' = undefined;
    /**
    * The metadata country code.
    * @member {String} MetadataCountryCode
    */
    'MetadataCountryCode' = undefined;
    /**
    * @member {Array.<module:model/GlobalizationCultureDto>} MetadataLanguages
    */
    'MetadataLanguages' = undefined;
    /**
    * @member {module:model/ProviderIdDictionary} ProviderIds
    */
    'ProviderIds' = undefined;
    /**
    * The year.
    * @member {Number} Year
    */
    'Year' = undefined;
    /**
    * @member {Number} IndexNumber
    */
    'IndexNumber' = undefined;
    /**
    * @member {Number} ParentIndexNumber
    */
    'ParentIndexNumber' = undefined;
    /**
    * @member {Date} PremiereDate
    */
    'PremiereDate' = undefined;
    /**
    * @member {Boolean} IsAutomated
    */
    'IsAutomated' = undefined;
    /**
    * @member {Boolean} EnableAdultMetadata
    */
    'EnableAdultMetadata' = undefined;




}
