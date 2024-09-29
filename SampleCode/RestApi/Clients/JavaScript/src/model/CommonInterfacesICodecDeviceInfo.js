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
import CommonInterfacesICodecDeviceCapabilities from './CommonInterfacesICodecDeviceCapabilities';
import SecondaryFrameworks from './SecondaryFrameworks';
import Version from './Version';

/**
* The CommonInterfacesICodecDeviceInfo model module.
* @module model/CommonInterfacesICodecDeviceInfo
* @version 4.8.10.0
*/
export default class CommonInterfacesICodecDeviceInfo {
    /**
    * Constructs a new <code>CommonInterfacesICodecDeviceInfo</code>.
    * @alias module:model/CommonInterfacesICodecDeviceInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>CommonInterfacesICodecDeviceInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/CommonInterfacesICodecDeviceInfo} obj Optional instance to populate.
    * @return {module:model/CommonInterfacesICodecDeviceInfo} The populated <code>CommonInterfacesICodecDeviceInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CommonInterfacesICodecDeviceInfo();
                        
            
            if (data.hasOwnProperty('Capabilities')) {
                obj['Capabilities'] = CommonInterfacesICodecDeviceCapabilities.constructFromObject(data['Capabilities']);
            }
            if (data.hasOwnProperty('Adapter')) {
                obj['Adapter'] = ApiClient.convertToType(data['Adapter'], 'Number');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Desription')) {
                obj['Desription'] = ApiClient.convertToType(data['Desription'], 'String');
            }
            if (data.hasOwnProperty('Driver')) {
                obj['Driver'] = ApiClient.convertToType(data['Driver'], 'String');
            }
            if (data.hasOwnProperty('DriverVersion')) {
                obj['DriverVersion'] = Version.constructFromObject(data['DriverVersion']);
            }
            if (data.hasOwnProperty('ApiVersion')) {
                obj['ApiVersion'] = Version.constructFromObject(data['ApiVersion']);
            }
            if (data.hasOwnProperty('VendorId')) {
                obj['VendorId'] = ApiClient.convertToType(data['VendorId'], 'Number');
            }
            if (data.hasOwnProperty('DeviceId')) {
                obj['DeviceId'] = ApiClient.convertToType(data['DeviceId'], 'Number');
            }
            if (data.hasOwnProperty('DeviceIdentifier')) {
                obj['DeviceIdentifier'] = ApiClient.convertToType(data['DeviceIdentifier'], 'String');
            }
            if (data.hasOwnProperty('HardwareContextFramework')) {
                obj['HardwareContextFramework'] = SecondaryFrameworks.constructFromObject(data['HardwareContextFramework']);
            }
            if (data.hasOwnProperty('DevPath')) {
                obj['DevPath'] = ApiClient.convertToType(data['DevPath'], 'String');
            }
            if (data.hasOwnProperty('DrmNode')) {
                obj['DrmNode'] = ApiClient.convertToType(data['DrmNode'], 'String');
            }
            if (data.hasOwnProperty('VendorName')) {
                obj['VendorName'] = ApiClient.convertToType(data['VendorName'], 'String');
            }
            if (data.hasOwnProperty('DeviceName')) {
                obj['DeviceName'] = ApiClient.convertToType(data['DeviceName'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/CommonInterfacesICodecDeviceCapabilities} Capabilities
    */
    'Capabilities' = undefined;
    /**
    * @member {Number} Adapter
    */
    'Adapter' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Desription
    */
    'Desription' = undefined;
    /**
    * @member {String} Driver
    */
    'Driver' = undefined;
    /**
    * @member {module:model/Version} DriverVersion
    */
    'DriverVersion' = undefined;
    /**
    * @member {module:model/Version} ApiVersion
    */
    'ApiVersion' = undefined;
    /**
    * @member {Number} VendorId
    */
    'VendorId' = undefined;
    /**
    * @member {Number} DeviceId
    */
    'DeviceId' = undefined;
    /**
    * @member {String} DeviceIdentifier
    */
    'DeviceIdentifier' = undefined;
    /**
    * @member {module:model/SecondaryFrameworks} HardwareContextFramework
    */
    'HardwareContextFramework' = undefined;
    /**
    * @member {String} DevPath
    */
    'DevPath' = undefined;
    /**
    * @member {String} DrmNode
    */
    'DrmNode' = undefined;
    /**
    * @member {String} VendorName
    */
    'VendorName' = undefined;
    /**
    * @member {String} DeviceName
    */
    'DeviceName' = undefined;




}
