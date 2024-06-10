# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class LiveStreamServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_livetv_liverecordings_by_id_hls_by_segment(self, id, segment, **kwargs):  # noqa: E501
        """Gets a live recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_liverecordings_by_id_hls_by_segment(id, segment, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str segment: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_liverecordings_by_id_hls_by_segment_with_http_info(id, segment, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_liverecordings_by_id_hls_by_segment_with_http_info(id, segment, **kwargs)  # noqa: E501
            return data

    def get_livetv_liverecordings_by_id_hls_by_segment_with_http_info(self, id, segment, **kwargs):  # noqa: E501
        """Gets a live recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_liverecordings_by_id_hls_by_segment_with_http_info(id, segment, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str segment: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'segment']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_liverecordings_by_id_hls_by_segment" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_livetv_liverecordings_by_id_hls_by_segment`")  # noqa: E501
        # verify the required parameter 'segment' is set
        if ('segment' not in params or
                params['segment'] is None):
            raise ValueError("Missing the required parameter `segment` when calling `get_livetv_liverecordings_by_id_hls_by_segment`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'segment' in params:
            path_params['Segment'] = params['segment']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/LiveRecordings/{Id}/hls/{Segment}', 'GET',
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

    def get_livetv_liverecordings_by_id_hls_live_m3u8(self, id, **kwargs):  # noqa: E501
        """Gets a live recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_liverecordings_by_id_hls_live_m3u8(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_liverecordings_by_id_hls_live_m3u8_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_liverecordings_by_id_hls_live_m3u8_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_livetv_liverecordings_by_id_hls_live_m3u8_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a live recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_liverecordings_by_id_hls_live_m3u8_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
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
                    " to method get_livetv_liverecordings_by_id_hls_live_m3u8" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_livetv_liverecordings_by_id_hls_live_m3u8`")  # noqa: E501

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
            '/LiveTv/LiveRecordings/{Id}/hls/live.m3u8', 'GET',
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

    def get_livetv_liverecordings_by_id_hls_master_m3u8(self, id, **kwargs):  # noqa: E501
        """Gets a live recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_liverecordings_by_id_hls_master_m3u8(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_liverecordings_by_id_hls_master_m3u8_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_liverecordings_by_id_hls_master_m3u8_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_livetv_liverecordings_by_id_hls_master_m3u8_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a live recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_liverecordings_by_id_hls_master_m3u8_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
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
                    " to method get_livetv_liverecordings_by_id_hls_master_m3u8" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_livetv_liverecordings_by_id_hls_master_m3u8`")  # noqa: E501

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
            '/LiveTv/LiveRecordings/{Id}/hls/master.m3u8', 'GET',
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

    def get_livetv_liverecordings_by_id_stream(self, id, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_liverecordings_by_id_stream(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_liverecordings_by_id_stream_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_liverecordings_by_id_stream_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_livetv_liverecordings_by_id_stream_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_liverecordings_by_id_stream_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
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
                    " to method get_livetv_liverecordings_by_id_stream" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_livetv_liverecordings_by_id_stream`")  # noqa: E501

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
            '/LiveTv/LiveRecordings/{Id}/stream', 'GET',
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

    def get_livetv_livestreamfiles_by_id_hls_by_segment(self, id, segment, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_livestreamfiles_by_id_hls_by_segment(id, segment, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str segment: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_livestreamfiles_by_id_hls_by_segment_with_http_info(id, segment, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_livestreamfiles_by_id_hls_by_segment_with_http_info(id, segment, **kwargs)  # noqa: E501
            return data

    def get_livetv_livestreamfiles_by_id_hls_by_segment_with_http_info(self, id, segment, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_livestreamfiles_by_id_hls_by_segment_with_http_info(id, segment, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str segment: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'segment']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_livestreamfiles_by_id_hls_by_segment" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_livetv_livestreamfiles_by_id_hls_by_segment`")  # noqa: E501
        # verify the required parameter 'segment' is set
        if ('segment' not in params or
                params['segment'] is None):
            raise ValueError("Missing the required parameter `segment` when calling `get_livetv_livestreamfiles_by_id_hls_by_segment`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'segment' in params:
            path_params['Segment'] = params['segment']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/LiveStreamFiles/{Id}/hls/{Segment}', 'GET',
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

    def get_livetv_livestreamfiles_by_id_hls_live_m3u8(self, id, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_livestreamfiles_by_id_hls_live_m3u8(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_livestreamfiles_by_id_hls_live_m3u8_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_livestreamfiles_by_id_hls_live_m3u8_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_livetv_livestreamfiles_by_id_hls_live_m3u8_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_livestreamfiles_by_id_hls_live_m3u8_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
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
                    " to method get_livetv_livestreamfiles_by_id_hls_live_m3u8" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_livetv_livestreamfiles_by_id_hls_live_m3u8`")  # noqa: E501

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
            '/LiveTv/LiveStreamFiles/{Id}/hls/live.m3u8', 'GET',
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

    def get_livetv_livestreamfiles_by_id_hls_master_m3u8(self, id, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_livestreamfiles_by_id_hls_master_m3u8(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_livestreamfiles_by_id_hls_master_m3u8_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_livestreamfiles_by_id_hls_master_m3u8_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_livetv_livestreamfiles_by_id_hls_master_m3u8_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_livestreamfiles_by_id_hls_master_m3u8_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
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
                    " to method get_livetv_livestreamfiles_by_id_hls_master_m3u8" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_livetv_livestreamfiles_by_id_hls_master_m3u8`")  # noqa: E501

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
            '/LiveTv/LiveStreamFiles/{Id}/hls/master.m3u8', 'GET',
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

    def get_livetv_livestreamfiles_by_id_stream_by_container(self, id, container, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_livestreamfiles_by_id_stream_by_container(id, container, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str container: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_livestreamfiles_by_id_stream_by_container_with_http_info(id, container, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_livestreamfiles_by_id_stream_by_container_with_http_info(id, container, **kwargs)  # noqa: E501
            return data

    def get_livetv_livestreamfiles_by_id_stream_by_container_with_http_info(self, id, container, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_livestreamfiles_by_id_stream_by_container_with_http_info(id, container, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str container: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'container']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_livestreamfiles_by_id_stream_by_container" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_livetv_livestreamfiles_by_id_stream_by_container`")  # noqa: E501
        # verify the required parameter 'container' is set
        if ('container' not in params or
                params['container'] is None):
            raise ValueError("Missing the required parameter `container` when calling `get_livetv_livestreamfiles_by_id_stream_by_container`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'container' in params:
            path_params['Container'] = params['container']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/LiveStreamFiles/{Id}/stream.{Container}', 'GET',
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

    def head_livetv_liverecordings_by_id_hls_by_segment(self, id, segment, **kwargs):  # noqa: E501
        """Gets a live recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_liverecordings_by_id_hls_by_segment(id, segment, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str segment: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_livetv_liverecordings_by_id_hls_by_segment_with_http_info(id, segment, **kwargs)  # noqa: E501
        else:
            (data) = self.head_livetv_liverecordings_by_id_hls_by_segment_with_http_info(id, segment, **kwargs)  # noqa: E501
            return data

    def head_livetv_liverecordings_by_id_hls_by_segment_with_http_info(self, id, segment, **kwargs):  # noqa: E501
        """Gets a live recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_liverecordings_by_id_hls_by_segment_with_http_info(id, segment, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str segment: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'segment']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_livetv_liverecordings_by_id_hls_by_segment" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_livetv_liverecordings_by_id_hls_by_segment`")  # noqa: E501
        # verify the required parameter 'segment' is set
        if ('segment' not in params or
                params['segment'] is None):
            raise ValueError("Missing the required parameter `segment` when calling `head_livetv_liverecordings_by_id_hls_by_segment`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'segment' in params:
            path_params['Segment'] = params['segment']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/LiveRecordings/{Id}/hls/{Segment}', 'HEAD',
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

    def head_livetv_liverecordings_by_id_hls_live_m3u8(self, id, **kwargs):  # noqa: E501
        """Gets a live recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_liverecordings_by_id_hls_live_m3u8(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_livetv_liverecordings_by_id_hls_live_m3u8_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.head_livetv_liverecordings_by_id_hls_live_m3u8_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def head_livetv_liverecordings_by_id_hls_live_m3u8_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a live recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_liverecordings_by_id_hls_live_m3u8_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
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
                    " to method head_livetv_liverecordings_by_id_hls_live_m3u8" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_livetv_liverecordings_by_id_hls_live_m3u8`")  # noqa: E501

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
            '/LiveTv/LiveRecordings/{Id}/hls/live.m3u8', 'HEAD',
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

    def head_livetv_liverecordings_by_id_hls_master_m3u8(self, id, **kwargs):  # noqa: E501
        """Gets a live recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_liverecordings_by_id_hls_master_m3u8(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_livetv_liverecordings_by_id_hls_master_m3u8_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.head_livetv_liverecordings_by_id_hls_master_m3u8_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def head_livetv_liverecordings_by_id_hls_master_m3u8_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a live recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_liverecordings_by_id_hls_master_m3u8_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
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
                    " to method head_livetv_liverecordings_by_id_hls_master_m3u8" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_livetv_liverecordings_by_id_hls_master_m3u8`")  # noqa: E501

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
            '/LiveTv/LiveRecordings/{Id}/hls/master.m3u8', 'HEAD',
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

    def head_livetv_livestreamfiles_by_id_hls_by_segment(self, id, segment, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_livestreamfiles_by_id_hls_by_segment(id, segment, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str segment: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_livetv_livestreamfiles_by_id_hls_by_segment_with_http_info(id, segment, **kwargs)  # noqa: E501
        else:
            (data) = self.head_livetv_livestreamfiles_by_id_hls_by_segment_with_http_info(id, segment, **kwargs)  # noqa: E501
            return data

    def head_livetv_livestreamfiles_by_id_hls_by_segment_with_http_info(self, id, segment, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_livestreamfiles_by_id_hls_by_segment_with_http_info(id, segment, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :param str segment: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'segment']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_livetv_livestreamfiles_by_id_hls_by_segment" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_livetv_livestreamfiles_by_id_hls_by_segment`")  # noqa: E501
        # verify the required parameter 'segment' is set
        if ('segment' not in params or
                params['segment'] is None):
            raise ValueError("Missing the required parameter `segment` when calling `head_livetv_livestreamfiles_by_id_hls_by_segment`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'segment' in params:
            path_params['Segment'] = params['segment']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/LiveStreamFiles/{Id}/hls/{Segment}', 'HEAD',
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

    def head_livetv_livestreamfiles_by_id_hls_live_m3u8(self, id, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_livestreamfiles_by_id_hls_live_m3u8(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_livetv_livestreamfiles_by_id_hls_live_m3u8_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.head_livetv_livestreamfiles_by_id_hls_live_m3u8_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def head_livetv_livestreamfiles_by_id_hls_live_m3u8_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_livestreamfiles_by_id_hls_live_m3u8_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
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
                    " to method head_livetv_livestreamfiles_by_id_hls_live_m3u8" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_livetv_livestreamfiles_by_id_hls_live_m3u8`")  # noqa: E501

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
            '/LiveTv/LiveStreamFiles/{Id}/hls/live.m3u8', 'HEAD',
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

    def head_livetv_livestreamfiles_by_id_hls_master_m3u8(self, id, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_livestreamfiles_by_id_hls_master_m3u8(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_livetv_livestreamfiles_by_id_hls_master_m3u8_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.head_livetv_livestreamfiles_by_id_hls_master_m3u8_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def head_livetv_livestreamfiles_by_id_hls_master_m3u8_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_livestreamfiles_by_id_hls_master_m3u8_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: (required)
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
                    " to method head_livetv_livestreamfiles_by_id_hls_master_m3u8" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_livetv_livestreamfiles_by_id_hls_master_m3u8`")  # noqa: E501

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
            '/LiveTv/LiveStreamFiles/{Id}/hls/master.m3u8', 'HEAD',
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
