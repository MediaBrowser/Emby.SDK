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
* The MediaEncodingHwaConditionsConfigAdvancedConditions model module.
* @module model/MediaEncodingHwaConditionsConfigAdvancedConditions
* @version 4.11.0.19
*/
export default class MediaEncodingHwaConditionsConfigAdvancedConditions {
    /**
    * Constructs a new <code>MediaEncodingHwaConditionsConfigAdvancedConditions</code>.
    * @alias module:model/MediaEncodingHwaConditionsConfigAdvancedConditions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingHwaConditionsConfigAdvancedConditions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingHwaConditionsConfigAdvancedConditions} obj Optional instance to populate.
    * @return {module:model/MediaEncodingHwaConditionsConfigAdvancedConditions} The populated <code>MediaEncodingHwaConditionsConfigAdvancedConditions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingHwaConditionsConfigAdvancedConditions();
                        
            
            if (data.hasOwnProperty('FilterString')) {
                obj['FilterString'] = ApiClient.convertToType(data['FilterString'], 'String');
            }
            if (data.hasOwnProperty('DataFilterString')) {
                obj['DataFilterString'] = ApiClient.convertToType(data['DataFilterString'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} FilterString
    */
    'FilterString' = undefined;
    /**
    * @member {String} DataFilterString
    */
    'DataFilterString' = undefined;




}
