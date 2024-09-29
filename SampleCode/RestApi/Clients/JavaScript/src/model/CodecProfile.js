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
import CodecType from './CodecType';
import ProfileCondition from './ProfileCondition';

/**
* The CodecProfile model module.
* @module model/CodecProfile
* @version 4.8.10.0
*/
export default class CodecProfile {
    /**
    * Constructs a new <code>CodecProfile</code>.
    * @alias module:model/CodecProfile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>CodecProfile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/CodecProfile} obj Optional instance to populate.
    * @return {module:model/CodecProfile} The populated <code>CodecProfile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CodecProfile();
                        
            
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = CodecType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('Conditions')) {
                obj['Conditions'] = ApiClient.convertToType(data['Conditions'], [ProfileCondition]);
            }
            if (data.hasOwnProperty('ApplyConditions')) {
                obj['ApplyConditions'] = ApiClient.convertToType(data['ApplyConditions'], [ProfileCondition]);
            }
            if (data.hasOwnProperty('Codec')) {
                obj['Codec'] = ApiClient.convertToType(data['Codec'], 'String');
            }
            if (data.hasOwnProperty('Container')) {
                obj['Container'] = ApiClient.convertToType(data['Container'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/CodecType} Type
    */
    'Type' = undefined;
    /**
    * @member {Array.<module:model/ProfileCondition>} Conditions
    */
    'Conditions' = undefined;
    /**
    * @member {Array.<module:model/ProfileCondition>} ApplyConditions
    */
    'ApplyConditions' = undefined;
    /**
    * @member {String} Codec
    */
    'Codec' = undefined;
    /**
    * @member {String} Container
    */
    'Container' = undefined;




}
