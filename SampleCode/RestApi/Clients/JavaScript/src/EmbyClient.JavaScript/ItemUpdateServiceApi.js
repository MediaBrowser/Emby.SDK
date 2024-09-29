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
import BaseItemDto from '../model/BaseItemDto';
import MetadataEditorInfo from '../model/MetadataEditorInfo';

/**
* ItemUpdateService service.
* @module EmbyClient.JavaScript/ItemUpdateServiceApi
* @version 4.8.10.0
*/
export default class ItemUpdateServiceApi {

    /**
    * Constructs a new ItemUpdateServiceApi. 
    * @alias module:EmbyClient.JavaScript/ItemUpdateServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getItemsByItemidMetadataeditor operation.
     * @callback module:EmbyClient.JavaScript/ItemUpdateServiceApi~getItemsByItemidMetadataeditorCallback
     * @param {String} error Error message, if any.
     * @param {module:model/MetadataEditorInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets metadata editor info for an item
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ItemUpdateServiceApi~getItemsByItemidMetadataeditorCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/MetadataEditorInfo}
     */
    getItemsByItemidMetadataeditor() {
      let postBody = null;

      let pathParams = {
        'ItemId': itemId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsByItemid operation.
     * @callback module:EmbyClient.JavaScript/ItemUpdateServiceApi~postItemsByItemidCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates an item
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/ItemUpdateServiceApi~postItemsByItemidCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsByItemid() {
      let postBody = body;

      let pathParams = {
        'ItemId': itemId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
