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
import EmbyMediaModelTypesLevelInformation from './EmbyMediaModelTypesLevelInformation';
import EmbyMediaModelTypesProfileInformation from './EmbyMediaModelTypesProfileInformation';

/**
* The EmbyMediaModelTypesProfileLevelInformation model module.
* @module model/EmbyMediaModelTypesProfileLevelInformation
* @version 4.8.0.39
*/
export default class EmbyMediaModelTypesProfileLevelInformation {
    /**
    * Constructs a new <code>EmbyMediaModelTypesProfileLevelInformation</code>.
    * @alias module:model/EmbyMediaModelTypesProfileLevelInformation
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyMediaModelTypesProfileLevelInformation</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyMediaModelTypesProfileLevelInformation} obj Optional instance to populate.
    * @return {module:model/EmbyMediaModelTypesProfileLevelInformation} The populated <code>EmbyMediaModelTypesProfileLevelInformation</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyMediaModelTypesProfileLevelInformation();
                        
            
            if (data.hasOwnProperty('Profile')) {
                obj['Profile'] = EmbyMediaModelTypesProfileInformation.constructFromObject(data['Profile']);
            }
            if (data.hasOwnProperty('Level')) {
                obj['Level'] = EmbyMediaModelTypesLevelInformation.constructFromObject(data['Level']);
            }
        }
        return obj;
    }

    /**
    * @member {module:model/EmbyMediaModelTypesProfileInformation} Profile
    */
    'Profile' = undefined;
    /**
    * @member {module:model/EmbyMediaModelTypesLevelInformation} Level
    */
    'Level' = undefined;




}
