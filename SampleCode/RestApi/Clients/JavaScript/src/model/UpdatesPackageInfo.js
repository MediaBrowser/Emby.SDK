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
import UpdatesPackageTargetSystem from './UpdatesPackageTargetSystem';
import UpdatesPackageVersionInfo from './UpdatesPackageVersionInfo';

/**
* The UpdatesPackageInfo model module.
* @module model/UpdatesPackageInfo
* @version 4.8.0.34
*/
export default class UpdatesPackageInfo {
    /**
    * Constructs a new <code>UpdatesPackageInfo</code>.
    * @alias module:model/UpdatesPackageInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UpdatesPackageInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UpdatesPackageInfo} obj Optional instance to populate.
    * @return {module:model/UpdatesPackageInfo} The populated <code>UpdatesPackageInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdatesPackageInfo();
                        
            
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('shortDescription')) {
                obj['shortDescription'] = ApiClient.convertToType(data['shortDescription'], 'String');
            }
            if (data.hasOwnProperty('overview')) {
                obj['overview'] = ApiClient.convertToType(data['overview'], 'String');
            }
            if (data.hasOwnProperty('isPremium')) {
                obj['isPremium'] = ApiClient.convertToType(data['isPremium'], 'Boolean');
            }
            if (data.hasOwnProperty('adult')) {
                obj['adult'] = ApiClient.convertToType(data['adult'], 'Boolean');
            }
            if (data.hasOwnProperty('richDescUrl')) {
                obj['richDescUrl'] = ApiClient.convertToType(data['richDescUrl'], 'String');
            }
            if (data.hasOwnProperty('thumbImage')) {
                obj['thumbImage'] = ApiClient.convertToType(data['thumbImage'], 'String');
            }
            if (data.hasOwnProperty('previewImage')) {
                obj['previewImage'] = ApiClient.convertToType(data['previewImage'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('targetFilename')) {
                obj['targetFilename'] = ApiClient.convertToType(data['targetFilename'], 'String');
            }
            if (data.hasOwnProperty('owner')) {
                obj['owner'] = ApiClient.convertToType(data['owner'], 'String');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
            if (data.hasOwnProperty('tileColor')) {
                obj['tileColor'] = ApiClient.convertToType(data['tileColor'], 'String');
            }
            if (data.hasOwnProperty('featureId')) {
                obj['featureId'] = ApiClient.convertToType(data['featureId'], 'String');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('targetSystem')) {
                obj['targetSystem'] = UpdatesPackageTargetSystem.constructFromObject(data['targetSystem']);
            }
            if (data.hasOwnProperty('guid')) {
                obj['guid'] = ApiClient.convertToType(data['guid'], 'String');
            }
            if (data.hasOwnProperty('isRegistered')) {
                obj['isRegistered'] = ApiClient.convertToType(data['isRegistered'], 'Boolean');
            }
            if (data.hasOwnProperty('expDate')) {
                obj['expDate'] = ApiClient.convertToType(data['expDate'], 'Date');
            }
            if (data.hasOwnProperty('versions')) {
                obj['versions'] = ApiClient.convertToType(data['versions'], [UpdatesPackageVersionInfo]);
            }
            if (data.hasOwnProperty('enableInAppStore')) {
                obj['enableInAppStore'] = ApiClient.convertToType(data['enableInAppStore'], 'Boolean');
            }
            if (data.hasOwnProperty('installs')) {
                obj['installs'] = ApiClient.convertToType(data['installs'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {String} id
    */
    'id' = undefined;
    /**
    * @member {String} name
    */
    'name' = undefined;
    /**
    * @member {String} shortDescription
    */
    'shortDescription' = undefined;
    /**
    * @member {String} overview
    */
    'overview' = undefined;
    /**
    * @member {Boolean} isPremium
    */
    'isPremium' = undefined;
    /**
    * @member {Boolean} adult
    */
    'adult' = undefined;
    /**
    * @member {String} richDescUrl
    */
    'richDescUrl' = undefined;
    /**
    * @member {String} thumbImage
    */
    'thumbImage' = undefined;
    /**
    * @member {String} previewImage
    */
    'previewImage' = undefined;
    /**
    * @member {String} type
    */
    'type' = undefined;
    /**
    * @member {String} targetFilename
    */
    'targetFilename' = undefined;
    /**
    * @member {String} owner
    */
    'owner' = undefined;
    /**
    * @member {String} category
    */
    'category' = undefined;
    /**
    * @member {String} tileColor
    */
    'tileColor' = undefined;
    /**
    * @member {String} featureId
    */
    'featureId' = undefined;
    /**
    * @member {Number} price
    */
    'price' = undefined;
    /**
    * @member {module:model/UpdatesPackageTargetSystem} targetSystem
    */
    'targetSystem' = undefined;
    /**
    * @member {String} guid
    */
    'guid' = undefined;
    /**
    * @member {Boolean} isRegistered
    */
    'isRegistered' = undefined;
    /**
    * @member {Date} expDate
    */
    'expDate' = undefined;
    /**
    * @member {Array.<module:model/UpdatesPackageVersionInfo>} versions
    */
    'versions' = undefined;
    /**
    * @member {Boolean} enableInAppStore
    */
    'enableInAppStore' = undefined;
    /**
    * @member {Number} installs
    */
    'installs' = undefined;




}
