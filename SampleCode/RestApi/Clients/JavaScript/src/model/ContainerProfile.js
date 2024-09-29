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
import DlnaProfileType from './DlnaProfileType';
import ProfileCondition from './ProfileCondition';

/**
* The ContainerProfile model module.
* @module model/ContainerProfile
* @version 4.8.10.0
*/
export default class ContainerProfile {
    /**
    * Constructs a new <code>ContainerProfile</code>.
    * @alias module:model/ContainerProfile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ContainerProfile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ContainerProfile} obj Optional instance to populate.
    * @return {module:model/ContainerProfile} The populated <code>ContainerProfile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ContainerProfile();
                        
            
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = DlnaProfileType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('Conditions')) {
                obj['Conditions'] = ApiClient.convertToType(data['Conditions'], [ProfileCondition]);
            }
            if (data.hasOwnProperty('Container')) {
                obj['Container'] = ApiClient.convertToType(data['Container'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/DlnaProfileType} Type
    */
    'Type' = undefined;
    /**
    * @member {Array.<module:model/ProfileCondition>} Conditions
    */
    'Conditions' = undefined;
    /**
    * @member {String} Container
    */
    'Container' = undefined;




}
