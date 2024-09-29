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
import PackageInfo from '../model/PackageInfo';
import PackageVersionClass from '../model/PackageVersionClass';
import PackageVersionInfo from '../model/PackageVersionInfo';

/**
* PackageService service.
* @module EmbyClient.JavaScript/PackageServiceApi
* @version 4.8.10.0
*/
export default class PackageServiceApi {

    /**
    * Constructs a new PackageServiceApi. 
    * @alias module:EmbyClient.JavaScript/PackageServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deletePackagesInstallingById operation.
     * @callback module:EmbyClient.JavaScript/PackageServiceApi~deletePackagesInstallingByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels a package installation
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/PackageServiceApi~deletePackagesInstallingByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deletePackagesInstallingById() {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Packages/Installing/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getPackages operation.
     * @callback module:EmbyClient.JavaScript/PackageServiceApi~getPackagesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/PackageInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets available packages
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/PackageServiceApi~getPackagesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/PackageInfo>}
     */
    getPackages() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'PackageType': opts['packageType'],
        'TargetSystems': opts['targetSystems'],
        'IsPremium': opts['isPremium'],
        'IsAdult': opts['isAdult']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [PackageInfo];

      return this.apiClient.callApi(
        '/Packages', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getPackagesByName operation.
     * @callback module:EmbyClient.JavaScript/PackageServiceApi~getPackagesByNameCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PackageInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a package, by name or assembly guid
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/PackageServiceApi~getPackagesByNameCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PackageInfo}
     */
    getPackagesByName() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name
      };
      let queryParams = {
        'AssemblyGuid': opts['assemblyGuid']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = PackageInfo;

      return this.apiClient.callApi(
        '/Packages/{Name}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getPackagesUpdates operation.
     * @callback module:EmbyClient.JavaScript/PackageServiceApi~getPackagesUpdatesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/PackageVersionInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets available package updates for currently installed packages
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/PackageServiceApi~getPackagesUpdatesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/PackageVersionInfo>}
     */
    getPackagesUpdates() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'PackageType': packageType
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [PackageVersionInfo];

      return this.apiClient.callApi(
        '/Packages/Updates', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postPackagesInstalledByName operation.
     * @callback module:EmbyClient.JavaScript/PackageServiceApi~postPackagesInstalledByNameCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Installs a package
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/PackageServiceApi~postPackagesInstalledByNameCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postPackagesInstalledByName() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': name
      };
      let queryParams = {
        'AssemblyGuid': opts['assemblyGuid'],
        'Version': opts['version'],
        'UpdateClass': opts['updateClass']
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
        '/Packages/Installed/{Name}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postPackagesInstallingByIdDelete operation.
     * @callback module:EmbyClient.JavaScript/PackageServiceApi~postPackagesInstallingByIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels a package installation
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/PackageServiceApi~postPackagesInstallingByIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postPackagesInstallingByIdDelete() {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Packages/Installing/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
