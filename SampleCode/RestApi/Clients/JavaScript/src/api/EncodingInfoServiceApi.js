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

import ApiClient from "../ApiClient";
import CodecConfiguration from '../model/CodecConfiguration';
import ConfigurationToneMappingToneMapOptionsVisibility from '../model/ConfigurationToneMappingToneMapOptionsVisibility';
import VideoCodecBase from '../model/VideoCodecBase';

/**
* EncodingInfoService service.
* @module api/EncodingInfoServiceApi
* @version 4.9.0.31
*/
export default class EncodingInfoServiceApi {

    /**
    * Constructs a new EncodingInfoServiceApi. 
    * @alias module:api/EncodingInfoServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets default codec configurations
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/CodecConfiguration>} and HTTP response
     */
    getEncodingCodecconfigurationDefaultsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [CodecConfiguration];

      return this.apiClient.callApi(
        '/Encoding/CodecConfiguration/Defaults', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets default codec configurations
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/CodecConfiguration>}
     */
    getEncodingCodecconfigurationDefaults() {
      return this.getEncodingCodecconfigurationDefaultsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets details about available video encoders and decoders
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/VideoCodecBase>} and HTTP response
     */
    getEncodingCodecinformationVideoWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [VideoCodecBase];

      return this.apiClient.callApi(
        '/Encoding/CodecInformation/Video', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets details about available video encoders and decoders
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/VideoCodecBase>}
     */
    getEncodingCodecinformationVideo() {
      return this.getEncodingCodecinformationVideoWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets available tone mapping options
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ConfigurationToneMappingToneMapOptionsVisibility} and HTTP response
     */
    getEncodingTonemapoptionsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = ConfigurationToneMappingToneMapOptionsVisibility;

      return this.apiClient.callApi(
        '/Encoding/ToneMapOptions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets available tone mapping options
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ConfigurationToneMappingToneMapOptionsVisibility}
     */
    getEncodingTonemapoptions() {
      return this.getEncodingTonemapoptionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
