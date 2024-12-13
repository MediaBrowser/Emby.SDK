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
* @module api/ItemLookupServiceApi
* @version 4.9.0.33
*/
export default class ItemLookupServiceApi {

    /**
    * Constructs a new ItemLookupServiceApi. 
    * @alias module:api/ItemLookupServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets external id infos for an item
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/ExternalIdInfo>} and HTTP response
     */
    getItemsByIdExternalidinfosWithHttpInfo() {
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
      let returnType = [ExternalIdInfo];

      return this.apiClient.callApi(
        '/Items/{Id}/ExternalIdInfos', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets external id infos for an item
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/ExternalIdInfo>}
     */
    getItemsByIdExternalidinfos() {
      return this.getItemsByIdExternalidinfosWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a remote image
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getItemsRemotesearchImageWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ImageUrl': ImageUrl,
        'ProviderName': ProviderName
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a remote image
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getItemsRemotesearchImage() {
      return this.getItemsRemotesearchImageWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Resets metadata for one or more items
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsMetadataResetWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ItemIds': ItemIds
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Resets metadata for one or more items
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsMetadataReset() {
      return this.postItemsMetadataResetWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Applies search criteria to an item and refreshes metadata
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsRemotesearchApplyByIdWithHttpInfo() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
        'Id': Id
      };
      let queryParams = {
        'ReplaceAllImages': opts['ReplaceAllImages']
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Applies search criteria to an item and refreshes metadata
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsRemotesearchApplyById() {
      return this.postItemsRemotesearchApplyByIdWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RemoteSearchResult>} and HTTP response
     */
    postItemsRemotesearchBookWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchBook() {
      return this.postItemsRemotesearchBookWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RemoteSearchResult>} and HTTP response
     */
    postItemsRemotesearchBoxsetWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchBoxset() {
      return this.postItemsRemotesearchBoxsetWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RemoteSearchResult>} and HTTP response
     */
    postItemsRemotesearchGameWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchGame() {
      return this.postItemsRemotesearchGameWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RemoteSearchResult>} and HTTP response
     */
    postItemsRemotesearchMovieWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchMovie() {
      return this.postItemsRemotesearchMovieWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RemoteSearchResult>} and HTTP response
     */
    postItemsRemotesearchMusicalbumWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchMusicalbum() {
      return this.postItemsRemotesearchMusicalbumWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RemoteSearchResult>} and HTTP response
     */
    postItemsRemotesearchMusicartistWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchMusicartist() {
      return this.postItemsRemotesearchMusicartistWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RemoteSearchResult>} and HTTP response
     */
    postItemsRemotesearchMusicvideoWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchMusicvideo() {
      return this.postItemsRemotesearchMusicvideoWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RemoteSearchResult>} and HTTP response
     */
    postItemsRemotesearchPersonWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchPerson() {
      return this.postItemsRemotesearchPersonWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RemoteSearchResult>} and HTTP response
     */
    postItemsRemotesearchSeriesWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchSeries() {
      return this.postItemsRemotesearchSeriesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RemoteSearchResult>} and HTTP response
     */
    postItemsRemotesearchTrailerWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchTrailer() {
      return this.postItemsRemotesearchTrailerWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
