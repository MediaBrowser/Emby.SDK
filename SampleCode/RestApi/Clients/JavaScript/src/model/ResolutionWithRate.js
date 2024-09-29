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
import Resolution from './Resolution';

/**
* The ResolutionWithRate model module.
* @module model/ResolutionWithRate
* @version 4.8.10.0
*/
export default class ResolutionWithRate {
    /**
    * Constructs a new <code>ResolutionWithRate</code>.
    * Struct representing a combination of video resolution and frame rate.      &#x60;System.IEquatable&#x60;1&#x60;  
    * @alias module:model/ResolutionWithRate
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ResolutionWithRate</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ResolutionWithRate} obj Optional instance to populate.
    * @return {module:model/ResolutionWithRate} The populated <code>ResolutionWithRate</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ResolutionWithRate();
                        
            
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
                obj['Resolution'] = Resolution.constructFromObject(data['Resolution']);
            }
        }
        return obj;
    }

    /**
    * The resolution width.
    * @member {Number} Width
    */
    'Width' = undefined;
    /**
    * The resolution height.
    * @member {Number} Height
    */
    'Height' = undefined;
    /**
    * The frame rate in frames/second (fps).
    * @member {Number} FrameRate
    */
    'FrameRate' = undefined;
    /**
    * @member {module:model/Resolution} Resolution
    */
    'Resolution' = undefined;




}
