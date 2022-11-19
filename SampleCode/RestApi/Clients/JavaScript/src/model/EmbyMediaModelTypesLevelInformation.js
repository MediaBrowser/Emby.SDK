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
import EmbyMediaModelTypesBitRate from './EmbyMediaModelTypesBitRate';
import EmbyMediaModelTypesResolutionWithRate from './EmbyMediaModelTypesResolutionWithRate';

/**
* The EmbyMediaModelTypesLevelInformation model module.
* @module model/EmbyMediaModelTypesLevelInformation
* @version 4.8.0.18
*/
export default class EmbyMediaModelTypesLevelInformation {
    /**
    * Constructs a new <code>EmbyMediaModelTypesLevelInformation</code>.
    * @alias module:model/EmbyMediaModelTypesLevelInformation
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyMediaModelTypesLevelInformation</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyMediaModelTypesLevelInformation} obj Optional instance to populate.
    * @return {module:model/EmbyMediaModelTypesLevelInformation} The populated <code>EmbyMediaModelTypesLevelInformation</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyMediaModelTypesLevelInformation();
                        
            
            if (data.hasOwnProperty('ShortName')) {
                obj['ShortName'] = ApiClient.convertToType(data['ShortName'], 'String');
            }
            if (data.hasOwnProperty('Description')) {
                obj['Description'] = ApiClient.convertToType(data['Description'], 'String');
            }
            if (data.hasOwnProperty('Ordinal')) {
                obj['Ordinal'] = ApiClient.convertToType(data['Ordinal'], 'Number');
            }
            if (data.hasOwnProperty('MaxBitRate')) {
                obj['MaxBitRate'] = EmbyMediaModelTypesBitRate.constructFromObject(data['MaxBitRate']);
            }
            if (data.hasOwnProperty('MaxBitRateDisplay')) {
                obj['MaxBitRateDisplay'] = ApiClient.convertToType(data['MaxBitRateDisplay'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('ResolutionRates')) {
                obj['ResolutionRates'] = ApiClient.convertToType(data['ResolutionRates'], [EmbyMediaModelTypesResolutionWithRate]);
            }
            if (data.hasOwnProperty('ResolutionRateStrings')) {
                obj['ResolutionRateStrings'] = ApiClient.convertToType(data['ResolutionRateStrings'], ['String']);
            }
            if (data.hasOwnProperty('ResolutionRatesDisplay')) {
                obj['ResolutionRatesDisplay'] = ApiClient.convertToType(data['ResolutionRatesDisplay'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} ShortName
    */
    'ShortName' = undefined;
    /**
    * @member {String} Description
    */
    'Description' = undefined;
    /**
    * @member {Number} Ordinal
    */
    'Ordinal' = undefined;
    /**
    * @member {module:model/EmbyMediaModelTypesBitRate} MaxBitRate
    */
    'MaxBitRate' = undefined;
    /**
    * @member {String} MaxBitRateDisplay
    */
    'MaxBitRateDisplay' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {Array.<module:model/EmbyMediaModelTypesResolutionWithRate>} ResolutionRates
    */
    'ResolutionRates' = undefined;
    /**
    * @member {Array.<String>} ResolutionRateStrings
    */
    'ResolutionRateStrings' = undefined;
    /**
    * @member {String} ResolutionRatesDisplay
    */
    'ResolutionRatesDisplay' = undefined;




}
