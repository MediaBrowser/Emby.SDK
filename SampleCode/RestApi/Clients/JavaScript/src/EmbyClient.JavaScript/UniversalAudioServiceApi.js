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

/**
* UniversalAudioService service.
* @module EmbyClient.JavaScript/UniversalAudioServiceApi
* @version 4.8.10.0
*/
export default class UniversalAudioServiceApi {

    /**
    * Constructs a new UniversalAudioServiceApi. 
    * @alias module:EmbyClient.JavaScript/UniversalAudioServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getAudioByIdUniversal operation.
     * @callback module:EmbyClient.JavaScript/UniversalAudioServiceApi~getAudioByIdUniversalCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/UniversalAudioServiceApi~getAudioByIdUniversalCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getAudioByIdUniversal() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'DeviceId': opts['deviceId'],
        'StartTimeTicks': opts['startTimeTicks']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Audio/{Id}/universal', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getAudioByIdUniversalByContainer operation.
     * @callback module:EmbyClient.JavaScript/UniversalAudioServiceApi~getAudioByIdUniversalByContainerCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/UniversalAudioServiceApi~getAudioByIdUniversalByContainerCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getAudioByIdUniversalByContainer() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Container': container
      };
      let queryParams = {
        'DeviceId': opts['deviceId'],
        'StartTimeTicks': opts['startTimeTicks']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Audio/{Id}/universal.{Container}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headAudioByIdUniversal operation.
     * @callback module:EmbyClient.JavaScript/UniversalAudioServiceApi~headAudioByIdUniversalCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/UniversalAudioServiceApi~headAudioByIdUniversalCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headAudioByIdUniversal() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'DeviceId': opts['deviceId'],
        'StartTimeTicks': opts['startTimeTicks']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Audio/{Id}/universal', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headAudioByIdUniversalByContainer operation.
     * @callback module:EmbyClient.JavaScript/UniversalAudioServiceApi~headAudioByIdUniversalByContainerCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets an audio stream
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/UniversalAudioServiceApi~headAudioByIdUniversalByContainerCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headAudioByIdUniversalByContainer() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Container': container
      };
      let queryParams = {
        'DeviceId': opts['deviceId'],
        'StartTimeTicks': opts['startTimeTicks']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Audio/{Id}/universal.{Container}', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
