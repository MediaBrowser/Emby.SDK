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
* The ParentalRating model module.
* @module model/ParentalRating
* @version 4.8.10.0
*/
export default class ParentalRating {
    /**
    * Constructs a new <code>ParentalRating</code>.
    * Class ParentalRating  
    * @alias module:model/ParentalRating
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ParentalRating</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ParentalRating} obj Optional instance to populate.
    * @return {module:model/ParentalRating} The populated <code>ParentalRating</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ParentalRating();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Value')) {
                obj['Value'] = ApiClient.convertToType(data['Value'], 'Number');
            }
        }
        return obj;
    }

    /**
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * The value.
    * @member {Number} Value
    */
    'Value' = undefined;




}
