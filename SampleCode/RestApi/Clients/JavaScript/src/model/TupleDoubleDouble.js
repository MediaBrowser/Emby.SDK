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
* The TupleDoubleDouble model module.
* @module model/TupleDoubleDouble
* @version 4.8.10.0
*/
export default class TupleDoubleDouble {
    /**
    * Constructs a new <code>TupleDoubleDouble</code>.
    * @alias module:model/TupleDoubleDouble
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>TupleDoubleDouble</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/TupleDoubleDouble} obj Optional instance to populate.
    * @return {module:model/TupleDoubleDouble} The populated <code>TupleDoubleDouble</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TupleDoubleDouble();
                        
            
            if (data.hasOwnProperty('Item1')) {
                obj['Item1'] = ApiClient.convertToType(data['Item1'], 'Number');
            }
            if (data.hasOwnProperty('Item2')) {
                obj['Item2'] = ApiClient.convertToType(data['Item2'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Number} Item1
    */
    'Item1' = undefined;
    /**
    * @member {Number} Item2
    */
    'Item2' = undefined;




}
