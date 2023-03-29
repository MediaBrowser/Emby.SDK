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
import AttributesSimpleCondition from './AttributesSimpleCondition';
import AttributesValueCondition from './AttributesValueCondition';
import EmbyWebGenericEditConditionsPropertyConditionType from './EmbyWebGenericEditConditionsPropertyConditionType';

/**
* The EmbyWebGenericEditConditionsPropertyCondition model module.
* @module model/EmbyWebGenericEditConditionsPropertyCondition
* @version 4.8.0.27
*/
export default class EmbyWebGenericEditConditionsPropertyCondition {
    /**
    * Constructs a new <code>EmbyWebGenericEditConditionsPropertyCondition</code>.
    * @alias module:model/EmbyWebGenericEditConditionsPropertyCondition
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyWebGenericEditConditionsPropertyCondition</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyWebGenericEditConditionsPropertyCondition} obj Optional instance to populate.
    * @return {module:model/EmbyWebGenericEditConditionsPropertyCondition} The populated <code>EmbyWebGenericEditConditionsPropertyCondition</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyWebGenericEditConditionsPropertyCondition();
                        
            
            if (data.hasOwnProperty('AffectedPropertyId')) {
                obj['AffectedPropertyId'] = ApiClient.convertToType(data['AffectedPropertyId'], 'String');
            }
            if (data.hasOwnProperty('ConditionType')) {
                obj['ConditionType'] = EmbyWebGenericEditConditionsPropertyConditionType.constructFromObject(data['ConditionType']);
            }
            if (data.hasOwnProperty('TargetPropertyId')) {
                obj['TargetPropertyId'] = ApiClient.convertToType(data['TargetPropertyId'], 'String');
            }
            if (data.hasOwnProperty('SimpleCondition')) {
                obj['SimpleCondition'] = AttributesSimpleCondition.constructFromObject(data['SimpleCondition']);
            }
            if (data.hasOwnProperty('ValueCondition')) {
                obj['ValueCondition'] = AttributesValueCondition.constructFromObject(data['ValueCondition']);
            }
            if (data.hasOwnProperty('Value')) {
                obj['Value'] = ApiClient.convertToType(data['Value'], Object);
            }
        }
        return obj;
    }

    /**
    * @member {String} AffectedPropertyId
    */
    'AffectedPropertyId' = undefined;
    /**
    * @member {module:model/EmbyWebGenericEditConditionsPropertyConditionType} ConditionType
    */
    'ConditionType' = undefined;
    /**
    * @member {String} TargetPropertyId
    */
    'TargetPropertyId' = undefined;
    /**
    * @member {module:model/AttributesSimpleCondition} SimpleCondition
    */
    'SimpleCondition' = undefined;
    /**
    * @member {module:model/AttributesValueCondition} ValueCondition
    */
    'ValueCondition' = undefined;
    /**
    * @member {Object} Value
    */
    'Value' = undefined;




}
