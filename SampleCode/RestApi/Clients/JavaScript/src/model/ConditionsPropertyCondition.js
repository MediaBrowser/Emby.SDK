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
import AttributesSimpleCondition from './AttributesSimpleCondition';
import AttributesValueCondition from './AttributesValueCondition';
import ConditionsPropertyConditionType from './ConditionsPropertyConditionType';

/**
* The ConditionsPropertyCondition model module.
* @module model/ConditionsPropertyCondition
* @version 4.8.10.0
*/
export default class ConditionsPropertyCondition {
    /**
    * Constructs a new <code>ConditionsPropertyCondition</code>.
    * @alias module:model/ConditionsPropertyCondition
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ConditionsPropertyCondition</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ConditionsPropertyCondition} obj Optional instance to populate.
    * @return {module:model/ConditionsPropertyCondition} The populated <code>ConditionsPropertyCondition</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConditionsPropertyCondition();
                        
            
            if (data.hasOwnProperty('AffectedPropertyId')) {
                obj['AffectedPropertyId'] = ApiClient.convertToType(data['AffectedPropertyId'], 'String');
            }
            if (data.hasOwnProperty('ConditionType')) {
                obj['ConditionType'] = ConditionsPropertyConditionType.constructFromObject(data['ConditionType']);
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
    * @member {module:model/ConditionsPropertyConditionType} ConditionType
    */
    'ConditionType' = undefined;
    /**
    * The target property name or path.
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
    * The value.
    * @member {Object} Value
    */
    'Value' = undefined;




}
