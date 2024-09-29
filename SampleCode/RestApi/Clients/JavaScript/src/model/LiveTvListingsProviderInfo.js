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
import NameValuePair from './NameValuePair';

/**
* The LiveTvListingsProviderInfo model module.
* @module model/LiveTvListingsProviderInfo
* @version 4.8.10.0
*/
export default class LiveTvListingsProviderInfo {
    /**
    * Constructs a new <code>LiveTvListingsProviderInfo</code>.
    * @alias module:model/LiveTvListingsProviderInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTvListingsProviderInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTvListingsProviderInfo} obj Optional instance to populate.
    * @return {module:model/LiveTvListingsProviderInfo} The populated <code>LiveTvListingsProviderInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTvListingsProviderInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('SetupUrl')) {
                obj['SetupUrl'] = ApiClient.convertToType(data['SetupUrl'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('Username')) {
                obj['Username'] = ApiClient.convertToType(data['Username'], 'String');
            }
            if (data.hasOwnProperty('Password')) {
                obj['Password'] = ApiClient.convertToType(data['Password'], 'String');
            }
            if (data.hasOwnProperty('ListingsId')) {
                obj['ListingsId'] = ApiClient.convertToType(data['ListingsId'], 'String');
            }
            if (data.hasOwnProperty('ZipCode')) {
                obj['ZipCode'] = ApiClient.convertToType(data['ZipCode'], 'String');
            }
            if (data.hasOwnProperty('Country')) {
                obj['Country'] = ApiClient.convertToType(data['Country'], 'String');
            }
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
            if (data.hasOwnProperty('EnabledTuners')) {
                obj['EnabledTuners'] = ApiClient.convertToType(data['EnabledTuners'], ['String']);
            }
            if (data.hasOwnProperty('EnableAllTuners')) {
                obj['EnableAllTuners'] = ApiClient.convertToType(data['EnableAllTuners'], 'Boolean');
            }
            if (data.hasOwnProperty('NewsCategories')) {
                obj['NewsCategories'] = ApiClient.convertToType(data['NewsCategories'], ['String']);
            }
            if (data.hasOwnProperty('SportsCategories')) {
                obj['SportsCategories'] = ApiClient.convertToType(data['SportsCategories'], ['String']);
            }
            if (data.hasOwnProperty('KidsCategories')) {
                obj['KidsCategories'] = ApiClient.convertToType(data['KidsCategories'], ['String']);
            }
            if (data.hasOwnProperty('MovieCategories')) {
                obj['MovieCategories'] = ApiClient.convertToType(data['MovieCategories'], ['String']);
            }
            if (data.hasOwnProperty('ChannelMappings')) {
                obj['ChannelMappings'] = ApiClient.convertToType(data['ChannelMappings'], [NameValuePair]);
            }
            if (data.hasOwnProperty('MoviePrefix')) {
                obj['MoviePrefix'] = ApiClient.convertToType(data['MoviePrefix'], 'String');
            }
            if (data.hasOwnProperty('PreferredLanguage')) {
                obj['PreferredLanguage'] = ApiClient.convertToType(data['PreferredLanguage'], 'String');
            }
            if (data.hasOwnProperty('UserAgent')) {
                obj['UserAgent'] = ApiClient.convertToType(data['UserAgent'], 'String');
            }
            if (data.hasOwnProperty('DataVersion')) {
                obj['DataVersion'] = ApiClient.convertToType(data['DataVersion'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} SetupUrl
    */
    'SetupUrl' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} Type
    */
    'Type' = undefined;
    /**
    * @member {String} Username
    */
    'Username' = undefined;
    /**
    * @member {String} Password
    */
    'Password' = undefined;
    /**
    * @member {String} ListingsId
    */
    'ListingsId' = undefined;
    /**
    * @member {String} ZipCode
    */
    'ZipCode' = undefined;
    /**
    * @member {String} Country
    */
    'Country' = undefined;
    /**
    * @member {String} Path
    */
    'Path' = undefined;
    /**
    * @member {Array.<String>} EnabledTuners
    */
    'EnabledTuners' = undefined;
    /**
    * @member {Boolean} EnableAllTuners
    */
    'EnableAllTuners' = undefined;
    /**
    * @member {Array.<String>} NewsCategories
    */
    'NewsCategories' = undefined;
    /**
    * @member {Array.<String>} SportsCategories
    */
    'SportsCategories' = undefined;
    /**
    * @member {Array.<String>} KidsCategories
    */
    'KidsCategories' = undefined;
    /**
    * @member {Array.<String>} MovieCategories
    */
    'MovieCategories' = undefined;
    /**
    * @member {Array.<module:model/NameValuePair>} ChannelMappings
    */
    'ChannelMappings' = undefined;
    /**
    * @member {String} MoviePrefix
    */
    'MoviePrefix' = undefined;
    /**
    * @member {String} PreferredLanguage
    */
    'PreferredLanguage' = undefined;
    /**
    * @member {String} UserAgent
    */
    'UserAgent' = undefined;
    /**
    * @member {String} DataVersion
    */
    'DataVersion' = undefined;




}
