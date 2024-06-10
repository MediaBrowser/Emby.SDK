# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class NotificationsServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_notifications_types(self, **kwargs):  # noqa: E501
        """Gets notification types  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_notifications_types(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[NotificationCategoryInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_notifications_types_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_notifications_types_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_notifications_types_with_http_info(self, **kwargs):  # noqa: E501
        """Gets notification types  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_notifications_types_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[NotificationCategoryInfo]
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
                    " to method get_notifications_types" % key
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
            '/Notifications/Types', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[NotificationCategoryInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_notifications_admin(self, name, description, **kwargs):  # noqa: E501
        """Sends a notification to all admin users  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_notifications_admin(name, description, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: The notification's name (required)
        :param str description: The notification's description (required)
        :param str image_url: The notification's image url
        :param str url: The notification's info url
        :param str level: The notification level
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_notifications_admin_with_http_info(name, description, **kwargs)  # noqa: E501
        else:
            (data) = self.post_notifications_admin_with_http_info(name, description, **kwargs)  # noqa: E501
            return data

    def post_notifications_admin_with_http_info(self, name, description, **kwargs):  # noqa: E501
        """Sends a notification to all admin users  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_notifications_admin_with_http_info(name, description, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: The notification's name (required)
        :param str description: The notification's description (required)
        :param str image_url: The notification's image url
        :param str url: The notification's info url
        :param str level: The notification level
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'description', 'image_url', 'url', 'level']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_notifications_admin" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `post_notifications_admin`")  # noqa: E501
        # verify the required parameter 'description' is set
        if ('description' not in params or
                params['description'] is None):
            raise ValueError("Missing the required parameter `description` when calling `post_notifications_admin`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'name' in params:
            query_params.append(('Name', params['name']))  # noqa: E501
        if 'description' in params:
            query_params.append(('Description', params['description']))  # noqa: E501
        if 'image_url' in params:
            query_params.append(('ImageUrl', params['image_url']))  # noqa: E501
        if 'url' in params:
            query_params.append(('Url', params['url']))  # noqa: E501
        if 'level' in params:
            query_params.append(('Level', params['level']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Notifications/Admin', 'POST',
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
