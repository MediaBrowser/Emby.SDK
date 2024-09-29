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
import TranscodingVpStepTypes from './TranscodingVpStepTypes';

/**
* The TranscodingVpStepInfo model module.
* @module model/TranscodingVpStepInfo
* @version 4.8.10.0
*/
export default class TranscodingVpStepInfo {
    /**
    * Constructs a new <code>TranscodingVpStepInfo</code>.
    * @alias module:model/TranscodingVpStepInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>TranscodingVpStepInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/TranscodingVpStepInfo} obj Optional instance to populate.
    * @return {module:model/TranscodingVpStepInfo} The populated <code>TranscodingVpStepInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TranscodingVpStepInfo();
                        
            
            if (data.hasOwnProperty('StepType')) {
                obj['StepType'] = TranscodingVpStepTypes.constructFromObject(data['StepType']);
            }
            if (data.hasOwnProperty('StepTypeName')) {
                obj['StepTypeName'] = ApiClient.convertToType(data['StepTypeName'], 'String');
            }
            if (data.hasOwnProperty('HardwareContextName')) {
                obj['HardwareContextName'] = ApiClient.convertToType(data['HardwareContextName'], 'String');
            }
            if (data.hasOwnProperty('IsHardwareContext')) {
                obj['IsHardwareContext'] = ApiClient.convertToType(data['IsHardwareContext'], 'Boolean');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Short')) {
                obj['Short'] = ApiClient.convertToType(data['Short'], 'String');
            }
            if (data.hasOwnProperty('FfmpegName')) {
                obj['FfmpegName'] = ApiClient.convertToType(data['FfmpegName'], 'String');
            }
            if (data.hasOwnProperty('FfmpegDescription')) {
                obj['FfmpegDescription'] = ApiClient.convertToType(data['FfmpegDescription'], 'String');
            }
            if (data.hasOwnProperty('FfmpegOptions')) {
                obj['FfmpegOptions'] = ApiClient.convertToType(data['FfmpegOptions'], 'String');
            }
            if (data.hasOwnProperty('Param')) {
                obj['Param'] = ApiClient.convertToType(data['Param'], 'String');
            }
            if (data.hasOwnProperty('ParamShort')) {
                obj['ParamShort'] = ApiClient.convertToType(data['ParamShort'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/TranscodingVpStepTypes} StepType
    */
    'StepType' = undefined;
    /**
    * @member {String} StepTypeName
    */
    'StepTypeName' = undefined;
    /**
    * @member {String} HardwareContextName
    */
    'HardwareContextName' = undefined;
    /**
    * @member {Boolean} IsHardwareContext
    */
    'IsHardwareContext' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Short
    */
    'Short' = undefined;
    /**
    * @member {String} FfmpegName
    */
    'FfmpegName' = undefined;
    /**
    * @member {String} FfmpegDescription
    */
    'FfmpegDescription' = undefined;
    /**
    * @member {String} FfmpegOptions
    */
    'FfmpegOptions' = undefined;
    /**
    * @member {String} Param
    */
    'Param' = undefined;
    /**
    * @member {String} ParamShort
    */
    'ParamShort' = undefined;




}
