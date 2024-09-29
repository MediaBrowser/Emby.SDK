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
* UserViewsService service.
* @module EmbyClient.JavaScript/UserViewsServiceApi
* @version 4.8.10.0
*/
export default class UserViewsServiceApi {

    /**
    * Constructs a new UserViewsServiceApi. 
    * @alias module:EmbyClient.JavaScript/UserViewsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getUsersByUseridViews operation.
     * @callback module:EmbyClient.JavaScript/UserViewsServiceApi~getUsersByUseridViewsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserViewsServiceApi~getUsersByUseridViewsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getUsersByUseridViews() {
      let postBody = null;

      let pathParams = {
        'UserId': userId
      };
      let queryParams = {
        'IncludeExternalContent': includeExternalContent
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
        '/Users/{UserId}/Views', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
