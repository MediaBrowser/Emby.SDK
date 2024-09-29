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
* The PathSubstitution model module.
* @module model/PathSubstitution
* @version 4.8.10.0
*/
export default class PathSubstitution {
    /**
    * Constructs a new <code>PathSubstitution</code>.
    * @alias module:model/PathSubstitution
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PathSubstitution</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PathSubstitution} obj Optional instance to populate.
    * @return {module:model/PathSubstitution} The populated <code>PathSubstitution</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PathSubstitution();
                        
            
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
