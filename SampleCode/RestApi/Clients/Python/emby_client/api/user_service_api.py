# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class UserServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def delete_users_by_id(self, id, **kwargs):  # noqa: E501
        """Deletes a user  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_users_by_id(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_users_by_id_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_users_by_id_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def delete_users_by_id_with_http_info(self, id, **kwargs):  # noqa: E501
        """Deletes a user  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_users_by_id_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
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
                    " to method delete_users_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_users_by_id`")  # noqa: E501

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
            '/Users/{Id}', 'DELETE',
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

    def delete_users_by_id_trackselections_by_tracktype(self, id, track_type, **kwargs):  # noqa: E501
        """Clears audio or subtitle track selections for a user  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_users_by_id_trackselections_by_tracktype(id, track_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str track_type: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_users_by_id_trackselections_by_tracktype_with_http_info(id, track_type, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_users_by_id_trackselections_by_tracktype_with_http_info(id, track_type, **kwargs)  # noqa: E501
            return data

    def delete_users_by_id_trackselections_by_tracktype_with_http_info(self, id, track_type, **kwargs):  # noqa: E501
        """Clears audio or subtitle track selections for a user  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_users_by_id_trackselections_by_tracktype_with_http_info(id, track_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str track_type: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'track_type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_users_by_id_trackselections_by_tracktype" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_users_by_id_trackselections_by_tracktype`")  # noqa: E501
        # verify the required parameter 'track_type' is set
        if ('track_type' not in params or
                params['track_type'] is None):
            raise ValueError("Missing the required parameter `track_type` when calling `delete_users_by_id_trackselections_by_tracktype`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'track_type' in params:
            path_params['TrackType'] = params['track_type']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{Id}/TrackSelections/{TrackType}', 'DELETE',
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

    def get_users_by_id(self, id, **kwargs):  # noqa: E501
        """Gets a user by Id  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_by_id(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :return: UserDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_users_by_id_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_users_by_id_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_users_by_id_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a user by Id  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_by_id_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :return: UserDto
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
                    " to method get_users_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_users_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

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
            '/Users/{Id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='UserDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_users_by_userid_typedsettings_by_key(self, key, user_id, **kwargs):  # noqa: E501
        """Gets a typed user setting  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_by_userid_typedsettings_by_key(key, user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str key: Key (required)
        :param str user_id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_users_by_userid_typedsettings_by_key_with_http_info(key, user_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_users_by_userid_typedsettings_by_key_with_http_info(key, user_id, **kwargs)  # noqa: E501
            return data

    def get_users_by_userid_typedsettings_by_key_with_http_info(self, key, user_id, **kwargs):  # noqa: E501
        """Gets a typed user setting  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_by_userid_typedsettings_by_key_with_http_info(key, user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str key: Key (required)
        :param str user_id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['key', 'user_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_users_by_userid_typedsettings_by_key" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'key' is set
        if ('key' not in params or
                params['key'] is None):
            raise ValueError("Missing the required parameter `key` when calling `get_users_by_userid_typedsettings_by_key`")  # noqa: E501
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `get_users_by_userid_typedsettings_by_key`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'key' in params:
            path_params['Key'] = params['key']  # noqa: E501
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
            '/Users/{UserId}/TypedSettings/{Key}', 'GET',
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

    def get_users_itemaccess(self, **kwargs):  # noqa: E501
        """Gets a list of users  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_itemaccess(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool is_hidden: Optional filter by IsHidden=true or false
        :param bool is_disabled: Optional filter by IsDisabled=true or false
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str sort_order: Sort Order - Ascending,Descending
        :return: QueryResultUserDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_users_itemaccess_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_users_itemaccess_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_users_itemaccess_with_http_info(self, **kwargs):  # noqa: E501
        """Gets a list of users  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_itemaccess_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool is_hidden: Optional filter by IsHidden=true or false
        :param bool is_disabled: Optional filter by IsDisabled=true or false
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str sort_order: Sort Order - Ascending,Descending
        :return: QueryResultUserDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['is_hidden', 'is_disabled', 'start_index', 'limit', 'name_starts_with_or_greater', 'sort_order']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_users_itemaccess" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'is_hidden' in params:
            query_params.append(('IsHidden', params['is_hidden']))  # noqa: E501
        if 'is_disabled' in params:
            query_params.append(('IsDisabled', params['is_disabled']))  # noqa: E501
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'name_starts_with_or_greater' in params:
            query_params.append(('NameStartsWithOrGreater', params['name_starts_with_or_greater']))  # noqa: E501
        if 'sort_order' in params:
            query_params.append(('SortOrder', params['sort_order']))  # noqa: E501

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
            '/Users/ItemAccess', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultUserDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_users_prefixes(self, **kwargs):  # noqa: E501
        """Gets a list of users  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_prefixes(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool is_hidden: Optional filter by IsHidden=true or false
        :param bool is_disabled: Optional filter by IsDisabled=true or false
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str sort_order: Sort Order - Ascending,Descending
        :return: list[NameIdPair]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_users_prefixes_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_users_prefixes_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_users_prefixes_with_http_info(self, **kwargs):  # noqa: E501
        """Gets a list of users  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_prefixes_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool is_hidden: Optional filter by IsHidden=true or false
        :param bool is_disabled: Optional filter by IsDisabled=true or false
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str sort_order: Sort Order - Ascending,Descending
        :return: list[NameIdPair]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['is_hidden', 'is_disabled', 'start_index', 'limit', 'name_starts_with_or_greater', 'sort_order']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_users_prefixes" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'is_hidden' in params:
            query_params.append(('IsHidden', params['is_hidden']))  # noqa: E501
        if 'is_disabled' in params:
            query_params.append(('IsDisabled', params['is_disabled']))  # noqa: E501
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'name_starts_with_or_greater' in params:
            query_params.append(('NameStartsWithOrGreater', params['name_starts_with_or_greater']))  # noqa: E501
        if 'sort_order' in params:
            query_params.append(('SortOrder', params['sort_order']))  # noqa: E501

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
            '/Users/Prefixes', 'GET',
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

    def get_users_public(self, **kwargs):  # noqa: E501
        """Gets a list of publicly visible users for display on a login screen.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_public(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[UserDto]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_users_public_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_users_public_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_users_public_with_http_info(self, **kwargs):  # noqa: E501
        """Gets a list of publicly visible users for display on a login screen.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_public_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[UserDto]
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
                    " to method get_users_public" % key
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
            '/Users/Public', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[UserDto]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_users_query(self, **kwargs):  # noqa: E501
        """Gets a list of users  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_query(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool is_hidden: Optional filter by IsHidden=true or false
        :param bool is_disabled: Optional filter by IsDisabled=true or false
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str sort_order: Sort Order - Ascending,Descending
        :return: QueryResultUserDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_users_query_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_users_query_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_users_query_with_http_info(self, **kwargs):  # noqa: E501
        """Gets a list of users  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_query_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool is_hidden: Optional filter by IsHidden=true or false
        :param bool is_disabled: Optional filter by IsDisabled=true or false
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str sort_order: Sort Order - Ascending,Descending
        :return: QueryResultUserDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['is_hidden', 'is_disabled', 'start_index', 'limit', 'name_starts_with_or_greater', 'sort_order']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_users_query" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'is_hidden' in params:
            query_params.append(('IsHidden', params['is_hidden']))  # noqa: E501
        if 'is_disabled' in params:
            query_params.append(('IsDisabled', params['is_disabled']))  # noqa: E501
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'name_starts_with_or_greater' in params:
            query_params.append(('NameStartsWithOrGreater', params['name_starts_with_or_greater']))  # noqa: E501
        if 'sort_order' in params:
            query_params.append(('SortOrder', params['sort_order']))  # noqa: E501

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
            '/Users/Query', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultUserDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_users_authenticatebyname(self, body, x_emby_authorization, **kwargs):  # noqa: E501
        """Authenticates a user  # noqa: E501

        Authenticate a user by nane and password. A 200 status code indicates success, while anything in the 400 or 500 range indicates failure --- Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_authenticatebyname(body, x_emby_authorization, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param AuthenticateUserByName body: AuthenticateUserByName (required)
        :param str x_emby_authorization: The authorization header can be either named 'Authorization' or 'X-Emby-Authorization'.    It must be of the following schema:     Emby UserId=\"(guid)\", Client=\"(string)\", Device=\"(string)\", DeviceId=\"(string)\", Version=\"string\", Token=\"(string)\"     Please consult the documentation for further details. (required)
        :return: AuthenticationAuthenticationResult
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_authenticatebyname_with_http_info(body, x_emby_authorization, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_authenticatebyname_with_http_info(body, x_emby_authorization, **kwargs)  # noqa: E501
            return data

    def post_users_authenticatebyname_with_http_info(self, body, x_emby_authorization, **kwargs):  # noqa: E501
        """Authenticates a user  # noqa: E501

        Authenticate a user by nane and password. A 200 status code indicates success, while anything in the 400 or 500 range indicates failure --- Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_authenticatebyname_with_http_info(body, x_emby_authorization, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param AuthenticateUserByName body: AuthenticateUserByName (required)
        :param str x_emby_authorization: The authorization header can be either named 'Authorization' or 'X-Emby-Authorization'.    It must be of the following schema:     Emby UserId=\"(guid)\", Client=\"(string)\", Device=\"(string)\", DeviceId=\"(string)\", Version=\"string\", Token=\"(string)\"     Please consult the documentation for further details. (required)
        :return: AuthenticationAuthenticationResult
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'x_emby_authorization']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_users_authenticatebyname" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_users_authenticatebyname`")  # noqa: E501
        # verify the required parameter 'x_emby_authorization' is set
        if ('x_emby_authorization' not in params or
                params['x_emby_authorization'] is None):
            raise ValueError("Missing the required parameter `x_emby_authorization` when calling `post_users_authenticatebyname`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}
        if 'x_emby_authorization' in params:
            header_params['X-Emby-Authorization'] = params['x_emby_authorization']  # noqa: E501

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
            '/Users/AuthenticateByName', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='AuthenticationAuthenticationResult',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_users_by_id(self, body, id, **kwargs):  # noqa: E501
        """Updates a user  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param UserDto body: UserDto:  (required)
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_id_with_http_info(body, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_id_with_http_info(body, id, **kwargs)  # noqa: E501
            return data

    def post_users_by_id_with_http_info(self, body, id, **kwargs):  # noqa: E501
        """Updates a user  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_with_http_info(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param UserDto body: UserDto:  (required)
        :param str id: (required)
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
                    " to method post_users_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_users_by_id`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_id`")  # noqa: E501

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
            '/Users/{Id}', 'POST',
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

    def post_users_by_id_authenticate(self, body, id, **kwargs):  # noqa: E501
        """Authenticates a user  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_authenticate(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param AuthenticateUser body: AuthenticateUser (required)
        :param str id: (required)
        :return: AuthenticationAuthenticationResult
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_id_authenticate_with_http_info(body, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_id_authenticate_with_http_info(body, id, **kwargs)  # noqa: E501
            return data

    def post_users_by_id_authenticate_with_http_info(self, body, id, **kwargs):  # noqa: E501
        """Authenticates a user  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_authenticate_with_http_info(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param AuthenticateUser body: AuthenticateUser (required)
        :param str id: (required)
        :return: AuthenticationAuthenticationResult
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
                    " to method post_users_by_id_authenticate" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_users_by_id_authenticate`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_id_authenticate`")  # noqa: E501

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
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json', 'application/xml'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json', 'application/xml'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{Id}/Authenticate', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='AuthenticationAuthenticationResult',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_users_by_id_configuration(self, body, id, **kwargs):  # noqa: E501
        """Updates a user configuration  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_configuration(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param UserConfiguration body: UserConfiguration:  (required)
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_id_configuration_with_http_info(body, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_id_configuration_with_http_info(body, id, **kwargs)  # noqa: E501
            return data

    def post_users_by_id_configuration_with_http_info(self, body, id, **kwargs):  # noqa: E501
        """Updates a user configuration  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_configuration_with_http_info(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param UserConfiguration body: UserConfiguration:  (required)
        :param str id: (required)
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
                    " to method post_users_by_id_configuration" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_users_by_id_configuration`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_id_configuration`")  # noqa: E501

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
            '/Users/{Id}/Configuration', 'POST',
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

    def post_users_by_id_configuration_partial(self, body, id, **kwargs):  # noqa: E501
        """Updates a user configuration  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_configuration_partial(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_id_configuration_partial_with_http_info(body, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_id_configuration_partial_with_http_info(body, id, **kwargs)  # noqa: E501
            return data

    def post_users_by_id_configuration_partial_with_http_info(self, body, id, **kwargs):  # noqa: E501
        """Updates a user configuration  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_configuration_partial_with_http_info(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str id: (required)
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
                    " to method post_users_by_id_configuration_partial" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_users_by_id_configuration_partial`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_id_configuration_partial`")  # noqa: E501

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
            ['application/octet-stream'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{Id}/Configuration/Partial', 'POST',
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

    def post_users_by_id_delete(self, id, **kwargs):  # noqa: E501
        """Deletes a user  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_delete(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_id_delete_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_id_delete_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def post_users_by_id_delete_with_http_info(self, id, **kwargs):  # noqa: E501
        """Deletes a user  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_delete_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
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
                    " to method post_users_by_id_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_id_delete`")  # noqa: E501

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
            '/Users/{Id}/Delete', 'POST',
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

    def post_users_by_id_password(self, body, id, **kwargs):  # noqa: E501
        """Updates a user's password  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_password(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param UpdateUserPassword body: UpdateUserPassword (required)
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_id_password_with_http_info(body, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_id_password_with_http_info(body, id, **kwargs)  # noqa: E501
            return data

    def post_users_by_id_password_with_http_info(self, body, id, **kwargs):  # noqa: E501
        """Updates a user's password  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_password_with_http_info(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param UpdateUserPassword body: UpdateUserPassword (required)
        :param str id: (required)
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
                    " to method post_users_by_id_password" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_users_by_id_password`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_id_password`")  # noqa: E501

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
            '/Users/{Id}/Password', 'POST',
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

    def post_users_by_id_policy(self, body, id, **kwargs):  # noqa: E501
        """Updates a user policy  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_policy(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param UserPolicy body: UserPolicy:  (required)
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_id_policy_with_http_info(body, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_id_policy_with_http_info(body, id, **kwargs)  # noqa: E501
            return data

    def post_users_by_id_policy_with_http_info(self, body, id, **kwargs):  # noqa: E501
        """Updates a user policy  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_policy_with_http_info(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param UserPolicy body: UserPolicy:  (required)
        :param str id: (required)
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
                    " to method post_users_by_id_policy" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_users_by_id_policy`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_id_policy`")  # noqa: E501

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
            '/Users/{Id}/Policy', 'POST',
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

    def post_users_by_id_trackselections_by_tracktype_delete(self, id, track_type, **kwargs):  # noqa: E501
        """Clears audio or subtitle track selections for a user  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_trackselections_by_tracktype_delete(id, track_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str track_type: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_id_trackselections_by_tracktype_delete_with_http_info(id, track_type, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_id_trackselections_by_tracktype_delete_with_http_info(id, track_type, **kwargs)  # noqa: E501
            return data

    def post_users_by_id_trackselections_by_tracktype_delete_with_http_info(self, id, track_type, **kwargs):  # noqa: E501
        """Clears audio or subtitle track selections for a user  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_trackselections_by_tracktype_delete_with_http_info(id, track_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str track_type: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'track_type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_users_by_id_trackselections_by_tracktype_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_id_trackselections_by_tracktype_delete`")  # noqa: E501
        # verify the required parameter 'track_type' is set
        if ('track_type' not in params or
                params['track_type'] is None):
            raise ValueError("Missing the required parameter `track_type` when calling `post_users_by_id_trackselections_by_tracktype_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'track_type' in params:
            path_params['TrackType'] = params['track_type']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{Id}/TrackSelections/{TrackType}/Delete', 'POST',
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

    def post_users_by_userid_typedsettings_by_key(self, body, user_id, key, **kwargs):  # noqa: E501
        """Updates a typed user setting  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_userid_typedsettings_by_key(body, user_id, key, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str user_id: (required)
        :param str key: Key (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_userid_typedsettings_by_key_with_http_info(body, user_id, key, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_userid_typedsettings_by_key_with_http_info(body, user_id, key, **kwargs)  # noqa: E501
            return data

    def post_users_by_userid_typedsettings_by_key_with_http_info(self, body, user_id, key, **kwargs):  # noqa: E501
        """Updates a typed user setting  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_userid_typedsettings_by_key_with_http_info(body, user_id, key, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str user_id: (required)
        :param str key: Key (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'user_id', 'key']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_users_by_userid_typedsettings_by_key" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_users_by_userid_typedsettings_by_key`")  # noqa: E501
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `post_users_by_userid_typedsettings_by_key`")  # noqa: E501
        # verify the required parameter 'key' is set
        if ('key' not in params or
                params['key'] is None):
            raise ValueError("Missing the required parameter `key` when calling `post_users_by_userid_typedsettings_by_key`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501
        if 'key' in params:
            path_params['Key'] = params['key']  # noqa: E501

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
            '/Users/{UserId}/TypedSettings/{Key}', 'POST',
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

    def post_users_forgotpassword(self, body, **kwargs):  # noqa: E501
        """Initiates the forgot password process for a local user  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_forgotpassword(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ForgotPassword body: ForgotPassword (required)
        :return: ForgotPasswordResult
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_forgotpassword_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_forgotpassword_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_users_forgotpassword_with_http_info(self, body, **kwargs):  # noqa: E501
        """Initiates the forgot password process for a local user  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_forgotpassword_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ForgotPassword body: ForgotPassword (required)
        :return: ForgotPasswordResult
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
                    " to method post_users_forgotpassword" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_users_forgotpassword`")  # noqa: E501

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
            '/Users/ForgotPassword', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='ForgotPasswordResult',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_users_forgotpassword_pin(self, body, **kwargs):  # noqa: E501
        """Redeems a forgot password pin  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_forgotpassword_pin(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ForgotPasswordPin body: ForgotPasswordPin (required)
        :return: PinRedeemResult
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_forgotpassword_pin_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_forgotpassword_pin_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_users_forgotpassword_pin_with_http_info(self, body, **kwargs):  # noqa: E501
        """Redeems a forgot password pin  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_forgotpassword_pin_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ForgotPasswordPin body: ForgotPasswordPin (required)
        :return: PinRedeemResult
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
                    " to method post_users_forgotpassword_pin" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_users_forgotpassword_pin`")  # noqa: E501

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
            '/Users/ForgotPassword/Pin', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PinRedeemResult',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_users_new(self, body, **kwargs):  # noqa: E501
        """Creates a user  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_new(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CreateUserByName body: CreateUserByName (required)
        :return: UserDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_new_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_new_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_users_new_with_http_info(self, body, **kwargs):  # noqa: E501
        """Creates a user  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_new_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CreateUserByName body: CreateUserByName (required)
        :return: UserDto
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
                    " to method post_users_new" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_users_new`")  # noqa: E501

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
            '/Users/New', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='UserDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
