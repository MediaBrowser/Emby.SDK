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
import ImageProviderInfo from '../model/ImageProviderInfo';
import ImageType from '../model/ImageType';
import RemoteImageResult from '../model/RemoteImageResult';

/**
* RemoteImageService service.
* @module EmbyClient.JavaScript/RemoteImageServiceApi
* @version 4.8.10.0
*/
export default class RemoteImageServiceApi {

    /**
    * Constructs a new RemoteImageServiceApi. 
    * @alias module:EmbyClient.JavaScript/RemoteImageServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getImagesRemote operation.
     * @callback module:EmbyClient.JavaScript/RemoteImageServiceApi~getImagesRemoteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a remote image
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/RemoteImageServiceApi~getImagesRemoteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getImagesRemote() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ImageUrl': imageUrl
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
        '/Images/Remote', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdRemoteimages operation.
     * @callback module:EmbyClient.JavaScript/RemoteImageServiceApi~getItemsByIdRemoteimagesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RemoteImageResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets available remote images for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/RemoteImageServiceApi~getItemsByIdRemoteimagesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RemoteImageResult}
     */
    getItemsByIdRemoteimages() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'Type': opts['type'],
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit'],
        'ProviderName': opts['providerName'],
        'IncludeAllLanguages': opts['includeAllLanguages']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = RemoteImageResult;

      return this.apiClient.callApi(
        '/Items/{Id}/RemoteImages', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsByIdRemoteimagesProviders operation.
     * @callback module:EmbyClient.JavaScript/RemoteImageServiceApi~getItemsByIdRemoteimagesProvidersCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/ImageProviderInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets available remote image providers for an item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/RemoteImageServiceApi~getItemsByIdRemoteimagesProvidersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/ImageProviderInfo>}
     */
    getItemsByIdRemoteimagesProviders() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [ImageProviderInfo];

      return this.apiClient.callApi(
        '/Items/{Id}/RemoteImages/Providers', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsByIdRemoteimagesDownload operation.
     * @callback module:EmbyClient.JavaScript/RemoteImageServiceApi~postItemsByIdRemoteimagesDownloadCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Downloads a remote image for an item
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/RemoteImageServiceApi~postItemsByIdRemoteimagesDownloadCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsByIdRemoteimagesDownload() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'Type': type,
        'ProviderName': opts['providerName'],
        'ImageUrl': opts['imageUrl']
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
        '/Items/{Id}/RemoteImages/Download', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
