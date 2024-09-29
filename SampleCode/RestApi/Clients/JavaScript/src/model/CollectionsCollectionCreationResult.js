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
* The CollectionsCollectionCreationResult model module.
* @module model/CollectionsCollectionCreationResult
* @version 4.8.10.0
*/
export default class CollectionsCollectionCreationResult {
    /**
    * Constructs a new <code>CollectionsCollectionCreationResult</code>.
    * @alias module:model/CollectionsCollectionCreationResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>CollectionsCollectionCreationResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/CollectionsCollectionCreationResult} obj Optional instance to populate.
    * @return {module:model/CollectionsCollectionCreationResult} The populated <code>CollectionsCollectionCreationResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CollectionsCollectionCreationResult();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;




}
