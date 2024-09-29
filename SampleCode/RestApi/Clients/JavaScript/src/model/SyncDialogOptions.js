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
import SyncJobOption from './SyncJobOption';
import SyncProfileOption from './SyncProfileOption';
import SyncQualityOption from './SyncQualityOption';
import SyncTarget from './SyncTarget';

/**
* The SyncDialogOptions model module.
* @module model/SyncDialogOptions
* @version 4.8.10.0
*/
export default class SyncDialogOptions {
    /**
    * Constructs a new <code>SyncDialogOptions</code>.
    * @alias module:model/SyncDialogOptions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncDialogOptions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncDialogOptions} obj Optional instance to populate.
    * @return {module:model/SyncDialogOptions} The populated <code>SyncDialogOptions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncDialogOptions();
                        
            
            if (data.hasOwnProperty('Targets')) {
                obj['Targets'] = ApiClient.convertToType(data['Targets'], [SyncTarget]);
            }
            if (data.hasOwnProperty('Options')) {
                obj['Options'] = ApiClient.convertToType(data['Options'], [SyncJobOption]);
            }
            if (data.hasOwnProperty('QualityOptions')) {
                obj['QualityOptions'] = ApiClient.convertToType(data['QualityOptions'], [SyncQualityOption]);
            }
            if (data.hasOwnProperty('ProfileOptions')) {
                obj['ProfileOptions'] = ApiClient.convertToType(data['ProfileOptions'], [SyncProfileOption]);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/SyncTarget>} Targets
    */
    'Targets' = undefined;
    /**
    * @member {Array.<module:model/SyncJobOption>} Options
    */
    'Options' = undefined;
    /**
    * @member {Array.<module:model/SyncQualityOption>} QualityOptions
    */
    'QualityOptions' = undefined;
    /**
    * @member {Array.<module:model/SyncProfileOption>} ProfileOptions
    */
    'ProfileOptions' = undefined;




}
