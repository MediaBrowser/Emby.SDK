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
import BrandingBrandingOptions from '../model/BrandingBrandingOptions';

/**
* BrandingService service.
* @module EmbyClient.JavaScript/BrandingServiceApi
* @version 4.8.10.0
*/
export default class BrandingServiceApi {

    /**
    * Constructs a new BrandingServiceApi. 
    * @alias module:EmbyClient.JavaScript/BrandingServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getBrandingConfiguration operation.
     * @callback module:EmbyClient.JavaScript/BrandingServiceApi~getBrandingConfigurationCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BrandingBrandingOptions} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets branding configuration
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/BrandingServiceApi~getBrandingConfigurationCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/BrandingBrandingOptions}
     */
    getBrandingConfiguration() {
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
      let returnType = BrandingBrandingOptions;

      return this.apiClient.callApi(
        '/Branding/Configuration', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getBrandingCss operation.
     * @callback module:EmbyClient.JavaScript/BrandingServiceApi~getBrandingCssCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets custom css
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/BrandingServiceApi~getBrandingCssCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getBrandingCss() {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Branding/Css', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getBrandingCssCss operation.
     * @callback module:EmbyClient.JavaScript/BrandingServiceApi~getBrandingCssCssCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets custom css
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/BrandingServiceApi~getBrandingCssCssCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getBrandingCssCss() {
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
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Branding/Css.css', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
