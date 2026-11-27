# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from embyclient.api_client import ApiClient


class HwaConfigServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_encoding_hwaconfig(self, **kwargs):  # noqa: E501
        """Gets the transcoding configuration graph  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_encoding_hwaconfig(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: MediaEncodingSettingsHwaProjectionHwaConfigView
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_encoding_hwaconfig_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_encoding_hwaconfig_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_encoding_hwaconfig_with_http_info(self, **kwargs):  # noqa: E501
        """Gets the transcoding configuration graph  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_encoding_hwaconfig_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: MediaEncodingSettingsHwaProjectionHwaConfigView
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = []  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_encoding_hwaconfig" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json', 'application/xml'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Encoding/HwaConfig', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='MediaEncodingSettingsHwaProjectionHwaConfigView',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_encoding_hwaconfighaschanges(self, **kwargs):  # noqa: E501
        """Gets whether the active configuration has unsaved changes  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_encoding_hwaconfighaschanges(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: bool
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_encoding_hwaconfighaschanges_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_encoding_hwaconfighaschanges_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_encoding_hwaconfighaschanges_with_http_info(self, **kwargs):  # noqa: E501
        """Gets whether the active configuration has unsaved changes  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_encoding_hwaconfighaschanges_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: bool
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = []  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_encoding_hwaconfighaschanges" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json', 'application/xml'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Encoding/HwaConfigHasChanges', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='bool',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_encoding_hwanodeoptions(self, node_id, editor_type, **kwargs):  # noqa: E501
        """Gets an options form for a graph node  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_encoding_hwanodeoptions(node_id, editor_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str node_id: Id of the node (required)
        :param MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editor_type: Which of the node's forms is wanted (required)
        :return: MediaEncodingSettingsHwaEditingNodeOptionsForm
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_encoding_hwanodeoptions_with_http_info(node_id, editor_type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_encoding_hwanodeoptions_with_http_info(node_id, editor_type, **kwargs)  # noqa: E501
            return data

    def get_encoding_hwanodeoptions_with_http_info(self, node_id, editor_type, **kwargs):  # noqa: E501
        """Gets an options form for a graph node  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_encoding_hwanodeoptions_with_http_info(node_id, editor_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str node_id: Id of the node (required)
        :param MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editor_type: Which of the node's forms is wanted (required)
        :return: MediaEncodingSettingsHwaEditingNodeOptionsForm
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['node_id', 'editor_type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_encoding_hwanodeoptions" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'node_id' is set
        if ('node_id' not in params or
                params['node_id'] is None):
            raise ValueError("Missing the required parameter `node_id` when calling `get_encoding_hwanodeoptions`")  # noqa: E501
        # verify the required parameter 'editor_type' is set
        if ('editor_type' not in params or
                params['editor_type'] is None):
            raise ValueError("Missing the required parameter `editor_type` when calling `get_encoding_hwanodeoptions`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'node_id' in params:
            query_params.append(('NodeId', params['node_id']))  # noqa: E501
        if 'editor_type' in params:
            query_params.append(('EditorType', params['editor_type']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json', 'application/xml'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Encoding/HwaNodeOptions', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='MediaEncodingSettingsHwaEditingNodeOptionsForm',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_encoding_hwabasicdevice(self, body, **kwargs):  # noqa: E501
        """Chooses the device Basic mode uses  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwabasicdevice(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param MediaEncodingSettingsApiHwaSelectHwaBasicDevice body: SelectHwaBasicDevice (required)
        :return: MediaEncodingSettingsHwaProjectionHwaConfigView
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_encoding_hwabasicdevice_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_encoding_hwabasicdevice_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_encoding_hwabasicdevice_with_http_info(self, body, **kwargs):  # noqa: E501
        """Chooses the device Basic mode uses  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwabasicdevice_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param MediaEncodingSettingsApiHwaSelectHwaBasicDevice body: SelectHwaBasicDevice (required)
        :return: MediaEncodingSettingsHwaProjectionHwaConfigView
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_encoding_hwabasicdevice" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_encoding_hwabasicdevice`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json', 'application/xml'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json', 'application/xml'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Encoding/HwaBasicDevice', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='MediaEncodingSettingsHwaProjectionHwaConfigView',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_encoding_hwaconfigcommand(self, body, **kwargs):  # noqa: E501
        """Runs a command against the transcoding configuration graph  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwaconfigcommand(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body: ExecuteHwaConfigCommand (required)
        :return: MediaEncodingSettingsHwaProjectionHwaConfigView
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_encoding_hwaconfigcommand_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_encoding_hwaconfigcommand_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_encoding_hwaconfigcommand_with_http_info(self, body, **kwargs):  # noqa: E501
        """Runs a command against the transcoding configuration graph  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwaconfigcommand_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body: ExecuteHwaConfigCommand (required)
        :return: MediaEncodingSettingsHwaProjectionHwaConfigView
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_encoding_hwaconfigcommand" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_encoding_hwaconfigcommand`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json', 'application/xml'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json', 'application/xml'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Encoding/HwaConfigCommand', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='MediaEncodingSettingsHwaProjectionHwaConfigView',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_encoding_hwaconfigdiscardchanges(self, **kwargs):  # noqa: E501
        """Discards the in-progress edit and reloads the active transcoding configuration  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwaconfigdiscardchanges(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: MediaEncodingSettingsHwaProjectionHwaConfigView
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_encoding_hwaconfigdiscardchanges_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.post_encoding_hwaconfigdiscardchanges_with_http_info(**kwargs)  # noqa: E501
            return data

    def post_encoding_hwaconfigdiscardchanges_with_http_info(self, **kwargs):  # noqa: E501
        """Discards the in-progress edit and reloads the active transcoding configuration  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwaconfigdiscardchanges_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: MediaEncodingSettingsHwaProjectionHwaConfigView
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = []  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_encoding_hwaconfigdiscardchanges" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json', 'application/xml'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Encoding/HwaConfigDiscardChanges', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='MediaEncodingSettingsHwaProjectionHwaConfigView',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_encoding_hwaconfigsave(self, body, **kwargs):  # noqa: E501
        """Saves the transcoding configuration  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwaconfigsave(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param MediaEncodingSettingsApiHwaSaveHwaConfig body: SaveHwaConfig (required)
        :return: MediaEncodingSettingsApiHwaSaveHwaConfigResult
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_encoding_hwaconfigsave_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_encoding_hwaconfigsave_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_encoding_hwaconfigsave_with_http_info(self, body, **kwargs):  # noqa: E501
        """Saves the transcoding configuration  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwaconfigsave_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param MediaEncodingSettingsApiHwaSaveHwaConfig body: SaveHwaConfig (required)
        :return: MediaEncodingSettingsApiHwaSaveHwaConfigResult
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_encoding_hwaconfigsave" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_encoding_hwaconfigsave`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json', 'application/xml'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json', 'application/xml'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Encoding/HwaConfigSave', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='MediaEncodingSettingsApiHwaSaveHwaConfigResult',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_encoding_hwanodeoptions(self, body, node_id, editor_type, **kwargs):  # noqa: E501
        """Stores an options form for a graph node  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwanodeoptions(body, node_id, editor_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str node_id: Id of the node (required)
        :param MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editor_type: Which of the node's forms was edited (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_encoding_hwanodeoptions_with_http_info(body, node_id, editor_type, **kwargs)  # noqa: E501
        else:
            (data) = self.post_encoding_hwanodeoptions_with_http_info(body, node_id, editor_type, **kwargs)  # noqa: E501
            return data

    def post_encoding_hwanodeoptions_with_http_info(self, body, node_id, editor_type, **kwargs):  # noqa: E501
        """Stores an options form for a graph node  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwanodeoptions_with_http_info(body, node_id, editor_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str node_id: Id of the node (required)
        :param MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editor_type: Which of the node's forms was edited (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'node_id', 'editor_type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_encoding_hwanodeoptions" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_encoding_hwanodeoptions`")  # noqa: E501
        # verify the required parameter 'node_id' is set
        if ('node_id' not in params or
                params['node_id'] is None):
            raise ValueError("Missing the required parameter `node_id` when calling `post_encoding_hwanodeoptions`")  # noqa: E501
        # verify the required parameter 'editor_type' is set
        if ('editor_type' not in params or
                params['editor_type'] is None):
            raise ValueError("Missing the required parameter `editor_type` when calling `post_encoding_hwanodeoptions`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'node_id' in params:
            query_params.append(('NodeId', params['node_id']))  # noqa: E501
        if 'editor_type' in params:
            query_params.append(('EditorType', params['editor_type']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/octet-stream'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Encoding/HwaNodeOptions', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_encoding_hwanodeoptionscancel(self, body, **kwargs):  # noqa: E501
        """Discards an open options form  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwanodeoptionscancel(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param MediaEncodingSettingsApiHwaCancelHwaNodeOptions body: CancelHwaNodeOptions (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_encoding_hwanodeoptionscancel_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_encoding_hwanodeoptionscancel_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_encoding_hwanodeoptionscancel_with_http_info(self, body, **kwargs):  # noqa: E501
        """Discards an open options form  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwanodeoptionscancel_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param MediaEncodingSettingsApiHwaCancelHwaNodeOptions body: CancelHwaNodeOptions (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_encoding_hwanodeoptionscancel" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_encoding_hwanodeoptionscancel`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json', 'application/xml'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Encoding/HwaNodeOptionsCancel', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_encoding_hwanodeoptionscommand(self, body, node_id, editor_type, command_id, **kwargs):  # noqa: E501
        """Runs a postback within an open options form  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwanodeoptionscommand(body, node_id, editor_type, command_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str node_id: Id of the node being edited (required)
        :param MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editor_type: Which of the node's forms is open (required)
        :param str command_id: The postback command (required)
        :param str item_id: The item the command came from
        :param str data: The command's value
        :return: MediaEncodingSettingsHwaEditingNodeOptionsForm
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_encoding_hwanodeoptionscommand_with_http_info(body, node_id, editor_type, command_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_encoding_hwanodeoptionscommand_with_http_info(body, node_id, editor_type, command_id, **kwargs)  # noqa: E501
            return data

    def post_encoding_hwanodeoptionscommand_with_http_info(self, body, node_id, editor_type, command_id, **kwargs):  # noqa: E501
        """Runs a postback within an open options form  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwanodeoptionscommand_with_http_info(body, node_id, editor_type, command_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str node_id: Id of the node being edited (required)
        :param MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editor_type: Which of the node's forms is open (required)
        :param str command_id: The postback command (required)
        :param str item_id: The item the command came from
        :param str data: The command's value
        :return: MediaEncodingSettingsHwaEditingNodeOptionsForm
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'node_id', 'editor_type', 'command_id', 'item_id', 'data']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_encoding_hwanodeoptionscommand" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_encoding_hwanodeoptionscommand`")  # noqa: E501
        # verify the required parameter 'node_id' is set
        if ('node_id' not in params or
                params['node_id'] is None):
            raise ValueError("Missing the required parameter `node_id` when calling `post_encoding_hwanodeoptionscommand`")  # noqa: E501
        # verify the required parameter 'editor_type' is set
        if ('editor_type' not in params or
                params['editor_type'] is None):
            raise ValueError("Missing the required parameter `editor_type` when calling `post_encoding_hwanodeoptionscommand`")  # noqa: E501
        # verify the required parameter 'command_id' is set
        if ('command_id' not in params or
                params['command_id'] is None):
            raise ValueError("Missing the required parameter `command_id` when calling `post_encoding_hwanodeoptionscommand`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'node_id' in params:
            query_params.append(('NodeId', params['node_id']))  # noqa: E501
        if 'editor_type' in params:
            query_params.append(('EditorType', params['editor_type']))  # noqa: E501
        if 'command_id' in params:
            query_params.append(('CommandId', params['command_id']))  # noqa: E501
        if 'item_id' in params:
            query_params.append(('ItemId', params['item_id']))  # noqa: E501
        if 'data' in params:
            query_params.append(('Data', params['data']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json', 'application/xml'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/octet-stream'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Encoding/HwaNodeOptionsCommand', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='MediaEncodingSettingsHwaEditingNodeOptionsForm',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_encoding_hwanodesuboptions(self, body, node_id, editor_type, **kwargs):  # noqa: E501
        """Closes a form opened from within another one  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwanodesuboptions(body, node_id, editor_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str node_id: Id of the node being edited (required)
        :param MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editor_type: Which of the node's forms it was opened from (required)
        :param bool is_accepted: Whether to keep what the form holds
        :return: MediaEncodingSettingsHwaEditingNodeOptionsForm
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_encoding_hwanodesuboptions_with_http_info(body, node_id, editor_type, **kwargs)  # noqa: E501
        else:
            (data) = self.post_encoding_hwanodesuboptions_with_http_info(body, node_id, editor_type, **kwargs)  # noqa: E501
            return data

    def post_encoding_hwanodesuboptions_with_http_info(self, body, node_id, editor_type, **kwargs):  # noqa: E501
        """Closes a form opened from within another one  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_hwanodesuboptions_with_http_info(body, node_id, editor_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str node_id: Id of the node being edited (required)
        :param MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editor_type: Which of the node's forms it was opened from (required)
        :param bool is_accepted: Whether to keep what the form holds
        :return: MediaEncodingSettingsHwaEditingNodeOptionsForm
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'node_id', 'editor_type', 'is_accepted']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_encoding_hwanodesuboptions" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_encoding_hwanodesuboptions`")  # noqa: E501
        # verify the required parameter 'node_id' is set
        if ('node_id' not in params or
                params['node_id'] is None):
            raise ValueError("Missing the required parameter `node_id` when calling `post_encoding_hwanodesuboptions`")  # noqa: E501
        # verify the required parameter 'editor_type' is set
        if ('editor_type' not in params or
                params['editor_type'] is None):
            raise ValueError("Missing the required parameter `editor_type` when calling `post_encoding_hwanodesuboptions`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'node_id' in params:
            query_params.append(('NodeId', params['node_id']))  # noqa: E501
        if 'editor_type' in params:
            query_params.append(('EditorType', params['editor_type']))  # noqa: E501
        if 'is_accepted' in params:
            query_params.append(('IsAccepted', params['is_accepted']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json', 'application/xml'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/octet-stream'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Encoding/HwaNodeSubOptions', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='MediaEncodingSettingsHwaEditingNodeOptionsForm',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
