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
* The LiveTVApiNameIdDescriptionPair model module.
* @module model/LiveTVApiNameIdDescriptionPair
* @version 4.8.0.63
*/
export default class LiveTVApiNameIdDescriptionPair {
    /**
    * Constructs a new <code>LiveTVApiNameIdDescriptionPair</code>.
    * @alias module:model/LiveTVApiNameIdDescriptionPair
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTVApiNameIdDescriptionPair</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTVApiNameIdDescriptionPair} obj Optional instance to populate.
    * @return {module:model/LiveTVApiNameIdDescriptionPair} The populated <code>LiveTVApiNameIdDescriptionPair</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTVApiNameIdDescriptionPair();
                        
            
            if (data.hasOwnProperty('ShortOverview')) {
                obj['ShortOverview'] = ApiClient.convertToType(data['ShortOverview'], 'String');
            }
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
    * @member {String} ShortOverview
    */
    'ShortOverview' = undefined;
    /**
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * The identifier.
    * @member {String} Id
    */
    'Id' = undefined;




}
