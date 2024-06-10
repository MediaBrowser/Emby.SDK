# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class ItemRefreshServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def post_items_by_id_refresh(self, id, **kwargs):  # noqa: E501
        """Refreshes metadata for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_refresh(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param bool recursive: Indicates if the refresh should occur recursively.
        :param MetadataRefreshMode metadata_refresh_mode: Specifies the metadata refresh mode
        :param MetadataRefreshMode image_refresh_mode: Specifies the image refresh mode
        :param bool replace_all_metadata: Determines if metadata should be replaced. Only applicable if mode is FullRefresh
        :param bool replace_all_images: Determines if images should be replaced. Only applicable if mode is FullRefresh
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_by_id_refresh_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_by_id_refresh_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def post_items_by_id_refresh_with_http_info(self, id, **kwargs):  # noqa: E501
        """Refreshes metadata for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_refresh_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param bool recursive: Indicates if the refresh should occur recursively.
        :param MetadataRefreshMode metadata_refresh_mode: Specifies the metadata refresh mode
        :param MetadataRefreshMode image_refresh_mode: Specifies the image refresh mode
        :param bool replace_all_metadata: Determines if metadata should be replaced. Only applicable if mode is FullRefresh
        :param bool replace_all_images: Determines if images should be replaced. Only applicable if mode is FullRefresh
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'recursive', 'metadata_refresh_mode', 'image_refresh_mode', 'replace_all_metadata', 'replace_all_images']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_items_by_id_refresh" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_items_by_id_refresh`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'recursive' in params:
            query_params.append(('Recursive', params['recursive']))  # noqa: E501
        if 'metadata_refresh_mode' in params:
            query_params.append(('MetadataRefreshMode', params['metadata_refresh_mode']))  # noqa: E501
        if 'image_refresh_mode' in params:
            query_params.append(('ImageRefreshMode', params['image_refresh_mode']))  # noqa: E501
        if 'replace_all_metadata' in params:
            query_params.append(('ReplaceAllMetadata', params['replace_all_metadata']))  # noqa: E501
        if 'replace_all_images' in params:
            query_params.append(('ReplaceAllImages', params['replace_all_images']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/Refresh', 'POST',
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
