# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class DlnaServerServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_dlna_by_uuid_connectionmanager_connectionmanager(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna connection manager xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_by_uuid_connectionmanager_connectionmanager(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_dlna_by_uuid_connectionmanager_connectionmanager_with_http_info(uu_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_dlna_by_uuid_connectionmanager_connectionmanager_with_http_info(uu_id, **kwargs)  # noqa: E501
            return data

    def get_dlna_by_uuid_connectionmanager_connectionmanager_with_http_info(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna connection manager xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_by_uuid_connectionmanager_connectionmanager_with_http_info(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['uu_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dlna_by_uuid_connectionmanager_connectionmanager" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'uu_id' is set
        if ('uu_id' not in params or
                params['uu_id'] is None):
            raise ValueError("Missing the required parameter `uu_id` when calling `get_dlna_by_uuid_connectionmanager_connectionmanager`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'uu_id' in params:
            path_params['UuId'] = params['uu_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/{UuId}/connectionmanager/connectionmanager', 'GET',
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

    def get_dlna_by_uuid_connectionmanager_connectionmanager_xml(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna connection manager xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_by_uuid_connectionmanager_connectionmanager_xml(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_dlna_by_uuid_connectionmanager_connectionmanager_xml_with_http_info(uu_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_dlna_by_uuid_connectionmanager_connectionmanager_xml_with_http_info(uu_id, **kwargs)  # noqa: E501
            return data

    def get_dlna_by_uuid_connectionmanager_connectionmanager_xml_with_http_info(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna connection manager xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_by_uuid_connectionmanager_connectionmanager_xml_with_http_info(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['uu_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dlna_by_uuid_connectionmanager_connectionmanager_xml" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'uu_id' is set
        if ('uu_id' not in params or
                params['uu_id'] is None):
            raise ValueError("Missing the required parameter `uu_id` when calling `get_dlna_by_uuid_connectionmanager_connectionmanager_xml`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'uu_id' in params:
            path_params['UuId'] = params['uu_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/{UuId}/connectionmanager/connectionmanager.xml', 'GET',
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

    def get_dlna_by_uuid_contentdirectory_contentdirectory(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna content directory xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_by_uuid_contentdirectory_contentdirectory(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_dlna_by_uuid_contentdirectory_contentdirectory_with_http_info(uu_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_dlna_by_uuid_contentdirectory_contentdirectory_with_http_info(uu_id, **kwargs)  # noqa: E501
            return data

    def get_dlna_by_uuid_contentdirectory_contentdirectory_with_http_info(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna content directory xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_by_uuid_contentdirectory_contentdirectory_with_http_info(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['uu_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dlna_by_uuid_contentdirectory_contentdirectory" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'uu_id' is set
        if ('uu_id' not in params or
                params['uu_id'] is None):
            raise ValueError("Missing the required parameter `uu_id` when calling `get_dlna_by_uuid_contentdirectory_contentdirectory`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'uu_id' in params:
            path_params['UuId'] = params['uu_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/{UuId}/contentdirectory/contentdirectory', 'GET',
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

    def get_dlna_by_uuid_contentdirectory_contentdirectory_xml(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna content directory xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_by_uuid_contentdirectory_contentdirectory_xml(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_dlna_by_uuid_contentdirectory_contentdirectory_xml_with_http_info(uu_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_dlna_by_uuid_contentdirectory_contentdirectory_xml_with_http_info(uu_id, **kwargs)  # noqa: E501
            return data

    def get_dlna_by_uuid_contentdirectory_contentdirectory_xml_with_http_info(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna content directory xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_by_uuid_contentdirectory_contentdirectory_xml_with_http_info(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['uu_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dlna_by_uuid_contentdirectory_contentdirectory_xml" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'uu_id' is set
        if ('uu_id' not in params or
                params['uu_id'] is None):
            raise ValueError("Missing the required parameter `uu_id` when calling `get_dlna_by_uuid_contentdirectory_contentdirectory_xml`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'uu_id' in params:
            path_params['UuId'] = params['uu_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/{UuId}/contentdirectory/contentdirectory.xml', 'GET',
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

    def get_dlna_by_uuid_description(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna server info  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_by_uuid_description(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_dlna_by_uuid_description_with_http_info(uu_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_dlna_by_uuid_description_with_http_info(uu_id, **kwargs)  # noqa: E501
            return data

    def get_dlna_by_uuid_description_with_http_info(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna server info  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_by_uuid_description_with_http_info(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['uu_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dlna_by_uuid_description" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'uu_id' is set
        if ('uu_id' not in params or
                params['uu_id'] is None):
            raise ValueError("Missing the required parameter `uu_id` when calling `get_dlna_by_uuid_description`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'uu_id' in params:
            path_params['UuId'] = params['uu_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/{UuId}/description', 'GET',
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

    def get_dlna_by_uuid_description_xml(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna server info  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_by_uuid_description_xml(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_dlna_by_uuid_description_xml_with_http_info(uu_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_dlna_by_uuid_description_xml_with_http_info(uu_id, **kwargs)  # noqa: E501
            return data

    def get_dlna_by_uuid_description_xml_with_http_info(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna server info  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_by_uuid_description_xml_with_http_info(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['uu_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dlna_by_uuid_description_xml" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'uu_id' is set
        if ('uu_id' not in params or
                params['uu_id'] is None):
            raise ValueError("Missing the required parameter `uu_id` when calling `get_dlna_by_uuid_description_xml`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'uu_id' in params:
            path_params['UuId'] = params['uu_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/{UuId}/description.xml', 'GET',
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

    def get_dlna_by_uuid_icons_by_filename(self, uu_id, filename, **kwargs):  # noqa: E501
        """Gets a server icon  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_by_uuid_icons_by_filename(uu_id, filename, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :param str filename: The icon filename (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_dlna_by_uuid_icons_by_filename_with_http_info(uu_id, filename, **kwargs)  # noqa: E501
        else:
            (data) = self.get_dlna_by_uuid_icons_by_filename_with_http_info(uu_id, filename, **kwargs)  # noqa: E501
            return data

    def get_dlna_by_uuid_icons_by_filename_with_http_info(self, uu_id, filename, **kwargs):  # noqa: E501
        """Gets a server icon  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_by_uuid_icons_by_filename_with_http_info(uu_id, filename, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :param str filename: The icon filename (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['uu_id', 'filename']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dlna_by_uuid_icons_by_filename" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'uu_id' is set
        if ('uu_id' not in params or
                params['uu_id'] is None):
            raise ValueError("Missing the required parameter `uu_id` when calling `get_dlna_by_uuid_icons_by_filename`")  # noqa: E501
        # verify the required parameter 'filename' is set
        if ('filename' not in params or
                params['filename'] is None):
            raise ValueError("Missing the required parameter `filename` when calling `get_dlna_by_uuid_icons_by_filename`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'uu_id' in params:
            path_params['UuId'] = params['uu_id']  # noqa: E501
        if 'filename' in params:
            path_params['Filename'] = params['filename']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/{UuId}/icons/{Filename}', 'GET',
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

    def get_dlna_icons_by_filename(self, filename, **kwargs):  # noqa: E501
        """Gets a server icon  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_icons_by_filename(filename, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str filename: The icon filename (required)
        :param str uu_id: Server UuId
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_dlna_icons_by_filename_with_http_info(filename, **kwargs)  # noqa: E501
        else:
            (data) = self.get_dlna_icons_by_filename_with_http_info(filename, **kwargs)  # noqa: E501
            return data

    def get_dlna_icons_by_filename_with_http_info(self, filename, **kwargs):  # noqa: E501
        """Gets a server icon  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dlna_icons_by_filename_with_http_info(filename, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str filename: The icon filename (required)
        :param str uu_id: Server UuId
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['filename', 'uu_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dlna_icons_by_filename" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'filename' is set
        if ('filename' not in params or
                params['filename'] is None):
            raise ValueError("Missing the required parameter `filename` when calling `get_dlna_icons_by_filename`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'filename' in params:
            path_params['Filename'] = params['filename']  # noqa: E501

        query_params = []
        if 'uu_id' in params:
            query_params.append(('UuId', params['uu_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/icons/{Filename}', 'GET',
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

    def head_dlna_by_uuid_connectionmanager_connectionmanager(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna connection manager xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_dlna_by_uuid_connectionmanager_connectionmanager(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_dlna_by_uuid_connectionmanager_connectionmanager_with_http_info(uu_id, **kwargs)  # noqa: E501
        else:
            (data) = self.head_dlna_by_uuid_connectionmanager_connectionmanager_with_http_info(uu_id, **kwargs)  # noqa: E501
            return data

    def head_dlna_by_uuid_connectionmanager_connectionmanager_with_http_info(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna connection manager xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_dlna_by_uuid_connectionmanager_connectionmanager_with_http_info(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['uu_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_dlna_by_uuid_connectionmanager_connectionmanager" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'uu_id' is set
        if ('uu_id' not in params or
                params['uu_id'] is None):
            raise ValueError("Missing the required parameter `uu_id` when calling `head_dlna_by_uuid_connectionmanager_connectionmanager`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'uu_id' in params:
            path_params['UuId'] = params['uu_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/{UuId}/connectionmanager/connectionmanager', 'HEAD',
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

    def head_dlna_by_uuid_connectionmanager_connectionmanager_xml(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna connection manager xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_dlna_by_uuid_connectionmanager_connectionmanager_xml(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_dlna_by_uuid_connectionmanager_connectionmanager_xml_with_http_info(uu_id, **kwargs)  # noqa: E501
        else:
            (data) = self.head_dlna_by_uuid_connectionmanager_connectionmanager_xml_with_http_info(uu_id, **kwargs)  # noqa: E501
            return data

    def head_dlna_by_uuid_connectionmanager_connectionmanager_xml_with_http_info(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna connection manager xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_dlna_by_uuid_connectionmanager_connectionmanager_xml_with_http_info(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['uu_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_dlna_by_uuid_connectionmanager_connectionmanager_xml" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'uu_id' is set
        if ('uu_id' not in params or
                params['uu_id'] is None):
            raise ValueError("Missing the required parameter `uu_id` when calling `head_dlna_by_uuid_connectionmanager_connectionmanager_xml`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'uu_id' in params:
            path_params['UuId'] = params['uu_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/{UuId}/connectionmanager/connectionmanager.xml', 'HEAD',
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

    def head_dlna_by_uuid_contentdirectory_contentdirectory(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna content directory xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_dlna_by_uuid_contentdirectory_contentdirectory(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_dlna_by_uuid_contentdirectory_contentdirectory_with_http_info(uu_id, **kwargs)  # noqa: E501
        else:
            (data) = self.head_dlna_by_uuid_contentdirectory_contentdirectory_with_http_info(uu_id, **kwargs)  # noqa: E501
            return data

    def head_dlna_by_uuid_contentdirectory_contentdirectory_with_http_info(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna content directory xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_dlna_by_uuid_contentdirectory_contentdirectory_with_http_info(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['uu_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_dlna_by_uuid_contentdirectory_contentdirectory" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'uu_id' is set
        if ('uu_id' not in params or
                params['uu_id'] is None):
            raise ValueError("Missing the required parameter `uu_id` when calling `head_dlna_by_uuid_contentdirectory_contentdirectory`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'uu_id' in params:
            path_params['UuId'] = params['uu_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/{UuId}/contentdirectory/contentdirectory', 'HEAD',
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

    def head_dlna_by_uuid_contentdirectory_contentdirectory_xml(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna content directory xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_dlna_by_uuid_contentdirectory_contentdirectory_xml(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_dlna_by_uuid_contentdirectory_contentdirectory_xml_with_http_info(uu_id, **kwargs)  # noqa: E501
        else:
            (data) = self.head_dlna_by_uuid_contentdirectory_contentdirectory_xml_with_http_info(uu_id, **kwargs)  # noqa: E501
            return data

    def head_dlna_by_uuid_contentdirectory_contentdirectory_xml_with_http_info(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna content directory xml  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_dlna_by_uuid_contentdirectory_contentdirectory_xml_with_http_info(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['uu_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_dlna_by_uuid_contentdirectory_contentdirectory_xml" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'uu_id' is set
        if ('uu_id' not in params or
                params['uu_id'] is None):
            raise ValueError("Missing the required parameter `uu_id` when calling `head_dlna_by_uuid_contentdirectory_contentdirectory_xml`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'uu_id' in params:
            path_params['UuId'] = params['uu_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/{UuId}/contentdirectory/contentdirectory.xml', 'HEAD',
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

    def head_dlna_by_uuid_description(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna server info  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_dlna_by_uuid_description(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_dlna_by_uuid_description_with_http_info(uu_id, **kwargs)  # noqa: E501
        else:
            (data) = self.head_dlna_by_uuid_description_with_http_info(uu_id, **kwargs)  # noqa: E501
            return data

    def head_dlna_by_uuid_description_with_http_info(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna server info  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_dlna_by_uuid_description_with_http_info(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['uu_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_dlna_by_uuid_description" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'uu_id' is set
        if ('uu_id' not in params or
                params['uu_id'] is None):
            raise ValueError("Missing the required parameter `uu_id` when calling `head_dlna_by_uuid_description`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'uu_id' in params:
            path_params['UuId'] = params['uu_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/{UuId}/description', 'HEAD',
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

    def head_dlna_by_uuid_description_xml(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna server info  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_dlna_by_uuid_description_xml(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_dlna_by_uuid_description_xml_with_http_info(uu_id, **kwargs)  # noqa: E501
        else:
            (data) = self.head_dlna_by_uuid_description_xml_with_http_info(uu_id, **kwargs)  # noqa: E501
            return data

    def head_dlna_by_uuid_description_xml_with_http_info(self, uu_id, **kwargs):  # noqa: E501
        """Gets dlna server info  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_dlna_by_uuid_description_xml_with_http_info(uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['uu_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_dlna_by_uuid_description_xml" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'uu_id' is set
        if ('uu_id' not in params or
                params['uu_id'] is None):
            raise ValueError("Missing the required parameter `uu_id` when calling `head_dlna_by_uuid_description_xml`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'uu_id' in params:
            path_params['UuId'] = params['uu_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/{UuId}/description.xml', 'HEAD',
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

    def post_dlna_by_uuid_connectionmanager_control(self, body, uu_id, **kwargs):  # noqa: E501
        """Processes a control request  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_dlna_by_uuid_connectionmanager_control(body, uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_dlna_by_uuid_connectionmanager_control_with_http_info(body, uu_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_dlna_by_uuid_connectionmanager_control_with_http_info(body, uu_id, **kwargs)  # noqa: E501
            return data

    def post_dlna_by_uuid_connectionmanager_control_with_http_info(self, body, uu_id, **kwargs):  # noqa: E501
        """Processes a control request  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_dlna_by_uuid_connectionmanager_control_with_http_info(body, uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'uu_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_dlna_by_uuid_connectionmanager_control" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_dlna_by_uuid_connectionmanager_control`")  # noqa: E501
        # verify the required parameter 'uu_id' is set
        if ('uu_id' not in params or
                params['uu_id'] is None):
            raise ValueError("Missing the required parameter `uu_id` when calling `post_dlna_by_uuid_connectionmanager_control`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'uu_id' in params:
            path_params['UuId'] = params['uu_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/octet-stream'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/{UuId}/connectionmanager/control', 'POST',
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

    def post_dlna_by_uuid_contentdirectory_control(self, body, uu_id, **kwargs):  # noqa: E501
        """Processes a control request  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_dlna_by_uuid_contentdirectory_control(body, uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_dlna_by_uuid_contentdirectory_control_with_http_info(body, uu_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_dlna_by_uuid_contentdirectory_control_with_http_info(body, uu_id, **kwargs)  # noqa: E501
            return data

    def post_dlna_by_uuid_contentdirectory_control_with_http_info(self, body, uu_id, **kwargs):  # noqa: E501
        """Processes a control request  # noqa: E501

        No authentication required  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_dlna_by_uuid_contentdirectory_control_with_http_info(body, uu_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Object body: Binary stream (required)
        :param str uu_id: Server UuId (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'uu_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_dlna_by_uuid_contentdirectory_control" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_dlna_by_uuid_contentdirectory_control`")  # noqa: E501
        # verify the required parameter 'uu_id' is set
        if ('uu_id' not in params or
                params['uu_id'] is None):
            raise ValueError("Missing the required parameter `uu_id` when calling `post_dlna_by_uuid_contentdirectory_control`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'uu_id' in params:
            path_params['UuId'] = params['uu_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/octet-stream'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/Dlna/{UuId}/contentdirectory/control', 'POST',
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
