/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.6
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ProviderIdDictionary from './ProviderIdDictionary';

/**
* The ProvidersBookInfo model module.
* @module model/ProvidersBookInfo
* @version 4.8.0.6
*/
export default class ProvidersBookInfo {
    /**
    * Constructs a new <code>ProvidersBookInfo</code>.
    * @alias module:model/ProvidersBookInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ProvidersBookInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ProvidersBookInfo} obj Optional instance to populate.
    * @return {module:model/ProvidersBookInfo} The populated <code>ProvidersBookInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProvidersBookInfo();
                        
            
            if (data.hasOwnProperty('SeriesName')) {
                obj['SeriesName'] = ApiClient.convertToType(data['SeriesName'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('MetadataLanguage')) {
                obj['MetadataLanguage'] = ApiClient.convertToType(data['MetadataLanguage'], 'String');
            }
            if (data.hasOwnProperty('MetadataCountryCode')) {
                obj['MetadataCountryCode'] = ApiClient.convertToType(data['MetadataCountryCode'], 'String');
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
    * @member {String} SeriesName
    */
    'SeriesName' = undefined;
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