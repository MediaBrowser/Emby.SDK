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
import EmbyDlnaProfilesHeaderMatchType from './EmbyDlnaProfilesHeaderMatchType';

/**
* The EmbyDlnaProfilesHttpHeaderInfo model module.
* @module model/EmbyDlnaProfilesHttpHeaderInfo
* @version 4.8.0.30
*/
export default class EmbyDlnaProfilesHttpHeaderInfo {
    /**
    * Constructs a new <code>EmbyDlnaProfilesHttpHeaderInfo</code>.
    * @alias module:model/EmbyDlnaProfilesHttpHeaderInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyDlnaProfilesHttpHeaderInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyDlnaProfilesHttpHeaderInfo} obj Optional instance to populate.
    * @return {module:model/EmbyDlnaProfilesHttpHeaderInfo} The populated <code>EmbyDlnaProfilesHttpHeaderInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyDlnaProfilesHttpHeaderInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Value')) {
                obj['Value'] = ApiClient.convertToType(data['Value'], 'String');
            }
            if (data.hasOwnProperty('Match')) {
                obj['Match'] = EmbyDlnaProfilesHeaderMatchType.constructFromObject(data['Match']);
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
    * @member {module:model/EmbyDlnaProfilesHeaderMatchType} Match
    */
    'Match' = undefined;




}
