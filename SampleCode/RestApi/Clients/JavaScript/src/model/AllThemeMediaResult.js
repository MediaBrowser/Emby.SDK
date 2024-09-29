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
import ThemeMediaResult from './ThemeMediaResult';

/**
* The AllThemeMediaResult model module.
* @module model/AllThemeMediaResult
* @version 4.8.10.0
*/
export default class AllThemeMediaResult {
    /**
    * Constructs a new <code>AllThemeMediaResult</code>.
    * @alias module:model/AllThemeMediaResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>AllThemeMediaResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/AllThemeMediaResult} obj Optional instance to populate.
    * @return {module:model/AllThemeMediaResult} The populated <code>AllThemeMediaResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AllThemeMediaResult();
                        
            
            if (data.hasOwnProperty('ThemeVideosResult')) {
                obj['ThemeVideosResult'] = ThemeMediaResult.constructFromObject(data['ThemeVideosResult']);
            }
            if (data.hasOwnProperty('ThemeSongsResult')) {
                obj['ThemeSongsResult'] = ThemeMediaResult.constructFromObject(data['ThemeSongsResult']);
            }
            if (data.hasOwnProperty('SoundtrackSongsResult')) {
                obj['SoundtrackSongsResult'] = ThemeMediaResult.constructFromObject(data['SoundtrackSongsResult']);
            }
        }
        return obj;
    }

    /**
    * @member {module:model/ThemeMediaResult} ThemeVideosResult
    */
    'ThemeVideosResult' = undefined;
    /**
    * @member {module:model/ThemeMediaResult} ThemeSongsResult
    */
    'ThemeSongsResult' = undefined;
    /**
    * @member {module:model/ThemeMediaResult} SoundtrackSongsResult
    */
    'SoundtrackSongsResult' = undefined;




}
