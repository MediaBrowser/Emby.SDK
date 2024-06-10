# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class RemoteImageServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_images_remote(self, image_url, **kwargs):  # noqa: E501
        """Gets a remote image  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_images_remote(image_url, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str image_url: The image url (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_images_remote_with_http_info(image_url, **kwargs)  # noqa: E501
        else:
            (data) = self.get_images_remote_with_http_info(image_url, **kwargs)  # noqa: E501
            return data

    def get_images_remote_with_http_info(self, image_url, **kwargs):  # noqa: E501
        """Gets a remote image  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_images_remote_with_http_info(image_url, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str image_url: The image url (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['image_url']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_images_remote" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'image_url' is set
        if ('image_url' not in params or
                params['image_url'] is None):
            raise ValueError("Missing the required parameter `image_url` when calling `get_images_remote`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'image_url' in params:
            query_params.append(('ImageUrl', params['image_url']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Images/Remote', 'GET',
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

    def get_items_by_id_remoteimages(self, id, **kwargs):  # noqa: E501
        """Gets available remote images for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_remoteimages(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param ImageType type: The image type
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str provider_name: Optional. The image provider to use
        :param bool include_all_languages: Optional.
        :return: RemoteImageResult
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_items_by_id_remoteimages_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_items_by_id_remoteimages_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_items_by_id_remoteimages_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets available remote images for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_remoteimages_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param ImageType type: The image type
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str provider_name: Optional. The image provider to use
        :param bool include_all_languages: Optional.
        :return: RemoteImageResult
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'type', 'start_index', 'limit', 'provider_name', 'include_all_languages']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_items_by_id_remoteimages" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_items_by_id_remoteimages`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'type' in params:
            query_params.append(('Type', params['type']))  # noqa: E501
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'provider_name' in params:
            query_params.append(('ProviderName', params['provider_name']))  # noqa: E501
        if 'include_all_languages' in params:
            query_params.append(('IncludeAllLanguages', params['include_all_languages']))  # noqa: E501

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
            '/Items/{Id}/RemoteImages', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='RemoteImageResult',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_items_by_id_remoteimages_providers(self, id, **kwargs):  # noqa: E501
        """Gets available remote image providers for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_remoteimages_providers(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :return: list[ImageProviderInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_items_by_id_remoteimages_providers_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_items_by_id_remoteimages_providers_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_items_by_id_remoteimages_providers_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets available remote image providers for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_remoteimages_providers_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :return: list[ImageProviderInfo]
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
                    " to method get_items_by_id_remoteimages_providers" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_items_by_id_remoteimages_providers`")  # noqa: E501

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
            '/Items/{Id}/RemoteImages/Providers', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[ImageProviderInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_items_by_id_remoteimages_download(self, body, type, id, **kwargs):  # noqa: E501
        """Downloads a remote image for an item  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_remoteimages_download(body, type, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ImagesBaseDownloadRemoteImage body: BaseDownloadRemoteImage:  (required)
        :param ImageType type: The image type (required)
        :param str id: Item Id (required)
        :param str provider_name: The image provider
        :param str image_url: The image url
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_by_id_remoteimages_download_with_http_info(body, type, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_by_id_remoteimages_download_with_http_info(body, type, id, **kwargs)  # noqa: E501
            return data

    def post_items_by_id_remoteimages_download_with_http_info(self, body, type, id, **kwargs):  # noqa: E501
        """Downloads a remote image for an item  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_remoteimages_download_with_http_info(body, type, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ImagesBaseDownloadRemoteImage body: BaseDownloadRemoteImage:  (required)
        :param ImageType type: The image type (required)
        :param str id: Item Id (required)
        :param str provider_name: The image provider
        :param str image_url: The image url
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'type', 'id', 'provider_name', 'image_url']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_items_by_id_remoteimages_download" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_by_id_remoteimages_download`")  # noqa: E501
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `post_items_by_id_remoteimages_download`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_items_by_id_remoteimages_download`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'type' in params:
            query_params.append(('Type', params['type']))  # noqa: E501
        if 'provider_name' in params:
            query_params.append(('ProviderName', params['provider_name']))  # noqa: E501
        if 'image_url' in params:
            query_params.append(('ImageUrl', params['image_url']))  # noqa: E501

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
            '/Items/{Id}/RemoteImages/Download', 'POST',
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
