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
import MBBackupApiAllBackupsInfo from '../model/MBBackupApiAllBackupsInfo';
import MBBackupApiRestoreOptions from '../model/MBBackupApiRestoreOptions';

/**
* BackupApi service.
* @module EmbyClient.JavaScript.Beta/BackupApiApi
* @version 4.8.0.71
*/
export default class BackupApiApi {

    /**
    * Constructs a new BackupApiApi. 
    * @alias module:EmbyClient.JavaScript.Beta/BackupApiApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getBackuprestoreBackupinfo operation.
     * @callback module:EmbyClient.JavaScript.Beta/BackupApiApi~getBackuprestoreBackupinfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/MBBackupApiAllBackupsInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/BackupApiApi~getBackuprestoreBackupinfoCallback} callback The callback function, accepting three arguments: error, data, response
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
     * @callback module:EmbyClient.JavaScript.Beta/BackupApiApi~postBackuprestoreRestoreCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/BackupApiApi~postBackuprestoreRestoreCallback} callback The callback function, accepting three arguments: error, data, response
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

}
