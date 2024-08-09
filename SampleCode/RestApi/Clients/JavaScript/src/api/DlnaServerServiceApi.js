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
* DlnaServerService service.
* @module api/DlnaServerServiceApi
* @version 4.9.0.29
*/
export default class DlnaServerServiceApi {

    /**
    * Constructs a new DlnaServerServiceApi. 
    * @alias module:api/DlnaServerServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getDlnaByUuidConnectionmanagerConnectionmanagerWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UuId': UuId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/{UuId}/connectionmanager/connectionmanager', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getDlnaByUuidConnectionmanagerConnectionmanager() {
      return this.getDlnaByUuidConnectionmanagerConnectionmanagerWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getDlnaByUuidConnectionmanagerConnectionmanagerXmlWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UuId': UuId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/{UuId}/connectionmanager/connectionmanager.xml', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getDlnaByUuidConnectionmanagerConnectionmanagerXml() {
      return this.getDlnaByUuidConnectionmanagerConnectionmanagerXmlWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets dlna content directory xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getDlnaByUuidContentdirectoryContentdirectoryWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UuId': UuId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/{UuId}/contentdirectory/contentdirectory', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets dlna content directory xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getDlnaByUuidContentdirectoryContentdirectory() {
      return this.getDlnaByUuidContentdirectoryContentdirectoryWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets dlna content directory xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getDlnaByUuidContentdirectoryContentdirectoryXmlWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UuId': UuId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/{UuId}/contentdirectory/contentdirectory.xml', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets dlna content directory xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getDlnaByUuidContentdirectoryContentdirectoryXml() {
      return this.getDlnaByUuidContentdirectoryContentdirectoryXmlWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets dlna server info
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getDlnaByUuidDescriptionWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UuId': UuId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/{UuId}/description', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets dlna server info
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getDlnaByUuidDescription() {
      return this.getDlnaByUuidDescriptionWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets dlna server info
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getDlnaByUuidDescriptionXmlWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UuId': UuId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/{UuId}/description.xml', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets dlna server info
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getDlnaByUuidDescriptionXml() {
      return this.getDlnaByUuidDescriptionXmlWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a server icon
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getDlnaByUuidIconsByFilenameWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UuId': UuId,
        'Filename': Filename
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/{UuId}/icons/{Filename}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a server icon
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getDlnaByUuidIconsByFilename() {
      return this.getDlnaByUuidIconsByFilenameWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a server icon
     * No authentication required
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getDlnaIconsByFilenameWithHttpInfo() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Filename': Filename
      };
      let queryParams = {
        'UuId': opts['UuId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/icons/{Filename}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets a server icon
     * No authentication required
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    getDlnaIconsByFilename() {
      return this.getDlnaIconsByFilenameWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headDlnaByUuidConnectionmanagerConnectionmanagerWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UuId': UuId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/{UuId}/connectionmanager/connectionmanager', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headDlnaByUuidConnectionmanagerConnectionmanager() {
      return this.headDlnaByUuidConnectionmanagerConnectionmanagerWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headDlnaByUuidConnectionmanagerConnectionmanagerXmlWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UuId': UuId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/{UuId}/connectionmanager/connectionmanager.xml', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headDlnaByUuidConnectionmanagerConnectionmanagerXml() {
      return this.headDlnaByUuidConnectionmanagerConnectionmanagerXmlWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets dlna content directory xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headDlnaByUuidContentdirectoryContentdirectoryWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UuId': UuId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/{UuId}/contentdirectory/contentdirectory', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets dlna content directory xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headDlnaByUuidContentdirectoryContentdirectory() {
      return this.headDlnaByUuidContentdirectoryContentdirectoryWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets dlna content directory xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headDlnaByUuidContentdirectoryContentdirectoryXmlWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UuId': UuId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/{UuId}/contentdirectory/contentdirectory.xml', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets dlna content directory xml
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headDlnaByUuidContentdirectoryContentdirectoryXml() {
      return this.headDlnaByUuidContentdirectoryContentdirectoryXmlWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets dlna server info
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headDlnaByUuidDescriptionWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UuId': UuId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/{UuId}/description', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets dlna server info
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headDlnaByUuidDescription() {
      return this.headDlnaByUuidDescriptionWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets dlna server info
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    headDlnaByUuidDescriptionXmlWithHttpInfo() {
      let postBody = null;

      let pathParams = {
        'UuId': UuId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/{UuId}/description.xml', 'HEAD',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets dlna server info
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    headDlnaByUuidDescriptionXml() {
      return this.headDlnaByUuidDescriptionXmlWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Processes a control request
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postDlnaByUuidConnectionmanagerControlWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'UuId': UuId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/octet-stream'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/{UuId}/connectionmanager/control', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Processes a control request
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postDlnaByUuidConnectionmanagerControl() {
      return this.postDlnaByUuidConnectionmanagerControlWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Processes a control request
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postDlnaByUuidContentdirectoryControlWithHttpInfo() {
      let postBody = body;

      let pathParams = {
        'UuId': UuId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/octet-stream'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Dlna/{UuId}/contentdirectory/control', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Processes a control request
     * No authentication required
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postDlnaByUuidContentdirectoryControl() {
      return this.postDlnaByUuidContentdirectoryControlWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
