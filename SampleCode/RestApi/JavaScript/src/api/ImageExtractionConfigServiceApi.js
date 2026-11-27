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
import MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm from '../model/MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm';

/**
* ImageExtractionConfigService service.
* @module api/ImageExtractionConfigServiceApi
* @version 4.11.0.19
*/
export default class ImageExtractionConfigServiceApi {

    /**
    * Constructs a new ImageExtractionConfigServiceApi. 
    * @alias module:api/ImageExtractionConfigServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets the image-extraction tone-mapping settings
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm} and HTTP response
     */
    getEncodingImageextractiontonemapparametersWithHttpInfo() {
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
      let returnType = MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm;

      return this.apiClient.callApi(
        '/Encoding/ImageExtractionToneMapParameters', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the image-extraction tone-mapping settings
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm}
     */
    getEncodingImageextractiontonemapparameters() {
      return this.getEncodingImageextractiontonemapparametersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates the image-extraction tone-mapping settings
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postEncodingImageextractiontonemapparametersWithHttpInfo() {
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
      let contentTypes = ['application/octet-stream'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Encoding/ImageExtractionToneMapParameters', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates the image-extraction tone-mapping settings
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postEncodingImageextractiontonemapparameters() {
      return this.postEncodingImageextractiontonemapparametersWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Runs an image-extraction settings command
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm} and HTTP response
     */
    postEncodingImageextractiontonemapparametersCommandWithHttpInfo() {
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
      let contentTypes = ['application/octet-stream'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm;

      return this.apiClient.callApi(
        '/Encoding/ImageExtractionToneMapParameters/Command', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Runs an image-extraction settings command
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm}
     */
    postEncodingImageextractiontonemapparametersCommand() {
      return this.postEncodingImageextractiontonemapparametersCommandWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Closes an image-extraction filter options dialog
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm} and HTTP response
     */
    postEncodingImageextractiontonemapparametersSuboptionsWithHttpInfo() {
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
      let contentTypes = ['application/octet-stream'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm;

      return this.apiClient.callApi(
        '/Encoding/ImageExtractionToneMapParameters/SubOptions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Closes an image-extraction filter options dialog
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm}
     */
    postEncodingImageextractiontonemapparametersSuboptions() {
      return this.postEncodingImageextractiontonemapparametersSuboptionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
