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
import RunUICommand from '../model/RunUICommand';
import UIViewInfo from '../model/UIViewInfo';

/**
* GenericUIApiService service.
* @module api/GenericUIApiServiceApi
* @version 4.9.0.26
*/
export default class GenericUIApiServiceApi {

    /**
    * Constructs a new GenericUIApiServiceApi. 
    * @alias module:api/GenericUIApiServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets UI view data
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UIViewInfo} and HTTP response
     */
    getUIViewWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'PageId': PageId,
        'ClientLocale': ClientLocale
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = UIViewInfo;

      return this.apiClient.callApi(
        '/UI/View', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets UI view data
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/UIViewInfo}
     */
    getUIView() {
      return this.getUIViewWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Execute a command in the context of tv setup
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UIViewInfo} and HTTP response
     */
    postUICommandWithHttpInfo() {
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
      let returnType = UIViewInfo;

      return this.apiClient.callApi(
        '/UI/Command', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Execute a command in the context of tv setup
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/UIViewInfo}
     */
    postUICommand() {
      return this.postUICommandWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
