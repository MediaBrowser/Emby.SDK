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
import ExternalIdInfo from '../model/ExternalIdInfo';
import RemoteSearchQueryAlbumInfo from '../model/RemoteSearchQueryAlbumInfo';
import RemoteSearchQueryArtistInfo from '../model/RemoteSearchQueryArtistInfo';
import RemoteSearchQueryBookInfo from '../model/RemoteSearchQueryBookInfo';
import RemoteSearchQueryGameInfo from '../model/RemoteSearchQueryGameInfo';
import RemoteSearchQueryItemLookupInfo from '../model/RemoteSearchQueryItemLookupInfo';
import RemoteSearchQueryMovieInfo from '../model/RemoteSearchQueryMovieInfo';
import RemoteSearchQueryMusicVideoInfo from '../model/RemoteSearchQueryMusicVideoInfo';
import RemoteSearchQueryPersonLookupInfo from '../model/RemoteSearchQueryPersonLookupInfo';
import RemoteSearchQuerySeriesInfo from '../model/RemoteSearchQuerySeriesInfo';
import RemoteSearchQueryTrailerInfo from '../model/RemoteSearchQueryTrailerInfo';
import RemoteSearchResult from '../model/RemoteSearchResult';

/**
* ItemLookupService service.
* @module EmbyClient.JavaScript/ItemLookupServiceApi
* @version 4.8.10.0
*/
export default class ItemLookupServiceApi {

    /**
    * Constructs a new ItemLookupServiceApi. 
    * @alias module:EmbyClient.JavaScript/ItemLookupServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getItemsByIdExternalidinfos operation.
     * @callback module:EmbyClient.JavaScript/ItemLookupServiceApi~getItemsByIdExternalidinfosCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/ExternalIdInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets external id infos for an item
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ItemLookupServiceApi~getItemsByIdExternalidinfosCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/ExternalIdInfo>}
     */
    getItemsByIdExternalidinfos() {
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
      let returnType = [ExternalIdInfo];

      return this.apiClient.callApi(
        '/Items/{Id}/ExternalIdInfos', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsRemotesearchImage operation.
     * @callback module:EmbyClient.JavaScript/ItemLookupServiceApi~getItemsRemotesearchImageCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a remote image
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ItemLookupServiceApi~getItemsRemotesearchImageCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getItemsRemotesearchImage() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ImageUrl': imageUrl,
        'ProviderName': providerName
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
        '/Items/RemoteSearch/Image', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsMetadataReset operation.
     * @callback module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsMetadataResetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Resets metadata for one or more items
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsMetadataResetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsMetadataReset() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ItemIds': itemIds
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
        '/Items/Metadata/Reset', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchApplyById operation.
     * @callback module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchApplyByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Applies search criteria to an item and refreshes metadata
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchApplyByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsRemotesearchApplyById() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'ReplaceAllImages': opts['replaceAllImages']
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
        '/Items/RemoteSearch/Apply/{Id}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchBook operation.
     * @callback module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchBookCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchBookCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchBook() {
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
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/Book', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchBoxset operation.
     * @callback module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchBoxsetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchBoxsetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchBoxset() {
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
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/BoxSet', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchGame operation.
     * @callback module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchGameCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchGameCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchGame() {
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
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/Game', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchMovie operation.
     * @callback module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchMovieCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchMovieCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchMovie() {
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
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/Movie', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchMusicalbum operation.
     * @callback module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchMusicalbumCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchMusicalbumCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchMusicalbum() {
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
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/MusicAlbum', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchMusicartist operation.
     * @callback module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchMusicartistCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchMusicartistCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchMusicartist() {
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
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/MusicArtist', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchMusicvideo operation.
     * @callback module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchMusicvideoCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchMusicvideoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchMusicvideo() {
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
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/MusicVideo', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchPerson operation.
     * @callback module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchPersonCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchPersonCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchPerson() {
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
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/Person', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchSeries operation.
     * @callback module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchSeriesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchSeriesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchSeries() {
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
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/Series', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchTrailer operation.
     * @callback module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchTrailerCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/ItemLookupServiceApi~postItemsRemotesearchTrailerCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchTrailer() {
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
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/Trailer', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
