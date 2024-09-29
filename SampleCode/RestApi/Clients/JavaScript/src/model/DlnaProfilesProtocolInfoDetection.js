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

/**
* The DlnaProfilesProtocolInfoDetection model module.
* @module model/DlnaProfilesProtocolInfoDetection
* @version 4.8.10.0
*/
export default class DlnaProfilesProtocolInfoDetection {
    /**
    * Constructs a new <code>DlnaProfilesProtocolInfoDetection</code>.
    * @alias module:model/DlnaProfilesProtocolInfoDetection
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DlnaProfilesProtocolInfoDetection</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DlnaProfilesProtocolInfoDetection} obj Optional instance to populate.
    * @return {module:model/DlnaProfilesProtocolInfoDetection} The populated <code>DlnaProfilesProtocolInfoDetection</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DlnaProfilesProtocolInfoDetection();
                        
            
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
