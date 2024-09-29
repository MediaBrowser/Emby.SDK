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
* The Version model module.
* @module model/Version
* @version 4.8.10.0
*/
export default class Version {
    /**
    * Constructs a new <code>Version</code>.
    * @alias module:model/Version
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>Version</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/Version} obj Optional instance to populate.
    * @return {module:model/Version} The populated <code>Version</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Version();
                        
            
            if (data.hasOwnProperty('Major')) {
                obj['Major'] = ApiClient.convertToType(data['Major'], 'Number');
            }
            if (data.hasOwnProperty('Minor')) {
                obj['Minor'] = ApiClient.convertToType(data['Minor'], 'Number');
            }
            if (data.hasOwnProperty('Build')) {
                obj['Build'] = ApiClient.convertToType(data['Build'], 'Number');
            }
            if (data.hasOwnProperty('Revision')) {
                obj['Revision'] = ApiClient.convertToType(data['Revision'], 'Number');
            }
            if (data.hasOwnProperty('MajorRevision')) {
                obj['MajorRevision'] = ApiClient.convertToType(data['MajorRevision'], 'Number');
            }
            if (data.hasOwnProperty('MinorRevision')) {
                obj['MinorRevision'] = ApiClient.convertToType(data['MinorRevision'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Number} Major
    */
    'Major' = undefined;
    /**
    * @member {Number} Minor
    */
    'Minor' = undefined;
    /**
    * @member {Number} Build
    */
    'Build' = undefined;
    /**
    * @member {Number} Revision
    */
    'Revision' = undefined;
    /**
    * @member {Number} MajorRevision
    */
    'MajorRevision' = undefined;
    /**
    * @member {Number} MinorRevision
    */
    'MinorRevision' = undefined;




}
