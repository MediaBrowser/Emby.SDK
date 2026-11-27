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
import MediaEncodingSettingsApiHwaCancelHwaNodeOptions from '../model/MediaEncodingSettingsApiHwaCancelHwaNodeOptions';
import MediaEncodingSettingsApiHwaExecuteHwaConfigCommand from '../model/MediaEncodingSettingsApiHwaExecuteHwaConfigCommand';
import MediaEncodingSettingsApiHwaSaveHwaConfig from '../model/MediaEncodingSettingsApiHwaSaveHwaConfig';
import MediaEncodingSettingsApiHwaSaveHwaConfigResult from '../model/MediaEncodingSettingsApiHwaSaveHwaConfigResult';
import MediaEncodingSettingsApiHwaSelectHwaBasicDevice from '../model/MediaEncodingSettingsApiHwaSelectHwaBasicDevice';
import MediaEncodingSettingsHwaEditingNodeOptionsForm from '../model/MediaEncodingSettingsHwaEditingNodeOptionsForm';
import MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType from '../model/MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType';
import MediaEncodingSettingsHwaProjectionHwaConfigView from '../model/MediaEncodingSettingsHwaProjectionHwaConfigView';

/**
* HwaConfigService service.
* @module api/HwaConfigServiceApi
* @version 4.11.0.19
*/
export default class HwaConfigServiceApi {

    /**
    * Constructs a new HwaConfigServiceApi. 
    * @alias module:api/HwaConfigServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets the transcoding configuration graph
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/MediaEncodingSettingsHwaProjectionHwaConfigView} and HTTP response
     */
    getEncodingHwaconfigWithHttpInfo() {
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
      let returnType = MediaEncodingSettingsHwaProjectionHwaConfigView;

      return this.apiClient.callApi(
        '/Encoding/HwaConfig', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets the transcoding configuration graph
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/MediaEncodingSettingsHwaProjectionHwaConfigView}
     */
    getEncodingHwaconfig() {
      return this.getEncodingHwaconfigWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets whether the active configuration has unsaved changes
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link 'Boolean'} and HTTP response
     */
    getEncodingHwaconfighaschangesWithHttpInfo() {
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
      let returnType = 'Boolean';

      return this.apiClient.callApi(
        '/Encoding/HwaConfigHasChanges', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets whether the active configuration has unsaved changes
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link 'Boolean'}
     */
    getEncodingHwaconfighaschanges() {
      return this.getEncodingHwaconfighaschangesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets an options form for a graph node
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/MediaEncodingSettingsHwaEditingNodeOptionsForm} and HTTP response
     */
    getEncodingHwanodeoptionsWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'NodeId': NodeId,
        'EditorType': EditorType
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = MediaEncodingSettingsHwaEditingNodeOptionsForm;

      return this.apiClient.callApi(
        '/Encoding/HwaNodeOptions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Gets an options form for a graph node
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/MediaEncodingSettingsHwaEditingNodeOptionsForm}
     */
    getEncodingHwanodeoptions() {
      return this.getEncodingHwanodeoptionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Chooses the device Basic mode uses
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/MediaEncodingSettingsHwaProjectionHwaConfigView} and HTTP response
     */
    postEncodingHwabasicdeviceWithHttpInfo() {
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
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = MediaEncodingSettingsHwaProjectionHwaConfigView;

      return this.apiClient.callApi(
        '/Encoding/HwaBasicDevice', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Chooses the device Basic mode uses
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/MediaEncodingSettingsHwaProjectionHwaConfigView}
     */
    postEncodingHwabasicdevice() {
      return this.postEncodingHwabasicdeviceWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Runs a command against the transcoding configuration graph
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/MediaEncodingSettingsHwaProjectionHwaConfigView} and HTTP response
     */
    postEncodingHwaconfigcommandWithHttpInfo() {
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
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = MediaEncodingSettingsHwaProjectionHwaConfigView;

      return this.apiClient.callApi(
        '/Encoding/HwaConfigCommand', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Runs a command against the transcoding configuration graph
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/MediaEncodingSettingsHwaProjectionHwaConfigView}
     */
    postEncodingHwaconfigcommand() {
      return this.postEncodingHwaconfigcommandWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Discards the in-progress edit and reloads the active transcoding configuration
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/MediaEncodingSettingsHwaProjectionHwaConfigView} and HTTP response
     */
    postEncodingHwaconfigdiscardchangesWithHttpInfo() {
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
      let returnType = MediaEncodingSettingsHwaProjectionHwaConfigView;

      return this.apiClient.callApi(
        '/Encoding/HwaConfigDiscardChanges', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Discards the in-progress edit and reloads the active transcoding configuration
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/MediaEncodingSettingsHwaProjectionHwaConfigView}
     */
    postEncodingHwaconfigdiscardchanges() {
      return this.postEncodingHwaconfigdiscardchangesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Saves the transcoding configuration
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/MediaEncodingSettingsApiHwaSaveHwaConfigResult} and HTTP response
     */
    postEncodingHwaconfigsaveWithHttpInfo() {
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
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = MediaEncodingSettingsApiHwaSaveHwaConfigResult;

      return this.apiClient.callApi(
        '/Encoding/HwaConfigSave', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Saves the transcoding configuration
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/MediaEncodingSettingsApiHwaSaveHwaConfigResult}
     */
    postEncodingHwaconfigsave() {
      return this.postEncodingHwaconfigsaveWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Stores an options form for a graph node
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postEncodingHwanodeoptionsWithHttpInfo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'NodeId': NodeId,
        'EditorType': EditorType
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
        '/Encoding/HwaNodeOptions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Stores an options form for a graph node
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postEncodingHwanodeoptions() {
      return this.postEncodingHwanodeoptionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Discards an open options form
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    postEncodingHwanodeoptionscancelWithHttpInfo() {
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
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Encoding/HwaNodeOptionsCancel', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Discards an open options form
     * Requires authentication as administrator
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    postEncodingHwanodeoptionscancel() {
      return this.postEncodingHwanodeoptionscancelWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Runs a postback within an open options form
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/MediaEncodingSettingsHwaEditingNodeOptionsForm} and HTTP response
     */
    postEncodingHwanodeoptionscommandWithHttpInfo() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'NodeId': NodeId,
        'EditorType': EditorType,
        'CommandId': CommandId,
        'ItemId': opts['ItemId'],
        'Data': opts['Data']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/octet-stream'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = MediaEncodingSettingsHwaEditingNodeOptionsForm;

      return this.apiClient.callApi(
        '/Encoding/HwaNodeOptionsCommand', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Runs a postback within an open options form
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/MediaEncodingSettingsHwaEditingNodeOptionsForm}
     */
    postEncodingHwanodeoptionscommand() {
      return this.postEncodingHwanodeoptionscommandWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Closes a form opened from within another one
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/MediaEncodingSettingsHwaEditingNodeOptionsForm} and HTTP response
     */
    postEncodingHwanodesuboptionsWithHttpInfo() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'NodeId': NodeId,
        'EditorType': EditorType,
        'IsAccepted': opts['IsAccepted']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/octet-stream'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = MediaEncodingSettingsHwaEditingNodeOptionsForm;

      return this.apiClient.callApi(
        '/Encoding/HwaNodeSubOptions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Closes a form opened from within another one
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/MediaEncodingSettingsHwaEditingNodeOptionsForm}
     */
    postEncodingHwanodesuboptions() {
      return this.postEncodingHwanodesuboptionsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
