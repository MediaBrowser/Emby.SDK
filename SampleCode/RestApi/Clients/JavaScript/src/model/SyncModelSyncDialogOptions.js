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
import SyncModelSyncJobOption from './SyncModelSyncJobOption';
import SyncModelSyncProfileOption from './SyncModelSyncProfileOption';
import SyncModelSyncQualityOption from './SyncModelSyncQualityOption';
import SyncSyncTarget from './SyncSyncTarget';

/**
* The SyncModelSyncDialogOptions model module.
* @module model/SyncModelSyncDialogOptions
* @version 4.8.0.16
*/
export default class SyncModelSyncDialogOptions {
    /**
    * Constructs a new <code>SyncModelSyncDialogOptions</code>.
    * @alias module:model/SyncModelSyncDialogOptions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncModelSyncDialogOptions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncModelSyncDialogOptions} obj Optional instance to populate.
    * @return {module:model/SyncModelSyncDialogOptions} The populated <code>SyncModelSyncDialogOptions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncModelSyncDialogOptions();
                        
            
            if (data.hasOwnProperty('Targets')) {
                obj['Targets'] = ApiClient.convertToType(data['Targets'], [SyncSyncTarget]);
            }
            if (data.hasOwnProperty('Options')) {
                obj['Options'] = ApiClient.convertToType(data['Options'], [SyncModelSyncJobOption]);
            }
            if (data.hasOwnProperty('QualityOptions')) {
                obj['QualityOptions'] = ApiClient.convertToType(data['QualityOptions'], [SyncModelSyncQualityOption]);
            }
            if (data.hasOwnProperty('ProfileOptions')) {
                obj['ProfileOptions'] = ApiClient.convertToType(data['ProfileOptions'], [SyncModelSyncProfileOption]);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/SyncSyncTarget>} Targets
    */
    'Targets' = undefined;
    /**
    * @member {Array.<module:model/SyncModelSyncJobOption>} Options
    */
    'Options' = undefined;
    /**
    * @member {Array.<module:model/SyncModelSyncQualityOption>} QualityOptions
    */
    'QualityOptions' = undefined;
    /**
    * @member {Array.<module:model/SyncModelSyncProfileOption>} ProfileOptions
    */
    'ProfileOptions' = undefined;




}
