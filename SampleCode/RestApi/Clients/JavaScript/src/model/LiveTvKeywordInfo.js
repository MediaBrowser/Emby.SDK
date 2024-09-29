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
import LiveTvKeywordType from './LiveTvKeywordType';

/**
* The LiveTvKeywordInfo model module.
* @module model/LiveTvKeywordInfo
* @version 4.8.10.0
*/
export default class LiveTvKeywordInfo {
    /**
    * Constructs a new <code>LiveTvKeywordInfo</code>.
    * @alias module:model/LiveTvKeywordInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTvKeywordInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTvKeywordInfo} obj Optional instance to populate.
    * @return {module:model/LiveTvKeywordInfo} The populated <code>LiveTvKeywordInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTvKeywordInfo();
                        
            
            if (data.hasOwnProperty('KeywordType')) {
                obj['KeywordType'] = LiveTvKeywordType.constructFromObject(data['KeywordType']);
            }
            if (data.hasOwnProperty('Keyword')) {
                obj['Keyword'] = ApiClient.convertToType(data['Keyword'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/LiveTvKeywordType} KeywordType
    */
    'KeywordType' = undefined;
    /**
    * @member {String} Keyword
    */
    'Keyword' = undefined;




}
