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
* The SubtitlesSubtitleDownloadResult model module.
* @module model/SubtitlesSubtitleDownloadResult
* @version 4.8.10.0
*/
export default class SubtitlesSubtitleDownloadResult {
    /**
    * Constructs a new <code>SubtitlesSubtitleDownloadResult</code>.
    * @alias module:model/SubtitlesSubtitleDownloadResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SubtitlesSubtitleDownloadResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SubtitlesSubtitleDownloadResult} obj Optional instance to populate.
    * @return {module:model/SubtitlesSubtitleDownloadResult} The populated <code>SubtitlesSubtitleDownloadResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SubtitlesSubtitleDownloadResult();
                        
            
            if (data.hasOwnProperty('NewIndex')) {
                obj['NewIndex'] = ApiClient.convertToType(data['NewIndex'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Number} NewIndex
    */
    'NewIndex' = undefined;




}
