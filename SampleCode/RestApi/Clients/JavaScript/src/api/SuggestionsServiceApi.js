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
import QueryResultBaseItemDto from '../model/QueryResultBaseItemDto';

/**
* SuggestionsService service.
* @module api/SuggestionsServiceApi
* @version 4.9.0.26
*/
export default class SuggestionsServiceApi {

    /**
    * Constructs a new SuggestionsServiceApi. 
    * @alias module:api/SuggestionsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets items based on a query.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getUsersByUseridSuggestionsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': UserId
      };
      let queryParams = {
        'Fields': opts['Fields'],
        'EnableImages': opts['EnableImages'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'EnableUserData': opts['EnableUserData']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultBaseItemDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/Suggestions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets items based on a query.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getUsersByUseridSuggestions() {
      return this.getUsersByUseridSuggestionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
