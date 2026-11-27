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
import MediaEncodingHwaConditionsConfigAdvancedConditions from './MediaEncodingHwaConditionsConfigAdvancedConditions';
import MediaEncodingHwaConditionsConfigOperationConditions from './MediaEncodingHwaConditionsConfigOperationConditions';
import MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection from './MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection';
import MediaEncodingSettingsHwaProjectionEnumsUiNodeState from './MediaEncodingSettingsHwaProjectionEnumsUiNodeState';
import MediaEncodingSettingsHwaProjectionEnumsUiNodeType from './MediaEncodingSettingsHwaProjectionEnumsUiNodeType';
import MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase from './MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase';
import MediaEncodingSettingsHwaProjectionNodesUiNodeCommand from './MediaEncodingSettingsHwaProjectionNodesUiNodeCommand';
import MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets from './MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets';

/**
* The MediaEncodingSettingsHwaProjectionNodesUiNodeRoot model module.
* @module model/MediaEncodingSettingsHwaProjectionNodesUiNodeRoot
* @version 4.11.0.19
*/
export default class MediaEncodingSettingsHwaProjectionNodesUiNodeRoot {
    /**
    * Constructs a new <code>MediaEncodingSettingsHwaProjectionNodesUiNodeRoot</code>.
    * @alias module:model/MediaEncodingSettingsHwaProjectionNodesUiNodeRoot
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingSettingsHwaProjectionNodesUiNodeRoot</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingSettingsHwaProjectionNodesUiNodeRoot} obj Optional instance to populate.
    * @return {module:model/MediaEncodingSettingsHwaProjectionNodesUiNodeRoot} The populated <code>MediaEncodingSettingsHwaProjectionNodesUiNodeRoot</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingSettingsHwaProjectionNodesUiNodeRoot();
                        
            
            if (data.hasOwnProperty('NodeType')) {
                obj['NodeType'] = MediaEncodingSettingsHwaProjectionEnumsUiNodeType.constructFromObject(data['NodeType']);
            }
            if (data.hasOwnProperty('Direction')) {
                obj['Direction'] = MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection.constructFromObject(data['Direction']);
            }
            if (data.hasOwnProperty('Nodes')) {
                obj['Nodes'] = ApiClient.convertToType(data['Nodes'], [MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase]);
            }
            if (data.hasOwnProperty('OperationConditions')) {
                obj['OperationConditions'] = MediaEncodingHwaConditionsConfigOperationConditions.constructFromObject(data['OperationConditions']);
            }
            if (data.hasOwnProperty('AdvancedConditions')) {
                obj['AdvancedConditions'] = MediaEncodingHwaConditionsConfigAdvancedConditions.constructFromObject(data['AdvancedConditions']);
            }
            if (data.hasOwnProperty('ConditionsSummary')) {
                obj['ConditionsSummary'] = ApiClient.convertToType(data['ConditionsSummary'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
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
    * @member {module:model/MediaEncodingSettingsHwaProjectionEnumsUiNodeType} NodeType
    */
    'NodeType' = undefined;
    /**
    * @member {module:model/MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection} Direction
    */
    'Direction' = undefined;
    /**
    * @member {Array.<module:model/MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase>} Nodes
    */
    'Nodes' = undefined;
    /**
    * @member {module:model/MediaEncodingHwaConditionsConfigOperationConditions} OperationConditions
    */
    'OperationConditions' = undefined;
    /**
    * @member {module:model/MediaEncodingHwaConditionsConfigAdvancedConditions} AdvancedConditions
    */
    'AdvancedConditions' = undefined;
    /**
    * @member {String} ConditionsSummary
    */
    'ConditionsSummary' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
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
