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
import EmbyDlnaProfilesHttpHeaderInfo from './EmbyDlnaProfilesHttpHeaderInfo';

/**
* The EmbyDlnaProfilesDeviceIdentification model module.
* @module model/EmbyDlnaProfilesDeviceIdentification
* @version 4.8.0.43
*/
export default class EmbyDlnaProfilesDeviceIdentification {
    /**
    * Constructs a new <code>EmbyDlnaProfilesDeviceIdentification</code>.
    * @alias module:model/EmbyDlnaProfilesDeviceIdentification
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyDlnaProfilesDeviceIdentification</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyDlnaProfilesDeviceIdentification} obj Optional instance to populate.
    * @return {module:model/EmbyDlnaProfilesDeviceIdentification} The populated <code>EmbyDlnaProfilesDeviceIdentification</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyDlnaProfilesDeviceIdentification();
                        
            
            if (data.hasOwnProperty('FriendlyName')) {
                obj['FriendlyName'] = ApiClient.convertToType(data['FriendlyName'], 'String');
            }
            if (data.hasOwnProperty('ModelNumber')) {
                obj['ModelNumber'] = ApiClient.convertToType(data['ModelNumber'], 'String');
            }
            if (data.hasOwnProperty('SerialNumber')) {
                obj['SerialNumber'] = ApiClient.convertToType(data['SerialNumber'], 'String');
            }
            if (data.hasOwnProperty('ModelName')) {
                obj['ModelName'] = ApiClient.convertToType(data['ModelName'], 'String');
            }
            if (data.hasOwnProperty('ModelDescription')) {
                obj['ModelDescription'] = ApiClient.convertToType(data['ModelDescription'], 'String');
            }
            if (data.hasOwnProperty('DeviceDescription')) {
                obj['DeviceDescription'] = ApiClient.convertToType(data['DeviceDescription'], 'String');
            }
            if (data.hasOwnProperty('ModelUrl')) {
                obj['ModelUrl'] = ApiClient.convertToType(data['ModelUrl'], 'String');
            }
            if (data.hasOwnProperty('Manufacturer')) {
                obj['Manufacturer'] = ApiClient.convertToType(data['Manufacturer'], 'String');
            }
            if (data.hasOwnProperty('ManufacturerUrl')) {
                obj['ManufacturerUrl'] = ApiClient.convertToType(data['ManufacturerUrl'], 'String');
            }
            if (data.hasOwnProperty('Headers')) {
                obj['Headers'] = ApiClient.convertToType(data['Headers'], [EmbyDlnaProfilesHttpHeaderInfo]);
            }
        }
        return obj;
    }

    /**
    * @member {String} FriendlyName
    */
    'FriendlyName' = undefined;
    /**
    * @member {String} ModelNumber
    */
    'ModelNumber' = undefined;
    /**
    * @member {String} SerialNumber
    */
    'SerialNumber' = undefined;
    /**
    * @member {String} ModelName
    */
    'ModelName' = undefined;
    /**
    * @member {String} ModelDescription
    */
    'ModelDescription' = undefined;
    /**
    * @member {String} DeviceDescription
    */
    'DeviceDescription' = undefined;
    /**
    * @member {String} ModelUrl
    */
    'ModelUrl' = undefined;
    /**
    * @member {String} Manufacturer
    */
    'Manufacturer' = undefined;
    /**
    * @member {String} ManufacturerUrl
    */
    'ManufacturerUrl' = undefined;
    /**
    * @member {Array.<module:model/EmbyDlnaProfilesHttpHeaderInfo>} Headers
    */
    'Headers' = undefined;




}
