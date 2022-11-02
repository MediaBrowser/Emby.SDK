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
import ImageType from './ImageType';

/**
* The ConfigurationImageOption model module.
* @module model/ConfigurationImageOption
* @version 4.8.0.16
*/
export default class ConfigurationImageOption {
    /**
    * Constructs a new <code>ConfigurationImageOption</code>.
    * @alias module:model/ConfigurationImageOption
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ConfigurationImageOption</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ConfigurationImageOption} obj Optional instance to populate.
    * @return {module:model/ConfigurationImageOption} The populated <code>ConfigurationImageOption</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConfigurationImageOption();
                        
            
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ImageType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('Limit')) {
                obj['Limit'] = ApiClient.convertToType(data['Limit'], 'Number');
            }
            if (data.hasOwnProperty('MinWidth')) {
                obj['MinWidth'] = ApiClient.convertToType(data['MinWidth'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/ImageType} Type
    */
    'Type' = undefined;
    /**
    * @member {Number} Limit
    */
    'Limit' = undefined;
    /**
    * @member {Number} MinWidth
    */
    'MinWidth' = undefined;




}
