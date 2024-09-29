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
* The RemoteSubtitleInfo model module.
* @module model/RemoteSubtitleInfo
* @version 4.8.10.0
*/
export default class RemoteSubtitleInfo {
    /**
    * Constructs a new <code>RemoteSubtitleInfo</code>.
    * @alias module:model/RemoteSubtitleInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>RemoteSubtitleInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/RemoteSubtitleInfo} obj Optional instance to populate.
    * @return {module:model/RemoteSubtitleInfo} The populated <code>RemoteSubtitleInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RemoteSubtitleInfo();
                        
            
            if (data.hasOwnProperty('ThreeLetterISOLanguageName')) {
                obj['ThreeLetterISOLanguageName'] = ApiClient.convertToType(data['ThreeLetterISOLanguageName'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('ProviderName')) {
                obj['ProviderName'] = ApiClient.convertToType(data['ProviderName'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Format')) {
                obj['Format'] = ApiClient.convertToType(data['Format'], 'String');
            }
            if (data.hasOwnProperty('Author')) {
                obj['Author'] = ApiClient.convertToType(data['Author'], 'String');
            }
            if (data.hasOwnProperty('Comment')) {
                obj['Comment'] = ApiClient.convertToType(data['Comment'], 'String');
            }
            if (data.hasOwnProperty('DateCreated')) {
                obj['DateCreated'] = ApiClient.convertToType(data['DateCreated'], 'Date');
            }
            if (data.hasOwnProperty('CommunityRating')) {
                obj['CommunityRating'] = ApiClient.convertToType(data['CommunityRating'], 'Number');
            }
            if (data.hasOwnProperty('DownloadCount')) {
                obj['DownloadCount'] = ApiClient.convertToType(data['DownloadCount'], 'Number');
            }
            if (data.hasOwnProperty('IsHashMatch')) {
                obj['IsHashMatch'] = ApiClient.convertToType(data['IsHashMatch'], 'Boolean');
            }
            if (data.hasOwnProperty('IsForced')) {
                obj['IsForced'] = ApiClient.convertToType(data['IsForced'], 'Boolean');
            }
            if (data.hasOwnProperty('IsHearingImpaired')) {
                obj['IsHearingImpaired'] = ApiClient.convertToType(data['IsHearingImpaired'], 'Boolean');
            }
            if (data.hasOwnProperty('Language')) {
                obj['Language'] = ApiClient.convertToType(data['Language'], 'String');
            }
        }
        return obj;
    }

    /**
    * Use language instead to return the language specified by the subtitle provider
    * @member {String} ThreeLetterISOLanguageName
    */
    'ThreeLetterISOLanguageName' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} ProviderName
    */
    'ProviderName' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Format
    */
    'Format' = undefined;
    /**
    * @member {String} Author
    */
    'Author' = undefined;
    /**
    * @member {String} Comment
    */
    'Comment' = undefined;
    /**
    * @member {Date} DateCreated
    */
    'DateCreated' = undefined;
    /**
    * @member {Number} CommunityRating
    */
    'CommunityRating' = undefined;
    /**
    * @member {Number} DownloadCount
    */
    'DownloadCount' = undefined;
    /**
    * @member {Boolean} IsHashMatch
    */
    'IsHashMatch' = undefined;
    /**
    * @member {Boolean} IsForced
    */
    'IsForced' = undefined;
    /**
    * @member {Boolean} IsHearingImpaired
    */
    'IsHearingImpaired' = undefined;
    /**
    * @member {String} Language
    */
    'Language' = undefined;




}
