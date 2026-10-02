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
import NameIdPair from './NameIdPair';

/**
* The ApiAvailableRecordingOptions model module.
* @module model/ApiAvailableRecordingOptions
* @version 4.11.0.5
*/
export default class ApiAvailableRecordingOptions {
    /**
    * Constructs a new <code>ApiAvailableRecordingOptions</code>.
    * @alias module:model/ApiAvailableRecordingOptions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ApiAvailableRecordingOptions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ApiAvailableRecordingOptions} obj Optional instance to populate.
    * @return {module:model/ApiAvailableRecordingOptions} The populated <code>ApiAvailableRecordingOptions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApiAvailableRecordingOptions();
                        
            
            if (data.hasOwnProperty('RecordingFolders')) {
                obj['RecordingFolders'] = ApiClient.convertToType(data['RecordingFolders'], [NameIdPair]);
            }
            if (data.hasOwnProperty('MovieRecordingFolders')) {
                obj['MovieRecordingFolders'] = ApiClient.convertToType(data['MovieRecordingFolders'], [NameIdPair]);
            }
            if (data.hasOwnProperty('SeriesRecordingFolders')) {
                obj['SeriesRecordingFolders'] = ApiClient.convertToType(data['SeriesRecordingFolders'], [NameIdPair]);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/NameIdPair>} RecordingFolders
    */
    'RecordingFolders' = undefined;
    /**
    * @member {Array.<module:model/NameIdPair>} MovieRecordingFolders
    */
    'MovieRecordingFolders' = undefined;
    /**
    * @member {Array.<module:model/NameIdPair>} SeriesRecordingFolders
    */
    'SeriesRecordingFolders' = undefined;




}
