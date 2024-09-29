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
import PackageVersionClass from './PackageVersionClass';

/**
* The InstallationInfo model module.
* @module model/InstallationInfo
* @version 4.8.10.0
*/
export default class InstallationInfo {
    /**
    * Constructs a new <code>InstallationInfo</code>.
    * Class InstallationInfo  
    * @alias module:model/InstallationInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>InstallationInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/InstallationInfo} obj Optional instance to populate.
    * @return {module:model/InstallationInfo} The populated <code>InstallationInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InstallationInfo();
                        
            
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
                obj['UpdateClass'] = PackageVersionClass.constructFromObject(data['UpdateClass']);
            }
            if (data.hasOwnProperty('PercentComplete')) {
                obj['PercentComplete'] = ApiClient.convertToType(data['PercentComplete'], 'Number');
            }
        }
        return obj;
    }

    /**
    * The id.
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * The assembly guid.
    * @member {String} AssemblyGuid
    */
    'AssemblyGuid' = undefined;
    /**
    * The version.
    * @member {String} Version
    */
    'Version' = undefined;
    /**
    * @member {module:model/PackageVersionClass} UpdateClass
    */
    'UpdateClass' = undefined;
    /**
    * The percent complete.
    * @member {Number} PercentComplete
    */
    'PercentComplete' = undefined;




}
