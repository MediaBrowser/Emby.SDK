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
import GlobalizationCountryInfo from '../model/GlobalizationCountryInfo';
import GlobalizationCultureDto from '../model/GlobalizationCultureDto';
import GlobalizationLocalizatonOption from '../model/GlobalizationLocalizatonOption';
import ParentalRating from '../model/ParentalRating';

/**
* LocalizationService service.
* @module api/LocalizationServiceApi
* @version 4.9.0.32
*/
export default class LocalizationServiceApi {

    /**
    * Constructs a new LocalizationServiceApi. 
    * @alias module:api/LocalizationServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets known countries
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/GlobalizationCountryInfo>} and HTTP response
     */
    getLocalizationCountriesWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets known countries
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/GlobalizationCountryInfo>}
     */
    getLocalizationCountries() {
      return this.getLocalizationCountriesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets known cultures
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/GlobalizationCultureDto>} and HTTP response
     */
    getLocalizationCulturesWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets known cultures
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/GlobalizationCultureDto>}
     */
    getLocalizationCultures() {
      return this.getLocalizationCulturesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets localization options
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/GlobalizationLocalizatonOption>} and HTTP response
     */
    getLocalizationOptionsWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets localization options
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/GlobalizationLocalizatonOption>}
     */
    getLocalizationOptions() {
      return this.getLocalizationOptionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets known parental ratings
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/ParentalRating>} and HTTP response
     */
    getLocalizationParentalratingsWithHttpInfo() {
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
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets known parental ratings
     * Requires authentication as user
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/ParentalRating>}
     */
    getLocalizationParentalratings() {
      return this.getLocalizationParentalratingsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
