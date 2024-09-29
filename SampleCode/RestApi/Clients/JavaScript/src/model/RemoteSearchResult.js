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
import ProviderIdDictionary from './ProviderIdDictionary';

/**
* The RemoteSearchResult model module.
* @module model/RemoteSearchResult
* @version 4.8.10.0
*/
export default class RemoteSearchResult {
    /**
    * Constructs a new <code>RemoteSearchResult</code>.
    * @alias module:model/RemoteSearchResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>RemoteSearchResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/RemoteSearchResult} obj Optional instance to populate.
    * @return {module:model/RemoteSearchResult} The populated <code>RemoteSearchResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RemoteSearchResult();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('OriginalTitle')) {
                obj['OriginalTitle'] = ApiClient.convertToType(data['OriginalTitle'], 'String');
            }
            if (data.hasOwnProperty('ProviderIds')) {
                obj['ProviderIds'] = ProviderIdDictionary.constructFromObject(data['ProviderIds']);
            }
            if (data.hasOwnProperty('ProductionYear')) {
                obj['ProductionYear'] = ApiClient.convertToType(data['ProductionYear'], 'Number');
            }
            if (data.hasOwnProperty('IndexNumber')) {
                obj['IndexNumber'] = ApiClient.convertToType(data['IndexNumber'], 'Number');
            }
            if (data.hasOwnProperty('IndexNumberEnd')) {
                obj['IndexNumberEnd'] = ApiClient.convertToType(data['IndexNumberEnd'], 'Number');
            }
            if (data.hasOwnProperty('ParentIndexNumber')) {
                obj['ParentIndexNumber'] = ApiClient.convertToType(data['ParentIndexNumber'], 'Number');
            }
            if (data.hasOwnProperty('SortIndexNumber')) {
                obj['SortIndexNumber'] = ApiClient.convertToType(data['SortIndexNumber'], 'Number');
            }
            if (data.hasOwnProperty('SortParentIndexNumber')) {
                obj['SortParentIndexNumber'] = ApiClient.convertToType(data['SortParentIndexNumber'], 'Number');
            }
            if (data.hasOwnProperty('PremiereDate')) {
                obj['PremiereDate'] = ApiClient.convertToType(data['PremiereDate'], 'Date');
            }
            if (data.hasOwnProperty('ImageUrl')) {
                obj['ImageUrl'] = ApiClient.convertToType(data['ImageUrl'], 'String');
            }
            if (data.hasOwnProperty('SearchProviderName')) {
                obj['SearchProviderName'] = ApiClient.convertToType(data['SearchProviderName'], 'String');
            }
            if (data.hasOwnProperty('GameSystem')) {
                obj['GameSystem'] = ApiClient.convertToType(data['GameSystem'], 'String');
            }
            if (data.hasOwnProperty('Overview')) {
                obj['Overview'] = ApiClient.convertToType(data['Overview'], 'String');
            }
            if (data.hasOwnProperty('DisambiguationComment')) {
                obj['DisambiguationComment'] = ApiClient.convertToType(data['DisambiguationComment'], 'String');
            }
            if (data.hasOwnProperty('AlbumArtist')) {
                obj['AlbumArtist'] = RemoteSearchResult.constructFromObject(data['AlbumArtist']);
            }
            if (data.hasOwnProperty('Artists')) {
                obj['Artists'] = ApiClient.convertToType(data['Artists'], [RemoteSearchResult]);
            }
        }
        return obj;
    }

    /**
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} OriginalTitle
    */
    'OriginalTitle' = undefined;
    /**
    * @member {module:model/ProviderIdDictionary} ProviderIds
    */
    'ProviderIds' = undefined;
    /**
    * The year.
    * @member {Number} ProductionYear
    */
    'ProductionYear' = undefined;
    /**
    * @member {Number} IndexNumber
    */
    'IndexNumber' = undefined;
    /**
    * @member {Number} IndexNumberEnd
    */
    'IndexNumberEnd' = undefined;
    /**
    * @member {Number} ParentIndexNumber
    */
    'ParentIndexNumber' = undefined;
    /**
    * @member {Number} SortIndexNumber
    */
    'SortIndexNumber' = undefined;
    /**
    * @member {Number} SortParentIndexNumber
    */
    'SortParentIndexNumber' = undefined;
    /**
    * @member {Date} PremiereDate
    */
    'PremiereDate' = undefined;
    /**
    * @member {String} ImageUrl
    */
    'ImageUrl' = undefined;
    /**
    * @member {String} SearchProviderName
    */
    'SearchProviderName' = undefined;
    /**
    * @member {String} GameSystem
    */
    'GameSystem' = undefined;
    /**
    * @member {String} Overview
    */
    'Overview' = undefined;
    /**
    * @member {String} DisambiguationComment
    */
    'DisambiguationComment' = undefined;
    /**
    * @member {module:model/RemoteSearchResult} AlbumArtist
    */
    'AlbumArtist' = undefined;
    /**
    * @member {Array.<module:model/RemoteSearchResult>} Artists
    */
    'Artists' = undefined;




}
