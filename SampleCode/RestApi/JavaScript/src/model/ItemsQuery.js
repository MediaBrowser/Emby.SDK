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
* The ItemsQuery model module.
* @module model/ItemsQuery
* @version 4.10.0.4
*/
export default class ItemsQuery {
    /**
    * Constructs a new <code>ItemsQuery</code>.
    * @alias module:model/ItemsQuery
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ItemsQuery</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ItemsQuery} obj Optional instance to populate.
    * @return {module:model/ItemsQuery} The populated <code>ItemsQuery</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ItemsQuery();
                        
            
            if (data.hasOwnProperty('StudioIds')) {
                obj['StudioIds'] = ApiClient.convertToType(data['StudioIds'], ['String']);
            }
            if (data.hasOwnProperty('TagIds')) {
                obj['TagIds'] = ApiClient.convertToType(data['TagIds'], ['String']);
            }
            if (data.hasOwnProperty('GenreIds')) {
                obj['GenreIds'] = ApiClient.convertToType(data['GenreIds'], ['String']);
            }
            if (data.hasOwnProperty('CollectionTypes')) {
                obj['CollectionTypes'] = ApiClient.convertToType(data['CollectionTypes'], ['String']);
            }
            if (data.hasOwnProperty('IsFavorite')) {
                obj['IsFavorite'] = ApiClient.convertToType(data['IsFavorite'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<String>} StudioIds
    */
    'StudioIds' = undefined;
    /**
    * @member {Array.<String>} TagIds
    */
    'TagIds' = undefined;
    /**
    * @member {Array.<String>} GenreIds
    */
    'GenreIds' = undefined;
    /**
    * @member {Array.<String>} CollectionTypes
    */
    'CollectionTypes' = undefined;
    /**
    * @member {Boolean} IsFavorite
    */
    'IsFavorite' = undefined;




}
