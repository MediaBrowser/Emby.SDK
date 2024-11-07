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
import PackageInfo from '../model/PackageInfo';
import PackageVersionClass from '../model/PackageVersionClass';
import PackageVersionInfo from '../model/PackageVersionInfo';

/**
* PackageService service.
* @module api/PackageServiceApi
* @version 4.9.0.31
*/
export default class PackageServiceApi {

    /**
    * Constructs a new PackageServiceApi. 
    * @alias module:api/PackageServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Cancels a package installation
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deletePackagesInstallingByIdWithHttpInfo() {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Packages/Installing/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Cancels a package installation
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deletePackagesInstallingById() {
      return this.deletePackagesInstallingByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets available packages
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/PackageInfo>} and HTTP response
     */
    getPackagesWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'PackageType': opts['PackageType'],
        'TargetSystems': opts['TargetSystems'],
        'IsPremium': opts['IsPremium'],
        'IsAdult': opts['IsAdult']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets available packages
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/PackageInfo>}
     */
    getPackages() {
      return this.getPackagesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a package, by name or assembly guid
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PackageInfo} and HTTP response
     */
    getPackagesByNameWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name
      };
      let queryParams = {
        'AssemblyGuid': opts['AssemblyGuid']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a package, by name or assembly guid
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/PackageInfo}
     */
    getPackagesByName() {
      return this.getPackagesByNameWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets available package updates for currently installed packages
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/PackageVersionInfo>} and HTTP response
     */
    getPackagesUpdatesWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'PackageType': PackageType
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets available package updates for currently installed packages
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/PackageVersionInfo>}
     */
    getPackagesUpdates() {
      return this.getPackagesUpdatesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Installs a package
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postPackagesInstalledByNameWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Name': Name
      };
      let queryParams = {
        'AssemblyGuid': opts['AssemblyGuid'],
        'Version': opts['Version'],
        'UpdateClass': opts['UpdateClass']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Installs a package
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postPackagesInstalledByName() {
      return this.postPackagesInstalledByNameWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Cancels a package installation
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postPackagesInstallingByIdDeleteWithHttpInfo() {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Packages/Installing/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Cancels a package installation
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postPackagesInstallingByIdDelete() {
      return this.postPackagesInstallingByIdDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
