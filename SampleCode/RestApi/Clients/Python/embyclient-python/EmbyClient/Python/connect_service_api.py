# coding: utf-8

"""
    Emby Server REST API
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from embyclient-python.api_client import ApiClient


class ConnectServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def delete_users_by_id_connect_link(self, id, **kwargs):  # noqa: E501
        """Removes a Connect link for a user  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_users_by_id_connect_link(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_users_by_id_connect_link_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_users_by_id_connect_link_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def delete_users_by_id_connect_link_with_http_info(self, id, **kwargs):  # noqa: E501
        """Removes a Connect link for a user  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_users_by_id_connect_link_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_users_by_id_connect_link" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_users_by_id_connect_link`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{Id}/Connect/Link', 'DELETE',
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

    def get_connect_exchange(self, connect_user_id, **kwargs):  # noqa: E501
        """Gets the corresponding local user from a connect user id  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_connect_exchange(connect_user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str connect_user_id: ConnectUserId (required)
        :return: ConnectConnectAuthenticationExchangeResult
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_connect_exchange_with_http_info(connect_user_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_connect_exchange_with_http_info(connect_user_id, **kwargs)  # noqa: E501
            return data

    def get_connect_exchange_with_http_info(self, connect_user_id, **kwargs):  # noqa: E501
        """Gets the corresponding local user from a connect user id  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_connect_exchange_with_http_info(connect_user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str connect_user_id: ConnectUserId (required)
        :return: ConnectConnectAuthenticationExchangeResult
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['connect_user_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_connect_exchange" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'connect_user_id' is set
        if ('connect_user_id' not in params or
                params['connect_user_id'] is None):
            raise ValueError("Missing the required parameter `connect_user_id` when calling `get_connect_exchange`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'connect_user_id' in params:
            query_params.append(('ConnectUserId', params['connect_user_id']))  # noqa: E501

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
            '/Connect/Exchange', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='ConnectConnectAuthenticationExchangeResult',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_connect_pending(self, **kwargs):  # noqa: E501
        """Creates a Connect link for a user  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_connect_pending(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_connect_pending_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_connect_pending_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_connect_pending_with_http_info(self, **kwargs):  # noqa: E501
        """Creates a Connect link for a user  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_connect_pending_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: None
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
                    " to method get_connect_pending" % key
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
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Connect/Pending', 'GET',
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

    def post_users_by_id_connect_link(self, id, connect_username, **kwargs):  # noqa: E501
        """Creates a Connect link for a user  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_connect_link(id, connect_username, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param str connect_username: Connect username (required)
        :return: ConnectUserLinkResult
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_id_connect_link_with_http_info(id, connect_username, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_id_connect_link_with_http_info(id, connect_username, **kwargs)  # noqa: E501
            return data

    def post_users_by_id_connect_link_with_http_info(self, id, connect_username, **kwargs):  # noqa: E501
        """Creates a Connect link for a user  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_connect_link_with_http_info(id, connect_username, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param str connect_username: Connect username (required)
        :return: ConnectUserLinkResult
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'connect_username']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_users_by_id_connect_link" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_id_connect_link`")  # noqa: E501
        # verify the required parameter 'connect_username' is set
        if ('connect_username' not in params or
                params['connect_username'] is None):
            raise ValueError("Missing the required parameter `connect_username` when calling `post_users_by_id_connect_link`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'connect_username' in params:
            query_params.append(('ConnectUsername', params['connect_username']))  # noqa: E501

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
            '/Users/{Id}/Connect/Link', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='ConnectUserLinkResult',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_users_by_id_connect_link_delete(self, id, **kwargs):  # noqa: E501
        """Removes a Connect link for a user  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_connect_link_delete(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_id_connect_link_delete_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_id_connect_link_delete_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def post_users_by_id_connect_link_delete_with_http_info(self, id, **kwargs):  # noqa: E501
        """Removes a Connect link for a user  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_connect_link_delete_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_users_by_id_connect_link_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_id_connect_link_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{Id}/Connect/Link/Delete', 'POST',
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
