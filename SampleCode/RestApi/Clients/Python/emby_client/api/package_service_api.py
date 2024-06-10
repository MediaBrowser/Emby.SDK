# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class PackageServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def delete_packages_installing_by_id(self, id, **kwargs):  # noqa: E501
        """Cancels a package installation  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_packages_installing_by_id(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Installation Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_packages_installing_by_id_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_packages_installing_by_id_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def delete_packages_installing_by_id_with_http_info(self, id, **kwargs):  # noqa: E501
        """Cancels a package installation  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_packages_installing_by_id_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Installation Id (required)
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
                    " to method delete_packages_installing_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_packages_installing_by_id`")  # noqa: E501

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
            '/Packages/Installing/{Id}', 'DELETE',
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

    def get_packages(self, **kwargs):  # noqa: E501
        """Gets available packages  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_packages(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str package_type: Optional package type filter (System/UserInstalled)
        :param str target_systems: Optional. Filter by target system type. Allows multiple, comma delimited.
        :param bool is_premium: Optional. Filter by premium status
        :param bool is_adult: Optional. Filter by package that contain adult content.
        :return: list[PackageInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_packages_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_packages_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_packages_with_http_info(self, **kwargs):  # noqa: E501
        """Gets available packages  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_packages_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str package_type: Optional package type filter (System/UserInstalled)
        :param str target_systems: Optional. Filter by target system type. Allows multiple, comma delimited.
        :param bool is_premium: Optional. Filter by premium status
        :param bool is_adult: Optional. Filter by package that contain adult content.
        :return: list[PackageInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['package_type', 'target_systems', 'is_premium', 'is_adult']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_packages" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'package_type' in params:
            query_params.append(('PackageType', params['package_type']))  # noqa: E501
        if 'target_systems' in params:
            query_params.append(('TargetSystems', params['target_systems']))  # noqa: E501
        if 'is_premium' in params:
            query_params.append(('IsPremium', params['is_premium']))  # noqa: E501
        if 'is_adult' in params:
            query_params.append(('IsAdult', params['is_adult']))  # noqa: E501

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
            '/Packages', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[PackageInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_packages_by_name(self, name, **kwargs):  # noqa: E501
        """Gets a package, by name or assembly guid  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_packages_by_name(name, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: The name of the package (required)
        :param str assembly_guid: The guid of the associated assembly
        :return: PackageInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_packages_by_name_with_http_info(name, **kwargs)  # noqa: E501
        else:
            (data) = self.get_packages_by_name_with_http_info(name, **kwargs)  # noqa: E501
            return data

    def get_packages_by_name_with_http_info(self, name, **kwargs):  # noqa: E501
        """Gets a package, by name or assembly guid  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_packages_by_name_with_http_info(name, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: The name of the package (required)
        :param str assembly_guid: The guid of the associated assembly
        :return: PackageInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'assembly_guid']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_packages_by_name" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `get_packages_by_name`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501

        query_params = []
        if 'assembly_guid' in params:
            query_params.append(('AssemblyGuid', params['assembly_guid']))  # noqa: E501

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
            '/Packages/{Name}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PackageInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_packages_updates(self, package_type, **kwargs):  # noqa: E501
        """Gets available package updates for currently installed packages  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_packages_updates(package_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str package_type: Package type filter (System/UserInstalled) (required)
        :return: list[PackageVersionInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_packages_updates_with_http_info(package_type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_packages_updates_with_http_info(package_type, **kwargs)  # noqa: E501
            return data

    def get_packages_updates_with_http_info(self, package_type, **kwargs):  # noqa: E501
        """Gets available package updates for currently installed packages  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_packages_updates_with_http_info(package_type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str package_type: Package type filter (System/UserInstalled) (required)
        :return: list[PackageVersionInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['package_type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_packages_updates" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'package_type' is set
        if ('package_type' not in params or
                params['package_type'] is None):
            raise ValueError("Missing the required parameter `package_type` when calling `get_packages_updates`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'package_type' in params:
            query_params.append(('PackageType', params['package_type']))  # noqa: E501

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
            '/Packages/Updates', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[PackageVersionInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_packages_installed_by_name(self, name, **kwargs):  # noqa: E501
        """Installs a package  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_packages_installed_by_name(name, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Package name (required)
        :param str assembly_guid: Guid of the associated assembly
        :param str version: Optional version. Defaults to latest version.
        :param PackageVersionClass update_class: Optional update class (Dev, Beta, Release). Defaults to Release.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_packages_installed_by_name_with_http_info(name, **kwargs)  # noqa: E501
        else:
            (data) = self.post_packages_installed_by_name_with_http_info(name, **kwargs)  # noqa: E501
            return data

    def post_packages_installed_by_name_with_http_info(self, name, **kwargs):  # noqa: E501
        """Installs a package  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_packages_installed_by_name_with_http_info(name, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str name: Package name (required)
        :param str assembly_guid: Guid of the associated assembly
        :param str version: Optional version. Defaults to latest version.
        :param PackageVersionClass update_class: Optional update class (Dev, Beta, Release). Defaults to Release.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['name', 'assembly_guid', 'version', 'update_class']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_packages_installed_by_name" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'name' is set
        if ('name' not in params or
                params['name'] is None):
            raise ValueError("Missing the required parameter `name` when calling `post_packages_installed_by_name`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'name' in params:
            path_params['Name'] = params['name']  # noqa: E501

        query_params = []
        if 'assembly_guid' in params:
            query_params.append(('AssemblyGuid', params['assembly_guid']))  # noqa: E501
        if 'version' in params:
            query_params.append(('Version', params['version']))  # noqa: E501
        if 'update_class' in params:
            query_params.append(('UpdateClass', params['update_class']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Packages/Installed/{Name}', 'POST',
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

    def post_packages_installing_by_id_delete(self, id, **kwargs):  # noqa: E501
        """Cancels a package installation  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_packages_installing_by_id_delete(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Installation Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_packages_installing_by_id_delete_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_packages_installing_by_id_delete_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def post_packages_installing_by_id_delete_with_http_info(self, id, **kwargs):  # noqa: E501
        """Cancels a package installation  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_packages_installing_by_id_delete_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Installation Id (required)
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
                    " to method post_packages_installing_by_id_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_packages_installing_by_id_delete`")  # noqa: E501

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
            '/Packages/Installing/{Id}/Delete', 'POST',
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
