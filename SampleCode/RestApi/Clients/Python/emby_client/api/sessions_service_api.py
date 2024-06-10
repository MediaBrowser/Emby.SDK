# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class SessionsServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def delete_auth_keys_by_key(self, key, **kwargs):  # noqa: E501
        """delete_auth_keys_by_key  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_auth_keys_by_key(key, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str key: Auth Key (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_auth_keys_by_key_with_http_info(key, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_auth_keys_by_key_with_http_info(key, **kwargs)  # noqa: E501
            return data

    def delete_auth_keys_by_key_with_http_info(self, key, **kwargs):  # noqa: E501
        """delete_auth_keys_by_key  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_auth_keys_by_key_with_http_info(key, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str key: Auth Key (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['key']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_auth_keys_by_key" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'key' is set
        if ('key' not in params or
                params['key'] is None):
            raise ValueError("Missing the required parameter `key` when calling `delete_auth_keys_by_key`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'key' in params:
            path_params['Key'] = params['key']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Auth/Keys/{Key}', 'DELETE',
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

    def delete_sessions_by_id_users_by_userid(self, id, user_id, **kwargs):  # noqa: E501
        """Removes an additional user from a session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_sessions_by_id_users_by_userid(id, user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str user_id: UserId Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_sessions_by_id_users_by_userid_with_http_info(id, user_id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_sessions_by_id_users_by_userid_with_http_info(id, user_id, **kwargs)  # noqa: E501
            return data

    def delete_sessions_by_id_users_by_userid_with_http_info(self, id, user_id, **kwargs):  # noqa: E501
        """Removes an additional user from a session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_sessions_by_id_users_by_userid_with_http_info(id, user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str user_id: UserId Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'user_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_sessions_by_id_users_by_userid" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_sessions_by_id_users_by_userid`")  # noqa: E501
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `delete_sessions_by_id_users_by_userid`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Sessions/{Id}/Users/{UserId}', 'DELETE',
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

    def get_auth_keys(self, **kwargs):  # noqa: E501
        """get_auth_keys  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_auth_keys(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_auth_keys_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_auth_keys_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_auth_keys_with_http_info(self, **kwargs):  # noqa: E501
        """get_auth_keys  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_auth_keys_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['start_index', 'limit']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_auth_keys" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Auth/Keys', 'GET',
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

    def get_auth_providers(self, **kwargs):  # noqa: E501
        """get_auth_providers  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_auth_providers(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[NameIdPair]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_auth_providers_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_auth_providers_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_auth_providers_with_http_info(self, **kwargs):  # noqa: E501
        """get_auth_providers  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_auth_providers_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[NameIdPair]
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
                    " to method get_auth_providers" % key
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
            '/Auth/Providers', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[NameIdPair]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_sessions(self, **kwargs):  # noqa: E501
        """Gets a list of sessions  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sessions(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str controllable_by_user_id: Optional. Filter by sessions that a given user is allowed to remote control.
        :param str device_id: Optional. Filter by device id.
        :param str id: Optional. Filter by session id.
        :return: list[SessionSessionInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_sessions_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_sessions_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_sessions_with_http_info(self, **kwargs):  # noqa: E501
        """Gets a list of sessions  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sessions_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str controllable_by_user_id: Optional. Filter by sessions that a given user is allowed to remote control.
        :param str device_id: Optional. Filter by device id.
        :param str id: Optional. Filter by session id.
        :return: list[SessionSessionInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['controllable_by_user_id', 'device_id', 'id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_sessions" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'controllable_by_user_id' in params:
            query_params.append(('ControllableByUserId', params['controllable_by_user_id']))  # noqa: E501
        if 'device_id' in params:
            query_params.append(('DeviceId', params['device_id']))  # noqa: E501
        if 'id' in params:
            query_params.append(('Id', params['id']))  # noqa: E501

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
            '/Sessions', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[SessionSessionInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_sessions_playqueue(self, **kwargs):  # noqa: E501
        """Gets a the current play queue from a session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sessions_playqueue(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Optional. Filter by session id.
        :param str device_id: Optional. Filter by device id.
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_sessions_playqueue_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_sessions_playqueue_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_sessions_playqueue_with_http_info(self, **kwargs):  # noqa: E501
        """Gets a the current play queue from a session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sessions_playqueue_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Optional. Filter by session id.
        :param str device_id: Optional. Filter by device id.
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'device_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_sessions_playqueue" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'id' in params:
            query_params.append(('Id', params['id']))  # noqa: E501
        if 'device_id' in params:
            query_params.append(('DeviceId', params['device_id']))  # noqa: E501

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
            '/Sessions/PlayQueue', 'GET',
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

    def post_auth_keys(self, app, **kwargs):  # noqa: E501
        """post_auth_keys  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_auth_keys(app, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str app: App (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_auth_keys_with_http_info(app, **kwargs)  # noqa: E501
        else:
            (data) = self.post_auth_keys_with_http_info(app, **kwargs)  # noqa: E501
            return data

    def post_auth_keys_with_http_info(self, app, **kwargs):  # noqa: E501
        """post_auth_keys  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_auth_keys_with_http_info(app, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str app: App (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['app']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_auth_keys" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'app' is set
        if ('app' not in params or
                params['app'] is None):
            raise ValueError("Missing the required parameter `app` when calling `post_auth_keys`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'app' in params:
            query_params.append(('App', params['app']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Auth/Keys', 'POST',
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

    def post_auth_keys_by_key_delete(self, key, **kwargs):  # noqa: E501
        """post_auth_keys_by_key_delete  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_auth_keys_by_key_delete(key, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str key: Auth Key (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_auth_keys_by_key_delete_with_http_info(key, **kwargs)  # noqa: E501
        else:
            (data) = self.post_auth_keys_by_key_delete_with_http_info(key, **kwargs)  # noqa: E501
            return data

    def post_auth_keys_by_key_delete_with_http_info(self, key, **kwargs):  # noqa: E501
        """post_auth_keys_by_key_delete  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_auth_keys_by_key_delete_with_http_info(key, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str key: Auth Key (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['key']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_auth_keys_by_key_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'key' is set
        if ('key' not in params or
                params['key'] is None):
            raise ValueError("Missing the required parameter `key` when calling `post_auth_keys_by_key_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'key' in params:
            path_params['Key'] = params['key']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Auth/Keys/{Key}/Delete', 'POST',
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

    def post_sessions_by_id_command(self, body, id, **kwargs):  # noqa: E501
        """Issues a system command to a client  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_command(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param GeneralCommand body: GeneralCommand:  (required)
        :param str id: Session Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_by_id_command_with_http_info(body, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_by_id_command_with_http_info(body, id, **kwargs)  # noqa: E501
            return data

    def post_sessions_by_id_command_with_http_info(self, body, id, **kwargs):  # noqa: E501
        """Issues a system command to a client  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_command_with_http_info(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param GeneralCommand body: GeneralCommand:  (required)
        :param str id: Session Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sessions_by_id_command" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_sessions_by_id_command`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sessions_by_id_command`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

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
            '/Sessions/{Id}/Command', 'POST',
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

    def post_sessions_by_id_command_by_command(self, id, command, **kwargs):  # noqa: E501
        """Issues a system command to a client  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_command_by_command(id, command, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str command: The command to send. (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_by_id_command_by_command_with_http_info(id, command, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_by_id_command_by_command_with_http_info(id, command, **kwargs)  # noqa: E501
            return data

    def post_sessions_by_id_command_by_command_with_http_info(self, id, command, **kwargs):  # noqa: E501
        """Issues a system command to a client  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_command_by_command_with_http_info(id, command, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str command: The command to send. (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'command']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sessions_by_id_command_by_command" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sessions_by_id_command_by_command`")  # noqa: E501
        # verify the required parameter 'command' is set
        if ('command' not in params or
                params['command'] is None):
            raise ValueError("Missing the required parameter `command` when calling `post_sessions_by_id_command_by_command`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'command' in params:
            path_params['Command'] = params['command']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Sessions/{Id}/Command/{Command}', 'POST',
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

    def post_sessions_by_id_message(self, id, text, header, **kwargs):  # noqa: E501
        """Issues a command to a client to display a message to the user  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_message(id, text, header, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str text: The message text. (required)
        :param str header: The message header. (required)
        :param int timeout_ms: The message timeout. If omitted the user will have to confirm viewing the message.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_by_id_message_with_http_info(id, text, header, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_by_id_message_with_http_info(id, text, header, **kwargs)  # noqa: E501
            return data

    def post_sessions_by_id_message_with_http_info(self, id, text, header, **kwargs):  # noqa: E501
        """Issues a command to a client to display a message to the user  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_message_with_http_info(id, text, header, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str text: The message text. (required)
        :param str header: The message header. (required)
        :param int timeout_ms: The message timeout. If omitted the user will have to confirm viewing the message.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'text', 'header', 'timeout_ms']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sessions_by_id_message" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sessions_by_id_message`")  # noqa: E501
        # verify the required parameter 'text' is set
        if ('text' not in params or
                params['text'] is None):
            raise ValueError("Missing the required parameter `text` when calling `post_sessions_by_id_message`")  # noqa: E501
        # verify the required parameter 'header' is set
        if ('header' not in params or
                params['header'] is None):
            raise ValueError("Missing the required parameter `header` when calling `post_sessions_by_id_message`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'text' in params:
            query_params.append(('Text', params['text']))  # noqa: E501
        if 'header' in params:
            query_params.append(('Header', params['header']))  # noqa: E501
        if 'timeout_ms' in params:
            query_params.append(('TimeoutMs', params['timeout_ms']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Sessions/{Id}/Message', 'POST',
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

    def post_sessions_by_id_playing(self, body, item_ids, play_command, id, **kwargs):  # noqa: E501
        """Instructs a session to play an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_playing(body, item_ids, play_command, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param PlayRequest body: PlayRequest:  (required)
        :param list[int] item_ids: The ids of the items to play, comma delimited (required)
        :param PlayCommand play_command: The type of play command to issue (PlayNow, PlayNext, PlayLast). Clients who have not yet implemented play next and play last may play now. (required)
        :param str id: Session Id (required)
        :param int start_position_ticks: The starting position of the first item.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_by_id_playing_with_http_info(body, item_ids, play_command, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_by_id_playing_with_http_info(body, item_ids, play_command, id, **kwargs)  # noqa: E501
            return data

    def post_sessions_by_id_playing_with_http_info(self, body, item_ids, play_command, id, **kwargs):  # noqa: E501
        """Instructs a session to play an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_playing_with_http_info(body, item_ids, play_command, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param PlayRequest body: PlayRequest:  (required)
        :param list[int] item_ids: The ids of the items to play, comma delimited (required)
        :param PlayCommand play_command: The type of play command to issue (PlayNow, PlayNext, PlayLast). Clients who have not yet implemented play next and play last may play now. (required)
        :param str id: Session Id (required)
        :param int start_position_ticks: The starting position of the first item.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'item_ids', 'play_command', 'id', 'start_position_ticks']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sessions_by_id_playing" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_sessions_by_id_playing`")  # noqa: E501
        # verify the required parameter 'item_ids' is set
        if ('item_ids' not in params or
                params['item_ids'] is None):
            raise ValueError("Missing the required parameter `item_ids` when calling `post_sessions_by_id_playing`")  # noqa: E501
        # verify the required parameter 'play_command' is set
        if ('play_command' not in params or
                params['play_command'] is None):
            raise ValueError("Missing the required parameter `play_command` when calling `post_sessions_by_id_playing`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sessions_by_id_playing`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'item_ids' in params:
            query_params.append(('ItemIds', params['item_ids']))  # noqa: E501
            collection_formats['ItemIds'] = 'multi'  # noqa: E501
        if 'start_position_ticks' in params:
            query_params.append(('StartPositionTicks', params['start_position_ticks']))  # noqa: E501
        if 'play_command' in params:
            query_params.append(('PlayCommand', params['play_command']))  # noqa: E501

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
            '/Sessions/{Id}/Playing', 'POST',
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

    def post_sessions_by_id_playing_by_command(self, body, id, command, **kwargs):  # noqa: E501
        """Issues a playstate command to a client  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_playing_by_command(body, id, command, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param PlaystateRequest body: PlaystateRequest:  (required)
        :param str id: Session Id (required)
        :param PlaystateCommand command: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_by_id_playing_by_command_with_http_info(body, id, command, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_by_id_playing_by_command_with_http_info(body, id, command, **kwargs)  # noqa: E501
            return data

    def post_sessions_by_id_playing_by_command_with_http_info(self, body, id, command, **kwargs):  # noqa: E501
        """Issues a playstate command to a client  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_playing_by_command_with_http_info(body, id, command, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param PlaystateRequest body: PlaystateRequest:  (required)
        :param str id: Session Id (required)
        :param PlaystateCommand command: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'id', 'command']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sessions_by_id_playing_by_command" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_sessions_by_id_playing_by_command`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sessions_by_id_playing_by_command`")  # noqa: E501
        # verify the required parameter 'command' is set
        if ('command' not in params or
                params['command'] is None):
            raise ValueError("Missing the required parameter `command` when calling `post_sessions_by_id_playing_by_command`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'command' in params:
            path_params['Command'] = params['command']  # noqa: E501

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
            '/Sessions/{Id}/Playing/{Command}', 'POST',
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

    def post_sessions_by_id_system_by_command(self, id, command, **kwargs):  # noqa: E501
        """Issues a system command to a client  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_system_by_command(id, command, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str command: The command to send. (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_by_id_system_by_command_with_http_info(id, command, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_by_id_system_by_command_with_http_info(id, command, **kwargs)  # noqa: E501
            return data

    def post_sessions_by_id_system_by_command_with_http_info(self, id, command, **kwargs):  # noqa: E501
        """Issues a system command to a client  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_system_by_command_with_http_info(id, command, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str command: The command to send. (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'command']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sessions_by_id_system_by_command" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sessions_by_id_system_by_command`")  # noqa: E501
        # verify the required parameter 'command' is set
        if ('command' not in params or
                params['command'] is None):
            raise ValueError("Missing the required parameter `command` when calling `post_sessions_by_id_system_by_command`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'command' in params:
            path_params['Command'] = params['command']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Sessions/{Id}/System/{Command}', 'POST',
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

    def post_sessions_by_id_users_by_userid(self, id, user_id, **kwargs):  # noqa: E501
        """Adds an additional user to a session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_users_by_userid(id, user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str user_id: UserId Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_by_id_users_by_userid_with_http_info(id, user_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_by_id_users_by_userid_with_http_info(id, user_id, **kwargs)  # noqa: E501
            return data

    def post_sessions_by_id_users_by_userid_with_http_info(self, id, user_id, **kwargs):  # noqa: E501
        """Adds an additional user to a session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_users_by_userid_with_http_info(id, user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str user_id: UserId Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'user_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sessions_by_id_users_by_userid" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sessions_by_id_users_by_userid`")  # noqa: E501
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `post_sessions_by_id_users_by_userid`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Sessions/{Id}/Users/{UserId}', 'POST',
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

    def post_sessions_by_id_users_by_userid_delete(self, id, user_id, **kwargs):  # noqa: E501
        """Removes an additional user from a session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_users_by_userid_delete(id, user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str user_id: UserId Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_by_id_users_by_userid_delete_with_http_info(id, user_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_by_id_users_by_userid_delete_with_http_info(id, user_id, **kwargs)  # noqa: E501
            return data

    def post_sessions_by_id_users_by_userid_delete_with_http_info(self, id, user_id, **kwargs):  # noqa: E501
        """Removes an additional user from a session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_users_by_userid_delete_with_http_info(id, user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str user_id: UserId Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'user_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sessions_by_id_users_by_userid_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sessions_by_id_users_by_userid_delete`")  # noqa: E501
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `post_sessions_by_id_users_by_userid_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Sessions/{Id}/Users/{UserId}/Delete', 'POST',
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

    def post_sessions_by_id_viewing(self, id, item_type, item_id, item_name, **kwargs):  # noqa: E501
        """Instructs a session to browse to an item or view  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_viewing(id, item_type, item_id, item_name, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str item_type: The type of item to browse to. (required)
        :param str item_id: The Id of the item. (required)
        :param str item_name: The name of the item. (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_by_id_viewing_with_http_info(id, item_type, item_id, item_name, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_by_id_viewing_with_http_info(id, item_type, item_id, item_name, **kwargs)  # noqa: E501
            return data

    def post_sessions_by_id_viewing_with_http_info(self, id, item_type, item_id, item_name, **kwargs):  # noqa: E501
        """Instructs a session to browse to an item or view  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_by_id_viewing_with_http_info(id, item_type, item_id, item_name, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str item_type: The type of item to browse to. (required)
        :param str item_id: The Id of the item. (required)
        :param str item_name: The name of the item. (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'item_type', 'item_id', 'item_name']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sessions_by_id_viewing" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sessions_by_id_viewing`")  # noqa: E501
        # verify the required parameter 'item_type' is set
        if ('item_type' not in params or
                params['item_type'] is None):
            raise ValueError("Missing the required parameter `item_type` when calling `post_sessions_by_id_viewing`")  # noqa: E501
        # verify the required parameter 'item_id' is set
        if ('item_id' not in params or
                params['item_id'] is None):
            raise ValueError("Missing the required parameter `item_id` when calling `post_sessions_by_id_viewing`")  # noqa: E501
        # verify the required parameter 'item_name' is set
        if ('item_name' not in params or
                params['item_name'] is None):
            raise ValueError("Missing the required parameter `item_name` when calling `post_sessions_by_id_viewing`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'item_type' in params:
            query_params.append(('ItemType', params['item_type']))  # noqa: E501
        if 'item_id' in params:
            query_params.append(('ItemId', params['item_id']))  # noqa: E501
        if 'item_name' in params:
            query_params.append(('ItemName', params['item_name']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Sessions/{Id}/Viewing', 'POST',
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

    def post_sessions_capabilities(self, id, **kwargs):  # noqa: E501
        """Updates capabilities for a device  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_capabilities(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str playable_media_types: A list of playable media types, comma delimited. Audio, Video, Book, Game, Photo.
        :param str supported_commands: A list of supported remote control commands, comma delimited
        :param bool supports_media_control: Determines whether media can be played remotely.
        :param bool supports_sync: Determines whether sync is supported.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_capabilities_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_capabilities_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def post_sessions_capabilities_with_http_info(self, id, **kwargs):  # noqa: E501
        """Updates capabilities for a device  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_capabilities_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Session Id (required)
        :param str playable_media_types: A list of playable media types, comma delimited. Audio, Video, Book, Game, Photo.
        :param str supported_commands: A list of supported remote control commands, comma delimited
        :param bool supports_media_control: Determines whether media can be played remotely.
        :param bool supports_sync: Determines whether sync is supported.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'playable_media_types', 'supported_commands', 'supports_media_control', 'supports_sync']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sessions_capabilities" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sessions_capabilities`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'id' in params:
            query_params.append(('Id', params['id']))  # noqa: E501
        if 'playable_media_types' in params:
            query_params.append(('PlayableMediaTypes', params['playable_media_types']))  # noqa: E501
        if 'supported_commands' in params:
            query_params.append(('SupportedCommands', params['supported_commands']))  # noqa: E501
        if 'supports_media_control' in params:
            query_params.append(('SupportsMediaControl', params['supports_media_control']))  # noqa: E501
        if 'supports_sync' in params:
            query_params.append(('SupportsSync', params['supports_sync']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Sessions/Capabilities', 'POST',
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

    def post_sessions_capabilities_full(self, body, id, **kwargs):  # noqa: E501
        """Updates capabilities for a device  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_capabilities_full(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ClientCapabilities body: ClientCapabilities:  (required)
        :param str id: Session Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_capabilities_full_with_http_info(body, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_capabilities_full_with_http_info(body, id, **kwargs)  # noqa: E501
            return data

    def post_sessions_capabilities_full_with_http_info(self, body, id, **kwargs):  # noqa: E501
        """Updates capabilities for a device  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_capabilities_full_with_http_info(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ClientCapabilities body: ClientCapabilities:  (required)
        :param str id: Session Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sessions_capabilities_full" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_sessions_capabilities_full`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sessions_capabilities_full`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'id' in params:
            query_params.append(('Id', params['id']))  # noqa: E501

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
            '/Sessions/Capabilities/Full', 'POST',
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

    def post_sessions_logout(self, **kwargs):  # noqa: E501
        """Reports that a session has ended  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_logout(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_logout_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_logout_with_http_info(**kwargs)  # noqa: E501
            return data

    def post_sessions_logout_with_http_info(self, **kwargs):  # noqa: E501
        """Reports that a session has ended  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_logout_with_http_info(async_req=True)
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
                    " to method post_sessions_logout" % key
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
            '/Sessions/Logout', 'POST',
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
