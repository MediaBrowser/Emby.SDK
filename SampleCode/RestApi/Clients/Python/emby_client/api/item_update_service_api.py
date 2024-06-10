# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class ItemUpdateServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_items_by_itemid_metadataeditor(self, item_id, **kwargs):  # noqa: E501
        """Gets metadata editor info for an item  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_itemid_metadataeditor(item_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str item_id: The id of the item (required)
        :return: MetadataEditorInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_items_by_itemid_metadataeditor_with_http_info(item_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_items_by_itemid_metadataeditor_with_http_info(item_id, **kwargs)  # noqa: E501
            return data

    def get_items_by_itemid_metadataeditor_with_http_info(self, item_id, **kwargs):  # noqa: E501
        """Gets metadata editor info for an item  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_itemid_metadataeditor_with_http_info(item_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str item_id: The id of the item (required)
        :return: MetadataEditorInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['item_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_items_by_itemid_metadataeditor" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'item_id' is set
        if ('item_id' not in params or
                params['item_id'] is None):
            raise ValueError("Missing the required parameter `item_id` when calling `get_items_by_itemid_metadataeditor`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'item_id' in params:
            path_params['ItemId'] = params['item_id']  # noqa: E501

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
            '/Items/{ItemId}/MetadataEditor', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='MetadataEditorInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_items_by_itemid(self, body, item_id, **kwargs):  # noqa: E501
        """Updates an item  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_itemid(body, item_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param BaseItemDto body: BaseItemDto:  (required)
        :param str item_id: The id of the item (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_by_itemid_with_http_info(body, item_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_by_itemid_with_http_info(body, item_id, **kwargs)  # noqa: E501
            return data

    def post_items_by_itemid_with_http_info(self, body, item_id, **kwargs):  # noqa: E501
        """Updates an item  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_itemid_with_http_info(body, item_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param BaseItemDto body: BaseItemDto:  (required)
        :param str item_id: The id of the item (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'item_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_items_by_itemid" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_by_itemid`")  # noqa: E501
        # verify the required parameter 'item_id' is set
        if ('item_id' not in params or
                params['item_id'] is None):
            raise ValueError("Missing the required parameter `item_id` when calling `post_items_by_itemid`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'item_id' in params:
            path_params['ItemId'] = params['item_id']  # noqa: E501

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
            '/Items/{ItemId}', 'POST',
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
