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
* The CommonInterfacesICodecDeviceCapabilities model module.
* @module model/CommonInterfacesICodecDeviceCapabilities
* @version 4.8.10.0
*/
export default class CommonInterfacesICodecDeviceCapabilities {
    /**
    * Constructs a new <code>CommonInterfacesICodecDeviceCapabilities</code>.
    * @alias module:model/CommonInterfacesICodecDeviceCapabilities
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>CommonInterfacesICodecDeviceCapabilities</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/CommonInterfacesICodecDeviceCapabilities} obj Optional instance to populate.
    * @return {module:model/CommonInterfacesICodecDeviceCapabilities} The populated <code>CommonInterfacesICodecDeviceCapabilities</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CommonInterfacesICodecDeviceCapabilities();
                        
            
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
