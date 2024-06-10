# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class BifServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_items_by_id_thumbnailset(self, width, id, **kwargs):  # noqa: E501
        """get_items_by_id_thumbnailset  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_thumbnailset(width, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int width: (required)
        :param str id: Item Id (required)
        :return: RokuMetadataApiThumbnailSetInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_items_by_id_thumbnailset_with_http_info(width, id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_items_by_id_thumbnailset_with_http_info(width, id, **kwargs)  # noqa: E501
            return data

    def get_items_by_id_thumbnailset_with_http_info(self, width, id, **kwargs):  # noqa: E501
        """get_items_by_id_thumbnailset  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_thumbnailset_with_http_info(width, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int width: (required)
        :param str id: Item Id (required)
        :return: RokuMetadataApiThumbnailSetInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['width', 'id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_items_by_id_thumbnailset" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'width' is set
        if ('width' not in params or
                params['width'] is None):
            raise ValueError("Missing the required parameter `width` when calling `get_items_by_id_thumbnailset`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_items_by_id_thumbnailset`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501

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
            '/Items/{Id}/ThumbnailSet', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='RokuMetadataApiThumbnailSetInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_videos_by_id_index_bif(self, width, id, **kwargs):  # noqa: E501
        """get_videos_by_id_index_bif  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_videos_by_id_index_bif(width, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int width: (required)
        :param str id: Item Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_videos_by_id_index_bif_with_http_info(width, id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_videos_by_id_index_bif_with_http_info(width, id, **kwargs)  # noqa: E501
            return data

    def get_videos_by_id_index_bif_with_http_info(self, width, id, **kwargs):  # noqa: E501
        """get_videos_by_id_index_bif  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_videos_by_id_index_bif_with_http_info(width, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int width: (required)
        :param str id: Item Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['width', 'id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_videos_by_id_index_bif" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'width' is set
        if ('width' not in params or
                params['width'] is None):
            raise ValueError("Missing the required parameter `width` when calling `get_videos_by_id_index_bif`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_videos_by_id_index_bif`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'width' in params:
            query_params.append(('Width', params['width']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Videos/{Id}/index.bif', 'GET',
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
