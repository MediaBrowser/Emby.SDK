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
import PlaystateCommand from './PlaystateCommand';

/**
* The PlaystateRequest model module.
* @module model/PlaystateRequest
* @version 4.8.10.0
*/
export default class PlaystateRequest {
    /**
    * Constructs a new <code>PlaystateRequest</code>.
    * @alias module:model/PlaystateRequest
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PlaystateRequest</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PlaystateRequest} obj Optional instance to populate.
    * @return {module:model/PlaystateRequest} The populated <code>PlaystateRequest</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PlaystateRequest();
                        
            
            if (data.hasOwnProperty('Command')) {
                obj['Command'] = PlaystateCommand.constructFromObject(data['Command']);
            }
            if (data.hasOwnProperty('SeekPositionTicks')) {
                obj['SeekPositionTicks'] = ApiClient.convertToType(data['SeekPositionTicks'], 'Number');
            }
            if (data.hasOwnProperty('ControllingUserId')) {
                obj['ControllingUserId'] = ApiClient.convertToType(data['ControllingUserId'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/PlaystateCommand} Command
    */
    'Command' = undefined;
    /**
    * @member {Number} SeekPositionTicks
    */
    'SeekPositionTicks' = undefined;
    /**
    * The controlling user identifier.
    * @member {String} ControllingUserId
    */
    'ControllingUserId' = undefined;




}
