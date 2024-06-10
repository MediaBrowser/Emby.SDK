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
import RecommendationDto from '../model/RecommendationDto';

/**
* MoviesService service.
* @module api/MoviesServiceApi
* @version 4.9.0.24
*/
export default class MoviesServiceApi {

    /**
    * Constructs a new MoviesServiceApi. 
    * @alias module:api/MoviesServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets movie recommendations
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RecommendationDto>} and HTTP response
     */
    getMoviesRecommendationsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'CategoryLimit': opts['CategoryLimit'],
        'ItemLimit': opts['ItemLimit'],
        'UserId': opts['UserId'],
        'ParentId': opts['ParentId'],
        'EnableImages': opts['EnableImages'],
        'EnableUserData': opts['EnableUserData'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets movie recommendations
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/RecommendationDto>}
     */
    getMoviesRecommendations() {
      return this.getMoviesRecommendationsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
