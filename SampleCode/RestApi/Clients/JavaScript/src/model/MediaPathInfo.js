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
* The MediaPathInfo model module.
* @module model/MediaPathInfo
* @version 4.8.10.0
*/
export default class MediaPathInfo {
    /**
    * Constructs a new <code>MediaPathInfo</code>.
    * @alias module:model/MediaPathInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaPathInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaPathInfo} obj Optional instance to populate.
    * @return {module:model/MediaPathInfo} The populated <code>MediaPathInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaPathInfo();
                        
            
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
            if (data.hasOwnProperty('NetworkPath')) {
                obj['NetworkPath'] = ApiClient.convertToType(data['NetworkPath'], 'String');
            }
            if (data.hasOwnProperty('Username')) {
                obj['Username'] = ApiClient.convertToType(data['Username'], 'String');
            }
            if (data.hasOwnProperty('Password')) {
                obj['Password'] = ApiClient.convertToType(data['Password'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Path
    */
    'Path' = undefined;
    /**
    * @member {String} NetworkPath
    */
    'NetworkPath' = undefined;
    /**
    * @member {String} Username
    */
    'Username' = undefined;
    /**
    * @member {String} Password
    */
    'Password' = undefined;




}
