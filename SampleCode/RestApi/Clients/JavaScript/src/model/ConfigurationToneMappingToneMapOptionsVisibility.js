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
import OperatingSystem from './OperatingSystem';

/**
* The ConfigurationToneMappingToneMapOptionsVisibility model module.
* @module model/ConfigurationToneMappingToneMapOptionsVisibility
* @version 4.8.10.0
*/
export default class ConfigurationToneMappingToneMapOptionsVisibility {
    /**
    * Constructs a new <code>ConfigurationToneMappingToneMapOptionsVisibility</code>.
    * @alias module:model/ConfigurationToneMappingToneMapOptionsVisibility
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ConfigurationToneMappingToneMapOptionsVisibility</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ConfigurationToneMappingToneMapOptionsVisibility} obj Optional instance to populate.
    * @return {module:model/ConfigurationToneMappingToneMapOptionsVisibility} The populated <code>ConfigurationToneMappingToneMapOptionsVisibility</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConfigurationToneMappingToneMapOptionsVisibility();
                        
            
            if (data.hasOwnProperty('ShowAdvanced')) {
                obj['ShowAdvanced'] = ApiClient.convertToType(data['ShowAdvanced'], 'Boolean');
            }
            if (data.hasOwnProperty('IsSoftwareToneMappingAvailable')) {
                obj['IsSoftwareToneMappingAvailable'] = ApiClient.convertToType(data['IsSoftwareToneMappingAvailable'], 'Boolean');
            }
            if (data.hasOwnProperty('IsAnyHardwareToneMappingAvailable')) {
                obj['IsAnyHardwareToneMappingAvailable'] = ApiClient.convertToType(data['IsAnyHardwareToneMappingAvailable'], 'Boolean');
            }
            if (data.hasOwnProperty('ShowNvidiaOptions')) {
                obj['ShowNvidiaOptions'] = ApiClient.convertToType(data['ShowNvidiaOptions'], 'Boolean');
            }
            if (data.hasOwnProperty('ShowQuickSyncOptions')) {
                obj['ShowQuickSyncOptions'] = ApiClient.convertToType(data['ShowQuickSyncOptions'], 'Boolean');
            }
            if (data.hasOwnProperty('ShowVaapiOptions')) {
                obj['ShowVaapiOptions'] = ApiClient.convertToType(data['ShowVaapiOptions'], 'Boolean');
            }
            if (data.hasOwnProperty('IsOpenClAvailable')) {
                obj['IsOpenClAvailable'] = ApiClient.convertToType(data['IsOpenClAvailable'], 'Boolean');
            }
            if (data.hasOwnProperty('IsOpenClSuperTAvailable')) {
                obj['IsOpenClSuperTAvailable'] = ApiClient.convertToType(data['IsOpenClSuperTAvailable'], 'Boolean');
            }
            if (data.hasOwnProperty('IsVaapiNativeAvailable')) {
                obj['IsVaapiNativeAvailable'] = ApiClient.convertToType(data['IsVaapiNativeAvailable'], 'Boolean');
            }
            if (data.hasOwnProperty('IsQuickSyncNativeAvailable')) {
                obj['IsQuickSyncNativeAvailable'] = ApiClient.convertToType(data['IsQuickSyncNativeAvailable'], 'Boolean');
            }
            if (data.hasOwnProperty('OperatingSystem')) {
                obj['OperatingSystem'] = OperatingSystem.constructFromObject(data['OperatingSystem']);
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} ShowAdvanced
    */
    'ShowAdvanced' = undefined;
    /**
    * @member {Boolean} IsSoftwareToneMappingAvailable
    */
    'IsSoftwareToneMappingAvailable' = undefined;
    /**
    * @member {Boolean} IsAnyHardwareToneMappingAvailable
    */
    'IsAnyHardwareToneMappingAvailable' = undefined;
    /**
    * @member {Boolean} ShowNvidiaOptions
    */
    'ShowNvidiaOptions' = undefined;
    /**
    * @member {Boolean} ShowQuickSyncOptions
    */
    'ShowQuickSyncOptions' = undefined;
    /**
    * @member {Boolean} ShowVaapiOptions
    */
    'ShowVaapiOptions' = undefined;
    /**
    * @member {Boolean} IsOpenClAvailable
    */
    'IsOpenClAvailable' = undefined;
    /**
    * @member {Boolean} IsOpenClSuperTAvailable
    */
    'IsOpenClSuperTAvailable' = undefined;
    /**
    * @member {Boolean} IsVaapiNativeAvailable
    */
    'IsVaapiNativeAvailable' = undefined;
    /**
    * @member {Boolean} IsQuickSyncNativeAvailable
    */
    'IsQuickSyncNativeAvailable' = undefined;
    /**
    * @member {module:model/OperatingSystem} OperatingSystem
    */
    'OperatingSystem' = undefined;




}
