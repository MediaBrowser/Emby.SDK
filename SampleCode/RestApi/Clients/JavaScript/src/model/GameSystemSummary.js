/**
 * Emby REST API
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
* The GameSystemSummary model module.
* @module model/GameSystemSummary
* @version 4.7.5.0
*/
export default class GameSystemSummary {
    /**
    * Constructs a new <code>GameSystemSummary</code>.
    * @alias module:model/GameSystemSummary
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>GameSystemSummary</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/GameSystemSummary} obj Optional instance to populate.
    * @return {module:model/GameSystemSummary} The populated <code>GameSystemSummary</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GameSystemSummary();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('DisplayName')) {
                obj['DisplayName'] = ApiClient.convertToType(data['DisplayName'], 'String');
            }
            if (data.hasOwnProperty('GameCount')) {
                obj['GameCount'] = ApiClient.convertToType(data['GameCount'], 'Number');
            }
            if (data.hasOwnProperty('GameFileExtensions')) {
                obj['GameFileExtensions'] = ApiClient.convertToType(data['GameFileExtensions'], ['String']);
            }
            if (data.hasOwnProperty('ClientInstalledGameCount')) {
                obj['ClientInstalledGameCount'] = ApiClient.convertToType(data['ClientInstalledGameCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} DisplayName
    */
    'DisplayName' = undefined;
    /**
    * @member {Number} GameCount
    */
    'GameCount' = undefined;
    /**
    * @member {Array.<String>} GameFileExtensions
    */
    'GameFileExtensions' = undefined;
    /**
    * @member {Number} ClientInstalledGameCount
    */
    'ClientInstalledGameCount' = undefined;




}
