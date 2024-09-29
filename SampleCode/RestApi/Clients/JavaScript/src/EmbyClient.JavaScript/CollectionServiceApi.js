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
import CollectionsCollectionCreationResult from '../model/CollectionsCollectionCreationResult';

/**
* CollectionService service.
* @module EmbyClient.JavaScript/CollectionServiceApi
* @version 4.8.10.0
*/
export default class CollectionServiceApi {

    /**
    * Constructs a new CollectionServiceApi. 
    * @alias module:EmbyClient.JavaScript/CollectionServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteCollectionsByIdItems operation.
     * @callback module:EmbyClient.JavaScript/CollectionServiceApi~deleteCollectionsByIdItemsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Removes items from a collection
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/CollectionServiceApi~deleteCollectionsByIdItemsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteCollectionsByIdItems() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'Ids': ids
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
        '/Collections/{Id}/Items', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postCollections operation.
     * @callback module:EmbyClient.JavaScript/CollectionServiceApi~postCollectionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CollectionsCollectionCreationResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates a new collection
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/CollectionServiceApi~postCollectionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/CollectionsCollectionCreationResult}
     */
    postCollections() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'IsLocked': opts['isLocked'],
        'Name': opts['name'],
        'ParentId': opts['parentId'],
        'Ids': opts['ids']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = CollectionsCollectionCreationResult;

      return this.apiClient.callApi(
        '/Collections', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postCollectionsByIdItems operation.
     * @callback module:EmbyClient.JavaScript/CollectionServiceApi~postCollectionsByIdItemsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Adds items to a collection
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/CollectionServiceApi~postCollectionsByIdItemsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postCollectionsByIdItems() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'Ids': ids
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
        '/Collections/{Id}/Items', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postCollectionsByIdItemsDelete operation.
     * @callback module:EmbyClient.JavaScript/CollectionServiceApi~postCollectionsByIdItemsDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Removes items from a collection
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/CollectionServiceApi~postCollectionsByIdItemsDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postCollectionsByIdItemsDelete() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'Ids': ids
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
        '/Collections/{Id}/Items/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
