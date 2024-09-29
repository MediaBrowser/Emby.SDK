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
import DefaultDirectoryBrowserInfo from '../model/DefaultDirectoryBrowserInfo';
import GetDirectoryContents from '../model/GetDirectoryContents';
import IOFileSystemEntryInfo from '../model/IOFileSystemEntryInfo';
import ValidatePath from '../model/ValidatePath';

/**
* EnvironmentService service.
* @module EmbyClient.JavaScript/EnvironmentServiceApi
* @version 4.8.10.0
*/
export default class EnvironmentServiceApi {

    /**
    * Constructs a new EnvironmentServiceApi. 
    * @alias module:EmbyClient.JavaScript/EnvironmentServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getEnvironmentDefaultdirectorybrowser operation.
     * @callback module:EmbyClient.JavaScript/EnvironmentServiceApi~getEnvironmentDefaultdirectorybrowserCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DefaultDirectoryBrowserInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the parent path of a given path
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/EnvironmentServiceApi~getEnvironmentDefaultdirectorybrowserCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DefaultDirectoryBrowserInfo}
     */
    getEnvironmentDefaultdirectorybrowser() {
      let postBody = null;

      let pathParams = {
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
      let returnType = DefaultDirectoryBrowserInfo;

      return this.apiClient.callApi(
        '/Environment/DefaultDirectoryBrowser', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getEnvironmentDirectorycontents operation.
     * @callback module:EmbyClient.JavaScript/EnvironmentServiceApi~getEnvironmentDirectorycontentsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/IOFileSystemEntryInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the contents of a given directory in the file system
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/EnvironmentServiceApi~getEnvironmentDirectorycontentsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/IOFileSystemEntryInfo>}
     */
    getEnvironmentDirectorycontents() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Path': path,
        'IncludeFiles': opts['includeFiles'],
        'IncludeDirectories': opts['includeDirectories']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [IOFileSystemEntryInfo];

      return this.apiClient.callApi(
        '/Environment/DirectoryContents', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getEnvironmentDrives operation.
     * @callback module:EmbyClient.JavaScript/EnvironmentServiceApi~getEnvironmentDrivesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/IOFileSystemEntryInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets available drives from the server&#x27;s file system
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/EnvironmentServiceApi~getEnvironmentDrivesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/IOFileSystemEntryInfo>}
     */
    getEnvironmentDrives() {
      let postBody = null;

      let pathParams = {
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
      let returnType = [IOFileSystemEntryInfo];

      return this.apiClient.callApi(
        '/Environment/Drives', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getEnvironmentNetworkdevices operation.
     * @callback module:EmbyClient.JavaScript/EnvironmentServiceApi~getEnvironmentNetworkdevicesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/IOFileSystemEntryInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of devices on the network
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/EnvironmentServiceApi~getEnvironmentNetworkdevicesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/IOFileSystemEntryInfo>}
     */
    getEnvironmentNetworkdevices() {
      let postBody = null;

      let pathParams = {
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
      let returnType = [IOFileSystemEntryInfo];

      return this.apiClient.callApi(
        '/Environment/NetworkDevices', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getEnvironmentNetworkshares operation.
     * @callback module:EmbyClient.JavaScript/EnvironmentServiceApi~getEnvironmentNetworksharesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/IOFileSystemEntryInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets shares from a network device
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/EnvironmentServiceApi~getEnvironmentNetworksharesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/IOFileSystemEntryInfo>}
     */
    getEnvironmentNetworkshares() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Path': path
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [IOFileSystemEntryInfo];

      return this.apiClient.callApi(
        '/Environment/NetworkShares', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getEnvironmentParentpath operation.
     * @callback module:EmbyClient.JavaScript/EnvironmentServiceApi~getEnvironmentParentpathCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the parent path of a given path
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/EnvironmentServiceApi~getEnvironmentParentpathCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'String'}
     */
    getEnvironmentParentpath() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Path': path
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = 'String';

      return this.apiClient.callApi(
        '/Environment/ParentPath', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postEnvironmentDirectorycontents operation.
     * @callback module:EmbyClient.JavaScript/EnvironmentServiceApi~postEnvironmentDirectorycontentsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/IOFileSystemEntryInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the contents of a given directory in the file system
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/EnvironmentServiceApi~postEnvironmentDirectorycontentsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/IOFileSystemEntryInfo>}
     */
    postEnvironmentDirectorycontents() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'Path': path,
        'IncludeFiles': opts['includeFiles'],
        'IncludeDirectories': opts['includeDirectories']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [IOFileSystemEntryInfo];

      return this.apiClient.callApi(
        '/Environment/DirectoryContents', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postEnvironmentValidatepath operation.
     * @callback module:EmbyClient.JavaScript/EnvironmentServiceApi~postEnvironmentValidatepathCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the contents of a given directory in the file system
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/EnvironmentServiceApi~postEnvironmentValidatepathCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postEnvironmentValidatepath() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'Path': path
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
        '/Environment/ValidatePath', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
