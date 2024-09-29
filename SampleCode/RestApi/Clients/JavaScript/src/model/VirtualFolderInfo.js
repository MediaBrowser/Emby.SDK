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
import LibraryOptions from './LibraryOptions';

/**
* The VirtualFolderInfo model module.
* @module model/VirtualFolderInfo
* @version 4.8.10.0
*/
export default class VirtualFolderInfo {
    /**
    * Constructs a new <code>VirtualFolderInfo</code>.
    * Used to hold information about a user&#x27;s list of configured virtual folders  
    * @alias module:model/VirtualFolderInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>VirtualFolderInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/VirtualFolderInfo} obj Optional instance to populate.
    * @return {module:model/VirtualFolderInfo} The populated <code>VirtualFolderInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VirtualFolderInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Locations')) {
                obj['Locations'] = ApiClient.convertToType(data['Locations'], ['String']);
            }
            if (data.hasOwnProperty('CollectionType')) {
                obj['CollectionType'] = ApiClient.convertToType(data['CollectionType'], 'String');
            }
            if (data.hasOwnProperty('LibraryOptions')) {
                obj['LibraryOptions'] = LibraryOptions.constructFromObject(data['LibraryOptions']);
            }
            if (data.hasOwnProperty('ItemId')) {
                obj['ItemId'] = ApiClient.convertToType(data['ItemId'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Guid')) {
                obj['Guid'] = ApiClient.convertToType(data['Guid'], 'String');
            }
            if (data.hasOwnProperty('PrimaryImageItemId')) {
                obj['PrimaryImageItemId'] = ApiClient.convertToType(data['PrimaryImageItemId'], 'String');
            }
            if (data.hasOwnProperty('RefreshProgress')) {
                obj['RefreshProgress'] = ApiClient.convertToType(data['RefreshProgress'], 'Number');
            }
            if (data.hasOwnProperty('RefreshStatus')) {
                obj['RefreshStatus'] = ApiClient.convertToType(data['RefreshStatus'], 'String');
            }
        }
        return obj;
    }

    /**
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * The locations.
    * @member {Array.<String>} Locations
    */
    'Locations' = undefined;
    /**
    * The type of the collection.
    * @member {String} CollectionType
    */
    'CollectionType' = undefined;
    /**
    * @member {module:model/LibraryOptions} LibraryOptions
    */
    'LibraryOptions' = undefined;
    /**
    * The item identifier.
    * @member {String} ItemId
    */
    'ItemId' = undefined;
    /**
    * ItemId came first, so that is left for compatability purposes
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} Guid
    */
    'Guid' = undefined;
    /**
    * The primary image item identifier.
    * @member {String} PrimaryImageItemId
    */
    'PrimaryImageItemId' = undefined;
    /**
    * @member {Number} RefreshProgress
    */
    'RefreshProgress' = undefined;
    /**
    * @member {String} RefreshStatus
    */
    'RefreshStatus' = undefined;




}
