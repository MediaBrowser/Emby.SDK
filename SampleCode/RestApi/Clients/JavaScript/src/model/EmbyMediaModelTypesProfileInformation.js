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
* The EmbyMediaModelTypesProfileInformation model module.
* @module model/EmbyMediaModelTypesProfileInformation
* @version 4.8.0.33
*/
export default class EmbyMediaModelTypesProfileInformation {
    /**
    * Constructs a new <code>EmbyMediaModelTypesProfileInformation</code>.
    * @alias module:model/EmbyMediaModelTypesProfileInformation
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyMediaModelTypesProfileInformation</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyMediaModelTypesProfileInformation} obj Optional instance to populate.
    * @return {module:model/EmbyMediaModelTypesProfileInformation} The populated <code>EmbyMediaModelTypesProfileInformation</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyMediaModelTypesProfileInformation();
                        
            
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
    * @member {String} ShortName
    */
    'ShortName' = undefined;
    /**
    * @member {String} Description
    */
    'Description' = undefined;
    /**
    * @member {String} Details
    */
    'Details' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {Array.<Number>} BitDepths
    */
    'BitDepths' = undefined;




}
