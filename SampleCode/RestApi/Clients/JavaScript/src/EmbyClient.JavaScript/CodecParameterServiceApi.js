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

import ApiClient from "../ApiClient";
import EditObjectContainer from '../model/EditObjectContainer';
import MediaEncodingCodecParameterContext from '../model/MediaEncodingCodecParameterContext';

/**
* CodecParameterService service.
* @module EmbyClient.JavaScript/CodecParameterServiceApi
* @version 4.8.10.0
*/
export default class CodecParameterServiceApi {

    /**
    * Constructs a new CodecParameterServiceApi. 
    * @alias module:EmbyClient.JavaScript/CodecParameterServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getEncodingCodecparameters operation.
     * @callback module:EmbyClient.JavaScript/CodecParameterServiceApi~getEncodingCodecparametersCallback
     * @param {String} error Error message, if any.
     * @param {module:model/EditObjectContainer} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the parameters for a specified codec.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/CodecParameterServiceApi~getEncodingCodecparametersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/EditObjectContainer}
     */
    getEncodingCodecparameters() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'CodecId': codecId,
        'ParameterContext': parameterContext
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postEncodingCodecparameters operation.
     * @callback module:EmbyClient.JavaScript/CodecParameterServiceApi~postEncodingCodecparametersCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates the parameters for a specified codec.
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/CodecParameterServiceApi~postEncodingCodecparametersCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postEncodingCodecparameters() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'CodecId': codecId,
        'ParameterContext': parameterContext
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
