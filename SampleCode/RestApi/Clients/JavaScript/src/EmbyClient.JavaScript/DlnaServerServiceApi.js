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
* DlnaServerService service.
* @module EmbyClient.JavaScript/DlnaServerServiceApi
* @version 4.8.10.0
*/
export default class DlnaServerServiceApi {

    /**
    * Constructs a new DlnaServerServiceApi. 
    * @alias module:EmbyClient.JavaScript/DlnaServerServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getDlnaByUuidConnectionmanagerConnectionmanager operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaByUuidConnectionmanagerConnectionmanagerCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaByUuidConnectionmanagerConnectionmanagerCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getDlnaByUuidConnectionmanagerConnectionmanager() {
      let postBody = null;

      let pathParams = {
        'UuId': uuId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getDlnaByUuidConnectionmanagerConnectionmanagerXml operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaByUuidConnectionmanagerConnectionmanagerXmlCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaByUuidConnectionmanagerConnectionmanagerXmlCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getDlnaByUuidConnectionmanagerConnectionmanagerXml() {
      let postBody = null;

      let pathParams = {
        'UuId': uuId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getDlnaByUuidContentdirectoryContentdirectory operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaByUuidContentdirectoryContentdirectoryCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets dlna content directory xml
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaByUuidContentdirectoryContentdirectoryCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getDlnaByUuidContentdirectoryContentdirectory() {
      let postBody = null;

      let pathParams = {
        'UuId': uuId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getDlnaByUuidContentdirectoryContentdirectoryXml operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaByUuidContentdirectoryContentdirectoryXmlCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets dlna content directory xml
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaByUuidContentdirectoryContentdirectoryXmlCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getDlnaByUuidContentdirectoryContentdirectoryXml() {
      let postBody = null;

      let pathParams = {
        'UuId': uuId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getDlnaByUuidDescription operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaByUuidDescriptionCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets dlna server info
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaByUuidDescriptionCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getDlnaByUuidDescription() {
      let postBody = null;

      let pathParams = {
        'UuId': uuId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getDlnaByUuidDescriptionXml operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaByUuidDescriptionXmlCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets dlna server info
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaByUuidDescriptionXmlCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getDlnaByUuidDescriptionXml() {
      let postBody = null;

      let pathParams = {
        'UuId': uuId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getDlnaByUuidIconsByFilename operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaByUuidIconsByFilenameCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a server icon
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaByUuidIconsByFilenameCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getDlnaByUuidIconsByFilename() {
      let postBody = null;

      let pathParams = {
        'UuId': uuId,
        'Filename': filename
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getDlnaIconsByFilename operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaIconsByFilenameCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a server icon
     * No authentication required
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~getDlnaIconsByFilenameCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getDlnaIconsByFilename() {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        'Filename': filename
      };
      let queryParams = {
        'UuId': opts['uuId']
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headDlnaByUuidConnectionmanagerConnectionmanager operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~headDlnaByUuidConnectionmanagerConnectionmanagerCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~headDlnaByUuidConnectionmanagerConnectionmanagerCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headDlnaByUuidConnectionmanagerConnectionmanager() {
      let postBody = null;

      let pathParams = {
        'UuId': uuId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headDlnaByUuidConnectionmanagerConnectionmanagerXml operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~headDlnaByUuidConnectionmanagerConnectionmanagerXmlCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets dlna connection manager xml
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~headDlnaByUuidConnectionmanagerConnectionmanagerXmlCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headDlnaByUuidConnectionmanagerConnectionmanagerXml() {
      let postBody = null;

      let pathParams = {
        'UuId': uuId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headDlnaByUuidContentdirectoryContentdirectory operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~headDlnaByUuidContentdirectoryContentdirectoryCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets dlna content directory xml
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~headDlnaByUuidContentdirectoryContentdirectoryCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headDlnaByUuidContentdirectoryContentdirectory() {
      let postBody = null;

      let pathParams = {
        'UuId': uuId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headDlnaByUuidContentdirectoryContentdirectoryXml operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~headDlnaByUuidContentdirectoryContentdirectoryXmlCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets dlna content directory xml
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~headDlnaByUuidContentdirectoryContentdirectoryXmlCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headDlnaByUuidContentdirectoryContentdirectoryXml() {
      let postBody = null;

      let pathParams = {
        'UuId': uuId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headDlnaByUuidDescription operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~headDlnaByUuidDescriptionCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets dlna server info
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~headDlnaByUuidDescriptionCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headDlnaByUuidDescription() {
      let postBody = null;

      let pathParams = {
        'UuId': uuId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the headDlnaByUuidDescriptionXml operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~headDlnaByUuidDescriptionXmlCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets dlna server info
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~headDlnaByUuidDescriptionXmlCallback} callback The callback function, accepting three arguments: error, data, response
     */
    headDlnaByUuidDescriptionXml() {
      let postBody = null;

      let pathParams = {
        'UuId': uuId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postDlnaByUuidConnectionmanagerControl operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~postDlnaByUuidConnectionmanagerControlCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Processes a control request
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~postDlnaByUuidConnectionmanagerControlCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postDlnaByUuidConnectionmanagerControl() {
      let postBody = body;

      let pathParams = {
        'UuId': uuId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postDlnaByUuidContentdirectoryControl operation.
     * @callback module:EmbyClient.JavaScript/DlnaServerServiceApi~postDlnaByUuidContentdirectoryControlCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Processes a control request
     * No authentication required
     * @param {module:EmbyClient.JavaScript/DlnaServerServiceApi~postDlnaByUuidContentdirectoryControlCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postDlnaByUuidContentdirectoryControl() {
      let postBody = body;

      let pathParams = {
        'UuId': uuId
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
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}
