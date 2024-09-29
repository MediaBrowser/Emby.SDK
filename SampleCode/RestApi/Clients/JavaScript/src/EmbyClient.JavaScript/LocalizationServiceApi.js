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
import GlobalizationCountryInfo from '../model/GlobalizationCountryInfo';
import GlobalizationCultureDto from '../model/GlobalizationCultureDto';
import GlobalizationLocalizatonOption from '../model/GlobalizationLocalizatonOption';
import ParentalRating from '../model/ParentalRating';

/**
* LocalizationService service.
* @module EmbyClient.JavaScript/LocalizationServiceApi
* @version 4.8.10.0
*/
export default class LocalizationServiceApi {

    /**
    * Constructs a new LocalizationServiceApi. 
    * @alias module:EmbyClient.JavaScript/LocalizationServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getLocalizationCountries operation.
     * @callback module:EmbyClient.JavaScript/LocalizationServiceApi~getLocalizationCountriesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/GlobalizationCountryInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets known countries
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LocalizationServiceApi~getLocalizationCountriesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/GlobalizationCountryInfo>}
     */
    getLocalizationCountries() {
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
      let returnType = [GlobalizationCountryInfo];

      return this.apiClient.callApi(
        '/Localization/Countries', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLocalizationCultures operation.
     * @callback module:EmbyClient.JavaScript/LocalizationServiceApi~getLocalizationCulturesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/GlobalizationCultureDto>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets known cultures
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LocalizationServiceApi~getLocalizationCulturesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/GlobalizationCultureDto>}
     */
    getLocalizationCultures() {
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
      let returnType = [GlobalizationCultureDto];

      return this.apiClient.callApi(
        '/Localization/Cultures', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLocalizationOptions operation.
     * @callback module:EmbyClient.JavaScript/LocalizationServiceApi~getLocalizationOptionsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/GlobalizationLocalizatonOption>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets localization options
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LocalizationServiceApi~getLocalizationOptionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/GlobalizationLocalizatonOption>}
     */
    getLocalizationOptions() {
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
      let returnType = [GlobalizationLocalizatonOption];

      return this.apiClient.callApi(
        '/Localization/Options', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getLocalizationParentalratings operation.
     * @callback module:EmbyClient.JavaScript/LocalizationServiceApi~getLocalizationParentalratingsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/ParentalRating>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets known parental ratings
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript/LocalizationServiceApi~getLocalizationParentalratingsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/ParentalRating>}
     */
    getLocalizationParentalratings() {
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
      let returnType = [ParentalRating];

      return this.apiClient.callApi(
        '/Localization/ParentalRatings', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
