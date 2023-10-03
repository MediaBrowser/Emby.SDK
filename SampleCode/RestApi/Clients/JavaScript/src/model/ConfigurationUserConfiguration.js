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
import ConfigurationSegmentSkipMode from './ConfigurationSegmentSkipMode';
import ConfigurationSubtitlePlaybackMode from './ConfigurationSubtitlePlaybackMode';

/**
* The ConfigurationUserConfiguration model module.
* @module model/ConfigurationUserConfiguration
* @version 4.8.0.51
*/
export default class ConfigurationUserConfiguration {
    /**
    * Constructs a new <code>ConfigurationUserConfiguration</code>.
    * @alias module:model/ConfigurationUserConfiguration
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ConfigurationUserConfiguration</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ConfigurationUserConfiguration} obj Optional instance to populate.
    * @return {module:model/ConfigurationUserConfiguration} The populated <code>ConfigurationUserConfiguration</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConfigurationUserConfiguration();
                        
            
            if (data.hasOwnProperty('AudioLanguagePreference')) {
                obj['AudioLanguagePreference'] = ApiClient.convertToType(data['AudioLanguagePreference'], 'String');
            }
            if (data.hasOwnProperty('PlayDefaultAudioTrack')) {
                obj['PlayDefaultAudioTrack'] = ApiClient.convertToType(data['PlayDefaultAudioTrack'], 'Boolean');
            }
            if (data.hasOwnProperty('SubtitleLanguagePreference')) {
                obj['SubtitleLanguagePreference'] = ApiClient.convertToType(data['SubtitleLanguagePreference'], 'String');
            }
            if (data.hasOwnProperty('ProfilePin')) {
                obj['ProfilePin'] = ApiClient.convertToType(data['ProfilePin'], 'String');
            }
            if (data.hasOwnProperty('DisplayMissingEpisodes')) {
                obj['DisplayMissingEpisodes'] = ApiClient.convertToType(data['DisplayMissingEpisodes'], 'Boolean');
            }
            if (data.hasOwnProperty('SubtitleMode')) {
                obj['SubtitleMode'] = ConfigurationSubtitlePlaybackMode.constructFromObject(data['SubtitleMode']);
            }
            if (data.hasOwnProperty('OrderedViews')) {
                obj['OrderedViews'] = ApiClient.convertToType(data['OrderedViews'], ['String']);
            }
            if (data.hasOwnProperty('LatestItemsExcludes')) {
                obj['LatestItemsExcludes'] = ApiClient.convertToType(data['LatestItemsExcludes'], ['String']);
            }
            if (data.hasOwnProperty('MyMediaExcludes')) {
                obj['MyMediaExcludes'] = ApiClient.convertToType(data['MyMediaExcludes'], ['String']);
            }
            if (data.hasOwnProperty('HidePlayedInLatest')) {
                obj['HidePlayedInLatest'] = ApiClient.convertToType(data['HidePlayedInLatest'], 'Boolean');
            }
            if (data.hasOwnProperty('HidePlayedInMoreLikeThis')) {
                obj['HidePlayedInMoreLikeThis'] = ApiClient.convertToType(data['HidePlayedInMoreLikeThis'], 'Boolean');
            }
            if (data.hasOwnProperty('HidePlayedInSuggestions')) {
                obj['HidePlayedInSuggestions'] = ApiClient.convertToType(data['HidePlayedInSuggestions'], 'Boolean');
            }
            if (data.hasOwnProperty('RememberAudioSelections')) {
                obj['RememberAudioSelections'] = ApiClient.convertToType(data['RememberAudioSelections'], 'Boolean');
            }
            if (data.hasOwnProperty('RememberSubtitleSelections')) {
                obj['RememberSubtitleSelections'] = ApiClient.convertToType(data['RememberSubtitleSelections'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableNextEpisodeAutoPlay')) {
                obj['EnableNextEpisodeAutoPlay'] = ApiClient.convertToType(data['EnableNextEpisodeAutoPlay'], 'Boolean');
            }
            if (data.hasOwnProperty('ResumeRewindSeconds')) {
                obj['ResumeRewindSeconds'] = ApiClient.convertToType(data['ResumeRewindSeconds'], 'Number');
            }
            if (data.hasOwnProperty('IntroSkipMode')) {
                obj['IntroSkipMode'] = ConfigurationSegmentSkipMode.constructFromObject(data['IntroSkipMode']);
            }
            if (data.hasOwnProperty('EnableLocalPassword')) {
                obj['EnableLocalPassword'] = ApiClient.convertToType(data['EnableLocalPassword'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {String} AudioLanguagePreference
    */
    'AudioLanguagePreference' = undefined;
    /**
    * @member {Boolean} PlayDefaultAudioTrack
    */
    'PlayDefaultAudioTrack' = undefined;
    /**
    * @member {String} SubtitleLanguagePreference
    */
    'SubtitleLanguagePreference' = undefined;
    /**
    * @member {String} ProfilePin
    */
    'ProfilePin' = undefined;
    /**
    * @member {Boolean} DisplayMissingEpisodes
    */
    'DisplayMissingEpisodes' = undefined;
    /**
    * @member {module:model/ConfigurationSubtitlePlaybackMode} SubtitleMode
    */
    'SubtitleMode' = undefined;
    /**
    * @member {Array.<String>} OrderedViews
    */
    'OrderedViews' = undefined;
    /**
    * @member {Array.<String>} LatestItemsExcludes
    */
    'LatestItemsExcludes' = undefined;
    /**
    * @member {Array.<String>} MyMediaExcludes
    */
    'MyMediaExcludes' = undefined;
    /**
    * @member {Boolean} HidePlayedInLatest
    */
    'HidePlayedInLatest' = undefined;
    /**
    * @member {Boolean} HidePlayedInMoreLikeThis
    */
    'HidePlayedInMoreLikeThis' = undefined;
    /**
    * @member {Boolean} HidePlayedInSuggestions
    */
    'HidePlayedInSuggestions' = undefined;
    /**
    * @member {Boolean} RememberAudioSelections
    */
    'RememberAudioSelections' = undefined;
    /**
    * @member {Boolean} RememberSubtitleSelections
    */
    'RememberSubtitleSelections' = undefined;
    /**
    * @member {Boolean} EnableNextEpisodeAutoPlay
    */
    'EnableNextEpisodeAutoPlay' = undefined;
    /**
    * @member {Number} ResumeRewindSeconds
    */
    'ResumeRewindSeconds' = undefined;
    /**
    * @member {module:model/ConfigurationSegmentSkipMode} IntroSkipMode
    */
    'IntroSkipMode' = undefined;
    /**
    * @member {Boolean} EnableLocalPassword
    */
    'EnableLocalPassword' = undefined;




}
