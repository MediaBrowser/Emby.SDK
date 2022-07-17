/*
 * EmbyClient.Dotnet
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using EmbyClient.Dotnet.Client;
using EmbyClient.Dotnet.Model;

namespace EmbyClient.Dotnet.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public interface IUserServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Deletes a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns></returns>
        void DeleteUsersById (string id);

        /// <summary>
        /// Deletes a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteUsersByIdWithHttpInfo (string id);
        /// <summary>
        /// Clears audio or subtitle track selections for a user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns></returns>
        void DeleteUsersByIdTrackselectionsByTracktype (string id, string trackType);

        /// <summary>
        /// Clears audio or subtitle track selections for a user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteUsersByIdTrackselectionsByTracktypeWithHttpInfo (string id, string trackType);
        /// <summary>
        /// Gets a user by Id
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>UserDto</returns>
        UserDto GetUsersById (string id);

        /// <summary>
        /// Gets a user by Id
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>ApiResponse of UserDto</returns>
        ApiResponse<UserDto> GetUsersByIdWithHttpInfo (string id);
        /// <summary>
        /// Gets a list of users
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>List&lt;NameIdPair&gt;</returns>
        List<NameIdPair> GetUsersPrefixes (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater);

        /// <summary>
        /// Gets a list of users
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>ApiResponse of List&lt;NameIdPair&gt;</returns>
        ApiResponse<List<NameIdPair>> GetUsersPrefixesWithHttpInfo (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater);
        /// <summary>
        /// Gets a list of publicly visible users for display on a login screen.
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;UserDto&gt;</returns>
        List<UserDto> GetUsersPublic ();

        /// <summary>
        /// Gets a list of publicly visible users for display on a login screen.
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;UserDto&gt;</returns>
        ApiResponse<List<UserDto>> GetUsersPublicWithHttpInfo ();
        /// <summary>
        /// Gets a list of users
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>QueryResultUserDto</returns>
        QueryResultUserDto GetUsersQuery (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater);

        /// <summary>
        /// Gets a list of users
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>ApiResponse of QueryResultUserDto</returns>
        ApiResponse<QueryResultUserDto> GetUsersQueryWithHttpInfo (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater);
        /// <summary>
        /// Authenticates a user
        /// </summary>
        /// <remarks>
        /// Authenticate a user by nane and password. A 200 status code indicates success, while anything in the 400 or 500 range indicates failure - -- No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUserByName</param>
        /// <param name="xEmbyAuthorization">The authorization header can be either named &#x27;Authorization&#x27; or &#x27;X-Emby-Authorization&#x27;.    It must be of the following schema:     Emby UserId&#x3D;\&quot;(guid)\&quot;, Client&#x3D;\&quot;(string)\&quot;, Device&#x3D;\&quot;(string)\&quot;, DeviceId&#x3D;\&quot;(string)\&quot;, Version&#x3D;\&quot;string\&quot;, Token&#x3D;\&quot;(string)\&quot;     Please consult the documentation for further details.</param>
        /// <returns>AuthenticationAuthenticationResult</returns>
        AuthenticationAuthenticationResult PostUsersAuthenticatebyname (AuthenticateUserByName body, string xEmbyAuthorization);

        /// <summary>
        /// Authenticates a user
        /// </summary>
        /// <remarks>
        /// Authenticate a user by nane and password. A 200 status code indicates success, while anything in the 400 or 500 range indicates failure - -- No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUserByName</param>
        /// <param name="xEmbyAuthorization">The authorization header can be either named &#x27;Authorization&#x27; or &#x27;X-Emby-Authorization&#x27;.    It must be of the following schema:     Emby UserId&#x3D;\&quot;(guid)\&quot;, Client&#x3D;\&quot;(string)\&quot;, Device&#x3D;\&quot;(string)\&quot;, DeviceId&#x3D;\&quot;(string)\&quot;, Version&#x3D;\&quot;string\&quot;, Token&#x3D;\&quot;(string)\&quot;     Please consult the documentation for further details.</param>
        /// <returns>ApiResponse of AuthenticationAuthenticationResult</returns>
        ApiResponse<AuthenticationAuthenticationResult> PostUsersAuthenticatebynameWithHttpInfo (AuthenticateUserByName body, string xEmbyAuthorization);
        /// <summary>
        /// Updates a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserDto: </param>
        /// <param name="id"></param>
        /// <returns></returns>
        void PostUsersById (UserDto body, string id);

        /// <summary>
        /// Updates a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserDto: </param>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostUsersByIdWithHttpInfo (UserDto body, string id);
        /// <summary>
        /// Authenticates a user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUser</param>
        /// <param name="id"></param>
        /// <returns>AuthenticationAuthenticationResult</returns>
        AuthenticationAuthenticationResult PostUsersByIdAuthenticate (AuthenticateUser body, string id);

        /// <summary>
        /// Authenticates a user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUser</param>
        /// <param name="id"></param>
        /// <returns>ApiResponse of AuthenticationAuthenticationResult</returns>
        ApiResponse<AuthenticationAuthenticationResult> PostUsersByIdAuthenticateWithHttpInfo (AuthenticateUser body, string id);
        /// <summary>
        /// Updates a user configuration
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserConfiguration: </param>
        /// <param name="id"></param>
        /// <returns></returns>
        void PostUsersByIdConfiguration (ConfigurationUserConfiguration body, string id);

        /// <summary>
        /// Updates a user configuration
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserConfiguration: </param>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostUsersByIdConfigurationWithHttpInfo (ConfigurationUserConfiguration body, string id);
        /// <summary>
        /// Deletes a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns></returns>
        void PostUsersByIdDelete (string id);

        /// <summary>
        /// Deletes a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostUsersByIdDeleteWithHttpInfo (string id);
        /// <summary>
        /// Updates a user&#x27;s easy password
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserEasyPassword</param>
        /// <param name="id"></param>
        /// <returns></returns>
        void PostUsersByIdEasypassword (UpdateUserEasyPassword body, string id);

        /// <summary>
        /// Updates a user&#x27;s easy password
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserEasyPassword</param>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostUsersByIdEasypasswordWithHttpInfo (UpdateUserEasyPassword body, string id);
        /// <summary>
        /// Updates a user&#x27;s password
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserPassword</param>
        /// <param name="id"></param>
        /// <returns></returns>
        void PostUsersByIdPassword (UpdateUserPassword body, string id);

        /// <summary>
        /// Updates a user&#x27;s password
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserPassword</param>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostUsersByIdPasswordWithHttpInfo (UpdateUserPassword body, string id);
        /// <summary>
        /// Updates a user policy
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserPolicy: </param>
        /// <param name="id"></param>
        /// <returns></returns>
        void PostUsersByIdPolicy (UsersUserPolicy body, string id);

        /// <summary>
        /// Updates a user policy
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserPolicy: </param>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostUsersByIdPolicyWithHttpInfo (UsersUserPolicy body, string id);
        /// <summary>
        /// Clears audio or subtitle track selections for a user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns></returns>
        void PostUsersByIdTrackselectionsByTracktypeDelete (string id, string trackType);

        /// <summary>
        /// Clears audio or subtitle track selections for a user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostUsersByIdTrackselectionsByTracktypeDeleteWithHttpInfo (string id, string trackType);
        /// <summary>
        /// Initiates the forgot password process for a local user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPassword</param>
        /// <returns>UsersForgotPasswordResult</returns>
        UsersForgotPasswordResult PostUsersForgotpassword (ForgotPassword body);

        /// <summary>
        /// Initiates the forgot password process for a local user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPassword</param>
        /// <returns>ApiResponse of UsersForgotPasswordResult</returns>
        ApiResponse<UsersForgotPasswordResult> PostUsersForgotpasswordWithHttpInfo (ForgotPassword body);
        /// <summary>
        /// Redeems a forgot password pin
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPasswordPin</param>
        /// <returns>UsersPinRedeemResult</returns>
        UsersPinRedeemResult PostUsersForgotpasswordPin (ForgotPasswordPin body);

        /// <summary>
        /// Redeems a forgot password pin
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPasswordPin</param>
        /// <returns>ApiResponse of UsersPinRedeemResult</returns>
        ApiResponse<UsersPinRedeemResult> PostUsersForgotpasswordPinWithHttpInfo (ForgotPasswordPin body);
        /// <summary>
        /// Creates a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CreateUserByName</param>
        /// <returns>UserDto</returns>
        UserDto PostUsersNew (CreateUserByName body);

        /// <summary>
        /// Creates a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CreateUserByName</param>
        /// <returns>ApiResponse of UserDto</returns>
        ApiResponse<UserDto> PostUsersNewWithHttpInfo (CreateUserByName body);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Deletes a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteUsersByIdAsync (string id);

        /// <summary>
        /// Deletes a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteUsersByIdAsyncWithHttpInfo (string id);
        /// <summary>
        /// Clears audio or subtitle track selections for a user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteUsersByIdTrackselectionsByTracktypeAsync (string id, string trackType);

        /// <summary>
        /// Clears audio or subtitle track selections for a user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteUsersByIdTrackselectionsByTracktypeAsyncWithHttpInfo (string id, string trackType);
        /// <summary>
        /// Gets a user by Id
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>Task of UserDto</returns>
        System.Threading.Tasks.Task<UserDto> GetUsersByIdAsync (string id);

        /// <summary>
        /// Gets a user by Id
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse (UserDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<UserDto>> GetUsersByIdAsyncWithHttpInfo (string id);
        /// <summary>
        /// Gets a list of users
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>Task of List&lt;NameIdPair&gt;</returns>
        System.Threading.Tasks.Task<List<NameIdPair>> GetUsersPrefixesAsync (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater);

        /// <summary>
        /// Gets a list of users
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;NameIdPair&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<NameIdPair>>> GetUsersPrefixesAsyncWithHttpInfo (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater);
        /// <summary>
        /// Gets a list of publicly visible users for display on a login screen.
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;UserDto&gt;</returns>
        System.Threading.Tasks.Task<List<UserDto>> GetUsersPublicAsync ();

        /// <summary>
        /// Gets a list of publicly visible users for display on a login screen.
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;UserDto&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<UserDto>>> GetUsersPublicAsyncWithHttpInfo ();
        /// <summary>
        /// Gets a list of users
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>Task of QueryResultUserDto</returns>
        System.Threading.Tasks.Task<QueryResultUserDto> GetUsersQueryAsync (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater);

        /// <summary>
        /// Gets a list of users
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultUserDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<QueryResultUserDto>> GetUsersQueryAsyncWithHttpInfo (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater);
        /// <summary>
        /// Authenticates a user
        /// </summary>
        /// <remarks>
        /// Authenticate a user by nane and password. A 200 status code indicates success, while anything in the 400 or 500 range indicates failure - -- No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUserByName</param>
        /// <param name="xEmbyAuthorization">The authorization header can be either named &#x27;Authorization&#x27; or &#x27;X-Emby-Authorization&#x27;.    It must be of the following schema:     Emby UserId&#x3D;\&quot;(guid)\&quot;, Client&#x3D;\&quot;(string)\&quot;, Device&#x3D;\&quot;(string)\&quot;, DeviceId&#x3D;\&quot;(string)\&quot;, Version&#x3D;\&quot;string\&quot;, Token&#x3D;\&quot;(string)\&quot;     Please consult the documentation for further details.</param>
        /// <returns>Task of AuthenticationAuthenticationResult</returns>
        System.Threading.Tasks.Task<AuthenticationAuthenticationResult> PostUsersAuthenticatebynameAsync (AuthenticateUserByName body, string xEmbyAuthorization);

        /// <summary>
        /// Authenticates a user
        /// </summary>
        /// <remarks>
        /// Authenticate a user by nane and password. A 200 status code indicates success, while anything in the 400 or 500 range indicates failure - -- No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUserByName</param>
        /// <param name="xEmbyAuthorization">The authorization header can be either named &#x27;Authorization&#x27; or &#x27;X-Emby-Authorization&#x27;.    It must be of the following schema:     Emby UserId&#x3D;\&quot;(guid)\&quot;, Client&#x3D;\&quot;(string)\&quot;, Device&#x3D;\&quot;(string)\&quot;, DeviceId&#x3D;\&quot;(string)\&quot;, Version&#x3D;\&quot;string\&quot;, Token&#x3D;\&quot;(string)\&quot;     Please consult the documentation for further details.</param>
        /// <returns>Task of ApiResponse (AuthenticationAuthenticationResult)</returns>
        System.Threading.Tasks.Task<ApiResponse<AuthenticationAuthenticationResult>> PostUsersAuthenticatebynameAsyncWithHttpInfo (AuthenticateUserByName body, string xEmbyAuthorization);
        /// <summary>
        /// Updates a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserDto: </param>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostUsersByIdAsync (UserDto body, string id);

        /// <summary>
        /// Updates a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserDto: </param>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByIdAsyncWithHttpInfo (UserDto body, string id);
        /// <summary>
        /// Authenticates a user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUser</param>
        /// <param name="id"></param>
        /// <returns>Task of AuthenticationAuthenticationResult</returns>
        System.Threading.Tasks.Task<AuthenticationAuthenticationResult> PostUsersByIdAuthenticateAsync (AuthenticateUser body, string id);

        /// <summary>
        /// Authenticates a user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUser</param>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse (AuthenticationAuthenticationResult)</returns>
        System.Threading.Tasks.Task<ApiResponse<AuthenticationAuthenticationResult>> PostUsersByIdAuthenticateAsyncWithHttpInfo (AuthenticateUser body, string id);
        /// <summary>
        /// Updates a user configuration
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserConfiguration: </param>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostUsersByIdConfigurationAsync (ConfigurationUserConfiguration body, string id);

        /// <summary>
        /// Updates a user configuration
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserConfiguration: </param>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByIdConfigurationAsyncWithHttpInfo (ConfigurationUserConfiguration body, string id);
        /// <summary>
        /// Deletes a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostUsersByIdDeleteAsync (string id);

        /// <summary>
        /// Deletes a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByIdDeleteAsyncWithHttpInfo (string id);
        /// <summary>
        /// Updates a user&#x27;s easy password
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserEasyPassword</param>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostUsersByIdEasypasswordAsync (UpdateUserEasyPassword body, string id);

        /// <summary>
        /// Updates a user&#x27;s easy password
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserEasyPassword</param>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByIdEasypasswordAsyncWithHttpInfo (UpdateUserEasyPassword body, string id);
        /// <summary>
        /// Updates a user&#x27;s password
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserPassword</param>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostUsersByIdPasswordAsync (UpdateUserPassword body, string id);

        /// <summary>
        /// Updates a user&#x27;s password
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserPassword</param>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByIdPasswordAsyncWithHttpInfo (UpdateUserPassword body, string id);
        /// <summary>
        /// Updates a user policy
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserPolicy: </param>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostUsersByIdPolicyAsync (UsersUserPolicy body, string id);

        /// <summary>
        /// Updates a user policy
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserPolicy: </param>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByIdPolicyAsyncWithHttpInfo (UsersUserPolicy body, string id);
        /// <summary>
        /// Clears audio or subtitle track selections for a user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostUsersByIdTrackselectionsByTracktypeDeleteAsync (string id, string trackType);

        /// <summary>
        /// Clears audio or subtitle track selections for a user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByIdTrackselectionsByTracktypeDeleteAsyncWithHttpInfo (string id, string trackType);
        /// <summary>
        /// Initiates the forgot password process for a local user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPassword</param>
        /// <returns>Task of UsersForgotPasswordResult</returns>
        System.Threading.Tasks.Task<UsersForgotPasswordResult> PostUsersForgotpasswordAsync (ForgotPassword body);

        /// <summary>
        /// Initiates the forgot password process for a local user
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPassword</param>
        /// <returns>Task of ApiResponse (UsersForgotPasswordResult)</returns>
        System.Threading.Tasks.Task<ApiResponse<UsersForgotPasswordResult>> PostUsersForgotpasswordAsyncWithHttpInfo (ForgotPassword body);
        /// <summary>
        /// Redeems a forgot password pin
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPasswordPin</param>
        /// <returns>Task of UsersPinRedeemResult</returns>
        System.Threading.Tasks.Task<UsersPinRedeemResult> PostUsersForgotpasswordPinAsync (ForgotPasswordPin body);

        /// <summary>
        /// Redeems a forgot password pin
        /// </summary>
        /// <remarks>
        /// No authentication required
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPasswordPin</param>
        /// <returns>Task of ApiResponse (UsersPinRedeemResult)</returns>
        System.Threading.Tasks.Task<ApiResponse<UsersPinRedeemResult>> PostUsersForgotpasswordPinAsyncWithHttpInfo (ForgotPasswordPin body);
        /// <summary>
        /// Creates a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CreateUserByName</param>
        /// <returns>Task of UserDto</returns>
        System.Threading.Tasks.Task<UserDto> PostUsersNewAsync (CreateUserByName body);

        /// <summary>
        /// Creates a user
        /// </summary>
        /// <remarks>
        /// Requires authentication as administrator
        /// </remarks>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CreateUserByName</param>
        /// <returns>Task of ApiResponse (UserDto)</returns>
        System.Threading.Tasks.Task<ApiResponse<UserDto>> PostUsersNewAsyncWithHttpInfo (CreateUserByName body);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class UserServiceApi : IUserServiceApi
    {
        private EmbyClient.Dotnet.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="UserServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UserServiceApi(String basePath)
        {
            this.Configuration = new EmbyClient.Dotnet.Client.Configuration { BasePath = basePath };

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UserServiceApi"/> class
        /// </summary>
        /// <returns></returns>
        public UserServiceApi()
        {
            this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UserServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public UserServiceApi(EmbyClient.Dotnet.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = EmbyClient.Dotnet.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = EmbyClient.Dotnet.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public EmbyClient.Dotnet.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public EmbyClient.Dotnet.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// Deletes a user Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns></returns>
        public void DeleteUsersById (string id)
        {
             DeleteUsersByIdWithHttpInfo(id);
        }

        /// <summary>
        /// Deletes a user Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteUsersByIdWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->DeleteUsersById");

            var localVarPath = "/Users/{Id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteUsersById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deletes a user Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteUsersByIdAsync (string id)
        {
             await DeleteUsersByIdAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Deletes a user Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteUsersByIdAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->DeleteUsersById");

            var localVarPath = "/Users/{Id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteUsersById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Clears audio or subtitle track selections for a user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns></returns>
        public void DeleteUsersByIdTrackselectionsByTracktype (string id, string trackType)
        {
             DeleteUsersByIdTrackselectionsByTracktypeWithHttpInfo(id, trackType);
        }

        /// <summary>
        /// Clears audio or subtitle track selections for a user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteUsersByIdTrackselectionsByTracktypeWithHttpInfo (string id, string trackType)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->DeleteUsersByIdTrackselectionsByTracktype");
            // verify the required parameter 'trackType' is set
            if (trackType == null)
                throw new ApiException(400, "Missing required parameter 'trackType' when calling UserServiceApi->DeleteUsersByIdTrackselectionsByTracktype");

            var localVarPath = "/Users/{Id}/TrackSelections/{TrackType}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (trackType != null) localVarPathParams.Add("TrackType", this.Configuration.ApiClient.ParameterToString(trackType)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteUsersByIdTrackselectionsByTracktype", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Clears audio or subtitle track selections for a user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteUsersByIdTrackselectionsByTracktypeAsync (string id, string trackType)
        {
             await DeleteUsersByIdTrackselectionsByTracktypeAsyncWithHttpInfo(id, trackType);

        }

        /// <summary>
        /// Clears audio or subtitle track selections for a user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteUsersByIdTrackselectionsByTracktypeAsyncWithHttpInfo (string id, string trackType)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->DeleteUsersByIdTrackselectionsByTracktype");
            // verify the required parameter 'trackType' is set
            if (trackType == null)
                throw new ApiException(400, "Missing required parameter 'trackType' when calling UserServiceApi->DeleteUsersByIdTrackselectionsByTracktype");

            var localVarPath = "/Users/{Id}/TrackSelections/{TrackType}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (trackType != null) localVarPathParams.Add("TrackType", this.Configuration.ApiClient.ParameterToString(trackType)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteUsersByIdTrackselectionsByTracktype", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Gets a user by Id Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>UserDto</returns>
        public UserDto GetUsersById (string id)
        {
             ApiResponse<UserDto> localVarResponse = GetUsersByIdWithHttpInfo(id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets a user by Id Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>ApiResponse of UserDto</returns>
        public ApiResponse< UserDto > GetUsersByIdWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->GetUsersById");

            var localVarPath = "/Users/{Id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetUsersById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserDto)));
        }

        /// <summary>
        /// Gets a user by Id Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>Task of UserDto</returns>
        public async System.Threading.Tasks.Task<UserDto> GetUsersByIdAsync (string id)
        {
             ApiResponse<UserDto> localVarResponse = await GetUsersByIdAsyncWithHttpInfo(id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets a user by Id Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse (UserDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<UserDto>> GetUsersByIdAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->GetUsersById");

            var localVarPath = "/Users/{Id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetUsersById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserDto)));
        }

        /// <summary>
        /// Gets a list of users Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>List&lt;NameIdPair&gt;</returns>
        public List<NameIdPair> GetUsersPrefixes (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater)
        {
             ApiResponse<List<NameIdPair>> localVarResponse = GetUsersPrefixesWithHttpInfo(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets a list of users Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>ApiResponse of List&lt;NameIdPair&gt;</returns>
        public ApiResponse< List<NameIdPair> > GetUsersPrefixesWithHttpInfo (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater)
        {

            var localVarPath = "/Users/Prefixes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (isHidden != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsHidden", isHidden)); // query parameter
            if (isDisabled != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsDisabled", isDisabled)); // query parameter
            if (startIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartIndex", startIndex)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (nameStartsWithOrGreater != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NameStartsWithOrGreater", nameStartsWithOrGreater)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetUsersPrefixes", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<NameIdPair>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<NameIdPair>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<NameIdPair>)));
        }

        /// <summary>
        /// Gets a list of users Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>Task of List&lt;NameIdPair&gt;</returns>
        public async System.Threading.Tasks.Task<List<NameIdPair>> GetUsersPrefixesAsync (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater)
        {
             ApiResponse<List<NameIdPair>> localVarResponse = await GetUsersPrefixesAsyncWithHttpInfo(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets a list of users Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;NameIdPair&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<NameIdPair>>> GetUsersPrefixesAsyncWithHttpInfo (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater)
        {

            var localVarPath = "/Users/Prefixes";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (isHidden != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsHidden", isHidden)); // query parameter
            if (isDisabled != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsDisabled", isDisabled)); // query parameter
            if (startIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartIndex", startIndex)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (nameStartsWithOrGreater != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NameStartsWithOrGreater", nameStartsWithOrGreater)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetUsersPrefixes", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<NameIdPair>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<NameIdPair>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<NameIdPair>)));
        }

        /// <summary>
        /// Gets a list of publicly visible users for display on a login screen. No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;UserDto&gt;</returns>
        public List<UserDto> GetUsersPublic ()
        {
             ApiResponse<List<UserDto>> localVarResponse = GetUsersPublicWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets a list of publicly visible users for display on a login screen. No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;UserDto&gt;</returns>
        public ApiResponse< List<UserDto> > GetUsersPublicWithHttpInfo ()
        {

            var localVarPath = "/Users/Public";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetUsersPublic", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<UserDto>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<UserDto>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<UserDto>)));
        }

        /// <summary>
        /// Gets a list of publicly visible users for display on a login screen. No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;UserDto&gt;</returns>
        public async System.Threading.Tasks.Task<List<UserDto>> GetUsersPublicAsync ()
        {
             ApiResponse<List<UserDto>> localVarResponse = await GetUsersPublicAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets a list of publicly visible users for display on a login screen. No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;UserDto&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<UserDto>>> GetUsersPublicAsyncWithHttpInfo ()
        {

            var localVarPath = "/Users/Public";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetUsersPublic", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<UserDto>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<UserDto>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<UserDto>)));
        }

        /// <summary>
        /// Gets a list of users Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>QueryResultUserDto</returns>
        public QueryResultUserDto GetUsersQuery (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater)
        {
             ApiResponse<QueryResultUserDto> localVarResponse = GetUsersQueryWithHttpInfo(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Gets a list of users Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>ApiResponse of QueryResultUserDto</returns>
        public ApiResponse< QueryResultUserDto > GetUsersQueryWithHttpInfo (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater)
        {

            var localVarPath = "/Users/Query";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (isHidden != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsHidden", isHidden)); // query parameter
            if (isDisabled != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsDisabled", isDisabled)); // query parameter
            if (startIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartIndex", startIndex)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (nameStartsWithOrGreater != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NameStartsWithOrGreater", nameStartsWithOrGreater)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetUsersQuery", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultUserDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultUserDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultUserDto)));
        }

        /// <summary>
        /// Gets a list of users Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>Task of QueryResultUserDto</returns>
        public async System.Threading.Tasks.Task<QueryResultUserDto> GetUsersQueryAsync (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater)
        {
             ApiResponse<QueryResultUserDto> localVarResponse = await GetUsersQueryAsyncWithHttpInfo(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Gets a list of users Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="isHidden">Optional filter by IsHidden&#x3D;true or false (optional)</param>
        /// <param name="isDisabled">Optional filter by IsDisabled&#x3D;true or false (optional)</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)</param>
        /// <param name="limit">Optional. The maximum number of records to return (optional)</param>
        /// <param name="nameStartsWithOrGreater">Optional filter by items whose name is sorted equally or greater than a given input string. (optional)</param>
        /// <returns>Task of ApiResponse (QueryResultUserDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<QueryResultUserDto>> GetUsersQueryAsyncWithHttpInfo (bool? isHidden, bool? isDisabled, int? startIndex, int? limit, string nameStartsWithOrGreater)
        {

            var localVarPath = "/Users/Query";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (isHidden != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsHidden", isHidden)); // query parameter
            if (isDisabled != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "IsDisabled", isDisabled)); // query parameter
            if (startIndex != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "StartIndex", startIndex)); // query parameter
            if (limit != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "Limit", limit)); // query parameter
            if (nameStartsWithOrGreater != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "NameStartsWithOrGreater", nameStartsWithOrGreater)); // query parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetUsersQuery", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<QueryResultUserDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (QueryResultUserDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(QueryResultUserDto)));
        }

        /// <summary>
        /// Authenticates a user Authenticate a user by nane and password. A 200 status code indicates success, while anything in the 400 or 500 range indicates failure - -- No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUserByName</param>
        /// <param name="xEmbyAuthorization">The authorization header can be either named &#x27;Authorization&#x27; or &#x27;X-Emby-Authorization&#x27;.    It must be of the following schema:     Emby UserId&#x3D;\&quot;(guid)\&quot;, Client&#x3D;\&quot;(string)\&quot;, Device&#x3D;\&quot;(string)\&quot;, DeviceId&#x3D;\&quot;(string)\&quot;, Version&#x3D;\&quot;string\&quot;, Token&#x3D;\&quot;(string)\&quot;     Please consult the documentation for further details.</param>
        /// <returns>AuthenticationAuthenticationResult</returns>
        public AuthenticationAuthenticationResult PostUsersAuthenticatebyname (AuthenticateUserByName body, string xEmbyAuthorization)
        {
             ApiResponse<AuthenticationAuthenticationResult> localVarResponse = PostUsersAuthenticatebynameWithHttpInfo(body, xEmbyAuthorization);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Authenticates a user Authenticate a user by nane and password. A 200 status code indicates success, while anything in the 400 or 500 range indicates failure - -- No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUserByName</param>
        /// <param name="xEmbyAuthorization">The authorization header can be either named &#x27;Authorization&#x27; or &#x27;X-Emby-Authorization&#x27;.    It must be of the following schema:     Emby UserId&#x3D;\&quot;(guid)\&quot;, Client&#x3D;\&quot;(string)\&quot;, Device&#x3D;\&quot;(string)\&quot;, DeviceId&#x3D;\&quot;(string)\&quot;, Version&#x3D;\&quot;string\&quot;, Token&#x3D;\&quot;(string)\&quot;     Please consult the documentation for further details.</param>
        /// <returns>ApiResponse of AuthenticationAuthenticationResult</returns>
        public ApiResponse< AuthenticationAuthenticationResult > PostUsersAuthenticatebynameWithHttpInfo (AuthenticateUserByName body, string xEmbyAuthorization)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersAuthenticatebyname");
            // verify the required parameter 'xEmbyAuthorization' is set
            if (xEmbyAuthorization == null)
                throw new ApiException(400, "Missing required parameter 'xEmbyAuthorization' when calling UserServiceApi->PostUsersAuthenticatebyname");

            var localVarPath = "/Users/AuthenticateByName";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (xEmbyAuthorization != null) localVarHeaderParams.Add("X-Emby-Authorization", this.Configuration.ApiClient.ParameterToString(xEmbyAuthorization)); // header parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersAuthenticatebyname", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<AuthenticationAuthenticationResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (AuthenticationAuthenticationResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(AuthenticationAuthenticationResult)));
        }

        /// <summary>
        /// Authenticates a user Authenticate a user by nane and password. A 200 status code indicates success, while anything in the 400 or 500 range indicates failure - -- No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUserByName</param>
        /// <param name="xEmbyAuthorization">The authorization header can be either named &#x27;Authorization&#x27; or &#x27;X-Emby-Authorization&#x27;.    It must be of the following schema:     Emby UserId&#x3D;\&quot;(guid)\&quot;, Client&#x3D;\&quot;(string)\&quot;, Device&#x3D;\&quot;(string)\&quot;, DeviceId&#x3D;\&quot;(string)\&quot;, Version&#x3D;\&quot;string\&quot;, Token&#x3D;\&quot;(string)\&quot;     Please consult the documentation for further details.</param>
        /// <returns>Task of AuthenticationAuthenticationResult</returns>
        public async System.Threading.Tasks.Task<AuthenticationAuthenticationResult> PostUsersAuthenticatebynameAsync (AuthenticateUserByName body, string xEmbyAuthorization)
        {
             ApiResponse<AuthenticationAuthenticationResult> localVarResponse = await PostUsersAuthenticatebynameAsyncWithHttpInfo(body, xEmbyAuthorization);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Authenticates a user Authenticate a user by nane and password. A 200 status code indicates success, while anything in the 400 or 500 range indicates failure - -- No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUserByName</param>
        /// <param name="xEmbyAuthorization">The authorization header can be either named &#x27;Authorization&#x27; or &#x27;X-Emby-Authorization&#x27;.    It must be of the following schema:     Emby UserId&#x3D;\&quot;(guid)\&quot;, Client&#x3D;\&quot;(string)\&quot;, Device&#x3D;\&quot;(string)\&quot;, DeviceId&#x3D;\&quot;(string)\&quot;, Version&#x3D;\&quot;string\&quot;, Token&#x3D;\&quot;(string)\&quot;     Please consult the documentation for further details.</param>
        /// <returns>Task of ApiResponse (AuthenticationAuthenticationResult)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<AuthenticationAuthenticationResult>> PostUsersAuthenticatebynameAsyncWithHttpInfo (AuthenticateUserByName body, string xEmbyAuthorization)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersAuthenticatebyname");
            // verify the required parameter 'xEmbyAuthorization' is set
            if (xEmbyAuthorization == null)
                throw new ApiException(400, "Missing required parameter 'xEmbyAuthorization' when calling UserServiceApi->PostUsersAuthenticatebyname");

            var localVarPath = "/Users/AuthenticateByName";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (xEmbyAuthorization != null) localVarHeaderParams.Add("X-Emby-Authorization", this.Configuration.ApiClient.ParameterToString(xEmbyAuthorization)); // header parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersAuthenticatebyname", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<AuthenticationAuthenticationResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (AuthenticationAuthenticationResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(AuthenticationAuthenticationResult)));
        }

        /// <summary>
        /// Updates a user Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserDto: </param>
        /// <param name="id"></param>
        /// <returns></returns>
        public void PostUsersById (UserDto body, string id)
        {
             PostUsersByIdWithHttpInfo(body, id);
        }

        /// <summary>
        /// Updates a user Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserDto: </param>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostUsersByIdWithHttpInfo (UserDto body, string id)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersById");

            var localVarPath = "/Users/{Id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Updates a user Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserDto: </param>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostUsersByIdAsync (UserDto body, string id)
        {
             await PostUsersByIdAsyncWithHttpInfo(body, id);

        }

        /// <summary>
        /// Updates a user Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserDto: </param>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByIdAsyncWithHttpInfo (UserDto body, string id)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersById");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersById");

            var localVarPath = "/Users/{Id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersById", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Authenticates a user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUser</param>
        /// <param name="id"></param>
        /// <returns>AuthenticationAuthenticationResult</returns>
        public AuthenticationAuthenticationResult PostUsersByIdAuthenticate (AuthenticateUser body, string id)
        {
             ApiResponse<AuthenticationAuthenticationResult> localVarResponse = PostUsersByIdAuthenticateWithHttpInfo(body, id);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Authenticates a user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUser</param>
        /// <param name="id"></param>
        /// <returns>ApiResponse of AuthenticationAuthenticationResult</returns>
        public ApiResponse< AuthenticationAuthenticationResult > PostUsersByIdAuthenticateWithHttpInfo (AuthenticateUser body, string id)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersByIdAuthenticate");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersByIdAuthenticate");

            var localVarPath = "/Users/{Id}/Authenticate";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersByIdAuthenticate", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<AuthenticationAuthenticationResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (AuthenticationAuthenticationResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(AuthenticationAuthenticationResult)));
        }

        /// <summary>
        /// Authenticates a user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUser</param>
        /// <param name="id"></param>
        /// <returns>Task of AuthenticationAuthenticationResult</returns>
        public async System.Threading.Tasks.Task<AuthenticationAuthenticationResult> PostUsersByIdAuthenticateAsync (AuthenticateUser body, string id)
        {
             ApiResponse<AuthenticationAuthenticationResult> localVarResponse = await PostUsersByIdAuthenticateAsyncWithHttpInfo(body, id);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Authenticates a user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">AuthenticateUser</param>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse (AuthenticationAuthenticationResult)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<AuthenticationAuthenticationResult>> PostUsersByIdAuthenticateAsyncWithHttpInfo (AuthenticateUser body, string id)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersByIdAuthenticate");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersByIdAuthenticate");

            var localVarPath = "/Users/{Id}/Authenticate";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersByIdAuthenticate", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<AuthenticationAuthenticationResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (AuthenticationAuthenticationResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(AuthenticationAuthenticationResult)));
        }

        /// <summary>
        /// Updates a user configuration Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserConfiguration: </param>
        /// <param name="id"></param>
        /// <returns></returns>
        public void PostUsersByIdConfiguration (ConfigurationUserConfiguration body, string id)
        {
             PostUsersByIdConfigurationWithHttpInfo(body, id);
        }

        /// <summary>
        /// Updates a user configuration Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserConfiguration: </param>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostUsersByIdConfigurationWithHttpInfo (ConfigurationUserConfiguration body, string id)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersByIdConfiguration");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersByIdConfiguration");

            var localVarPath = "/Users/{Id}/Configuration";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersByIdConfiguration", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Updates a user configuration Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserConfiguration: </param>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostUsersByIdConfigurationAsync (ConfigurationUserConfiguration body, string id)
        {
             await PostUsersByIdConfigurationAsyncWithHttpInfo(body, id);

        }

        /// <summary>
        /// Updates a user configuration Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserConfiguration: </param>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByIdConfigurationAsyncWithHttpInfo (ConfigurationUserConfiguration body, string id)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersByIdConfiguration");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersByIdConfiguration");

            var localVarPath = "/Users/{Id}/Configuration";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersByIdConfiguration", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deletes a user Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns></returns>
        public void PostUsersByIdDelete (string id)
        {
             PostUsersByIdDeleteWithHttpInfo(id);
        }

        /// <summary>
        /// Deletes a user Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostUsersByIdDeleteWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersByIdDelete");

            var localVarPath = "/Users/{Id}/Delete";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Deletes a user Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostUsersByIdDeleteAsync (string id)
        {
             await PostUsersByIdDeleteAsyncWithHttpInfo(id);

        }

        /// <summary>
        /// Deletes a user Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByIdDeleteAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersByIdDelete");

            var localVarPath = "/Users/{Id}/Delete";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersByIdDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Updates a user&#x27;s easy password Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserEasyPassword</param>
        /// <param name="id"></param>
        /// <returns></returns>
        public void PostUsersByIdEasypassword (UpdateUserEasyPassword body, string id)
        {
             PostUsersByIdEasypasswordWithHttpInfo(body, id);
        }

        /// <summary>
        /// Updates a user&#x27;s easy password Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserEasyPassword</param>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostUsersByIdEasypasswordWithHttpInfo (UpdateUserEasyPassword body, string id)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersByIdEasypassword");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersByIdEasypassword");

            var localVarPath = "/Users/{Id}/EasyPassword";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersByIdEasypassword", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Updates a user&#x27;s easy password Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserEasyPassword</param>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostUsersByIdEasypasswordAsync (UpdateUserEasyPassword body, string id)
        {
             await PostUsersByIdEasypasswordAsyncWithHttpInfo(body, id);

        }

        /// <summary>
        /// Updates a user&#x27;s easy password Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserEasyPassword</param>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByIdEasypasswordAsyncWithHttpInfo (UpdateUserEasyPassword body, string id)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersByIdEasypassword");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersByIdEasypassword");

            var localVarPath = "/Users/{Id}/EasyPassword";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersByIdEasypassword", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Updates a user&#x27;s password Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserPassword</param>
        /// <param name="id"></param>
        /// <returns></returns>
        public void PostUsersByIdPassword (UpdateUserPassword body, string id)
        {
             PostUsersByIdPasswordWithHttpInfo(body, id);
        }

        /// <summary>
        /// Updates a user&#x27;s password Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserPassword</param>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostUsersByIdPasswordWithHttpInfo (UpdateUserPassword body, string id)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersByIdPassword");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersByIdPassword");

            var localVarPath = "/Users/{Id}/Password";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersByIdPassword", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Updates a user&#x27;s password Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserPassword</param>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostUsersByIdPasswordAsync (UpdateUserPassword body, string id)
        {
             await PostUsersByIdPasswordAsyncWithHttpInfo(body, id);

        }

        /// <summary>
        /// Updates a user&#x27;s password Requires authentication as user
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UpdateUserPassword</param>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByIdPasswordAsyncWithHttpInfo (UpdateUserPassword body, string id)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersByIdPassword");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersByIdPassword");

            var localVarPath = "/Users/{Id}/Password";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersByIdPassword", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Updates a user policy Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserPolicy: </param>
        /// <param name="id"></param>
        /// <returns></returns>
        public void PostUsersByIdPolicy (UsersUserPolicy body, string id)
        {
             PostUsersByIdPolicyWithHttpInfo(body, id);
        }

        /// <summary>
        /// Updates a user policy Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserPolicy: </param>
        /// <param name="id"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostUsersByIdPolicyWithHttpInfo (UsersUserPolicy body, string id)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersByIdPolicy");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersByIdPolicy");

            var localVarPath = "/Users/{Id}/Policy";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersByIdPolicy", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Updates a user policy Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserPolicy: </param>
        /// <param name="id"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostUsersByIdPolicyAsync (UsersUserPolicy body, string id)
        {
             await PostUsersByIdPolicyAsyncWithHttpInfo(body, id);

        }

        /// <summary>
        /// Updates a user policy Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">UserPolicy: </param>
        /// <param name="id"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByIdPolicyAsyncWithHttpInfo (UsersUserPolicy body, string id)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersByIdPolicy");
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersByIdPolicy");

            var localVarPath = "/Users/{Id}/Policy";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersByIdPolicy", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Clears audio or subtitle track selections for a user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns></returns>
        public void PostUsersByIdTrackselectionsByTracktypeDelete (string id, string trackType)
        {
             PostUsersByIdTrackselectionsByTracktypeDeleteWithHttpInfo(id, trackType);
        }

        /// <summary>
        /// Clears audio or subtitle track selections for a user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> PostUsersByIdTrackselectionsByTracktypeDeleteWithHttpInfo (string id, string trackType)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersByIdTrackselectionsByTracktypeDelete");
            // verify the required parameter 'trackType' is set
            if (trackType == null)
                throw new ApiException(400, "Missing required parameter 'trackType' when calling UserServiceApi->PostUsersByIdTrackselectionsByTracktypeDelete");

            var localVarPath = "/Users/{Id}/TrackSelections/{TrackType}/Delete";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (trackType != null) localVarPathParams.Add("TrackType", this.Configuration.ApiClient.ParameterToString(trackType)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersByIdTrackselectionsByTracktypeDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Clears audio or subtitle track selections for a user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostUsersByIdTrackselectionsByTracktypeDeleteAsync (string id, string trackType)
        {
             await PostUsersByIdTrackselectionsByTracktypeDeleteAsyncWithHttpInfo(id, trackType);

        }

        /// <summary>
        /// Clears audio or subtitle track selections for a user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="trackType"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> PostUsersByIdTrackselectionsByTracktypeDeleteAsyncWithHttpInfo (string id, string trackType)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling UserServiceApi->PostUsersByIdTrackselectionsByTracktypeDelete");
            // verify the required parameter 'trackType' is set
            if (trackType == null)
                throw new ApiException(400, "Missing required parameter 'trackType' when calling UserServiceApi->PostUsersByIdTrackselectionsByTracktypeDelete");

            var localVarPath = "/Users/{Id}/TrackSelections/{TrackType}/Delete";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("Id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (trackType != null) localVarPathParams.Add("TrackType", this.Configuration.ApiClient.ParameterToString(trackType)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersByIdTrackselectionsByTracktypeDelete", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Initiates the forgot password process for a local user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPassword</param>
        /// <returns>UsersForgotPasswordResult</returns>
        public UsersForgotPasswordResult PostUsersForgotpassword (ForgotPassword body)
        {
             ApiResponse<UsersForgotPasswordResult> localVarResponse = PostUsersForgotpasswordWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Initiates the forgot password process for a local user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPassword</param>
        /// <returns>ApiResponse of UsersForgotPasswordResult</returns>
        public ApiResponse< UsersForgotPasswordResult > PostUsersForgotpasswordWithHttpInfo (ForgotPassword body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersForgotpassword");

            var localVarPath = "/Users/ForgotPassword";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersForgotpassword", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UsersForgotPasswordResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UsersForgotPasswordResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UsersForgotPasswordResult)));
        }

        /// <summary>
        /// Initiates the forgot password process for a local user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPassword</param>
        /// <returns>Task of UsersForgotPasswordResult</returns>
        public async System.Threading.Tasks.Task<UsersForgotPasswordResult> PostUsersForgotpasswordAsync (ForgotPassword body)
        {
             ApiResponse<UsersForgotPasswordResult> localVarResponse = await PostUsersForgotpasswordAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Initiates the forgot password process for a local user No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPassword</param>
        /// <returns>Task of ApiResponse (UsersForgotPasswordResult)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<UsersForgotPasswordResult>> PostUsersForgotpasswordAsyncWithHttpInfo (ForgotPassword body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersForgotpassword");

            var localVarPath = "/Users/ForgotPassword";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersForgotpassword", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UsersForgotPasswordResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UsersForgotPasswordResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UsersForgotPasswordResult)));
        }

        /// <summary>
        /// Redeems a forgot password pin No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPasswordPin</param>
        /// <returns>UsersPinRedeemResult</returns>
        public UsersPinRedeemResult PostUsersForgotpasswordPin (ForgotPasswordPin body)
        {
             ApiResponse<UsersPinRedeemResult> localVarResponse = PostUsersForgotpasswordPinWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Redeems a forgot password pin No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPasswordPin</param>
        /// <returns>ApiResponse of UsersPinRedeemResult</returns>
        public ApiResponse< UsersPinRedeemResult > PostUsersForgotpasswordPinWithHttpInfo (ForgotPasswordPin body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersForgotpasswordPin");

            var localVarPath = "/Users/ForgotPassword/Pin";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersForgotpasswordPin", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UsersPinRedeemResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UsersPinRedeemResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UsersPinRedeemResult)));
        }

        /// <summary>
        /// Redeems a forgot password pin No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPasswordPin</param>
        /// <returns>Task of UsersPinRedeemResult</returns>
        public async System.Threading.Tasks.Task<UsersPinRedeemResult> PostUsersForgotpasswordPinAsync (ForgotPasswordPin body)
        {
             ApiResponse<UsersPinRedeemResult> localVarResponse = await PostUsersForgotpasswordPinAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Redeems a forgot password pin No authentication required
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">ForgotPasswordPin</param>
        /// <returns>Task of ApiResponse (UsersPinRedeemResult)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<UsersPinRedeemResult>> PostUsersForgotpasswordPinAsyncWithHttpInfo (ForgotPasswordPin body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersForgotpasswordPin");

            var localVarPath = "/Users/ForgotPassword/Pin";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersForgotpasswordPin", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UsersPinRedeemResult>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UsersPinRedeemResult) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UsersPinRedeemResult)));
        }

        /// <summary>
        /// Creates a user Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CreateUserByName</param>
        /// <returns>UserDto</returns>
        public UserDto PostUsersNew (CreateUserByName body)
        {
             ApiResponse<UserDto> localVarResponse = PostUsersNewWithHttpInfo(body);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Creates a user Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CreateUserByName</param>
        /// <returns>ApiResponse of UserDto</returns>
        public ApiResponse< UserDto > PostUsersNewWithHttpInfo (CreateUserByName body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersNew");

            var localVarPath = "/Users/New";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersNew", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserDto)));
        }

        /// <summary>
        /// Creates a user Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CreateUserByName</param>
        /// <returns>Task of UserDto</returns>
        public async System.Threading.Tasks.Task<UserDto> PostUsersNewAsync (CreateUserByName body)
        {
             ApiResponse<UserDto> localVarResponse = await PostUsersNewAsyncWithHttpInfo(body);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Creates a user Requires authentication as administrator
        /// </summary>
        /// <exception cref="EmbyClient.Dotnet.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">CreateUserByName</param>
        /// <returns>Task of ApiResponse (UserDto)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<UserDto>> PostUsersNewAsyncWithHttpInfo (CreateUserByName body)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling UserServiceApi->PostUsersNew");

            var localVarPath = "/Users/New";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/xml"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }
            // authentication (apikeyauth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "api_key", this.Configuration.GetApiKeyWithPrefix("api_key")));
            }
            // authentication (embyauth) required
            // bearer required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PostUsersNew", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UserDto>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (UserDto) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(UserDto)));
        }

    }
}
