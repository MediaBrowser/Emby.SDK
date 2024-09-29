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
import BaseItemDto from './BaseItemDto';
import RecommendationType from './RecommendationType';

/**
* The RecommendationDto model module.
* @module model/RecommendationDto
* @version 4.8.10.0
*/
export default class RecommendationDto {
    /**
    * Constructs a new <code>RecommendationDto</code>.
    * @alias module:model/RecommendationDto
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>RecommendationDto</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/RecommendationDto} obj Optional instance to populate.
    * @return {module:model/RecommendationDto} The populated <code>RecommendationDto</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RecommendationDto();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [BaseItemDto]);
            }
            if (data.hasOwnProperty('RecommendationType')) {
                obj['RecommendationType'] = RecommendationType.constructFromObject(data['RecommendationType']);
            }
            if (data.hasOwnProperty('BaselineItemName')) {
                obj['BaselineItemName'] = ApiClient.convertToType(data['BaselineItemName'], 'String');
            }
            if (data.hasOwnProperty('CategoryId')) {
                obj['CategoryId'] = ApiClient.convertToType(data['CategoryId'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/BaseItemDto>} Items
    */
    'Items' = undefined;
    /**
    * @member {module:model/RecommendationType} RecommendationType
    */
    'RecommendationType' = undefined;
    /**
    * @member {String} BaselineItemName
    */
    'BaselineItemName' = undefined;
    /**
    * @member {Number} CategoryId
    */
    'CategoryId' = undefined;




}
