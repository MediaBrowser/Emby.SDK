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
import MarkerType from './MarkerType';

/**
* The ChapterInfo model module.
* @module model/ChapterInfo
* @version 4.8.10.0
*/
export default class ChapterInfo {
    /**
    * Constructs a new <code>ChapterInfo</code>.
    * Class ChapterInfo  
    * @alias module:model/ChapterInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ChapterInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ChapterInfo} obj Optional instance to populate.
    * @return {module:model/ChapterInfo} The populated <code>ChapterInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChapterInfo();
                        
            
            if (data.hasOwnProperty('StartPositionTicks')) {
                obj['StartPositionTicks'] = ApiClient.convertToType(data['StartPositionTicks'], 'Number');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('ImageTag')) {
                obj['ImageTag'] = ApiClient.convertToType(data['ImageTag'], 'String');
            }
            if (data.hasOwnProperty('MarkerType')) {
                obj['MarkerType'] = MarkerType.constructFromObject(data['MarkerType']);
            }
            if (data.hasOwnProperty('ChapterIndex')) {
                obj['ChapterIndex'] = ApiClient.convertToType(data['ChapterIndex'], 'Number');
            }
        }
        return obj;
    }

    /**
    * The start position ticks.
    * @member {Number} StartPositionTicks
    */
    'StartPositionTicks' = undefined;
    /**
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} ImageTag
    */
    'ImageTag' = undefined;
    /**
    * @member {module:model/MarkerType} MarkerType
    */
    'MarkerType' = undefined;
    /**
    * @member {Number} ChapterIndex
    */
    'ChapterIndex' = undefined;




}
