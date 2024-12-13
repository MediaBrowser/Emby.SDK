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
import MetadataRefreshMode from '../model/MetadataRefreshMode';

/**
* ItemRefreshService service.
* @module api/ItemRefreshServiceApi
* @version 4.9.0.33
*/
export default class ItemRefreshServiceApi {

    /**
    * Constructs a new ItemRefreshServiceApi. 
    * @alias module:api/ItemRefreshServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Refreshes metadata for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsByIdRefreshWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'Recursive': opts['Recursive'],
        'MetadataRefreshMode': opts['MetadataRefreshMode'],
        'ImageRefreshMode': opts['ImageRefreshMode'],
        'ReplaceAllMetadata': opts['ReplaceAllMetadata'],
        'ReplaceAllImages': opts['ReplaceAllImages']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Items/{Id}/Refresh', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Refreshes metadata for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsByIdRefresh() {
      return this.postItemsByIdRefreshWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
