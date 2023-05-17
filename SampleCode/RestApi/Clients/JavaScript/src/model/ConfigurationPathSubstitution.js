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
* The ConfigurationPathSubstitution model module.
* @module model/ConfigurationPathSubstitution
* @version 4.8.0.36
*/
export default class ConfigurationPathSubstitution {
    /**
    * Constructs a new <code>ConfigurationPathSubstitution</code>.
    * @alias module:model/ConfigurationPathSubstitution
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ConfigurationPathSubstitution</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ConfigurationPathSubstitution} obj Optional instance to populate.
    * @return {module:model/ConfigurationPathSubstitution} The populated <code>ConfigurationPathSubstitution</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConfigurationPathSubstitution();
                        
            
            if (data.hasOwnProperty('From')) {
                obj['From'] = ApiClient.convertToType(data['From'], 'String');
            }
            if (data.hasOwnProperty('To')) {
                obj['To'] = ApiClient.convertToType(data['To'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} From
    */
    'From' = undefined;
    /**
    * @member {String} To
    */
    'To' = undefined;




}
