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
* The MediaEncodingCodecsCommonInterfacesICodecDeviceCapabilities model module.
* @module model/MediaEncodingCodecsCommonInterfacesICodecDeviceCapabilities
* @version 4.8.0.37
*/
export default class MediaEncodingCodecsCommonInterfacesICodecDeviceCapabilities {
    /**
    * Constructs a new <code>MediaEncodingCodecsCommonInterfacesICodecDeviceCapabilities</code>.
    * @alias module:model/MediaEncodingCodecsCommonInterfacesICodecDeviceCapabilities
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingCodecsCommonInterfacesICodecDeviceCapabilities</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingCodecsCommonInterfacesICodecDeviceCapabilities} obj Optional instance to populate.
    * @return {module:model/MediaEncodingCodecsCommonInterfacesICodecDeviceCapabilities} The populated <code>MediaEncodingCodecsCommonInterfacesICodecDeviceCapabilities</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingCodecsCommonInterfacesICodecDeviceCapabilities();
                        
            
            if (data.hasOwnProperty('SupportsHwUpload')) {
                obj['SupportsHwUpload'] = ApiClient.convertToType(data['SupportsHwUpload'], 'Boolean');
            }
            if (data.hasOwnProperty('SupportsHwDownload')) {
                obj['SupportsHwDownload'] = ApiClient.convertToType(data['SupportsHwDownload'], 'Boolean');
            }
            if (data.hasOwnProperty('SupportsStandaloneDeviceInit')) {
                obj['SupportsStandaloneDeviceInit'] = ApiClient.convertToType(data['SupportsStandaloneDeviceInit'], 'Boolean');
            }
            if (data.hasOwnProperty('Supports10BitProcessing')) {
                obj['Supports10BitProcessing'] = ApiClient.convertToType(data['Supports10BitProcessing'], 'Boolean');
            }
            if (data.hasOwnProperty('SupportsNativeToneMapping')) {
                obj['SupportsNativeToneMapping'] = ApiClient.convertToType(data['SupportsNativeToneMapping'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} SupportsHwUpload
    */
    'SupportsHwUpload' = undefined;
    /**
    * @member {Boolean} SupportsHwDownload
    */
    'SupportsHwDownload' = undefined;
    /**
    * @member {Boolean} SupportsStandaloneDeviceInit
    */
    'SupportsStandaloneDeviceInit' = undefined;
    /**
    * @member {Boolean} Supports10BitProcessing
    */
    'Supports10BitProcessing' = undefined;
    /**
    * @member {Boolean} SupportsNativeToneMapping
    */
    'SupportsNativeToneMapping' = undefined;




}
