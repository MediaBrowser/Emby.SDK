# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from embyclient.api_client import ApiClient


class LogDownloadServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_encoding_logs_download(self, ticket, **kwargs):  # noqa: E501
        """Downloads logs for the ticket of a download link  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_encoding_logs_download(ticket, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ticket: The ticket of the download link (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_encoding_logs_download_with_http_info(ticket, **kwargs)  # noqa: E501
        else:
            (data) = self.get_encoding_logs_download_with_http_info(ticket, **kwargs)  # noqa: E501
            return data

    def get_encoding_logs_download_with_http_info(self, ticket, **kwargs):  # noqa: E501
        """Downloads logs for the ticket of a download link  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_encoding_logs_download_with_http_info(ticket, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ticket: The ticket of the download link (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ticket']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_encoding_logs_download" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'ticket' is set
        if ('ticket' not in params or
                params['ticket'] is None):
            raise ValueError("Missing the required parameter `ticket` when calling `get_encoding_logs_download`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'ticket' in params:
            query_params.append(('Ticket', params['ticket']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Encoding/Logs/Download', 'GET',
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
