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

/**
* VideoHlsService service.
* @module EmbyClient.JavaScript/VideoHlsServiceApi
* @version 4.8.10.0
*/
export default class VideoHlsServiceApi {

    /**
    * Constructs a new VideoHlsServiceApi. 
    * @alias module:EmbyClient.JavaScript/VideoHlsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer operation.
     * @callback module:EmbyClient.JavaScript/VideoHlsServiceApi~getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/VideoHlsServiceApi~getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer() {
      let postBody = null;

      let pathParams = {
        'SegmentContainer': segmentContainer,
        'SegmentId': segmentId,
        'Id': id,
        'PlaylistId': playlistId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer operation.
     * @callback module:EmbyClient.JavaScript/VideoHlsServiceApi~getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/VideoHlsServiceApi~getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer() {
      let postBody = null;

      let pathParams = {
        'SegmentContainer': segmentContainer,
        'SegmentId': segmentId,
        'Id': id,
        'PlaylistId': playlistId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
