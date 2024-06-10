# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class InstantMixServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_albums_by_id_instantmix(self, id, **kwargs):  # noqa: E501
        """Creates an instant playlist based on a given album  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_albums_by_id_instantmix(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str user_id: Optional. Filter by user id, and attach user data
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_albums_by_id_instantmix_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_albums_by_id_instantmix_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_albums_by_id_instantmix_with_http_info(self, id, **kwargs):  # noqa: E501
        """Creates an instant playlist based on a given album  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_albums_by_id_instantmix_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str user_id: Optional. Filter by user id, and attach user data
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'include_item_types', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types', 'user_id', 'limit', 'fields']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_albums_by_id_instantmix" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_albums_by_id_instantmix`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'include_item_types' in params:
            query_params.append(('IncludeItemTypes', params['include_item_types']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501

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
            '/Albums/{Id}/InstantMix', 'GET',
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

    def get_artists_instantmix(self, **kwargs):  # noqa: E501
        """Creates an instant playlist based on a given artist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_artists_instantmix(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str user_id: Optional. Filter by user id, and attach user data
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_artists_instantmix_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_artists_instantmix_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_artists_instantmix_with_http_info(self, **kwargs):  # noqa: E501
        """Creates an instant playlist based on a given artist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_artists_instantmix_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str user_id: Optional. Filter by user id, and attach user data
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['include_item_types', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types', 'user_id', 'limit', 'fields']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_artists_instantmix" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'include_item_types' in params:
            query_params.append(('IncludeItemTypes', params['include_item_types']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501

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
            '/Artists/InstantMix', 'GET',
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

    def get_audiobooks_nextup(self, user_id, **kwargs):  # noqa: E501
        """Gets a list of next up episodes  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_audiobooks_nextup(user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :param str album_id: Optional. Filter by series id
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param bool enable_images: Optional, include image information in output
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param bool enable_user_data: Optional, include user data
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_audiobooks_nextup_with_http_info(user_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_audiobooks_nextup_with_http_info(user_id, **kwargs)  # noqa: E501
            return data

    def get_audiobooks_nextup_with_http_info(self, user_id, **kwargs):  # noqa: E501
        """Gets a list of next up episodes  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_audiobooks_nextup_with_http_info(user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :param str album_id: Optional. Filter by series id
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param bool enable_images: Optional, include image information in output
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param bool enable_user_data: Optional, include user data
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['user_id', 'start_index', 'limit', 'fields', 'album_id', 'parent_id', 'enable_images', 'image_type_limit', 'enable_image_types', 'enable_user_data']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_audiobooks_nextup" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `get_audiobooks_nextup`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501
        if 'album_id' in params:
            query_params.append(('AlbumId', params['album_id']))  # noqa: E501
        if 'parent_id' in params:
            query_params.append(('ParentId', params['parent_id']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501

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
            '/AudioBooks/NextUp', 'GET',
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

    def get_items_by_id_instantmix(self, id, **kwargs):  # noqa: E501
        """Creates an instant playlist based on a given item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_instantmix(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str user_id: Optional. Filter by user id, and attach user data
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_items_by_id_instantmix_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_items_by_id_instantmix_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_items_by_id_instantmix_with_http_info(self, id, **kwargs):  # noqa: E501
        """Creates an instant playlist based on a given item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_instantmix_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str user_id: Optional. Filter by user id, and attach user data
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'include_item_types', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types', 'user_id', 'limit', 'fields']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_items_by_id_instantmix" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_items_by_id_instantmix`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'include_item_types' in params:
            query_params.append(('IncludeItemTypes', params['include_item_types']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501

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
            '/Items/{Id}/InstantMix', 'GET',
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

    def get_musicgenres_by_name_instantmix(self, name, **kwargs):  # noqa: E501
        """Creates an instant playlist based on a music genre  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_musicgenres_by_name_instantmix(name, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: The genre name (required)
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str user_id: Optional. Filter by user id, and attach user data
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_musicgenres_by_name_instantmix_with_http_info(name, **kwargs)  # noqa: E501
        else:
            (data) = self.get_musicgenres_by_name_instantmix_with_http_info(name, **kwargs)  # noqa: E501
            return data

    def get_musicgenres_by_name_instantmix_with_http_info(self, name, **kwargs):  # noqa: E501
        """Creates an instant playlist based on a music genre  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_musicgenres_by_name_instantmix_with_http_info(name, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: The genre name (required)
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str user_id: Optional. Filter by user id, and attach user data
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'include_item_types', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types', 'user_id', 'limit', 'fields']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_musicgenres_by_name_instantmix" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_musicgenres_by_name_instantmix`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501

        query_params = []
        if 'include_item_types' in params:
            query_params.append(('IncludeItemTypes', params['include_item_types']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501

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
            '/MusicGenres/{Name}/InstantMix', 'GET',
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

    def get_musicgenres_instantmix(self, **kwargs):  # noqa: E501
        """Creates an instant playlist based on a music genre  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_musicgenres_instantmix(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str user_id: Optional. Filter by user id, and attach user data
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_musicgenres_instantmix_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_musicgenres_instantmix_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_musicgenres_instantmix_with_http_info(self, **kwargs):  # noqa: E501
        """Creates an instant playlist based on a music genre  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_musicgenres_instantmix_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str user_id: Optional. Filter by user id, and attach user data
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['include_item_types', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types', 'user_id', 'limit', 'fields']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_musicgenres_instantmix" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'include_item_types' in params:
            query_params.append(('IncludeItemTypes', params['include_item_types']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501

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
            '/MusicGenres/InstantMix', 'GET',
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

    def get_playlists_by_id_instantmix(self, id, **kwargs):  # noqa: E501
        """Creates an instant playlist based on a given playlist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_playlists_by_id_instantmix(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str user_id: Optional. Filter by user id, and attach user data
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_playlists_by_id_instantmix_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_playlists_by_id_instantmix_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_playlists_by_id_instantmix_with_http_info(self, id, **kwargs):  # noqa: E501
        """Creates an instant playlist based on a given playlist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_playlists_by_id_instantmix_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str user_id: Optional. Filter by user id, and attach user data
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'include_item_types', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types', 'user_id', 'limit', 'fields']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_playlists_by_id_instantmix" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_playlists_by_id_instantmix`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'include_item_types' in params:
            query_params.append(('IncludeItemTypes', params['include_item_types']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501

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
            '/Playlists/{Id}/InstantMix', 'GET',
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

    def get_songs_by_id_instantmix(self, id, **kwargs):  # noqa: E501
        """Creates an instant playlist based on a given song  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_songs_by_id_instantmix(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str user_id: Optional. Filter by user id, and attach user data
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_songs_by_id_instantmix_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_songs_by_id_instantmix_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_songs_by_id_instantmix_with_http_info(self, id, **kwargs):  # noqa: E501
        """Creates an instant playlist based on a given song  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_songs_by_id_instantmix_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str user_id: Optional. Filter by user id, and attach user data
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'include_item_types', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types', 'user_id', 'limit', 'fields']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_songs_by_id_instantmix" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_songs_by_id_instantmix`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'include_item_types' in params:
            query_params.append(('IncludeItemTypes', params['include_item_types']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501

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
            '/Songs/{Id}/InstantMix', 'GET',
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
