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
* The PackageVersionInfo model module.
* @module model/PackageVersionInfo
* @version 4.8.10.0
*/
export default class PackageVersionInfo {
    /**
    * Constructs a new <code>PackageVersionInfo</code>.
    * Class PackageVersionInfo  
    * @alias module:model/PackageVersionInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PackageVersionInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PackageVersionInfo} obj Optional instance to populate.
    * @return {module:model/PackageVersionInfo} The populated <code>PackageVersionInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PackageVersionInfo();
                        
            
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
                obj['classification'] = PackageVersionClass.constructFromObject(data['classification']);
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
    * The name.
    * @member {String} name
    */
    'name' = undefined;
    /**
    * The guid.
    * @member {String} guid
    */
    'guid' = undefined;
    /**
    * The version STR.
    * @member {String} versionStr
    */
    'versionStr' = undefined;
    /**
    * @member {module:model/PackageVersionClass} classification
    */
    'classification' = undefined;
    /**
    * The description.
    * @member {String} description
    */
    'description' = undefined;
    /**
    * The required version STR.
    * @member {String} requiredVersionStr
    */
    'requiredVersionStr' = undefined;
    /**
    * The source URL.
    * @member {String} sourceUrl
    */
    'sourceUrl' = undefined;
    /**
    * The source URL.
    * @member {String} checksum
    */
    'checksum' = undefined;
    /**
    * The target filename.
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
