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
import UpdatesPackageVersionClass from './UpdatesPackageVersionClass';

/**
* The UpdatesInstallationInfo model module.
* @module model/UpdatesInstallationInfo
* @version 4.8.0.27
*/
export default class UpdatesInstallationInfo {
    /**
    * Constructs a new <code>UpdatesInstallationInfo</code>.
    * @alias module:model/UpdatesInstallationInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UpdatesInstallationInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UpdatesInstallationInfo} obj Optional instance to populate.
    * @return {module:model/UpdatesInstallationInfo} The populated <code>UpdatesInstallationInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdatesInstallationInfo();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('AssemblyGuid')) {
                obj['AssemblyGuid'] = ApiClient.convertToType(data['AssemblyGuid'], 'String');
            }
            if (data.hasOwnProperty('Version')) {
                obj['Version'] = ApiClient.convertToType(data['Version'], 'String');
            }
            if (data.hasOwnProperty('UpdateClass')) {
                obj['UpdateClass'] = UpdatesPackageVersionClass.constructFromObject(data['UpdateClass']);
            }
            if (data.hasOwnProperty('PercentComplete')) {
                obj['PercentComplete'] = ApiClient.convertToType(data['PercentComplete'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} AssemblyGuid
    */
    'AssemblyGuid' = undefined;
    /**
    * @member {String} Version
    */
    'Version' = undefined;
    /**
    * @member {module:model/UpdatesPackageVersionClass} UpdateClass
    */
    'UpdateClass' = undefined;
    /**
    * @member {Number} PercentComplete
    */
    'PercentComplete' = undefined;




}
