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
import FeatureInfo from '../model/FeatureInfo';

/**
* FeatureService service.
* @module api/FeatureServiceApi
* @version 4.9.0.32
*/
export default class FeatureServiceApi {

    /**
    * Constructs a new FeatureServiceApi. 
    * @alias module:api/FeatureServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets a list of installed features
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/FeatureInfo>} and HTTP response
     */
    getFeaturesWithHttpInfo() {
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
      let returnType = [FeatureInfo];

      return this.apiClient.callApi(
        '/Features', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a list of installed features
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/FeatureInfo>}
     */
    getFeatures() {
      return this.getFeaturesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
