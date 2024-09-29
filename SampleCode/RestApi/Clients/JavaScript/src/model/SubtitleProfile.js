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
import SubtitleDeliveryMethod from './SubtitleDeliveryMethod';

/**
* The SubtitleProfile model module.
* @module model/SubtitleProfile
* @version 4.8.10.0
*/
export default class SubtitleProfile {
    /**
    * Constructs a new <code>SubtitleProfile</code>.
    * @alias module:model/SubtitleProfile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SubtitleProfile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SubtitleProfile} obj Optional instance to populate.
    * @return {module:model/SubtitleProfile} The populated <code>SubtitleProfile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SubtitleProfile();
                        
            
            if (data.hasOwnProperty('Format')) {
                obj['Format'] = ApiClient.convertToType(data['Format'], 'String');
            }
            if (data.hasOwnProperty('Method')) {
                obj['Method'] = SubtitleDeliveryMethod.constructFromObject(data['Method']);
            }
            if (data.hasOwnProperty('DidlMode')) {
                obj['DidlMode'] = ApiClient.convertToType(data['DidlMode'], 'String');
            }
            if (data.hasOwnProperty('Language')) {
                obj['Language'] = ApiClient.convertToType(data['Language'], 'String');
            }
            if (data.hasOwnProperty('Container')) {
                obj['Container'] = ApiClient.convertToType(data['Container'], 'String');
            }
            if (data.hasOwnProperty('Protocol')) {
                obj['Protocol'] = ApiClient.convertToType(data['Protocol'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Format
    */
    'Format' = undefined;
    /**
    * @member {module:model/SubtitleDeliveryMethod} Method
    */
    'Method' = undefined;
    /**
    * @member {String} DidlMode
    */
    'DidlMode' = undefined;
    /**
    * @member {String} Language
    */
    'Language' = undefined;
    /**
    * @member {String} Container
    */
    'Container' = undefined;
    /**
    * @member {String} Protocol
    */
    'Protocol' = undefined;




}
