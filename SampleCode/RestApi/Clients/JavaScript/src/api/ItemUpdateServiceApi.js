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
import MetadataEditorInfo from '../model/MetadataEditorInfo';

/**
* ItemUpdateService service.
* @module api/ItemUpdateServiceApi
* @version 4.9.0.29
*/
export default class ItemUpdateServiceApi {

    /**
    * Constructs a new ItemUpdateServiceApi. 
    * @alias module:api/ItemUpdateServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets metadata editor info for an item
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/MetadataEditorInfo} and HTTP response
     */
    getItemsByItemidMetadataeditorWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'ItemId': ItemId
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
      let returnType = MetadataEditorInfo;

      return this.apiClient.callApi(
        '/Items/{ItemId}/MetadataEditor', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets metadata editor info for an item
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/MetadataEditorInfo}
     */
    getItemsByItemidMetadataeditor() {
      return this.getItemsByItemidMetadataeditorWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates an item
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postItemsByItemidWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'ItemId': ItemId
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
        '/Items/{ItemId}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates an item
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postItemsByItemid() {
      return this.postItemsByItemidWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
