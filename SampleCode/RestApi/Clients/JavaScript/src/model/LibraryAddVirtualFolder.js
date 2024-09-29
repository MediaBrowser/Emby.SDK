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
* The LibraryAddVirtualFolder model module.
* @module model/LibraryAddVirtualFolder
* @version 4.8.10.0
*/
export default class LibraryAddVirtualFolder {
    /**
    * Constructs a new <code>LibraryAddVirtualFolder</code>.
    * @alias module:model/LibraryAddVirtualFolder
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryAddVirtualFolder</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryAddVirtualFolder} obj Optional instance to populate.
    * @return {module:model/LibraryAddVirtualFolder} The populated <code>LibraryAddVirtualFolder</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryAddVirtualFolder();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('CollectionType')) {
                obj['CollectionType'] = ApiClient.convertToType(data['CollectionType'], 'String');
            }
            if (data.hasOwnProperty('RefreshLibrary')) {
                obj['RefreshLibrary'] = ApiClient.convertToType(data['RefreshLibrary'], 'Boolean');
            }
            if (data.hasOwnProperty('Paths')) {
                obj['Paths'] = ApiClient.convertToType(data['Paths'], ['String']);
            }
            if (data.hasOwnProperty('LibraryOptions')) {
                obj['LibraryOptions'] = LibraryOptions.constructFromObject(data['LibraryOptions']);
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} CollectionType
    */
    'CollectionType' = undefined;
    /**
    * @member {Boolean} RefreshLibrary
    */
    'RefreshLibrary' = undefined;
    /**
    * @member {Array.<String>} Paths
    */
    'Paths' = undefined;
    /**
    * @member {module:model/LibraryOptions} LibraryOptions
    */
    'LibraryOptions' = undefined;




}
