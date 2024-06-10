# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class SyncServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def delete_sync_by_targetid_items(self, target_id, **kwargs):  # noqa: E501
        """Cancels items from a sync target  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_sync_by_targetid_items(target_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str target_id: TargetId (required)
        :param str item_ids: ItemIds
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_sync_by_targetid_items_with_http_info(target_id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_sync_by_targetid_items_with_http_info(target_id, **kwargs)  # noqa: E501
            return data

    def delete_sync_by_targetid_items_with_http_info(self, target_id, **kwargs):  # noqa: E501
        """Cancels items from a sync target  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_sync_by_targetid_items_with_http_info(target_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str target_id: TargetId (required)
        :param str item_ids: ItemIds
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['target_id', 'item_ids']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_sync_by_targetid_items" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'target_id' is set
        if ('target_id' not in params or
                params['target_id'] is None):
            raise ValueError("Missing the required parameter `target_id` when calling `delete_sync_by_targetid_items`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'target_id' in params:
            path_params['TargetId'] = params['target_id']  # noqa: E501

        query_params = []
        if 'item_ids' in params:
            query_params.append(('ItemIds', params['item_ids']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Sync/{TargetId}/Items', 'DELETE',
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

    def delete_sync_jobitems_by_id(self, id, **kwargs):  # noqa: E501
        """Cancels a sync job item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_sync_jobitems_by_id(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_sync_jobitems_by_id_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_sync_jobitems_by_id_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def delete_sync_jobitems_by_id_with_http_info(self, id, **kwargs):  # noqa: E501
        """Cancels a sync job item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_sync_jobitems_by_id_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
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
                    " to method delete_sync_jobitems_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_sync_jobitems_by_id`")  # noqa: E501

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
            '/Sync/JobItems/{Id}', 'DELETE',
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

    def delete_sync_jobs_by_id(self, id, **kwargs):  # noqa: E501
        """Cancels a sync job.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_sync_jobs_by_id(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_sync_jobs_by_id_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_sync_jobs_by_id_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def delete_sync_jobs_by_id_with_http_info(self, id, **kwargs):  # noqa: E501
        """Cancels a sync job.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_sync_jobs_by_id_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
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
                    " to method delete_sync_jobs_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_sync_jobs_by_id`")  # noqa: E501

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
            '/Sync/Jobs/{Id}', 'DELETE',
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

    def get_sync_items_ready(self, target_id, **kwargs):  # noqa: E501
        """Gets ready to download sync items.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_items_ready(target_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str target_id: TargetId (required)
        :return: list[SyncedItem]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_sync_items_ready_with_http_info(target_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_sync_items_ready_with_http_info(target_id, **kwargs)  # noqa: E501
            return data

    def get_sync_items_ready_with_http_info(self, target_id, **kwargs):  # noqa: E501
        """Gets ready to download sync items.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_items_ready_with_http_info(target_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str target_id: TargetId (required)
        :return: list[SyncedItem]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['target_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_sync_items_ready" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'target_id' is set
        if ('target_id' not in params or
                params['target_id'] is None):
            raise ValueError("Missing the required parameter `target_id` when calling `get_sync_items_ready`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'target_id' in params:
            query_params.append(('TargetId', params['target_id']))  # noqa: E501

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
            '/Sync/Items/Ready', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[SyncedItem]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_sync_jobitems(self, target_id, **kwargs):  # noqa: E501
        """Gets sync job items.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_jobitems(target_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str target_id: TargetId (required)
        :return: QueryResultSyncJobItem
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_sync_jobitems_with_http_info(target_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_sync_jobitems_with_http_info(target_id, **kwargs)  # noqa: E501
            return data

    def get_sync_jobitems_with_http_info(self, target_id, **kwargs):  # noqa: E501
        """Gets sync job items.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_jobitems_with_http_info(target_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str target_id: TargetId (required)
        :return: QueryResultSyncJobItem
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['target_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_sync_jobitems" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'target_id' is set
        if ('target_id' not in params or
                params['target_id'] is None):
            raise ValueError("Missing the required parameter `target_id` when calling `get_sync_jobitems`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'target_id' in params:
            query_params.append(('TargetId', params['target_id']))  # noqa: E501

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
            '/Sync/JobItems', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultSyncJobItem',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_sync_jobitems_by_id_additionalfiles(self, id, name, **kwargs):  # noqa: E501
        """Gets a sync job item file  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_jobitems_by_id_additionalfiles(id, name, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
        :param str name: Name (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_sync_jobitems_by_id_additionalfiles_with_http_info(id, name, **kwargs)  # noqa: E501
        else:
            (data) = self.get_sync_jobitems_by_id_additionalfiles_with_http_info(id, name, **kwargs)  # noqa: E501
            return data

    def get_sync_jobitems_by_id_additionalfiles_with_http_info(self, id, name, **kwargs):  # noqa: E501
        """Gets a sync job item file  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_jobitems_by_id_additionalfiles_with_http_info(id, name, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
        :param str name: Name (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'name']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_sync_jobitems_by_id_additionalfiles" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_sync_jobitems_by_id_additionalfiles`")  # noqa: E501
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_sync_jobitems_by_id_additionalfiles`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'name' in params:
            query_params.append(('Name', params['name']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Sync/JobItems/{Id}/AdditionalFiles', 'GET',
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

    def get_sync_jobitems_by_id_file(self, id, **kwargs):  # noqa: E501
        """Gets a sync job item file  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_jobitems_by_id_file(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_sync_jobitems_by_id_file_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_sync_jobitems_by_id_file_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_sync_jobitems_by_id_file_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a sync job item file  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_jobitems_by_id_file_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
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
                    " to method get_sync_jobitems_by_id_file" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_sync_jobitems_by_id_file`")  # noqa: E501

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
            '/Sync/JobItems/{Id}/File', 'GET',
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

    def get_sync_jobs(self, **kwargs):  # noqa: E501
        """Gets sync jobs.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_jobs(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: QueryResultSyncJob
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_sync_jobs_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_sync_jobs_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_sync_jobs_with_http_info(self, **kwargs):  # noqa: E501
        """Gets sync jobs.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_jobs_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: QueryResultSyncJob
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = []  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_sync_jobs" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

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
            '/Sync/Jobs', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultSyncJob',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_sync_jobs_by_id(self, id, **kwargs):  # noqa: E501
        """Gets a sync job.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_jobs_by_id(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
        :return: SyncJob
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_sync_jobs_by_id_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_sync_jobs_by_id_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_sync_jobs_by_id_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a sync job.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_jobs_by_id_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
        :return: SyncJob
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
                    " to method get_sync_jobs_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_sync_jobs_by_id`")  # noqa: E501

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
            '/Sync/Jobs/{Id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='SyncJob',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_sync_options(self, user_id, **kwargs):  # noqa: E501
        """Gets a list of available sync targets.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_options(user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: UserId (required)
        :param str item_ids: ItemIds
        :param str parent_id: ParentId
        :param str target_id: TargetId
        :param SyncCategory category: Category
        :return: SyncDialogOptions
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_sync_options_with_http_info(user_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_sync_options_with_http_info(user_id, **kwargs)  # noqa: E501
            return data

    def get_sync_options_with_http_info(self, user_id, **kwargs):  # noqa: E501
        """Gets a list of available sync targets.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_options_with_http_info(user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: UserId (required)
        :param str item_ids: ItemIds
        :param str parent_id: ParentId
        :param str target_id: TargetId
        :param SyncCategory category: Category
        :return: SyncDialogOptions
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['user_id', 'item_ids', 'parent_id', 'target_id', 'category']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_sync_options" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `get_sync_options`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'item_ids' in params:
            query_params.append(('ItemIds', params['item_ids']))  # noqa: E501
        if 'parent_id' in params:
            query_params.append(('ParentId', params['parent_id']))  # noqa: E501
        if 'target_id' in params:
            query_params.append(('TargetId', params['target_id']))  # noqa: E501
        if 'category' in params:
            query_params.append(('Category', params['category']))  # noqa: E501

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
            '/Sync/Options', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='SyncDialogOptions',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_sync_targets(self, user_id, **kwargs):  # noqa: E501
        """Gets a list of available sync targets.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_targets(user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: UserId (required)
        :return: list[SyncTarget]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_sync_targets_with_http_info(user_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_sync_targets_with_http_info(user_id, **kwargs)  # noqa: E501
            return data

    def get_sync_targets_with_http_info(self, user_id, **kwargs):  # noqa: E501
        """Gets a list of available sync targets.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_sync_targets_with_http_info(user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: UserId (required)
        :return: list[SyncTarget]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['user_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_sync_targets" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `get_sync_targets`")  # noqa: E501

        collection_formats = {}

        path_params = {}

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
            '/Sync/Targets', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[SyncTarget]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def head_sync_jobitems_by_id_file(self, id, **kwargs):  # noqa: E501
        """Gets a sync job item file  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_sync_jobitems_by_id_file(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_sync_jobitems_by_id_file_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.head_sync_jobitems_by_id_file_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def head_sync_jobitems_by_id_file_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a sync job item file  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_sync_jobitems_by_id_file_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
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
                    " to method head_sync_jobitems_by_id_file" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `head_sync_jobitems_by_id_file`")  # noqa: E501

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
            '/Sync/JobItems/{Id}/File', 'HEAD',
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

    def post_sync_by_itemid_status(self, body, item_id, **kwargs):  # noqa: E501
        """Gets sync status for an item.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_by_itemid_status(body, item_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param SyncedItemProgress body: SyncedItemProgress:  (required)
        :param str item_id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sync_by_itemid_status_with_http_info(body, item_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sync_by_itemid_status_with_http_info(body, item_id, **kwargs)  # noqa: E501
            return data

    def post_sync_by_itemid_status_with_http_info(self, body, item_id, **kwargs):  # noqa: E501
        """Gets sync status for an item.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_by_itemid_status_with_http_info(body, item_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param SyncedItemProgress body: SyncedItemProgress:  (required)
        :param str item_id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'item_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sync_by_itemid_status" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_sync_by_itemid_status`")  # noqa: E501
        # verify the required parameter 'item_id' is set
        if ('item_id' not in params or
                params['item_id'] is None):
            raise ValueError("Missing the required parameter `item_id` when calling `post_sync_by_itemid_status`")  # noqa: E501

        collection_formats = {}

        path_params = {}
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
            '/Sync/{ItemId}/Status', 'POST',
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

    def post_sync_by_targetid_items_delete(self, target_id, **kwargs):  # noqa: E501
        """Cancels items from a sync target  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_by_targetid_items_delete(target_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str target_id: TargetId (required)
        :param str item_ids: ItemIds
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sync_by_targetid_items_delete_with_http_info(target_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sync_by_targetid_items_delete_with_http_info(target_id, **kwargs)  # noqa: E501
            return data

    def post_sync_by_targetid_items_delete_with_http_info(self, target_id, **kwargs):  # noqa: E501
        """Cancels items from a sync target  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_by_targetid_items_delete_with_http_info(target_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str target_id: TargetId (required)
        :param str item_ids: ItemIds
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['target_id', 'item_ids']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sync_by_targetid_items_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'target_id' is set
        if ('target_id' not in params or
                params['target_id'] is None):
            raise ValueError("Missing the required parameter `target_id` when calling `post_sync_by_targetid_items_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'target_id' in params:
            path_params['TargetId'] = params['target_id']  # noqa: E501

        query_params = []
        if 'item_ids' in params:
            query_params.append(('ItemIds', params['item_ids']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Sync/{TargetId}/Items/Delete', 'POST',
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

    def post_sync_data(self, body, target_id, **kwargs):  # noqa: E501
        """Syncs data between device and server  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_data(body, target_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param SyncDataRequest body: SyncDataRequest:  (required)
        :param str target_id: TargetId (required)
        :return: SyncDataResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sync_data_with_http_info(body, target_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sync_data_with_http_info(body, target_id, **kwargs)  # noqa: E501
            return data

    def post_sync_data_with_http_info(self, body, target_id, **kwargs):  # noqa: E501
        """Syncs data between device and server  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_data_with_http_info(body, target_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param SyncDataRequest body: SyncDataRequest:  (required)
        :param str target_id: TargetId (required)
        :return: SyncDataResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'target_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sync_data" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_sync_data`")  # noqa: E501
        # verify the required parameter 'target_id' is set
        if ('target_id' not in params or
                params['target_id'] is None):
            raise ValueError("Missing the required parameter `target_id` when calling `post_sync_data`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'target_id' in params:
            query_params.append(('TargetId', params['target_id']))  # noqa: E501

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
            '/Sync/Data', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='SyncDataResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_sync_items_cancel(self, **kwargs):  # noqa: E501
        """Cancels items from a sync target  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_items_cancel(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str item_ids: ItemIds
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sync_items_cancel_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.post_sync_items_cancel_with_http_info(**kwargs)  # noqa: E501
            return data

    def post_sync_items_cancel_with_http_info(self, **kwargs):  # noqa: E501
        """Cancels items from a sync target  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_items_cancel_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str item_ids: ItemIds
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['item_ids']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_sync_items_cancel" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'item_ids' in params:
            query_params.append(('ItemIds', params['item_ids']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Sync/Items/Cancel', 'POST',
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

    def post_sync_jobitems_by_id_delete(self, id, **kwargs):  # noqa: E501
        """Cancels a sync job item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobitems_by_id_delete(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sync_jobitems_by_id_delete_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sync_jobitems_by_id_delete_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def post_sync_jobitems_by_id_delete_with_http_info(self, id, **kwargs):  # noqa: E501
        """Cancels a sync job item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobitems_by_id_delete_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
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
                    " to method post_sync_jobitems_by_id_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sync_jobitems_by_id_delete`")  # noqa: E501

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
            '/Sync/JobItems/{Id}/Delete', 'POST',
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

    def post_sync_jobitems_by_id_enable(self, id, **kwargs):  # noqa: E501
        """Enables a cancelled or queued sync job item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobitems_by_id_enable(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sync_jobitems_by_id_enable_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sync_jobitems_by_id_enable_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def post_sync_jobitems_by_id_enable_with_http_info(self, id, **kwargs):  # noqa: E501
        """Enables a cancelled or queued sync job item  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobitems_by_id_enable_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
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
                    " to method post_sync_jobitems_by_id_enable" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sync_jobitems_by_id_enable`")  # noqa: E501

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
            '/Sync/JobItems/{Id}/Enable', 'POST',
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

    def post_sync_jobitems_by_id_markforremoval(self, id, **kwargs):  # noqa: E501
        """Marks a job item for removal  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobitems_by_id_markforremoval(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sync_jobitems_by_id_markforremoval_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sync_jobitems_by_id_markforremoval_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def post_sync_jobitems_by_id_markforremoval_with_http_info(self, id, **kwargs):  # noqa: E501
        """Marks a job item for removal  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobitems_by_id_markforremoval_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
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
                    " to method post_sync_jobitems_by_id_markforremoval" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sync_jobitems_by_id_markforremoval`")  # noqa: E501

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
            '/Sync/JobItems/{Id}/MarkForRemoval', 'POST',
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

    def post_sync_jobitems_by_id_transferred(self, id, **kwargs):  # noqa: E501
        """Reports that a sync job item has successfully been transferred.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobitems_by_id_transferred(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sync_jobitems_by_id_transferred_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sync_jobitems_by_id_transferred_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def post_sync_jobitems_by_id_transferred_with_http_info(self, id, **kwargs):  # noqa: E501
        """Reports that a sync job item has successfully been transferred.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobitems_by_id_transferred_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
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
                    " to method post_sync_jobitems_by_id_transferred" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sync_jobitems_by_id_transferred`")  # noqa: E501

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
            '/Sync/JobItems/{Id}/Transferred', 'POST',
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

    def post_sync_jobitems_by_id_unmarkforremoval(self, id, **kwargs):  # noqa: E501
        """Unmarks a job item for removal  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobitems_by_id_unmarkforremoval(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sync_jobitems_by_id_unmarkforremoval_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sync_jobitems_by_id_unmarkforremoval_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def post_sync_jobitems_by_id_unmarkforremoval_with_http_info(self, id, **kwargs):  # noqa: E501
        """Unmarks a job item for removal  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobitems_by_id_unmarkforremoval_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
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
                    " to method post_sync_jobitems_by_id_unmarkforremoval" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sync_jobitems_by_id_unmarkforremoval`")  # noqa: E501

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
            '/Sync/JobItems/{Id}/UnmarkForRemoval', 'POST',
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

    def post_sync_jobs(self, body, **kwargs):  # noqa: E501
        """Gets sync jobs.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobs(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param SyncJobRequest body: SyncJobRequest:  (required)
        :return: SyncJobCreationResult
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sync_jobs_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sync_jobs_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_sync_jobs_with_http_info(self, body, **kwargs):  # noqa: E501
        """Gets sync jobs.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobs_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param SyncJobRequest body: SyncJobRequest:  (required)
        :return: SyncJobCreationResult
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
                    " to method post_sync_jobs" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_sync_jobs`")  # noqa: E501

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
            '/Sync/Jobs', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='SyncJobCreationResult',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_sync_jobs_by_id(self, body, id, **kwargs):  # noqa: E501
        """Updates a sync job.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobs_by_id(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param SyncJob body: SyncJob:  (required)
        :param int id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sync_jobs_by_id_with_http_info(body, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sync_jobs_by_id_with_http_info(body, id, **kwargs)  # noqa: E501
            return data

    def post_sync_jobs_by_id_with_http_info(self, body, id, **kwargs):  # noqa: E501
        """Updates a sync job.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobs_by_id_with_http_info(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param SyncJob body: SyncJob:  (required)
        :param int id: (required)
        :return: None
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
                    " to method post_sync_jobs_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_sync_jobs_by_id`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sync_jobs_by_id`")  # noqa: E501

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
        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json', 'application/xml'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Sync/Jobs/{Id}', 'POST',
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

    def post_sync_jobs_by_id_delete(self, id, **kwargs):  # noqa: E501
        """Cancels a sync job.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobs_by_id_delete(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sync_jobs_by_id_delete_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sync_jobs_by_id_delete_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def post_sync_jobs_by_id_delete_with_http_info(self, id, **kwargs):  # noqa: E501
        """Cancels a sync job.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_jobs_by_id_delete_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Id (required)
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
                    " to method post_sync_jobs_by_id_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_sync_jobs_by_id_delete`")  # noqa: E501

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
            '/Sync/Jobs/{Id}/Delete', 'POST',
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

    def post_sync_offlineactions(self, body, **kwargs):  # noqa: E501
        """Reports an action that occurred while offline.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_offlineactions(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param list[UserAction] body: List`1:  (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_sync_offlineactions_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_sync_offlineactions_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_sync_offlineactions_with_http_info(self, body, **kwargs):  # noqa: E501
        """Reports an action that occurred while offline.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_sync_offlineactions_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param list[UserAction] body: List`1:  (required)
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
                    " to method post_sync_offlineactions" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_sync_offlineactions`")  # noqa: E501

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
            '/Sync/OfflineActions', 'POST',
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
