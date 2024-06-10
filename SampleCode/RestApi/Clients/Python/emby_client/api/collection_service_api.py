# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class CollectionServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def delete_collections_by_id_items(self, ids, id, **kwargs):  # noqa: E501
        """Removes items from a collection  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_collections_by_id_items(ids, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ids: Item id, comma delimited (required)
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_collections_by_id_items_with_http_info(ids, id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_collections_by_id_items_with_http_info(ids, id, **kwargs)  # noqa: E501
            return data

    def delete_collections_by_id_items_with_http_info(self, ids, id, **kwargs):  # noqa: E501
        """Removes items from a collection  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_collections_by_id_items_with_http_info(ids, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ids: Item id, comma delimited (required)
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ids', 'id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_collections_by_id_items" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'ids' is set
        if ('ids' not in params or
                params['ids'] is None):
            raise ValueError("Missing the required parameter `ids` when calling `delete_collections_by_id_items`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_collections_by_id_items`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'ids' in params:
            query_params.append(('Ids', params['ids']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Collections/{Id}/Items', 'DELETE',
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

    def post_collections(self, **kwargs):  # noqa: E501
        """Creates a new collection  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_collections(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool is_locked: Whether or not to lock the new collection.
        :param str name: The name of the new collection.
        :param str parent_id: Optional - create the collection within a specific folder
        :param str ids: Item Ids to add to the collection
        :return: CollectionsCollectionCreationResult
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_collections_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.post_collections_with_http_info(**kwargs)  # noqa: E501
            return data

    def post_collections_with_http_info(self, **kwargs):  # noqa: E501
        """Creates a new collection  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_collections_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool is_locked: Whether or not to lock the new collection.
        :param str name: The name of the new collection.
        :param str parent_id: Optional - create the collection within a specific folder
        :param str ids: Item Ids to add to the collection
        :return: CollectionsCollectionCreationResult
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['is_locked', 'name', 'parent_id', 'ids']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_collections" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'is_locked' in params:
            query_params.append(('IsLocked', params['is_locked']))  # noqa: E501
        if 'name' in params:
            query_params.append(('Name', params['name']))  # noqa: E501
        if 'parent_id' in params:
            query_params.append(('ParentId', params['parent_id']))  # noqa: E501
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
            '/Collections', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='CollectionsCollectionCreationResult',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_collections_by_id_items(self, ids, id, **kwargs):  # noqa: E501
        """Adds items to a collection  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_collections_by_id_items(ids, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ids: Item id, comma delimited (required)
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_collections_by_id_items_with_http_info(ids, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_collections_by_id_items_with_http_info(ids, id, **kwargs)  # noqa: E501
            return data

    def post_collections_by_id_items_with_http_info(self, ids, id, **kwargs):  # noqa: E501
        """Adds items to a collection  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_collections_by_id_items_with_http_info(ids, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ids: Item id, comma delimited (required)
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ids', 'id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_collections_by_id_items" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'ids' is set
        if ('ids' not in params or
                params['ids'] is None):
            raise ValueError("Missing the required parameter `ids` when calling `post_collections_by_id_items`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_collections_by_id_items`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'ids' in params:
            query_params.append(('Ids', params['ids']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Collections/{Id}/Items', 'POST',
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

    def post_collections_by_id_items_delete(self, ids, id, **kwargs):  # noqa: E501
        """Removes items from a collection  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_collections_by_id_items_delete(ids, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ids: Item id, comma delimited (required)
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_collections_by_id_items_delete_with_http_info(ids, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_collections_by_id_items_delete_with_http_info(ids, id, **kwargs)  # noqa: E501
            return data

    def post_collections_by_id_items_delete_with_http_info(self, ids, id, **kwargs):  # noqa: E501
        """Removes items from a collection  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_collections_by_id_items_delete_with_http_info(ids, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ids: Item id, comma delimited (required)
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ids', 'id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_collections_by_id_items_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'ids' is set
        if ('ids' not in params or
                params['ids'] is None):
            raise ValueError("Missing the required parameter `ids` when calling `post_collections_by_id_items_delete`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_collections_by_id_items_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'ids' in params:
            query_params.append(('Ids', params['ids']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Collections/{Id}/Items/Delete', 'POST',
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
