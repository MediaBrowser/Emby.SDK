# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class GenericUIApiServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_ui_view(self, page_id, client_locale, **kwargs):  # noqa: E501
        """Gets UI view data  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_ui_view(page_id, client_locale, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str page_id: Id of the page controller (required)
        :param str client_locale: Locale identifier of the client (required)
        :return: UIViewInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_ui_view_with_http_info(page_id, client_locale, **kwargs)  # noqa: E501
        else:
            (data) = self.get_ui_view_with_http_info(page_id, client_locale, **kwargs)  # noqa: E501
            return data

    def get_ui_view_with_http_info(self, page_id, client_locale, **kwargs):  # noqa: E501
        """Gets UI view data  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_ui_view_with_http_info(page_id, client_locale, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str page_id: Id of the page controller (required)
        :param str client_locale: Locale identifier of the client (required)
        :return: UIViewInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['page_id', 'client_locale']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_ui_view" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'page_id' is set
        if ('page_id' not in params or
                params['page_id'] is None):
            raise ValueError("Missing the required parameter `page_id` when calling `get_ui_view`")  # noqa: E501
        # verify the required parameter 'client_locale' is set
        if ('client_locale' not in params or
                params['client_locale'] is None):
            raise ValueError("Missing the required parameter `client_locale` when calling `get_ui_view`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'page_id' in params:
            query_params.append(('PageId', params['page_id']))  # noqa: E501
        if 'client_locale' in params:
            query_params.append(('ClientLocale', params['client_locale']))  # noqa: E501

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
            '/UI/View', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='UIViewInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_ui_command(self, body, **kwargs):  # noqa: E501
        """Execute a command in the context of tv setup  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_ui_command(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RunUICommand body: RunUICommand (required)
        :return: UIViewInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_ui_command_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_ui_command_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_ui_command_with_http_info(self, body, **kwargs):  # noqa: E501
        """Execute a command in the context of tv setup  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_ui_command_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RunUICommand body: RunUICommand (required)
        :return: UIViewInfo
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
                    " to method post_ui_command" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_ui_command`")  # noqa: E501

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
            '/UI/Command', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='UIViewInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
