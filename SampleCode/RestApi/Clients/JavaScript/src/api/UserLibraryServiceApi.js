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
import UserLibraryLeaveSharedItems from '../model/UserLibraryLeaveSharedItems';
import UserLibraryUpdateUserItemAccess from '../model/UserLibraryUpdateUserItemAccess';

/**
* UserLibraryService service.
* @module api/UserLibraryServiceApi
* @version 4.9.0.24
*/
export default class UserLibraryServiceApi {

    /**
    * Constructs a new UserLibraryServiceApi. 
    * @alias module:api/UserLibraryServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Unmarks an item as a favorite
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UserItemDataDto} and HTTP response
     */
    deleteUsersByUseridFavoriteitemsByIdWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/FavoriteItems/{Id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Unmarks an item as a favorite
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/UserItemDataDto}
     */
    deleteUsersByUseridFavoriteitemsById() {
      return this.deleteUsersByUseridFavoriteitemsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes a user&#x27;s saved personal rating for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UserItemDataDto} and HTTP response
     */
    deleteUsersByUseridItemsByIdRatingWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/Items/{Id}/Rating', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes a user&#x27;s saved personal rating for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/UserItemDataDto}
     */
    deleteUsersByUseridItemsByIdRating() {
      return this.deleteUsersByUseridItemsByIdRatingWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a live tv program
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BaseItemDto} and HTTP response
     */
    getLivetvProgramsByIdWithHttpInfo() {
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = BaseItemDto;

      return this.apiClient.callApi(
        '/LiveTv/Programs/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a live tv program
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/BaseItemDto}
     */
    getLivetvProgramsById() {
      return this.getLivetvProgramsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets an item from a user&#x27;s library
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BaseItemDto} and HTTP response
     */
    getUsersByUseridItemsByIdWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = BaseItemDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/Items/{Id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets an item from a user&#x27;s library
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/BaseItemDto}
     */
    getUsersByUseridItemsById() {
      return this.getUsersByUseridItemsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets intros to play before the main media item plays
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getUsersByUseridItemsByIdIntrosWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
        'Id': Id
      };
      let queryParams = {
        'Fields': opts['Fields'],
        'EnableImages': opts['EnableImages'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'EnableUserData': opts['EnableUserData']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets intros to play before the main media item plays
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getUsersByUseridItemsByIdIntros() {
      return this.getUsersByUseridItemsByIdIntrosWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets local trailers for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/BaseItemDto>} and HTTP response
     */
    getUsersByUseridItemsByIdLocaltrailersWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
        'Id': Id
      };
      let queryParams = {
        'Fields': opts['Fields'],
        'EnableImages': opts['EnableImages'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'EnableUserData': opts['EnableUserData']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets local trailers for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/BaseItemDto>}
     */
    getUsersByUseridItemsByIdLocaltrailers() {
      return this.getUsersByUseridItemsByIdLocaltrailersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets special features for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/BaseItemDto>} and HTTP response
     */
    getUsersByUseridItemsByIdSpecialfeaturesWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
        'Id': Id
      };
      let queryParams = {
        'Fields': opts['Fields'],
        'EnableImages': opts['EnableImages'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'EnableUserData': opts['EnableUserData']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets special features for an item
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/BaseItemDto>}
     */
    getUsersByUseridItemsByIdSpecialfeatures() {
      return this.getUsersByUseridItemsByIdSpecialfeaturesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets latest media
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/BaseItemDto>} and HTTP response
     */
    getUsersByUseridItemsLatestWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'UserId': UserId
      };
      let queryParams = {
        'Limit': opts['Limit'],
        'ParentId': opts['ParentId'],
        'Fields': opts['Fields'],
        'IncludeItemTypes': opts['IncludeItemTypes'],
        'MediaTypes': opts['MediaTypes'],
        'IsFolder': opts['IsFolder'],
        'IsPlayed': opts['IsPlayed'],
        'GroupItems': opts['GroupItems'],
        'EnableImages': opts['EnableImages'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'EnableUserData': opts['EnableUserData']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets latest media
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/BaseItemDto>}
     */
    getUsersByUseridItemsLatest() {
      return this.getUsersByUseridItemsLatestWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets the root folder from a user&#x27;s library
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BaseItemDto} and HTTP response
     */
    getUsersByUseridItemsRootWithHttpInfo() {
      let postBody = null;

      let pathParams = {
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = BaseItemDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/Items/Root', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the root folder from a user&#x27;s library
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/BaseItemDto}
     */
    getUsersByUseridItemsRoot() {
      return this.getUsersByUseridItemsRootWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets additional parts for a video.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/QueryResultBaseItemDto} and HTTP response
     */
    getVideosByIdAdditionalpartsWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'UserId': opts['UserId'],
        'Fields': opts['Fields'],
        'EnableImages': opts['EnableImages'],
        'ImageTypeLimit': opts['ImageTypeLimit'],
        'EnableImageTypes': opts['EnableImageTypes'],
        'EnableUserData': opts['EnableUserData']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets additional parts for a video.
     * Requires authentication as user
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/QueryResultBaseItemDto}
     */
    getVideosByIdAdditionalparts() {
      return this.getVideosByIdAdditionalpartsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates user item access
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsAccessWithHttpInfo() {
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
        '/Items/Access', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates user item access
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsAccess() {
      return this.postItemsAccessWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Makes an item private
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsByIdMakeprivateWithHttpInfo() {
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
        '/Items/{Id}/MakePrivate', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Makes an item private
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsByIdMakeprivate() {
      return this.postItemsByIdMakeprivateWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Makes an item public to all users
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsByIdMakepublicWithHttpInfo() {
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
        '/Items/{Id}/MakePublic', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Makes an item public to all users
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsByIdMakepublic() {
      return this.postItemsByIdMakepublicWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Leaves a shared item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsSharedLeaveWithHttpInfo() {
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
        '/Items/Shared/Leave', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Leaves a shared item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsSharedLeave() {
      return this.postItemsSharedLeaveWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Marks an item as a favorite
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UserItemDataDto} and HTTP response
     */
    postUsersByUseridFavoriteitemsByIdWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/FavoriteItems/{Id}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Marks an item as a favorite
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/UserItemDataDto}
     */
    postUsersByUseridFavoriteitemsById() {
      return this.postUsersByUseridFavoriteitemsByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Unmarks an item as a favorite
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UserItemDataDto} and HTTP response
     */
    postUsersByUseridFavoriteitemsByIdDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/FavoriteItems/{Id}/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Unmarks an item as a favorite
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/UserItemDataDto}
     */
    postUsersByUseridFavoriteitemsByIdDelete() {
      return this.postUsersByUseridFavoriteitemsByIdDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates a user&#x27;s hide from resume for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UserItemDataDto} and HTTP response
     */
    postUsersByUseridItemsByIdHidefromresumeWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
        'Id': Id
      };
      let queryParams = {
        'Hide': Hide
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates a user&#x27;s hide from resume for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/UserItemDataDto}
     */
    postUsersByUseridItemsByIdHidefromresume() {
      return this.postUsersByUseridItemsByIdHidefromresumeWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates a user&#x27;s rating for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UserItemDataDto} and HTTP response
     */
    postUsersByUseridItemsByIdRatingWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
        'Id': Id
      };
      let queryParams = {
        'Likes': Likes
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates a user&#x27;s rating for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/UserItemDataDto}
     */
    postUsersByUseridItemsByIdRating() {
      return this.postUsersByUseridItemsByIdRatingWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes a user&#x27;s saved personal rating for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UserItemDataDto} and HTTP response
     */
    postUsersByUseridItemsByIdRatingDeleteWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UserId': UserId,
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
      let accepts = ['application/json', 'application/xml'];
      let returnType = UserItemDataDto;

      return this.apiClient.callApi(
        '/Users/{UserId}/Items/{Id}/Rating/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes a user&#x27;s saved personal rating for an item
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/UserItemDataDto}
     */
    postUsersByUseridItemsByIdRatingDelete() {
      return this.postUsersByUseridItemsByIdRatingDeleteWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
