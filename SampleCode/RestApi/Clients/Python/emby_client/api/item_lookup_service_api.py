# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class ItemLookupServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_items_by_id_externalidinfos(self, id, **kwargs):  # noqa: E501
        """Gets external id infos for an item  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_externalidinfos(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :return: list[ExternalIdInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_items_by_id_externalidinfos_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_items_by_id_externalidinfos_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_items_by_id_externalidinfos_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets external id infos for an item  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_externalidinfos_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :return: list[ExternalIdInfo]
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
                    " to method get_items_by_id_externalidinfos" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_items_by_id_externalidinfos`")  # noqa: E501

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
            '/Items/{Id}/ExternalIdInfos', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[ExternalIdInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_items_remotesearch_image(self, image_url, provider_name, **kwargs):  # noqa: E501
        """Gets a remote image  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_remotesearch_image(image_url, provider_name, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str image_url: The image url (required)
        :param str provider_name: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_items_remotesearch_image_with_http_info(image_url, provider_name, **kwargs)  # noqa: E501
        else:
            (data) = self.get_items_remotesearch_image_with_http_info(image_url, provider_name, **kwargs)  # noqa: E501
            return data

    def get_items_remotesearch_image_with_http_info(self, image_url, provider_name, **kwargs):  # noqa: E501
        """Gets a remote image  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_remotesearch_image_with_http_info(image_url, provider_name, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str image_url: The image url (required)
        :param str provider_name: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['image_url', 'provider_name']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_items_remotesearch_image" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'image_url' is set
        if ('image_url' not in params or
                params['image_url'] is None):
            raise ValueError("Missing the required parameter `image_url` when calling `get_items_remotesearch_image`")  # noqa: E501
        # verify the required parameter 'provider_name' is set
        if ('provider_name' not in params or
                params['provider_name'] is None):
            raise ValueError("Missing the required parameter `provider_name` when calling `get_items_remotesearch_image`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'image_url' in params:
            query_params.append(('ImageUrl', params['image_url']))  # noqa: E501
        if 'provider_name' in params:
            query_params.append(('ProviderName', params['provider_name']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/RemoteSearch/Image', 'GET',
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

    def post_items_metadata_reset(self, item_ids, **kwargs):  # noqa: E501
        """Resets metadata for one or more items  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_metadata_reset(item_ids, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str item_ids: The item ids (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_metadata_reset_with_http_info(item_ids, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_metadata_reset_with_http_info(item_ids, **kwargs)  # noqa: E501
            return data

    def post_items_metadata_reset_with_http_info(self, item_ids, **kwargs):  # noqa: E501
        """Resets metadata for one or more items  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_metadata_reset_with_http_info(item_ids, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str item_ids: The item ids (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['item_ids']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_items_metadata_reset" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'item_ids' is set
        if ('item_ids' not in params or
                params['item_ids'] is None):
            raise ValueError("Missing the required parameter `item_ids` when calling `post_items_metadata_reset`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'item_ids' in params:
            query_params.append(('ItemIds', params['item_ids']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/Metadata/Reset', 'POST',
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

    def post_items_remotesearch_apply_by_id(self, body, id, **kwargs):  # noqa: E501
        """Applies search criteria to an item and refreshes metadata  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_apply_by_id(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchResult body: RemoteSearchResult:  (required)
        :param str id: The item id (required)
        :param bool replace_all_images: Whether or not to replace all images
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_remotesearch_apply_by_id_with_http_info(body, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_remotesearch_apply_by_id_with_http_info(body, id, **kwargs)  # noqa: E501
            return data

    def post_items_remotesearch_apply_by_id_with_http_info(self, body, id, **kwargs):  # noqa: E501
        """Applies search criteria to an item and refreshes metadata  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_apply_by_id_with_http_info(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchResult body: RemoteSearchResult:  (required)
        :param str id: The item id (required)
        :param bool replace_all_images: Whether or not to replace all images
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'id', 'replace_all_images']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_items_remotesearch_apply_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_remotesearch_apply_by_id`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_items_remotesearch_apply_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'replace_all_images' in params:
            query_params.append(('ReplaceAllImages', params['replace_all_images']))  # noqa: E501

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
            '/Items/RemoteSearch/Apply/{Id}', 'POST',
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

    def post_items_remotesearch_book(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_book  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_book(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryBookInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_remotesearch_book_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_remotesearch_book_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_items_remotesearch_book_with_http_info(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_book  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_book_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryBookInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
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
                    " to method post_items_remotesearch_book" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_remotesearch_book`")  # noqa: E501

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
            '/Items/RemoteSearch/Book', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[RemoteSearchResult]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_items_remotesearch_boxset(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_boxset  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_boxset(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryItemLookupInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_remotesearch_boxset_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_remotesearch_boxset_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_items_remotesearch_boxset_with_http_info(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_boxset  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_boxset_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryItemLookupInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
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
                    " to method post_items_remotesearch_boxset" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_remotesearch_boxset`")  # noqa: E501

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
            '/Items/RemoteSearch/BoxSet', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[RemoteSearchResult]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_items_remotesearch_game(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_game  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_game(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryGameInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_remotesearch_game_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_remotesearch_game_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_items_remotesearch_game_with_http_info(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_game  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_game_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryGameInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
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
                    " to method post_items_remotesearch_game" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_remotesearch_game`")  # noqa: E501

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
            '/Items/RemoteSearch/Game', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[RemoteSearchResult]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_items_remotesearch_movie(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_movie  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_movie(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryMovieInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_remotesearch_movie_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_remotesearch_movie_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_items_remotesearch_movie_with_http_info(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_movie  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_movie_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryMovieInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
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
                    " to method post_items_remotesearch_movie" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_remotesearch_movie`")  # noqa: E501

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
            '/Items/RemoteSearch/Movie', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[RemoteSearchResult]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_items_remotesearch_musicalbum(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_musicalbum  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_musicalbum(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryAlbumInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_remotesearch_musicalbum_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_remotesearch_musicalbum_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_items_remotesearch_musicalbum_with_http_info(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_musicalbum  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_musicalbum_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryAlbumInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
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
                    " to method post_items_remotesearch_musicalbum" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_remotesearch_musicalbum`")  # noqa: E501

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
            '/Items/RemoteSearch/MusicAlbum', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[RemoteSearchResult]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_items_remotesearch_musicartist(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_musicartist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_musicartist(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryArtistInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_remotesearch_musicartist_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_remotesearch_musicartist_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_items_remotesearch_musicartist_with_http_info(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_musicartist  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_musicartist_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryArtistInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
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
                    " to method post_items_remotesearch_musicartist" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_remotesearch_musicartist`")  # noqa: E501

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
            '/Items/RemoteSearch/MusicArtist', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[RemoteSearchResult]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_items_remotesearch_musicvideo(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_musicvideo  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_musicvideo(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryMusicVideoInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_remotesearch_musicvideo_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_remotesearch_musicvideo_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_items_remotesearch_musicvideo_with_http_info(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_musicvideo  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_musicvideo_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryMusicVideoInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
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
                    " to method post_items_remotesearch_musicvideo" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_remotesearch_musicvideo`")  # noqa: E501

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
            '/Items/RemoteSearch/MusicVideo', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[RemoteSearchResult]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_items_remotesearch_person(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_person  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_person(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryPersonLookupInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_remotesearch_person_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_remotesearch_person_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_items_remotesearch_person_with_http_info(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_person  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_person_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryPersonLookupInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
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
                    " to method post_items_remotesearch_person" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_remotesearch_person`")  # noqa: E501

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
            '/Items/RemoteSearch/Person', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[RemoteSearchResult]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_items_remotesearch_series(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_series  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_series(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQuerySeriesInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_remotesearch_series_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_remotesearch_series_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_items_remotesearch_series_with_http_info(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_series  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_series_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQuerySeriesInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
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
                    " to method post_items_remotesearch_series" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_remotesearch_series`")  # noqa: E501

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
            '/Items/RemoteSearch/Series', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[RemoteSearchResult]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_items_remotesearch_trailer(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_trailer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_trailer(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryTrailerInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_remotesearch_trailer_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_remotesearch_trailer_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_items_remotesearch_trailer_with_http_info(self, body, **kwargs):  # noqa: E501
        """post_items_remotesearch_trailer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_remotesearch_trailer_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param RemoteSearchQueryTrailerInfo body: RemoteSearchQuery`1:  (required)
        :return: list[RemoteSearchResult]
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
                    " to method post_items_remotesearch_trailer" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_remotesearch_trailer`")  # noqa: E501

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
            '/Items/RemoteSearch/Trailer', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[RemoteSearchResult]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
