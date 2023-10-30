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
import BaseItemDto from '../model/BaseItemDto';
import QueryResultBaseItemDto from '../model/QueryResultBaseItemDto';
import UserItemDataDto from '../model/UserItemDataDto';

/**
* UserLibraryService service.
* @module EmbyClient.JavaScript.Beta/UserLibraryServiceApi
* @version 4.8.0.57
*/
export default class UserLibraryServiceApi {

    /**
    * Constructs a new UserLibraryServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteUsersByUseridFavoriteitemsById operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~deleteUsersByUseridFavoriteitemsByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserItemDataDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Unmarks an item as a favorite
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~deleteUsersByUseridFavoriteitemsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserItemDataDto}
     */
    deleteUsersByUseridFavoriteitemsById() {
      let postBody = null;

      let pathParams = {
        'UserId': userId,
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
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/FavoriteItems/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deleteUsersByUseridItemsByIdRating operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~deleteUsersByUseridItemsByIdRatingCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserItemDataDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a user&#x27;s saved personal rating for an item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~deleteUsersByUseridItemsByIdRatingCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserItemDataDto}
     */
    deleteUsersByUseridItemsByIdRating() {
      let postBody = null;

      let pathParams = {
        'UserId': userId,
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
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/Items/{Id}/Rating', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLivetvProgramsById operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getLivetvProgramsByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a live tv program
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getLivetvProgramsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/BaseItemDto}
     */
    getLivetvProgramsById() {
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
      let returnType = BaseItemDto;

      return this.apiClient.callApi(
        '/LiveTv/Programs/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUsersByUseridItemsById operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getUsersByUseridItemsByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets an item from a user&#x27;s library
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getUsersByUseridItemsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/BaseItemDto}
     */
    getUsersByUseridItemsById() {
      let postBody = null;

      let pathParams = {
        'UserId': userId,
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
      let returnType = BaseItemDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/Items/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUsersByUseridItemsByIdIntros operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getUsersByUseridItemsByIdIntrosCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets intros to play before the main media item plays
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getUsersByUseridItemsByIdIntrosCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getUsersByUseridItemsByIdIntros() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': userId,
        'Id': id
      };
      let queryParams = {
        'Fields': opts['fields'],
        'EnableImages': opts['enableImages'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'EnableUserData': opts['enableUserData']
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
        '/Users/{UserId}/Items/{Id}/Intros', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUsersByUseridItemsByIdLocaltrailers operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getUsersByUseridItemsByIdLocaltrailersCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/BaseItemDto>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets local trailers for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getUsersByUseridItemsByIdLocaltrailersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/BaseItemDto>}
     */
    getUsersByUseridItemsByIdLocaltrailers() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': userId,
        'Id': id
      };
      let queryParams = {
        'Fields': opts['fields'],
        'EnableImages': opts['enableImages'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'EnableUserData': opts['enableUserData']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [BaseItemDto];

      return this.apiClient.callApi(
        '/Users/{UserId}/Items/{Id}/LocalTrailers', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUsersByUseridItemsByIdSpecialfeatures operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getUsersByUseridItemsByIdSpecialfeaturesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/BaseItemDto>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets special features for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getUsersByUseridItemsByIdSpecialfeaturesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/BaseItemDto>}
     */
    getUsersByUseridItemsByIdSpecialfeatures() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': userId,
        'Id': id
      };
      let queryParams = {
        'Fields': opts['fields'],
        'EnableImages': opts['enableImages'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'EnableUserData': opts['enableUserData']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [BaseItemDto];

      return this.apiClient.callApi(
        '/Users/{UserId}/Items/{Id}/SpecialFeatures', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUsersByUseridItemsLatest operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getUsersByUseridItemsLatestCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/BaseItemDto>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets latest media
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getUsersByUseridItemsLatestCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/BaseItemDto>}
     */
    getUsersByUseridItemsLatest() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': userId
      };
      let queryParams = {
        'Limit': opts['limit'],
        'ParentId': opts['parentId'],
        'Fields': opts['fields'],
        'IncludeItemTypes': opts['includeItemTypes'],
        'MediaTypes': opts['mediaTypes'],
        'IsFolder': opts['isFolder'],
        'IsPlayed': opts['isPlayed'],
        'GroupItems': opts['groupItems'],
        'EnableImages': opts['enableImages'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'EnableUserData': opts['enableUserData']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [BaseItemDto];

      return this.apiClient.callApi(
        '/Users/{UserId}/Items/Latest', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getUsersByUseridItemsRoot operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getUsersByUseridItemsRootCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the root folder from a user&#x27;s library
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getUsersByUseridItemsRootCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/BaseItemDto}
     */
    getUsersByUseridItemsRoot() {
      let postBody = null;

      let pathParams = {
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = BaseItemDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/Items/Root', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getVideosByIdAdditionalparts operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getVideosByIdAdditionalpartsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultBaseItemDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets additional parts for a video.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~getVideosByIdAdditionalpartsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultBaseItemDto}
     */
    getVideosByIdAdditionalparts() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'UserId': opts['userId'],
        'Fields': opts['fields'],
        'EnableImages': opts['enableImages'],
        'ImageTypeLimit': opts['imageTypeLimit'],
        'EnableImageTypes': opts['enableImageTypes'],
        'EnableUserData': opts['enableUserData']
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
        '/Videos/{Id}/AdditionalParts', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsByIdMakeprivate operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~postItemsByIdMakeprivateCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Makes an item private
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~postItemsByIdMakeprivateCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsByIdMakeprivate() {
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
        '/Items/{Id}/MakePrivate', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsByIdMakepublic operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~postItemsByIdMakepublicCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Makes an item public to all users
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~postItemsByIdMakepublicCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsByIdMakepublic() {
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
        '/Items/{Id}/MakePublic', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByUseridFavoriteitemsById operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~postUsersByUseridFavoriteitemsByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserItemDataDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Marks an item as a favorite
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~postUsersByUseridFavoriteitemsByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserItemDataDto}
     */
    postUsersByUseridFavoriteitemsById() {
      let postBody = null;

      let pathParams = {
        'UserId': userId,
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
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/FavoriteItems/{Id}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByUseridFavoriteitemsByIdDelete operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~postUsersByUseridFavoriteitemsByIdDeleteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserItemDataDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Unmarks an item as a favorite
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~postUsersByUseridFavoriteitemsByIdDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserItemDataDto}
     */
    postUsersByUseridFavoriteitemsByIdDelete() {
      let postBody = null;

      let pathParams = {
        'UserId': userId,
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
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/FavoriteItems/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByUseridItemsByIdHidefromresume operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~postUsersByUseridItemsByIdHidefromresumeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserItemDataDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a user&#x27;s hide from resume for an item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~postUsersByUseridItemsByIdHidefromresumeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserItemDataDto}
     */
    postUsersByUseridItemsByIdHidefromresume() {
      let postBody = null;

      let pathParams = {
        'UserId': userId,
        'Id': id
      };
      let queryParams = {
        'Hide': hide
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/Items/{Id}/HideFromResume', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByUseridItemsByIdRating operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~postUsersByUseridItemsByIdRatingCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserItemDataDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a user&#x27;s rating for an item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~postUsersByUseridItemsByIdRatingCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserItemDataDto}
     */
    postUsersByUseridItemsByIdRating() {
      let postBody = null;

      let pathParams = {
        'UserId': userId,
        'Id': id
      };
      let queryParams = {
        'Likes': likes
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/Items/{Id}/Rating', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postUsersByUseridItemsByIdRatingDelete operation.
     * @callback module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~postUsersByUseridItemsByIdRatingDeleteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserItemDataDto} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a user&#x27;s saved personal rating for an item
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/UserLibraryServiceApi~postUsersByUseridItemsByIdRatingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/UserItemDataDto}
     */
    postUsersByUseridItemsByIdRatingDelete() {
      let postBody = null;

      let pathParams = {
        'UserId': userId,
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
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/Items/{Id}/Rating/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
