# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class SubtitleServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def delete_items_by_id_subtitles_by_index(self, id, media_source_id, index, **kwargs):  # noqa: E501
        """Deletes an external subtitle file  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_items_by_id_subtitles_by_index(id, media_source_id, index, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_items_by_id_subtitles_by_index_with_http_info(id, media_source_id, index, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_items_by_id_subtitles_by_index_with_http_info(id, media_source_id, index, **kwargs)  # noqa: E501
            return data

    def delete_items_by_id_subtitles_by_index_with_http_info(self, id, media_source_id, index, **kwargs):  # noqa: E501
        """Deletes an external subtitle file  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_items_by_id_subtitles_by_index_with_http_info(id, media_source_id, index, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'media_source_id', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_items_by_id_subtitles_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_items_by_id_subtitles_by_index`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `delete_items_by_id_subtitles_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `delete_items_by_id_subtitles_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501

        query_params = []
        if 'media_source_id' in params:
            query_params.append(('MediaSourceId', params['media_source_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/Subtitles/{Index}', 'DELETE',
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

    def delete_videos_by_id_subtitles_by_index(self, id, media_source_id, index, **kwargs):  # noqa: E501
        """Deletes an external subtitle file  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_videos_by_id_subtitles_by_index(id, media_source_id, index, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_videos_by_id_subtitles_by_index_with_http_info(id, media_source_id, index, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_videos_by_id_subtitles_by_index_with_http_info(id, media_source_id, index, **kwargs)  # noqa: E501
            return data

    def delete_videos_by_id_subtitles_by_index_with_http_info(self, id, media_source_id, index, **kwargs):  # noqa: E501
        """Deletes an external subtitle file  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_videos_by_id_subtitles_by_index_with_http_info(id, media_source_id, index, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'media_source_id', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_videos_by_id_subtitles_by_index" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_videos_by_id_subtitles_by_index`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `delete_videos_by_id_subtitles_by_index`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `delete_videos_by_id_subtitles_by_index`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501

        query_params = []
        if 'media_source_id' in params:
            query_params.append(('MediaSourceId', params['media_source_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Videos/{Id}/Subtitles/{Index}', 'DELETE',
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

    def get_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format(self, id, media_source_id, index, format, start_position_ticks, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format(id, media_source_id, index, format, start_position_ticks, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks (required)
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(id, media_source_id, index, format, start_position_ticks, **kwargs)  # noqa: E501
        else:
            (data) = self.get_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(id, media_source_id, index, format, start_position_ticks, **kwargs)  # noqa: E501
            return data

    def get_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(self, id, media_source_id, index, format, start_position_ticks, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(id, media_source_id, index, format, start_position_ticks, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks (required)
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'media_source_id', 'index', 'format', 'start_position_ticks', 'end_position_ticks', 'copy_timestamps']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `get_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `get_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'format' is set
        if ('format' not in params or
                params['format'] is None):
            raise ValueError("Missing the required parameter `format` when calling `get_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'start_position_ticks' is set
        if ('start_position_ticks' not in params or
                params['start_position_ticks'] is None):
            raise ValueError("Missing the required parameter `start_position_ticks` when calling `get_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'media_source_id' in params:
            path_params['MediaSourceId'] = params['media_source_id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'format' in params:
            path_params['Format'] = params['format']  # noqa: E501
        if 'start_position_ticks' in params:
            path_params['StartPositionTicks'] = params['start_position_ticks']  # noqa: E501

        query_params = []
        if 'end_position_ticks' in params:
            query_params.append(('EndPositionTicks', params['end_position_ticks']))  # noqa: E501
        if 'copy_timestamps' in params:
            query_params.append(('CopyTimestamps', params['copy_timestamps']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}', 'GET',
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

    def get_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format(self, id, media_source_id, index, format, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format(id, media_source_id, index, format, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(id, media_source_id, index, format, **kwargs)  # noqa: E501
        else:
            (data) = self.get_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(id, media_source_id, index, format, **kwargs)  # noqa: E501
            return data

    def get_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(self, id, media_source_id, index, format, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(id, media_source_id, index, format, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'media_source_id', 'index', 'format', 'start_position_ticks', 'end_position_ticks', 'copy_timestamps']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `get_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `get_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501
        # verify the required parameter 'format' is set
        if ('format' not in params or
                params['format'] is None):
            raise ValueError("Missing the required parameter `format` when calling `get_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'media_source_id' in params:
            path_params['MediaSourceId'] = params['media_source_id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'format' in params:
            path_params['Format'] = params['format']  # noqa: E501

        query_params = []
        if 'start_position_ticks' in params:
            query_params.append(('StartPositionTicks', params['start_position_ticks']))  # noqa: E501
        if 'end_position_ticks' in params:
            query_params.append(('EndPositionTicks', params['end_position_ticks']))  # noqa: E501
        if 'copy_timestamps' in params:
            query_params.append(('CopyTimestamps', params['copy_timestamps']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}', 'GET',
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

    def get_items_by_id_remotesearch_subtitles_by_language(self, id, media_source_id, language, **kwargs):  # noqa: E501
        """get_items_by_id_remotesearch_subtitles_by_language  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_remotesearch_subtitles_by_language(id, media_source_id, language, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param str language: Language (required)
        :param bool is_perfect_match: IsPerfectMatch
        :param bool is_forced: IsForced
        :param bool is_hearing_impaired: IsHearingImpaired
        :return: list[RemoteSubtitleInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_items_by_id_remotesearch_subtitles_by_language_with_http_info(id, media_source_id, language, **kwargs)  # noqa: E501
        else:
            (data) = self.get_items_by_id_remotesearch_subtitles_by_language_with_http_info(id, media_source_id, language, **kwargs)  # noqa: E501
            return data

    def get_items_by_id_remotesearch_subtitles_by_language_with_http_info(self, id, media_source_id, language, **kwargs):  # noqa: E501
        """get_items_by_id_remotesearch_subtitles_by_language  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_items_by_id_remotesearch_subtitles_by_language_with_http_info(id, media_source_id, language, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param str language: Language (required)
        :param bool is_perfect_match: IsPerfectMatch
        :param bool is_forced: IsForced
        :param bool is_hearing_impaired: IsHearingImpaired
        :return: list[RemoteSubtitleInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'media_source_id', 'language', 'is_perfect_match', 'is_forced', 'is_hearing_impaired']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_items_by_id_remotesearch_subtitles_by_language" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_items_by_id_remotesearch_subtitles_by_language`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `get_items_by_id_remotesearch_subtitles_by_language`")  # noqa: E501
        # verify the required parameter 'language' is set
        if ('language' not in params or
                params['language'] is None):
            raise ValueError("Missing the required parameter `language` when calling `get_items_by_id_remotesearch_subtitles_by_language`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'language' in params:
            path_params['Language'] = params['language']  # noqa: E501

        query_params = []
        if 'media_source_id' in params:
            query_params.append(('MediaSourceId', params['media_source_id']))  # noqa: E501
        if 'is_perfect_match' in params:
            query_params.append(('IsPerfectMatch', params['is_perfect_match']))  # noqa: E501
        if 'is_forced' in params:
            query_params.append(('IsForced', params['is_forced']))  # noqa: E501
        if 'is_hearing_impaired' in params:
            query_params.append(('IsHearingImpaired', params['is_hearing_impaired']))  # noqa: E501

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
            '/Items/{Id}/RemoteSearch/Subtitles/{Language}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[RemoteSubtitleInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_providers_subtitles_subtitles_by_id(self, id, **kwargs):  # noqa: E501
        """get_providers_subtitles_subtitles_by_id  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_providers_subtitles_subtitles_by_id(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_providers_subtitles_subtitles_by_id_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_providers_subtitles_subtitles_by_id_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_providers_subtitles_subtitles_by_id_with_http_info(self, id, **kwargs):  # noqa: E501
        """get_providers_subtitles_subtitles_by_id  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_providers_subtitles_subtitles_by_id_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :return: None
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
                    " to method get_providers_subtitles_subtitles_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_providers_subtitles_subtitles_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Providers/Subtitles/Subtitles/{Id}', 'GET',
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

    def get_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format(self, id, media_source_id, index, format, start_position_ticks, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format(id, media_source_id, index, format, start_position_ticks, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks (required)
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(id, media_source_id, index, format, start_position_ticks, **kwargs)  # noqa: E501
        else:
            (data) = self.get_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(id, media_source_id, index, format, start_position_ticks, **kwargs)  # noqa: E501
            return data

    def get_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(self, id, media_source_id, index, format, start_position_ticks, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(id, media_source_id, index, format, start_position_ticks, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks (required)
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'media_source_id', 'index', 'format', 'start_position_ticks', 'end_position_ticks', 'copy_timestamps']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `get_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `get_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'format' is set
        if ('format' not in params or
                params['format'] is None):
            raise ValueError("Missing the required parameter `format` when calling `get_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'start_position_ticks' is set
        if ('start_position_ticks' not in params or
                params['start_position_ticks'] is None):
            raise ValueError("Missing the required parameter `start_position_ticks` when calling `get_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'media_source_id' in params:
            path_params['MediaSourceId'] = params['media_source_id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'format' in params:
            path_params['Format'] = params['format']  # noqa: E501
        if 'start_position_ticks' in params:
            path_params['StartPositionTicks'] = params['start_position_ticks']  # noqa: E501

        query_params = []
        if 'end_position_ticks' in params:
            query_params.append(('EndPositionTicks', params['end_position_ticks']))  # noqa: E501
        if 'copy_timestamps' in params:
            query_params.append(('CopyTimestamps', params['copy_timestamps']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}', 'GET',
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

    def get_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format(self, id, media_source_id, index, format, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format(id, media_source_id, index, format, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(id, media_source_id, index, format, **kwargs)  # noqa: E501
        else:
            (data) = self.get_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(id, media_source_id, index, format, **kwargs)  # noqa: E501
            return data

    def get_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(self, id, media_source_id, index, format, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(id, media_source_id, index, format, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'media_source_id', 'index', 'format', 'start_position_ticks', 'end_position_ticks', 'copy_timestamps']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `get_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `get_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501
        # verify the required parameter 'format' is set
        if ('format' not in params or
                params['format'] is None):
            raise ValueError("Missing the required parameter `format` when calling `get_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'media_source_id' in params:
            path_params['MediaSourceId'] = params['media_source_id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'format' in params:
            path_params['Format'] = params['format']  # noqa: E501

        query_params = []
        if 'start_position_ticks' in params:
            query_params.append(('StartPositionTicks', params['start_position_ticks']))  # noqa: E501
        if 'end_position_ticks' in params:
            query_params.append(('EndPositionTicks', params['end_position_ticks']))  # noqa: E501
        if 'copy_timestamps' in params:
            query_params.append(('CopyTimestamps', params['copy_timestamps']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}', 'GET',
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

    def head_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format(self, id, media_source_id, index, format, start_position_ticks, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format(id, media_source_id, index, format, start_position_ticks, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks (required)
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(id, media_source_id, index, format, start_position_ticks, **kwargs)  # noqa: E501
        else:
            (data) = self.head_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(id, media_source_id, index, format, start_position_ticks, **kwargs)  # noqa: E501
            return data

    def head_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(self, id, media_source_id, index, format, start_position_ticks, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(id, media_source_id, index, format, start_position_ticks, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks (required)
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'media_source_id', 'index', 'format', 'start_position_ticks', 'end_position_ticks', 'copy_timestamps']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `head_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `head_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'format' is set
        if ('format' not in params or
                params['format'] is None):
            raise ValueError("Missing the required parameter `format` when calling `head_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'start_position_ticks' is set
        if ('start_position_ticks' not in params or
                params['start_position_ticks'] is None):
            raise ValueError("Missing the required parameter `start_position_ticks` when calling `head_items_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'media_source_id' in params:
            path_params['MediaSourceId'] = params['media_source_id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'format' in params:
            path_params['Format'] = params['format']  # noqa: E501
        if 'start_position_ticks' in params:
            path_params['StartPositionTicks'] = params['start_position_ticks']  # noqa: E501

        query_params = []
        if 'end_position_ticks' in params:
            query_params.append(('EndPositionTicks', params['end_position_ticks']))  # noqa: E501
        if 'copy_timestamps' in params:
            query_params.append(('CopyTimestamps', params['copy_timestamps']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}', 'HEAD',
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

    def head_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format(self, id, media_source_id, index, format, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format(id, media_source_id, index, format, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(id, media_source_id, index, format, **kwargs)  # noqa: E501
        else:
            (data) = self.head_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(id, media_source_id, index, format, **kwargs)  # noqa: E501
            return data

    def head_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(self, id, media_source_id, index, format, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(id, media_source_id, index, format, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'media_source_id', 'index', 'format', 'start_position_ticks', 'end_position_ticks', 'copy_timestamps']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `head_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `head_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501
        # verify the required parameter 'format' is set
        if ('format' not in params or
                params['format'] is None):
            raise ValueError("Missing the required parameter `format` when calling `head_items_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'media_source_id' in params:
            path_params['MediaSourceId'] = params['media_source_id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'format' in params:
            path_params['Format'] = params['format']  # noqa: E501

        query_params = []
        if 'start_position_ticks' in params:
            query_params.append(('StartPositionTicks', params['start_position_ticks']))  # noqa: E501
        if 'end_position_ticks' in params:
            query_params.append(('EndPositionTicks', params['end_position_ticks']))  # noqa: E501
        if 'copy_timestamps' in params:
            query_params.append(('CopyTimestamps', params['copy_timestamps']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}', 'HEAD',
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

    def head_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format(self, id, media_source_id, index, format, start_position_ticks, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format(id, media_source_id, index, format, start_position_ticks, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks (required)
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(id, media_source_id, index, format, start_position_ticks, **kwargs)  # noqa: E501
        else:
            (data) = self.head_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(id, media_source_id, index, format, start_position_ticks, **kwargs)  # noqa: E501
            return data

    def head_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(self, id, media_source_id, index, format, start_position_ticks, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format_with_http_info(id, media_source_id, index, format, start_position_ticks, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks (required)
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'media_source_id', 'index', 'format', 'start_position_ticks', 'end_position_ticks', 'copy_timestamps']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `head_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `head_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'format' is set
        if ('format' not in params or
                params['format'] is None):
            raise ValueError("Missing the required parameter `format` when calling `head_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501
        # verify the required parameter 'start_position_ticks' is set
        if ('start_position_ticks' not in params or
                params['start_position_ticks'] is None):
            raise ValueError("Missing the required parameter `start_position_ticks` when calling `head_videos_by_id_by_mediasourceid_subtitles_by_index_by_startpositionticks_stream_by_format`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'media_source_id' in params:
            path_params['MediaSourceId'] = params['media_source_id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'format' in params:
            path_params['Format'] = params['format']  # noqa: E501
        if 'start_position_ticks' in params:
            path_params['StartPositionTicks'] = params['start_position_ticks']  # noqa: E501

        query_params = []
        if 'end_position_ticks' in params:
            query_params.append(('EndPositionTicks', params['end_position_ticks']))  # noqa: E501
        if 'copy_timestamps' in params:
            query_params.append(('CopyTimestamps', params['copy_timestamps']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}', 'HEAD',
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

    def head_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format(self, id, media_source_id, index, format, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format(id, media_source_id, index, format, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(id, media_source_id, index, format, **kwargs)  # noqa: E501
        else:
            (data) = self.head_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(id, media_source_id, index, format, **kwargs)  # noqa: E501
            return data

    def head_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(self, id, media_source_id, index, format, **kwargs):  # noqa: E501
        """Gets subtitles in a specified format.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format_with_http_info(id, media_source_id, index, format, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :param str format: Format (required)
        :param int start_position_ticks: StartPositionTicks
        :param int end_position_ticks: EndPositionTicks
        :param bool copy_timestamps: CopyTimestamps
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'media_source_id', 'index', 'format', 'start_position_ticks', 'end_position_ticks', 'copy_timestamps']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `head_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `head_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501
        # verify the required parameter 'format' is set
        if ('format' not in params or
                params['format'] is None):
            raise ValueError("Missing the required parameter `format` when calling `head_videos_by_id_by_mediasourceid_subtitles_by_index_stream_by_format`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'media_source_id' in params:
            path_params['MediaSourceId'] = params['media_source_id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501
        if 'format' in params:
            path_params['Format'] = params['format']  # noqa: E501

        query_params = []
        if 'start_position_ticks' in params:
            query_params.append(('StartPositionTicks', params['start_position_ticks']))  # noqa: E501
        if 'end_position_ticks' in params:
            query_params.append(('EndPositionTicks', params['end_position_ticks']))  # noqa: E501
        if 'copy_timestamps' in params:
            query_params.append(('CopyTimestamps', params['copy_timestamps']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}', 'HEAD',
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

    def post_items_by_id_remotesearch_subtitles_by_subtitleid(self, id, media_source_id, subtitle_id, **kwargs):  # noqa: E501
        """post_items_by_id_remotesearch_subtitles_by_subtitleid  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_remotesearch_subtitles_by_subtitleid(id, media_source_id, subtitle_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param str subtitle_id: SubtitleId (required)
        :return: SubtitlesSubtitleDownloadResult
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_by_id_remotesearch_subtitles_by_subtitleid_with_http_info(id, media_source_id, subtitle_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_by_id_remotesearch_subtitles_by_subtitleid_with_http_info(id, media_source_id, subtitle_id, **kwargs)  # noqa: E501
            return data

    def post_items_by_id_remotesearch_subtitles_by_subtitleid_with_http_info(self, id, media_source_id, subtitle_id, **kwargs):  # noqa: E501
        """post_items_by_id_remotesearch_subtitles_by_subtitleid  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_remotesearch_subtitles_by_subtitleid_with_http_info(id, media_source_id, subtitle_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param str subtitle_id: SubtitleId (required)
        :return: SubtitlesSubtitleDownloadResult
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'media_source_id', 'subtitle_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_items_by_id_remotesearch_subtitles_by_subtitleid" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_items_by_id_remotesearch_subtitles_by_subtitleid`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `post_items_by_id_remotesearch_subtitles_by_subtitleid`")  # noqa: E501
        # verify the required parameter 'subtitle_id' is set
        if ('subtitle_id' not in params or
                params['subtitle_id'] is None):
            raise ValueError("Missing the required parameter `subtitle_id` when calling `post_items_by_id_remotesearch_subtitles_by_subtitleid`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'subtitle_id' in params:
            path_params['SubtitleId'] = params['subtitle_id']  # noqa: E501

        query_params = []
        if 'media_source_id' in params:
            query_params.append(('MediaSourceId', params['media_source_id']))  # noqa: E501

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
            '/Items/{Id}/RemoteSearch/Subtitles/{SubtitleId}', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='SubtitlesSubtitleDownloadResult',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_items_by_id_subtitles_by_index_delete(self, id, media_source_id, index, **kwargs):  # noqa: E501
        """Deletes an external subtitle file  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_subtitles_by_index_delete(id, media_source_id, index, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_items_by_id_subtitles_by_index_delete_with_http_info(id, media_source_id, index, **kwargs)  # noqa: E501
        else:
            (data) = self.post_items_by_id_subtitles_by_index_delete_with_http_info(id, media_source_id, index, **kwargs)  # noqa: E501
            return data

    def post_items_by_id_subtitles_by_index_delete_with_http_info(self, id, media_source_id, index, **kwargs):  # noqa: E501
        """Deletes an external subtitle file  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_items_by_id_subtitles_by_index_delete_with_http_info(id, media_source_id, index, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'media_source_id', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_items_by_id_subtitles_by_index_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_items_by_id_subtitles_by_index_delete`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `post_items_by_id_subtitles_by_index_delete`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `post_items_by_id_subtitles_by_index_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501

        query_params = []
        if 'media_source_id' in params:
            query_params.append(('MediaSourceId', params['media_source_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Items/{Id}/Subtitles/{Index}/Delete', 'POST',
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

    def post_videos_by_id_subtitles_by_index_delete(self, id, media_source_id, index, **kwargs):  # noqa: E501
        """Deletes an external subtitle file  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_videos_by_id_subtitles_by_index_delete(id, media_source_id, index, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_videos_by_id_subtitles_by_index_delete_with_http_info(id, media_source_id, index, **kwargs)  # noqa: E501
        else:
            (data) = self.post_videos_by_id_subtitles_by_index_delete_with_http_info(id, media_source_id, index, **kwargs)  # noqa: E501
            return data

    def post_videos_by_id_subtitles_by_index_delete_with_http_info(self, id, media_source_id, index, **kwargs):  # noqa: E501
        """Deletes an external subtitle file  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_videos_by_id_subtitles_by_index_delete_with_http_info(id, media_source_id, index, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str media_source_id: MediaSourceId (required)
        :param int index: The subtitle stream index (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'media_source_id', 'index']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_videos_by_id_subtitles_by_index_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_videos_by_id_subtitles_by_index_delete`")  # noqa: E501
        # verify the required parameter 'media_source_id' is set
        if ('media_source_id' not in params or
                params['media_source_id'] is None):
            raise ValueError("Missing the required parameter `media_source_id` when calling `post_videos_by_id_subtitles_by_index_delete`")  # noqa: E501
        # verify the required parameter 'index' is set
        if ('index' not in params or
                params['index'] is None):
            raise ValueError("Missing the required parameter `index` when calling `post_videos_by_id_subtitles_by_index_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'index' in params:
            path_params['Index'] = params['index']  # noqa: E501

        query_params = []
        if 'media_source_id' in params:
            query_params.append(('MediaSourceId', params['media_source_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Videos/{Id}/Subtitles/{Index}/Delete', 'POST',
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
