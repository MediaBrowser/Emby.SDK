# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class CodecParameterServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_encoding_codecparameters(self, codec_id, parameter_context, **kwargs):  # noqa: E501
        """Gets the parameters for a specified codec.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_encoding_codecparameters(codec_id, parameter_context, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str codec_id: Codec Id (required)
        :param MediaEncodingCodecParameterContext parameter_context: Parameter Context (required)
        :return: EditObjectContainer
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_encoding_codecparameters_with_http_info(codec_id, parameter_context, **kwargs)  # noqa: E501
        else:
            (data) = self.get_encoding_codecparameters_with_http_info(codec_id, parameter_context, **kwargs)  # noqa: E501
            return data

    def get_encoding_codecparameters_with_http_info(self, codec_id, parameter_context, **kwargs):  # noqa: E501
        """Gets the parameters for a specified codec.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_encoding_codecparameters_with_http_info(codec_id, parameter_context, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str codec_id: Codec Id (required)
        :param MediaEncodingCodecParameterContext parameter_context: Parameter Context (required)
        :return: EditObjectContainer
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['codec_id', 'parameter_context']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_encoding_codecparameters" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'codec_id' is set
        if ('codec_id' not in params or
                params['codec_id'] is None):
            raise ValueError("Missing the required parameter `codec_id` when calling `get_encoding_codecparameters`")  # noqa: E501
        # verify the required parameter 'parameter_context' is set
        if ('parameter_context' not in params or
                params['parameter_context'] is None):
            raise ValueError("Missing the required parameter `parameter_context` when calling `get_encoding_codecparameters`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'codec_id' in params:
            query_params.append(('CodecId', params['codec_id']))  # noqa: E501
        if 'parameter_context' in params:
            query_params.append(('ParameterContext', params['parameter_context']))  # noqa: E501

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
            '/Encoding/CodecParameters', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='EditObjectContainer',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_encoding_codecparameters(self, body, codec_id, parameter_context, **kwargs):  # noqa: E501
        """Updates the parameters for a specified codec.  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_codecparameters(body, codec_id, parameter_context, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str codec_id: Codec Id (required)
        :param MediaEncodingCodecParameterContext parameter_context: Parameter Context (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_encoding_codecparameters_with_http_info(body, codec_id, parameter_context, **kwargs)  # noqa: E501
        else:
            (data) = self.post_encoding_codecparameters_with_http_info(body, codec_id, parameter_context, **kwargs)  # noqa: E501
            return data

    def post_encoding_codecparameters_with_http_info(self, body, codec_id, parameter_context, **kwargs):  # noqa: E501
        """Updates the parameters for a specified codec.  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_encoding_codecparameters_with_http_info(body, codec_id, parameter_context, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str codec_id: Codec Id (required)
        :param MediaEncodingCodecParameterContext parameter_context: Parameter Context (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'codec_id', 'parameter_context']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_encoding_codecparameters" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_encoding_codecparameters`")  # noqa: E501
        # verify the required parameter 'codec_id' is set
        if ('codec_id' not in params or
                params['codec_id'] is None):
            raise ValueError("Missing the required parameter `codec_id` when calling `post_encoding_codecparameters`")  # noqa: E501
        # verify the required parameter 'parameter_context' is set
        if ('parameter_context' not in params or
                params['parameter_context'] is None):
            raise ValueError("Missing the required parameter `parameter_context` when calling `post_encoding_codecparameters`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'codec_id' in params:
            query_params.append(('CodecId', params['codec_id']))  # noqa: E501
        if 'parameter_context' in params:
            query_params.append(('ParameterContext', params['parameter_context']))  # noqa: E501

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
            '/Encoding/CodecParameters', 'POST',
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
