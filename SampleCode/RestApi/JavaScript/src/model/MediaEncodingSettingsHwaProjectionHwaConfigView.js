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
import MediaEncodingHwaEnumsHwaConfigMode from './MediaEncodingHwaEnumsHwaConfigMode';
import MediaEncodingSettingsHwaProjectionBasicModeOption from './MediaEncodingSettingsHwaProjectionBasicModeOption';
import MediaEncodingSettingsHwaProjectionNodesUiNodeRoot from './MediaEncodingSettingsHwaProjectionNodesUiNodeRoot';

/**
* The MediaEncodingSettingsHwaProjectionHwaConfigView model module.
* @module model/MediaEncodingSettingsHwaProjectionHwaConfigView
* @version 4.11.0.19
*/
export default class MediaEncodingSettingsHwaProjectionHwaConfigView {
    /**
    * Constructs a new <code>MediaEncodingSettingsHwaProjectionHwaConfigView</code>.
    * @alias module:model/MediaEncodingSettingsHwaProjectionHwaConfigView
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingSettingsHwaProjectionHwaConfigView</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingSettingsHwaProjectionHwaConfigView} obj Optional instance to populate.
    * @return {module:model/MediaEncodingSettingsHwaProjectionHwaConfigView} The populated <code>MediaEncodingSettingsHwaProjectionHwaConfigView</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingSettingsHwaProjectionHwaConfigView();
                        
            
            if (data.hasOwnProperty('IsInitialized')) {
                obj['IsInitialized'] = ApiClient.convertToType(data['IsInitialized'], 'Boolean');
            }
            if (data.hasOwnProperty('ConfigMode')) {
                obj['ConfigMode'] = MediaEncodingHwaEnumsHwaConfigMode.constructFromObject(data['ConfigMode']);
            }
            if (data.hasOwnProperty('Root')) {
                obj['Root'] = MediaEncodingSettingsHwaProjectionNodesUiNodeRoot.constructFromObject(data['Root']);
            }
            if (data.hasOwnProperty('FocusNodeId')) {
                obj['FocusNodeId'] = ApiClient.convertToType(data['FocusNodeId'], 'String');
            }
            if (data.hasOwnProperty('ConfigName')) {
                obj['ConfigName'] = ApiClient.convertToType(data['ConfigName'], 'String');
            }
            if (data.hasOwnProperty('ConfigSavedOn')) {
                obj['ConfigSavedOn'] = ApiClient.convertToType(data['ConfigSavedOn'], 'Date');
            }
            if (data.hasOwnProperty('ConfigSavedBy')) {
                obj['ConfigSavedBy'] = ApiClient.convertToType(data['ConfigSavedBy'], 'String');
            }
            if (data.hasOwnProperty('ConfigRevision')) {
                obj['ConfigRevision'] = ApiClient.convertToType(data['ConfigRevision'], 'Number');
            }
            if (data.hasOwnProperty('HasUnsavedChanges')) {
                obj['HasUnsavedChanges'] = ApiClient.convertToType(data['HasUnsavedChanges'], 'Boolean');
            }
            if (data.hasOwnProperty('BasicModeOptions')) {
                obj['BasicModeOptions'] = ApiClient.convertToType(data['BasicModeOptions'], [MediaEncodingSettingsHwaProjectionBasicModeOption]);
            }
            if (data.hasOwnProperty('BasicSelectedNodeId')) {
                obj['BasicSelectedNodeId'] = ApiClient.convertToType(data['BasicSelectedNodeId'], 'String');
            }
            if (data.hasOwnProperty('ModeLegend')) {
                obj['ModeLegend'] = ApiClient.convertToType(data['ModeLegend'], 'String');
            }
            if (data.hasOwnProperty('ChangeConfigWizardUrl')) {
                obj['ChangeConfigWizardUrl'] = ApiClient.convertToType(data['ChangeConfigWizardUrl'], 'String');
            }
            if (data.hasOwnProperty('HelpUrl')) {
                obj['HelpUrl'] = ApiClient.convertToType(data['HelpUrl'], 'String');
            }
            if (data.hasOwnProperty('ShowDeviceSelector')) {
                obj['ShowDeviceSelector'] = ApiClient.convertToType(data['ShowDeviceSelector'], 'Boolean');
            }
            if (data.hasOwnProperty('ShowSavedConfigInfo')) {
                obj['ShowSavedConfigInfo'] = ApiClient.convertToType(data['ShowSavedConfigInfo'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} IsInitialized
    */
    'IsInitialized' = undefined;
    /**
    * @member {module:model/MediaEncodingHwaEnumsHwaConfigMode} ConfigMode
    */
    'ConfigMode' = undefined;
    /**
    * @member {module:model/MediaEncodingSettingsHwaProjectionNodesUiNodeRoot} Root
    */
    'Root' = undefined;
    /**
    * @member {String} FocusNodeId
    */
    'FocusNodeId' = undefined;
    /**
    * @member {String} ConfigName
    */
    'ConfigName' = undefined;
    /**
    * @member {Date} ConfigSavedOn
    */
    'ConfigSavedOn' = undefined;
    /**
    * @member {String} ConfigSavedBy
    */
    'ConfigSavedBy' = undefined;
    /**
    * @member {Number} ConfigRevision
    */
    'ConfigRevision' = undefined;
    /**
    * @member {Boolean} HasUnsavedChanges
    */
    'HasUnsavedChanges' = undefined;
    /**
    * @member {Array.<module:model/MediaEncodingSettingsHwaProjectionBasicModeOption>} BasicModeOptions
    */
    'BasicModeOptions' = undefined;
    /**
    * @member {String} BasicSelectedNodeId
    */
    'BasicSelectedNodeId' = undefined;
    /**
    * @member {String} ModeLegend
    */
    'ModeLegend' = undefined;
    /**
    * @member {String} ChangeConfigWizardUrl
    */
    'ChangeConfigWizardUrl' = undefined;
    /**
    * @member {String} HelpUrl
    */
    'HelpUrl' = undefined;
    /**
    * @member {Boolean} ShowDeviceSelector
    */
    'ShowDeviceSelector' = undefined;
    /**
    * @member {Boolean} ShowSavedConfigInfo
    */
    'ShowSavedConfigInfo' = undefined;




}
