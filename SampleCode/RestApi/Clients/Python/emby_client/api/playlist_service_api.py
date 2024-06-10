# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class PlaylistServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def delete_playlists_by_id_items(self, id, entry_ids, **kwargs):  # noqa: E501
        """Removes items from a playlist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_playlists_by_id_items(id, entry_ids, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str entry_ids: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_playlists_by_id_items_with_http_info(id, entry_ids, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_playlists_by_id_items_with_http_info(id, entry_ids, **kwargs)  # noqa: E501
            return data

    def delete_playlists_by_id_items_with_http_info(self, id, entry_ids, **kwargs):  # noqa: E501
        """Removes items from a playlist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_playlists_by_id_items_with_http_info(id, entry_ids, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str entry_ids: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'entry_ids']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_playlists_by_id_items" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_playlists_by_id_items`")  # noqa: E501
        # verify the required parameter 'entry_ids' is set
        if ('entry_ids' not in params or
                params['entry_ids'] is None):
            raise ValueError("Missing the required parameter `entry_ids` when calling `delete_playlists_by_id_items`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'entry_ids' in params:
            query_params.append(('EntryIds', params['entry_ids']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Playlists/{Id}/Items', 'DELETE',
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

    def get_playlists_by_id_addtoplaylistinfo(self, ids, id, **kwargs):  # noqa: E501
        """Gets add to playlist info  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_playlists_by_id_addtoplaylistinfo(ids, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ids: Item id, comma delimited (required)
        :param str id: (required)
        :param str user_id: User Id
        :return: PlaylistsAddToPlaylistInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_playlists_by_id_addtoplaylistinfo_with_http_info(ids, id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_playlists_by_id_addtoplaylistinfo_with_http_info(ids, id, **kwargs)  # noqa: E501
            return data

    def get_playlists_by_id_addtoplaylistinfo_with_http_info(self, ids, id, **kwargs):  # noqa: E501
        """Gets add to playlist info  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_playlists_by_id_addtoplaylistinfo_with_http_info(ids, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ids: Item id, comma delimited (required)
        :param str id: (required)
        :param str user_id: User Id
        :return: PlaylistsAddToPlaylistInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ids', 'id', 'user_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_playlists_by_id_addtoplaylistinfo" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'ids' is set
        if ('ids' not in params or
                params['ids'] is None):
            raise ValueError("Missing the required parameter `ids` when calling `get_playlists_by_id_addtoplaylistinfo`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_playlists_by_id_addtoplaylistinfo`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'ids' in params:
            query_params.append(('Ids', params['ids']))  # noqa: E501

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
            '/Playlists/{Id}/AddToPlaylistInfo', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PlaylistsAddToPlaylistInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_playlists_by_id_items(self, id, **kwargs):  # noqa: E501
        """Gets the original items of a playlist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_playlists_by_id_items(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str user_id: User Id
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_playlists_by_id_items_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_playlists_by_id_items_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_playlists_by_id_items_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets the original items of a playlist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_playlists_by_id_items_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str user_id: User Id
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'user_id', 'start_index', 'limit', 'fields', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_playlists_by_id_items" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_playlists_by_id_items`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501

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
            '/Playlists/{Id}/Items', 'GET',
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

    def post_playlists(self, **kwargs):  # noqa: E501
        """Creates a new playlist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_playlists(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: The name of the new playlist.
        :param str ids: Item Ids to add to the playlist
        :param str media_type: The playlist media type
        :return: PlaylistsPlaylistCreationResult
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_playlists_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.post_playlists_with_http_info(**kwargs)  # noqa: E501
            return data

    def post_playlists_with_http_info(self, **kwargs):  # noqa: E501
        """Creates a new playlist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_playlists_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: The name of the new playlist.
        :param str ids: Item Ids to add to the playlist
        :param str media_type: The playlist media type
        :return: PlaylistsPlaylistCreationResult
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'ids', 'media_type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_playlists" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'name' in params:
            query_params.append(('Name', params['name']))  # noqa: E501
        if 'ids' in params:
            query_params.append(('Ids', params['ids']))  # noqa: E501
        if 'media_type' in params:
            query_params.append(('MediaType', params['media_type']))  # noqa: E501

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
            '/Playlists', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PlaylistsPlaylistCreationResult',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_playlists_by_id_items(self, ids, id, **kwargs):  # noqa: E501
        """Adds items to a playlist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_playlists_by_id_items(ids, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ids: Item id, comma delimited (required)
        :param str id: (required)
        :param str user_id: User Id
        :return: PlaylistsAddToPlaylistResult
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_playlists_by_id_items_with_http_info(ids, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_playlists_by_id_items_with_http_info(ids, id, **kwargs)  # noqa: E501
            return data

    def post_playlists_by_id_items_with_http_info(self, ids, id, **kwargs):  # noqa: E501
        """Adds items to a playlist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_playlists_by_id_items_with_http_info(ids, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ids: Item id, comma delimited (required)
        :param str id: (required)
        :param str user_id: User Id
        :return: PlaylistsAddToPlaylistResult
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ids', 'id', 'user_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_playlists_by_id_items" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'ids' is set
        if ('ids' not in params or
                params['ids'] is None):
            raise ValueError("Missing the required parameter `ids` when calling `post_playlists_by_id_items`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_playlists_by_id_items`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'ids' in params:
            query_params.append(('Ids', params['ids']))  # noqa: E501

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
            '/Playlists/{Id}/Items', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PlaylistsAddToPlaylistResult',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_playlists_by_id_items_by_itemid_move_by_newindex(self, item_id, id, new_index, **kwargs):  # noqa: E501
        """Moves a playlist item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_playlists_by_id_items_by_itemid_move_by_newindex(item_id, id, new_index, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int item_id: ItemId (required)
        :param str id: (required)
        :param int new_index: NewIndex (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_playlists_by_id_items_by_itemid_move_by_newindex_with_http_info(item_id, id, new_index, **kwargs)  # noqa: E501
        else:
            (data) = self.post_playlists_by_id_items_by_itemid_move_by_newindex_with_http_info(item_id, id, new_index, **kwargs)  # noqa: E501
            return data

    def post_playlists_by_id_items_by_itemid_move_by_newindex_with_http_info(self, item_id, id, new_index, **kwargs):  # noqa: E501
        """Moves a playlist item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_playlists_by_id_items_by_itemid_move_by_newindex_with_http_info(item_id, id, new_index, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int item_id: ItemId (required)
        :param str id: (required)
        :param int new_index: NewIndex (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['item_id', 'id', 'new_index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_playlists_by_id_items_by_itemid_move_by_newindex" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'item_id' is set
        if ('item_id' not in params or
                params['item_id'] is None):
            raise ValueError("Missing the required parameter `item_id` when calling `post_playlists_by_id_items_by_itemid_move_by_newindex`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_playlists_by_id_items_by_itemid_move_by_newindex`")  # noqa: E501
        # verify the required parameter 'new_index' is set
        if ('new_index' not in params or
                params['new_index'] is None):
            raise ValueError("Missing the required parameter `new_index` when calling `post_playlists_by_id_items_by_itemid_move_by_newindex`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'item_id' in params:
            path_params['ItemId'] = params['item_id']  # noqa: E501
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'new_index' in params:
            path_params['NewIndex'] = params['new_index']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Playlists/{Id}/Items/{ItemId}/Move/{NewIndex}', 'POST',
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

    def post_playlists_by_id_items_delete(self, id, entry_ids, **kwargs):  # noqa: E501
        """Removes items from a playlist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_playlists_by_id_items_delete(id, entry_ids, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str entry_ids: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_playlists_by_id_items_delete_with_http_info(id, entry_ids, **kwargs)  # noqa: E501
        else:
            (data) = self.post_playlists_by_id_items_delete_with_http_info(id, entry_ids, **kwargs)  # noqa: E501
            return data

    def post_playlists_by_id_items_delete_with_http_info(self, id, entry_ids, **kwargs):  # noqa: E501
        """Removes items from a playlist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_playlists_by_id_items_delete_with_http_info(id, entry_ids, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str entry_ids: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'entry_ids']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_playlists_by_id_items_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_playlists_by_id_items_delete`")  # noqa: E501
        # verify the required parameter 'entry_ids' is set
        if ('entry_ids' not in params or
                params['entry_ids'] is None):
            raise ValueError("Missing the required parameter `entry_ids` when calling `post_playlists_by_id_items_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'entry_ids' in params:
            query_params.append(('EntryIds', params['entry_ids']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Playlists/{Id}/Items/Delete', 'POST',
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
