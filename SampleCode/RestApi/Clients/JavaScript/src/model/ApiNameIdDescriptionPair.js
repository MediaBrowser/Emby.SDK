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
* The ApiNameIdDescriptionPair model module.
* @module model/ApiNameIdDescriptionPair
* @version 4.8.10.0
*/
export default class ApiNameIdDescriptionPair {
    /**
    * Constructs a new <code>ApiNameIdDescriptionPair</code>.
    * @alias module:model/ApiNameIdDescriptionPair
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ApiNameIdDescriptionPair</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ApiNameIdDescriptionPair} obj Optional instance to populate.
    * @return {module:model/ApiNameIdDescriptionPair} The populated <code>ApiNameIdDescriptionPair</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApiNameIdDescriptionPair();
                        
            
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
