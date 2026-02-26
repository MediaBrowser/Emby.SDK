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
import PersonType from './PersonType';
import RemoteSearchResult from './RemoteSearchResult';

/**
* The UserLibraryCreditsList model module.
* @module model/UserLibraryCreditsList
* @version 4.10.0.4
*/
export default class UserLibraryCreditsList {
    /**
    * Constructs a new <code>UserLibraryCreditsList</code>.
    * @alias module:model/UserLibraryCreditsList
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UserLibraryCreditsList</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UserLibraryCreditsList} obj Optional instance to populate.
    * @return {module:model/UserLibraryCreditsList} The populated <code>UserLibraryCreditsList</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserLibraryCreditsList();
                        
            
            if (data.hasOwnProperty('PersonType')) {
                obj['PersonType'] = PersonType.constructFromObject(data['PersonType']);
            }
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [RemoteSearchResult]);
            }
        }
        return obj;
    }

    /**
    * @member {module:model/PersonType} PersonType
    */
    'PersonType' = undefined;
    /**
    * @member {Array.<module:model/RemoteSearchResult>} Items
    */
    'Items' = undefined;




}
