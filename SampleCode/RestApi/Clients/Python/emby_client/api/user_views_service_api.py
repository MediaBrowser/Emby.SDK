# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class UserViewsServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_users_by_userid_views(self, user_id, include_external_content, **kwargs):  # noqa: E501
        """get_users_by_userid_views  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_by_userid_views(user_id, include_external_content, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param bool include_external_content: Whether or not to include external views such as channels or live tv (required)
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_users_by_userid_views_with_http_info(user_id, include_external_content, **kwargs)  # noqa: E501
        else:
            (data) = self.get_users_by_userid_views_with_http_info(user_id, include_external_content, **kwargs)  # noqa: E501
            return data

    def get_users_by_userid_views_with_http_info(self, user_id, include_external_content, **kwargs):  # noqa: E501
        """get_users_by_userid_views  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_by_userid_views_with_http_info(user_id, include_external_content, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param bool include_external_content: Whether or not to include external views such as channels or live tv (required)
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['user_id', 'include_external_content']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_users_by_userid_views" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `get_users_by_userid_views`")  # noqa: E501
        # verify the required parameter 'include_external_content' is set
        if ('include_external_content' not in params or
                params['include_external_content'] is None):
            raise ValueError("Missing the required parameter `include_external_content` when calling `get_users_by_userid_views`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501

        query_params = []
        if 'include_external_content' in params:
            query_params.append(('IncludeExternalContent', params['include_external_content']))  # noqa: E501

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
            '/Users/{UserId}/Views', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultBaseItemDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
