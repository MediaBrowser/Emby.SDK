/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.3
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
* The EmbyPluginGenericEditDemoDataDemoTypeInfo model module.
* @module model/EmbyPluginGenericEditDemoDataDemoTypeInfo
* @version 4.8.0.3
*/
export default class EmbyPluginGenericEditDemoDataDemoTypeInfo {
    /**
    * Constructs a new <code>EmbyPluginGenericEditDemoDataDemoTypeInfo</code>.
    * @alias module:model/EmbyPluginGenericEditDemoDataDemoTypeInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyPluginGenericEditDemoDataDemoTypeInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyPluginGenericEditDemoDataDemoTypeInfo} obj Optional instance to populate.
    * @return {module:model/EmbyPluginGenericEditDemoDataDemoTypeInfo} The populated <code>EmbyPluginGenericEditDemoDataDemoTypeInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyPluginGenericEditDemoDataDemoTypeInfo();
                        
            
            if (data.hasOwnProperty('DemoType')) {
                obj['DemoType'] = ApiClient.convertToType(data['DemoType'], 'Number');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Number} DemoType
    */
    'DemoType' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;




}
