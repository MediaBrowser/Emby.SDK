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
import EditObjectContainer from '../model/EditObjectContainer';
import MediaEncodingCodecParameterContext from '../model/MediaEncodingCodecParameterContext';

/**
* CodecParameterService service.
* @module api/CodecParameterServiceApi
* @version 4.9.0.24
*/
export default class CodecParameterServiceApi {

    /**
    * Constructs a new CodecParameterServiceApi. 
    * @alias module:api/CodecParameterServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets the parameters for a specified codec.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EditObjectContainer} and HTTP response
     */
    getEncodingCodecparametersWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'CodecId': CodecId,
        'ParameterContext': ParameterContext
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = EditObjectContainer;

      return this.apiClient.callApi(
        '/Encoding/CodecParameters', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the parameters for a specified codec.
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/EditObjectContainer}
     */
    getEncodingCodecparameters() {
      return this.getEncodingCodecparametersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates the parameters for a specified codec.
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postEncodingCodecparametersWithHttpInfo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'CodecId': CodecId,
        'ParameterContext': ParameterContext
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/octet-stream'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Encoding/CodecParameters', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates the parameters for a specified codec.
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postEncodingCodecparameters() {
      return this.postEncodingCodecparametersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
