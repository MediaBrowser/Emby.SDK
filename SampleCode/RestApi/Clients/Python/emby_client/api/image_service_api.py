# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class ImageServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def delete_items_by_id_images_by_type(self, id, type, **kwargs):  # noqa: E501
        """delete_items_by_id_images_by_type  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_items_by_id_images_by_type(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param ImageType type: Image Type (required)
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_items_by_id_images_by_type_with_http_info(id, type, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_items_by_id_images_by_type_with_http_info(id, type, **kwargs)  # noqa: E501
            return data

    def delete_items_by_id_images_by_type_with_http_info(self, id, type, **kwargs):  # noqa: E501
        """delete_items_by_id_images_by_type  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_items_by_id_images_by_type_with_http_info(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param ImageType type: Image Type (required)
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'type', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_items_by_id_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_items_by_id_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `delete_items_by_id_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/Images/{Type}', 'DELETE',
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

    def delete_items_by_id_images_by_type_by_index(self, id, index, type, **kwargs):  # noqa: E501
        """delete_items_by_id_images_by_type_by_index  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_items_by_id_images_by_type_by_index(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_items_by_id_images_by_type_by_index_with_http_info(id, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_items_by_id_images_by_type_by_index_with_http_info(id, index, type, **kwargs)  # noqa: E501
            return data

    def delete_items_by_id_images_by_type_by_index_with_http_info(self, id, index, type, **kwargs):  # noqa: E501
        """delete_items_by_id_images_by_type_by_index  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_items_by_id_images_by_type_by_index_with_http_info(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'index', 'type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_items_by_id_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_items_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `delete_items_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `delete_items_by_id_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/Images/{Type}/{Index}', 'DELETE',
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

    def delete_users_by_id_images_by_type(self, id, type, **kwargs):  # noqa: E501
        """delete_users_by_id_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_users_by_id_images_by_type(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param ImageType type: Image Type (required)
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_users_by_id_images_by_type_with_http_info(id, type, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_users_by_id_images_by_type_with_http_info(id, type, **kwargs)  # noqa: E501
            return data

    def delete_users_by_id_images_by_type_with_http_info(self, id, type, **kwargs):  # noqa: E501
        """delete_users_by_id_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_users_by_id_images_by_type_with_http_info(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param ImageType type: Image Type (required)
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'type', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_users_by_id_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_users_by_id_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `delete_users_by_id_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{Id}/Images/{Type}', 'DELETE',
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

    def delete_users_by_id_images_by_type_by_index(self, id, index, type, **kwargs):  # noqa: E501
        """delete_users_by_id_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_users_by_id_images_by_type_by_index(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_users_by_id_images_by_type_by_index_with_http_info(id, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_users_by_id_images_by_type_by_index_with_http_info(id, index, type, **kwargs)  # noqa: E501
            return data

    def delete_users_by_id_images_by_type_by_index_with_http_info(self, id, index, type, **kwargs):  # noqa: E501
        """delete_users_by_id_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_users_by_id_images_by_type_by_index_with_http_info(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'index', 'type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_users_by_id_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_users_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `delete_users_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `delete_users_by_id_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{Id}/Images/{Type}/{Index}', 'DELETE',
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

    def get_artists_by_name_images_by_type(self, name, type, **kwargs):  # noqa: E501
        """get_artists_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_artists_by_name_images_by_type(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_artists_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_artists_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
            return data

    def get_artists_by_name_images_by_type_with_http_info(self, name, type, **kwargs):  # noqa: E501
        """get_artists_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_artists_by_name_images_by_type_with_http_info(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_artists_by_name_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_artists_by_name_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_artists_by_name_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Artists/{Name}/Images/{Type}', 'GET',
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

    def get_artists_by_name_images_by_type_by_index(self, name, index, type, **kwargs):  # noqa: E501
        """get_artists_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_artists_by_name_images_by_type_by_index(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_artists_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_artists_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
            return data

    def get_artists_by_name_images_by_type_by_index_with_http_info(self, name, index, type, **kwargs):  # noqa: E501
        """get_artists_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_artists_by_name_images_by_type_by_index_with_http_info(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_artists_by_name_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_artists_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `get_artists_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_artists_by_name_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Artists/{Name}/Images/{Type}/{Index}', 'GET',
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

    def get_gamegenres_by_name_images_by_type(self, name, type, **kwargs):  # noqa: E501
        """get_gamegenres_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_gamegenres_by_name_images_by_type(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_gamegenres_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_gamegenres_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
            return data

    def get_gamegenres_by_name_images_by_type_with_http_info(self, name, type, **kwargs):  # noqa: E501
        """get_gamegenres_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_gamegenres_by_name_images_by_type_with_http_info(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_gamegenres_by_name_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_gamegenres_by_name_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_gamegenres_by_name_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/GameGenres/{Name}/Images/{Type}', 'GET',
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

    def get_gamegenres_by_name_images_by_type_by_index(self, name, index, type, **kwargs):  # noqa: E501
        """get_gamegenres_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_gamegenres_by_name_images_by_type_by_index(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_gamegenres_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_gamegenres_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
            return data

    def get_gamegenres_by_name_images_by_type_by_index_with_http_info(self, name, index, type, **kwargs):  # noqa: E501
        """get_gamegenres_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_gamegenres_by_name_images_by_type_by_index_with_http_info(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_gamegenres_by_name_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_gamegenres_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `get_gamegenres_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_gamegenres_by_name_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/GameGenres/{Name}/Images/{Type}/{Index}', 'GET',
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

    def get_genres_by_name_images_by_type(self, name, type, **kwargs):  # noqa: E501
        """get_genres_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_genres_by_name_images_by_type(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_genres_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_genres_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
            return data

    def get_genres_by_name_images_by_type_with_http_info(self, name, type, **kwargs):  # noqa: E501
        """get_genres_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_genres_by_name_images_by_type_with_http_info(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_genres_by_name_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_genres_by_name_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_genres_by_name_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Genres/{Name}/Images/{Type}', 'GET',
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

    def get_genres_by_name_images_by_type_by_index(self, name, index, type, **kwargs):  # noqa: E501
        """get_genres_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_genres_by_name_images_by_type_by_index(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_genres_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_genres_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
            return data

    def get_genres_by_name_images_by_type_by_index_with_http_info(self, name, index, type, **kwargs):  # noqa: E501
        """get_genres_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_genres_by_name_images_by_type_by_index_with_http_info(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_genres_by_name_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_genres_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `get_genres_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_genres_by_name_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Genres/{Name}/Images/{Type}/{Index}', 'GET',
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

    def get_items_by_id_images(self, id, **kwargs):  # noqa: E501
        """Gets information about an item's images  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_images(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :return: list[ImageInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_items_by_id_images_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_items_by_id_images_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_items_by_id_images_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets information about an item's images  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_images_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :return: list[ImageInfo]
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
                    " to method get_items_by_id_images" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_items_by_id_images`")  # noqa: E501

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
            '/Items/{Id}/Images', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[ImageInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_items_by_id_images_by_type(self, id, type, **kwargs):  # noqa: E501
        """get_items_by_id_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_images_by_type(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_items_by_id_images_by_type_with_http_info(id, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_items_by_id_images_by_type_with_http_info(id, type, **kwargs)  # noqa: E501
            return data

    def get_items_by_id_images_by_type_with_http_info(self, id, type, **kwargs):  # noqa: E501
        """get_items_by_id_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_images_by_type_with_http_info(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_items_by_id_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_items_by_id_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_items_by_id_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/Images/{Type}', 'GET',
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

    def get_items_by_id_images_by_type_by_index(self, id, index, type, **kwargs):  # noqa: E501
        """get_items_by_id_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_images_by_type_by_index(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_items_by_id_images_by_type_by_index_with_http_info(id, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_items_by_id_images_by_type_by_index_with_http_info(id, index, type, **kwargs)  # noqa: E501
            return data

    def get_items_by_id_images_by_type_by_index_with_http_info(self, id, index, type, **kwargs):  # noqa: E501
        """get_items_by_id_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_images_by_type_by_index_with_http_info(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_items_by_id_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_items_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `get_items_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_items_by_id_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/Images/{Type}/{Index}', 'GET',
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

    def get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount(self, percent_played, un_played_count, id, max_width, max_height, tag, format, index, type, **kwargs):  # noqa: E501
        """get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount(percent_played, un_played_count, id, max_width, max_height, tag, format, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int percent_played: (required)
        :param int un_played_count: (required)
        :param str id: Item Id (required)
        :param int max_width: The maximum image width to return. (required)
        :param int max_height: The maximum image height to return. (required)
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers. (required)
        :param str format: Determines the output foramt of the image - original,gif,jpg,png (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount_with_http_info(percent_played, un_played_count, id, max_width, max_height, tag, format, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount_with_http_info(percent_played, un_played_count, id, max_width, max_height, tag, format, index, type, **kwargs)  # noqa: E501
            return data

    def get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount_with_http_info(self, percent_played, un_played_count, id, max_width, max_height, tag, format, index, type, **kwargs):  # noqa: E501
        """get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount_with_http_info(percent_played, un_played_count, id, max_width, max_height, tag, format, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int percent_played: (required)
        :param int un_played_count: (required)
        :param str id: Item Id (required)
        :param int max_width: The maximum image width to return. (required)
        :param int max_height: The maximum image height to return. (required)
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers. (required)
        :param str format: Determines the output foramt of the image - original,gif,jpg,png (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['percent_played', 'un_played_count', 'id', 'max_width', 'max_height', 'tag', 'format', 'index', 'type', 'width', 'height', 'quality', 'crop_whitespace', 'enable_image_enhancers', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'percent_played' is set
        if ('percent_played' not in params or
                params['percent_played'] is None):
            raise ValueError("Missing the required parameter `percent_played` when calling `get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'un_played_count' is set
        if ('un_played_count' not in params or
                params['un_played_count'] is None):
            raise ValueError("Missing the required parameter `un_played_count` when calling `get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'max_width' is set
        if ('max_width' not in params or
                params['max_width'] is None):
            raise ValueError("Missing the required parameter `max_width` when calling `get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'max_height' is set
        if ('max_height' not in params or
                params['max_height'] is None):
            raise ValueError("Missing the required parameter `max_height` when calling `get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'tag' is set
        if ('tag' not in params or
                params['tag'] is None):
            raise ValueError("Missing the required parameter `tag` when calling `get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'format' is set
        if ('format' not in params or
                params['format'] is None):
            raise ValueError("Missing the required parameter `format` when calling `get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'percent_played' in params:
            path_params['PercentPlayed'] = params['percent_played']  # noqa: E501
        if 'un_played_count' in params:
            path_params['UnPlayedCount'] = params['un_played_count']  # noqa: E501
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'max_width' in params:
            path_params['MaxWidth'] = params['max_width']  # noqa: E501
        if 'max_height' in params:
            path_params['MaxHeight'] = params['max_height']  # noqa: E501
        if 'tag' in params:
            path_params['Tag'] = params['tag']  # noqa: E501
        if 'format' in params:
            path_params['Format'] = params['format']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/Images/{Type}/{Index}/{Tag}/{Format}/{MaxWidth}/{MaxHeight}/{PercentPlayed}/{UnPlayedCount}', 'GET',
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

    def get_musicgenres_by_name_images_by_type(self, name, type, **kwargs):  # noqa: E501
        """get_musicgenres_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_musicgenres_by_name_images_by_type(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_musicgenres_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_musicgenres_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
            return data

    def get_musicgenres_by_name_images_by_type_with_http_info(self, name, type, **kwargs):  # noqa: E501
        """get_musicgenres_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_musicgenres_by_name_images_by_type_with_http_info(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_musicgenres_by_name_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_musicgenres_by_name_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_musicgenres_by_name_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/MusicGenres/{Name}/Images/{Type}', 'GET',
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

    def get_musicgenres_by_name_images_by_type_by_index(self, name, index, type, **kwargs):  # noqa: E501
        """get_musicgenres_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_musicgenres_by_name_images_by_type_by_index(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_musicgenres_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_musicgenres_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
            return data

    def get_musicgenres_by_name_images_by_type_by_index_with_http_info(self, name, index, type, **kwargs):  # noqa: E501
        """get_musicgenres_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_musicgenres_by_name_images_by_type_by_index_with_http_info(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_musicgenres_by_name_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_musicgenres_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `get_musicgenres_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_musicgenres_by_name_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/MusicGenres/{Name}/Images/{Type}/{Index}', 'GET',
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

    def get_persons_by_name_images_by_type(self, name, type, **kwargs):  # noqa: E501
        """get_persons_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_persons_by_name_images_by_type(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_persons_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_persons_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
            return data

    def get_persons_by_name_images_by_type_with_http_info(self, name, type, **kwargs):  # noqa: E501
        """get_persons_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_persons_by_name_images_by_type_with_http_info(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_persons_by_name_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_persons_by_name_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_persons_by_name_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Persons/{Name}/Images/{Type}', 'GET',
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

    def get_persons_by_name_images_by_type_by_index(self, name, index, type, **kwargs):  # noqa: E501
        """get_persons_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_persons_by_name_images_by_type_by_index(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_persons_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_persons_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
            return data

    def get_persons_by_name_images_by_type_by_index_with_http_info(self, name, index, type, **kwargs):  # noqa: E501
        """get_persons_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_persons_by_name_images_by_type_by_index_with_http_info(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_persons_by_name_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_persons_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `get_persons_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_persons_by_name_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Persons/{Name}/Images/{Type}/{Index}', 'GET',
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

    def get_studios_by_name_images_by_type(self, name, type, **kwargs):  # noqa: E501
        """get_studios_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_studios_by_name_images_by_type(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_studios_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_studios_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
            return data

    def get_studios_by_name_images_by_type_with_http_info(self, name, type, **kwargs):  # noqa: E501
        """get_studios_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_studios_by_name_images_by_type_with_http_info(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_studios_by_name_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_studios_by_name_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_studios_by_name_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Studios/{Name}/Images/{Type}', 'GET',
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

    def get_studios_by_name_images_by_type_by_index(self, name, index, type, **kwargs):  # noqa: E501
        """get_studios_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_studios_by_name_images_by_type_by_index(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_studios_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_studios_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
            return data

    def get_studios_by_name_images_by_type_by_index_with_http_info(self, name, index, type, **kwargs):  # noqa: E501
        """get_studios_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_studios_by_name_images_by_type_by_index_with_http_info(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_studios_by_name_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_studios_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `get_studios_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_studios_by_name_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Studios/{Name}/Images/{Type}/{Index}', 'GET',
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

    def get_users_by_id_images_by_type(self, id, type, **kwargs):  # noqa: E501
        """get_users_by_id_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_by_id_images_by_type(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_users_by_id_images_by_type_with_http_info(id, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_users_by_id_images_by_type_with_http_info(id, type, **kwargs)  # noqa: E501
            return data

    def get_users_by_id_images_by_type_with_http_info(self, id, type, **kwargs):  # noqa: E501
        """get_users_by_id_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_by_id_images_by_type_with_http_info(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_users_by_id_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_users_by_id_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_users_by_id_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{Id}/Images/{Type}', 'GET',
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

    def get_users_by_id_images_by_type_by_index(self, id, index, type, **kwargs):  # noqa: E501
        """get_users_by_id_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_by_id_images_by_type_by_index(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_users_by_id_images_by_type_by_index_with_http_info(id, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_users_by_id_images_by_type_by_index_with_http_info(id, index, type, **kwargs)  # noqa: E501
            return data

    def get_users_by_id_images_by_type_by_index_with_http_info(self, id, index, type, **kwargs):  # noqa: E501
        """get_users_by_id_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_by_id_images_by_type_by_index_with_http_info(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_users_by_id_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_users_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `get_users_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_users_by_id_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{Id}/Images/{Type}/{Index}', 'GET',
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

    def head_artists_by_name_images_by_type(self, name, type, **kwargs):  # noqa: E501
        """head_artists_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_artists_by_name_images_by_type(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_artists_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_artists_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
            return data

    def head_artists_by_name_images_by_type_with_http_info(self, name, type, **kwargs):  # noqa: E501
        """head_artists_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_artists_by_name_images_by_type_with_http_info(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_artists_by_name_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `head_artists_by_name_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_artists_by_name_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Artists/{Name}/Images/{Type}', 'HEAD',
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

    def head_artists_by_name_images_by_type_by_index(self, name, index, type, **kwargs):  # noqa: E501
        """head_artists_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_artists_by_name_images_by_type_by_index(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_artists_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_artists_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
            return data

    def head_artists_by_name_images_by_type_by_index_with_http_info(self, name, index, type, **kwargs):  # noqa: E501
        """head_artists_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_artists_by_name_images_by_type_by_index_with_http_info(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_artists_by_name_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `head_artists_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `head_artists_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_artists_by_name_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Artists/{Name}/Images/{Type}/{Index}', 'HEAD',
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

    def head_gamegenres_by_name_images_by_type(self, name, type, **kwargs):  # noqa: E501
        """head_gamegenres_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_gamegenres_by_name_images_by_type(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_gamegenres_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_gamegenres_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
            return data

    def head_gamegenres_by_name_images_by_type_with_http_info(self, name, type, **kwargs):  # noqa: E501
        """head_gamegenres_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_gamegenres_by_name_images_by_type_with_http_info(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_gamegenres_by_name_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `head_gamegenres_by_name_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_gamegenres_by_name_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/GameGenres/{Name}/Images/{Type}', 'HEAD',
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

    def head_gamegenres_by_name_images_by_type_by_index(self, name, index, type, **kwargs):  # noqa: E501
        """head_gamegenres_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_gamegenres_by_name_images_by_type_by_index(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_gamegenres_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_gamegenres_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
            return data

    def head_gamegenres_by_name_images_by_type_by_index_with_http_info(self, name, index, type, **kwargs):  # noqa: E501
        """head_gamegenres_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_gamegenres_by_name_images_by_type_by_index_with_http_info(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_gamegenres_by_name_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `head_gamegenres_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `head_gamegenres_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_gamegenres_by_name_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/GameGenres/{Name}/Images/{Type}/{Index}', 'HEAD',
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

    def head_genres_by_name_images_by_type(self, name, type, **kwargs):  # noqa: E501
        """head_genres_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_genres_by_name_images_by_type(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_genres_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_genres_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
            return data

    def head_genres_by_name_images_by_type_with_http_info(self, name, type, **kwargs):  # noqa: E501
        """head_genres_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_genres_by_name_images_by_type_with_http_info(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_genres_by_name_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `head_genres_by_name_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_genres_by_name_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Genres/{Name}/Images/{Type}', 'HEAD',
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

    def head_genres_by_name_images_by_type_by_index(self, name, index, type, **kwargs):  # noqa: E501
        """head_genres_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_genres_by_name_images_by_type_by_index(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_genres_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_genres_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
            return data

    def head_genres_by_name_images_by_type_by_index_with_http_info(self, name, index, type, **kwargs):  # noqa: E501
        """head_genres_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_genres_by_name_images_by_type_by_index_with_http_info(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_genres_by_name_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `head_genres_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `head_genres_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_genres_by_name_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Genres/{Name}/Images/{Type}/{Index}', 'HEAD',
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

    def head_items_by_id_images_by_type(self, id, type, **kwargs):  # noqa: E501
        """head_items_by_id_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_items_by_id_images_by_type(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_items_by_id_images_by_type_with_http_info(id, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_items_by_id_images_by_type_with_http_info(id, type, **kwargs)  # noqa: E501
            return data

    def head_items_by_id_images_by_type_with_http_info(self, id, type, **kwargs):  # noqa: E501
        """head_items_by_id_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_items_by_id_images_by_type_with_http_info(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_items_by_id_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_items_by_id_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_items_by_id_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/Images/{Type}', 'HEAD',
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

    def head_items_by_id_images_by_type_by_index(self, id, index, type, **kwargs):  # noqa: E501
        """head_items_by_id_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_items_by_id_images_by_type_by_index(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_items_by_id_images_by_type_by_index_with_http_info(id, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_items_by_id_images_by_type_by_index_with_http_info(id, index, type, **kwargs)  # noqa: E501
            return data

    def head_items_by_id_images_by_type_by_index_with_http_info(self, id, index, type, **kwargs):  # noqa: E501
        """head_items_by_id_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_items_by_id_images_by_type_by_index_with_http_info(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_items_by_id_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_items_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `head_items_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_items_by_id_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/Images/{Type}/{Index}', 'HEAD',
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

    def head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount(self, percent_played, un_played_count, id, max_width, max_height, tag, format, index, type, **kwargs):  # noqa: E501
        """head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount(percent_played, un_played_count, id, max_width, max_height, tag, format, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int percent_played: (required)
        :param int un_played_count: (required)
        :param str id: Item Id (required)
        :param int max_width: The maximum image width to return. (required)
        :param int max_height: The maximum image height to return. (required)
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers. (required)
        :param str format: Determines the output foramt of the image - original,gif,jpg,png (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount_with_http_info(percent_played, un_played_count, id, max_width, max_height, tag, format, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount_with_http_info(percent_played, un_played_count, id, max_width, max_height, tag, format, index, type, **kwargs)  # noqa: E501
            return data

    def head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount_with_http_info(self, percent_played, un_played_count, id, max_width, max_height, tag, format, index, type, **kwargs):  # noqa: E501
        """head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount_with_http_info(percent_played, un_played_count, id, max_width, max_height, tag, format, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int percent_played: (required)
        :param int un_played_count: (required)
        :param str id: Item Id (required)
        :param int max_width: The maximum image width to return. (required)
        :param int max_height: The maximum image height to return. (required)
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers. (required)
        :param str format: Determines the output foramt of the image - original,gif,jpg,png (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['percent_played', 'un_played_count', 'id', 'max_width', 'max_height', 'tag', 'format', 'index', 'type', 'width', 'height', 'quality', 'crop_whitespace', 'enable_image_enhancers', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'percent_played' is set
        if ('percent_played' not in params or
                params['percent_played'] is None):
            raise ValueError("Missing the required parameter `percent_played` when calling `head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'un_played_count' is set
        if ('un_played_count' not in params or
                params['un_played_count'] is None):
            raise ValueError("Missing the required parameter `un_played_count` when calling `head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'max_width' is set
        if ('max_width' not in params or
                params['max_width'] is None):
            raise ValueError("Missing the required parameter `max_width` when calling `head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'max_height' is set
        if ('max_height' not in params or
                params['max_height'] is None):
            raise ValueError("Missing the required parameter `max_height` when calling `head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'tag' is set
        if ('tag' not in params or
                params['tag'] is None):
            raise ValueError("Missing the required parameter `tag` when calling `head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'format' is set
        if ('format' not in params or
                params['format'] is None):
            raise ValueError("Missing the required parameter `format` when calling `head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_items_by_id_images_by_type_by_index_by_tag_by_format_by_maxwidth_by_maxheight_by_percentplayed_by_unplayedcount`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'percent_played' in params:
            path_params['PercentPlayed'] = params['percent_played']  # noqa: E501
        if 'un_played_count' in params:
            path_params['UnPlayedCount'] = params['un_played_count']  # noqa: E501
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'max_width' in params:
            path_params['MaxWidth'] = params['max_width']  # noqa: E501
        if 'max_height' in params:
            path_params['MaxHeight'] = params['max_height']  # noqa: E501
        if 'tag' in params:
            path_params['Tag'] = params['tag']  # noqa: E501
        if 'format' in params:
            path_params['Format'] = params['format']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/Images/{Type}/{Index}/{Tag}/{Format}/{MaxWidth}/{MaxHeight}/{PercentPlayed}/{UnPlayedCount}', 'HEAD',
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

    def head_musicgenres_by_name_images_by_type(self, name, type, **kwargs):  # noqa: E501
        """head_musicgenres_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_musicgenres_by_name_images_by_type(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_musicgenres_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_musicgenres_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
            return data

    def head_musicgenres_by_name_images_by_type_with_http_info(self, name, type, **kwargs):  # noqa: E501
        """head_musicgenres_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_musicgenres_by_name_images_by_type_with_http_info(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_musicgenres_by_name_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `head_musicgenres_by_name_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_musicgenres_by_name_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/MusicGenres/{Name}/Images/{Type}', 'HEAD',
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

    def head_musicgenres_by_name_images_by_type_by_index(self, name, index, type, **kwargs):  # noqa: E501
        """head_musicgenres_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_musicgenres_by_name_images_by_type_by_index(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_musicgenres_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_musicgenres_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
            return data

    def head_musicgenres_by_name_images_by_type_by_index_with_http_info(self, name, index, type, **kwargs):  # noqa: E501
        """head_musicgenres_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_musicgenres_by_name_images_by_type_by_index_with_http_info(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_musicgenres_by_name_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `head_musicgenres_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `head_musicgenres_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_musicgenres_by_name_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/MusicGenres/{Name}/Images/{Type}/{Index}', 'HEAD',
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

    def head_persons_by_name_images_by_type(self, name, type, **kwargs):  # noqa: E501
        """head_persons_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_persons_by_name_images_by_type(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_persons_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_persons_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
            return data

    def head_persons_by_name_images_by_type_with_http_info(self, name, type, **kwargs):  # noqa: E501
        """head_persons_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_persons_by_name_images_by_type_with_http_info(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_persons_by_name_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `head_persons_by_name_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_persons_by_name_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Persons/{Name}/Images/{Type}', 'HEAD',
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

    def head_persons_by_name_images_by_type_by_index(self, name, index, type, **kwargs):  # noqa: E501
        """head_persons_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_persons_by_name_images_by_type_by_index(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_persons_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_persons_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
            return data

    def head_persons_by_name_images_by_type_by_index_with_http_info(self, name, index, type, **kwargs):  # noqa: E501
        """head_persons_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_persons_by_name_images_by_type_by_index_with_http_info(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_persons_by_name_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `head_persons_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `head_persons_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_persons_by_name_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Persons/{Name}/Images/{Type}/{Index}', 'HEAD',
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

    def head_studios_by_name_images_by_type(self, name, type, **kwargs):  # noqa: E501
        """head_studios_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_studios_by_name_images_by_type(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_studios_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_studios_by_name_images_by_type_with_http_info(name, type, **kwargs)  # noqa: E501
            return data

    def head_studios_by_name_images_by_type_with_http_info(self, name, type, **kwargs):  # noqa: E501
        """head_studios_by_name_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_studios_by_name_images_by_type_with_http_info(name, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_studios_by_name_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `head_studios_by_name_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_studios_by_name_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Studios/{Name}/Images/{Type}', 'HEAD',
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

    def head_studios_by_name_images_by_type_by_index(self, name, index, type, **kwargs):  # noqa: E501
        """head_studios_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_studios_by_name_images_by_type_by_index(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_studios_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_studios_by_name_images_by_type_by_index_with_http_info(name, index, type, **kwargs)  # noqa: E501
            return data

    def head_studios_by_name_images_by_type_by_index_with_http_info(self, name, index, type, **kwargs):  # noqa: E501
        """head_studios_by_name_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_studios_by_name_images_by_type_by_index_with_http_info(name, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Item name (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_studios_by_name_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `head_studios_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `head_studios_by_name_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_studios_by_name_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Studios/{Name}/Images/{Type}/{Index}', 'HEAD',
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

    def head_users_by_id_images_by_type(self, id, type, **kwargs):  # noqa: E501
        """head_users_by_id_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_users_by_id_images_by_type(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_users_by_id_images_by_type_with_http_info(id, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_users_by_id_images_by_type_with_http_info(id, type, **kwargs)  # noqa: E501
            return data

    def head_users_by_id_images_by_type_with_http_info(self, id, type, **kwargs):  # noqa: E501
        """head_users_by_id_images_by_type  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_users_by_id_images_by_type_with_http_info(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_users_by_id_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_users_by_id_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_users_by_id_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{Id}/Images/{Type}', 'HEAD',
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

    def head_users_by_id_images_by_type_by_index(self, id, index, type, **kwargs):  # noqa: E501
        """head_users_by_id_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_users_by_id_images_by_type_by_index(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_users_by_id_images_by_type_by_index_with_http_info(id, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.head_users_by_id_images_by_type_by_index_with_http_info(id, index, type, **kwargs)  # noqa: E501
            return data

    def head_users_by_id_images_by_type_by_index_with_http_info(self, id, index, type, **kwargs):  # noqa: E501
        """head_users_by_id_images_by_type_by_index  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_users_by_id_images_by_type_by_index_with_http_info(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :param int max_width: The maximum image width to return.
        :param int max_height: The maximum image height to return.
        :param int width: The fixed image width to return.
        :param int height: The fixed image height to return.
        :param int quality: Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
        :param str tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
        :param bool crop_whitespace: Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
        :param bool enable_image_enhancers: Enable or disable image enhancers such as cover art.
        :param str format: Determines the output foramt of the image - original,gif,jpg,png
        :param str background_color: Optional. Apply a background color for transparent images.
        :param str foreground_layer: Optional. Apply a foreground layer on top of the image.
        :param bool auto_orient: Set to true to force normalization of orientation in the event the renderer does not support it.
        :param bool keep_animation: Set to true to retain image animation (when supported).
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'index', 'type', 'max_width', 'max_height', 'width', 'height', 'quality', 'tag', 'crop_whitespace', 'enable_image_enhancers', 'format', 'background_color', 'foreground_layer', 'auto_orient', 'keep_animation']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_users_by_id_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_users_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `head_users_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `head_users_by_id_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'max_width' in params:
            query_params.append(('MaxWidth', params['max_width']))  # noqa: E501
        if 'max_height' in params:
            query_params.append(('MaxHeight', params['max_height']))  # noqa: E501
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501
        if 'height' in params:
            query_params.append(('Height', params['height']))  # noqa: E501
        if 'quality' in params:
            query_params.append(('Quality', params['quality']))  # noqa: E501
        if 'tag' in params:
            query_params.append(('Tag', params['tag']))  # noqa: E501
        if 'crop_whitespace' in params:
            query_params.append(('CropWhitespace', params['crop_whitespace']))  # noqa: E501
        if 'enable_image_enhancers' in params:
            query_params.append(('EnableImageEnhancers', params['enable_image_enhancers']))  # noqa: E501
        if 'format' in params:
            query_params.append(('Format', params['format']))  # noqa: E501
        if 'background_color' in params:
            query_params.append(('BackgroundColor', params['background_color']))  # noqa: E501
        if 'foreground_layer' in params:
            query_params.append(('ForegroundLayer', params['foreground_layer']))  # noqa: E501
        if 'auto_orient' in params:
            query_params.append(('AutoOrient', params['auto_orient']))  # noqa: E501
        if 'keep_animation' in params:
            query_params.append(('KeepAnimation', params['keep_animation']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{Id}/Images/{Type}/{Index}', 'HEAD',
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

    def post_items_by_id_images_by_type(self, body, id, type, **kwargs):  # noqa: E501
        """Uploads an image for an item, must be base64 encoded.  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_images_by_type(body, id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str id: Item Id (required)
        :param ImageType type: Image Type (required)
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_by_id_images_by_type_with_http_info(body, id, type, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_by_id_images_by_type_with_http_info(body, id, type, **kwargs)  # noqa: E501
            return data

    def post_items_by_id_images_by_type_with_http_info(self, body, id, type, **kwargs):  # noqa: E501
        """Uploads an image for an item, must be base64 encoded.  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_images_by_type_with_http_info(body, id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str id: Item Id (required)
        :param ImageType type: Image Type (required)
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'id', 'type', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_items_by_id_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_by_id_images_by_type`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_items_by_id_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `post_items_by_id_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

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
            '/Items/{Id}/Images/{Type}', 'POST',
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

    def post_items_by_id_images_by_type_by_index(self, body, id, index, type, **kwargs):  # noqa: E501
        """Uploads an image for an item, must be base64 encoded.  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_images_by_type_by_index(body, id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str id: Item Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_by_id_images_by_type_by_index_with_http_info(body, id, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_by_id_images_by_type_by_index_with_http_info(body, id, index, type, **kwargs)  # noqa: E501
            return data

    def post_items_by_id_images_by_type_by_index_with_http_info(self, body, id, index, type, **kwargs):  # noqa: E501
        """Uploads an image for an item, must be base64 encoded.  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_images_by_type_by_index_with_http_info(body, id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str id: Item Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'id', 'index', 'type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_items_by_id_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_items_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `post_items_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `post_items_by_id_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

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
            '/Items/{Id}/Images/{Type}/{Index}', 'POST',
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

    def post_items_by_id_images_by_type_by_index_delete(self, id, index, type, **kwargs):  # noqa: E501
        """post_items_by_id_images_by_type_by_index_delete  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_images_by_type_by_index_delete(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_by_id_images_by_type_by_index_delete_with_http_info(id, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_by_id_images_by_type_by_index_delete_with_http_info(id, index, type, **kwargs)  # noqa: E501
            return data

    def post_items_by_id_images_by_type_by_index_delete_with_http_info(self, id, index, type, **kwargs):  # noqa: E501
        """post_items_by_id_images_by_type_by_index_delete  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_images_by_type_by_index_delete_with_http_info(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'index', 'type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_items_by_id_images_by_type_by_index_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_items_by_id_images_by_type_by_index_delete`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `post_items_by_id_images_by_type_by_index_delete`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `post_items_by_id_images_by_type_by_index_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/Images/{Type}/{Index}/Delete', 'POST',
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

    def post_items_by_id_images_by_type_by_index_index(self, id, type, index, new_index, **kwargs):  # noqa: E501
        """Updates the index for an item image  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_images_by_type_by_index_index(id, type, index, new_index, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param ImageType type: Image Type (required)
        :param int index: Image Index (required)
        :param int new_index: The new image index (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_by_id_images_by_type_by_index_index_with_http_info(id, type, index, new_index, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_by_id_images_by_type_by_index_index_with_http_info(id, type, index, new_index, **kwargs)  # noqa: E501
            return data

    def post_items_by_id_images_by_type_by_index_index_with_http_info(self, id, type, index, new_index, **kwargs):  # noqa: E501
        """Updates the index for an item image  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_images_by_type_by_index_index_with_http_info(id, type, index, new_index, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param ImageType type: Image Type (required)
        :param int index: Image Index (required)
        :param int new_index: The new image index (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'type', 'index', 'new_index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_items_by_id_images_by_type_by_index_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_items_by_id_images_by_type_by_index_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `post_items_by_id_images_by_type_by_index_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `post_items_by_id_images_by_type_by_index_index`")  # noqa: E501
        # verify the required parameter 'new_index' is set
        if ('new_index' not in params or
                params['new_index'] is None):
            raise ValueError("Missing the required parameter `new_index` when calling `post_items_by_id_images_by_type_by_index_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501

        query_params = []
        if 'new_index' in params:
            query_params.append(('NewIndex', params['new_index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/Images/{Type}/{Index}/Index', 'POST',
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

    def post_items_by_id_images_by_type_by_index_url(self, id, type, index, url, **kwargs):  # noqa: E501
        """Updates the index for an item image  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_images_by_type_by_index_url(id, type, index, url, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param ImageType type: Image Type (required)
        :param int index: Image Index (required)
        :param str url: The url for the new image (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_by_id_images_by_type_by_index_url_with_http_info(id, type, index, url, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_by_id_images_by_type_by_index_url_with_http_info(id, type, index, url, **kwargs)  # noqa: E501
            return data

    def post_items_by_id_images_by_type_by_index_url_with_http_info(self, id, type, index, url, **kwargs):  # noqa: E501
        """Updates the index for an item image  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_images_by_type_by_index_url_with_http_info(id, type, index, url, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param ImageType type: Image Type (required)
        :param int index: Image Index (required)
        :param str url: The url for the new image (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'type', 'index', 'url']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_items_by_id_images_by_type_by_index_url" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_items_by_id_images_by_type_by_index_url`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `post_items_by_id_images_by_type_by_index_url`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `post_items_by_id_images_by_type_by_index_url`")  # noqa: E501
        # verify the required parameter 'url' is set
        if ('url' not in params or
                params['url'] is None):
            raise ValueError("Missing the required parameter `url` when calling `post_items_by_id_images_by_type_by_index_url`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501

        query_params = []
        if 'url' in params:
            query_params.append(('Url', params['url']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/Images/{Type}/{Index}/Url', 'POST',
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

    def post_items_by_id_images_by_type_delete(self, id, type, **kwargs):  # noqa: E501
        """post_items_by_id_images_by_type_delete  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_images_by_type_delete(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param ImageType type: Image Type (required)
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_by_id_images_by_type_delete_with_http_info(id, type, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_by_id_images_by_type_delete_with_http_info(id, type, **kwargs)  # noqa: E501
            return data

    def post_items_by_id_images_by_type_delete_with_http_info(self, id, type, **kwargs):  # noqa: E501
        """post_items_by_id_images_by_type_delete  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_images_by_type_delete_with_http_info(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param ImageType type: Image Type (required)
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'type', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_items_by_id_images_by_type_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_items_by_id_images_by_type_delete`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `post_items_by_id_images_by_type_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/Images/{Type}/Delete', 'POST',
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

    def post_users_by_id_images_by_type(self, body, id, type, **kwargs):  # noqa: E501
        """Uploads an image for an item, must be base64 encoded.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_images_by_type(body, id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str id: User Id (required)
        :param ImageType type: Image Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_id_images_by_type_with_http_info(body, id, type, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_id_images_by_type_with_http_info(body, id, type, **kwargs)  # noqa: E501
            return data

    def post_users_by_id_images_by_type_with_http_info(self, body, id, type, **kwargs):  # noqa: E501
        """Uploads an image for an item, must be base64 encoded.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_images_by_type_with_http_info(body, id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str id: User Id (required)
        :param ImageType type: Image Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'id', 'type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_users_by_id_images_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_users_by_id_images_by_type`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_id_images_by_type`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `post_users_by_id_images_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

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
            '/Users/{Id}/Images/{Type}', 'POST',
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

    def post_users_by_id_images_by_type_by_index(self, body, id, type, **kwargs):  # noqa: E501
        """Uploads an image for an item, must be base64 encoded.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_images_by_type_by_index(body, id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str id: User Id (required)
        :param ImageType type: Image Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_id_images_by_type_by_index_with_http_info(body, id, type, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_id_images_by_type_by_index_with_http_info(body, id, type, **kwargs)  # noqa: E501
            return data

    def post_users_by_id_images_by_type_by_index_with_http_info(self, body, id, type, **kwargs):  # noqa: E501
        """Uploads an image for an item, must be base64 encoded.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_images_by_type_by_index_with_http_info(body, id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str id: User Id (required)
        :param ImageType type: Image Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'id', 'type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_users_by_id_images_by_type_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_users_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_id_images_by_type_by_index`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `post_users_by_id_images_by_type_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

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
            '/Users/{Id}/Images/{Type}/{Index}', 'POST',
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

    def post_users_by_id_images_by_type_by_index_delete(self, id, index, type, **kwargs):  # noqa: E501
        """post_users_by_id_images_by_type_by_index_delete  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_images_by_type_by_index_delete(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_id_images_by_type_by_index_delete_with_http_info(id, index, type, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_id_images_by_type_by_index_delete_with_http_info(id, index, type, **kwargs)  # noqa: E501
            return data

    def post_users_by_id_images_by_type_by_index_delete_with_http_info(self, id, index, type, **kwargs):  # noqa: E501
        """post_users_by_id_images_by_type_by_index_delete  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_images_by_type_by_index_delete_with_http_info(id, index, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param int index: Image Index (required)
        :param ImageType type: Image Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'index', 'type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_users_by_id_images_by_type_by_index_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_id_images_by_type_by_index_delete`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `post_users_by_id_images_by_type_by_index_delete`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `post_users_by_id_images_by_type_by_index_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{Id}/Images/{Type}/{Index}/Delete', 'POST',
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

    def post_users_by_id_images_by_type_delete(self, id, type, **kwargs):  # noqa: E501
        """post_users_by_id_images_by_type_delete  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_images_by_type_delete(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param ImageType type: Image Type (required)
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_id_images_by_type_delete_with_http_info(id, type, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_id_images_by_type_delete_with_http_info(id, type, **kwargs)  # noqa: E501
            return data

    def post_users_by_id_images_by_type_delete_with_http_info(self, id, type, **kwargs):  # noqa: E501
        """post_users_by_id_images_by_type_delete  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_id_images_by_type_delete_with_http_info(id, type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: User Id (required)
        :param ImageType type: Image Type (required)
        :param int index: Image Index
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'type', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_users_by_id_images_by_type_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_id_images_by_type_delete`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `post_users_by_id_images_by_type_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

        query_params = []
        if 'index' in params:
            query_params.append(('Index', params['index']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{Id}/Images/{Type}/Delete', 'POST',
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
