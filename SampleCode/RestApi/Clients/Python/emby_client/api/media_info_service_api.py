# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class MediaInfoServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_items_by_id_playbackinfo(self, id, user_id, **kwargs):  # noqa: E501
        """Gets live playback media info for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_playbackinfo(id, user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str user_id: User Id (required)
        :return: PlaybackInfoResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_items_by_id_playbackinfo_with_http_info(id, user_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_items_by_id_playbackinfo_with_http_info(id, user_id, **kwargs)  # noqa: E501
            return data

    def get_items_by_id_playbackinfo_with_http_info(self, id, user_id, **kwargs):  # noqa: E501
        """Gets live playback media info for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_playbackinfo_with_http_info(id, user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str user_id: User Id (required)
        :return: PlaybackInfoResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'user_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_items_by_id_playbackinfo" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_items_by_id_playbackinfo`")  # noqa: E501
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `get_items_by_id_playbackinfo`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501

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
            '/Items/{Id}/PlaybackInfo', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PlaybackInfoResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_playback_bitratetest(self, size, **kwargs):  # noqa: E501
        """get_playback_bitratetest  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_playback_bitratetest(size, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int size: Size (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_playback_bitratetest_with_http_info(size, **kwargs)  # noqa: E501
        else:
            (data) = self.get_playback_bitratetest_with_http_info(size, **kwargs)  # noqa: E501
            return data

    def get_playback_bitratetest_with_http_info(self, size, **kwargs):  # noqa: E501
        """get_playback_bitratetest  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_playback_bitratetest_with_http_info(size, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int size: Size (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['size']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_playback_bitratetest" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'size' is set
        if ('size' not in params or
                params['size'] is None):
            raise ValueError("Missing the required parameter `size` when calling `get_playback_bitratetest`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'size' in params:
            query_params.append(('Size', params['size']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Playback/BitrateTest', 'GET',
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

    def post_items_by_id_playbackinfo(self, body, id, **kwargs):  # noqa: E501
        """Gets live playback media info for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_playbackinfo(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param PlaybackInfoRequest body: PlaybackInfoRequest:  (required)
        :param str id: (required)
        :return: PlaybackInfoResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_by_id_playbackinfo_with_http_info(body, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_by_id_playbackinfo_with_http_info(body, id, **kwargs)  # noqa: E501
            return data

    def post_items_by_id_playbackinfo_with_http_info(self, body, id, **kwargs):  # noqa: E501
        """Gets live playback media info for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_playbackinfo_with_http_info(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param PlaybackInfoRequest body: PlaybackInfoRequest:  (required)
        :param str id: (required)
        :return: PlaybackInfoResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_items_by_id_playbackinfo" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_items_by_id_playbackinfo`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_items_by_id_playbackinfo`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

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
            '/Items/{Id}/PlaybackInfo', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PlaybackInfoResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_livestreams_close(self, live_stream_id, **kwargs):  # noqa: E501
        """Closes a media source  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livestreams_close(live_stream_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str live_stream_id: LiveStreamId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livestreams_close_with_http_info(live_stream_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livestreams_close_with_http_info(live_stream_id, **kwargs)  # noqa: E501
            return data

    def post_livestreams_close_with_http_info(self, live_stream_id, **kwargs):  # noqa: E501
        """Closes a media source  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livestreams_close_with_http_info(live_stream_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str live_stream_id: LiveStreamId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['live_stream_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_livestreams_close" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'live_stream_id' is set
        if ('live_stream_id' not in params or
                params['live_stream_id'] is None):
            raise ValueError("Missing the required parameter `live_stream_id` when calling `post_livestreams_close`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'live_stream_id' in params:
            query_params.append(('LiveStreamId', params['live_stream_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveStreams/Close', 'POST',
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

    def post_livestreams_mediainfo(self, live_stream_id, **kwargs):  # noqa: E501
        """Closes a media source  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livestreams_mediainfo(live_stream_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str live_stream_id: LiveStreamId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livestreams_mediainfo_with_http_info(live_stream_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livestreams_mediainfo_with_http_info(live_stream_id, **kwargs)  # noqa: E501
            return data

    def post_livestreams_mediainfo_with_http_info(self, live_stream_id, **kwargs):  # noqa: E501
        """Closes a media source  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livestreams_mediainfo_with_http_info(live_stream_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str live_stream_id: LiveStreamId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['live_stream_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_livestreams_mediainfo" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'live_stream_id' is set
        if ('live_stream_id' not in params or
                params['live_stream_id'] is None):
            raise ValueError("Missing the required parameter `live_stream_id` when calling `post_livestreams_mediainfo`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'live_stream_id' in params:
            query_params.append(('LiveStreamId', params['live_stream_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveStreams/MediaInfo', 'POST',
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

    def post_livestreams_open(self, body, **kwargs):  # noqa: E501
        """Opens a media source  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livestreams_open(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveStreamRequest body: LiveStreamRequest:  (required)
        :return: LiveStreamResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livestreams_open_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livestreams_open_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_livestreams_open_with_http_info(self, body, **kwargs):  # noqa: E501
        """Opens a media source  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livestreams_open_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveStreamRequest body: LiveStreamRequest:  (required)
        :return: LiveStreamResponse
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
                    " to method post_livestreams_open" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_livestreams_open`")  # noqa: E501

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
            '/LiveStreams/Open', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='LiveStreamResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
