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
* The UserLibraryMoveHomeSections model module.
* @module model/UserLibraryMoveHomeSections
* @version 4.10.0.4
*/
export default class UserLibraryMoveHomeSections {
    /**
    * Constructs a new <code>UserLibraryMoveHomeSections</code>.
    * @alias module:model/UserLibraryMoveHomeSections
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UserLibraryMoveHomeSections</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UserLibraryMoveHomeSections} obj Optional instance to populate.
    * @return {module:model/UserLibraryMoveHomeSections} The populated <code>UserLibraryMoveHomeSections</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserLibraryMoveHomeSections();
                        
            
            if (data.hasOwnProperty('Ids')) {
                obj['Ids'] = ApiClient.convertToType(data['Ids'], ['String']);
            }
            if (data.hasOwnProperty('NewIndex')) {
                obj['NewIndex'] = ApiClient.convertToType(data['NewIndex'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<String>} Ids
    */
    'Ids' = undefined;
    /**
    * @member {Number} NewIndex
    */
    'NewIndex' = undefined;




}
