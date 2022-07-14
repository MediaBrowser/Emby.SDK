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


class ImageByNameServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_images_general(self, **kwargs):  # noqa: E501
        """Gets all general images by name  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_images_general(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[ImageByNameInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_images_general_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_images_general_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_images_general_with_http_info(self, **kwargs):  # noqa: E501
        """Gets all general images by name  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_images_general_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[ImageByNameInfo]
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
                    " to method get_images_general" % key
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
            '/Images/General', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[ImageByNameInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_images_general_by_name_by_type(self, name, type, **kwargs):  # noqa: E501
        """Gets a general image by name  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_images_general_by_name_by_type(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: The name of the image (required)
        :param str type: Image Type (primary, backdrop, logo, etc). (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_images_general_by_name_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_images_general_by_name_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
            return data

    def get_images_general_by_name_by_type_with_http_info(self, name, type, **kwargs):  # noqa: E501
        """Gets a general image by name  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_images_general_by_name_by_type_with_http_info(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: The name of the image (required)
        :param str type: Image Type (primary, backdrop, logo, etc). (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_images_general_by_name_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_images_general_by_name_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_images_general_by_name_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Images/General/{Name}/{Type}', 'GET',
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

    def get_images_mediainfo(self, **kwargs):  # noqa: E501
        """Gets all media info image by name  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_images_mediainfo(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[ImageByNameInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_images_mediainfo_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_images_mediainfo_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_images_mediainfo_with_http_info(self, **kwargs):  # noqa: E501
        """Gets all media info image by name  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_images_mediainfo_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[ImageByNameInfo]
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
                    " to method get_images_mediainfo" % key
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
            '/Images/MediaInfo', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[ImageByNameInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_images_mediainfo_by_theme_by_name(self, name, theme, **kwargs):  # noqa: E501
        """Gets a media info image by name  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_images_mediainfo_by_theme_by_name(name, theme, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: The name of the image (required)
        :param str theme: The theme to get the image from (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_images_mediainfo_by_theme_by_name_with_http_info(name, theme, **kwargs)  # noqa: E501
        else:
            (data) = self.get_images_mediainfo_by_theme_by_name_with_http_info(name, theme, **kwargs)  # noqa: E501
            return data

    def get_images_mediainfo_by_theme_by_name_with_http_info(self, name, theme, **kwargs):  # noqa: E501
        """Gets a media info image by name  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_images_mediainfo_by_theme_by_name_with_http_info(name, theme, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: The name of the image (required)
        :param str theme: The theme to get the image from (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'theme']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_images_mediainfo_by_theme_by_name" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_images_mediainfo_by_theme_by_name`")  # noqa: E501
        # verify the required parameter 'theme' is set
        if ('theme' not in params or
                params['theme'] is None):
            raise ValueError("Missing the required parameter `theme` when calling `get_images_mediainfo_by_theme_by_name`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'theme' in params:
            path_params['Theme'] = params['theme']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Images/MediaInfo/{Theme}/{Name}', 'GET',
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

    def get_images_ratings(self, **kwargs):  # noqa: E501
        """Gets all rating images by name  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_images_ratings(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[ImageByNameInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_images_ratings_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_images_ratings_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_images_ratings_with_http_info(self, **kwargs):  # noqa: E501
        """Gets all rating images by name  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_images_ratings_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[ImageByNameInfo]
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
                    " to method get_images_ratings" % key
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
            '/Images/Ratings', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[ImageByNameInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_images_ratings_by_theme_by_name(self, name, theme, **kwargs):  # noqa: E501
        """Gets a rating image by name  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_images_ratings_by_theme_by_name(name, theme, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: The name of the image (required)
        :param str theme: The theme to get the image from (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_images_ratings_by_theme_by_name_with_http_info(name, theme, **kwargs)  # noqa: E501
        else:
            (data) = self.get_images_ratings_by_theme_by_name_with_http_info(name, theme, **kwargs)  # noqa: E501
            return data

    def get_images_ratings_by_theme_by_name_with_http_info(self, name, theme, **kwargs):  # noqa: E501
        """Gets a rating image by name  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_images_ratings_by_theme_by_name_with_http_info(name, theme, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: The name of the image (required)
        :param str theme: The theme to get the image from (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'theme']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_images_ratings_by_theme_by_name" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_images_ratings_by_theme_by_name`")  # noqa: E501
        # verify the required parameter 'theme' is set
        if ('theme' not in params or
                params['theme'] is None):
            raise ValueError("Missing the required parameter `theme` when calling `get_images_ratings_by_theme_by_name`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'theme' in params:
            path_params['Theme'] = params['theme']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Images/Ratings/{Theme}/{Name}', 'GET',
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
