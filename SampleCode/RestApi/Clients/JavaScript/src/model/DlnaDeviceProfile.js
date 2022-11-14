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
import DlnaCodecProfile from './DlnaCodecProfile';
import DlnaContainerProfile from './DlnaContainerProfile';
import DlnaDirectPlayProfile from './DlnaDirectPlayProfile';
import DlnaResponseProfile from './DlnaResponseProfile';
import DlnaSubtitleProfile from './DlnaSubtitleProfile';
import DlnaTranscodingProfile from './DlnaTranscodingProfile';

/**
* The DlnaDeviceProfile model module.
* @module model/DlnaDeviceProfile
* @version 4.8.0.17
*/
export default class DlnaDeviceProfile {
    /**
    * Constructs a new <code>DlnaDeviceProfile</code>.
    * @alias module:model/DlnaDeviceProfile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DlnaDeviceProfile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DlnaDeviceProfile} obj Optional instance to populate.
    * @return {module:model/DlnaDeviceProfile} The populated <code>DlnaDeviceProfile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DlnaDeviceProfile();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('SupportedMediaTypes')) {
                obj['SupportedMediaTypes'] = ApiClient.convertToType(data['SupportedMediaTypes'], 'String');
            }
            if (data.hasOwnProperty('MaxStreamingBitrate')) {
                obj['MaxStreamingBitrate'] = ApiClient.convertToType(data['MaxStreamingBitrate'], 'Number');
            }
            if (data.hasOwnProperty('MusicStreamingTranscodingBitrate')) {
                obj['MusicStreamingTranscodingBitrate'] = ApiClient.convertToType(data['MusicStreamingTranscodingBitrate'], 'Number');
            }
            if (data.hasOwnProperty('MaxStaticMusicBitrate')) {
                obj['MaxStaticMusicBitrate'] = ApiClient.convertToType(data['MaxStaticMusicBitrate'], 'Number');
            }
            if (data.hasOwnProperty('DirectPlayProfiles')) {
                obj['DirectPlayProfiles'] = ApiClient.convertToType(data['DirectPlayProfiles'], [DlnaDirectPlayProfile]);
            }
            if (data.hasOwnProperty('TranscodingProfiles')) {
                obj['TranscodingProfiles'] = ApiClient.convertToType(data['TranscodingProfiles'], [DlnaTranscodingProfile]);
            }
            if (data.hasOwnProperty('ContainerProfiles')) {
                obj['ContainerProfiles'] = ApiClient.convertToType(data['ContainerProfiles'], [DlnaContainerProfile]);
            }
            if (data.hasOwnProperty('CodecProfiles')) {
                obj['CodecProfiles'] = ApiClient.convertToType(data['CodecProfiles'], [DlnaCodecProfile]);
            }
            if (data.hasOwnProperty('ResponseProfiles')) {
                obj['ResponseProfiles'] = ApiClient.convertToType(data['ResponseProfiles'], [DlnaResponseProfile]);
            }
            if (data.hasOwnProperty('SubtitleProfiles')) {
                obj['SubtitleProfiles'] = ApiClient.convertToType(data['SubtitleProfiles'], [DlnaSubtitleProfile]);
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} SupportedMediaTypes
    */
    'SupportedMediaTypes' = undefined;
    /**
    * @member {Number} MaxStreamingBitrate
    */
    'MaxStreamingBitrate' = undefined;
    /**
    * @member {Number} MusicStreamingTranscodingBitrate
    */
    'MusicStreamingTranscodingBitrate' = undefined;
    /**
    * @member {Number} MaxStaticMusicBitrate
    */
    'MaxStaticMusicBitrate' = undefined;
    /**
    * @member {Array.<module:model/DlnaDirectPlayProfile>} DirectPlayProfiles
    */
    'DirectPlayProfiles' = undefined;
    /**
    * @member {Array.<module:model/DlnaTranscodingProfile>} TranscodingProfiles
    */
    'TranscodingProfiles' = undefined;
    /**
    * @member {Array.<module:model/DlnaContainerProfile>} ContainerProfiles
    */
    'ContainerProfiles' = undefined;
    /**
    * @member {Array.<module:model/DlnaCodecProfile>} CodecProfiles
    */
    'CodecProfiles' = undefined;
    /**
    * @member {Array.<module:model/DlnaResponseProfile>} ResponseProfiles
    */
    'ResponseProfiles' = undefined;
    /**
    * @member {Array.<module:model/DlnaSubtitleProfile>} SubtitleProfiles
    */
    'SubtitleProfiles' = undefined;




}
