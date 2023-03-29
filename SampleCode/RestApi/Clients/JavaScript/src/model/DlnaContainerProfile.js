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
import DlnaDlnaProfileType from './DlnaDlnaProfileType';
import DlnaProfileCondition from './DlnaProfileCondition';

/**
* The DlnaContainerProfile model module.
* @module model/DlnaContainerProfile
* @version 4.8.0.27
*/
export default class DlnaContainerProfile {
    /**
    * Constructs a new <code>DlnaContainerProfile</code>.
    * @alias module:model/DlnaContainerProfile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DlnaContainerProfile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DlnaContainerProfile} obj Optional instance to populate.
    * @return {module:model/DlnaContainerProfile} The populated <code>DlnaContainerProfile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DlnaContainerProfile();
                        
            
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = DlnaDlnaProfileType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('Conditions')) {
                obj['Conditions'] = ApiClient.convertToType(data['Conditions'], [DlnaProfileCondition]);
            }
            if (data.hasOwnProperty('Container')) {
                obj['Container'] = ApiClient.convertToType(data['Container'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/DlnaDlnaProfileType} Type
    */
    'Type' = undefined;
    /**
    * @member {Array.<module:model/DlnaProfileCondition>} Conditions
    */
    'Conditions' = undefined;
    /**
    * @member {String} Container
    */
    'Container' = undefined;




}
