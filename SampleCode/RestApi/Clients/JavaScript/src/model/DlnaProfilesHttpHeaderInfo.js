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
import DlnaProfilesHeaderMatchType from './DlnaProfilesHeaderMatchType';

/**
* The DlnaProfilesHttpHeaderInfo model module.
* @module model/DlnaProfilesHttpHeaderInfo
* @version 4.8.10.0
*/
export default class DlnaProfilesHttpHeaderInfo {
    /**
    * Constructs a new <code>DlnaProfilesHttpHeaderInfo</code>.
    * @alias module:model/DlnaProfilesHttpHeaderInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DlnaProfilesHttpHeaderInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DlnaProfilesHttpHeaderInfo} obj Optional instance to populate.
    * @return {module:model/DlnaProfilesHttpHeaderInfo} The populated <code>DlnaProfilesHttpHeaderInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DlnaProfilesHttpHeaderInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Value')) {
                obj['Value'] = ApiClient.convertToType(data['Value'], 'String');
            }
            if (data.hasOwnProperty('Match')) {
                obj['Match'] = DlnaProfilesHeaderMatchType.constructFromObject(data['Match']);
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Value
    */
    'Value' = undefined;
    /**
    * @member {module:model/DlnaProfilesHeaderMatchType} Match
    */
    'Match' = undefined;




}
