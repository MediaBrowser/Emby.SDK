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
* ChannelService service.
* @module api/ChannelServiceApi
* @version 4.9.0.24
*/
export default class ChannelServiceApi {

    /**
    * Constructs a new ChannelServiceApi. 
    * @alias module:api/ChannelServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets available channels
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getChannelsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'UserId': opts['UserId'],
        'StartIndex': opts['StartIndex'],
        'Fields': opts['Fields'],
        'Limit': opts['Limit'],
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
        '/Channels', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets available channels
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getChannels() {
      return this.getChannelsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
