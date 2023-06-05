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
import EmbyMediaModelTypesResolution from './EmbyMediaModelTypesResolution';

/**
* The EmbyMediaModelTypesResolutionWithRate model module.
* @module model/EmbyMediaModelTypesResolutionWithRate
* @version 4.8.0.39
*/
export default class EmbyMediaModelTypesResolutionWithRate {
    /**
    * Constructs a new <code>EmbyMediaModelTypesResolutionWithRate</code>.
    * @alias module:model/EmbyMediaModelTypesResolutionWithRate
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyMediaModelTypesResolutionWithRate</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyMediaModelTypesResolutionWithRate} obj Optional instance to populate.
    * @return {module:model/EmbyMediaModelTypesResolutionWithRate} The populated <code>EmbyMediaModelTypesResolutionWithRate</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyMediaModelTypesResolutionWithRate();
                        
            
            if (data.hasOwnProperty('Width')) {
                obj['Width'] = ApiClient.convertToType(data['Width'], 'Number');
            }
            if (data.hasOwnProperty('Height')) {
                obj['Height'] = ApiClient.convertToType(data['Height'], 'Number');
            }
            if (data.hasOwnProperty('FrameRate')) {
                obj['FrameRate'] = ApiClient.convertToType(data['FrameRate'], 'Number');
            }
            if (data.hasOwnProperty('Resolution')) {
                obj['Resolution'] = EmbyMediaModelTypesResolution.constructFromObject(data['Resolution']);
            }
        }
        return obj;
    }

    /**
    * @member {Number} Width
    */
    'Width' = undefined;
    /**
    * @member {Number} Height
    */
    'Height' = undefined;
    /**
    * @member {Number} FrameRate
    */
    'FrameRate' = undefined;
    /**
    * @member {module:model/EmbyMediaModelTypesResolution} Resolution
    */
    'Resolution' = undefined;




}
