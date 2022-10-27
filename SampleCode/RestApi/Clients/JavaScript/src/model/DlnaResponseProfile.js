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
import DlnaDlnaProfileType from './DlnaDlnaProfileType';
import DlnaProfileCondition from './DlnaProfileCondition';

/**
* The DlnaResponseProfile model module.
* @module model/DlnaResponseProfile
* @version 4.8.0.14
*/
export default class DlnaResponseProfile {
    /**
    * Constructs a new <code>DlnaResponseProfile</code>.
    * @alias module:model/DlnaResponseProfile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DlnaResponseProfile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DlnaResponseProfile} obj Optional instance to populate.
    * @return {module:model/DlnaResponseProfile} The populated <code>DlnaResponseProfile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DlnaResponseProfile();
                        
            
            if (data.hasOwnProperty('Container')) {
                obj['Container'] = ApiClient.convertToType(data['Container'], 'String');
            }
            if (data.hasOwnProperty('AudioCodec')) {
                obj['AudioCodec'] = ApiClient.convertToType(data['AudioCodec'], 'String');
            }
            if (data.hasOwnProperty('VideoCodec')) {
                obj['VideoCodec'] = ApiClient.convertToType(data['VideoCodec'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = DlnaDlnaProfileType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('OrgPn')) {
                obj['OrgPn'] = ApiClient.convertToType(data['OrgPn'], 'String');
            }
            if (data.hasOwnProperty('MimeType')) {
                obj['MimeType'] = ApiClient.convertToType(data['MimeType'], 'String');
            }
            if (data.hasOwnProperty('Conditions')) {
                obj['Conditions'] = ApiClient.convertToType(data['Conditions'], [DlnaProfileCondition]);
            }
        }
        return obj;
    }

    /**
    * @member {String} Container
    */
    'Container' = undefined;
    /**
    * @member {String} AudioCodec
    */
    'AudioCodec' = undefined;
    /**
    * @member {String} VideoCodec
    */
    'VideoCodec' = undefined;
    /**
    * @member {module:model/DlnaDlnaProfileType} Type
    */
    'Type' = undefined;
    /**
    * @member {String} OrgPn
    */
    'OrgPn' = undefined;
    /**
    * @member {String} MimeType
    */
    'MimeType' = undefined;
    /**
    * @member {Array.<module:model/DlnaProfileCondition>} Conditions
    */
    'Conditions' = undefined;




}
