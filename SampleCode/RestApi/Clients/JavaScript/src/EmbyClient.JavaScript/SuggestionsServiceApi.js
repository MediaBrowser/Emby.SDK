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
import QueryResultBaseItemDto from '../model/QueryResultBaseItemDto';

/**
* SuggestionsService service.
* @module EmbyClient.JavaScript/SuggestionsServiceApi
* @version 4.8.10.0
*/
export default class SuggestionsServiceApi {

    /**
    * Constructs a new SuggestionsServiceApi. 
    * @alias module:EmbyClient.JavaScript/SuggestionsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getUsersByUseridSuggestions operation.
     * @callback module:EmbyClient.JavaScript/SuggestionsServiceApi~getUsersByUseridSuggestionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets items based on a query.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SuggestionsServiceApi~getUsersByUseridSuggestionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getUsersByUseridSuggestions() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': userId
      };
      let queryParams = {
        'Fields': opts['fields'],
        'EnableImages': opts['enableImages'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'EnableUserData': opts['enableUserData']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
