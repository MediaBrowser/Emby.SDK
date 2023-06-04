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

/**
* The LiveTVApiTagItem model module.
* @module model/LiveTVApiTagItem
* @version 4.8.0.38
*/
export default class LiveTVApiTagItem {
    /**
    * Constructs a new <code>LiveTVApiTagItem</code>.
    * @alias module:model/LiveTVApiTagItem
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTVApiTagItem</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTVApiTagItem} obj Optional instance to populate.
    * @return {module:model/LiveTVApiTagItem} The populated <code>LiveTVApiTagItem</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTVApiTagItem();
                        
            
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
