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
import EmbyWebGenericUIApiEndpointsRunUICommand from '../model/EmbyWebGenericUIApiEndpointsRunUICommand';
import EmbyWebGenericUIModelUIViewInfo from '../model/EmbyWebGenericUIModelUIViewInfo';

/**
* GenericUIApiService service.
* @module EmbyClient.JavaScript.Beta/GenericUIApiServiceApi
* @version 4.8.0.18
*/
export default class GenericUIApiServiceApi {

    /**
    * Constructs a new GenericUIApiServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/GenericUIApiServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getUIView operation.
     * @callback module:EmbyClient.JavaScript.Beta/GenericUIApiServiceApi~getUIViewCallback
     * @param {String} error Error message, if any.
     * @param {module:model/EmbyWebGenericUIModelUIViewInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets UI view data
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/GenericUIApiServiceApi~getUIViewCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/EmbyWebGenericUIModelUIViewInfo}
     */
    getUIView() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'PageId': pageId,
        'ClientLocale': clientLocale
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = EmbyWebGenericUIModelUIViewInfo;

      return this.apiClient.callApi(
        '/UI/View', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUICommand operation.
     * @callback module:EmbyClient.JavaScript.Beta/GenericUIApiServiceApi~postUICommandCallback
     * @param {String} error Error message, if any.
     * @param {module:model/EmbyWebGenericUIModelUIViewInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Execute a command in the context of tv setup
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/GenericUIApiServiceApi~postUICommandCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/EmbyWebGenericUIModelUIViewInfo}
     */
    postUICommand() {
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
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = EmbyWebGenericUIModelUIViewInfo;

      return this.apiClient.callApi(
        '/UI/Command', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
