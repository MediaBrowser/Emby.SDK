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
* The LiveTvTunerHostInfo model module.
* @module model/LiveTvTunerHostInfo
* @version 4.8.10.0
*/
export default class LiveTvTunerHostInfo {
    /**
    * Constructs a new <code>LiveTvTunerHostInfo</code>.
    * @alias module:model/LiveTvTunerHostInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTvTunerHostInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTvTunerHostInfo} obj Optional instance to populate.
    * @return {module:model/LiveTvTunerHostInfo} The populated <code>LiveTvTunerHostInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTvTunerHostInfo();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Url')) {
                obj['Url'] = ApiClient.convertToType(data['Url'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('DeviceId')) {
                obj['DeviceId'] = ApiClient.convertToType(data['DeviceId'], 'String');
            }
            if (data.hasOwnProperty('FriendlyName')) {
                obj['FriendlyName'] = ApiClient.convertToType(data['FriendlyName'], 'String');
            }
            if (data.hasOwnProperty('SetupUrl')) {
                obj['SetupUrl'] = ApiClient.convertToType(data['SetupUrl'], 'String');
            }
            if (data.hasOwnProperty('ImportFavoritesOnly')) {
                obj['ImportFavoritesOnly'] = ApiClient.convertToType(data['ImportFavoritesOnly'], 'Boolean');
            }
            if (data.hasOwnProperty('PreferEpgChannelImages')) {
                obj['PreferEpgChannelImages'] = ApiClient.convertToType(data['PreferEpgChannelImages'], 'Boolean');
            }
            if (data.hasOwnProperty('PreferEpgChannelNumbers')) {
                obj['PreferEpgChannelNumbers'] = ApiClient.convertToType(data['PreferEpgChannelNumbers'], 'Boolean');
            }
            if (data.hasOwnProperty('AllowHWTranscoding')) {
                obj['AllowHWTranscoding'] = ApiClient.convertToType(data['AllowHWTranscoding'], 'Boolean');
            }
            if (data.hasOwnProperty('AllowMappingByNumber')) {
                obj['AllowMappingByNumber'] = ApiClient.convertToType(data['AllowMappingByNumber'], 'Boolean');
            }
            if (data.hasOwnProperty('ImportGuideData')) {
                obj['ImportGuideData'] = ApiClient.convertToType(data['ImportGuideData'], 'Boolean');
            }
            if (data.hasOwnProperty('Source')) {
                obj['Source'] = ApiClient.convertToType(data['Source'], 'String');
            }
            if (data.hasOwnProperty('TunerCount')) {
                obj['TunerCount'] = ApiClient.convertToType(data['TunerCount'], 'Number');
            }
            if (data.hasOwnProperty('UserAgent')) {
                obj['UserAgent'] = ApiClient.convertToType(data['UserAgent'], 'String');
            }
            if (data.hasOwnProperty('Referrer')) {
                obj['Referrer'] = ApiClient.convertToType(data['Referrer'], 'String');
            }
            if (data.hasOwnProperty('ProviderOptions')) {
                obj['ProviderOptions'] = ApiClient.convertToType(data['ProviderOptions'], 'String');
            }
            if (data.hasOwnProperty('DataVersion')) {
                obj['DataVersion'] = ApiClient.convertToType(data['DataVersion'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} Url
    */
    'Url' = undefined;
    /**
    * @member {String} Type
    */
    'Type' = undefined;
    /**
    * @member {String} DeviceId
    */
    'DeviceId' = undefined;
    /**
    * @member {String} FriendlyName
    */
    'FriendlyName' = undefined;
    /**
    * @member {String} SetupUrl
    */
    'SetupUrl' = undefined;
    /**
    * @member {Boolean} ImportFavoritesOnly
    */
    'ImportFavoritesOnly' = undefined;
    /**
    * @member {Boolean} PreferEpgChannelImages
    */
    'PreferEpgChannelImages' = undefined;
    /**
    * @member {Boolean} PreferEpgChannelNumbers
    */
    'PreferEpgChannelNumbers' = undefined;
    /**
    * @member {Boolean} AllowHWTranscoding
    */
    'AllowHWTranscoding' = undefined;
    /**
    * @member {Boolean} AllowMappingByNumber
    */
    'AllowMappingByNumber' = undefined;
    /**
    * @member {Boolean} ImportGuideData
    */
    'ImportGuideData' = undefined;
    /**
    * @member {String} Source
    */
    'Source' = undefined;
    /**
    * @member {Number} TunerCount
    */
    'TunerCount' = undefined;
    /**
    * @member {String} UserAgent
    */
    'UserAgent' = undefined;
    /**
    * @member {String} Referrer
    */
    'Referrer' = undefined;
    /**
    * @member {String} ProviderOptions
    */
    'ProviderOptions' = undefined;
    /**
    * @member {Number} DataVersion
    */
    'DataVersion' = undefined;




}
