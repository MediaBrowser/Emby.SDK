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
import MetadataFeatures from './MetadataFeatures';

/**
* The LibraryLibraryOptionInfo model module.
* @module model/LibraryLibraryOptionInfo
* @version 4.8.10.0
*/
export default class LibraryLibraryOptionInfo {
    /**
    * Constructs a new <code>LibraryLibraryOptionInfo</code>.
    * @alias module:model/LibraryLibraryOptionInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryLibraryOptionInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryLibraryOptionInfo} obj Optional instance to populate.
    * @return {module:model/LibraryLibraryOptionInfo} The populated <code>LibraryLibraryOptionInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryLibraryOptionInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('SetupUrl')) {
                obj['SetupUrl'] = ApiClient.convertToType(data['SetupUrl'], 'String');
            }
            if (data.hasOwnProperty('DefaultEnabled')) {
                obj['DefaultEnabled'] = ApiClient.convertToType(data['DefaultEnabled'], 'Boolean');
            }
            if (data.hasOwnProperty('Features')) {
                obj['Features'] = ApiClient.convertToType(data['Features'], [MetadataFeatures]);
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} SetupUrl
    */
    'SetupUrl' = undefined;
    /**
    * @member {Boolean} DefaultEnabled
    */
    'DefaultEnabled' = undefined;
    /**
    * @member {Array.<module:model/MetadataFeatures>} Features
    */
    'Features' = undefined;




}
