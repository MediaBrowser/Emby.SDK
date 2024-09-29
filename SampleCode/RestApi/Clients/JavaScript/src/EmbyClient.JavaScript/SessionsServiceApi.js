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
* @module EmbyClient.JavaScript/SessionsServiceApi
* @version 4.8.10.0
*/
export default class SessionsServiceApi {

    /**
    * Constructs a new SessionsServiceApi. 
    * @alias module:EmbyClient.JavaScript/SessionsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteAuthKeysByKey operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~deleteAuthKeysByKeyCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~deleteAuthKeysByKeyCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteAuthKeysByKey() {
      let postBody = null;

      let pathParams = {
        'Key': key
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteSessionsByIdUsersByUserid operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~deleteSessionsByIdUsersByUseridCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Removes an additional user from a session
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~deleteSessionsByIdUsersByUseridCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteSessionsByIdUsersByUserid() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'UserId': userId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getAuthKeys operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~getAuthKeysCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~getAuthKeysCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getAuthKeys() {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Auth/Keys', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getAuthProviders operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~getAuthProvidersCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/NameIdPair>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~getAuthProvidersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/NameIdPair>}
     */
    getAuthProviders() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSessions operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~getSessionsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SessionSessionInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of sessions
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~getSessionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SessionSessionInfo>}
     */
    getSessions() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ControllableByUserId': opts['controllableByUserId'],
        'DeviceId': opts['deviceId'],
        'Id': opts['id']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getSessionsPlayqueue operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~getSessionsPlayqueueCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a the current play queue from a session
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~getSessionsPlayqueueCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getSessionsPlayqueue() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': opts['id'],
        'DeviceId': opts['deviceId']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postAuthKeys operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~postAuthKeysCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~postAuthKeysCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postAuthKeys() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'App': app
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postAuthKeysByKeyDelete operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~postAuthKeysByKeyDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~postAuthKeysByKeyDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postAuthKeysByKeyDelete() {
      let postBody = null;

      let pathParams = {
        'Key': key
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsByIdCommand operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdCommandCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Issues a system command to a client
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdCommandCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsByIdCommand() {
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
        '/Sessions/{Id}/Command', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsByIdCommandByCommand operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdCommandByCommandCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Issues a system command to a client
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdCommandByCommandCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsByIdCommandByCommand() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Command': command
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsByIdMessage operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdMessageCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Issues a command to a client to display a message to the user
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdMessageCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsByIdMessage() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'Text': text,
        'Header': header,
        'TimeoutMs': opts['timeoutMs']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsByIdPlaying operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdPlayingCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Instructs a session to play an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdPlayingCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsByIdPlaying() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'ItemIds': this.apiClient.buildCollectionParam(itemIds, 'multi'),
        'StartPositionTicks': opts['startPositionTicks'],
        'PlayCommand': playCommand
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsByIdPlayingByCommand operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdPlayingByCommandCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Issues a playstate command to a client
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdPlayingByCommandCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsByIdPlayingByCommand() {
      let postBody = body;

      let pathParams = {
        'Id': id,
        'Command': command
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsByIdSystemByCommand operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdSystemByCommandCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Issues a system command to a client
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdSystemByCommandCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsByIdSystemByCommand() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'Command': command
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsByIdUsersByUserid operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdUsersByUseridCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Adds an additional user to a session
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdUsersByUseridCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsByIdUsersByUserid() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'UserId': userId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsByIdUsersByUseridDelete operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdUsersByUseridDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Removes an additional user from a session
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdUsersByUseridDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsByIdUsersByUseridDelete() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'UserId': userId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsByIdViewing operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdViewingCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Instructs a session to browse to an item or view
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsByIdViewingCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsByIdViewing() {
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'ItemType': itemType,
        'ItemId': itemId,
        'ItemName': itemName
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsCapabilities operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsCapabilitiesCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates capabilities for a device
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsCapabilitiesCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsCapabilities() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': id,
        'PlayableMediaTypes': opts['playableMediaTypes'],
        'SupportedCommands': opts['supportedCommands'],
        'SupportsMediaControl': opts['supportsMediaControl'],
        'SupportsSync': opts['supportsSync']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsCapabilitiesFull operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsCapabilitiesFullCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates capabilities for a device
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsCapabilitiesFullCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsCapabilitiesFull() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'Id': id
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postSessionsLogout operation.
     * @callback module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsLogoutCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Reports that a session has ended
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/SessionsServiceApi~postSessionsLogoutCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postSessionsLogout() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
