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

/**
* The GeneralCommand model module.
* @module model/GeneralCommand
* @version 4.8.10.0
*/
export default class GeneralCommand {
    /**
    * Constructs a new <code>GeneralCommand</code>.
    * @alias module:model/GeneralCommand
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>GeneralCommand</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/GeneralCommand} obj Optional instance to populate.
    * @return {module:model/GeneralCommand} The populated <code>GeneralCommand</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GeneralCommand();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('ControllingUserId')) {
                obj['ControllingUserId'] = ApiClient.convertToType(data['ControllingUserId'], 'String');
            }
            if (data.hasOwnProperty('Arguments')) {
                obj['Arguments'] = ApiClient.convertToType(data['Arguments'], {'String': 'String'});
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} ControllingUserId
    */
    'ControllingUserId' = undefined;
    /**
    * @member {Object.<String, String>} Arguments
    */
    'Arguments' = undefined;




}
