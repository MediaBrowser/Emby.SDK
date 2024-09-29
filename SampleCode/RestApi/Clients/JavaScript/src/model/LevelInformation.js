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
import BitRate from './BitRate';
import ResolutionWithRate from './ResolutionWithRate';

/**
* The LevelInformation model module.
* @module model/LevelInformation
* @version 4.8.10.0
*/
export default class LevelInformation {
    /**
    * Constructs a new <code>LevelInformation</code>.
    * Class for unified presentation of all information associated with a specific codec level.  
    * @alias module:model/LevelInformation
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LevelInformation</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LevelInformation} obj Optional instance to populate.
    * @return {module:model/LevelInformation} The populated <code>LevelInformation</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LevelInformation();
                        
            
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
                obj['MaxBitRate'] = BitRate.constructFromObject(data['MaxBitRate']);
            }
            if (data.hasOwnProperty('MaxBitRateDisplay')) {
                obj['MaxBitRateDisplay'] = ApiClient.convertToType(data['MaxBitRateDisplay'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('ResolutionRates')) {
                obj['ResolutionRates'] = ApiClient.convertToType(data['ResolutionRates'], [ResolutionWithRate]);
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
    * The enum member name of the level.
    * @member {String} ShortName
    */
    'ShortName' = undefined;
    /**
    * The common name of the level.
    * @member {String} Description
    */
    'Description' = undefined;
    /**
    * A value indicating the level's ranking relative to other levels.
    * @member {Number} Ordinal
    */
    'Ordinal' = undefined;
    /**
    * @member {module:model/BitRate} MaxBitRate
    */
    'MaxBitRate' = undefined;
    /**
    * A display value of the `Emby.Media.Model.Types.LevelInformation.MaxBitRate` property.
    * @member {String} MaxBitRateDisplay
    */
    'MaxBitRateDisplay' = undefined;
    /**
    * A unique identifier.
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * Examples for the maximum supported combinations of resolution and rate for this level.
    * @member {Array.<module:model/ResolutionWithRate>} ResolutionRates
    */
    'ResolutionRates' = undefined;
    /**
    * Examples for the maximum supported combinations of resolution and rate for this level as string values.
    * @member {Array.<String>} ResolutionRateStrings
    */
    'ResolutionRateStrings' = undefined;
    /**
    * A single string from the `Emby.Media.Model.Types.LevelInformation.ResolutionRateStrings` list.
    * @member {String} ResolutionRatesDisplay
    */
    'ResolutionRatesDisplay' = undefined;




}
