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
* The PersistenceIntroDebugInfo model module.
* @module model/PersistenceIntroDebugInfo
* @version 4.8.10.0
*/
export default class PersistenceIntroDebugInfo {
    /**
    * Constructs a new <code>PersistenceIntroDebugInfo</code>.
    * @alias module:model/PersistenceIntroDebugInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PersistenceIntroDebugInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PersistenceIntroDebugInfo} obj Optional instance to populate.
    * @return {module:model/PersistenceIntroDebugInfo} The populated <code>PersistenceIntroDebugInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PersistenceIntroDebugInfo();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'Number');
            }
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
            if (data.hasOwnProperty('Start')) {
                obj['Start'] = ApiClient.convertToType(data['Start'], 'Number');
            }
            if (data.hasOwnProperty('End')) {
                obj['End'] = ApiClient.convertToType(data['End'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Number} Id
    */
    'Id' = undefined;
    /**
    * @member {String} Path
    */
    'Path' = undefined;
    /**
    * @member {Number} Start
    */
    'Start' = undefined;
    /**
    * @member {Number} End
    */
    'End' = undefined;




}
