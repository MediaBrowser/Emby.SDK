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

/**
* The MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets model module.
* @module model/MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets
* @version 4.11.0.19
*/
export default class MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets {
    /**
    * Constructs a new <code>MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets</code>.
    * @alias module:model/MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets} obj Optional instance to populate.
    * @return {module:model/MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets} The populated <code>MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets();
                        
            
            if (data.hasOwnProperty('Up')) {
                obj['Up'] = ApiClient.convertToType(data['Up'], 'String');
            }
            if (data.hasOwnProperty('Down')) {
                obj['Down'] = ApiClient.convertToType(data['Down'], 'String');
            }
            if (data.hasOwnProperty('Left')) {
                obj['Left'] = ApiClient.convertToType(data['Left'], 'String');
            }
            if (data.hasOwnProperty('Right')) {
                obj['Right'] = ApiClient.convertToType(data['Right'], 'String');
            }
            if (data.hasOwnProperty('HasAny')) {
                obj['HasAny'] = ApiClient.convertToType(data['HasAny'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {String} Up
    */
    'Up' = undefined;
    /**
    * @member {String} Down
    */
    'Down' = undefined;
    /**
    * @member {String} Left
    */
    'Left' = undefined;
    /**
    * @member {String} Right
    */
    'Right' = undefined;
    /**
    * @member {Boolean} HasAny
    */
    'HasAny' = undefined;




}
