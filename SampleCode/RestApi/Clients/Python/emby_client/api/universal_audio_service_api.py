# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class UniversalAudioServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_audio_by_id_universal(self, id, **kwargs):  # noqa: E501
        """Gets an audio stream  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_audio_by_id_universal(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str device_id: The device id of the client requesting. Used to stop encoding processes when needed.
        :param int start_time_ticks: Optional. Specify a starting offset, in ticks. 1ms = 10000 ticks.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_audio_by_id_universal_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_audio_by_id_universal_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_audio_by_id_universal_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets an audio stream  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_audio_by_id_universal_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str device_id: The device id of the client requesting. Used to stop encoding processes when needed.
        :param int start_time_ticks: Optional. Specify a starting offset, in ticks. 1ms = 10000 ticks.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'device_id', 'start_time_ticks']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_audio_by_id_universal" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_audio_by_id_universal`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'device_id' in params:
            query_params.append(('DeviceId', params['device_id']))  # noqa: E501
        if 'start_time_ticks' in params:
            query_params.append(('StartTimeTicks', params['start_time_ticks']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Audio/{Id}/universal', 'GET',
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

    def get_audio_by_id_universal_by_container(self, id, container, **kwargs):  # noqa: E501
        """Gets an audio stream  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_audio_by_id_universal_by_container(id, container, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str container: (required)
        :param str device_id: The device id of the client requesting. Used to stop encoding processes when needed.
        :param int start_time_ticks: Optional. Specify a starting offset, in ticks. 1ms = 10000 ticks.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_audio_by_id_universal_by_container_with_http_info(id, container, **kwargs)  # noqa: E501
        else:
            (data) = self.get_audio_by_id_universal_by_container_with_http_info(id, container, **kwargs)  # noqa: E501
            return data

    def get_audio_by_id_universal_by_container_with_http_info(self, id, container, **kwargs):  # noqa: E501
        """Gets an audio stream  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_audio_by_id_universal_by_container_with_http_info(id, container, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str container: (required)
        :param str device_id: The device id of the client requesting. Used to stop encoding processes when needed.
        :param int start_time_ticks: Optional. Specify a starting offset, in ticks. 1ms = 10000 ticks.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'container', 'device_id', 'start_time_ticks']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_audio_by_id_universal_by_container" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_audio_by_id_universal_by_container`")  # noqa: E501
        # verify the required parameter 'container' is set
        if ('container' not in params or
                params['container'] is None):
            raise ValueError("Missing the required parameter `container` when calling `get_audio_by_id_universal_by_container`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'container' in params:
            path_params['Container'] = params['container']  # noqa: E501

        query_params = []
        if 'device_id' in params:
            query_params.append(('DeviceId', params['device_id']))  # noqa: E501
        if 'start_time_ticks' in params:
            query_params.append(('StartTimeTicks', params['start_time_ticks']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Audio/{Id}/universal.{Container}', 'GET',
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

    def head_audio_by_id_universal(self, id, **kwargs):  # noqa: E501
        """Gets an audio stream  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_audio_by_id_universal(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str device_id: The device id of the client requesting. Used to stop encoding processes when needed.
        :param int start_time_ticks: Optional. Specify a starting offset, in ticks. 1ms = 10000 ticks.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_audio_by_id_universal_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.head_audio_by_id_universal_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def head_audio_by_id_universal_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets an audio stream  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_audio_by_id_universal_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str device_id: The device id of the client requesting. Used to stop encoding processes when needed.
        :param int start_time_ticks: Optional. Specify a starting offset, in ticks. 1ms = 10000 ticks.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'device_id', 'start_time_ticks']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_audio_by_id_universal" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_audio_by_id_universal`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'device_id' in params:
            query_params.append(('DeviceId', params['device_id']))  # noqa: E501
        if 'start_time_ticks' in params:
            query_params.append(('StartTimeTicks', params['start_time_ticks']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Audio/{Id}/universal', 'HEAD',
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

    def head_audio_by_id_universal_by_container(self, id, container, **kwargs):  # noqa: E501
        """Gets an audio stream  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_audio_by_id_universal_by_container(id, container, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str container: (required)
        :param str device_id: The device id of the client requesting. Used to stop encoding processes when needed.
        :param int start_time_ticks: Optional. Specify a starting offset, in ticks. 1ms = 10000 ticks.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_audio_by_id_universal_by_container_with_http_info(id, container, **kwargs)  # noqa: E501
        else:
            (data) = self.head_audio_by_id_universal_by_container_with_http_info(id, container, **kwargs)  # noqa: E501
            return data

    def head_audio_by_id_universal_by_container_with_http_info(self, id, container, **kwargs):  # noqa: E501
        """Gets an audio stream  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_audio_by_id_universal_by_container_with_http_info(id, container, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Item Id (required)
        :param str container: (required)
        :param str device_id: The device id of the client requesting. Used to stop encoding processes when needed.
        :param int start_time_ticks: Optional. Specify a starting offset, in ticks. 1ms = 10000 ticks.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'container', 'device_id', 'start_time_ticks']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_audio_by_id_universal_by_container" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_audio_by_id_universal_by_container`")  # noqa: E501
        # verify the required parameter 'container' is set
        if ('container' not in params or
                params['container'] is None):
            raise ValueError("Missing the required parameter `container` when calling `head_audio_by_id_universal_by_container`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501
        if 'container' in params:
            path_params['Container'] = params['container']  # noqa: E501

        query_params = []
        if 'device_id' in params:
            query_params.append(('DeviceId', params['device_id']))  # noqa: E501
        if 'start_time_ticks' in params:
            query_params.append(('StartTimeTicks', params['start_time_ticks']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Audio/{Id}/universal.{Container}', 'HEAD',
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
