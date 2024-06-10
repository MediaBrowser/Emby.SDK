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
import LibraryAddMediaPath from '../model/LibraryAddMediaPath';
import LibraryAddVirtualFolder from '../model/LibraryAddVirtualFolder';
import LibraryRemoveMediaPath from '../model/LibraryRemoveMediaPath';
import LibraryRemoveVirtualFolder from '../model/LibraryRemoveVirtualFolder';
import LibraryRenameVirtualFolder from '../model/LibraryRenameVirtualFolder';
import LibraryUpdateLibraryOptions from '../model/LibraryUpdateLibraryOptions';
import LibraryUpdateMediaPath from '../model/LibraryUpdateMediaPath';
import QueryResultVirtualFolderInfo from '../model/QueryResultVirtualFolderInfo';

/**
* LibraryStructureService service.
* @module api/LibraryStructureServiceApi
* @version 4.9.0.24
*/
export default class LibraryStructureServiceApi {

    /**
    * Constructs a new LibraryStructureServiceApi. 
    * @alias module:api/LibraryStructureServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteLibraryVirtualfoldersWithHttpInfo() {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Library/VirtualFolders', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteLibraryVirtualfolders() {
      return this.deleteLibraryVirtualfoldersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteLibraryVirtualfoldersPathsWithHttpInfo() {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Library/VirtualFolders/Paths', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteLibraryVirtualfoldersPaths() {
      return this.deleteLibraryVirtualfoldersPathsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultVirtualFolderInfo} and HTTP response
     */
    getLibraryVirtualfoldersQueryWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'StartIndex': opts['StartIndex'],
        'Limit': opts['Limit']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultVirtualFolderInfo;

      return this.apiClient.callApi(
        '/Library/VirtualFolders/Query', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultVirtualFolderInfo}
     */
    getLibraryVirtualfoldersQuery() {
      return this.getLibraryVirtualfoldersQueryWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLibraryVirtualfoldersWithHttpInfo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
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
        '/Library/VirtualFolders', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLibraryVirtualfolders() {
      return this.postLibraryVirtualfoldersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLibraryVirtualfoldersDeleteWithHttpInfo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
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
        '/Library/VirtualFolders/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLibraryVirtualfoldersDelete() {
      return this.postLibraryVirtualfoldersDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLibraryVirtualfoldersLibraryoptionsWithHttpInfo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
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
        '/Library/VirtualFolders/LibraryOptions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLibraryVirtualfoldersLibraryoptions() {
      return this.postLibraryVirtualfoldersLibraryoptionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLibraryVirtualfoldersNameWithHttpInfo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
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
        '/Library/VirtualFolders/Name', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLibraryVirtualfoldersName() {
      return this.postLibraryVirtualfoldersNameWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLibraryVirtualfoldersPathsWithHttpInfo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
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
        '/Library/VirtualFolders/Paths', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLibraryVirtualfoldersPaths() {
      return this.postLibraryVirtualfoldersPathsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLibraryVirtualfoldersPathsDeleteWithHttpInfo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
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
        '/Library/VirtualFolders/Paths/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLibraryVirtualfoldersPathsDelete() {
      return this.postLibraryVirtualfoldersPathsDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postLibraryVirtualfoldersPathsUpdateWithHttpInfo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
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
        '/Library/VirtualFolders/Paths/Update', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postLibraryVirtualfoldersPathsUpdate() {
      return this.postLibraryVirtualfoldersPathsUpdateWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
