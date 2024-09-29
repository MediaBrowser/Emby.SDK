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
import AuthenticateUser from '../model/AuthenticateUser';
import AuthenticateUserByName from '../model/AuthenticateUserByName';
import AuthenticationAuthenticationResult from '../model/AuthenticationAuthenticationResult';
import CreateUserByName from '../model/CreateUserByName';
import ForgotPassword from '../model/ForgotPassword';
import ForgotPasswordPin from '../model/ForgotPasswordPin';
import ForgotPasswordResult from '../model/ForgotPasswordResult';
import NameIdPair from '../model/NameIdPair';
import PinRedeemResult from '../model/PinRedeemResult';
import QueryResultUserDto from '../model/QueryResultUserDto';
import UpdateUserPassword from '../model/UpdateUserPassword';
import UserConfiguration from '../model/UserConfiguration';
import UserDto from '../model/UserDto';
import UserPolicy from '../model/UserPolicy';

/**
* UserService service.
* @module EmbyClient.JavaScript/UserServiceApi
* @version 4.8.10.0
*/
export default class UserServiceApi {

    /**
    * Constructs a new UserServiceApi. 
    * @alias module:EmbyClient.JavaScript/UserServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteUsersById operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~deleteUsersByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a user
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/UserServiceApi~deleteUsersByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteUsersById() {
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
        '/Users/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteUsersByIdTrackselectionsByTracktype operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~deleteUsersByIdTrackselectionsByTracktypeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Clears audio or subtitle track selections for a user
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserServiceApi~deleteUsersByIdTrackselectionsByTracktypeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteUsersByIdTrackselectionsByTracktype() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'TrackType': trackType
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
        '/Users/{Id}/TrackSelections/{TrackType}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUsersById operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~getUsersByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a user by Id
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserServiceApi~getUsersByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserDto}
     */
    getUsersById() {
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
      let returnType = UserDto;

      return this.apiClient.callApi(
        '/Users/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUsersByUseridTypedsettingsByKey operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~getUsersByUseridTypedsettingsByKeyCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a typed user setting
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserServiceApi~getUsersByUseridTypedsettingsByKeyCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getUsersByUseridTypedsettingsByKey() {
      let postBody = null;

      let pathParams = {
        'Key': key,
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
        '/Users/{UserId}/TypedSettings/{Key}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUsersItemaccess operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~getUsersItemaccessCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultUserDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of users
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/UserServiceApi~getUsersItemaccessCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultUserDto}
     */
    getUsersItemaccess() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'IsHidden': opts['isHidden'],
        'IsDisabled': opts['isDisabled'],
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit'],
        'NameStartsWithOrGreater': opts['nameStartsWithOrGreater'],
        'SortOrder': opts['sortOrder']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultUserDto;

      return this.apiClient.callApi(
        '/Users/ItemAccess', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUsersPrefixes operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~getUsersPrefixesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/NameIdPair>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of users
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/UserServiceApi~getUsersPrefixesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/NameIdPair>}
     */
    getUsersPrefixes() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'IsHidden': opts['isHidden'],
        'IsDisabled': opts['isDisabled'],
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit'],
        'NameStartsWithOrGreater': opts['nameStartsWithOrGreater'],
        'SortOrder': opts['sortOrder']
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
        '/Users/Prefixes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUsersPublic operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~getUsersPublicCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/UserDto>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of publicly visible users for display on a login screen.
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserServiceApi~getUsersPublicCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/UserDto>}
     */
    getUsersPublic() {
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
      let returnType = [UserDto];

      return this.apiClient.callApi(
        '/Users/Public', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUsersQuery operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~getUsersQueryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultUserDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of users
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/UserServiceApi~getUsersQueryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultUserDto}
     */
    getUsersQuery() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'IsHidden': opts['isHidden'],
        'IsDisabled': opts['isDisabled'],
        'StartIndex': opts['startIndex'],
        'Limit': opts['limit'],
        'NameStartsWithOrGreater': opts['nameStartsWithOrGreater'],
        'SortOrder': opts['sortOrder']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultUserDto;

      return this.apiClient.callApi(
        '/Users/Query', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersAuthenticatebyname operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~postUsersAuthenticatebynameCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AuthenticationAuthenticationResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Authenticates a user
     * Authenticate a user by nane and password. A 200 status code indicates success, while anything in the 400 or 500 range indicates failure --- Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserServiceApi~postUsersAuthenticatebynameCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AuthenticationAuthenticationResult}
     */
    postUsersAuthenticatebyname() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
        'X-Emby-Authorization': xEmbyAuthorization
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = AuthenticationAuthenticationResult;

      return this.apiClient.callApi(
        '/Users/AuthenticateByName', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersById operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a user
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersById() {
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
        '/Users/{Id}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByIdAuthenticate operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdAuthenticateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AuthenticationAuthenticationResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Authenticates a user
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdAuthenticateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AuthenticationAuthenticationResult}
     */
    postUsersByIdAuthenticate() {
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = AuthenticationAuthenticationResult;

      return this.apiClient.callApi(
        '/Users/{Id}/Authenticate', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByIdConfiguration operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdConfigurationCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a user configuration
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdConfigurationCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByIdConfiguration() {
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
        '/Users/{Id}/Configuration', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByIdConfigurationPartial operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdConfigurationPartialCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a user configuration
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdConfigurationPartialCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByIdConfigurationPartial() {
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
      let contentTypes = ['application/octet-stream'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Users/{Id}/Configuration/Partial', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByIdDelete operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a user
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByIdDelete() {
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
        '/Users/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByIdPassword operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdPasswordCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a user&#x27;s password
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdPasswordCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByIdPassword() {
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
        '/Users/{Id}/Password', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByIdPolicy operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdPolicyCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a user policy
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdPolicyCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByIdPolicy() {
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
        '/Users/{Id}/Policy', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByIdTrackselectionsByTracktypeDelete operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdTrackselectionsByTracktypeDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Clears audio or subtitle track selections for a user
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserServiceApi~postUsersByIdTrackselectionsByTracktypeDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByIdTrackselectionsByTracktypeDelete() {
      let postBody = null;

      let pathParams = {
        'Id': id,
        'TrackType': trackType
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
        '/Users/{Id}/TrackSelections/{TrackType}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByUseridTypedsettingsByKey operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~postUsersByUseridTypedsettingsByKeyCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a typed user setting
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserServiceApi~postUsersByUseridTypedsettingsByKeyCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postUsersByUseridTypedsettingsByKey() {
      let postBody = body;

      let pathParams = {
        'UserId': userId,
        'Key': key
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/octet-stream'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Users/{UserId}/TypedSettings/{Key}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersForgotpassword operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~postUsersForgotpasswordCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ForgotPasswordResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Initiates the forgot password process for a local user
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserServiceApi~postUsersForgotpasswordCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ForgotPasswordResult}
     */
    postUsersForgotpassword() {
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = ForgotPasswordResult;

      return this.apiClient.callApi(
        '/Users/ForgotPassword', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersForgotpasswordPin operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~postUsersForgotpasswordPinCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PinRedeemResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Redeems a forgot password pin
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/UserServiceApi~postUsersForgotpasswordPinCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PinRedeemResult}
     */
    postUsersForgotpasswordPin() {
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = PinRedeemResult;

      return this.apiClient.callApi(
        '/Users/ForgotPassword/Pin', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersNew operation.
     * @callback module:EmbyClient.JavaScript/UserServiceApi~postUsersNewCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates a user
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/UserServiceApi~postUsersNewCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserDto}
     */
    postUsersNew() {
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = UserDto;

      return this.apiClient.callApi(
        '/Users/New', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
