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
import DlnaSubtitleDeliveryMethod from './DlnaSubtitleDeliveryMethod';

/**
* The DlnaSubtitleProfile model module.
* @module model/DlnaSubtitleProfile
* @version 4.8.0.20
*/
export default class DlnaSubtitleProfile {
    /**
    * Constructs a new <code>DlnaSubtitleProfile</code>.
    * @alias module:model/DlnaSubtitleProfile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DlnaSubtitleProfile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DlnaSubtitleProfile} obj Optional instance to populate.
    * @return {module:model/DlnaSubtitleProfile} The populated <code>DlnaSubtitleProfile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DlnaSubtitleProfile();
                        
            
            if (data.hasOwnProperty('Format')) {
                obj['Format'] = ApiClient.convertToType(data['Format'], 'String');
            }
            if (data.hasOwnProperty('Method')) {
                obj['Method'] = DlnaSubtitleDeliveryMethod.constructFromObject(data['Method']);
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
    * @member {module:model/DlnaSubtitleDeliveryMethod} Method
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
