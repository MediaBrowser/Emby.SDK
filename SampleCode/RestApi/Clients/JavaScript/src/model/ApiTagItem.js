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
* The ApiTagItem model module.
* @module model/ApiTagItem
* @version 4.8.10.0
*/
export default class ApiTagItem {
    /**
    * Constructs a new <code>ApiTagItem</code>.
    * @alias module:model/ApiTagItem
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ApiTagItem</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ApiTagItem} obj Optional instance to populate.
    * @return {module:model/ApiTagItem} The populated <code>ApiTagItem</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApiTagItem();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;




}
