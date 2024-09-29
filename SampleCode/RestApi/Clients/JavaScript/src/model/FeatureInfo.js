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
import FeatureType from './FeatureType';

/**
* The FeatureInfo model module.
* @module model/FeatureInfo
* @version 4.8.10.0
*/
export default class FeatureInfo {
    /**
    * Constructs a new <code>FeatureInfo</code>.
    * @alias module:model/FeatureInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>FeatureInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/FeatureInfo} obj Optional instance to populate.
    * @return {module:model/FeatureInfo} The populated <code>FeatureInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FeatureInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('FeatureType')) {
                obj['FeatureType'] = FeatureType.constructFromObject(data['FeatureType']);
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
    * @member {module:model/FeatureType} FeatureType
    */
    'FeatureType' = undefined;




}
