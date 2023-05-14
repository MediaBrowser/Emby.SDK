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
import DlnaCodecType from './DlnaCodecType';
import DlnaProfileCondition from './DlnaProfileCondition';

/**
* The DlnaCodecProfile model module.
* @module model/DlnaCodecProfile
* @version 4.8.0.35
*/
export default class DlnaCodecProfile {
    /**
    * Constructs a new <code>DlnaCodecProfile</code>.
    * @alias module:model/DlnaCodecProfile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DlnaCodecProfile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DlnaCodecProfile} obj Optional instance to populate.
    * @return {module:model/DlnaCodecProfile} The populated <code>DlnaCodecProfile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DlnaCodecProfile();
                        
            
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = DlnaCodecType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('Conditions')) {
                obj['Conditions'] = ApiClient.convertToType(data['Conditions'], [DlnaProfileCondition]);
            }
            if (data.hasOwnProperty('ApplyConditions')) {
                obj['ApplyConditions'] = ApiClient.convertToType(data['ApplyConditions'], [DlnaProfileCondition]);
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
    * @member {module:model/DlnaCodecType} Type
    */
    'Type' = undefined;
    /**
    * @member {Array.<module:model/DlnaProfileCondition>} Conditions
    */
    'Conditions' = undefined;
    /**
    * @member {Array.<module:model/DlnaProfileCondition>} ApplyConditions
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
