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
import EmbyMediaModelEnumsCodecDirections from './EmbyMediaModelEnumsCodecDirections';
import EmbyMediaModelEnumsCodecKinds from './EmbyMediaModelEnumsCodecKinds';
import EmbyMediaModelEnumsColorFormats from './EmbyMediaModelEnumsColorFormats';
import EmbyMediaModelEnumsSecondaryFrameworks from './EmbyMediaModelEnumsSecondaryFrameworks';
import EmbyMediaModelEnumsVideoMediaTypes from './EmbyMediaModelEnumsVideoMediaTypes';
import EmbyMediaModelTypesBitRate from './EmbyMediaModelTypesBitRate';
import EmbyMediaModelTypesProfileLevelInformation from './EmbyMediaModelTypesProfileLevelInformation';
import MediaEncodingCodecsCommonInterfacesICodecDeviceInfo from './MediaEncodingCodecsCommonInterfacesICodecDeviceInfo';

/**
* The MediaEncodingCodecsVideoCodecsVideoCodecBase model module.
* @module model/MediaEncodingCodecsVideoCodecsVideoCodecBase
* @version 4.8.0.27
*/
export default class MediaEncodingCodecsVideoCodecsVideoCodecBase {
    /**
    * Constructs a new <code>MediaEncodingCodecsVideoCodecsVideoCodecBase</code>.
    * @alias module:model/MediaEncodingCodecsVideoCodecsVideoCodecBase
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingCodecsVideoCodecsVideoCodecBase</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingCodecsVideoCodecsVideoCodecBase} obj Optional instance to populate.
    * @return {module:model/MediaEncodingCodecsVideoCodecsVideoCodecBase} The populated <code>MediaEncodingCodecsVideoCodecsVideoCodecBase</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingCodecsVideoCodecsVideoCodecBase();
                        
            
            if (data.hasOwnProperty('CodecDeviceInfo')) {
                obj['CodecDeviceInfo'] = MediaEncodingCodecsCommonInterfacesICodecDeviceInfo.constructFromObject(data['CodecDeviceInfo']);
            }
            if (data.hasOwnProperty('CodecKind')) {
                obj['CodecKind'] = EmbyMediaModelEnumsCodecKinds.constructFromObject(data['CodecKind']);
            }
            if (data.hasOwnProperty('MediaTypeName')) {
                obj['MediaTypeName'] = ApiClient.convertToType(data['MediaTypeName'], 'String');
            }
            if (data.hasOwnProperty('VideoMediaType')) {
                obj['VideoMediaType'] = EmbyMediaModelEnumsVideoMediaTypes.constructFromObject(data['VideoMediaType']);
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
                obj['MaxBitRate'] = EmbyMediaModelTypesBitRate.constructFromObject(data['MaxBitRate']);
            }
            if (data.hasOwnProperty('SupportedColorFormats')) {
                obj['SupportedColorFormats'] = ApiClient.convertToType(data['SupportedColorFormats'], [EmbyMediaModelEnumsColorFormats]);
            }
            if (data.hasOwnProperty('SupportedColorFormatStrings')) {
                obj['SupportedColorFormatStrings'] = ApiClient.convertToType(data['SupportedColorFormatStrings'], ['String']);
            }
            if (data.hasOwnProperty('ProfileAndLevelInformation')) {
                obj['ProfileAndLevelInformation'] = ApiClient.convertToType(data['ProfileAndLevelInformation'], [EmbyMediaModelTypesProfileLevelInformation]);
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Direction')) {
                obj['Direction'] = EmbyMediaModelEnumsCodecDirections.constructFromObject(data['Direction']);
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
                obj['SecondaryFramework'] = EmbyMediaModelEnumsSecondaryFrameworks.constructFromObject(data['SecondaryFramework']);
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
    * @member {module:model/MediaEncodingCodecsCommonInterfacesICodecDeviceInfo} CodecDeviceInfo
    */
    'CodecDeviceInfo' = undefined;
    /**
    * @member {module:model/EmbyMediaModelEnumsCodecKinds} CodecKind
    */
    'CodecKind' = undefined;
    /**
    * @member {String} MediaTypeName
    */
    'MediaTypeName' = undefined;
    /**
    * @member {module:model/EmbyMediaModelEnumsVideoMediaTypes} VideoMediaType
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
    * @member {module:model/EmbyMediaModelTypesBitRate} MaxBitRate
    */
    'MaxBitRate' = undefined;
    /**
    * @member {Array.<module:model/EmbyMediaModelEnumsColorFormats>} SupportedColorFormats
    */
    'SupportedColorFormats' = undefined;
    /**
    * @member {Array.<String>} SupportedColorFormatStrings
    */
    'SupportedColorFormatStrings' = undefined;
    /**
    * @member {Array.<module:model/EmbyMediaModelTypesProfileLevelInformation>} ProfileAndLevelInformation
    */
    'ProfileAndLevelInformation' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {module:model/EmbyMediaModelEnumsCodecDirections} Direction
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
    * @member {module:model/EmbyMediaModelEnumsSecondaryFrameworks} SecondaryFramework
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
