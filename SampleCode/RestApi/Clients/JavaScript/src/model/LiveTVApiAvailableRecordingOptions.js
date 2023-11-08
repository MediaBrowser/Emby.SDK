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
import LiveTVApiNameIdDescriptionPair from './LiveTVApiNameIdDescriptionPair';

/**
* The LiveTVApiAvailableRecordingOptions model module.
* @module model/LiveTVApiAvailableRecordingOptions
* @version 4.8.0.58
*/
export default class LiveTVApiAvailableRecordingOptions {
    /**
    * Constructs a new <code>LiveTVApiAvailableRecordingOptions</code>.
    * @alias module:model/LiveTVApiAvailableRecordingOptions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTVApiAvailableRecordingOptions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTVApiAvailableRecordingOptions} obj Optional instance to populate.
    * @return {module:model/LiveTVApiAvailableRecordingOptions} The populated <code>LiveTVApiAvailableRecordingOptions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTVApiAvailableRecordingOptions();
                        
            
            if (data.hasOwnProperty('RecordingFolders')) {
                obj['RecordingFolders'] = ApiClient.convertToType(data['RecordingFolders'], [LiveTVApiNameIdDescriptionPair]);
            }
            if (data.hasOwnProperty('MovieRecordingFolders')) {
                obj['MovieRecordingFolders'] = ApiClient.convertToType(data['MovieRecordingFolders'], [LiveTVApiNameIdDescriptionPair]);
            }
            if (data.hasOwnProperty('SeriesRecordingFolders')) {
                obj['SeriesRecordingFolders'] = ApiClient.convertToType(data['SeriesRecordingFolders'], [LiveTVApiNameIdDescriptionPair]);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/LiveTVApiNameIdDescriptionPair>} RecordingFolders
    */
    'RecordingFolders' = undefined;
    /**
    * @member {Array.<module:model/LiveTVApiNameIdDescriptionPair>} MovieRecordingFolders
    */
    'MovieRecordingFolders' = undefined;
    /**
    * @member {Array.<module:model/LiveTVApiNameIdDescriptionPair>} SeriesRecordingFolders
    */
    'SeriesRecordingFolders' = undefined;




}
