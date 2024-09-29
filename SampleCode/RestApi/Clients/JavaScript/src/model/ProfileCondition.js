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
import ProfileConditionType from './ProfileConditionType';
import ProfileConditionValue from './ProfileConditionValue';

/**
* The ProfileCondition model module.
* @module model/ProfileCondition
* @version 4.8.10.0
*/
export default class ProfileCondition {
    /**
    * Constructs a new <code>ProfileCondition</code>.
    * @alias module:model/ProfileCondition
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ProfileCondition</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ProfileCondition} obj Optional instance to populate.
    * @return {module:model/ProfileCondition} The populated <code>ProfileCondition</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProfileCondition();
                        
            
            if (data.hasOwnProperty('Condition')) {
                obj['Condition'] = ProfileConditionType.constructFromObject(data['Condition']);
            }
            if (data.hasOwnProperty('Property')) {
                obj['Property'] = ProfileConditionValue.constructFromObject(data['Property']);
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
    * @member {module:model/ProfileConditionType} Condition
    */
    'Condition' = undefined;
    /**
    * @member {module:model/ProfileConditionValue} Property
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
