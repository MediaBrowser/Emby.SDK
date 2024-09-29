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
* The BrandingBrandingOptions model module.
* @module model/BrandingBrandingOptions
* @version 4.8.10.0
*/
export default class BrandingBrandingOptions {
    /**
    * Constructs a new <code>BrandingBrandingOptions</code>.
    * @alias module:model/BrandingBrandingOptions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>BrandingBrandingOptions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/BrandingBrandingOptions} obj Optional instance to populate.
    * @return {module:model/BrandingBrandingOptions} The populated <code>BrandingBrandingOptions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BrandingBrandingOptions();
                        
            
            if (data.hasOwnProperty('LoginDisclaimer')) {
                obj['LoginDisclaimer'] = ApiClient.convertToType(data['LoginDisclaimer'], 'String');
            }
            if (data.hasOwnProperty('CustomCss')) {
                obj['CustomCss'] = ApiClient.convertToType(data['CustomCss'], 'String');
            }
        }
        return obj;
    }

    /**
    * The login disclaimer.
    * @member {String} LoginDisclaimer
    */
    'LoginDisclaimer' = undefined;
    /**
    * The custom CSS.
    * @member {String} CustomCss
    */
    'CustomCss' = undefined;




}
