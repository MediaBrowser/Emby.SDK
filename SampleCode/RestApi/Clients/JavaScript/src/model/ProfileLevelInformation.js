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
import LevelInformation from './LevelInformation';
import ProfileInformation from './ProfileInformation';

/**
* The ProfileLevelInformation model module.
* @module model/ProfileLevelInformation
* @version 4.8.10.0
*/
export default class ProfileLevelInformation {
    /**
    * Constructs a new <code>ProfileLevelInformation</code>.
    * A class combining both &#x60;Emby.Media.Model.Types.ProfileInformation&#x60; and &#x60;Emby.Media.Model.Types.LevelInformation&#x60;.  
    * @alias module:model/ProfileLevelInformation
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ProfileLevelInformation</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ProfileLevelInformation} obj Optional instance to populate.
    * @return {module:model/ProfileLevelInformation} The populated <code>ProfileLevelInformation</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProfileLevelInformation();
                        
            
            if (data.hasOwnProperty('Profile')) {
                obj['Profile'] = ProfileInformation.constructFromObject(data['Profile']);
            }
            if (data.hasOwnProperty('Level')) {
                obj['Level'] = LevelInformation.constructFromObject(data['Level']);
            }
        }
        return obj;
    }

    /**
    * @member {module:model/ProfileInformation} Profile
    */
    'Profile' = undefined;
    /**
    * @member {module:model/LevelInformation} Level
    */
    'Level' = undefined;




}
