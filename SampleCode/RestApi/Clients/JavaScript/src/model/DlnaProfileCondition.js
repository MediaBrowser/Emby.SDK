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
import DlnaProfileConditionType from './DlnaProfileConditionType';
import DlnaProfileConditionValue from './DlnaProfileConditionValue';

/**
* The DlnaProfileCondition model module.
* @module model/DlnaProfileCondition
* @version 4.8.0.43
*/
export default class DlnaProfileCondition {
    /**
    * Constructs a new <code>DlnaProfileCondition</code>.
    * @alias module:model/DlnaProfileCondition
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DlnaProfileCondition</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DlnaProfileCondition} obj Optional instance to populate.
    * @return {module:model/DlnaProfileCondition} The populated <code>DlnaProfileCondition</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DlnaProfileCondition();
                        
            
            if (data.hasOwnProperty('Condition')) {
                obj['Condition'] = DlnaProfileConditionType.constructFromObject(data['Condition']);
            }
            if (data.hasOwnProperty('Property')) {
                obj['Property'] = DlnaProfileConditionValue.constructFromObject(data['Property']);
            }
            if (data.hasOwnProperty('Value')) {
                obj['Value'] = ApiClient.convertToType(data['Value'], 'String');
            }
            if (data.hasOwnProperty('IsRequired')) {
                obj['IsRequired'] = ApiClient.convertToType(data['IsRequired'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/DlnaProfileConditionType} Condition
    */
    'Condition' = undefined;
    /**
    * @member {module:model/DlnaProfileConditionValue} Property
    */
    'Property' = undefined;
    /**
    * @member {String} Value
    */
    'Value' = undefined;
    /**
    * @member {Boolean} IsRequired
    */
    'IsRequired' = undefined;




}
