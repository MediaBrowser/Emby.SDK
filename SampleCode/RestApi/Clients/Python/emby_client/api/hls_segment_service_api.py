# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class HlsSegmentServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def delete_videos_activeencodings(self, device_id, play_session_id, **kwargs):  # noqa: E501
        """delete_videos_activeencodings  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_videos_activeencodings(device_id, play_session_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str device_id: The device id of the client requesting. Used to stop encoding processes when needed. (required)
        :param str play_session_id: The play session id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_videos_activeencodings_with_http_info(device_id, play_session_id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_videos_activeencodings_with_http_info(device_id, play_session_id, **kwargs)  # noqa: E501
            return data

    def delete_videos_activeencodings_with_http_info(self, device_id, play_session_id, **kwargs):  # noqa: E501
        """delete_videos_activeencodings  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_videos_activeencodings_with_http_info(device_id, play_session_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str device_id: The device id of the client requesting. Used to stop encoding processes when needed. (required)
        :param str play_session_id: The play session id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['device_id', 'play_session_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_videos_activeencodings" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'device_id' is set
        if ('device_id' not in params or
                params['device_id'] is None):
            raise ValueError("Missing the required parameter `device_id` when calling `delete_videos_activeencodings`")  # noqa: E501
        # verify the required parameter 'play_session_id' is set
        if ('play_session_id' not in params or
                params['play_session_id'] is None):
            raise ValueError("Missing the required parameter `play_session_id` when calling `delete_videos_activeencodings`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'device_id' in params:
            query_params.append(('DeviceId', params['device_id']))  # noqa: E501
        if 'play_session_id' in params:
            query_params.append(('PlaySessionId', params['play_session_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Videos/ActiveEncodings', 'DELETE',
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

    def post_videos_activeencodings_delete(self, device_id, play_session_id, **kwargs):  # noqa: E501
        """post_videos_activeencodings_delete  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_videos_activeencodings_delete(device_id, play_session_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str device_id: The device id of the client requesting. Used to stop encoding processes when needed. (required)
        :param str play_session_id: The play session id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_videos_activeencodings_delete_with_http_info(device_id, play_session_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_videos_activeencodings_delete_with_http_info(device_id, play_session_id, **kwargs)  # noqa: E501
            return data

    def post_videos_activeencodings_delete_with_http_info(self, device_id, play_session_id, **kwargs):  # noqa: E501
        """post_videos_activeencodings_delete  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_videos_activeencodings_delete_with_http_info(device_id, play_session_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str device_id: The device id of the client requesting. Used to stop encoding processes when needed. (required)
        :param str play_session_id: The play session id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['device_id', 'play_session_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_videos_activeencodings_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'device_id' is set
        if ('device_id' not in params or
                params['device_id'] is None):
            raise ValueError("Missing the required parameter `device_id` when calling `post_videos_activeencodings_delete`")  # noqa: E501
        # verify the required parameter 'play_session_id' is set
        if ('play_session_id' not in params or
                params['play_session_id'] is None):
            raise ValueError("Missing the required parameter `play_session_id` when calling `post_videos_activeencodings_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'device_id' in params:
            query_params.append(('DeviceId', params['device_id']))  # noqa: E501
        if 'play_session_id' in params:
            query_params.append(('PlaySessionId', params['play_session_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Videos/ActiveEncodings/Delete', 'POST',
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
