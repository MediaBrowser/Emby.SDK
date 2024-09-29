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
import FeatureInfo from '../model/FeatureInfo';

/**
* FeatureService service.
* @module EmbyClient.JavaScript/FeatureServiceApi
* @version 4.8.10.0
*/
export default class FeatureServiceApi {

    /**
    * Constructs a new FeatureServiceApi. 
    * @alias module:EmbyClient.JavaScript/FeatureServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getFeatures operation.
     * @callback module:EmbyClient.JavaScript/FeatureServiceApi~getFeaturesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/FeatureInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a list of installed features
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript/FeatureServiceApi~getFeaturesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/FeatureInfo>}
     */
    getFeatures() {
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
