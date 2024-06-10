# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class PlaystateServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def delete_users_by_userid_playeditems_by_id(self, user_id, id, **kwargs):  # noqa: E501
        """Marks an item as unplayed  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_users_by_userid_playeditems_by_id(user_id, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param str id: Item Id (required)
        :return: UserItemDataDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_users_by_userid_playeditems_by_id_with_http_info(user_id, id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_users_by_userid_playeditems_by_id_with_http_info(user_id, id, **kwargs)  # noqa: E501
            return data

    def delete_users_by_userid_playeditems_by_id_with_http_info(self, user_id, id, **kwargs):  # noqa: E501
        """Marks an item as unplayed  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_users_by_userid_playeditems_by_id_with_http_info(user_id, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param str id: Item Id (required)
        :return: UserItemDataDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['user_id', 'id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_users_by_userid_playeditems_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `delete_users_by_userid_playeditems_by_id`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_users_by_userid_playeditems_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501
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
            '/Users/{UserId}/PlayedItems/{Id}', 'DELETE',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='UserItemDataDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def delete_users_by_userid_playingitems_by_id(self, user_id, id, media_source_id, next_media_type, **kwargs):  # noqa: E501
        """Reports that a user has stopped playing an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_users_by_userid_playingitems_by_id(user_id, id, media_source_id, next_media_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param str id: Item Id (required)
        :param str media_source_id: The id of the MediaSource (required)
        :param str next_media_type: The next media type that will play (required)
        :param int position_ticks: Optional. The position, in ticks, where playback stopped. 1ms = 10000 ticks.
        :param str live_stream_id:
        :param str play_session_id:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_users_by_userid_playingitems_by_id_with_http_info(user_id, id, media_source_id, next_media_type, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_users_by_userid_playingitems_by_id_with_http_info(user_id, id, media_source_id, next_media_type, **kwargs)  # noqa: E501
            return data

    def delete_users_by_userid_playingitems_by_id_with_http_info(self, user_id, id, media_source_id, next_media_type, **kwargs):  # noqa: E501
        """Reports that a user has stopped playing an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_users_by_userid_playingitems_by_id_with_http_info(user_id, id, media_source_id, next_media_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param str id: Item Id (required)
        :param str media_source_id: The id of the MediaSource (required)
        :param str next_media_type: The next media type that will play (required)
        :param int position_ticks: Optional. The position, in ticks, where playback stopped. 1ms = 10000 ticks.
        :param str live_stream_id:
        :param str play_session_id:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['user_id', 'id', 'media_source_id', 'next_media_type', 'position_ticks', 'live_stream_id', 'play_session_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_users_by_userid_playingitems_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `delete_users_by_userid_playingitems_by_id`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_users_by_userid_playingitems_by_id`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `delete_users_by_userid_playingitems_by_id`")  # noqa: E501
        # verify the required parameter 'next_media_type' is set
        if ('next_media_type' not in params or
                params['next_media_type'] is None):
            raise ValueError("Missing the required parameter `next_media_type` when calling `delete_users_by_userid_playingitems_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'media_source_id' in params:
            query_params.append(('MediaSourceId', params['media_source_id']))  # noqa: E501
        if 'next_media_type' in params:
            query_params.append(('NextMediaType', params['next_media_type']))  # noqa: E501
        if 'position_ticks' in params:
            query_params.append(('PositionTicks', params['position_ticks']))  # noqa: E501
        if 'live_stream_id' in params:
            query_params.append(('LiveStreamId', params['live_stream_id']))  # noqa: E501
        if 'play_session_id' in params:
            query_params.append(('PlaySessionId', params['play_session_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{UserId}/PlayingItems/{Id}', 'DELETE',
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

    def post_sessions_playing(self, body, **kwargs):  # noqa: E501
        """Reports playback has started within a session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_playing(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param PlaybackStartInfo body: PlaybackStartInfo:  (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_playing_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_playing_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_sessions_playing_with_http_info(self, body, **kwargs):  # noqa: E501
        """Reports playback has started within a session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_playing_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param PlaybackStartInfo body: PlaybackStartInfo:  (required)
        :return: None
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
                    " to method post_sessions_playing" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_sessions_playing`")  # noqa: E501

        collection_formats = {}

        path_params = {}

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
            '/Sessions/Playing', 'POST',
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

    def post_sessions_playing_ping(self, **kwargs):  # noqa: E501
        """Pings a playback session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_playing_ping(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str play_session_id:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_playing_ping_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_playing_ping_with_http_info(**kwargs)  # noqa: E501
            return data

    def post_sessions_playing_ping_with_http_info(self, **kwargs):  # noqa: E501
        """Pings a playback session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_playing_ping_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str play_session_id:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['play_session_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sessions_playing_ping" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'play_session_id' in params:
            query_params.append(('PlaySessionId', params['play_session_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Sessions/Playing/Ping', 'POST',
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

    def post_sessions_playing_progress(self, body, **kwargs):  # noqa: E501
        """Reports playback progress within a session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_playing_progress(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param PlaybackProgressInfo body: PlaybackProgressInfo:  (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_playing_progress_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_playing_progress_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_sessions_playing_progress_with_http_info(self, body, **kwargs):  # noqa: E501
        """Reports playback progress within a session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_playing_progress_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param PlaybackProgressInfo body: PlaybackProgressInfo:  (required)
        :return: None
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
                    " to method post_sessions_playing_progress" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_sessions_playing_progress`")  # noqa: E501

        collection_formats = {}

        path_params = {}

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
            '/Sessions/Playing/Progress', 'POST',
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

    def post_sessions_playing_stopped(self, body, **kwargs):  # noqa: E501
        """Reports playback has stopped within a session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_playing_stopped(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param PlaybackStopInfo body: PlaybackStopInfo:  (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sessions_playing_stopped_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sessions_playing_stopped_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_sessions_playing_stopped_with_http_info(self, body, **kwargs):  # noqa: E501
        """Reports playback has stopped within a session  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sessions_playing_stopped_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param PlaybackStopInfo body: PlaybackStopInfo:  (required)
        :return: None
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
                    " to method post_sessions_playing_stopped" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_sessions_playing_stopped`")  # noqa: E501

        collection_formats = {}

        path_params = {}

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
            '/Sessions/Playing/Stopped', 'POST',
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

    def post_users_by_userid_items_by_itemid_userdata(self, body, user_id, item_id, **kwargs):  # noqa: E501
        """Updates userdata for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_userid_items_by_itemid_userdata(body, user_id, item_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param UserItemDataDto body: UserItemDataDto:  (required)
        :param str user_id: User Id (required)
        :param str item_id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_userid_items_by_itemid_userdata_with_http_info(body, user_id, item_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_userid_items_by_itemid_userdata_with_http_info(body, user_id, item_id, **kwargs)  # noqa: E501
            return data

    def post_users_by_userid_items_by_itemid_userdata_with_http_info(self, body, user_id, item_id, **kwargs):  # noqa: E501
        """Updates userdata for an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_userid_items_by_itemid_userdata_with_http_info(body, user_id, item_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param UserItemDataDto body: UserItemDataDto:  (required)
        :param str user_id: User Id (required)
        :param str item_id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'user_id', 'item_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_users_by_userid_items_by_itemid_userdata" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_users_by_userid_items_by_itemid_userdata`")  # noqa: E501
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `post_users_by_userid_items_by_itemid_userdata`")  # noqa: E501
        # verify the required parameter 'item_id' is set
        if ('item_id' not in params or
                params['item_id'] is None):
            raise ValueError("Missing the required parameter `item_id` when calling `post_users_by_userid_items_by_itemid_userdata`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501
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
            '/Users/{UserId}/Items/{ItemId}/UserData', 'POST',
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

    def post_users_by_userid_playeditems_by_id(self, user_id, id, **kwargs):  # noqa: E501
        """Marks an item as played  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_userid_playeditems_by_id(user_id, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param str id: Item Id (required)
        :param str date_played: The date the item was played (if any). Format = yyyyMMddHHmmss
        :return: UserItemDataDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_userid_playeditems_by_id_with_http_info(user_id, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_userid_playeditems_by_id_with_http_info(user_id, id, **kwargs)  # noqa: E501
            return data

    def post_users_by_userid_playeditems_by_id_with_http_info(self, user_id, id, **kwargs):  # noqa: E501
        """Marks an item as played  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_userid_playeditems_by_id_with_http_info(user_id, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param str id: Item Id (required)
        :param str date_played: The date the item was played (if any). Format = yyyyMMddHHmmss
        :return: UserItemDataDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['user_id', 'id', 'date_played']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_users_by_userid_playeditems_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `post_users_by_userid_playeditems_by_id`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_userid_playeditems_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'date_played' in params:
            query_params.append(('DatePlayed', params['date_played']))  # noqa: E501

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
            '/Users/{UserId}/PlayedItems/{Id}', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='UserItemDataDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_users_by_userid_playeditems_by_id_delete(self, user_id, id, **kwargs):  # noqa: E501
        """Marks an item as unplayed  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_userid_playeditems_by_id_delete(user_id, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param str id: Item Id (required)
        :return: UserItemDataDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_userid_playeditems_by_id_delete_with_http_info(user_id, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_userid_playeditems_by_id_delete_with_http_info(user_id, id, **kwargs)  # noqa: E501
            return data

    def post_users_by_userid_playeditems_by_id_delete_with_http_info(self, user_id, id, **kwargs):  # noqa: E501
        """Marks an item as unplayed  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_userid_playeditems_by_id_delete_with_http_info(user_id, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param str id: Item Id (required)
        :return: UserItemDataDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['user_id', 'id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_users_by_userid_playeditems_by_id_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `post_users_by_userid_playeditems_by_id_delete`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_userid_playeditems_by_id_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501
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
            '/Users/{UserId}/PlayedItems/{Id}/Delete', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='UserItemDataDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_users_by_userid_playingitems_by_id(self, user_id, id, media_source_id, **kwargs):  # noqa: E501
        """Reports that a user has begun playing an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_userid_playingitems_by_id(user_id, id, media_source_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param str id: Item Id (required)
        :param str media_source_id: The id of the MediaSource (required)
        :param bool can_seek: Indicates if the client can seek
        :param int audio_stream_index:
        :param int subtitle_stream_index:
        :param PlayMethod play_method:
        :param str live_stream_id:
        :param str play_session_id:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_userid_playingitems_by_id_with_http_info(user_id, id, media_source_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_userid_playingitems_by_id_with_http_info(user_id, id, media_source_id, **kwargs)  # noqa: E501
            return data

    def post_users_by_userid_playingitems_by_id_with_http_info(self, user_id, id, media_source_id, **kwargs):  # noqa: E501
        """Reports that a user has begun playing an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_userid_playingitems_by_id_with_http_info(user_id, id, media_source_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param str id: Item Id (required)
        :param str media_source_id: The id of the MediaSource (required)
        :param bool can_seek: Indicates if the client can seek
        :param int audio_stream_index:
        :param int subtitle_stream_index:
        :param PlayMethod play_method:
        :param str live_stream_id:
        :param str play_session_id:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['user_id', 'id', 'media_source_id', 'can_seek', 'audio_stream_index', 'subtitle_stream_index', 'play_method', 'live_stream_id', 'play_session_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_users_by_userid_playingitems_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `post_users_by_userid_playingitems_by_id`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_userid_playingitems_by_id`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `post_users_by_userid_playingitems_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'media_source_id' in params:
            query_params.append(('MediaSourceId', params['media_source_id']))  # noqa: E501
        if 'can_seek' in params:
            query_params.append(('CanSeek', params['can_seek']))  # noqa: E501
        if 'audio_stream_index' in params:
            query_params.append(('AudioStreamIndex', params['audio_stream_index']))  # noqa: E501
        if 'subtitle_stream_index' in params:
            query_params.append(('SubtitleStreamIndex', params['subtitle_stream_index']))  # noqa: E501
        if 'play_method' in params:
            query_params.append(('PlayMethod', params['play_method']))  # noqa: E501
        if 'live_stream_id' in params:
            query_params.append(('LiveStreamId', params['live_stream_id']))  # noqa: E501
        if 'play_session_id' in params:
            query_params.append(('PlaySessionId', params['play_session_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{UserId}/PlayingItems/{Id}', 'POST',
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

    def post_users_by_userid_playingitems_by_id_delete(self, user_id, id, media_source_id, next_media_type, **kwargs):  # noqa: E501
        """Reports that a user has stopped playing an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_userid_playingitems_by_id_delete(user_id, id, media_source_id, next_media_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param str id: Item Id (required)
        :param str media_source_id: The id of the MediaSource (required)
        :param str next_media_type: The next media type that will play (required)
        :param int position_ticks: Optional. The position, in ticks, where playback stopped. 1ms = 10000 ticks.
        :param str live_stream_id:
        :param str play_session_id:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_userid_playingitems_by_id_delete_with_http_info(user_id, id, media_source_id, next_media_type, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_userid_playingitems_by_id_delete_with_http_info(user_id, id, media_source_id, next_media_type, **kwargs)  # noqa: E501
            return data

    def post_users_by_userid_playingitems_by_id_delete_with_http_info(self, user_id, id, media_source_id, next_media_type, **kwargs):  # noqa: E501
        """Reports that a user has stopped playing an item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_userid_playingitems_by_id_delete_with_http_info(user_id, id, media_source_id, next_media_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param str id: Item Id (required)
        :param str media_source_id: The id of the MediaSource (required)
        :param str next_media_type: The next media type that will play (required)
        :param int position_ticks: Optional. The position, in ticks, where playback stopped. 1ms = 10000 ticks.
        :param str live_stream_id:
        :param str play_session_id:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['user_id', 'id', 'media_source_id', 'next_media_type', 'position_ticks', 'live_stream_id', 'play_session_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_users_by_userid_playingitems_by_id_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `post_users_by_userid_playingitems_by_id_delete`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_userid_playingitems_by_id_delete`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `post_users_by_userid_playingitems_by_id_delete`")  # noqa: E501
        # verify the required parameter 'next_media_type' is set
        if ('next_media_type' not in params or
                params['next_media_type'] is None):
            raise ValueError("Missing the required parameter `next_media_type` when calling `post_users_by_userid_playingitems_by_id_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'media_source_id' in params:
            query_params.append(('MediaSourceId', params['media_source_id']))  # noqa: E501
        if 'next_media_type' in params:
            query_params.append(('NextMediaType', params['next_media_type']))  # noqa: E501
        if 'position_ticks' in params:
            query_params.append(('PositionTicks', params['position_ticks']))  # noqa: E501
        if 'live_stream_id' in params:
            query_params.append(('LiveStreamId', params['live_stream_id']))  # noqa: E501
        if 'play_session_id' in params:
            query_params.append(('PlaySessionId', params['play_session_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Users/{UserId}/PlayingItems/{Id}/Delete', 'POST',
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

    def post_users_by_userid_playingitems_by_id_progress(self, body, media_source_id, user_id, id, **kwargs):  # noqa: E501
        """Reports a user's playback progress  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_userid_playingitems_by_id_progress(body, media_source_id, user_id, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ApiOnPlaybackProgress body: OnPlaybackProgress (required)
        :param str media_source_id: The id of the MediaSource (required)
        :param str user_id: User Id (required)
        :param str id: Item Id (required)
        :param int position_ticks: Optional. The current position, in ticks. 1ms = 10000 ticks.
        :param bool is_paused: Indicates if the player is paused.
        :param bool is_muted: Indicates if the player is muted.
        :param int audio_stream_index:
        :param int subtitle_stream_index:
        :param int volume_level: Scale of 0-100
        :param PlayMethod play_method:
        :param str live_stream_id:
        :param str play_session_id:
        :param RepeatMode repeat_mode:
        :param int subtitle_offset:
        :param float playback_rate:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_users_by_userid_playingitems_by_id_progress_with_http_info(body, media_source_id, user_id, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_users_by_userid_playingitems_by_id_progress_with_http_info(body, media_source_id, user_id, id, **kwargs)  # noqa: E501
            return data

    def post_users_by_userid_playingitems_by_id_progress_with_http_info(self, body, media_source_id, user_id, id, **kwargs):  # noqa: E501
        """Reports a user's playback progress  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_users_by_userid_playingitems_by_id_progress_with_http_info(body, media_source_id, user_id, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ApiOnPlaybackProgress body: OnPlaybackProgress (required)
        :param str media_source_id: The id of the MediaSource (required)
        :param str user_id: User Id (required)
        :param str id: Item Id (required)
        :param int position_ticks: Optional. The current position, in ticks. 1ms = 10000 ticks.
        :param bool is_paused: Indicates if the player is paused.
        :param bool is_muted: Indicates if the player is muted.
        :param int audio_stream_index:
        :param int subtitle_stream_index:
        :param int volume_level: Scale of 0-100
        :param PlayMethod play_method:
        :param str live_stream_id:
        :param str play_session_id:
        :param RepeatMode repeat_mode:
        :param int subtitle_offset:
        :param float playback_rate:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'media_source_id', 'user_id', 'id', 'position_ticks', 'is_paused', 'is_muted', 'audio_stream_index', 'subtitle_stream_index', 'volume_level', 'play_method', 'live_stream_id', 'play_session_id', 'repeat_mode', 'subtitle_offset', 'playback_rate']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_users_by_userid_playingitems_by_id_progress" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_users_by_userid_playingitems_by_id_progress`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `post_users_by_userid_playingitems_by_id_progress`")  # noqa: E501
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `post_users_by_userid_playingitems_by_id_progress`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_users_by_userid_playingitems_by_id_progress`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'media_source_id' in params:
            query_params.append(('MediaSourceId', params['media_source_id']))  # noqa: E501
        if 'position_ticks' in params:
            query_params.append(('PositionTicks', params['position_ticks']))  # noqa: E501
        if 'is_paused' in params:
            query_params.append(('IsPaused', params['is_paused']))  # noqa: E501
        if 'is_muted' in params:
            query_params.append(('IsMuted', params['is_muted']))  # noqa: E501
        if 'audio_stream_index' in params:
            query_params.append(('AudioStreamIndex', params['audio_stream_index']))  # noqa: E501
        if 'subtitle_stream_index' in params:
            query_params.append(('SubtitleStreamIndex', params['subtitle_stream_index']))  # noqa: E501
        if 'volume_level' in params:
            query_params.append(('VolumeLevel', params['volume_level']))  # noqa: E501
        if 'play_method' in params:
            query_params.append(('PlayMethod', params['play_method']))  # noqa: E501
        if 'live_stream_id' in params:
            query_params.append(('LiveStreamId', params['live_stream_id']))  # noqa: E501
        if 'play_session_id' in params:
            query_params.append(('PlaySessionId', params['play_session_id']))  # noqa: E501
        if 'repeat_mode' in params:
            query_params.append(('RepeatMode', params['repeat_mode']))  # noqa: E501
        if 'subtitle_offset' in params:
            query_params.append(('SubtitleOffset', params['subtitle_offset']))  # noqa: E501
        if 'playback_rate' in params:
            query_params.append(('PlaybackRate', params['playback_rate']))  # noqa: E501

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
            '/Users/{UserId}/PlayingItems/{Id}/Progress', 'POST',
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
