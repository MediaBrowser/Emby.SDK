# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class VideoHlsServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_audio_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer(self, segment_container, segment_id, id, playlist_id, **kwargs):  # noqa: E501
        """get_audio_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_audio_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer(segment_container, segment_id, id, playlist_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str segment_container: (required)
        :param str segment_id: (required)
        :param str id: (required)
        :param str playlist_id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_audio_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer_with_http_info(segment_container, segment_id, id, playlist_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_audio_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer_with_http_info(segment_container, segment_id, id, playlist_id, **kwargs)  # noqa: E501
            return data

    def get_audio_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer_with_http_info(self, segment_container, segment_id, id, playlist_id, **kwargs):  # noqa: E501
        """get_audio_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_audio_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer_with_http_info(segment_container, segment_id, id, playlist_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str segment_container: (required)
        :param str segment_id: (required)
        :param str id: (required)
        :param str playlist_id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['segment_container', 'segment_id', 'id', 'playlist_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_audio_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'segment_container' is set
        if ('segment_container' not in params or
                params['segment_container'] is None):
            raise ValueError("Missing the required parameter `segment_container` when calling `get_audio_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer`")  # noqa: E501
        # verify the required parameter 'segment_id' is set
        if ('segment_id' not in params or
                params['segment_id'] is None):
            raise ValueError("Missing the required parameter `segment_id` when calling `get_audio_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_audio_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer`")  # noqa: E501
        # verify the required parameter 'playlist_id' is set
        if ('playlist_id' not in params or
                params['playlist_id'] is None):
            raise ValueError("Missing the required parameter `playlist_id` when calling `get_audio_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'segment_container' in params:
            path_params['SegmentContainer'] = params['segment_container']  # noqa: E501
        if 'segment_id' in params:
            path_params['SegmentId'] = params['segment_id']  # noqa: E501
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'playlist_id' in params:
            path_params['PlaylistId'] = params['playlist_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Audio/{Id}/hls/{PlaylistId}/{SegmentId}.{SegmentContainer}', 'GET',
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

    def get_videos_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer(self, segment_container, segment_id, id, playlist_id, **kwargs):  # noqa: E501
        """get_videos_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_videos_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer(segment_container, segment_id, id, playlist_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str segment_container: (required)
        :param str segment_id: (required)
        :param str id: (required)
        :param str playlist_id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_videos_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer_with_http_info(segment_container, segment_id, id, playlist_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_videos_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer_with_http_info(segment_container, segment_id, id, playlist_id, **kwargs)  # noqa: E501
            return data

    def get_videos_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer_with_http_info(self, segment_container, segment_id, id, playlist_id, **kwargs):  # noqa: E501
        """get_videos_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_videos_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer_with_http_info(segment_container, segment_id, id, playlist_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str segment_container: (required)
        :param str segment_id: (required)
        :param str id: (required)
        :param str playlist_id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['segment_container', 'segment_id', 'id', 'playlist_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_videos_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'segment_container' is set
        if ('segment_container' not in params or
                params['segment_container'] is None):
            raise ValueError("Missing the required parameter `segment_container` when calling `get_videos_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer`")  # noqa: E501
        # verify the required parameter 'segment_id' is set
        if ('segment_id' not in params or
                params['segment_id'] is None):
            raise ValueError("Missing the required parameter `segment_id` when calling `get_videos_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_videos_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer`")  # noqa: E501
        # verify the required parameter 'playlist_id' is set
        if ('playlist_id' not in params or
                params['playlist_id'] is None):
            raise ValueError("Missing the required parameter `playlist_id` when calling `get_videos_by_id_hls_by_playlistid_by_segmentid_by_segmentcontainer`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'segment_container' in params:
            path_params['SegmentContainer'] = params['segment_container']  # noqa: E501
        if 'segment_id' in params:
            path_params['SegmentId'] = params['segment_id']  # noqa: E501
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'playlist_id' in params:
            path_params['PlaylistId'] = params['playlist_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Videos/{Id}/hls/{PlaylistId}/{SegmentId}.{SegmentContainer}', 'GET',
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
