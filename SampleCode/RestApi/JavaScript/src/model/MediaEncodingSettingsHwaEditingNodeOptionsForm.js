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
import GenericEditIEditObjectContainer from './GenericEditIEditObjectContainer';

/**
* The MediaEncodingSettingsHwaEditingNodeOptionsForm model module.
* @module model/MediaEncodingSettingsHwaEditingNodeOptionsForm
* @version 4.11.0.19
*/
export default class MediaEncodingSettingsHwaEditingNodeOptionsForm {
    /**
    * Constructs a new <code>MediaEncodingSettingsHwaEditingNodeOptionsForm</code>.
    * @alias module:model/MediaEncodingSettingsHwaEditingNodeOptionsForm
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaEncodingSettingsHwaEditingNodeOptionsForm</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaEncodingSettingsHwaEditingNodeOptionsForm} obj Optional instance to populate.
    * @return {module:model/MediaEncodingSettingsHwaEditingNodeOptionsForm} The populated <code>MediaEncodingSettingsHwaEditingNodeOptionsForm</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaEncodingSettingsHwaEditingNodeOptionsForm();
                        
            
            if (data.hasOwnProperty('IsSeparateForm')) {
                obj['IsSeparateForm'] = ApiClient.convertToType(data['IsSeparateForm'], 'Boolean');
            }
            if (data.hasOwnProperty('ShowResetToDefaults')) {
                obj['ShowResetToDefaults'] = ApiClient.convertToType(data['ShowResetToDefaults'], 'Boolean');
            }
            if (data.hasOwnProperty('Caption')) {
                obj['Caption'] = ApiClient.convertToType(data['Caption'], 'String');
            }
            if (data.hasOwnProperty('HelpUrl')) {
                obj['HelpUrl'] = ApiClient.convertToType(data['HelpUrl'], 'String');
            }
            if (data.hasOwnProperty('Form')) {
                obj['Form'] = GenericEditIEditObjectContainer.constructFromObject(data['Form']);
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} IsSeparateForm
    */
    'IsSeparateForm' = undefined;
    /**
    * @member {Boolean} ShowResetToDefaults
    */
    'ShowResetToDefaults' = undefined;
    /**
    * @member {String} Caption
    */
    'Caption' = undefined;
    /**
    * @member {String} HelpUrl
    */
    'HelpUrl' = undefined;
    /**
    * @member {module:model/GenericEditIEditObjectContainer} Form
    */
    'Form' = undefined;




}
