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
import DefaultDirectoryBrowserInfo from '../model/DefaultDirectoryBrowserInfo';
import GetDirectoryContents from '../model/GetDirectoryContents';
import IOFileSystemEntryInfo from '../model/IOFileSystemEntryInfo';
import ValidatePath from '../model/ValidatePath';

/**
* EnvironmentService service.
* @module api/EnvironmentServiceApi
* @version 4.9.0.33
*/
export default class EnvironmentServiceApi {

    /**
    * Constructs a new EnvironmentServiceApi. 
    * @alias module:api/EnvironmentServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets the parent path of a given path
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/DefaultDirectoryBrowserInfo} and HTTP response
     */
    getEnvironmentDefaultdirectorybrowserWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the parent path of a given path
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/DefaultDirectoryBrowserInfo}
     */
    getEnvironmentDefaultdirectorybrowser() {
      return this.getEnvironmentDefaultdirectorybrowserWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets the contents of a given directory in the file system
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/IOFileSystemEntryInfo>} and HTTP response
     */
    getEnvironmentDirectorycontentsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Path': Path,
        'IncludeFiles': opts['IncludeFiles'],
        'IncludeDirectories': opts['IncludeDirectories']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the contents of a given directory in the file system
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/IOFileSystemEntryInfo>}
     */
    getEnvironmentDirectorycontents() {
      return this.getEnvironmentDirectorycontentsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets available drives from the server&#x27;s file system
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/IOFileSystemEntryInfo>} and HTTP response
     */
    getEnvironmentDrivesWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets available drives from the server&#x27;s file system
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/IOFileSystemEntryInfo>}
     */
    getEnvironmentDrives() {
      return this.getEnvironmentDrivesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a list of devices on the network
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/IOFileSystemEntryInfo>} and HTTP response
     */
    getEnvironmentNetworkdevicesWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a list of devices on the network
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/IOFileSystemEntryInfo>}
     */
    getEnvironmentNetworkdevices() {
      return this.getEnvironmentNetworkdevicesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets shares from a network device
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/IOFileSystemEntryInfo>} and HTTP response
     */
    getEnvironmentNetworksharesWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Path': Path
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets shares from a network device
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/IOFileSystemEntryInfo>}
     */
    getEnvironmentNetworkshares() {
      return this.getEnvironmentNetworksharesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets the parent path of a given path
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link 'String'} and HTTP response
     */
    getEnvironmentParentpathWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Path': Path
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the parent path of a given path
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link 'String'}
     */
    getEnvironmentParentpath() {
      return this.getEnvironmentParentpathWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets the contents of a given directory in the file system
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/IOFileSystemEntryInfo>} and HTTP response
     */
    postEnvironmentDirectorycontentsWithHttpInfo() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'Path': Path,
        'IncludeFiles': opts['IncludeFiles'],
        'IncludeDirectories': opts['IncludeDirectories']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the contents of a given directory in the file system
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/IOFileSystemEntryInfo>}
     */
    postEnvironmentDirectorycontents() {
      return this.postEnvironmentDirectorycontentsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets the contents of a given directory in the file system
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postEnvironmentValidatepathWithHttpInfo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'Path': Path
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the contents of a given directory in the file system
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postEnvironmentValidatepath() {
      return this.postEnvironmentValidatepathWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
