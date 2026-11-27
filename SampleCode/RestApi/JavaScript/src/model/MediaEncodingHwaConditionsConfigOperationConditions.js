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
* The MediaEncodingHwaConditionsConfigOperationConditions model module.
* @module model/MediaEncodingHwaConditionsConfigOperationConditions
* @version 4.11.0.19
*/
export default class MediaEncodingHwaConditionsConfigOperationConditions {
    /**
    * Constructs a new <code>MediaEncodingHwaConditionsConfigOperationConditions</code>.
    * @alias module:model/MediaEncodingHwaConditionsConfigOperationConditions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingHwaConditionsConfigOperationConditions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingHwaConditionsConfigOperationConditions} obj Optional instance to populate.
    * @return {module:model/MediaEncodingHwaConditionsConfigOperationConditions} The populated <code>MediaEncodingHwaConditionsConfigOperationConditions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingHwaConditionsConfigOperationConditions();
                        
            
            if (data.hasOwnProperty('Conversions')) {
                obj['Conversions'] = ApiClient.convertToType(data['Conversions'], 'Boolean');
            }
            if (data.hasOwnProperty('LiveTV')) {
                obj['LiveTV'] = ApiClient.convertToType(data['LiveTV'], 'Boolean');
            }
            if (data.hasOwnProperty('Playback')) {
                obj['Playback'] = ApiClient.convertToType(data['Playback'], 'Boolean');
            }
            if (data.hasOwnProperty('HlsPlayback')) {
                obj['HlsPlayback'] = ApiClient.convertToType(data['HlsPlayback'], 'Boolean');
            }
            if (data.hasOwnProperty('LiveStream')) {
                obj['LiveStream'] = ApiClient.convertToType(data['LiveStream'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * Offline conversions which are not related to an active playback session
    * @member {Boolean} Conversions
    */
    'Conversions' = undefined;
    /**
    * Transcoding of Live TV
    * @member {Boolean} LiveTV
    */
    'LiveTV' = undefined;
    /**
    * Transcoding for an active playback session
    * @member {Boolean} Playback
    */
    'Playback' = undefined;
    /**
    * HLS Transcoding for an active playback session
    * @member {Boolean} HlsPlayback
    */
    'HlsPlayback' = undefined;
    /**
    * Transcoding of a live stream for an active playback session
    * @member {Boolean} LiveStream
    */
    'LiveStream' = undefined;




}
