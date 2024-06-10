# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class EnvironmentServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_environment_defaultdirectorybrowser(self, **kwargs):  # noqa: E501
        """Gets the parent path of a given path  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_environment_defaultdirectorybrowser(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: DefaultDirectoryBrowserInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_environment_defaultdirectorybrowser_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_environment_defaultdirectorybrowser_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_environment_defaultdirectorybrowser_with_http_info(self, **kwargs):  # noqa: E501
        """Gets the parent path of a given path  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_environment_defaultdirectorybrowser_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: DefaultDirectoryBrowserInfo
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
                    " to method get_environment_defaultdirectorybrowser" % key
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
            '/Environment/DefaultDirectoryBrowser', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='DefaultDirectoryBrowserInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_environment_directorycontents(self, path, **kwargs):  # noqa: E501
        """Gets the contents of a given directory in the file system  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_environment_directorycontents(path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str path: (required)
        :param bool include_files: An optional filter to include or exclude files from the results. true/false
        :param bool include_directories: An optional filter to include or exclude folders from the results. true/false
        :return: list[IOFileSystemEntryInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_environment_directorycontents_with_http_info(path, **kwargs)  # noqa: E501
        else:
            (data) = self.get_environment_directorycontents_with_http_info(path, **kwargs)  # noqa: E501
            return data

    def get_environment_directorycontents_with_http_info(self, path, **kwargs):  # noqa: E501
        """Gets the contents of a given directory in the file system  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_environment_directorycontents_with_http_info(path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str path: (required)
        :param bool include_files: An optional filter to include or exclude files from the results. true/false
        :param bool include_directories: An optional filter to include or exclude folders from the results. true/false
        :return: list[IOFileSystemEntryInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['path', 'include_files', 'include_directories']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_environment_directorycontents" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'path' is set
        if ('path' not in params or
                params['path'] is None):
            raise ValueError("Missing the required parameter `path` when calling `get_environment_directorycontents`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'path' in params:
            query_params.append(('Path', params['path']))  # noqa: E501
        if 'include_files' in params:
            query_params.append(('IncludeFiles', params['include_files']))  # noqa: E501
        if 'include_directories' in params:
            query_params.append(('IncludeDirectories', params['include_directories']))  # noqa: E501

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
            '/Environment/DirectoryContents', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[IOFileSystemEntryInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_environment_drives(self, **kwargs):  # noqa: E501
        """Gets available drives from the server's file system  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_environment_drives(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[IOFileSystemEntryInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_environment_drives_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_environment_drives_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_environment_drives_with_http_info(self, **kwargs):  # noqa: E501
        """Gets available drives from the server's file system  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_environment_drives_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[IOFileSystemEntryInfo]
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
                    " to method get_environment_drives" % key
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
            '/Environment/Drives', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[IOFileSystemEntryInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_environment_networkdevices(self, **kwargs):  # noqa: E501
        """Gets a list of devices on the network  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_environment_networkdevices(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[IOFileSystemEntryInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_environment_networkdevices_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_environment_networkdevices_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_environment_networkdevices_with_http_info(self, **kwargs):  # noqa: E501
        """Gets a list of devices on the network  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_environment_networkdevices_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[IOFileSystemEntryInfo]
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
                    " to method get_environment_networkdevices" % key
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
            '/Environment/NetworkDevices', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[IOFileSystemEntryInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_environment_networkshares(self, path, **kwargs):  # noqa: E501
        """Gets shares from a network device  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_environment_networkshares(path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str path: (required)
        :return: list[IOFileSystemEntryInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_environment_networkshares_with_http_info(path, **kwargs)  # noqa: E501
        else:
            (data) = self.get_environment_networkshares_with_http_info(path, **kwargs)  # noqa: E501
            return data

    def get_environment_networkshares_with_http_info(self, path, **kwargs):  # noqa: E501
        """Gets shares from a network device  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_environment_networkshares_with_http_info(path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str path: (required)
        :return: list[IOFileSystemEntryInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['path']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_environment_networkshares" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'path' is set
        if ('path' not in params or
                params['path'] is None):
            raise ValueError("Missing the required parameter `path` when calling `get_environment_networkshares`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'path' in params:
            query_params.append(('Path', params['path']))  # noqa: E501

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
            '/Environment/NetworkShares', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[IOFileSystemEntryInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_environment_parentpath(self, path, **kwargs):  # noqa: E501
        """Gets the parent path of a given path  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_environment_parentpath(path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str path: (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_environment_parentpath_with_http_info(path, **kwargs)  # noqa: E501
        else:
            (data) = self.get_environment_parentpath_with_http_info(path, **kwargs)  # noqa: E501
            return data

    def get_environment_parentpath_with_http_info(self, path, **kwargs):  # noqa: E501
        """Gets the parent path of a given path  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_environment_parentpath_with_http_info(path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str path: (required)
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['path']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_environment_parentpath" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'path' is set
        if ('path' not in params or
                params['path'] is None):
            raise ValueError("Missing the required parameter `path` when calling `get_environment_parentpath`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'path' in params:
            query_params.append(('Path', params['path']))  # noqa: E501

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
            '/Environment/ParentPath', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='str',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_environment_directorycontents(self, body, path, **kwargs):  # noqa: E501
        """Gets the contents of a given directory in the file system  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_environment_directorycontents(body, path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param GetDirectoryContents body: GetDirectoryContents (required)
        :param str path: (required)
        :param bool include_files: An optional filter to include or exclude files from the results. true/false
        :param bool include_directories: An optional filter to include or exclude folders from the results. true/false
        :return: list[IOFileSystemEntryInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_environment_directorycontents_with_http_info(body, path, **kwargs)  # noqa: E501
        else:
            (data) = self.post_environment_directorycontents_with_http_info(body, path, **kwargs)  # noqa: E501
            return data

    def post_environment_directorycontents_with_http_info(self, body, path, **kwargs):  # noqa: E501
        """Gets the contents of a given directory in the file system  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_environment_directorycontents_with_http_info(body, path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param GetDirectoryContents body: GetDirectoryContents (required)
        :param str path: (required)
        :param bool include_files: An optional filter to include or exclude files from the results. true/false
        :param bool include_directories: An optional filter to include or exclude folders from the results. true/false
        :return: list[IOFileSystemEntryInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'path', 'include_files', 'include_directories']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_environment_directorycontents" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_environment_directorycontents`")  # noqa: E501
        # verify the required parameter 'path' is set
        if ('path' not in params or
                params['path'] is None):
            raise ValueError("Missing the required parameter `path` when calling `post_environment_directorycontents`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'path' in params:
            query_params.append(('Path', params['path']))  # noqa: E501
        if 'include_files' in params:
            query_params.append(('IncludeFiles', params['include_files']))  # noqa: E501
        if 'include_directories' in params:
            query_params.append(('IncludeDirectories', params['include_directories']))  # noqa: E501

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
            '/Environment/DirectoryContents', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[IOFileSystemEntryInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_environment_validatepath(self, body, path, **kwargs):  # noqa: E501
        """Gets the contents of a given directory in the file system  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_environment_validatepath(body, path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ValidatePath body: ValidatePath (required)
        :param str path: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_environment_validatepath_with_http_info(body, path, **kwargs)  # noqa: E501
        else:
            (data) = self.post_environment_validatepath_with_http_info(body, path, **kwargs)  # noqa: E501
            return data

    def post_environment_validatepath_with_http_info(self, body, path, **kwargs):  # noqa: E501
        """Gets the contents of a given directory in the file system  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_environment_validatepath_with_http_info(body, path, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ValidatePath body: ValidatePath (required)
        :param str path: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'path']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_environment_validatepath" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_environment_validatepath`")  # noqa: E501
        # verify the required parameter 'path' is set
        if ('path' not in params or
                params['path'] is None):
            raise ValueError("Missing the required parameter `path` when calling `post_environment_validatepath`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'path' in params:
            query_params.append(('Path', params['path']))  # noqa: E501

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
            '/Environment/ValidatePath', 'POST',
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
