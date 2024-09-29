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
import BitRate from './BitRate';
import CodecDirections from './CodecDirections';
import CodecKinds from './CodecKinds';
import ColorFormats from './ColorFormats';
import CommonInterfacesICodecDeviceInfo from './CommonInterfacesICodecDeviceInfo';
import ProfileLevelInformation from './ProfileLevelInformation';
import SecondaryFrameworks from './SecondaryFrameworks';
import VideoMediaTypes from './VideoMediaTypes';

/**
* The VideoCodecBase model module.
* @module model/VideoCodecBase
* @version 4.8.10.0
*/
export default class VideoCodecBase {
    /**
    * Constructs a new <code>VideoCodecBase</code>.
    * @alias module:model/VideoCodecBase
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>VideoCodecBase</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/VideoCodecBase} obj Optional instance to populate.
    * @return {module:model/VideoCodecBase} The populated <code>VideoCodecBase</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VideoCodecBase();
                        
            
            if (data.hasOwnProperty('CodecDeviceInfo')) {
                obj['CodecDeviceInfo'] = CommonInterfacesICodecDeviceInfo.constructFromObject(data['CodecDeviceInfo']);
            }
            if (data.hasOwnProperty('CodecKind')) {
                obj['CodecKind'] = CodecKinds.constructFromObject(data['CodecKind']);
            }
            if (data.hasOwnProperty('MediaTypeName')) {
                obj['MediaTypeName'] = ApiClient.convertToType(data['MediaTypeName'], 'String');
            }
            if (data.hasOwnProperty('VideoMediaType')) {
                obj['VideoMediaType'] = VideoMediaTypes.constructFromObject(data['VideoMediaType']);
            }
            if (data.hasOwnProperty('MinWidth')) {
                obj['MinWidth'] = ApiClient.convertToType(data['MinWidth'], 'Number');
            }
            if (data.hasOwnProperty('MaxWidth')) {
                obj['MaxWidth'] = ApiClient.convertToType(data['MaxWidth'], 'Number');
            }
            if (data.hasOwnProperty('MinHeight')) {
                obj['MinHeight'] = ApiClient.convertToType(data['MinHeight'], 'Number');
            }
            if (data.hasOwnProperty('MaxHeight')) {
                obj['MaxHeight'] = ApiClient.convertToType(data['MaxHeight'], 'Number');
            }
            if (data.hasOwnProperty('WidthAlignment')) {
                obj['WidthAlignment'] = ApiClient.convertToType(data['WidthAlignment'], 'Number');
            }
            if (data.hasOwnProperty('HeightAlignment')) {
                obj['HeightAlignment'] = ApiClient.convertToType(data['HeightAlignment'], 'Number');
            }
            if (data.hasOwnProperty('MaxBitRate')) {
                obj['MaxBitRate'] = BitRate.constructFromObject(data['MaxBitRate']);
            }
            if (data.hasOwnProperty('SupportedColorFormats')) {
                obj['SupportedColorFormats'] = ApiClient.convertToType(data['SupportedColorFormats'], [ColorFormats]);
            }
            if (data.hasOwnProperty('SupportedColorFormatStrings')) {
                obj['SupportedColorFormatStrings'] = ApiClient.convertToType(data['SupportedColorFormatStrings'], ['String']);
            }
            if (data.hasOwnProperty('ProfileAndLevelInformation')) {
                obj['ProfileAndLevelInformation'] = ApiClient.convertToType(data['ProfileAndLevelInformation'], [ProfileLevelInformation]);
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Direction')) {
                obj['Direction'] = CodecDirections.constructFromObject(data['Direction']);
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Description')) {
                obj['Description'] = ApiClient.convertToType(data['Description'], 'String');
            }
            if (data.hasOwnProperty('FrameworkCodec')) {
                obj['FrameworkCodec'] = ApiClient.convertToType(data['FrameworkCodec'], 'String');
            }
            if (data.hasOwnProperty('IsHardwareCodec')) {
                obj['IsHardwareCodec'] = ApiClient.convertToType(data['IsHardwareCodec'], 'Boolean');
            }
            if (data.hasOwnProperty('SecondaryFramework')) {
                obj['SecondaryFramework'] = SecondaryFrameworks.constructFromObject(data['SecondaryFramework']);
            }
            if (data.hasOwnProperty('SecondaryFrameworkCodec')) {
                obj['SecondaryFrameworkCodec'] = ApiClient.convertToType(data['SecondaryFrameworkCodec'], 'String');
            }
            if (data.hasOwnProperty('MaxInstanceCount')) {
                obj['MaxInstanceCount'] = ApiClient.convertToType(data['MaxInstanceCount'], 'Number');
            }
            if (data.hasOwnProperty('IsEnabledByDefault')) {
                obj['IsEnabledByDefault'] = ApiClient.convertToType(data['IsEnabledByDefault'], 'Boolean');
            }
            if (data.hasOwnProperty('DefaultPriority')) {
                obj['DefaultPriority'] = ApiClient.convertToType(data['DefaultPriority'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/CommonInterfacesICodecDeviceInfo} CodecDeviceInfo
    */
    'CodecDeviceInfo' = undefined;
    /**
    * @member {module:model/CodecKinds} CodecKind
    */
    'CodecKind' = undefined;
    /**
    * @member {String} MediaTypeName
    */
    'MediaTypeName' = undefined;
    /**
    * @member {module:model/VideoMediaTypes} VideoMediaType
    */
    'VideoMediaType' = undefined;
    /**
    * @member {Number} MinWidth
    */
    'MinWidth' = undefined;
    /**
    * @member {Number} MaxWidth
    */
    'MaxWidth' = undefined;
    /**
    * @member {Number} MinHeight
    */
    'MinHeight' = undefined;
    /**
    * @member {Number} MaxHeight
    */
    'MaxHeight' = undefined;
    /**
    * @member {Number} WidthAlignment
    */
    'WidthAlignment' = undefined;
    /**
    * @member {Number} HeightAlignment
    */
    'HeightAlignment' = undefined;
    /**
    * @member {module:model/BitRate} MaxBitRate
    */
    'MaxBitRate' = undefined;
    /**
    * @member {Array.<module:model/ColorFormats>} SupportedColorFormats
    */
    'SupportedColorFormats' = undefined;
    /**
    * @member {Array.<String>} SupportedColorFormatStrings
    */
    'SupportedColorFormatStrings' = undefined;
    /**
    * @member {Array.<module:model/ProfileLevelInformation>} ProfileAndLevelInformation
    */
    'ProfileAndLevelInformation' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {module:model/CodecDirections} Direction
    */
    'Direction' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Description
    */
    'Description' = undefined;
    /**
    * @member {String} FrameworkCodec
    */
    'FrameworkCodec' = undefined;
    /**
    * @member {Boolean} IsHardwareCodec
    */
    'IsHardwareCodec' = undefined;
    /**
    * @member {module:model/SecondaryFrameworks} SecondaryFramework
    */
    'SecondaryFramework' = undefined;
    /**
    * @member {String} SecondaryFrameworkCodec
    */
    'SecondaryFrameworkCodec' = undefined;
    /**
    * @member {Number} MaxInstanceCount
    */
    'MaxInstanceCount' = undefined;
    /**
    * @member {Boolean} IsEnabledByDefault
    */
    'IsEnabledByDefault' = undefined;
    /**
    * @member {Number} DefaultPriority
    */
    'DefaultPriority' = undefined;




}
