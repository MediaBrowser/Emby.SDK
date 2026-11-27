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

/**
* The SecurityAttestationReply model module.
* @module model/SecurityAttestationReply
* @version 4.11.0.19
*/
export default class SecurityAttestationReply {
    /**
    * Constructs a new <code>SecurityAttestationReply</code>.
    * @alias module:model/SecurityAttestationReply
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SecurityAttestationReply</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SecurityAttestationReply} obj Optional instance to populate.
    * @return {module:model/SecurityAttestationReply} The populated <code>SecurityAttestationReply</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecurityAttestationReply();
                        
            
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('appAttestation')) {
                obj['appAttestation'] = ApiClient.convertToType(data['appAttestation'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} type
    */
    'type' = undefined;
    /**
    * @member {String} requestId
    */
    'requestId' = undefined;
    /**
    * @member {String} appAttestation
    */
    'appAttestation' = undefined;




}
