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
* The EmbyMediaModelTypesResolution model module.
* @module model/EmbyMediaModelTypesResolution
* @version 4.8.0.15
*/
export default class EmbyMediaModelTypesResolution {
    /**
    * Constructs a new <code>EmbyMediaModelTypesResolution</code>.
    * @alias module:model/EmbyMediaModelTypesResolution
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyMediaModelTypesResolution</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyMediaModelTypesResolution} obj Optional instance to populate.
    * @return {module:model/EmbyMediaModelTypesResolution} The populated <code>EmbyMediaModelTypesResolution</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyMediaModelTypesResolution();
                        
            
            if (data.hasOwnProperty('Width')) {
                obj['Width'] = ApiClient.convertToType(data['Width'], 'Number');
            }
            if (data.hasOwnProperty('Height')) {
                obj['Height'] = ApiClient.convertToType(data['Height'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Number} Width
    */
    'Width' = undefined;
    /**
    * @member {Number} Height
    */
    'Height' = undefined;




}
