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
import CodecProfile from './CodecProfile';
import ContainerProfile from './ContainerProfile';
import DirectPlayProfile from './DirectPlayProfile';
import ResponseProfile from './ResponseProfile';
import SubtitleProfile from './SubtitleProfile';
import TranscodingProfile from './TranscodingProfile';

/**
* The DeviceProfile model module.
* @module model/DeviceProfile
* @version 4.8.10.0
*/
export default class DeviceProfile {
    /**
    * Constructs a new <code>DeviceProfile</code>.
    * @alias module:model/DeviceProfile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DeviceProfile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DeviceProfile} obj Optional instance to populate.
    * @return {module:model/DeviceProfile} The populated <code>DeviceProfile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DeviceProfile();
                        
            
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
                obj['DirectPlayProfiles'] = ApiClient.convertToType(data['DirectPlayProfiles'], [DirectPlayProfile]);
            }
            if (data.hasOwnProperty('TranscodingProfiles')) {
                obj['TranscodingProfiles'] = ApiClient.convertToType(data['TranscodingProfiles'], [TranscodingProfile]);
            }
            if (data.hasOwnProperty('ContainerProfiles')) {
                obj['ContainerProfiles'] = ApiClient.convertToType(data['ContainerProfiles'], [ContainerProfile]);
            }
            if (data.hasOwnProperty('CodecProfiles')) {
                obj['CodecProfiles'] = ApiClient.convertToType(data['CodecProfiles'], [CodecProfile]);
            }
            if (data.hasOwnProperty('ResponseProfiles')) {
                obj['ResponseProfiles'] = ApiClient.convertToType(data['ResponseProfiles'], [ResponseProfile]);
            }
            if (data.hasOwnProperty('SubtitleProfiles')) {
                obj['SubtitleProfiles'] = ApiClient.convertToType(data['SubtitleProfiles'], [SubtitleProfile]);
            }
        }
        return obj;
    }

    /**
    * The name.
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
    * The direct play profiles.
    * @member {Array.<module:model/DirectPlayProfile>} DirectPlayProfiles
    */
    'DirectPlayProfiles' = undefined;
    /**
    * The transcoding profiles.
    * @member {Array.<module:model/TranscodingProfile>} TranscodingProfiles
    */
    'TranscodingProfiles' = undefined;
    /**
    * @member {Array.<module:model/ContainerProfile>} ContainerProfiles
    */
    'ContainerProfiles' = undefined;
    /**
    * @member {Array.<module:model/CodecProfile>} CodecProfiles
    */
    'CodecProfiles' = undefined;
    /**
    * @member {Array.<module:model/ResponseProfile>} ResponseProfiles
    */
    'ResponseProfiles' = undefined;
    /**
    * @member {Array.<module:model/SubtitleProfile>} SubtitleProfiles
    */
    'SubtitleProfiles' = undefined;




}
