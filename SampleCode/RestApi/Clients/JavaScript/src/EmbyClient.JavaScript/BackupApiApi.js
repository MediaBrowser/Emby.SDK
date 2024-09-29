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
import MBBackupApiAllBackupsInfo from '../model/MBBackupApiAllBackupsInfo';
import MBBackupApiDataRestoreOptions from '../model/MBBackupApiDataRestoreOptions';
import MBBackupApiRestoreOptions from '../model/MBBackupApiRestoreOptions';

/**
* BackupApi service.
* @module EmbyClient.JavaScript/BackupApiApi
* @version 4.8.10.0
*/
export default class BackupApiApi {

    /**
    * Constructs a new BackupApiApi. 
    * @alias module:EmbyClient.JavaScript/BackupApiApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getBackuprestoreBackupinfo operation.
     * @callback module:EmbyClient.JavaScript/BackupApiApi~getBackuprestoreBackupinfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/MBBackupApiAllBackupsInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/BackupApiApi~getBackuprestoreBackupinfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/MBBackupApiAllBackupsInfo}
     */
    getBackuprestoreBackupinfo() {
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
      let returnType = MBBackupApiAllBackupsInfo;

      return this.apiClient.callApi(
        '/BackupRestore/BackupInfo', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postBackuprestoreRestore operation.
     * @callback module:EmbyClient.JavaScript/BackupApiApi~postBackuprestoreRestoreCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/BackupApiApi~postBackuprestoreRestoreCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postBackuprestoreRestore() {
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
        '/BackupRestore/Restore', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postBackuprestoreRestoredata operation.
     * @callback module:EmbyClient.JavaScript/BackupApiApi~postBackuprestoreRestoredataCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/BackupApiApi~postBackuprestoreRestoredataCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postBackuprestoreRestoredata() {
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
        '/BackupRestore/RestoreData', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
