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
* The ProfileInformation model module.
* @module model/ProfileInformation
* @version 4.8.10.0
*/
export default class ProfileInformation {
    /**
    * Constructs a new <code>ProfileInformation</code>.
    * Class for unified presentation of all information associated with a specific codec profile.  
    * @alias module:model/ProfileInformation
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ProfileInformation</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ProfileInformation} obj Optional instance to populate.
    * @return {module:model/ProfileInformation} The populated <code>ProfileInformation</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProfileInformation();
                        
            
            if (data.hasOwnProperty('ShortName')) {
                obj['ShortName'] = ApiClient.convertToType(data['ShortName'], 'String');
            }
            if (data.hasOwnProperty('Description')) {
                obj['Description'] = ApiClient.convertToType(data['Description'], 'String');
            }
            if (data.hasOwnProperty('Details')) {
                obj['Details'] = ApiClient.convertToType(data['Details'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('BitDepths')) {
                obj['BitDepths'] = ApiClient.convertToType(data['BitDepths'], ['Number']);
            }
        }
        return obj;
    }

    /**
    * The enum member name of the profile.
    * @member {String} ShortName
    */
    'ShortName' = undefined;
    /**
    * The common name of the profile.
    * @member {String} Description
    */
    'Description' = undefined;
    /**
    * Detail information about the profile.
    * @member {String} Details
    */
    'Details' = undefined;
    /**
    * A unique identifier.
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * The bit depths.
    * @member {Array.<Number>} BitDepths
    */
    'BitDepths' = undefined;




}
