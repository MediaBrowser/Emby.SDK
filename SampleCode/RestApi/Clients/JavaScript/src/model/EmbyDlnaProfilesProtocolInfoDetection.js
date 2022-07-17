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

/**
* The EmbyDlnaProfilesProtocolInfoDetection model module.
* @module model/EmbyDlnaProfilesProtocolInfoDetection
* @version 4.8.0.6
*/
export default class EmbyDlnaProfilesProtocolInfoDetection {
    /**
    * Constructs a new <code>EmbyDlnaProfilesProtocolInfoDetection</code>.
    * @alias module:model/EmbyDlnaProfilesProtocolInfoDetection
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyDlnaProfilesProtocolInfoDetection</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyDlnaProfilesProtocolInfoDetection} obj Optional instance to populate.
    * @return {module:model/EmbyDlnaProfilesProtocolInfoDetection} The populated <code>EmbyDlnaProfilesProtocolInfoDetection</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyDlnaProfilesProtocolInfoDetection();
                        
            
            if (data.hasOwnProperty('EnabledForVideo')) {
                obj['EnabledForVideo'] = ApiClient.convertToType(data['EnabledForVideo'], 'Boolean');
            }
            if (data.hasOwnProperty('EnabledForAudio')) {
                obj['EnabledForAudio'] = ApiClient.convertToType(data['EnabledForAudio'], 'Boolean');
            }
            if (data.hasOwnProperty('EnabledForPhotos')) {
                obj['EnabledForPhotos'] = ApiClient.convertToType(data['EnabledForPhotos'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} EnabledForVideo
    */
    'EnabledForVideo' = undefined;
    /**
    * @member {Boolean} EnabledForAudio
    */
    'EnabledForAudio' = undefined;
    /**
    * @member {Boolean} EnabledForPhotos
    */
    'EnabledForPhotos' = undefined;




}
