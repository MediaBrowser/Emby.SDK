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
import EmbyFeaturesFeatureType from './EmbyFeaturesFeatureType';

/**
* The EmbyFeaturesFeatureInfo model module.
* @module model/EmbyFeaturesFeatureInfo
* @version 4.8.0.43
*/
export default class EmbyFeaturesFeatureInfo {
    /**
    * Constructs a new <code>EmbyFeaturesFeatureInfo</code>.
    * @alias module:model/EmbyFeaturesFeatureInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyFeaturesFeatureInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyFeaturesFeatureInfo} obj Optional instance to populate.
    * @return {module:model/EmbyFeaturesFeatureInfo} The populated <code>EmbyFeaturesFeatureInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyFeaturesFeatureInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('FeatureType')) {
                obj['FeatureType'] = EmbyFeaturesFeatureType.constructFromObject(data['FeatureType']);
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {module:model/EmbyFeaturesFeatureType} FeatureType
    */
    'FeatureType' = undefined;




}
