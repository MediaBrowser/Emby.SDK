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

/**
* VideoHlsService service.
* @module api/VideoHlsServiceApi
* @version 4.9.0.32
*/
export default class VideoHlsServiceApi {

    /**
    * Constructs a new VideoHlsServiceApi. 
    * @alias module:api/VideoHlsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'SegmentContainer': SegmentContainer,
        'SegmentId': SegmentId,
        'Id': Id,
        'PlaylistId': PlaylistId
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
        '/Audio/{Id}/hls/{PlaylistId}/{SegmentId}.{SegmentContainer}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer() {
      return this.getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'SegmentContainer': SegmentContainer,
        'SegmentId': SegmentId,
        'Id': Id,
        'PlaylistId': PlaylistId
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
        '/Videos/{Id}/hls/{PlaylistId}/{SegmentId}.{SegmentContainer}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer() {
      return this.getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
