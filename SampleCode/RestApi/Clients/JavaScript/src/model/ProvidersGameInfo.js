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
import GlobalizationCultureDto from './GlobalizationCultureDto';
import ProviderIdDictionary from './ProviderIdDictionary';

/**
* The ProvidersGameInfo model module.
* @module model/ProvidersGameInfo
* @version 4.8.0.29
*/
export default class ProvidersGameInfo {
    /**
    * Constructs a new <code>ProvidersGameInfo</code>.
    * @alias module:model/ProvidersGameInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ProvidersGameInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ProvidersGameInfo} obj Optional instance to populate.
    * @return {module:model/ProvidersGameInfo} The populated <code>ProvidersGameInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProvidersGameInfo();
                        
            
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
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} MetadataLanguage
    */
    'MetadataLanguage' = undefined;
    /**
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
