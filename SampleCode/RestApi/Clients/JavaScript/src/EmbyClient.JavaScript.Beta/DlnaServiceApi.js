/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.6
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from "../ApiClient";
import EmbyDlnaProfilesDlnaProfile from '../model/EmbyDlnaProfilesDlnaProfile';

/**
* DlnaService service.
* @module EmbyClient.JavaScript.Beta/DlnaServiceApi
* @version 4.8.0.6
*/
export default class DlnaServiceApi {

    /**
    * Constructs a new DlnaServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/DlnaServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteDlnaProfilesById operation.
     * @callback module:EmbyClient.JavaScript.Beta/DlnaServiceApi~deleteDlnaProfilesByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a profile
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DlnaServiceApi~deleteDlnaProfilesByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteDlnaProfilesById() {
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
        '/Dlna/Profiles/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getDlnaProfileinfos operation.
     * @callback module:EmbyClient.JavaScript.Beta/DlnaServiceApi~getDlnaProfileinfosCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/EmbyDlnaProfilesDlnaProfile>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of profiles
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DlnaServiceApi~getDlnaProfileinfosCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/EmbyDlnaProfilesDlnaProfile>}
     */
    getDlnaProfileinfos() {
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
      let returnType = [EmbyDlnaProfilesDlnaProfile];

      return this.apiClient.callApi(
        '/Dlna/ProfileInfos', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getDlnaProfilesById operation.
     * @callback module:EmbyClient.JavaScript.Beta/DlnaServiceApi~getDlnaProfilesByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/EmbyDlnaProfilesDlnaProfile} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a single profile
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DlnaServiceApi~getDlnaProfilesByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/EmbyDlnaProfilesDlnaProfile}
     */
    getDlnaProfilesById() {
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
      let returnType = EmbyDlnaProfilesDlnaProfile;

      return this.apiClient.callApi(
        '/Dlna/Profiles/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getDlnaProfilesDefault operation.
     * @callback module:EmbyClient.JavaScript.Beta/DlnaServiceApi~getDlnaProfilesDefaultCallback
     * @param {String} error Error message, if any.
     * @param {module:model/EmbyDlnaProfilesDlnaProfile} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the default profile
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DlnaServiceApi~getDlnaProfilesDefaultCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/EmbyDlnaProfilesDlnaProfile}
     */
    getDlnaProfilesDefault() {
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
      let returnType = EmbyDlnaProfilesDlnaProfile;

      return this.apiClient.callApi(
        '/Dlna/Profiles/Default', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postDlnaProfiles operation.
     * @callback module:EmbyClient.JavaScript.Beta/DlnaServiceApi~postDlnaProfilesCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates a profile
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DlnaServiceApi~postDlnaProfilesCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postDlnaProfiles() {
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
        '/Dlna/Profiles', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postDlnaProfilesById operation.
     * @callback module:EmbyClient.JavaScript.Beta/DlnaServiceApi~postDlnaProfilesByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a profile
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DlnaServiceApi~postDlnaProfilesByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postDlnaProfilesById() {
      let postBody = body;

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
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/Profiles/{Id}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}