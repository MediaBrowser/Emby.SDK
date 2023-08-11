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
* The UpdatesPackageVersionInfo model module.
* @module model/UpdatesPackageVersionInfo
* @version 4.8.0.41
*/
export default class UpdatesPackageVersionInfo {
    /**
    * Constructs a new <code>UpdatesPackageVersionInfo</code>.
    * @alias module:model/UpdatesPackageVersionInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UpdatesPackageVersionInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UpdatesPackageVersionInfo} obj Optional instance to populate.
    * @return {module:model/UpdatesPackageVersionInfo} The populated <code>UpdatesPackageVersionInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdatesPackageVersionInfo();
                        
            
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('guid')) {
                obj['guid'] = ApiClient.convertToType(data['guid'], 'String');
            }
            if (data.hasOwnProperty('versionStr')) {
                obj['versionStr'] = ApiClient.convertToType(data['versionStr'], 'String');
            }
            if (data.hasOwnProperty('classification')) {
                obj['classification'] = UpdatesPackageVersionClass.constructFromObject(data['classification']);
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('requiredVersionStr')) {
                obj['requiredVersionStr'] = ApiClient.convertToType(data['requiredVersionStr'], 'String');
            }
            if (data.hasOwnProperty('sourceUrl')) {
                obj['sourceUrl'] = ApiClient.convertToType(data['sourceUrl'], 'String');
            }
            if (data.hasOwnProperty('checksum')) {
                obj['checksum'] = ApiClient.convertToType(data['checksum'], 'String');
            }
            if (data.hasOwnProperty('targetFilename')) {
                obj['targetFilename'] = ApiClient.convertToType(data['targetFilename'], 'String');
            }
            if (data.hasOwnProperty('infoUrl')) {
                obj['infoUrl'] = ApiClient.convertToType(data['infoUrl'], 'String');
            }
            if (data.hasOwnProperty('runtimes')) {
                obj['runtimes'] = ApiClient.convertToType(data['runtimes'], 'String');
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'Date');
            }
        }
        return obj;
    }

    /**
    * @member {String} name
    */
    'name' = undefined;
    /**
    * @member {String} guid
    */
    'guid' = undefined;
    /**
    * @member {String} versionStr
    */
    'versionStr' = undefined;
    /**
    * @member {module:model/UpdatesPackageVersionClass} classification
    */
    'classification' = undefined;
    /**
    * @member {String} description
    */
    'description' = undefined;
    /**
    * @member {String} requiredVersionStr
    */
    'requiredVersionStr' = undefined;
    /**
    * @member {String} sourceUrl
    */
    'sourceUrl' = undefined;
    /**
    * @member {String} checksum
    */
    'checksum' = undefined;
    /**
    * @member {String} targetFilename
    */
    'targetFilename' = undefined;
    /**
    * @member {String} infoUrl
    */
    'infoUrl' = undefined;
    /**
    * @member {String} runtimes
    */
    'runtimes' = undefined;
    /**
    * @member {Date} timestamp
    */
    'timestamp' = undefined;




}
