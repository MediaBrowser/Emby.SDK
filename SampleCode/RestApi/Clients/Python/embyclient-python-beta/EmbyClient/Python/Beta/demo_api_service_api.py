# coding: utf-8

"""
    Emby Server REST API (BETA)

    API version: 4.8.0.3
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from embyclient-python-beta.api_client import ApiClient


class DemoApiServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_genericeditdemo_demo(self, demo_set, demo_type, **kwargs):  # noqa: E501
        """Gets GenericEdit demo data  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_genericeditdemo_demo(demo_set, demo_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int demo_set: Set of demos (required)
        :param int demo_type: Type of demo object (required)
        :return: EmbyWebGenericEditEditObjectContainer
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_genericeditdemo_demo_with_http_info(demo_set, demo_type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_genericeditdemo_demo_with_http_info(demo_set, demo_type, **kwargs)  # noqa: E501
            return data

    def get_genericeditdemo_demo_with_http_info(self, demo_set, demo_type, **kwargs):  # noqa: E501
        """Gets GenericEdit demo data  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_genericeditdemo_demo_with_http_info(demo_set, demo_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int demo_set: Set of demos (required)
        :param int demo_type: Type of demo object (required)
        :return: EmbyWebGenericEditEditObjectContainer
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['demo_set', 'demo_type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_genericeditdemo_demo" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'demo_set' is set
        if ('demo_set' not in params or
                params['demo_set'] is None):
            raise ValueError("Missing the required parameter `demo_set` when calling `get_genericeditdemo_demo`")  # noqa: E501
        # verify the required parameter 'demo_type' is set
        if ('demo_type' not in params or
                params['demo_type'] is None):
            raise ValueError("Missing the required parameter `demo_type` when calling `get_genericeditdemo_demo`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'demo_set' in params:
            query_params.append(('DemoSet', params['demo_set']))  # noqa: E501
        if 'demo_type' in params:
            query_params.append(('DemoType', params['demo_type']))  # noqa: E501

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
            '/GenericEditDemo/Demo', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='EmbyWebGenericEditEditObjectContainer',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_genericeditdemo_demotypes(self, demo_set, **kwargs):  # noqa: E501
        """Gets a list of demos  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_genericeditdemo_demotypes(demo_set, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int demo_set: Set of demos (required)
        :return: list[EmbyPluginGenericEditDemoDataDemoTypeInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_genericeditdemo_demotypes_with_http_info(demo_set, **kwargs)  # noqa: E501
        else:
            (data) = self.get_genericeditdemo_demotypes_with_http_info(demo_set, **kwargs)  # noqa: E501
            return data

    def get_genericeditdemo_demotypes_with_http_info(self, demo_set, **kwargs):  # noqa: E501
        """Gets a list of demos  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_genericeditdemo_demotypes_with_http_info(demo_set, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int demo_set: Set of demos (required)
        :return: list[EmbyPluginGenericEditDemoDataDemoTypeInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['demo_set']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_genericeditdemo_demotypes" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'demo_set' is set
        if ('demo_set' not in params or
                params['demo_set'] is None):
            raise ValueError("Missing the required parameter `demo_set` when calling `get_genericeditdemo_demotypes`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'demo_set' in params:
            query_params.append(('DemoSet', params['demo_set']))  # noqa: E501

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
            '/GenericEditDemo/DemoTypes', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[EmbyPluginGenericEditDemoDataDemoTypeInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_genericeditdemo_demo(self, body, demo_set, demo_type, **kwargs):  # noqa: E501
        """Updates GenericEdit demo data  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_genericeditdemo_demo(body, demo_set, demo_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param int demo_set: Set of demos (required)
        :param int demo_type: Type of demo object (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_genericeditdemo_demo_with_http_info(body, demo_set, demo_type, **kwargs)  # noqa: E501
        else:
            (data) = self.post_genericeditdemo_demo_with_http_info(body, demo_set, demo_type, **kwargs)  # noqa: E501
            return data

    def post_genericeditdemo_demo_with_http_info(self, body, demo_set, demo_type, **kwargs):  # noqa: E501
        """Updates GenericEdit demo data  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_genericeditdemo_demo_with_http_info(body, demo_set, demo_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param int demo_set: Set of demos (required)
        :param int demo_type: Type of demo object (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'demo_set', 'demo_type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_genericeditdemo_demo" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_genericeditdemo_demo`")  # noqa: E501
        # verify the required parameter 'demo_set' is set
        if ('demo_set' not in params or
                params['demo_set'] is None):
            raise ValueError("Missing the required parameter `demo_set` when calling `post_genericeditdemo_demo`")  # noqa: E501
        # verify the required parameter 'demo_type' is set
        if ('demo_type' not in params or
                params['demo_type'] is None):
            raise ValueError("Missing the required parameter `demo_type` when calling `post_genericeditdemo_demo`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'demo_set' in params:
            query_params.append(('DemoSet', params['demo_set']))  # noqa: E501
        if 'demo_type' in params:
            query_params.append(('DemoType', params['demo_type']))  # noqa: E501

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
            '/GenericEditDemo/Demo', 'POST',
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
