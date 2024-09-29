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
import PackageTargetSystem from './PackageTargetSystem';
import PackageVersionInfo from './PackageVersionInfo';

/**
* The PackageInfo model module.
* @module model/PackageInfo
* @version 4.8.10.0
*/
export default class PackageInfo {
    /**
    * Constructs a new <code>PackageInfo</code>.
    * Class PackageInfo  
    * @alias module:model/PackageInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PackageInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PackageInfo} obj Optional instance to populate.
    * @return {module:model/PackageInfo} The populated <code>PackageInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PackageInfo();
                        
            
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
                obj['targetSystem'] = PackageTargetSystem.constructFromObject(data['targetSystem']);
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
                obj['versions'] = ApiClient.convertToType(data['versions'], [PackageVersionInfo]);
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
    * The internal id of this package.
    * @member {String} id
    */
    'id' = undefined;
    /**
    * The name.
    * @member {String} name
    */
    'name' = undefined;
    /**
    * The short description.
    * @member {String} shortDescription
    */
    'shortDescription' = undefined;
    /**
    * The overview.
    * @member {String} overview
    */
    'overview' = undefined;
    /**
    * A value indicating whether this instance is premium.
    * @member {Boolean} isPremium
    */
    'isPremium' = undefined;
    /**
    * A value indicating whether this instance is adult only content.
    * @member {Boolean} adult
    */
    'adult' = undefined;
    /**
    * The rich desc URL.
    * @member {String} richDescUrl
    */
    'richDescUrl' = undefined;
    /**
    * The thumb image.
    * @member {String} thumbImage
    */
    'thumbImage' = undefined;
    /**
    * The preview image.
    * @member {String} previewImage
    */
    'previewImage' = undefined;
    /**
    * The type.
    * @member {String} type
    */
    'type' = undefined;
    /**
    * The target filename.
    * @member {String} targetFilename
    */
    'targetFilename' = undefined;
    /**
    * The owner.
    * @member {String} owner
    */
    'owner' = undefined;
    /**
    * The category.
    * @member {String} category
    */
    'category' = undefined;
    /**
    * The catalog tile color.
    * @member {String} tileColor
    */
    'tileColor' = undefined;
    /**
    * The feature id of this package (if premium).
    * @member {String} featureId
    */
    'featureId' = undefined;
    /**
    * The price for this package (if premium).
    * @member {Number} price
    */
    'price' = undefined;
    /**
    * @member {module:model/PackageTargetSystem} targetSystem
    */
    'targetSystem' = undefined;
    /**
    * The guid of the assembly associated with this package (if a plug\\-in). This is used to identify the proper item for automatic updates.
    * @member {String} guid
    */
    'guid' = undefined;
    /**
    * Whether or not this package is registered.
    * @member {Boolean} isRegistered
    */
    'isRegistered' = undefined;
    /**
    * The expiration date for this package.
    * @member {Date} expDate
    */
    'expDate' = undefined;
    /**
    * The versions.
    * @member {Array.<module:model/PackageVersionInfo>} versions
    */
    'versions' = undefined;
    /**
    * A value indicating whether \\[enable in application store\\].
    * @member {Boolean} enableInAppStore
    */
    'enableInAppStore' = undefined;
    /**
    * The installs.
    * @member {Number} installs
    */
    'installs' = undefined;




}
