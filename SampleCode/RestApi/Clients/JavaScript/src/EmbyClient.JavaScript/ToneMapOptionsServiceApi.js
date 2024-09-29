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

/**
* ToneMapOptionsService service.
* @module EmbyClient.JavaScript/ToneMapOptionsServiceApi
* @version 4.8.10.0
*/
export default class ToneMapOptionsServiceApi {

    /**
    * Constructs a new ToneMapOptionsServiceApi. 
    * @alias module:EmbyClient.JavaScript/ToneMapOptionsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getEncodingFulltonemapoptions operation.
     * @callback module:EmbyClient.JavaScript/ToneMapOptionsServiceApi~getEncodingFulltonemapoptionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/EditObjectContainer} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the tone mapping options
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ToneMapOptionsServiceApi~getEncodingFulltonemapoptionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/EditObjectContainer}
     */
    getEncodingFulltonemapoptions() {
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
      let returnType = EditObjectContainer;

      return this.apiClient.callApi(
        '/Encoding/FullToneMapOptions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getEncodingPublictonemapoptions operation.
     * @callback module:EmbyClient.JavaScript/ToneMapOptionsServiceApi~getEncodingPublictonemapoptionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/EditObjectContainer} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the tone mapping options
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ToneMapOptionsServiceApi~getEncodingPublictonemapoptionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/EditObjectContainer}
     */
    getEncodingPublictonemapoptions() {
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
      let returnType = EditObjectContainer;

      return this.apiClient.callApi(
        '/Encoding/PublicToneMapOptions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postEncodingFulltonemapoptions operation.
     * @callback module:EmbyClient.JavaScript/ToneMapOptionsServiceApi~postEncodingFulltonemapoptionsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates the tone mapping options
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ToneMapOptionsServiceApi~postEncodingFulltonemapoptionsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postEncodingFulltonemapoptions() {
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
        '/Encoding/FullToneMapOptions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postEncodingPublictonemapoptions operation.
     * @callback module:EmbyClient.JavaScript/ToneMapOptionsServiceApi~postEncodingPublictonemapoptionsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates the tone mapping options
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ToneMapOptionsServiceApi~postEncodingPublictonemapoptionsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postEncodingPublictonemapoptions() {
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
        '/Encoding/PublicToneMapOptions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
