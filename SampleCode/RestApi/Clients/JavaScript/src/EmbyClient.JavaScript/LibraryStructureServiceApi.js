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
* @module EmbyClient.JavaScript/LibraryStructureServiceApi
* @version 4.8.10.0
*/
export default class LibraryStructureServiceApi {

    /**
    * Constructs a new LibraryStructureServiceApi. 
    * @alias module:EmbyClient.JavaScript/LibraryStructureServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteLibraryVirtualfolders operation.
     * @callback module:EmbyClient.JavaScript/LibraryStructureServiceApi~deleteLibraryVirtualfoldersCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/LibraryStructureServiceApi~deleteLibraryVirtualfoldersCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteLibraryVirtualfolders() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteLibraryVirtualfoldersPaths operation.
     * @callback module:EmbyClient.JavaScript/LibraryStructureServiceApi~deleteLibraryVirtualfoldersPathsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/LibraryStructureServiceApi~deleteLibraryVirtualfoldersPathsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteLibraryVirtualfoldersPaths() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLibraryVirtualfoldersQuery operation.
     * @callback module:EmbyClient.JavaScript/LibraryStructureServiceApi~getLibraryVirtualfoldersQueryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultVirtualFolderInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/LibraryStructureServiceApi~getLibraryVirtualfoldersQueryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultVirtualFolderInfo}
     */
    getLibraryVirtualfoldersQuery() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLibraryVirtualfolders operation.
     * @callback module:EmbyClient.JavaScript/LibraryStructureServiceApi~postLibraryVirtualfoldersCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/LibraryStructureServiceApi~postLibraryVirtualfoldersCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLibraryVirtualfolders() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLibraryVirtualfoldersDelete operation.
     * @callback module:EmbyClient.JavaScript/LibraryStructureServiceApi~postLibraryVirtualfoldersDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/LibraryStructureServiceApi~postLibraryVirtualfoldersDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLibraryVirtualfoldersDelete() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLibraryVirtualfoldersLibraryoptions operation.
     * @callback module:EmbyClient.JavaScript/LibraryStructureServiceApi~postLibraryVirtualfoldersLibraryoptionsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/LibraryStructureServiceApi~postLibraryVirtualfoldersLibraryoptionsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLibraryVirtualfoldersLibraryoptions() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLibraryVirtualfoldersName operation.
     * @callback module:EmbyClient.JavaScript/LibraryStructureServiceApi~postLibraryVirtualfoldersNameCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/LibraryStructureServiceApi~postLibraryVirtualfoldersNameCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLibraryVirtualfoldersName() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLibraryVirtualfoldersPaths operation.
     * @callback module:EmbyClient.JavaScript/LibraryStructureServiceApi~postLibraryVirtualfoldersPathsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/LibraryStructureServiceApi~postLibraryVirtualfoldersPathsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLibraryVirtualfoldersPaths() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLibraryVirtualfoldersPathsDelete operation.
     * @callback module:EmbyClient.JavaScript/LibraryStructureServiceApi~postLibraryVirtualfoldersPathsDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/LibraryStructureServiceApi~postLibraryVirtualfoldersPathsDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLibraryVirtualfoldersPathsDelete() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postLibraryVirtualfoldersPathsUpdate operation.
     * @callback module:EmbyClient.JavaScript/LibraryStructureServiceApi~postLibraryVirtualfoldersPathsUpdateCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/LibraryStructureServiceApi~postLibraryVirtualfoldersPathsUpdateCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postLibraryVirtualfoldersPathsUpdate() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
