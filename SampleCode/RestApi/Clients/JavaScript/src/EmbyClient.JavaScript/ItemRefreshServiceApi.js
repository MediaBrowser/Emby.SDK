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
import MetadataRefreshMode from '../model/MetadataRefreshMode';

/**
* ItemRefreshService service.
* @module EmbyClient.JavaScript/ItemRefreshServiceApi
* @version 4.8.10.0
*/
export default class ItemRefreshServiceApi {

    /**
    * Constructs a new ItemRefreshServiceApi. 
    * @alias module:EmbyClient.JavaScript/ItemRefreshServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the postItemsByIdRefresh operation.
     * @callback module:EmbyClient.JavaScript/ItemRefreshServiceApi~postItemsByIdRefreshCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Refreshes metadata for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ItemRefreshServiceApi~postItemsByIdRefreshCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsByIdRefresh() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'Recursive': opts['recursive'],
        'MetadataRefreshMode': opts['metadataRefreshMode'],
        'ImageRefreshMode': opts['imageRefreshMode'],
        'ReplaceAllMetadata': opts['replaceAllMetadata'],
        'ReplaceAllImages': opts['replaceAllImages']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
