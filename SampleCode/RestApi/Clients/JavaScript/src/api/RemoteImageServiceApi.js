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
import ImageProviderInfo from '../model/ImageProviderInfo';
import ImageType from '../model/ImageType';
import ImagesBaseDownloadRemoteImage from '../model/ImagesBaseDownloadRemoteImage';
import RemoteImageResult from '../model/RemoteImageResult';

/**
* RemoteImageService service.
* @module api/RemoteImageServiceApi
* @version 4.9.0.30
*/
export default class RemoteImageServiceApi {

    /**
    * Constructs a new RemoteImageServiceApi. 
    * @alias module:api/RemoteImageServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets a remote image
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getImagesRemoteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ImageUrl': ImageUrl
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a remote image
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getImagesRemote() {
      return this.getImagesRemoteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets available remote images for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/RemoteImageResult} and HTTP response
     */
    getItemsByIdRemoteimagesWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'Type': opts['Type'],
        'StartIndex': opts['StartIndex'],
        'Limit': opts['Limit'],
        'ProviderName': opts['ProviderName'],
        'IncludeAllLanguages': opts['IncludeAllLanguages']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets available remote images for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/RemoteImageResult}
     */
    getItemsByIdRemoteimages() {
      return this.getItemsByIdRemoteimagesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets available remote image providers for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/ImageProviderInfo>} and HTTP response
     */
    getItemsByIdRemoteimagesProvidersWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets available remote image providers for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/ImageProviderInfo>}
     */
    getItemsByIdRemoteimagesProviders() {
      return this.getItemsByIdRemoteimagesProvidersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Downloads a remote image for an item
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsByIdRemoteimagesDownloadWithHttpInfo() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'Type': Type,
        'ProviderName': opts['ProviderName'],
        'ImageUrl': opts['ImageUrl']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Items/{Id}/RemoteImages/Download', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Downloads a remote image for an item
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsByIdRemoteimagesDownload() {
      return this.postItemsByIdRemoteimagesDownloadWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
