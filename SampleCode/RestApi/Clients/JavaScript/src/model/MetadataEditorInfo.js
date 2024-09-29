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
import ExternalIdInfo from './ExternalIdInfo';
import GlobalizationCountryInfo from './GlobalizationCountryInfo';
import GlobalizationCultureDto from './GlobalizationCultureDto';
import ParentalRating from './ParentalRating';

/**
* The MetadataEditorInfo model module.
* @module model/MetadataEditorInfo
* @version 4.8.10.0
*/
export default class MetadataEditorInfo {
    /**
    * Constructs a new <code>MetadataEditorInfo</code>.
    * @alias module:model/MetadataEditorInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MetadataEditorInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MetadataEditorInfo} obj Optional instance to populate.
    * @return {module:model/MetadataEditorInfo} The populated <code>MetadataEditorInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MetadataEditorInfo();
                        
            
            if (data.hasOwnProperty('ParentalRatingOptions')) {
                obj['ParentalRatingOptions'] = ApiClient.convertToType(data['ParentalRatingOptions'], [ParentalRating]);
            }
            if (data.hasOwnProperty('Countries')) {
                obj['Countries'] = ApiClient.convertToType(data['Countries'], [GlobalizationCountryInfo]);
            }
            if (data.hasOwnProperty('Cultures')) {
                obj['Cultures'] = ApiClient.convertToType(data['Cultures'], [GlobalizationCultureDto]);
            }
            if (data.hasOwnProperty('ExternalIdInfos')) {
                obj['ExternalIdInfos'] = ApiClient.convertToType(data['ExternalIdInfos'], [ExternalIdInfo]);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/ParentalRating>} ParentalRatingOptions
    */
    'ParentalRatingOptions' = undefined;
    /**
    * @member {Array.<module:model/GlobalizationCountryInfo>} Countries
    */
    'Countries' = undefined;
    /**
    * @member {Array.<module:model/GlobalizationCultureDto>} Cultures
    */
    'Cultures' = undefined;
    /**
    * @member {Array.<module:model/ExternalIdInfo>} ExternalIdInfos
    */
    'ExternalIdInfos' = undefined;




}
