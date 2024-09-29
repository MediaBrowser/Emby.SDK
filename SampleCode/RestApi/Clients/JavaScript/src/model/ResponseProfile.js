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
import DlnaProfileType from './DlnaProfileType';
import ProfileCondition from './ProfileCondition';

/**
* The ResponseProfile model module.
* @module model/ResponseProfile
* @version 4.8.10.0
*/
export default class ResponseProfile {
    /**
    * Constructs a new <code>ResponseProfile</code>.
    * @alias module:model/ResponseProfile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ResponseProfile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ResponseProfile} obj Optional instance to populate.
    * @return {module:model/ResponseProfile} The populated <code>ResponseProfile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ResponseProfile();
                        
            
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
                obj['Type'] = DlnaProfileType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('OrgPn')) {
                obj['OrgPn'] = ApiClient.convertToType(data['OrgPn'], 'String');
            }
            if (data.hasOwnProperty('MimeType')) {
                obj['MimeType'] = ApiClient.convertToType(data['MimeType'], 'String');
            }
            if (data.hasOwnProperty('Conditions')) {
                obj['Conditions'] = ApiClient.convertToType(data['Conditions'], [ProfileCondition]);
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
    * @member {module:model/DlnaProfileType} Type
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
    * @member {Array.<module:model/ProfileCondition>} Conditions
    */
    'Conditions' = undefined;




}
