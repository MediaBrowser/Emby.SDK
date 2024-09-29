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

/**
* The DefaultDirectoryBrowserInfo model module.
* @module model/DefaultDirectoryBrowserInfo
* @version 4.8.10.0
*/
export default class DefaultDirectoryBrowserInfo {
    /**
    * Constructs a new <code>DefaultDirectoryBrowserInfo</code>.
    * @alias module:model/DefaultDirectoryBrowserInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DefaultDirectoryBrowserInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DefaultDirectoryBrowserInfo} obj Optional instance to populate.
    * @return {module:model/DefaultDirectoryBrowserInfo} The populated <code>DefaultDirectoryBrowserInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DefaultDirectoryBrowserInfo();
                        
            
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Path
    */
    'Path' = undefined;




}
