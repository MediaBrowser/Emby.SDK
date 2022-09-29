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
import GameSystemSummary from '../model/GameSystemSummary';

/**
* GamesService service.
* @module EmbyClient.JavaScript.Beta/GamesServiceApi
* @version 4.8.0.10
*/
export default class GamesServiceApi {

    /**
    * Constructs a new GamesServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/GamesServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getGamesSystemsummaries operation.
     * @callback module:EmbyClient.JavaScript.Beta/GamesServiceApi~getGamesSystemsummariesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/GameSystemSummary>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Finds games similar to a given game.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/GamesServiceApi~getGamesSystemsummariesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/GameSystemSummary>}
     */
    getGamesSystemsummaries() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'UserId': opts['userId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [GameSystemSummary];

      return this.apiClient.callApi(
        '/Games/SystemSummaries', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
