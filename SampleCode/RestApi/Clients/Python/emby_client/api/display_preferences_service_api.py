# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class DisplayPreferencesServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_displaypreferences_by_id(self, id, user_id, client, **kwargs):  # noqa: E501
        """Gets a user's display preferences for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_displaypreferences_by_id(id, user_id, client, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str user_id: User Id (required)
        :param str client: Client (required)
        :return: DisplayPreferences
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_displaypreferences_by_id_with_http_info(id, user_id, client, **kwargs)  # noqa: E501
        else:
            (data) = self.get_displaypreferences_by_id_with_http_info(id, user_id, client, **kwargs)  # noqa: E501
            return data

    def get_displaypreferences_by_id_with_http_info(self, id, user_id, client, **kwargs):  # noqa: E501
        """Gets a user's display preferences for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_displaypreferences_by_id_with_http_info(id, user_id, client, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str user_id: User Id (required)
        :param str client: Client (required)
        :return: DisplayPreferences
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'user_id', 'client']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_displaypreferences_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_displaypreferences_by_id`")  # noqa: E501
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `get_displaypreferences_by_id`")  # noqa: E501
        # verify the required parameter 'client' is set
        if ('client' not in params or
                params['client'] is None):
            raise ValueError("Missing the required parameter `client` when calling `get_displaypreferences_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'client' in params:
            query_params.append(('Client', params['client']))  # noqa: E501

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
            '/DisplayPreferences/{Id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='DisplayPreferences',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_usersettings_by_userid(self, user_id, **kwargs):  # noqa: E501
        """Gets user settings  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_usersettings_by_userid(user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :return: dict(str, str)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_usersettings_by_userid_with_http_info(user_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_usersettings_by_userid_with_http_info(user_id, **kwargs)  # noqa: E501
            return data

    def get_usersettings_by_userid_with_http_info(self, user_id, **kwargs):  # noqa: E501
        """Gets user settings  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_usersettings_by_userid_with_http_info(user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :return: dict(str, str)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['user_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_usersettings_by_userid" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `get_usersettings_by_userid`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501

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
            '/UserSettings/{UserId}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='dict(str, str)',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_displaypreferences_by_displaypreferencesid(self, body, user_id, display_preferences_id, **kwargs):  # noqa: E501
        """Updates a user's display preferences for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_displaypreferences_by_displaypreferencesid(body, user_id, display_preferences_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param DisplayPreferences body: DisplayPreferences:  (required)
        :param str user_id: User Id (required)
        :param str display_preferences_id: DisplayPreferences Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_displaypreferences_by_displaypreferencesid_with_http_info(body, user_id, display_preferences_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_displaypreferences_by_displaypreferencesid_with_http_info(body, user_id, display_preferences_id, **kwargs)  # noqa: E501
            return data

    def post_displaypreferences_by_displaypreferencesid_with_http_info(self, body, user_id, display_preferences_id, **kwargs):  # noqa: E501
        """Updates a user's display preferences for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_displaypreferences_by_displaypreferencesid_with_http_info(body, user_id, display_preferences_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param DisplayPreferences body: DisplayPreferences:  (required)
        :param str user_id: User Id (required)
        :param str display_preferences_id: DisplayPreferences Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'user_id', 'display_preferences_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_displaypreferences_by_displaypreferencesid" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_displaypreferences_by_displaypreferencesid`")  # noqa: E501
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `post_displaypreferences_by_displaypreferencesid`")  # noqa: E501
        # verify the required parameter 'display_preferences_id' is set
        if ('display_preferences_id' not in params or
                params['display_preferences_id'] is None):
            raise ValueError("Missing the required parameter `display_preferences_id` when calling `post_displaypreferences_by_displaypreferencesid`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'display_preferences_id' in params:
            path_params['DisplayPreferencesId'] = params['display_preferences_id']  # noqa: E501

        query_params = []
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501

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
            '/DisplayPreferences/{DisplayPreferencesId}', 'POST',
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

    def post_usersettings_by_userid(self, body, user_id, **kwargs):  # noqa: E501
        """Updates a user's display preferences for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_usersettings_by_userid(body, user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param list[str] body: UserSettings:  (required)
        :param str user_id: User Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_usersettings_by_userid_with_http_info(body, user_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_usersettings_by_userid_with_http_info(body, user_id, **kwargs)  # noqa: E501
            return data

    def post_usersettings_by_userid_with_http_info(self, body, user_id, **kwargs):  # noqa: E501
        """Updates a user's display preferences for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_usersettings_by_userid_with_http_info(body, user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param list[str] body: UserSettings:  (required)
        :param str user_id: User Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'user_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_usersettings_by_userid" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_usersettings_by_userid`")  # noqa: E501
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `post_usersettings_by_userid`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501

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
            '/UserSettings/{UserId}', 'POST',
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

    def post_usersettings_by_userid_partial(self, body, user_id, **kwargs):  # noqa: E501
        """Updates a user's display preferences for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_usersettings_by_userid_partial(body, user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str user_id: User Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_usersettings_by_userid_partial_with_http_info(body, user_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_usersettings_by_userid_partial_with_http_info(body, user_id, **kwargs)  # noqa: E501
            return data

    def post_usersettings_by_userid_partial_with_http_info(self, body, user_id, **kwargs):  # noqa: E501
        """Updates a user's display preferences for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_usersettings_by_userid_partial_with_http_info(body, user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str user_id: User Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'user_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_usersettings_by_userid_partial" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_usersettings_by_userid_partial`")  # noqa: E501
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `post_usersettings_by_userid_partial`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501

        query_params = []

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
            '/UserSettings/{UserId}/Partial', 'POST',
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
