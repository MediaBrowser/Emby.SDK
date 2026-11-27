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
import ElementsIconNames from './ElementsIconNames';
import MediaEncodingSettingsHwaProjectionEnumsUiNodeState from './MediaEncodingSettingsHwaProjectionEnumsUiNodeState';
import MediaEncodingSettingsHwaProjectionEnumsUiNodeType from './MediaEncodingSettingsHwaProjectionEnumsUiNodeType';
import MediaEncodingSettingsHwaProjectionNodesUiNodeCommand from './MediaEncodingSettingsHwaProjectionNodesUiNodeCommand';
import MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets from './MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets';

/**
* The MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase model module.
* @module model/MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase
* @version 4.11.0.19
*/
export default class MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase {
    /**
    * Constructs a new <code>MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase</code>.
    * @alias module:model/MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase} obj Optional instance to populate.
    * @return {module:model/MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase} The populated <code>MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('NodeType')) {
                obj['NodeType'] = MediaEncodingSettingsHwaProjectionEnumsUiNodeType.constructFromObject(data['NodeType']);
            }
            if (data.hasOwnProperty('DisplayId')) {
                obj['DisplayId'] = ApiClient.convertToType(data['DisplayId'], 'String');
            }
            if (data.hasOwnProperty('PrimaryText')) {
                obj['PrimaryText'] = ApiClient.convertToType(data['PrimaryText'], 'String');
            }
            if (data.hasOwnProperty('SecondaryText')) {
                obj['SecondaryText'] = ApiClient.convertToType(data['SecondaryText'], 'String');
            }
            if (data.hasOwnProperty('Icon')) {
                obj['Icon'] = ElementsIconNames.constructFromObject(data['Icon']);
            }
            if (data.hasOwnProperty('State')) {
                obj['State'] = MediaEncodingSettingsHwaProjectionEnumsUiNodeState.constructFromObject(data['State']);
            }
            if (data.hasOwnProperty('IsFocusable')) {
                obj['IsFocusable'] = ApiClient.convertToType(data['IsFocusable'], 'Boolean');
            }
            if (data.hasOwnProperty('StateReason')) {
                obj['StateReason'] = ApiClient.convertToType(data['StateReason'], 'String');
            }
            if (data.hasOwnProperty('CanMove')) {
                obj['CanMove'] = MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets.constructFromObject(data['CanMove']);
            }
            if (data.hasOwnProperty('InsertAt')) {
                obj['InsertAt'] = ApiClient.convertToType(data['InsertAt'], 'String');
            }
            if (data.hasOwnProperty('Commands')) {
                obj['Commands'] = ApiClient.convertToType(data['Commands'], [MediaEncodingSettingsHwaProjectionNodesUiNodeCommand]);
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {module:model/MediaEncodingSettingsHwaProjectionEnumsUiNodeType} NodeType
    */
    'NodeType' = undefined;
    /**
    * @member {String} DisplayId
    */
    'DisplayId' = undefined;
    /**
    * @member {String} PrimaryText
    */
    'PrimaryText' = undefined;
    /**
    * @member {String} SecondaryText
    */
    'SecondaryText' = undefined;
    /**
    * @member {module:model/ElementsIconNames} Icon
    */
    'Icon' = undefined;
    /**
    * @member {module:model/MediaEncodingSettingsHwaProjectionEnumsUiNodeState} State
    */
    'State' = undefined;
    /**
    * @member {Boolean} IsFocusable
    */
    'IsFocusable' = undefined;
    /**
    * @member {String} StateReason
    */
    'StateReason' = undefined;
    /**
    * @member {module:model/MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets} CanMove
    */
    'CanMove' = undefined;
    /**
    * @member {String} InsertAt
    */
    'InsertAt' = undefined;
    /**
    * @member {Array.<module:model/MediaEncodingSettingsHwaProjectionNodesUiNodeCommand>} Commands
    */
    'Commands' = undefined;




}
