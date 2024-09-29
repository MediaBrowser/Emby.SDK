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
* The Resolution model module.
* @module model/Resolution
* @version 4.8.10.0
*/
export default class Resolution {
    /**
    * Constructs a new <code>Resolution</code>.
    * Struct representing a video resolution specified in X and Y dimension.      &#x60;System.IComparable&#x60;      &#x60;System.IEquatable&#x60;1&#x60;  
    * @alias module:model/Resolution
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>Resolution</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/Resolution} obj Optional instance to populate.
    * @return {module:model/Resolution} The populated <code>Resolution</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Resolution();
                        
            
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
    * The resolution width.
    * @member {Number} Width
    */
    'Width' = undefined;
    /**
    * The resolution height.
    * @member {Number} Height
    */
    'Height' = undefined;




}
