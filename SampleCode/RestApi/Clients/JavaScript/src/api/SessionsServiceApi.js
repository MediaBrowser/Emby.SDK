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
import ClientCapabilities from '../model/ClientCapabilities';
import GeneralCommand from '../model/GeneralCommand';
import NameIdPair from '../model/NameIdPair';
import PlayCommand from '../model/PlayCommand';
import PlayRequest from '../model/PlayRequest';
import PlaystateCommand from '../model/PlaystateCommand';
import PlaystateRequest from '../model/PlaystateRequest';
import QueryResultBaseItemDto from '../model/QueryResultBaseItemDto';
import SessionSessionInfo from '../model/SessionSessionInfo';

/**
* SessionsService service.
* @module api/SessionsServiceApi
* @version 4.9.0.24
*/
export default class SessionsServiceApi {

    /**
    * Constructs a new SessionsServiceApi. 
    * @alias module:api/SessionsServiceApi
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
    deleteAuthKeysByKeyWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Key': Key
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
        '/Auth/Keys/{Key}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteAuthKeysByKey() {
      return this.deleteAuthKeysByKeyWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Removes an additional user from a session
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteSessionsByIdUsersByUseridWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'UserId': UserId
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
        '/Sessions/{Id}/Users/{UserId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Removes an additional user from a session
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteSessionsByIdUsersByUserid() {
      return this.deleteSessionsByIdUsersByUseridWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getAuthKeysWithHttpInfo() {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Auth/Keys', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getAuthKeys() {
      return this.getAuthKeysWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/NameIdPair>} and HTTP response
     */
    getAuthProvidersWithHttpInfo() {
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
      let returnType = [NameIdPair];

      return this.apiClient.callApi(
        '/Auth/Providers', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/NameIdPair>}
     */
    getAuthProviders() {
      return this.getAuthProvidersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a list of sessions
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/SessionSessionInfo>} and HTTP response
     */
    getSessionsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ControllableByUserId': opts['ControllableByUserId'],
        'DeviceId': opts['DeviceId'],
        'Id': opts['Id']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [SessionSessionInfo];

      return this.apiClient.callApi(
        '/Sessions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a list of sessions
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/SessionSessionInfo>}
     */
    getSessions() {
      return this.getSessionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a the current play queue from a session
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getSessionsPlayqueueWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': opts['Id'],
        'DeviceId': opts['DeviceId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultBaseItemDto;

      return this.apiClient.callApi(
        '/Sessions/PlayQueue', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a the current play queue from a session
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getSessionsPlayqueue() {
      return this.getSessionsPlayqueueWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postAuthKeysWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'App': App
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
        '/Auth/Keys', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postAuthKeys() {
      return this.postAuthKeysWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postAuthKeysByKeyDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Key': Key
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
        '/Auth/Keys/{Key}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postAuthKeysByKeyDelete() {
      return this.postAuthKeysByKeyDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Issues a system command to a client
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsByIdCommandWithHttpInfo() {
      let postBody = body;

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
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Sessions/{Id}/Command', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Issues a system command to a client
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsByIdCommand() {
      return this.postSessionsByIdCommandWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Issues a system command to a client
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsByIdCommandByCommandWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Command': Command
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
        '/Sessions/{Id}/Command/{Command}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Issues a system command to a client
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsByIdCommandByCommand() {
      return this.postSessionsByIdCommandByCommandWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Issues a command to a client to display a message to the user
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsByIdMessageWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'Text': Text,
        'Header': Header,
        'TimeoutMs': opts['TimeoutMs']
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
        '/Sessions/{Id}/Message', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Issues a command to a client to display a message to the user
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsByIdMessage() {
      return this.postSessionsByIdMessageWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Instructs a session to play an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsByIdPlayingWithHttpInfo() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'ItemIds': this.apiClient.buildCollectionParam(ItemIds, 'multi'),
        'StartPositionTicks': opts['StartPositionTicks'],
        'PlayCommand': PlayCommand
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
        '/Sessions/{Id}/Playing', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Instructs a session to play an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsByIdPlaying() {
      return this.postSessionsByIdPlayingWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Issues a playstate command to a client
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsByIdPlayingByCommandWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'Id': Id,
        'Command': Command
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
        '/Sessions/{Id}/Playing/{Command}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Issues a playstate command to a client
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsByIdPlayingByCommand() {
      return this.postSessionsByIdPlayingByCommandWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Issues a system command to a client
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsByIdSystemByCommandWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'Command': Command
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
        '/Sessions/{Id}/System/{Command}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Issues a system command to a client
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsByIdSystemByCommand() {
      return this.postSessionsByIdSystemByCommandWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Adds an additional user to a session
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsByIdUsersByUseridWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'UserId': UserId
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
        '/Sessions/{Id}/Users/{UserId}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Adds an additional user to a session
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsByIdUsersByUserid() {
      return this.postSessionsByIdUsersByUseridWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Removes an additional user from a session
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsByIdUsersByUseridDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id,
        'UserId': UserId
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
        '/Sessions/{Id}/Users/{UserId}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Removes an additional user from a session
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsByIdUsersByUseridDelete() {
      return this.postSessionsByIdUsersByUseridDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Instructs a session to browse to an item or view
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsByIdViewingWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'ItemType': ItemType,
        'ItemId': ItemId,
        'ItemName': ItemName
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
        '/Sessions/{Id}/Viewing', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Instructs a session to browse to an item or view
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsByIdViewing() {
      return this.postSessionsByIdViewingWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates capabilities for a device
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsCapabilitiesWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': Id,
        'PlayableMediaTypes': opts['PlayableMediaTypes'],
        'SupportedCommands': opts['SupportedCommands'],
        'SupportsMediaControl': opts['SupportsMediaControl'],
        'SupportsSync': opts['SupportsSync']
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
        '/Sessions/Capabilities', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates capabilities for a device
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsCapabilities() {
      return this.postSessionsCapabilitiesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates capabilities for a device
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsCapabilitiesFullWithHttpInfo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'Id': Id
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
        '/Sessions/Capabilities/Full', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates capabilities for a device
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsCapabilitiesFull() {
      return this.postSessionsCapabilitiesFullWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Reports that a session has ended
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postSessionsLogoutWithHttpInfo() {
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
        '/Sessions/Logout', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Reports that a session has ended
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postSessionsLogout() {
      return this.postSessionsLogoutWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
