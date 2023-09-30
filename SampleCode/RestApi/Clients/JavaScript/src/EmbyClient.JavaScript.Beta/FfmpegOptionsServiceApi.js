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
import EmbyWebGenericEditEditObjectContainer from '../model/EmbyWebGenericEditEditObjectContainer';

/**
* FfmpegOptionsService service.
* @module EmbyClient.JavaScript.Beta/FfmpegOptionsServiceApi
* @version 4.8.0.49
*/
export default class FfmpegOptionsServiceApi {

    /**
    * Constructs a new FfmpegOptionsServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/FfmpegOptionsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getEncodingFfmpegoptions operation.
     * @callback module:EmbyClient.JavaScript.Beta/FfmpegOptionsServiceApi~getEncodingFfmpegoptionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/EmbyWebGenericEditEditObjectContainer} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the ffmpeg options
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/FfmpegOptionsServiceApi~getEncodingFfmpegoptionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/EmbyWebGenericEditEditObjectContainer}
     */
    getEncodingFfmpegoptions() {
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
      let returnType = EmbyWebGenericEditEditObjectContainer;

      return this.apiClient.callApi(
        '/Encoding/FfmpegOptions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postEncodingFfmpegoptions operation.
     * @callback module:EmbyClient.JavaScript.Beta/FfmpegOptionsServiceApi~postEncodingFfmpegoptionsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates the ffmpeg options
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/FfmpegOptionsServiceApi~postEncodingFfmpegoptionsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postEncodingFfmpegoptions() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
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
        '/Encoding/FfmpegOptions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
