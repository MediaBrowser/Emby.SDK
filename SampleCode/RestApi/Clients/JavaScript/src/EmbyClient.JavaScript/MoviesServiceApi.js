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
import RecommendationDto from '../model/RecommendationDto';

/**
* MoviesService service.
* @module EmbyClient.JavaScript/MoviesServiceApi
* @version 4.8.10.0
*/
export default class MoviesServiceApi {

    /**
    * Constructs a new MoviesServiceApi. 
    * @alias module:EmbyClient.JavaScript/MoviesServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getMoviesRecommendations operation.
     * @callback module:EmbyClient.JavaScript/MoviesServiceApi~getMoviesRecommendationsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RecommendationDto>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets movie recommendations
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/MoviesServiceApi~getMoviesRecommendationsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RecommendationDto>}
     */
    getMoviesRecommendations() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'CategoryLimit': opts['categoryLimit'],
        'ItemLimit': opts['itemLimit'],
        'UserId': opts['userId'],
        'ParentId': opts['parentId'],
        'EnableImages': opts['enableImages'],
        'EnableUserData': opts['enableUserData'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [RecommendationDto];

      return this.apiClient.callApi(
        '/Movies/Recommendations', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
