# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class LiveTvServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def delete_livetv_channelmappingoptions(self, provider_id, **kwargs):  # noqa: E501
        """delete_livetv_channelmappingoptions  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_livetv_channelmappingoptions(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_livetv_channelmappingoptions_with_http_info(provider_id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_livetv_channelmappingoptions_with_http_info(provider_id, **kwargs)  # noqa: E501
            return data

    def delete_livetv_channelmappingoptions_with_http_info(self, provider_id, **kwargs):  # noqa: E501
        """delete_livetv_channelmappingoptions  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_livetv_channelmappingoptions_with_http_info(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['provider_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_livetv_channelmappingoptions" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'provider_id' is set
        if ('provider_id' not in params or
                params['provider_id'] is None):
            raise ValueError("Missing the required parameter `provider_id` when calling `delete_livetv_channelmappingoptions`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'provider_id' in params:
            query_params.append(('ProviderId', params['provider_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/ChannelMappingOptions', 'DELETE',
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

    def delete_livetv_channelmappings(self, provider_id, **kwargs):  # noqa: E501
        """delete_livetv_channelmappings  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_livetv_channelmappings(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_livetv_channelmappings_with_http_info(provider_id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_livetv_channelmappings_with_http_info(provider_id, **kwargs)  # noqa: E501
            return data

    def delete_livetv_channelmappings_with_http_info(self, provider_id, **kwargs):  # noqa: E501
        """delete_livetv_channelmappings  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_livetv_channelmappings_with_http_info(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['provider_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_livetv_channelmappings" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'provider_id' is set
        if ('provider_id' not in params or
                params['provider_id'] is None):
            raise ValueError("Missing the required parameter `provider_id` when calling `delete_livetv_channelmappings`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'provider_id' in params:
            query_params.append(('ProviderId', params['provider_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/ChannelMappings', 'DELETE',
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

    def delete_livetv_listingproviders(self, **kwargs):  # noqa: E501
        """Deletes a listing provider  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_livetv_listingproviders(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Provider id
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_livetv_listingproviders_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.delete_livetv_listingproviders_with_http_info(**kwargs)  # noqa: E501
            return data

    def delete_livetv_listingproviders_with_http_info(self, **kwargs):  # noqa: E501
        """Deletes a listing provider  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_livetv_listingproviders_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Provider id
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
                    " to method delete_livetv_listingproviders" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'id' in params:
            query_params.append(('Id', params['id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/ListingProviders', 'DELETE',
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

    def delete_livetv_recordings_by_id(self, id, **kwargs):  # noqa: E501
        """Deletes a live tv recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_livetv_recordings_by_id(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Recording Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_livetv_recordings_by_id_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_livetv_recordings_by_id_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def delete_livetv_recordings_by_id_with_http_info(self, id, **kwargs):  # noqa: E501
        """Deletes a live tv recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_livetv_recordings_by_id_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Recording Id (required)
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
                    " to method delete_livetv_recordings_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_livetv_recordings_by_id`")  # noqa: E501

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
            '/LiveTv/Recordings/{Id}', 'DELETE',
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

    def delete_livetv_seriestimers_by_id(self, id, **kwargs):  # noqa: E501
        """Cancels a live tv series timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_livetv_seriestimers_by_id(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Timer Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_livetv_seriestimers_by_id_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_livetv_seriestimers_by_id_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def delete_livetv_seriestimers_by_id_with_http_info(self, id, **kwargs):  # noqa: E501
        """Cancels a live tv series timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_livetv_seriestimers_by_id_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Timer Id (required)
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
                    " to method delete_livetv_seriestimers_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_livetv_seriestimers_by_id`")  # noqa: E501

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
            '/LiveTv/SeriesTimers/{Id}', 'DELETE',
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

    def delete_livetv_timers_by_id(self, id, **kwargs):  # noqa: E501
        """Cancels a live tv timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_livetv_timers_by_id(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Timer Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_livetv_timers_by_id_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_livetv_timers_by_id_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def delete_livetv_timers_by_id_with_http_info(self, id, **kwargs):  # noqa: E501
        """Cancels a live tv timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_livetv_timers_by_id_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Timer Id (required)
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
                    " to method delete_livetv_timers_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_livetv_timers_by_id`")  # noqa: E501

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
            '/LiveTv/Timers/{Id}', 'DELETE',
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

    def delete_livetv_tunerhosts(self, **kwargs):  # noqa: E501
        """Deletes a tuner host  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_livetv_tunerhosts(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Tuner host id
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_livetv_tunerhosts_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.delete_livetv_tunerhosts_with_http_info(**kwargs)  # noqa: E501
            return data

    def delete_livetv_tunerhosts_with_http_info(self, **kwargs):  # noqa: E501
        """Deletes a tuner host  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_livetv_tunerhosts_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Tuner host id
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
                    " to method delete_livetv_tunerhosts" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'id' in params:
            query_params.append(('Id', params['id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/TunerHosts', 'DELETE',
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

    def get_livetv_availablerecordingoptions(self, **kwargs):  # noqa: E501
        """Gets available recording options  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_availablerecordingoptions(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: ApiAvailableRecordingOptions
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_availablerecordingoptions_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_availablerecordingoptions_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_availablerecordingoptions_with_http_info(self, **kwargs):  # noqa: E501
        """Gets available recording options  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_availablerecordingoptions_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: ApiAvailableRecordingOptions
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
                    " to method get_livetv_availablerecordingoptions" % key
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
            '/LiveTv/AvailableRecordingOptions', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='ApiAvailableRecordingOptions',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_channelmappingoptions(self, provider_id, **kwargs):  # noqa: E501
        """get_livetv_channelmappingoptions  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_channelmappingoptions(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_channelmappingoptions_with_http_info(provider_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_channelmappingoptions_with_http_info(provider_id, **kwargs)  # noqa: E501
            return data

    def get_livetv_channelmappingoptions_with_http_info(self, provider_id, **kwargs):  # noqa: E501
        """get_livetv_channelmappingoptions  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_channelmappingoptions_with_http_info(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['provider_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_channelmappingoptions" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'provider_id' is set
        if ('provider_id' not in params or
                params['provider_id'] is None):
            raise ValueError("Missing the required parameter `provider_id` when calling `get_livetv_channelmappingoptions`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'provider_id' in params:
            query_params.append(('ProviderId', params['provider_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/ChannelMappingOptions', 'GET',
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

    def get_livetv_channelmappings(self, provider_id, **kwargs):  # noqa: E501
        """get_livetv_channelmappings  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_channelmappings(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_channelmappings_with_http_info(provider_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_channelmappings_with_http_info(provider_id, **kwargs)  # noqa: E501
            return data

    def get_livetv_channelmappings_with_http_info(self, provider_id, **kwargs):  # noqa: E501
        """get_livetv_channelmappings  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_channelmappings_with_http_info(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['provider_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_channelmappings" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'provider_id' is set
        if ('provider_id' not in params or
                params['provider_id'] is None):
            raise ValueError("Missing the required parameter `provider_id` when calling `get_livetv_channelmappings`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'provider_id' in params:
            query_params.append(('ProviderId', params['provider_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/ChannelMappings', 'GET',
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

    def get_livetv_channels(self, **kwargs):  # noqa: E501
        """Gets available live tv channels.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_channels(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvChannelType type: Optional filter by channel type.
        :param bool is_liked: Filter by channels that are liked, or not.
        :param bool is_disliked: Filter by channels that are disliked, or not.
        :param bool enable_favorite_sorting: Incorporate favorite and like status into channel sorting.
        :param bool add_current_program: Optional. Adds current program info to each channel
        :param str artist_type: Artist or AlbumArtist
        :param str max_official_rating: Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
        :param bool has_theme_song: Optional filter by items with theme songs.
        :param bool has_theme_video: Optional filter by items with theme videos.
        :param bool has_subtitles: Optional filter by items with subtitles.
        :param bool has_special_feature: Optional filter by items with special features.
        :param bool has_trailer: Optional filter by items with trailers.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
        :param int min_index_number: Optional filter by minimum index number.
        :param str min_start_date: Optional. The minimum premiere date. Format = ISO
        :param str max_start_date: Optional. The maximum premiere date. Format = ISO
        :param str min_end_date: Optional. The minimum premiere date. Format = ISO
        :param str max_end_date: Optional. The maximum premiere date. Format = ISO
        :param int min_players: Optional filter by minimum number of game players.
        :param int max_players: Optional filter by maximum number of game players.
        :param int parent_index_number: Optional filter by parent index number.
        :param bool has_parental_rating: Optional filter by items that have or do not have a parental rating
        :param bool is_hd: Optional filter by items that are HD or not.
        :param bool is_unaired: Optional filter by items that are unaired episodes or not.
        :param float min_community_rating: Optional filter by minimum community rating.
        :param float min_critic_rating: Optional filter by minimum critic rating.
        :param int aired_during_season: Gets all episodes that aired during a season, including specials.
        :param str min_premiere_date: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved_for_user: Optional. The minimum premiere date. Format = ISO
        :param str max_premiere_date: Optional. The maximum premiere date. Format = ISO
        :param bool has_overview: Optional filter by items that have an overview or not.
        :param bool has_imdb_id: Optional filter by items that have an imdb id or not.
        :param bool has_tmdb_id: Optional filter by items that have a tmdb id or not.
        :param bool has_tvdb_id: Optional filter by items that have a tvdb id or not.
        :param str exclude_item_ids: Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param bool recursive: When searching within folders, this determines whether or not the search will be recursive. true/false
        :param str search_term: Enter a search term to perform a search request
        :param str sort_order: Sort Order - Ascending,Descending
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param str exclude_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str any_provider_id_equals: Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form 'prov.id', e.g. 'imdb.tt123456'. This allows multiple, comma delimeted value pairs.
        :param str filters: Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
        :param bool is_favorite: Optional filter by items that are marked as favorite, or not.
        :param bool is_movie: Optional filter for movies.
        :param bool is_series: Optional filter for series.
        :param bool is_folder: Optional filter for folders.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool is_new: Optional filter for IsNew.
        :param bool is_premiere: Optional filter for IsPremiere.
        :param bool is_new_or_premiere: Optional filter for IsNewOrPremiere.
        :param bool is_repeat: Optional filter for IsRepeat.
        :param bool project_to_media: ProjectToMedia
        :param str media_types: Optional filter by MediaType. Allows multiple, comma delimited.
        :param str image_types: Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
        :param bool is_played: Optional filter by items that are played, or not.
        :param str genres: Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
        :param str official_ratings: Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
        :param str tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str exclude_tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str years: Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str person: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_ids: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_types: Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
        :param str studios: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str studio_ids: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str artists: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str artist_ids: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str albums: Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
        :param str ids: Optional. If specific items are needed, specify a list of item id's to retrieve. This allows multiple, comma delimited.
        :param str video_types: Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
        :param str containers: Optional filter by Container. Allows multiple, comma delimeted.
        :param str audio_codecs: Optional filter by AudioCodec. Allows multiple, comma delimeted.
        :param str audio_layouts: Optional filter by AudioLayout. Allows multiple, comma delimeted.
        :param str video_codecs: Optional filter by VideoCodec. Allows multiple, comma delimeted.
        :param str extended_video_types: Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
        :param str subtitle_codecs: Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
        :param str path: Optional filter by Path.
        :param str user_id: User Id
        :param str min_official_rating: Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
        :param bool is_locked: Optional filter by items that are locked.
        :param bool is_place_holder: Optional filter by items that are placeholders
        :param bool has_official_rating: Optional filter by items that have official ratings
        :param bool group_items_into_collections: Whether or not to hide items behind their boxsets.
        :param bool is3_d: Optional filter by items that are 3D, or not.
        :param str series_status: Optional filter by Series Status. Allows multiple, comma delimeted.
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str album_artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str name_starts_with: Optional filter by items whose name is sorted equally than a given input string.
        :param str name_less_than: Optional filter by items whose name is equally or lesser than a given input string.
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_channels_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_channels_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_channels_with_http_info(self, **kwargs):  # noqa: E501
        """Gets available live tv channels.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_channels_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvChannelType type: Optional filter by channel type.
        :param bool is_liked: Filter by channels that are liked, or not.
        :param bool is_disliked: Filter by channels that are disliked, or not.
        :param bool enable_favorite_sorting: Incorporate favorite and like status into channel sorting.
        :param bool add_current_program: Optional. Adds current program info to each channel
        :param str artist_type: Artist or AlbumArtist
        :param str max_official_rating: Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
        :param bool has_theme_song: Optional filter by items with theme songs.
        :param bool has_theme_video: Optional filter by items with theme videos.
        :param bool has_subtitles: Optional filter by items with subtitles.
        :param bool has_special_feature: Optional filter by items with special features.
        :param bool has_trailer: Optional filter by items with trailers.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
        :param int min_index_number: Optional filter by minimum index number.
        :param str min_start_date: Optional. The minimum premiere date. Format = ISO
        :param str max_start_date: Optional. The maximum premiere date. Format = ISO
        :param str min_end_date: Optional. The minimum premiere date. Format = ISO
        :param str max_end_date: Optional. The maximum premiere date. Format = ISO
        :param int min_players: Optional filter by minimum number of game players.
        :param int max_players: Optional filter by maximum number of game players.
        :param int parent_index_number: Optional filter by parent index number.
        :param bool has_parental_rating: Optional filter by items that have or do not have a parental rating
        :param bool is_hd: Optional filter by items that are HD or not.
        :param bool is_unaired: Optional filter by items that are unaired episodes or not.
        :param float min_community_rating: Optional filter by minimum community rating.
        :param float min_critic_rating: Optional filter by minimum critic rating.
        :param int aired_during_season: Gets all episodes that aired during a season, including specials.
        :param str min_premiere_date: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved_for_user: Optional. The minimum premiere date. Format = ISO
        :param str max_premiere_date: Optional. The maximum premiere date. Format = ISO
        :param bool has_overview: Optional filter by items that have an overview or not.
        :param bool has_imdb_id: Optional filter by items that have an imdb id or not.
        :param bool has_tmdb_id: Optional filter by items that have a tmdb id or not.
        :param bool has_tvdb_id: Optional filter by items that have a tvdb id or not.
        :param str exclude_item_ids: Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param bool recursive: When searching within folders, this determines whether or not the search will be recursive. true/false
        :param str search_term: Enter a search term to perform a search request
        :param str sort_order: Sort Order - Ascending,Descending
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param str exclude_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str any_provider_id_equals: Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form 'prov.id', e.g. 'imdb.tt123456'. This allows multiple, comma delimeted value pairs.
        :param str filters: Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
        :param bool is_favorite: Optional filter by items that are marked as favorite, or not.
        :param bool is_movie: Optional filter for movies.
        :param bool is_series: Optional filter for series.
        :param bool is_folder: Optional filter for folders.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool is_new: Optional filter for IsNew.
        :param bool is_premiere: Optional filter for IsPremiere.
        :param bool is_new_or_premiere: Optional filter for IsNewOrPremiere.
        :param bool is_repeat: Optional filter for IsRepeat.
        :param bool project_to_media: ProjectToMedia
        :param str media_types: Optional filter by MediaType. Allows multiple, comma delimited.
        :param str image_types: Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
        :param bool is_played: Optional filter by items that are played, or not.
        :param str genres: Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
        :param str official_ratings: Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
        :param str tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str exclude_tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str years: Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str person: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_ids: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_types: Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
        :param str studios: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str studio_ids: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str artists: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str artist_ids: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str albums: Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
        :param str ids: Optional. If specific items are needed, specify a list of item id's to retrieve. This allows multiple, comma delimited.
        :param str video_types: Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
        :param str containers: Optional filter by Container. Allows multiple, comma delimeted.
        :param str audio_codecs: Optional filter by AudioCodec. Allows multiple, comma delimeted.
        :param str audio_layouts: Optional filter by AudioLayout. Allows multiple, comma delimeted.
        :param str video_codecs: Optional filter by VideoCodec. Allows multiple, comma delimeted.
        :param str extended_video_types: Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
        :param str subtitle_codecs: Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
        :param str path: Optional filter by Path.
        :param str user_id: User Id
        :param str min_official_rating: Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
        :param bool is_locked: Optional filter by items that are locked.
        :param bool is_place_holder: Optional filter by items that are placeholders
        :param bool has_official_rating: Optional filter by items that have official ratings
        :param bool group_items_into_collections: Whether or not to hide items behind their boxsets.
        :param bool is3_d: Optional filter by items that are 3D, or not.
        :param str series_status: Optional filter by Series Status. Allows multiple, comma delimeted.
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str album_artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str name_starts_with: Optional filter by items whose name is sorted equally than a given input string.
        :param str name_less_than: Optional filter by items whose name is equally or lesser than a given input string.
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['type', 'is_liked', 'is_disliked', 'enable_favorite_sorting', 'add_current_program', 'artist_type', 'max_official_rating', 'has_theme_song', 'has_theme_video', 'has_subtitles', 'has_special_feature', 'has_trailer', 'adjacent_to', 'min_index_number', 'min_start_date', 'max_start_date', 'min_end_date', 'max_end_date', 'min_players', 'max_players', 'parent_index_number', 'has_parental_rating', 'is_hd', 'is_unaired', 'min_community_rating', 'min_critic_rating', 'aired_during_season', 'min_premiere_date', 'min_date_last_saved', 'min_date_last_saved_for_user', 'max_premiere_date', 'has_overview', 'has_imdb_id', 'has_tmdb_id', 'has_tvdb_id', 'exclude_item_ids', 'start_index', 'limit', 'recursive', 'search_term', 'sort_order', 'parent_id', 'fields', 'exclude_item_types', 'include_item_types', 'any_provider_id_equals', 'filters', 'is_favorite', 'is_movie', 'is_series', 'is_folder', 'is_news', 'is_kids', 'is_sports', 'is_new', 'is_premiere', 'is_new_or_premiere', 'is_repeat', 'project_to_media', 'media_types', 'image_types', 'sort_by', 'is_played', 'genres', 'official_ratings', 'tags', 'exclude_tags', 'years', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types', 'person', 'person_ids', 'person_types', 'studios', 'studio_ids', 'artists', 'artist_ids', 'albums', 'ids', 'video_types', 'containers', 'audio_codecs', 'audio_layouts', 'video_codecs', 'extended_video_types', 'subtitle_codecs', 'path', 'user_id', 'min_official_rating', 'is_locked', 'is_place_holder', 'has_official_rating', 'group_items_into_collections', 'is3_d', 'series_status', 'name_starts_with_or_greater', 'artist_starts_with_or_greater', 'album_artist_starts_with_or_greater', 'name_starts_with', 'name_less_than']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_channels" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'type' in params:
            query_params.append(('Type', params['type']))  # noqa: E501
        if 'is_liked' in params:
            query_params.append(('IsLiked', params['is_liked']))  # noqa: E501
        if 'is_disliked' in params:
            query_params.append(('IsDisliked', params['is_disliked']))  # noqa: E501
        if 'enable_favorite_sorting' in params:
            query_params.append(('EnableFavoriteSorting', params['enable_favorite_sorting']))  # noqa: E501
        if 'add_current_program' in params:
            query_params.append(('AddCurrentProgram', params['add_current_program']))  # noqa: E501
        if 'artist_type' in params:
            query_params.append(('ArtistType', params['artist_type']))  # noqa: E501
        if 'max_official_rating' in params:
            query_params.append(('MaxOfficialRating', params['max_official_rating']))  # noqa: E501
        if 'has_theme_song' in params:
            query_params.append(('HasThemeSong', params['has_theme_song']))  # noqa: E501
        if 'has_theme_video' in params:
            query_params.append(('HasThemeVideo', params['has_theme_video']))  # noqa: E501
        if 'has_subtitles' in params:
            query_params.append(('HasSubtitles', params['has_subtitles']))  # noqa: E501
        if 'has_special_feature' in params:
            query_params.append(('HasSpecialFeature', params['has_special_feature']))  # noqa: E501
        if 'has_trailer' in params:
            query_params.append(('HasTrailer', params['has_trailer']))  # noqa: E501
        if 'adjacent_to' in params:
            query_params.append(('AdjacentTo', params['adjacent_to']))  # noqa: E501
        if 'min_index_number' in params:
            query_params.append(('MinIndexNumber', params['min_index_number']))  # noqa: E501
        if 'min_start_date' in params:
            query_params.append(('MinStartDate', params['min_start_date']))  # noqa: E501
        if 'max_start_date' in params:
            query_params.append(('MaxStartDate', params['max_start_date']))  # noqa: E501
        if 'min_end_date' in params:
            query_params.append(('MinEndDate', params['min_end_date']))  # noqa: E501
        if 'max_end_date' in params:
            query_params.append(('MaxEndDate', params['max_end_date']))  # noqa: E501
        if 'min_players' in params:
            query_params.append(('MinPlayers', params['min_players']))  # noqa: E501
        if 'max_players' in params:
            query_params.append(('MaxPlayers', params['max_players']))  # noqa: E501
        if 'parent_index_number' in params:
            query_params.append(('ParentIndexNumber', params['parent_index_number']))  # noqa: E501
        if 'has_parental_rating' in params:
            query_params.append(('HasParentalRating', params['has_parental_rating']))  # noqa: E501
        if 'is_hd' in params:
            query_params.append(('IsHD', params['is_hd']))  # noqa: E501
        if 'is_unaired' in params:
            query_params.append(('IsUnaired', params['is_unaired']))  # noqa: E501
        if 'min_community_rating' in params:
            query_params.append(('MinCommunityRating', params['min_community_rating']))  # noqa: E501
        if 'min_critic_rating' in params:
            query_params.append(('MinCriticRating', params['min_critic_rating']))  # noqa: E501
        if 'aired_during_season' in params:
            query_params.append(('AiredDuringSeason', params['aired_during_season']))  # noqa: E501
        if 'min_premiere_date' in params:
            query_params.append(('MinPremiereDate', params['min_premiere_date']))  # noqa: E501
        if 'min_date_last_saved' in params:
            query_params.append(('MinDateLastSaved', params['min_date_last_saved']))  # noqa: E501
        if 'min_date_last_saved_for_user' in params:
            query_params.append(('MinDateLastSavedForUser', params['min_date_last_saved_for_user']))  # noqa: E501
        if 'max_premiere_date' in params:
            query_params.append(('MaxPremiereDate', params['max_premiere_date']))  # noqa: E501
        if 'has_overview' in params:
            query_params.append(('HasOverview', params['has_overview']))  # noqa: E501
        if 'has_imdb_id' in params:
            query_params.append(('HasImdbId', params['has_imdb_id']))  # noqa: E501
        if 'has_tmdb_id' in params:
            query_params.append(('HasTmdbId', params['has_tmdb_id']))  # noqa: E501
        if 'has_tvdb_id' in params:
            query_params.append(('HasTvdbId', params['has_tvdb_id']))  # noqa: E501
        if 'exclude_item_ids' in params:
            query_params.append(('ExcludeItemIds', params['exclude_item_ids']))  # noqa: E501
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'recursive' in params:
            query_params.append(('Recursive', params['recursive']))  # noqa: E501
        if 'search_term' in params:
            query_params.append(('SearchTerm', params['search_term']))  # noqa: E501
        if 'sort_order' in params:
            query_params.append(('SortOrder', params['sort_order']))  # noqa: E501
        if 'parent_id' in params:
            query_params.append(('ParentId', params['parent_id']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501
        if 'exclude_item_types' in params:
            query_params.append(('ExcludeItemTypes', params['exclude_item_types']))  # noqa: E501
        if 'include_item_types' in params:
            query_params.append(('IncludeItemTypes', params['include_item_types']))  # noqa: E501
        if 'any_provider_id_equals' in params:
            query_params.append(('AnyProviderIdEquals', params['any_provider_id_equals']))  # noqa: E501
        if 'filters' in params:
            query_params.append(('Filters', params['filters']))  # noqa: E501
        if 'is_favorite' in params:
            query_params.append(('IsFavorite', params['is_favorite']))  # noqa: E501
        if 'is_movie' in params:
            query_params.append(('IsMovie', params['is_movie']))  # noqa: E501
        if 'is_series' in params:
            query_params.append(('IsSeries', params['is_series']))  # noqa: E501
        if 'is_folder' in params:
            query_params.append(('IsFolder', params['is_folder']))  # noqa: E501
        if 'is_news' in params:
            query_params.append(('IsNews', params['is_news']))  # noqa: E501
        if 'is_kids' in params:
            query_params.append(('IsKids', params['is_kids']))  # noqa: E501
        if 'is_sports' in params:
            query_params.append(('IsSports', params['is_sports']))  # noqa: E501
        if 'is_new' in params:
            query_params.append(('IsNew', params['is_new']))  # noqa: E501
        if 'is_premiere' in params:
            query_params.append(('IsPremiere', params['is_premiere']))  # noqa: E501
        if 'is_new_or_premiere' in params:
            query_params.append(('IsNewOrPremiere', params['is_new_or_premiere']))  # noqa: E501
        if 'is_repeat' in params:
            query_params.append(('IsRepeat', params['is_repeat']))  # noqa: E501
        if 'project_to_media' in params:
            query_params.append(('ProjectToMedia', params['project_to_media']))  # noqa: E501
        if 'media_types' in params:
            query_params.append(('MediaTypes', params['media_types']))  # noqa: E501
        if 'image_types' in params:
            query_params.append(('ImageTypes', params['image_types']))  # noqa: E501
        if 'sort_by' in params:
            query_params.append(('SortBy', params['sort_by']))  # noqa: E501
        if 'is_played' in params:
            query_params.append(('IsPlayed', params['is_played']))  # noqa: E501
        if 'genres' in params:
            query_params.append(('Genres', params['genres']))  # noqa: E501
        if 'official_ratings' in params:
            query_params.append(('OfficialRatings', params['official_ratings']))  # noqa: E501
        if 'tags' in params:
            query_params.append(('Tags', params['tags']))  # noqa: E501
        if 'exclude_tags' in params:
            query_params.append(('ExcludeTags', params['exclude_tags']))  # noqa: E501
        if 'years' in params:
            query_params.append(('Years', params['years']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'person' in params:
            query_params.append(('Person', params['person']))  # noqa: E501
        if 'person_ids' in params:
            query_params.append(('PersonIds', params['person_ids']))  # noqa: E501
        if 'person_types' in params:
            query_params.append(('PersonTypes', params['person_types']))  # noqa: E501
        if 'studios' in params:
            query_params.append(('Studios', params['studios']))  # noqa: E501
        if 'studio_ids' in params:
            query_params.append(('StudioIds', params['studio_ids']))  # noqa: E501
        if 'artists' in params:
            query_params.append(('Artists', params['artists']))  # noqa: E501
        if 'artist_ids' in params:
            query_params.append(('ArtistIds', params['artist_ids']))  # noqa: E501
        if 'albums' in params:
            query_params.append(('Albums', params['albums']))  # noqa: E501
        if 'ids' in params:
            query_params.append(('Ids', params['ids']))  # noqa: E501
        if 'video_types' in params:
            query_params.append(('VideoTypes', params['video_types']))  # noqa: E501
        if 'containers' in params:
            query_params.append(('Containers', params['containers']))  # noqa: E501
        if 'audio_codecs' in params:
            query_params.append(('AudioCodecs', params['audio_codecs']))  # noqa: E501
        if 'audio_layouts' in params:
            query_params.append(('AudioLayouts', params['audio_layouts']))  # noqa: E501
        if 'video_codecs' in params:
            query_params.append(('VideoCodecs', params['video_codecs']))  # noqa: E501
        if 'extended_video_types' in params:
            query_params.append(('ExtendedVideoTypes', params['extended_video_types']))  # noqa: E501
        if 'subtitle_codecs' in params:
            query_params.append(('SubtitleCodecs', params['subtitle_codecs']))  # noqa: E501
        if 'path' in params:
            query_params.append(('Path', params['path']))  # noqa: E501
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'min_official_rating' in params:
            query_params.append(('MinOfficialRating', params['min_official_rating']))  # noqa: E501
        if 'is_locked' in params:
            query_params.append(('IsLocked', params['is_locked']))  # noqa: E501
        if 'is_place_holder' in params:
            query_params.append(('IsPlaceHolder', params['is_place_holder']))  # noqa: E501
        if 'has_official_rating' in params:
            query_params.append(('HasOfficialRating', params['has_official_rating']))  # noqa: E501
        if 'group_items_into_collections' in params:
            query_params.append(('GroupItemsIntoCollections', params['group_items_into_collections']))  # noqa: E501
        if 'is3_d' in params:
            query_params.append(('Is3D', params['is3_d']))  # noqa: E501
        if 'series_status' in params:
            query_params.append(('SeriesStatus', params['series_status']))  # noqa: E501
        if 'name_starts_with_or_greater' in params:
            query_params.append(('NameStartsWithOrGreater', params['name_starts_with_or_greater']))  # noqa: E501
        if 'artist_starts_with_or_greater' in params:
            query_params.append(('ArtistStartsWithOrGreater', params['artist_starts_with_or_greater']))  # noqa: E501
        if 'album_artist_starts_with_or_greater' in params:
            query_params.append(('AlbumArtistStartsWithOrGreater', params['album_artist_starts_with_or_greater']))  # noqa: E501
        if 'name_starts_with' in params:
            query_params.append(('NameStartsWith', params['name_starts_with']))  # noqa: E501
        if 'name_less_than' in params:
            query_params.append(('NameLessThan', params['name_less_than']))  # noqa: E501

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
            '/LiveTv/Channels', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultBaseItemDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_channels_by_id(self, id, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_channels_by_id(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Channel Id (required)
        :param str user_id: Optional attach user data.
        :return: BaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_channels_by_id_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_channels_by_id_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_livetv_channels_by_id_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a live tv channel  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_channels_by_id_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Channel Id (required)
        :param str user_id: Optional attach user data.
        :return: BaseItemDto
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
                    " to method get_livetv_channels_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_livetv_channels_by_id`")  # noqa: E501

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
            '/LiveTv/Channels/{Id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='BaseItemDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_channeltags(self, **kwargs):  # noqa: E501
        """Gets live tv channel tags  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_channeltags(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str artist_type: Artist or AlbumArtist
        :param str max_official_rating: Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
        :param bool has_theme_song: Optional filter by items with theme songs.
        :param bool has_theme_video: Optional filter by items with theme videos.
        :param bool has_subtitles: Optional filter by items with subtitles.
        :param bool has_special_feature: Optional filter by items with special features.
        :param bool has_trailer: Optional filter by items with trailers.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
        :param int min_index_number: Optional filter by minimum index number.
        :param str min_start_date: Optional. The minimum premiere date. Format = ISO
        :param str max_start_date: Optional. The maximum premiere date. Format = ISO
        :param str min_end_date: Optional. The minimum premiere date. Format = ISO
        :param str max_end_date: Optional. The maximum premiere date. Format = ISO
        :param int min_players: Optional filter by minimum number of game players.
        :param int max_players: Optional filter by maximum number of game players.
        :param int parent_index_number: Optional filter by parent index number.
        :param bool has_parental_rating: Optional filter by items that have or do not have a parental rating
        :param bool is_hd: Optional filter by items that are HD or not.
        :param bool is_unaired: Optional filter by items that are unaired episodes or not.
        :param float min_community_rating: Optional filter by minimum community rating.
        :param float min_critic_rating: Optional filter by minimum critic rating.
        :param int aired_during_season: Gets all episodes that aired during a season, including specials.
        :param str min_premiere_date: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved_for_user: Optional. The minimum premiere date. Format = ISO
        :param str max_premiere_date: Optional. The maximum premiere date. Format = ISO
        :param bool has_overview: Optional filter by items that have an overview or not.
        :param bool has_imdb_id: Optional filter by items that have an imdb id or not.
        :param bool has_tmdb_id: Optional filter by items that have a tmdb id or not.
        :param bool has_tvdb_id: Optional filter by items that have a tvdb id or not.
        :param str exclude_item_ids: Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param bool recursive: When searching within folders, this determines whether or not the search will be recursive. true/false
        :param str search_term: Enter a search term to perform a search request
        :param str sort_order: Sort Order - Ascending,Descending
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param str exclude_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str any_provider_id_equals: Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form 'prov.id', e.g. 'imdb.tt123456'. This allows multiple, comma delimeted value pairs.
        :param str filters: Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
        :param bool is_favorite: Optional filter by items that are marked as favorite, or not.
        :param bool is_movie: Optional filter for movies.
        :param bool is_series: Optional filter for series.
        :param bool is_folder: Optional filter for folders.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool is_new: Optional filter for IsNew.
        :param bool is_premiere: Optional filter for IsPremiere.
        :param bool is_new_or_premiere: Optional filter for IsNewOrPremiere.
        :param bool is_repeat: Optional filter for IsRepeat.
        :param bool project_to_media: ProjectToMedia
        :param str media_types: Optional filter by MediaType. Allows multiple, comma delimited.
        :param str image_types: Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
        :param bool is_played: Optional filter by items that are played, or not.
        :param str genres: Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
        :param str official_ratings: Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
        :param str tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str exclude_tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str years: Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str person: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_ids: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_types: Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
        :param str studios: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str studio_ids: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str artists: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str artist_ids: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str albums: Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
        :param str ids: Optional. If specific items are needed, specify a list of item id's to retrieve. This allows multiple, comma delimited.
        :param str video_types: Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
        :param str containers: Optional filter by Container. Allows multiple, comma delimeted.
        :param str audio_codecs: Optional filter by AudioCodec. Allows multiple, comma delimeted.
        :param str audio_layouts: Optional filter by AudioLayout. Allows multiple, comma delimeted.
        :param str video_codecs: Optional filter by VideoCodec. Allows multiple, comma delimeted.
        :param str extended_video_types: Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
        :param str subtitle_codecs: Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
        :param str path: Optional filter by Path.
        :param str user_id: User Id
        :param str min_official_rating: Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
        :param bool is_locked: Optional filter by items that are locked.
        :param bool is_place_holder: Optional filter by items that are placeholders
        :param bool has_official_rating: Optional filter by items that have official ratings
        :param bool group_items_into_collections: Whether or not to hide items behind their boxsets.
        :param bool is3_d: Optional filter by items that are 3D, or not.
        :param str series_status: Optional filter by Series Status. Allows multiple, comma delimeted.
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str album_artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str name_starts_with: Optional filter by items whose name is sorted equally than a given input string.
        :param str name_less_than: Optional filter by items whose name is equally or lesser than a given input string.
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_channeltags_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_channeltags_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_channeltags_with_http_info(self, **kwargs):  # noqa: E501
        """Gets live tv channel tags  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_channeltags_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str artist_type: Artist or AlbumArtist
        :param str max_official_rating: Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
        :param bool has_theme_song: Optional filter by items with theme songs.
        :param bool has_theme_video: Optional filter by items with theme videos.
        :param bool has_subtitles: Optional filter by items with subtitles.
        :param bool has_special_feature: Optional filter by items with special features.
        :param bool has_trailer: Optional filter by items with trailers.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
        :param int min_index_number: Optional filter by minimum index number.
        :param str min_start_date: Optional. The minimum premiere date. Format = ISO
        :param str max_start_date: Optional. The maximum premiere date. Format = ISO
        :param str min_end_date: Optional. The minimum premiere date. Format = ISO
        :param str max_end_date: Optional. The maximum premiere date. Format = ISO
        :param int min_players: Optional filter by minimum number of game players.
        :param int max_players: Optional filter by maximum number of game players.
        :param int parent_index_number: Optional filter by parent index number.
        :param bool has_parental_rating: Optional filter by items that have or do not have a parental rating
        :param bool is_hd: Optional filter by items that are HD or not.
        :param bool is_unaired: Optional filter by items that are unaired episodes or not.
        :param float min_community_rating: Optional filter by minimum community rating.
        :param float min_critic_rating: Optional filter by minimum critic rating.
        :param int aired_during_season: Gets all episodes that aired during a season, including specials.
        :param str min_premiere_date: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved_for_user: Optional. The minimum premiere date. Format = ISO
        :param str max_premiere_date: Optional. The maximum premiere date. Format = ISO
        :param bool has_overview: Optional filter by items that have an overview or not.
        :param bool has_imdb_id: Optional filter by items that have an imdb id or not.
        :param bool has_tmdb_id: Optional filter by items that have a tmdb id or not.
        :param bool has_tvdb_id: Optional filter by items that have a tvdb id or not.
        :param str exclude_item_ids: Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param bool recursive: When searching within folders, this determines whether or not the search will be recursive. true/false
        :param str search_term: Enter a search term to perform a search request
        :param str sort_order: Sort Order - Ascending,Descending
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param str exclude_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str any_provider_id_equals: Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form 'prov.id', e.g. 'imdb.tt123456'. This allows multiple, comma delimeted value pairs.
        :param str filters: Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
        :param bool is_favorite: Optional filter by items that are marked as favorite, or not.
        :param bool is_movie: Optional filter for movies.
        :param bool is_series: Optional filter for series.
        :param bool is_folder: Optional filter for folders.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool is_new: Optional filter for IsNew.
        :param bool is_premiere: Optional filter for IsPremiere.
        :param bool is_new_or_premiere: Optional filter for IsNewOrPremiere.
        :param bool is_repeat: Optional filter for IsRepeat.
        :param bool project_to_media: ProjectToMedia
        :param str media_types: Optional filter by MediaType. Allows multiple, comma delimited.
        :param str image_types: Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
        :param bool is_played: Optional filter by items that are played, or not.
        :param str genres: Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
        :param str official_ratings: Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
        :param str tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str exclude_tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str years: Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str person: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_ids: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_types: Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
        :param str studios: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str studio_ids: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str artists: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str artist_ids: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str albums: Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
        :param str ids: Optional. If specific items are needed, specify a list of item id's to retrieve. This allows multiple, comma delimited.
        :param str video_types: Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
        :param str containers: Optional filter by Container. Allows multiple, comma delimeted.
        :param str audio_codecs: Optional filter by AudioCodec. Allows multiple, comma delimeted.
        :param str audio_layouts: Optional filter by AudioLayout. Allows multiple, comma delimeted.
        :param str video_codecs: Optional filter by VideoCodec. Allows multiple, comma delimeted.
        :param str extended_video_types: Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
        :param str subtitle_codecs: Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
        :param str path: Optional filter by Path.
        :param str user_id: User Id
        :param str min_official_rating: Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
        :param bool is_locked: Optional filter by items that are locked.
        :param bool is_place_holder: Optional filter by items that are placeholders
        :param bool has_official_rating: Optional filter by items that have official ratings
        :param bool group_items_into_collections: Whether or not to hide items behind their boxsets.
        :param bool is3_d: Optional filter by items that are 3D, or not.
        :param str series_status: Optional filter by Series Status. Allows multiple, comma delimeted.
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str album_artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str name_starts_with: Optional filter by items whose name is sorted equally than a given input string.
        :param str name_less_than: Optional filter by items whose name is equally or lesser than a given input string.
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['artist_type', 'max_official_rating', 'has_theme_song', 'has_theme_video', 'has_subtitles', 'has_special_feature', 'has_trailer', 'adjacent_to', 'min_index_number', 'min_start_date', 'max_start_date', 'min_end_date', 'max_end_date', 'min_players', 'max_players', 'parent_index_number', 'has_parental_rating', 'is_hd', 'is_unaired', 'min_community_rating', 'min_critic_rating', 'aired_during_season', 'min_premiere_date', 'min_date_last_saved', 'min_date_last_saved_for_user', 'max_premiere_date', 'has_overview', 'has_imdb_id', 'has_tmdb_id', 'has_tvdb_id', 'exclude_item_ids', 'start_index', 'limit', 'recursive', 'search_term', 'sort_order', 'parent_id', 'fields', 'exclude_item_types', 'include_item_types', 'any_provider_id_equals', 'filters', 'is_favorite', 'is_movie', 'is_series', 'is_folder', 'is_news', 'is_kids', 'is_sports', 'is_new', 'is_premiere', 'is_new_or_premiere', 'is_repeat', 'project_to_media', 'media_types', 'image_types', 'sort_by', 'is_played', 'genres', 'official_ratings', 'tags', 'exclude_tags', 'years', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types', 'person', 'person_ids', 'person_types', 'studios', 'studio_ids', 'artists', 'artist_ids', 'albums', 'ids', 'video_types', 'containers', 'audio_codecs', 'audio_layouts', 'video_codecs', 'extended_video_types', 'subtitle_codecs', 'path', 'user_id', 'min_official_rating', 'is_locked', 'is_place_holder', 'has_official_rating', 'group_items_into_collections', 'is3_d', 'series_status', 'name_starts_with_or_greater', 'artist_starts_with_or_greater', 'album_artist_starts_with_or_greater', 'name_starts_with', 'name_less_than']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_channeltags" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'artist_type' in params:
            query_params.append(('ArtistType', params['artist_type']))  # noqa: E501
        if 'max_official_rating' in params:
            query_params.append(('MaxOfficialRating', params['max_official_rating']))  # noqa: E501
        if 'has_theme_song' in params:
            query_params.append(('HasThemeSong', params['has_theme_song']))  # noqa: E501
        if 'has_theme_video' in params:
            query_params.append(('HasThemeVideo', params['has_theme_video']))  # noqa: E501
        if 'has_subtitles' in params:
            query_params.append(('HasSubtitles', params['has_subtitles']))  # noqa: E501
        if 'has_special_feature' in params:
            query_params.append(('HasSpecialFeature', params['has_special_feature']))  # noqa: E501
        if 'has_trailer' in params:
            query_params.append(('HasTrailer', params['has_trailer']))  # noqa: E501
        if 'adjacent_to' in params:
            query_params.append(('AdjacentTo', params['adjacent_to']))  # noqa: E501
        if 'min_index_number' in params:
            query_params.append(('MinIndexNumber', params['min_index_number']))  # noqa: E501
        if 'min_start_date' in params:
            query_params.append(('MinStartDate', params['min_start_date']))  # noqa: E501
        if 'max_start_date' in params:
            query_params.append(('MaxStartDate', params['max_start_date']))  # noqa: E501
        if 'min_end_date' in params:
            query_params.append(('MinEndDate', params['min_end_date']))  # noqa: E501
        if 'max_end_date' in params:
            query_params.append(('MaxEndDate', params['max_end_date']))  # noqa: E501
        if 'min_players' in params:
            query_params.append(('MinPlayers', params['min_players']))  # noqa: E501
        if 'max_players' in params:
            query_params.append(('MaxPlayers', params['max_players']))  # noqa: E501
        if 'parent_index_number' in params:
            query_params.append(('ParentIndexNumber', params['parent_index_number']))  # noqa: E501
        if 'has_parental_rating' in params:
            query_params.append(('HasParentalRating', params['has_parental_rating']))  # noqa: E501
        if 'is_hd' in params:
            query_params.append(('IsHD', params['is_hd']))  # noqa: E501
        if 'is_unaired' in params:
            query_params.append(('IsUnaired', params['is_unaired']))  # noqa: E501
        if 'min_community_rating' in params:
            query_params.append(('MinCommunityRating', params['min_community_rating']))  # noqa: E501
        if 'min_critic_rating' in params:
            query_params.append(('MinCriticRating', params['min_critic_rating']))  # noqa: E501
        if 'aired_during_season' in params:
            query_params.append(('AiredDuringSeason', params['aired_during_season']))  # noqa: E501
        if 'min_premiere_date' in params:
            query_params.append(('MinPremiereDate', params['min_premiere_date']))  # noqa: E501
        if 'min_date_last_saved' in params:
            query_params.append(('MinDateLastSaved', params['min_date_last_saved']))  # noqa: E501
        if 'min_date_last_saved_for_user' in params:
            query_params.append(('MinDateLastSavedForUser', params['min_date_last_saved_for_user']))  # noqa: E501
        if 'max_premiere_date' in params:
            query_params.append(('MaxPremiereDate', params['max_premiere_date']))  # noqa: E501
        if 'has_overview' in params:
            query_params.append(('HasOverview', params['has_overview']))  # noqa: E501
        if 'has_imdb_id' in params:
            query_params.append(('HasImdbId', params['has_imdb_id']))  # noqa: E501
        if 'has_tmdb_id' in params:
            query_params.append(('HasTmdbId', params['has_tmdb_id']))  # noqa: E501
        if 'has_tvdb_id' in params:
            query_params.append(('HasTvdbId', params['has_tvdb_id']))  # noqa: E501
        if 'exclude_item_ids' in params:
            query_params.append(('ExcludeItemIds', params['exclude_item_ids']))  # noqa: E501
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'recursive' in params:
            query_params.append(('Recursive', params['recursive']))  # noqa: E501
        if 'search_term' in params:
            query_params.append(('SearchTerm', params['search_term']))  # noqa: E501
        if 'sort_order' in params:
            query_params.append(('SortOrder', params['sort_order']))  # noqa: E501
        if 'parent_id' in params:
            query_params.append(('ParentId', params['parent_id']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501
        if 'exclude_item_types' in params:
            query_params.append(('ExcludeItemTypes', params['exclude_item_types']))  # noqa: E501
        if 'include_item_types' in params:
            query_params.append(('IncludeItemTypes', params['include_item_types']))  # noqa: E501
        if 'any_provider_id_equals' in params:
            query_params.append(('AnyProviderIdEquals', params['any_provider_id_equals']))  # noqa: E501
        if 'filters' in params:
            query_params.append(('Filters', params['filters']))  # noqa: E501
        if 'is_favorite' in params:
            query_params.append(('IsFavorite', params['is_favorite']))  # noqa: E501
        if 'is_movie' in params:
            query_params.append(('IsMovie', params['is_movie']))  # noqa: E501
        if 'is_series' in params:
            query_params.append(('IsSeries', params['is_series']))  # noqa: E501
        if 'is_folder' in params:
            query_params.append(('IsFolder', params['is_folder']))  # noqa: E501
        if 'is_news' in params:
            query_params.append(('IsNews', params['is_news']))  # noqa: E501
        if 'is_kids' in params:
            query_params.append(('IsKids', params['is_kids']))  # noqa: E501
        if 'is_sports' in params:
            query_params.append(('IsSports', params['is_sports']))  # noqa: E501
        if 'is_new' in params:
            query_params.append(('IsNew', params['is_new']))  # noqa: E501
        if 'is_premiere' in params:
            query_params.append(('IsPremiere', params['is_premiere']))  # noqa: E501
        if 'is_new_or_premiere' in params:
            query_params.append(('IsNewOrPremiere', params['is_new_or_premiere']))  # noqa: E501
        if 'is_repeat' in params:
            query_params.append(('IsRepeat', params['is_repeat']))  # noqa: E501
        if 'project_to_media' in params:
            query_params.append(('ProjectToMedia', params['project_to_media']))  # noqa: E501
        if 'media_types' in params:
            query_params.append(('MediaTypes', params['media_types']))  # noqa: E501
        if 'image_types' in params:
            query_params.append(('ImageTypes', params['image_types']))  # noqa: E501
        if 'sort_by' in params:
            query_params.append(('SortBy', params['sort_by']))  # noqa: E501
        if 'is_played' in params:
            query_params.append(('IsPlayed', params['is_played']))  # noqa: E501
        if 'genres' in params:
            query_params.append(('Genres', params['genres']))  # noqa: E501
        if 'official_ratings' in params:
            query_params.append(('OfficialRatings', params['official_ratings']))  # noqa: E501
        if 'tags' in params:
            query_params.append(('Tags', params['tags']))  # noqa: E501
        if 'exclude_tags' in params:
            query_params.append(('ExcludeTags', params['exclude_tags']))  # noqa: E501
        if 'years' in params:
            query_params.append(('Years', params['years']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'person' in params:
            query_params.append(('Person', params['person']))  # noqa: E501
        if 'person_ids' in params:
            query_params.append(('PersonIds', params['person_ids']))  # noqa: E501
        if 'person_types' in params:
            query_params.append(('PersonTypes', params['person_types']))  # noqa: E501
        if 'studios' in params:
            query_params.append(('Studios', params['studios']))  # noqa: E501
        if 'studio_ids' in params:
            query_params.append(('StudioIds', params['studio_ids']))  # noqa: E501
        if 'artists' in params:
            query_params.append(('Artists', params['artists']))  # noqa: E501
        if 'artist_ids' in params:
            query_params.append(('ArtistIds', params['artist_ids']))  # noqa: E501
        if 'albums' in params:
            query_params.append(('Albums', params['albums']))  # noqa: E501
        if 'ids' in params:
            query_params.append(('Ids', params['ids']))  # noqa: E501
        if 'video_types' in params:
            query_params.append(('VideoTypes', params['video_types']))  # noqa: E501
        if 'containers' in params:
            query_params.append(('Containers', params['containers']))  # noqa: E501
        if 'audio_codecs' in params:
            query_params.append(('AudioCodecs', params['audio_codecs']))  # noqa: E501
        if 'audio_layouts' in params:
            query_params.append(('AudioLayouts', params['audio_layouts']))  # noqa: E501
        if 'video_codecs' in params:
            query_params.append(('VideoCodecs', params['video_codecs']))  # noqa: E501
        if 'extended_video_types' in params:
            query_params.append(('ExtendedVideoTypes', params['extended_video_types']))  # noqa: E501
        if 'subtitle_codecs' in params:
            query_params.append(('SubtitleCodecs', params['subtitle_codecs']))  # noqa: E501
        if 'path' in params:
            query_params.append(('Path', params['path']))  # noqa: E501
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'min_official_rating' in params:
            query_params.append(('MinOfficialRating', params['min_official_rating']))  # noqa: E501
        if 'is_locked' in params:
            query_params.append(('IsLocked', params['is_locked']))  # noqa: E501
        if 'is_place_holder' in params:
            query_params.append(('IsPlaceHolder', params['is_place_holder']))  # noqa: E501
        if 'has_official_rating' in params:
            query_params.append(('HasOfficialRating', params['has_official_rating']))  # noqa: E501
        if 'group_items_into_collections' in params:
            query_params.append(('GroupItemsIntoCollections', params['group_items_into_collections']))  # noqa: E501
        if 'is3_d' in params:
            query_params.append(('Is3D', params['is3_d']))  # noqa: E501
        if 'series_status' in params:
            query_params.append(('SeriesStatus', params['series_status']))  # noqa: E501
        if 'name_starts_with_or_greater' in params:
            query_params.append(('NameStartsWithOrGreater', params['name_starts_with_or_greater']))  # noqa: E501
        if 'artist_starts_with_or_greater' in params:
            query_params.append(('ArtistStartsWithOrGreater', params['artist_starts_with_or_greater']))  # noqa: E501
        if 'album_artist_starts_with_or_greater' in params:
            query_params.append(('AlbumArtistStartsWithOrGreater', params['album_artist_starts_with_or_greater']))  # noqa: E501
        if 'name_starts_with' in params:
            query_params.append(('NameStartsWith', params['name_starts_with']))  # noqa: E501
        if 'name_less_than' in params:
            query_params.append(('NameLessThan', params['name_less_than']))  # noqa: E501

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
            '/LiveTv/ChannelTags', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultBaseItemDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_channeltags_prefixes(self, **kwargs):  # noqa: E501
        """Gets live tv channel tag prefixes  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_channeltags_prefixes(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str artist_type: Artist or AlbumArtist
        :param str max_official_rating: Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
        :param bool has_theme_song: Optional filter by items with theme songs.
        :param bool has_theme_video: Optional filter by items with theme videos.
        :param bool has_subtitles: Optional filter by items with subtitles.
        :param bool has_special_feature: Optional filter by items with special features.
        :param bool has_trailer: Optional filter by items with trailers.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
        :param int min_index_number: Optional filter by minimum index number.
        :param str min_start_date: Optional. The minimum premiere date. Format = ISO
        :param str max_start_date: Optional. The maximum premiere date. Format = ISO
        :param str min_end_date: Optional. The minimum premiere date. Format = ISO
        :param str max_end_date: Optional. The maximum premiere date. Format = ISO
        :param int min_players: Optional filter by minimum number of game players.
        :param int max_players: Optional filter by maximum number of game players.
        :param int parent_index_number: Optional filter by parent index number.
        :param bool has_parental_rating: Optional filter by items that have or do not have a parental rating
        :param bool is_hd: Optional filter by items that are HD or not.
        :param bool is_unaired: Optional filter by items that are unaired episodes or not.
        :param float min_community_rating: Optional filter by minimum community rating.
        :param float min_critic_rating: Optional filter by minimum critic rating.
        :param int aired_during_season: Gets all episodes that aired during a season, including specials.
        :param str min_premiere_date: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved_for_user: Optional. The minimum premiere date. Format = ISO
        :param str max_premiere_date: Optional. The maximum premiere date. Format = ISO
        :param bool has_overview: Optional filter by items that have an overview or not.
        :param bool has_imdb_id: Optional filter by items that have an imdb id or not.
        :param bool has_tmdb_id: Optional filter by items that have a tmdb id or not.
        :param bool has_tvdb_id: Optional filter by items that have a tvdb id or not.
        :param str exclude_item_ids: Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param bool recursive: When searching within folders, this determines whether or not the search will be recursive. true/false
        :param str search_term: Enter a search term to perform a search request
        :param str sort_order: Sort Order - Ascending,Descending
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param str exclude_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str any_provider_id_equals: Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form 'prov.id', e.g. 'imdb.tt123456'. This allows multiple, comma delimeted value pairs.
        :param str filters: Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
        :param bool is_favorite: Optional filter by items that are marked as favorite, or not.
        :param bool is_movie: Optional filter for movies.
        :param bool is_series: Optional filter for series.
        :param bool is_folder: Optional filter for folders.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool is_new: Optional filter for IsNew.
        :param bool is_premiere: Optional filter for IsPremiere.
        :param bool is_new_or_premiere: Optional filter for IsNewOrPremiere.
        :param bool is_repeat: Optional filter for IsRepeat.
        :param bool project_to_media: ProjectToMedia
        :param str media_types: Optional filter by MediaType. Allows multiple, comma delimited.
        :param str image_types: Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
        :param bool is_played: Optional filter by items that are played, or not.
        :param str genres: Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
        :param str official_ratings: Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
        :param str tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str exclude_tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str years: Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str person: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_ids: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_types: Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
        :param str studios: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str studio_ids: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str artists: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str artist_ids: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str albums: Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
        :param str ids: Optional. If specific items are needed, specify a list of item id's to retrieve. This allows multiple, comma delimited.
        :param str video_types: Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
        :param str containers: Optional filter by Container. Allows multiple, comma delimeted.
        :param str audio_codecs: Optional filter by AudioCodec. Allows multiple, comma delimeted.
        :param str audio_layouts: Optional filter by AudioLayout. Allows multiple, comma delimeted.
        :param str video_codecs: Optional filter by VideoCodec. Allows multiple, comma delimeted.
        :param str extended_video_types: Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
        :param str subtitle_codecs: Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
        :param str path: Optional filter by Path.
        :param str user_id: User Id
        :param str min_official_rating: Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
        :param bool is_locked: Optional filter by items that are locked.
        :param bool is_place_holder: Optional filter by items that are placeholders
        :param bool has_official_rating: Optional filter by items that have official ratings
        :param bool group_items_into_collections: Whether or not to hide items behind their boxsets.
        :param bool is3_d: Optional filter by items that are 3D, or not.
        :param str series_status: Optional filter by Series Status. Allows multiple, comma delimeted.
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str album_artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str name_starts_with: Optional filter by items whose name is sorted equally than a given input string.
        :param str name_less_than: Optional filter by items whose name is equally or lesser than a given input string.
        :return: list[ApiTagItem]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_channeltags_prefixes_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_channeltags_prefixes_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_channeltags_prefixes_with_http_info(self, **kwargs):  # noqa: E501
        """Gets live tv channel tag prefixes  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_channeltags_prefixes_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str artist_type: Artist or AlbumArtist
        :param str max_official_rating: Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
        :param bool has_theme_song: Optional filter by items with theme songs.
        :param bool has_theme_video: Optional filter by items with theme videos.
        :param bool has_subtitles: Optional filter by items with subtitles.
        :param bool has_special_feature: Optional filter by items with special features.
        :param bool has_trailer: Optional filter by items with trailers.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
        :param int min_index_number: Optional filter by minimum index number.
        :param str min_start_date: Optional. The minimum premiere date. Format = ISO
        :param str max_start_date: Optional. The maximum premiere date. Format = ISO
        :param str min_end_date: Optional. The minimum premiere date. Format = ISO
        :param str max_end_date: Optional. The maximum premiere date. Format = ISO
        :param int min_players: Optional filter by minimum number of game players.
        :param int max_players: Optional filter by maximum number of game players.
        :param int parent_index_number: Optional filter by parent index number.
        :param bool has_parental_rating: Optional filter by items that have or do not have a parental rating
        :param bool is_hd: Optional filter by items that are HD or not.
        :param bool is_unaired: Optional filter by items that are unaired episodes or not.
        :param float min_community_rating: Optional filter by minimum community rating.
        :param float min_critic_rating: Optional filter by minimum critic rating.
        :param int aired_during_season: Gets all episodes that aired during a season, including specials.
        :param str min_premiere_date: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved_for_user: Optional. The minimum premiere date. Format = ISO
        :param str max_premiere_date: Optional. The maximum premiere date. Format = ISO
        :param bool has_overview: Optional filter by items that have an overview or not.
        :param bool has_imdb_id: Optional filter by items that have an imdb id or not.
        :param bool has_tmdb_id: Optional filter by items that have a tmdb id or not.
        :param bool has_tvdb_id: Optional filter by items that have a tvdb id or not.
        :param str exclude_item_ids: Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param bool recursive: When searching within folders, this determines whether or not the search will be recursive. true/false
        :param str search_term: Enter a search term to perform a search request
        :param str sort_order: Sort Order - Ascending,Descending
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param str exclude_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str any_provider_id_equals: Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form 'prov.id', e.g. 'imdb.tt123456'. This allows multiple, comma delimeted value pairs.
        :param str filters: Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
        :param bool is_favorite: Optional filter by items that are marked as favorite, or not.
        :param bool is_movie: Optional filter for movies.
        :param bool is_series: Optional filter for series.
        :param bool is_folder: Optional filter for folders.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool is_new: Optional filter for IsNew.
        :param bool is_premiere: Optional filter for IsPremiere.
        :param bool is_new_or_premiere: Optional filter for IsNewOrPremiere.
        :param bool is_repeat: Optional filter for IsRepeat.
        :param bool project_to_media: ProjectToMedia
        :param str media_types: Optional filter by MediaType. Allows multiple, comma delimited.
        :param str image_types: Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
        :param bool is_played: Optional filter by items that are played, or not.
        :param str genres: Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
        :param str official_ratings: Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
        :param str tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str exclude_tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str years: Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str person: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_ids: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_types: Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
        :param str studios: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str studio_ids: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str artists: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str artist_ids: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str albums: Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
        :param str ids: Optional. If specific items are needed, specify a list of item id's to retrieve. This allows multiple, comma delimited.
        :param str video_types: Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
        :param str containers: Optional filter by Container. Allows multiple, comma delimeted.
        :param str audio_codecs: Optional filter by AudioCodec. Allows multiple, comma delimeted.
        :param str audio_layouts: Optional filter by AudioLayout. Allows multiple, comma delimeted.
        :param str video_codecs: Optional filter by VideoCodec. Allows multiple, comma delimeted.
        :param str extended_video_types: Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
        :param str subtitle_codecs: Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
        :param str path: Optional filter by Path.
        :param str user_id: User Id
        :param str min_official_rating: Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
        :param bool is_locked: Optional filter by items that are locked.
        :param bool is_place_holder: Optional filter by items that are placeholders
        :param bool has_official_rating: Optional filter by items that have official ratings
        :param bool group_items_into_collections: Whether or not to hide items behind their boxsets.
        :param bool is3_d: Optional filter by items that are 3D, or not.
        :param str series_status: Optional filter by Series Status. Allows multiple, comma delimeted.
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str album_artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str name_starts_with: Optional filter by items whose name is sorted equally than a given input string.
        :param str name_less_than: Optional filter by items whose name is equally or lesser than a given input string.
        :return: list[ApiTagItem]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['artist_type', 'max_official_rating', 'has_theme_song', 'has_theme_video', 'has_subtitles', 'has_special_feature', 'has_trailer', 'adjacent_to', 'min_index_number', 'min_start_date', 'max_start_date', 'min_end_date', 'max_end_date', 'min_players', 'max_players', 'parent_index_number', 'has_parental_rating', 'is_hd', 'is_unaired', 'min_community_rating', 'min_critic_rating', 'aired_during_season', 'min_premiere_date', 'min_date_last_saved', 'min_date_last_saved_for_user', 'max_premiere_date', 'has_overview', 'has_imdb_id', 'has_tmdb_id', 'has_tvdb_id', 'exclude_item_ids', 'start_index', 'limit', 'recursive', 'search_term', 'sort_order', 'parent_id', 'fields', 'exclude_item_types', 'include_item_types', 'any_provider_id_equals', 'filters', 'is_favorite', 'is_movie', 'is_series', 'is_folder', 'is_news', 'is_kids', 'is_sports', 'is_new', 'is_premiere', 'is_new_or_premiere', 'is_repeat', 'project_to_media', 'media_types', 'image_types', 'sort_by', 'is_played', 'genres', 'official_ratings', 'tags', 'exclude_tags', 'years', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types', 'person', 'person_ids', 'person_types', 'studios', 'studio_ids', 'artists', 'artist_ids', 'albums', 'ids', 'video_types', 'containers', 'audio_codecs', 'audio_layouts', 'video_codecs', 'extended_video_types', 'subtitle_codecs', 'path', 'user_id', 'min_official_rating', 'is_locked', 'is_place_holder', 'has_official_rating', 'group_items_into_collections', 'is3_d', 'series_status', 'name_starts_with_or_greater', 'artist_starts_with_or_greater', 'album_artist_starts_with_or_greater', 'name_starts_with', 'name_less_than']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_channeltags_prefixes" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'artist_type' in params:
            query_params.append(('ArtistType', params['artist_type']))  # noqa: E501
        if 'max_official_rating' in params:
            query_params.append(('MaxOfficialRating', params['max_official_rating']))  # noqa: E501
        if 'has_theme_song' in params:
            query_params.append(('HasThemeSong', params['has_theme_song']))  # noqa: E501
        if 'has_theme_video' in params:
            query_params.append(('HasThemeVideo', params['has_theme_video']))  # noqa: E501
        if 'has_subtitles' in params:
            query_params.append(('HasSubtitles', params['has_subtitles']))  # noqa: E501
        if 'has_special_feature' in params:
            query_params.append(('HasSpecialFeature', params['has_special_feature']))  # noqa: E501
        if 'has_trailer' in params:
            query_params.append(('HasTrailer', params['has_trailer']))  # noqa: E501
        if 'adjacent_to' in params:
            query_params.append(('AdjacentTo', params['adjacent_to']))  # noqa: E501
        if 'min_index_number' in params:
            query_params.append(('MinIndexNumber', params['min_index_number']))  # noqa: E501
        if 'min_start_date' in params:
            query_params.append(('MinStartDate', params['min_start_date']))  # noqa: E501
        if 'max_start_date' in params:
            query_params.append(('MaxStartDate', params['max_start_date']))  # noqa: E501
        if 'min_end_date' in params:
            query_params.append(('MinEndDate', params['min_end_date']))  # noqa: E501
        if 'max_end_date' in params:
            query_params.append(('MaxEndDate', params['max_end_date']))  # noqa: E501
        if 'min_players' in params:
            query_params.append(('MinPlayers', params['min_players']))  # noqa: E501
        if 'max_players' in params:
            query_params.append(('MaxPlayers', params['max_players']))  # noqa: E501
        if 'parent_index_number' in params:
            query_params.append(('ParentIndexNumber', params['parent_index_number']))  # noqa: E501
        if 'has_parental_rating' in params:
            query_params.append(('HasParentalRating', params['has_parental_rating']))  # noqa: E501
        if 'is_hd' in params:
            query_params.append(('IsHD', params['is_hd']))  # noqa: E501
        if 'is_unaired' in params:
            query_params.append(('IsUnaired', params['is_unaired']))  # noqa: E501
        if 'min_community_rating' in params:
            query_params.append(('MinCommunityRating', params['min_community_rating']))  # noqa: E501
        if 'min_critic_rating' in params:
            query_params.append(('MinCriticRating', params['min_critic_rating']))  # noqa: E501
        if 'aired_during_season' in params:
            query_params.append(('AiredDuringSeason', params['aired_during_season']))  # noqa: E501
        if 'min_premiere_date' in params:
            query_params.append(('MinPremiereDate', params['min_premiere_date']))  # noqa: E501
        if 'min_date_last_saved' in params:
            query_params.append(('MinDateLastSaved', params['min_date_last_saved']))  # noqa: E501
        if 'min_date_last_saved_for_user' in params:
            query_params.append(('MinDateLastSavedForUser', params['min_date_last_saved_for_user']))  # noqa: E501
        if 'max_premiere_date' in params:
            query_params.append(('MaxPremiereDate', params['max_premiere_date']))  # noqa: E501
        if 'has_overview' in params:
            query_params.append(('HasOverview', params['has_overview']))  # noqa: E501
        if 'has_imdb_id' in params:
            query_params.append(('HasImdbId', params['has_imdb_id']))  # noqa: E501
        if 'has_tmdb_id' in params:
            query_params.append(('HasTmdbId', params['has_tmdb_id']))  # noqa: E501
        if 'has_tvdb_id' in params:
            query_params.append(('HasTvdbId', params['has_tvdb_id']))  # noqa: E501
        if 'exclude_item_ids' in params:
            query_params.append(('ExcludeItemIds', params['exclude_item_ids']))  # noqa: E501
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'recursive' in params:
            query_params.append(('Recursive', params['recursive']))  # noqa: E501
        if 'search_term' in params:
            query_params.append(('SearchTerm', params['search_term']))  # noqa: E501
        if 'sort_order' in params:
            query_params.append(('SortOrder', params['sort_order']))  # noqa: E501
        if 'parent_id' in params:
            query_params.append(('ParentId', params['parent_id']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501
        if 'exclude_item_types' in params:
            query_params.append(('ExcludeItemTypes', params['exclude_item_types']))  # noqa: E501
        if 'include_item_types' in params:
            query_params.append(('IncludeItemTypes', params['include_item_types']))  # noqa: E501
        if 'any_provider_id_equals' in params:
            query_params.append(('AnyProviderIdEquals', params['any_provider_id_equals']))  # noqa: E501
        if 'filters' in params:
            query_params.append(('Filters', params['filters']))  # noqa: E501
        if 'is_favorite' in params:
            query_params.append(('IsFavorite', params['is_favorite']))  # noqa: E501
        if 'is_movie' in params:
            query_params.append(('IsMovie', params['is_movie']))  # noqa: E501
        if 'is_series' in params:
            query_params.append(('IsSeries', params['is_series']))  # noqa: E501
        if 'is_folder' in params:
            query_params.append(('IsFolder', params['is_folder']))  # noqa: E501
        if 'is_news' in params:
            query_params.append(('IsNews', params['is_news']))  # noqa: E501
        if 'is_kids' in params:
            query_params.append(('IsKids', params['is_kids']))  # noqa: E501
        if 'is_sports' in params:
            query_params.append(('IsSports', params['is_sports']))  # noqa: E501
        if 'is_new' in params:
            query_params.append(('IsNew', params['is_new']))  # noqa: E501
        if 'is_premiere' in params:
            query_params.append(('IsPremiere', params['is_premiere']))  # noqa: E501
        if 'is_new_or_premiere' in params:
            query_params.append(('IsNewOrPremiere', params['is_new_or_premiere']))  # noqa: E501
        if 'is_repeat' in params:
            query_params.append(('IsRepeat', params['is_repeat']))  # noqa: E501
        if 'project_to_media' in params:
            query_params.append(('ProjectToMedia', params['project_to_media']))  # noqa: E501
        if 'media_types' in params:
            query_params.append(('MediaTypes', params['media_types']))  # noqa: E501
        if 'image_types' in params:
            query_params.append(('ImageTypes', params['image_types']))  # noqa: E501
        if 'sort_by' in params:
            query_params.append(('SortBy', params['sort_by']))  # noqa: E501
        if 'is_played' in params:
            query_params.append(('IsPlayed', params['is_played']))  # noqa: E501
        if 'genres' in params:
            query_params.append(('Genres', params['genres']))  # noqa: E501
        if 'official_ratings' in params:
            query_params.append(('OfficialRatings', params['official_ratings']))  # noqa: E501
        if 'tags' in params:
            query_params.append(('Tags', params['tags']))  # noqa: E501
        if 'exclude_tags' in params:
            query_params.append(('ExcludeTags', params['exclude_tags']))  # noqa: E501
        if 'years' in params:
            query_params.append(('Years', params['years']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'person' in params:
            query_params.append(('Person', params['person']))  # noqa: E501
        if 'person_ids' in params:
            query_params.append(('PersonIds', params['person_ids']))  # noqa: E501
        if 'person_types' in params:
            query_params.append(('PersonTypes', params['person_types']))  # noqa: E501
        if 'studios' in params:
            query_params.append(('Studios', params['studios']))  # noqa: E501
        if 'studio_ids' in params:
            query_params.append(('StudioIds', params['studio_ids']))  # noqa: E501
        if 'artists' in params:
            query_params.append(('Artists', params['artists']))  # noqa: E501
        if 'artist_ids' in params:
            query_params.append(('ArtistIds', params['artist_ids']))  # noqa: E501
        if 'albums' in params:
            query_params.append(('Albums', params['albums']))  # noqa: E501
        if 'ids' in params:
            query_params.append(('Ids', params['ids']))  # noqa: E501
        if 'video_types' in params:
            query_params.append(('VideoTypes', params['video_types']))  # noqa: E501
        if 'containers' in params:
            query_params.append(('Containers', params['containers']))  # noqa: E501
        if 'audio_codecs' in params:
            query_params.append(('AudioCodecs', params['audio_codecs']))  # noqa: E501
        if 'audio_layouts' in params:
            query_params.append(('AudioLayouts', params['audio_layouts']))  # noqa: E501
        if 'video_codecs' in params:
            query_params.append(('VideoCodecs', params['video_codecs']))  # noqa: E501
        if 'extended_video_types' in params:
            query_params.append(('ExtendedVideoTypes', params['extended_video_types']))  # noqa: E501
        if 'subtitle_codecs' in params:
            query_params.append(('SubtitleCodecs', params['subtitle_codecs']))  # noqa: E501
        if 'path' in params:
            query_params.append(('Path', params['path']))  # noqa: E501
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'min_official_rating' in params:
            query_params.append(('MinOfficialRating', params['min_official_rating']))  # noqa: E501
        if 'is_locked' in params:
            query_params.append(('IsLocked', params['is_locked']))  # noqa: E501
        if 'is_place_holder' in params:
            query_params.append(('IsPlaceHolder', params['is_place_holder']))  # noqa: E501
        if 'has_official_rating' in params:
            query_params.append(('HasOfficialRating', params['has_official_rating']))  # noqa: E501
        if 'group_items_into_collections' in params:
            query_params.append(('GroupItemsIntoCollections', params['group_items_into_collections']))  # noqa: E501
        if 'is3_d' in params:
            query_params.append(('Is3D', params['is3_d']))  # noqa: E501
        if 'series_status' in params:
            query_params.append(('SeriesStatus', params['series_status']))  # noqa: E501
        if 'name_starts_with_or_greater' in params:
            query_params.append(('NameStartsWithOrGreater', params['name_starts_with_or_greater']))  # noqa: E501
        if 'artist_starts_with_or_greater' in params:
            query_params.append(('ArtistStartsWithOrGreater', params['artist_starts_with_or_greater']))  # noqa: E501
        if 'album_artist_starts_with_or_greater' in params:
            query_params.append(('AlbumArtistStartsWithOrGreater', params['album_artist_starts_with_or_greater']))  # noqa: E501
        if 'name_starts_with' in params:
            query_params.append(('NameStartsWith', params['name_starts_with']))  # noqa: E501
        if 'name_less_than' in params:
            query_params.append(('NameLessThan', params['name_less_than']))  # noqa: E501

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
            '/LiveTv/ChannelTags/Prefixes', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[ApiTagItem]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_epg(self, **kwargs):  # noqa: E501
        """Gets the epg.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_epg(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvChannelType type: Optional filter by channel type.
        :param bool is_liked: Filter by channels that are liked, or not.
        :param bool is_disliked: Filter by channels that are disliked, or not.
        :param bool enable_favorite_sorting: Incorporate favorite and like status into channel sorting.
        :param bool add_current_program: Optional. Adds current program info to each channel
        :param str channel_ids: The channels to return guide information for.
        :param str artist_type: Artist or AlbumArtist
        :param str max_official_rating: Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
        :param bool has_theme_song: Optional filter by items with theme songs.
        :param bool has_theme_video: Optional filter by items with theme videos.
        :param bool has_subtitles: Optional filter by items with subtitles.
        :param bool has_special_feature: Optional filter by items with special features.
        :param bool has_trailer: Optional filter by items with trailers.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
        :param int min_index_number: Optional filter by minimum index number.
        :param str min_start_date: Optional. The minimum premiere date. Format = ISO
        :param str max_start_date: Optional. The maximum premiere date. Format = ISO
        :param str min_end_date: Optional. The minimum premiere date. Format = ISO
        :param str max_end_date: Optional. The maximum premiere date. Format = ISO
        :param int min_players: Optional filter by minimum number of game players.
        :param int max_players: Optional filter by maximum number of game players.
        :param int parent_index_number: Optional filter by parent index number.
        :param bool has_parental_rating: Optional filter by items that have or do not have a parental rating
        :param bool is_hd: Optional filter by items that are HD or not.
        :param bool is_unaired: Optional filter by items that are unaired episodes or not.
        :param float min_community_rating: Optional filter by minimum community rating.
        :param float min_critic_rating: Optional filter by minimum critic rating.
        :param int aired_during_season: Gets all episodes that aired during a season, including specials.
        :param str min_premiere_date: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved_for_user: Optional. The minimum premiere date. Format = ISO
        :param str max_premiere_date: Optional. The maximum premiere date. Format = ISO
        :param bool has_overview: Optional filter by items that have an overview or not.
        :param bool has_imdb_id: Optional filter by items that have an imdb id or not.
        :param bool has_tmdb_id: Optional filter by items that have a tmdb id or not.
        :param bool has_tvdb_id: Optional filter by items that have a tvdb id or not.
        :param str exclude_item_ids: Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param bool recursive: When searching within folders, this determines whether or not the search will be recursive. true/false
        :param str search_term: Enter a search term to perform a search request
        :param str sort_order: Sort Order - Ascending,Descending
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param str exclude_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str any_provider_id_equals: Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form 'prov.id', e.g. 'imdb.tt123456'. This allows multiple, comma delimeted value pairs.
        :param str filters: Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
        :param bool is_favorite: Optional filter by items that are marked as favorite, or not.
        :param bool is_movie: Optional filter for movies.
        :param bool is_series: Optional filter for series.
        :param bool is_folder: Optional filter for folders.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool is_new: Optional filter for IsNew.
        :param bool is_premiere: Optional filter for IsPremiere.
        :param bool is_new_or_premiere: Optional filter for IsNewOrPremiere.
        :param bool is_repeat: Optional filter for IsRepeat.
        :param bool project_to_media: ProjectToMedia
        :param str media_types: Optional filter by MediaType. Allows multiple, comma delimited.
        :param str image_types: Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
        :param bool is_played: Optional filter by items that are played, or not.
        :param str genres: Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
        :param str official_ratings: Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
        :param str tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str exclude_tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str years: Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str person: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_ids: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_types: Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
        :param str studios: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str studio_ids: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str artists: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str artist_ids: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str albums: Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
        :param str ids: Optional. If specific items are needed, specify a list of item id's to retrieve. This allows multiple, comma delimited.
        :param str video_types: Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
        :param str containers: Optional filter by Container. Allows multiple, comma delimeted.
        :param str audio_codecs: Optional filter by AudioCodec. Allows multiple, comma delimeted.
        :param str audio_layouts: Optional filter by AudioLayout. Allows multiple, comma delimeted.
        :param str video_codecs: Optional filter by VideoCodec. Allows multiple, comma delimeted.
        :param str extended_video_types: Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
        :param str subtitle_codecs: Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
        :param str path: Optional filter by Path.
        :param str user_id: User Id
        :param str min_official_rating: Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
        :param bool is_locked: Optional filter by items that are locked.
        :param bool is_place_holder: Optional filter by items that are placeholders
        :param bool has_official_rating: Optional filter by items that have official ratings
        :param bool group_items_into_collections: Whether or not to hide items behind their boxsets.
        :param bool is3_d: Optional filter by items that are 3D, or not.
        :param str series_status: Optional filter by Series Status. Allows multiple, comma delimeted.
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str album_artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str name_starts_with: Optional filter by items whose name is sorted equally than a given input string.
        :param str name_less_than: Optional filter by items whose name is equally or lesser than a given input string.
        :return: QueryResultApiEpgRow
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_epg_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_epg_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_epg_with_http_info(self, **kwargs):  # noqa: E501
        """Gets the epg.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_epg_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvChannelType type: Optional filter by channel type.
        :param bool is_liked: Filter by channels that are liked, or not.
        :param bool is_disliked: Filter by channels that are disliked, or not.
        :param bool enable_favorite_sorting: Incorporate favorite and like status into channel sorting.
        :param bool add_current_program: Optional. Adds current program info to each channel
        :param str channel_ids: The channels to return guide information for.
        :param str artist_type: Artist or AlbumArtist
        :param str max_official_rating: Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
        :param bool has_theme_song: Optional filter by items with theme songs.
        :param bool has_theme_video: Optional filter by items with theme videos.
        :param bool has_subtitles: Optional filter by items with subtitles.
        :param bool has_special_feature: Optional filter by items with special features.
        :param bool has_trailer: Optional filter by items with trailers.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
        :param int min_index_number: Optional filter by minimum index number.
        :param str min_start_date: Optional. The minimum premiere date. Format = ISO
        :param str max_start_date: Optional. The maximum premiere date. Format = ISO
        :param str min_end_date: Optional. The minimum premiere date. Format = ISO
        :param str max_end_date: Optional. The maximum premiere date. Format = ISO
        :param int min_players: Optional filter by minimum number of game players.
        :param int max_players: Optional filter by maximum number of game players.
        :param int parent_index_number: Optional filter by parent index number.
        :param bool has_parental_rating: Optional filter by items that have or do not have a parental rating
        :param bool is_hd: Optional filter by items that are HD or not.
        :param bool is_unaired: Optional filter by items that are unaired episodes or not.
        :param float min_community_rating: Optional filter by minimum community rating.
        :param float min_critic_rating: Optional filter by minimum critic rating.
        :param int aired_during_season: Gets all episodes that aired during a season, including specials.
        :param str min_premiere_date: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved_for_user: Optional. The minimum premiere date. Format = ISO
        :param str max_premiere_date: Optional. The maximum premiere date. Format = ISO
        :param bool has_overview: Optional filter by items that have an overview or not.
        :param bool has_imdb_id: Optional filter by items that have an imdb id or not.
        :param bool has_tmdb_id: Optional filter by items that have a tmdb id or not.
        :param bool has_tvdb_id: Optional filter by items that have a tvdb id or not.
        :param str exclude_item_ids: Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param bool recursive: When searching within folders, this determines whether or not the search will be recursive. true/false
        :param str search_term: Enter a search term to perform a search request
        :param str sort_order: Sort Order - Ascending,Descending
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param str exclude_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str any_provider_id_equals: Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form 'prov.id', e.g. 'imdb.tt123456'. This allows multiple, comma delimeted value pairs.
        :param str filters: Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
        :param bool is_favorite: Optional filter by items that are marked as favorite, or not.
        :param bool is_movie: Optional filter for movies.
        :param bool is_series: Optional filter for series.
        :param bool is_folder: Optional filter for folders.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool is_new: Optional filter for IsNew.
        :param bool is_premiere: Optional filter for IsPremiere.
        :param bool is_new_or_premiere: Optional filter for IsNewOrPremiere.
        :param bool is_repeat: Optional filter for IsRepeat.
        :param bool project_to_media: ProjectToMedia
        :param str media_types: Optional filter by MediaType. Allows multiple, comma delimited.
        :param str image_types: Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
        :param bool is_played: Optional filter by items that are played, or not.
        :param str genres: Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
        :param str official_ratings: Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
        :param str tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str exclude_tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str years: Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str person: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_ids: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_types: Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
        :param str studios: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str studio_ids: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str artists: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str artist_ids: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str albums: Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
        :param str ids: Optional. If specific items are needed, specify a list of item id's to retrieve. This allows multiple, comma delimited.
        :param str video_types: Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
        :param str containers: Optional filter by Container. Allows multiple, comma delimeted.
        :param str audio_codecs: Optional filter by AudioCodec. Allows multiple, comma delimeted.
        :param str audio_layouts: Optional filter by AudioLayout. Allows multiple, comma delimeted.
        :param str video_codecs: Optional filter by VideoCodec. Allows multiple, comma delimeted.
        :param str extended_video_types: Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
        :param str subtitle_codecs: Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
        :param str path: Optional filter by Path.
        :param str user_id: User Id
        :param str min_official_rating: Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
        :param bool is_locked: Optional filter by items that are locked.
        :param bool is_place_holder: Optional filter by items that are placeholders
        :param bool has_official_rating: Optional filter by items that have official ratings
        :param bool group_items_into_collections: Whether or not to hide items behind their boxsets.
        :param bool is3_d: Optional filter by items that are 3D, or not.
        :param str series_status: Optional filter by Series Status. Allows multiple, comma delimeted.
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str album_artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str name_starts_with: Optional filter by items whose name is sorted equally than a given input string.
        :param str name_less_than: Optional filter by items whose name is equally or lesser than a given input string.
        :return: QueryResultApiEpgRow
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['type', 'is_liked', 'is_disliked', 'enable_favorite_sorting', 'add_current_program', 'channel_ids', 'artist_type', 'max_official_rating', 'has_theme_song', 'has_theme_video', 'has_subtitles', 'has_special_feature', 'has_trailer', 'adjacent_to', 'min_index_number', 'min_start_date', 'max_start_date', 'min_end_date', 'max_end_date', 'min_players', 'max_players', 'parent_index_number', 'has_parental_rating', 'is_hd', 'is_unaired', 'min_community_rating', 'min_critic_rating', 'aired_during_season', 'min_premiere_date', 'min_date_last_saved', 'min_date_last_saved_for_user', 'max_premiere_date', 'has_overview', 'has_imdb_id', 'has_tmdb_id', 'has_tvdb_id', 'exclude_item_ids', 'start_index', 'limit', 'recursive', 'search_term', 'sort_order', 'parent_id', 'fields', 'exclude_item_types', 'include_item_types', 'any_provider_id_equals', 'filters', 'is_favorite', 'is_movie', 'is_series', 'is_folder', 'is_news', 'is_kids', 'is_sports', 'is_new', 'is_premiere', 'is_new_or_premiere', 'is_repeat', 'project_to_media', 'media_types', 'image_types', 'sort_by', 'is_played', 'genres', 'official_ratings', 'tags', 'exclude_tags', 'years', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types', 'person', 'person_ids', 'person_types', 'studios', 'studio_ids', 'artists', 'artist_ids', 'albums', 'ids', 'video_types', 'containers', 'audio_codecs', 'audio_layouts', 'video_codecs', 'extended_video_types', 'subtitle_codecs', 'path', 'user_id', 'min_official_rating', 'is_locked', 'is_place_holder', 'has_official_rating', 'group_items_into_collections', 'is3_d', 'series_status', 'name_starts_with_or_greater', 'artist_starts_with_or_greater', 'album_artist_starts_with_or_greater', 'name_starts_with', 'name_less_than']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_epg" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'type' in params:
            query_params.append(('Type', params['type']))  # noqa: E501
        if 'is_liked' in params:
            query_params.append(('IsLiked', params['is_liked']))  # noqa: E501
        if 'is_disliked' in params:
            query_params.append(('IsDisliked', params['is_disliked']))  # noqa: E501
        if 'enable_favorite_sorting' in params:
            query_params.append(('EnableFavoriteSorting', params['enable_favorite_sorting']))  # noqa: E501
        if 'add_current_program' in params:
            query_params.append(('AddCurrentProgram', params['add_current_program']))  # noqa: E501
        if 'channel_ids' in params:
            query_params.append(('ChannelIds', params['channel_ids']))  # noqa: E501
        if 'artist_type' in params:
            query_params.append(('ArtistType', params['artist_type']))  # noqa: E501
        if 'max_official_rating' in params:
            query_params.append(('MaxOfficialRating', params['max_official_rating']))  # noqa: E501
        if 'has_theme_song' in params:
            query_params.append(('HasThemeSong', params['has_theme_song']))  # noqa: E501
        if 'has_theme_video' in params:
            query_params.append(('HasThemeVideo', params['has_theme_video']))  # noqa: E501
        if 'has_subtitles' in params:
            query_params.append(('HasSubtitles', params['has_subtitles']))  # noqa: E501
        if 'has_special_feature' in params:
            query_params.append(('HasSpecialFeature', params['has_special_feature']))  # noqa: E501
        if 'has_trailer' in params:
            query_params.append(('HasTrailer', params['has_trailer']))  # noqa: E501
        if 'adjacent_to' in params:
            query_params.append(('AdjacentTo', params['adjacent_to']))  # noqa: E501
        if 'min_index_number' in params:
            query_params.append(('MinIndexNumber', params['min_index_number']))  # noqa: E501
        if 'min_start_date' in params:
            query_params.append(('MinStartDate', params['min_start_date']))  # noqa: E501
        if 'max_start_date' in params:
            query_params.append(('MaxStartDate', params['max_start_date']))  # noqa: E501
        if 'min_end_date' in params:
            query_params.append(('MinEndDate', params['min_end_date']))  # noqa: E501
        if 'max_end_date' in params:
            query_params.append(('MaxEndDate', params['max_end_date']))  # noqa: E501
        if 'min_players' in params:
            query_params.append(('MinPlayers', params['min_players']))  # noqa: E501
        if 'max_players' in params:
            query_params.append(('MaxPlayers', params['max_players']))  # noqa: E501
        if 'parent_index_number' in params:
            query_params.append(('ParentIndexNumber', params['parent_index_number']))  # noqa: E501
        if 'has_parental_rating' in params:
            query_params.append(('HasParentalRating', params['has_parental_rating']))  # noqa: E501
        if 'is_hd' in params:
            query_params.append(('IsHD', params['is_hd']))  # noqa: E501
        if 'is_unaired' in params:
            query_params.append(('IsUnaired', params['is_unaired']))  # noqa: E501
        if 'min_community_rating' in params:
            query_params.append(('MinCommunityRating', params['min_community_rating']))  # noqa: E501
        if 'min_critic_rating' in params:
            query_params.append(('MinCriticRating', params['min_critic_rating']))  # noqa: E501
        if 'aired_during_season' in params:
            query_params.append(('AiredDuringSeason', params['aired_during_season']))  # noqa: E501
        if 'min_premiere_date' in params:
            query_params.append(('MinPremiereDate', params['min_premiere_date']))  # noqa: E501
        if 'min_date_last_saved' in params:
            query_params.append(('MinDateLastSaved', params['min_date_last_saved']))  # noqa: E501
        if 'min_date_last_saved_for_user' in params:
            query_params.append(('MinDateLastSavedForUser', params['min_date_last_saved_for_user']))  # noqa: E501
        if 'max_premiere_date' in params:
            query_params.append(('MaxPremiereDate', params['max_premiere_date']))  # noqa: E501
        if 'has_overview' in params:
            query_params.append(('HasOverview', params['has_overview']))  # noqa: E501
        if 'has_imdb_id' in params:
            query_params.append(('HasImdbId', params['has_imdb_id']))  # noqa: E501
        if 'has_tmdb_id' in params:
            query_params.append(('HasTmdbId', params['has_tmdb_id']))  # noqa: E501
        if 'has_tvdb_id' in params:
            query_params.append(('HasTvdbId', params['has_tvdb_id']))  # noqa: E501
        if 'exclude_item_ids' in params:
            query_params.append(('ExcludeItemIds', params['exclude_item_ids']))  # noqa: E501
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'recursive' in params:
            query_params.append(('Recursive', params['recursive']))  # noqa: E501
        if 'search_term' in params:
            query_params.append(('SearchTerm', params['search_term']))  # noqa: E501
        if 'sort_order' in params:
            query_params.append(('SortOrder', params['sort_order']))  # noqa: E501
        if 'parent_id' in params:
            query_params.append(('ParentId', params['parent_id']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501
        if 'exclude_item_types' in params:
            query_params.append(('ExcludeItemTypes', params['exclude_item_types']))  # noqa: E501
        if 'include_item_types' in params:
            query_params.append(('IncludeItemTypes', params['include_item_types']))  # noqa: E501
        if 'any_provider_id_equals' in params:
            query_params.append(('AnyProviderIdEquals', params['any_provider_id_equals']))  # noqa: E501
        if 'filters' in params:
            query_params.append(('Filters', params['filters']))  # noqa: E501
        if 'is_favorite' in params:
            query_params.append(('IsFavorite', params['is_favorite']))  # noqa: E501
        if 'is_movie' in params:
            query_params.append(('IsMovie', params['is_movie']))  # noqa: E501
        if 'is_series' in params:
            query_params.append(('IsSeries', params['is_series']))  # noqa: E501
        if 'is_folder' in params:
            query_params.append(('IsFolder', params['is_folder']))  # noqa: E501
        if 'is_news' in params:
            query_params.append(('IsNews', params['is_news']))  # noqa: E501
        if 'is_kids' in params:
            query_params.append(('IsKids', params['is_kids']))  # noqa: E501
        if 'is_sports' in params:
            query_params.append(('IsSports', params['is_sports']))  # noqa: E501
        if 'is_new' in params:
            query_params.append(('IsNew', params['is_new']))  # noqa: E501
        if 'is_premiere' in params:
            query_params.append(('IsPremiere', params['is_premiere']))  # noqa: E501
        if 'is_new_or_premiere' in params:
            query_params.append(('IsNewOrPremiere', params['is_new_or_premiere']))  # noqa: E501
        if 'is_repeat' in params:
            query_params.append(('IsRepeat', params['is_repeat']))  # noqa: E501
        if 'project_to_media' in params:
            query_params.append(('ProjectToMedia', params['project_to_media']))  # noqa: E501
        if 'media_types' in params:
            query_params.append(('MediaTypes', params['media_types']))  # noqa: E501
        if 'image_types' in params:
            query_params.append(('ImageTypes', params['image_types']))  # noqa: E501
        if 'sort_by' in params:
            query_params.append(('SortBy', params['sort_by']))  # noqa: E501
        if 'is_played' in params:
            query_params.append(('IsPlayed', params['is_played']))  # noqa: E501
        if 'genres' in params:
            query_params.append(('Genres', params['genres']))  # noqa: E501
        if 'official_ratings' in params:
            query_params.append(('OfficialRatings', params['official_ratings']))  # noqa: E501
        if 'tags' in params:
            query_params.append(('Tags', params['tags']))  # noqa: E501
        if 'exclude_tags' in params:
            query_params.append(('ExcludeTags', params['exclude_tags']))  # noqa: E501
        if 'years' in params:
            query_params.append(('Years', params['years']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'person' in params:
            query_params.append(('Person', params['person']))  # noqa: E501
        if 'person_ids' in params:
            query_params.append(('PersonIds', params['person_ids']))  # noqa: E501
        if 'person_types' in params:
            query_params.append(('PersonTypes', params['person_types']))  # noqa: E501
        if 'studios' in params:
            query_params.append(('Studios', params['studios']))  # noqa: E501
        if 'studio_ids' in params:
            query_params.append(('StudioIds', params['studio_ids']))  # noqa: E501
        if 'artists' in params:
            query_params.append(('Artists', params['artists']))  # noqa: E501
        if 'artist_ids' in params:
            query_params.append(('ArtistIds', params['artist_ids']))  # noqa: E501
        if 'albums' in params:
            query_params.append(('Albums', params['albums']))  # noqa: E501
        if 'ids' in params:
            query_params.append(('Ids', params['ids']))  # noqa: E501
        if 'video_types' in params:
            query_params.append(('VideoTypes', params['video_types']))  # noqa: E501
        if 'containers' in params:
            query_params.append(('Containers', params['containers']))  # noqa: E501
        if 'audio_codecs' in params:
            query_params.append(('AudioCodecs', params['audio_codecs']))  # noqa: E501
        if 'audio_layouts' in params:
            query_params.append(('AudioLayouts', params['audio_layouts']))  # noqa: E501
        if 'video_codecs' in params:
            query_params.append(('VideoCodecs', params['video_codecs']))  # noqa: E501
        if 'extended_video_types' in params:
            query_params.append(('ExtendedVideoTypes', params['extended_video_types']))  # noqa: E501
        if 'subtitle_codecs' in params:
            query_params.append(('SubtitleCodecs', params['subtitle_codecs']))  # noqa: E501
        if 'path' in params:
            query_params.append(('Path', params['path']))  # noqa: E501
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'min_official_rating' in params:
            query_params.append(('MinOfficialRating', params['min_official_rating']))  # noqa: E501
        if 'is_locked' in params:
            query_params.append(('IsLocked', params['is_locked']))  # noqa: E501
        if 'is_place_holder' in params:
            query_params.append(('IsPlaceHolder', params['is_place_holder']))  # noqa: E501
        if 'has_official_rating' in params:
            query_params.append(('HasOfficialRating', params['has_official_rating']))  # noqa: E501
        if 'group_items_into_collections' in params:
            query_params.append(('GroupItemsIntoCollections', params['group_items_into_collections']))  # noqa: E501
        if 'is3_d' in params:
            query_params.append(('Is3D', params['is3_d']))  # noqa: E501
        if 'series_status' in params:
            query_params.append(('SeriesStatus', params['series_status']))  # noqa: E501
        if 'name_starts_with_or_greater' in params:
            query_params.append(('NameStartsWithOrGreater', params['name_starts_with_or_greater']))  # noqa: E501
        if 'artist_starts_with_or_greater' in params:
            query_params.append(('ArtistStartsWithOrGreater', params['artist_starts_with_or_greater']))  # noqa: E501
        if 'album_artist_starts_with_or_greater' in params:
            query_params.append(('AlbumArtistStartsWithOrGreater', params['album_artist_starts_with_or_greater']))  # noqa: E501
        if 'name_starts_with' in params:
            query_params.append(('NameStartsWith', params['name_starts_with']))  # noqa: E501
        if 'name_less_than' in params:
            query_params.append(('NameLessThan', params['name_less_than']))  # noqa: E501

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
            '/LiveTv/EPG', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultApiEpgRow',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_folder(self, **kwargs):  # noqa: E501
        """Gets the top level live tv folder  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_folder(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: BaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_folder_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_folder_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_folder_with_http_info(self, **kwargs):  # noqa: E501
        """Gets the top level live tv folder  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_folder_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: BaseItemDto
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
                    " to method get_livetv_folder" % key
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
            '/LiveTv/Folder', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='BaseItemDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_guideinfo(self, **kwargs):  # noqa: E501
        """Gets guide info  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_guideinfo(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: LiveTvGuideInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_guideinfo_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_guideinfo_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_guideinfo_with_http_info(self, **kwargs):  # noqa: E501
        """Gets guide info  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_guideinfo_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: LiveTvGuideInfo
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
                    " to method get_livetv_guideinfo" % key
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
            '/LiveTv/GuideInfo', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='LiveTvGuideInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_info(self, **kwargs):  # noqa: E501
        """Gets available live tv services.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: LiveTvLiveTvInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_info_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_info_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_info_with_http_info(self, **kwargs):  # noqa: E501
        """Gets available live tv services.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_info_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: LiveTvLiveTvInfo
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
                    " to method get_livetv_info" % key
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
            '/LiveTv/Info', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='LiveTvLiveTvInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_listingproviders(self, channel_id, **kwargs):  # noqa: E501
        """Gets current listing providers  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_listingproviders(channel_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str channel_id: Channel id (required)
        :return: list[LiveTvListingsProviderInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_listingproviders_with_http_info(channel_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_listingproviders_with_http_info(channel_id, **kwargs)  # noqa: E501
            return data

    def get_livetv_listingproviders_with_http_info(self, channel_id, **kwargs):  # noqa: E501
        """Gets current listing providers  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_listingproviders_with_http_info(channel_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str channel_id: Channel id (required)
        :return: list[LiveTvListingsProviderInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['channel_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_listingproviders" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'channel_id' is set
        if ('channel_id' not in params or
                params['channel_id'] is None):
            raise ValueError("Missing the required parameter `channel_id` when calling `get_livetv_listingproviders`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'channel_id' in params:
            query_params.append(('ChannelId', params['channel_id']))  # noqa: E501

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
            '/LiveTv/ListingProviders', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[LiveTvListingsProviderInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_listingproviders_available(self, **kwargs):  # noqa: E501
        """Gets listing provider  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_listingproviders_available(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[ApiListingProviderTypeInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_listingproviders_available_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_listingproviders_available_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_listingproviders_available_with_http_info(self, **kwargs):  # noqa: E501
        """Gets listing provider  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_listingproviders_available_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[ApiListingProviderTypeInfo]
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
                    " to method get_livetv_listingproviders_available" % key
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
            '/LiveTv/ListingProviders/Available', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[ApiListingProviderTypeInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_listingproviders_default(self, **kwargs):  # noqa: E501
        """get_livetv_listingproviders_default  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_listingproviders_default(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: LiveTvListingsProviderInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_listingproviders_default_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_listingproviders_default_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_listingproviders_default_with_http_info(self, **kwargs):  # noqa: E501
        """get_livetv_listingproviders_default  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_listingproviders_default_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: LiveTvListingsProviderInfo
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
                    " to method get_livetv_listingproviders_default" % key
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
            '/LiveTv/ListingProviders/Default', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='LiveTvListingsProviderInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_listingproviders_lineups(self, **kwargs):  # noqa: E501
        """Gets available lineups  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_listingproviders_lineups(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Provider id
        :param str type: Provider Type
        :param str location: Location
        :param str country: Country
        :return: list[NameIdPair]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_listingproviders_lineups_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_listingproviders_lineups_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_listingproviders_lineups_with_http_info(self, **kwargs):  # noqa: E501
        """Gets available lineups  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_listingproviders_lineups_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Provider id
        :param str type: Provider Type
        :param str location: Location
        :param str country: Country
        :return: list[NameIdPair]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'type', 'location', 'country']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_listingproviders_lineups" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'id' in params:
            query_params.append(('Id', params['id']))  # noqa: E501
        if 'type' in params:
            query_params.append(('Type', params['type']))  # noqa: E501
        if 'location' in params:
            query_params.append(('Location', params['location']))  # noqa: E501
        if 'country' in params:
            query_params.append(('Country', params['country']))  # noqa: E501

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
            '/LiveTv/ListingProviders/Lineups', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[NameIdPair]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_listingproviders_schedulesdirect_countries(self, **kwargs):  # noqa: E501
        """Gets available lineups  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_listingproviders_schedulesdirect_countries(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_listingproviders_schedulesdirect_countries_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_listingproviders_schedulesdirect_countries_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_listingproviders_schedulesdirect_countries_with_http_info(self, **kwargs):  # noqa: E501
        """Gets available lineups  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_listingproviders_schedulesdirect_countries_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: None
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
                    " to method get_livetv_listingproviders_schedulesdirect_countries" % key
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
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/ListingProviders/SchedulesDirect/Countries', 'GET',
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

    def get_livetv_manage_channels(self, **kwargs):  # noqa: E501
        """Gets the channel management list  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_manage_channels(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Name, StartDate
        :param str sort_order: Sort Order - Ascending,Descending
        :return: QueryResultChannelManagementInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_manage_channels_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_manage_channels_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_manage_channels_with_http_info(self, **kwargs):  # noqa: E501
        """Gets the channel management list  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_manage_channels_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Name, StartDate
        :param str sort_order: Sort Order - Ascending,Descending
        :return: QueryResultChannelManagementInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['start_index', 'limit', 'sort_by', 'sort_order']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_manage_channels" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'sort_by' in params:
            query_params.append(('SortBy', params['sort_by']))  # noqa: E501
        if 'sort_order' in params:
            query_params.append(('SortOrder', params['sort_order']))  # noqa: E501

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
            '/LiveTv/Manage/Channels', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultChannelManagementInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_programs(self, **kwargs):  # noqa: E501
        """Gets available live tv epgs..  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_programs(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str channel_ids: The channels to return guide information for.
        :param str artist_type: Artist or AlbumArtist
        :param str max_official_rating: Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
        :param bool has_theme_song: Optional filter by items with theme songs.
        :param bool has_theme_video: Optional filter by items with theme videos.
        :param bool has_subtitles: Optional filter by items with subtitles.
        :param bool has_special_feature: Optional filter by items with special features.
        :param bool has_trailer: Optional filter by items with trailers.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
        :param int min_index_number: Optional filter by minimum index number.
        :param str min_start_date: Optional. The minimum premiere date. Format = ISO
        :param str max_start_date: Optional. The maximum premiere date. Format = ISO
        :param str min_end_date: Optional. The minimum premiere date. Format = ISO
        :param str max_end_date: Optional. The maximum premiere date. Format = ISO
        :param int min_players: Optional filter by minimum number of game players.
        :param int max_players: Optional filter by maximum number of game players.
        :param int parent_index_number: Optional filter by parent index number.
        :param bool has_parental_rating: Optional filter by items that have or do not have a parental rating
        :param bool is_hd: Optional filter by items that are HD or not.
        :param bool is_unaired: Optional filter by items that are unaired episodes or not.
        :param float min_community_rating: Optional filter by minimum community rating.
        :param float min_critic_rating: Optional filter by minimum critic rating.
        :param int aired_during_season: Gets all episodes that aired during a season, including specials.
        :param str min_premiere_date: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved_for_user: Optional. The minimum premiere date. Format = ISO
        :param str max_premiere_date: Optional. The maximum premiere date. Format = ISO
        :param bool has_overview: Optional filter by items that have an overview or not.
        :param bool has_imdb_id: Optional filter by items that have an imdb id or not.
        :param bool has_tmdb_id: Optional filter by items that have a tmdb id or not.
        :param bool has_tvdb_id: Optional filter by items that have a tvdb id or not.
        :param str exclude_item_ids: Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param bool recursive: When searching within folders, this determines whether or not the search will be recursive. true/false
        :param str search_term: Enter a search term to perform a search request
        :param str sort_order: Sort Order - Ascending,Descending
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param str exclude_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str any_provider_id_equals: Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form 'prov.id', e.g. 'imdb.tt123456'. This allows multiple, comma delimeted value pairs.
        :param str filters: Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
        :param bool is_favorite: Optional filter by items that are marked as favorite, or not.
        :param bool is_movie: Optional filter for movies.
        :param bool is_series: Optional filter for series.
        :param bool is_folder: Optional filter for folders.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool is_new: Optional filter for IsNew.
        :param bool is_premiere: Optional filter for IsPremiere.
        :param bool is_new_or_premiere: Optional filter for IsNewOrPremiere.
        :param bool is_repeat: Optional filter for IsRepeat.
        :param bool project_to_media: ProjectToMedia
        :param str media_types: Optional filter by MediaType. Allows multiple, comma delimited.
        :param str image_types: Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
        :param bool is_played: Optional filter by items that are played, or not.
        :param str genres: Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
        :param str official_ratings: Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
        :param str tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str exclude_tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str years: Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str person: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_ids: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_types: Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
        :param str studios: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str studio_ids: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str artists: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str artist_ids: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str albums: Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
        :param str ids: Optional. If specific items are needed, specify a list of item id's to retrieve. This allows multiple, comma delimited.
        :param str video_types: Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
        :param str containers: Optional filter by Container. Allows multiple, comma delimeted.
        :param str audio_codecs: Optional filter by AudioCodec. Allows multiple, comma delimeted.
        :param str audio_layouts: Optional filter by AudioLayout. Allows multiple, comma delimeted.
        :param str video_codecs: Optional filter by VideoCodec. Allows multiple, comma delimeted.
        :param str extended_video_types: Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
        :param str subtitle_codecs: Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
        :param str path: Optional filter by Path.
        :param str user_id: User Id
        :param str min_official_rating: Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
        :param bool is_locked: Optional filter by items that are locked.
        :param bool is_place_holder: Optional filter by items that are placeholders
        :param bool has_official_rating: Optional filter by items that have official ratings
        :param bool group_items_into_collections: Whether or not to hide items behind their boxsets.
        :param bool is3_d: Optional filter by items that are 3D, or not.
        :param str series_status: Optional filter by Series Status. Allows multiple, comma delimeted.
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str album_artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str name_starts_with: Optional filter by items whose name is sorted equally than a given input string.
        :param str name_less_than: Optional filter by items whose name is equally or lesser than a given input string.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_programs_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_programs_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_programs_with_http_info(self, **kwargs):  # noqa: E501
        """Gets available live tv epgs..  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_programs_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str channel_ids: The channels to return guide information for.
        :param str artist_type: Artist or AlbumArtist
        :param str max_official_rating: Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
        :param bool has_theme_song: Optional filter by items with theme songs.
        :param bool has_theme_video: Optional filter by items with theme videos.
        :param bool has_subtitles: Optional filter by items with subtitles.
        :param bool has_special_feature: Optional filter by items with special features.
        :param bool has_trailer: Optional filter by items with trailers.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
        :param int min_index_number: Optional filter by minimum index number.
        :param str min_start_date: Optional. The minimum premiere date. Format = ISO
        :param str max_start_date: Optional. The maximum premiere date. Format = ISO
        :param str min_end_date: Optional. The minimum premiere date. Format = ISO
        :param str max_end_date: Optional. The maximum premiere date. Format = ISO
        :param int min_players: Optional filter by minimum number of game players.
        :param int max_players: Optional filter by maximum number of game players.
        :param int parent_index_number: Optional filter by parent index number.
        :param bool has_parental_rating: Optional filter by items that have or do not have a parental rating
        :param bool is_hd: Optional filter by items that are HD or not.
        :param bool is_unaired: Optional filter by items that are unaired episodes or not.
        :param float min_community_rating: Optional filter by minimum community rating.
        :param float min_critic_rating: Optional filter by minimum critic rating.
        :param int aired_during_season: Gets all episodes that aired during a season, including specials.
        :param str min_premiere_date: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved_for_user: Optional. The minimum premiere date. Format = ISO
        :param str max_premiere_date: Optional. The maximum premiere date. Format = ISO
        :param bool has_overview: Optional filter by items that have an overview or not.
        :param bool has_imdb_id: Optional filter by items that have an imdb id or not.
        :param bool has_tmdb_id: Optional filter by items that have a tmdb id or not.
        :param bool has_tvdb_id: Optional filter by items that have a tvdb id or not.
        :param str exclude_item_ids: Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param bool recursive: When searching within folders, this determines whether or not the search will be recursive. true/false
        :param str search_term: Enter a search term to perform a search request
        :param str sort_order: Sort Order - Ascending,Descending
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param str exclude_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str any_provider_id_equals: Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form 'prov.id', e.g. 'imdb.tt123456'. This allows multiple, comma delimeted value pairs.
        :param str filters: Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
        :param bool is_favorite: Optional filter by items that are marked as favorite, or not.
        :param bool is_movie: Optional filter for movies.
        :param bool is_series: Optional filter for series.
        :param bool is_folder: Optional filter for folders.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool is_new: Optional filter for IsNew.
        :param bool is_premiere: Optional filter for IsPremiere.
        :param bool is_new_or_premiere: Optional filter for IsNewOrPremiere.
        :param bool is_repeat: Optional filter for IsRepeat.
        :param bool project_to_media: ProjectToMedia
        :param str media_types: Optional filter by MediaType. Allows multiple, comma delimited.
        :param str image_types: Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
        :param bool is_played: Optional filter by items that are played, or not.
        :param str genres: Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
        :param str official_ratings: Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
        :param str tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str exclude_tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str years: Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str person: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_ids: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_types: Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
        :param str studios: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str studio_ids: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str artists: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str artist_ids: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str albums: Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
        :param str ids: Optional. If specific items are needed, specify a list of item id's to retrieve. This allows multiple, comma delimited.
        :param str video_types: Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
        :param str containers: Optional filter by Container. Allows multiple, comma delimeted.
        :param str audio_codecs: Optional filter by AudioCodec. Allows multiple, comma delimeted.
        :param str audio_layouts: Optional filter by AudioLayout. Allows multiple, comma delimeted.
        :param str video_codecs: Optional filter by VideoCodec. Allows multiple, comma delimeted.
        :param str extended_video_types: Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
        :param str subtitle_codecs: Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
        :param str path: Optional filter by Path.
        :param str user_id: User Id
        :param str min_official_rating: Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
        :param bool is_locked: Optional filter by items that are locked.
        :param bool is_place_holder: Optional filter by items that are placeholders
        :param bool has_official_rating: Optional filter by items that have official ratings
        :param bool group_items_into_collections: Whether or not to hide items behind their boxsets.
        :param bool is3_d: Optional filter by items that are 3D, or not.
        :param str series_status: Optional filter by Series Status. Allows multiple, comma delimeted.
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str album_artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str name_starts_with: Optional filter by items whose name is sorted equally than a given input string.
        :param str name_less_than: Optional filter by items whose name is equally or lesser than a given input string.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['channel_ids', 'artist_type', 'max_official_rating', 'has_theme_song', 'has_theme_video', 'has_subtitles', 'has_special_feature', 'has_trailer', 'adjacent_to', 'min_index_number', 'min_start_date', 'max_start_date', 'min_end_date', 'max_end_date', 'min_players', 'max_players', 'parent_index_number', 'has_parental_rating', 'is_hd', 'is_unaired', 'min_community_rating', 'min_critic_rating', 'aired_during_season', 'min_premiere_date', 'min_date_last_saved', 'min_date_last_saved_for_user', 'max_premiere_date', 'has_overview', 'has_imdb_id', 'has_tmdb_id', 'has_tvdb_id', 'exclude_item_ids', 'start_index', 'limit', 'recursive', 'search_term', 'sort_order', 'parent_id', 'fields', 'exclude_item_types', 'include_item_types', 'any_provider_id_equals', 'filters', 'is_favorite', 'is_movie', 'is_series', 'is_folder', 'is_news', 'is_kids', 'is_sports', 'is_new', 'is_premiere', 'is_new_or_premiere', 'is_repeat', 'project_to_media', 'media_types', 'image_types', 'sort_by', 'is_played', 'genres', 'official_ratings', 'tags', 'exclude_tags', 'years', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types', 'person', 'person_ids', 'person_types', 'studios', 'studio_ids', 'artists', 'artist_ids', 'albums', 'ids', 'video_types', 'containers', 'audio_codecs', 'audio_layouts', 'video_codecs', 'extended_video_types', 'subtitle_codecs', 'path', 'user_id', 'min_official_rating', 'is_locked', 'is_place_holder', 'has_official_rating', 'group_items_into_collections', 'is3_d', 'series_status', 'name_starts_with_or_greater', 'artist_starts_with_or_greater', 'album_artist_starts_with_or_greater', 'name_starts_with', 'name_less_than']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_programs" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'channel_ids' in params:
            query_params.append(('ChannelIds', params['channel_ids']))  # noqa: E501
        if 'artist_type' in params:
            query_params.append(('ArtistType', params['artist_type']))  # noqa: E501
        if 'max_official_rating' in params:
            query_params.append(('MaxOfficialRating', params['max_official_rating']))  # noqa: E501
        if 'has_theme_song' in params:
            query_params.append(('HasThemeSong', params['has_theme_song']))  # noqa: E501
        if 'has_theme_video' in params:
            query_params.append(('HasThemeVideo', params['has_theme_video']))  # noqa: E501
        if 'has_subtitles' in params:
            query_params.append(('HasSubtitles', params['has_subtitles']))  # noqa: E501
        if 'has_special_feature' in params:
            query_params.append(('HasSpecialFeature', params['has_special_feature']))  # noqa: E501
        if 'has_trailer' in params:
            query_params.append(('HasTrailer', params['has_trailer']))  # noqa: E501
        if 'adjacent_to' in params:
            query_params.append(('AdjacentTo', params['adjacent_to']))  # noqa: E501
        if 'min_index_number' in params:
            query_params.append(('MinIndexNumber', params['min_index_number']))  # noqa: E501
        if 'min_start_date' in params:
            query_params.append(('MinStartDate', params['min_start_date']))  # noqa: E501
        if 'max_start_date' in params:
            query_params.append(('MaxStartDate', params['max_start_date']))  # noqa: E501
        if 'min_end_date' in params:
            query_params.append(('MinEndDate', params['min_end_date']))  # noqa: E501
        if 'max_end_date' in params:
            query_params.append(('MaxEndDate', params['max_end_date']))  # noqa: E501
        if 'min_players' in params:
            query_params.append(('MinPlayers', params['min_players']))  # noqa: E501
        if 'max_players' in params:
            query_params.append(('MaxPlayers', params['max_players']))  # noqa: E501
        if 'parent_index_number' in params:
            query_params.append(('ParentIndexNumber', params['parent_index_number']))  # noqa: E501
        if 'has_parental_rating' in params:
            query_params.append(('HasParentalRating', params['has_parental_rating']))  # noqa: E501
        if 'is_hd' in params:
            query_params.append(('IsHD', params['is_hd']))  # noqa: E501
        if 'is_unaired' in params:
            query_params.append(('IsUnaired', params['is_unaired']))  # noqa: E501
        if 'min_community_rating' in params:
            query_params.append(('MinCommunityRating', params['min_community_rating']))  # noqa: E501
        if 'min_critic_rating' in params:
            query_params.append(('MinCriticRating', params['min_critic_rating']))  # noqa: E501
        if 'aired_during_season' in params:
            query_params.append(('AiredDuringSeason', params['aired_during_season']))  # noqa: E501
        if 'min_premiere_date' in params:
            query_params.append(('MinPremiereDate', params['min_premiere_date']))  # noqa: E501
        if 'min_date_last_saved' in params:
            query_params.append(('MinDateLastSaved', params['min_date_last_saved']))  # noqa: E501
        if 'min_date_last_saved_for_user' in params:
            query_params.append(('MinDateLastSavedForUser', params['min_date_last_saved_for_user']))  # noqa: E501
        if 'max_premiere_date' in params:
            query_params.append(('MaxPremiereDate', params['max_premiere_date']))  # noqa: E501
        if 'has_overview' in params:
            query_params.append(('HasOverview', params['has_overview']))  # noqa: E501
        if 'has_imdb_id' in params:
            query_params.append(('HasImdbId', params['has_imdb_id']))  # noqa: E501
        if 'has_tmdb_id' in params:
            query_params.append(('HasTmdbId', params['has_tmdb_id']))  # noqa: E501
        if 'has_tvdb_id' in params:
            query_params.append(('HasTvdbId', params['has_tvdb_id']))  # noqa: E501
        if 'exclude_item_ids' in params:
            query_params.append(('ExcludeItemIds', params['exclude_item_ids']))  # noqa: E501
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'recursive' in params:
            query_params.append(('Recursive', params['recursive']))  # noqa: E501
        if 'search_term' in params:
            query_params.append(('SearchTerm', params['search_term']))  # noqa: E501
        if 'sort_order' in params:
            query_params.append(('SortOrder', params['sort_order']))  # noqa: E501
        if 'parent_id' in params:
            query_params.append(('ParentId', params['parent_id']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501
        if 'exclude_item_types' in params:
            query_params.append(('ExcludeItemTypes', params['exclude_item_types']))  # noqa: E501
        if 'include_item_types' in params:
            query_params.append(('IncludeItemTypes', params['include_item_types']))  # noqa: E501
        if 'any_provider_id_equals' in params:
            query_params.append(('AnyProviderIdEquals', params['any_provider_id_equals']))  # noqa: E501
        if 'filters' in params:
            query_params.append(('Filters', params['filters']))  # noqa: E501
        if 'is_favorite' in params:
            query_params.append(('IsFavorite', params['is_favorite']))  # noqa: E501
        if 'is_movie' in params:
            query_params.append(('IsMovie', params['is_movie']))  # noqa: E501
        if 'is_series' in params:
            query_params.append(('IsSeries', params['is_series']))  # noqa: E501
        if 'is_folder' in params:
            query_params.append(('IsFolder', params['is_folder']))  # noqa: E501
        if 'is_news' in params:
            query_params.append(('IsNews', params['is_news']))  # noqa: E501
        if 'is_kids' in params:
            query_params.append(('IsKids', params['is_kids']))  # noqa: E501
        if 'is_sports' in params:
            query_params.append(('IsSports', params['is_sports']))  # noqa: E501
        if 'is_new' in params:
            query_params.append(('IsNew', params['is_new']))  # noqa: E501
        if 'is_premiere' in params:
            query_params.append(('IsPremiere', params['is_premiere']))  # noqa: E501
        if 'is_new_or_premiere' in params:
            query_params.append(('IsNewOrPremiere', params['is_new_or_premiere']))  # noqa: E501
        if 'is_repeat' in params:
            query_params.append(('IsRepeat', params['is_repeat']))  # noqa: E501
        if 'project_to_media' in params:
            query_params.append(('ProjectToMedia', params['project_to_media']))  # noqa: E501
        if 'media_types' in params:
            query_params.append(('MediaTypes', params['media_types']))  # noqa: E501
        if 'image_types' in params:
            query_params.append(('ImageTypes', params['image_types']))  # noqa: E501
        if 'sort_by' in params:
            query_params.append(('SortBy', params['sort_by']))  # noqa: E501
        if 'is_played' in params:
            query_params.append(('IsPlayed', params['is_played']))  # noqa: E501
        if 'genres' in params:
            query_params.append(('Genres', params['genres']))  # noqa: E501
        if 'official_ratings' in params:
            query_params.append(('OfficialRatings', params['official_ratings']))  # noqa: E501
        if 'tags' in params:
            query_params.append(('Tags', params['tags']))  # noqa: E501
        if 'exclude_tags' in params:
            query_params.append(('ExcludeTags', params['exclude_tags']))  # noqa: E501
        if 'years' in params:
            query_params.append(('Years', params['years']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'person' in params:
            query_params.append(('Person', params['person']))  # noqa: E501
        if 'person_ids' in params:
            query_params.append(('PersonIds', params['person_ids']))  # noqa: E501
        if 'person_types' in params:
            query_params.append(('PersonTypes', params['person_types']))  # noqa: E501
        if 'studios' in params:
            query_params.append(('Studios', params['studios']))  # noqa: E501
        if 'studio_ids' in params:
            query_params.append(('StudioIds', params['studio_ids']))  # noqa: E501
        if 'artists' in params:
            query_params.append(('Artists', params['artists']))  # noqa: E501
        if 'artist_ids' in params:
            query_params.append(('ArtistIds', params['artist_ids']))  # noqa: E501
        if 'albums' in params:
            query_params.append(('Albums', params['albums']))  # noqa: E501
        if 'ids' in params:
            query_params.append(('Ids', params['ids']))  # noqa: E501
        if 'video_types' in params:
            query_params.append(('VideoTypes', params['video_types']))  # noqa: E501
        if 'containers' in params:
            query_params.append(('Containers', params['containers']))  # noqa: E501
        if 'audio_codecs' in params:
            query_params.append(('AudioCodecs', params['audio_codecs']))  # noqa: E501
        if 'audio_layouts' in params:
            query_params.append(('AudioLayouts', params['audio_layouts']))  # noqa: E501
        if 'video_codecs' in params:
            query_params.append(('VideoCodecs', params['video_codecs']))  # noqa: E501
        if 'extended_video_types' in params:
            query_params.append(('ExtendedVideoTypes', params['extended_video_types']))  # noqa: E501
        if 'subtitle_codecs' in params:
            query_params.append(('SubtitleCodecs', params['subtitle_codecs']))  # noqa: E501
        if 'path' in params:
            query_params.append(('Path', params['path']))  # noqa: E501
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'min_official_rating' in params:
            query_params.append(('MinOfficialRating', params['min_official_rating']))  # noqa: E501
        if 'is_locked' in params:
            query_params.append(('IsLocked', params['is_locked']))  # noqa: E501
        if 'is_place_holder' in params:
            query_params.append(('IsPlaceHolder', params['is_place_holder']))  # noqa: E501
        if 'has_official_rating' in params:
            query_params.append(('HasOfficialRating', params['has_official_rating']))  # noqa: E501
        if 'group_items_into_collections' in params:
            query_params.append(('GroupItemsIntoCollections', params['group_items_into_collections']))  # noqa: E501
        if 'is3_d' in params:
            query_params.append(('Is3D', params['is3_d']))  # noqa: E501
        if 'series_status' in params:
            query_params.append(('SeriesStatus', params['series_status']))  # noqa: E501
        if 'name_starts_with_or_greater' in params:
            query_params.append(('NameStartsWithOrGreater', params['name_starts_with_or_greater']))  # noqa: E501
        if 'artist_starts_with_or_greater' in params:
            query_params.append(('ArtistStartsWithOrGreater', params['artist_starts_with_or_greater']))  # noqa: E501
        if 'album_artist_starts_with_or_greater' in params:
            query_params.append(('AlbumArtistStartsWithOrGreater', params['album_artist_starts_with_or_greater']))  # noqa: E501
        if 'name_starts_with' in params:
            query_params.append(('NameStartsWith', params['name_starts_with']))  # noqa: E501
        if 'name_less_than' in params:
            query_params.append(('NameLessThan', params['name_less_than']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/Programs', 'GET',
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

    def get_livetv_programs_recommended(self, **kwargs):  # noqa: E501
        """Gets available live tv epgs..  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_programs_recommended(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: Optional filter by user id.
        :param int limit: Optional. The maximum number of records to return
        :param bool is_airing: Optional. Filter by programs that are currently airing, or not.
        :param bool has_aired: Optional. Filter by programs that have completed airing, or not.
        :param bool is_series: Optional filter for series.
        :param bool is_movie: Optional filter for movies.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool enable_images: Optional, include image information in output
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str genre_ids: The genres to return guide information for.
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param bool enable_user_data: Optional, include user data
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_programs_recommended_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_programs_recommended_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_programs_recommended_with_http_info(self, **kwargs):  # noqa: E501
        """Gets available live tv epgs..  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_programs_recommended_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: Optional filter by user id.
        :param int limit: Optional. The maximum number of records to return
        :param bool is_airing: Optional. Filter by programs that are currently airing, or not.
        :param bool has_aired: Optional. Filter by programs that have completed airing, or not.
        :param bool is_series: Optional filter for series.
        :param bool is_movie: Optional filter for movies.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool enable_images: Optional, include image information in output
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str genre_ids: The genres to return guide information for.
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param bool enable_user_data: Optional, include user data
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['user_id', 'limit', 'is_airing', 'has_aired', 'is_series', 'is_movie', 'is_news', 'is_kids', 'is_sports', 'enable_images', 'image_type_limit', 'enable_image_types', 'genre_ids', 'fields', 'enable_user_data']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_programs_recommended" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'is_airing' in params:
            query_params.append(('IsAiring', params['is_airing']))  # noqa: E501
        if 'has_aired' in params:
            query_params.append(('HasAired', params['has_aired']))  # noqa: E501
        if 'is_series' in params:
            query_params.append(('IsSeries', params['is_series']))  # noqa: E501
        if 'is_movie' in params:
            query_params.append(('IsMovie', params['is_movie']))  # noqa: E501
        if 'is_news' in params:
            query_params.append(('IsNews', params['is_news']))  # noqa: E501
        if 'is_kids' in params:
            query_params.append(('IsKids', params['is_kids']))  # noqa: E501
        if 'is_sports' in params:
            query_params.append(('IsSports', params['is_sports']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'genre_ids' in params:
            query_params.append(('GenreIds', params['genre_ids']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501

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
            '/LiveTv/Programs/Recommended', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultBaseItemDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_recordings(self, **kwargs):  # noqa: E501
        """Gets live tv recordings  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_recordings(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str channel_id: Optional filter by channel id.
        :param LiveTvRecordingStatus status: Optional filter by recording status.
        :param bool is_in_progress: Optional filter by recordings that are in progress, or not.
        :param str series_timer_id: Optional filter by recordings belonging to a series timer
        :param str artist_type: Artist or AlbumArtist
        :param str max_official_rating: Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
        :param bool has_theme_song: Optional filter by items with theme songs.
        :param bool has_theme_video: Optional filter by items with theme videos.
        :param bool has_subtitles: Optional filter by items with subtitles.
        :param bool has_special_feature: Optional filter by items with special features.
        :param bool has_trailer: Optional filter by items with trailers.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
        :param int min_index_number: Optional filter by minimum index number.
        :param str min_start_date: Optional. The minimum premiere date. Format = ISO
        :param str max_start_date: Optional. The maximum premiere date. Format = ISO
        :param str min_end_date: Optional. The minimum premiere date. Format = ISO
        :param str max_end_date: Optional. The maximum premiere date. Format = ISO
        :param int min_players: Optional filter by minimum number of game players.
        :param int max_players: Optional filter by maximum number of game players.
        :param int parent_index_number: Optional filter by parent index number.
        :param bool has_parental_rating: Optional filter by items that have or do not have a parental rating
        :param bool is_hd: Optional filter by items that are HD or not.
        :param bool is_unaired: Optional filter by items that are unaired episodes or not.
        :param float min_community_rating: Optional filter by minimum community rating.
        :param float min_critic_rating: Optional filter by minimum critic rating.
        :param int aired_during_season: Gets all episodes that aired during a season, including specials.
        :param str min_premiere_date: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved_for_user: Optional. The minimum premiere date. Format = ISO
        :param str max_premiere_date: Optional. The maximum premiere date. Format = ISO
        :param bool has_overview: Optional filter by items that have an overview or not.
        :param bool has_imdb_id: Optional filter by items that have an imdb id or not.
        :param bool has_tmdb_id: Optional filter by items that have a tmdb id or not.
        :param bool has_tvdb_id: Optional filter by items that have a tvdb id or not.
        :param str exclude_item_ids: Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param bool recursive: When searching within folders, this determines whether or not the search will be recursive. true/false
        :param str search_term: Enter a search term to perform a search request
        :param str sort_order: Sort Order - Ascending,Descending
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param str exclude_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str any_provider_id_equals: Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form 'prov.id', e.g. 'imdb.tt123456'. This allows multiple, comma delimeted value pairs.
        :param str filters: Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
        :param bool is_favorite: Optional filter by items that are marked as favorite, or not.
        :param bool is_movie: Optional filter for movies.
        :param bool is_series: Optional filter for series.
        :param bool is_folder: Optional filter for folders.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool is_new: Optional filter for IsNew.
        :param bool is_premiere: Optional filter for IsPremiere.
        :param bool is_new_or_premiere: Optional filter for IsNewOrPremiere.
        :param bool is_repeat: Optional filter for IsRepeat.
        :param bool project_to_media: ProjectToMedia
        :param str media_types: Optional filter by MediaType. Allows multiple, comma delimited.
        :param str image_types: Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
        :param bool is_played: Optional filter by items that are played, or not.
        :param str genres: Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
        :param str official_ratings: Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
        :param str tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str exclude_tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str years: Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str person: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_ids: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_types: Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
        :param str studios: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str studio_ids: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str artists: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str artist_ids: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str albums: Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
        :param str ids: Optional. If specific items are needed, specify a list of item id's to retrieve. This allows multiple, comma delimited.
        :param str video_types: Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
        :param str containers: Optional filter by Container. Allows multiple, comma delimeted.
        :param str audio_codecs: Optional filter by AudioCodec. Allows multiple, comma delimeted.
        :param str audio_layouts: Optional filter by AudioLayout. Allows multiple, comma delimeted.
        :param str video_codecs: Optional filter by VideoCodec. Allows multiple, comma delimeted.
        :param str extended_video_types: Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
        :param str subtitle_codecs: Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
        :param str path: Optional filter by Path.
        :param str user_id: User Id
        :param str min_official_rating: Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
        :param bool is_locked: Optional filter by items that are locked.
        :param bool is_place_holder: Optional filter by items that are placeholders
        :param bool has_official_rating: Optional filter by items that have official ratings
        :param bool group_items_into_collections: Whether or not to hide items behind their boxsets.
        :param bool is3_d: Optional filter by items that are 3D, or not.
        :param str series_status: Optional filter by Series Status. Allows multiple, comma delimeted.
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str album_artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str name_starts_with: Optional filter by items whose name is sorted equally than a given input string.
        :param str name_less_than: Optional filter by items whose name is equally or lesser than a given input string.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_recordings_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_recordings_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_recordings_with_http_info(self, **kwargs):  # noqa: E501
        """Gets live tv recordings  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_recordings_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str channel_id: Optional filter by channel id.
        :param LiveTvRecordingStatus status: Optional filter by recording status.
        :param bool is_in_progress: Optional filter by recordings that are in progress, or not.
        :param str series_timer_id: Optional filter by recordings belonging to a series timer
        :param str artist_type: Artist or AlbumArtist
        :param str max_official_rating: Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
        :param bool has_theme_song: Optional filter by items with theme songs.
        :param bool has_theme_video: Optional filter by items with theme videos.
        :param bool has_subtitles: Optional filter by items with subtitles.
        :param bool has_special_feature: Optional filter by items with special features.
        :param bool has_trailer: Optional filter by items with trailers.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
        :param int min_index_number: Optional filter by minimum index number.
        :param str min_start_date: Optional. The minimum premiere date. Format = ISO
        :param str max_start_date: Optional. The maximum premiere date. Format = ISO
        :param str min_end_date: Optional. The minimum premiere date. Format = ISO
        :param str max_end_date: Optional. The maximum premiere date. Format = ISO
        :param int min_players: Optional filter by minimum number of game players.
        :param int max_players: Optional filter by maximum number of game players.
        :param int parent_index_number: Optional filter by parent index number.
        :param bool has_parental_rating: Optional filter by items that have or do not have a parental rating
        :param bool is_hd: Optional filter by items that are HD or not.
        :param bool is_unaired: Optional filter by items that are unaired episodes or not.
        :param float min_community_rating: Optional filter by minimum community rating.
        :param float min_critic_rating: Optional filter by minimum critic rating.
        :param int aired_during_season: Gets all episodes that aired during a season, including specials.
        :param str min_premiere_date: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved_for_user: Optional. The minimum premiere date. Format = ISO
        :param str max_premiere_date: Optional. The maximum premiere date. Format = ISO
        :param bool has_overview: Optional filter by items that have an overview or not.
        :param bool has_imdb_id: Optional filter by items that have an imdb id or not.
        :param bool has_tmdb_id: Optional filter by items that have a tmdb id or not.
        :param bool has_tvdb_id: Optional filter by items that have a tvdb id or not.
        :param str exclude_item_ids: Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param bool recursive: When searching within folders, this determines whether or not the search will be recursive. true/false
        :param str search_term: Enter a search term to perform a search request
        :param str sort_order: Sort Order - Ascending,Descending
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param str exclude_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str any_provider_id_equals: Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form 'prov.id', e.g. 'imdb.tt123456'. This allows multiple, comma delimeted value pairs.
        :param str filters: Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
        :param bool is_favorite: Optional filter by items that are marked as favorite, or not.
        :param bool is_movie: Optional filter for movies.
        :param bool is_series: Optional filter for series.
        :param bool is_folder: Optional filter for folders.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool is_new: Optional filter for IsNew.
        :param bool is_premiere: Optional filter for IsPremiere.
        :param bool is_new_or_premiere: Optional filter for IsNewOrPremiere.
        :param bool is_repeat: Optional filter for IsRepeat.
        :param bool project_to_media: ProjectToMedia
        :param str media_types: Optional filter by MediaType. Allows multiple, comma delimited.
        :param str image_types: Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
        :param bool is_played: Optional filter by items that are played, or not.
        :param str genres: Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
        :param str official_ratings: Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
        :param str tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str exclude_tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str years: Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str person: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_ids: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_types: Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
        :param str studios: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str studio_ids: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str artists: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str artist_ids: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str albums: Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
        :param str ids: Optional. If specific items are needed, specify a list of item id's to retrieve. This allows multiple, comma delimited.
        :param str video_types: Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
        :param str containers: Optional filter by Container. Allows multiple, comma delimeted.
        :param str audio_codecs: Optional filter by AudioCodec. Allows multiple, comma delimeted.
        :param str audio_layouts: Optional filter by AudioLayout. Allows multiple, comma delimeted.
        :param str video_codecs: Optional filter by VideoCodec. Allows multiple, comma delimeted.
        :param str extended_video_types: Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
        :param str subtitle_codecs: Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
        :param str path: Optional filter by Path.
        :param str user_id: User Id
        :param str min_official_rating: Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
        :param bool is_locked: Optional filter by items that are locked.
        :param bool is_place_holder: Optional filter by items that are placeholders
        :param bool has_official_rating: Optional filter by items that have official ratings
        :param bool group_items_into_collections: Whether or not to hide items behind their boxsets.
        :param bool is3_d: Optional filter by items that are 3D, or not.
        :param str series_status: Optional filter by Series Status. Allows multiple, comma delimeted.
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str album_artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str name_starts_with: Optional filter by items whose name is sorted equally than a given input string.
        :param str name_less_than: Optional filter by items whose name is equally or lesser than a given input string.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['channel_id', 'status', 'is_in_progress', 'series_timer_id', 'artist_type', 'max_official_rating', 'has_theme_song', 'has_theme_video', 'has_subtitles', 'has_special_feature', 'has_trailer', 'adjacent_to', 'min_index_number', 'min_start_date', 'max_start_date', 'min_end_date', 'max_end_date', 'min_players', 'max_players', 'parent_index_number', 'has_parental_rating', 'is_hd', 'is_unaired', 'min_community_rating', 'min_critic_rating', 'aired_during_season', 'min_premiere_date', 'min_date_last_saved', 'min_date_last_saved_for_user', 'max_premiere_date', 'has_overview', 'has_imdb_id', 'has_tmdb_id', 'has_tvdb_id', 'exclude_item_ids', 'start_index', 'limit', 'recursive', 'search_term', 'sort_order', 'parent_id', 'fields', 'exclude_item_types', 'include_item_types', 'any_provider_id_equals', 'filters', 'is_favorite', 'is_movie', 'is_series', 'is_folder', 'is_news', 'is_kids', 'is_sports', 'is_new', 'is_premiere', 'is_new_or_premiere', 'is_repeat', 'project_to_media', 'media_types', 'image_types', 'sort_by', 'is_played', 'genres', 'official_ratings', 'tags', 'exclude_tags', 'years', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types', 'person', 'person_ids', 'person_types', 'studios', 'studio_ids', 'artists', 'artist_ids', 'albums', 'ids', 'video_types', 'containers', 'audio_codecs', 'audio_layouts', 'video_codecs', 'extended_video_types', 'subtitle_codecs', 'path', 'user_id', 'min_official_rating', 'is_locked', 'is_place_holder', 'has_official_rating', 'group_items_into_collections', 'is3_d', 'series_status', 'name_starts_with_or_greater', 'artist_starts_with_or_greater', 'album_artist_starts_with_or_greater', 'name_starts_with', 'name_less_than']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_recordings" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'channel_id' in params:
            query_params.append(('ChannelId', params['channel_id']))  # noqa: E501
        if 'status' in params:
            query_params.append(('Status', params['status']))  # noqa: E501
        if 'is_in_progress' in params:
            query_params.append(('IsInProgress', params['is_in_progress']))  # noqa: E501
        if 'series_timer_id' in params:
            query_params.append(('SeriesTimerId', params['series_timer_id']))  # noqa: E501
        if 'artist_type' in params:
            query_params.append(('ArtistType', params['artist_type']))  # noqa: E501
        if 'max_official_rating' in params:
            query_params.append(('MaxOfficialRating', params['max_official_rating']))  # noqa: E501
        if 'has_theme_song' in params:
            query_params.append(('HasThemeSong', params['has_theme_song']))  # noqa: E501
        if 'has_theme_video' in params:
            query_params.append(('HasThemeVideo', params['has_theme_video']))  # noqa: E501
        if 'has_subtitles' in params:
            query_params.append(('HasSubtitles', params['has_subtitles']))  # noqa: E501
        if 'has_special_feature' in params:
            query_params.append(('HasSpecialFeature', params['has_special_feature']))  # noqa: E501
        if 'has_trailer' in params:
            query_params.append(('HasTrailer', params['has_trailer']))  # noqa: E501
        if 'adjacent_to' in params:
            query_params.append(('AdjacentTo', params['adjacent_to']))  # noqa: E501
        if 'min_index_number' in params:
            query_params.append(('MinIndexNumber', params['min_index_number']))  # noqa: E501
        if 'min_start_date' in params:
            query_params.append(('MinStartDate', params['min_start_date']))  # noqa: E501
        if 'max_start_date' in params:
            query_params.append(('MaxStartDate', params['max_start_date']))  # noqa: E501
        if 'min_end_date' in params:
            query_params.append(('MinEndDate', params['min_end_date']))  # noqa: E501
        if 'max_end_date' in params:
            query_params.append(('MaxEndDate', params['max_end_date']))  # noqa: E501
        if 'min_players' in params:
            query_params.append(('MinPlayers', params['min_players']))  # noqa: E501
        if 'max_players' in params:
            query_params.append(('MaxPlayers', params['max_players']))  # noqa: E501
        if 'parent_index_number' in params:
            query_params.append(('ParentIndexNumber', params['parent_index_number']))  # noqa: E501
        if 'has_parental_rating' in params:
            query_params.append(('HasParentalRating', params['has_parental_rating']))  # noqa: E501
        if 'is_hd' in params:
            query_params.append(('IsHD', params['is_hd']))  # noqa: E501
        if 'is_unaired' in params:
            query_params.append(('IsUnaired', params['is_unaired']))  # noqa: E501
        if 'min_community_rating' in params:
            query_params.append(('MinCommunityRating', params['min_community_rating']))  # noqa: E501
        if 'min_critic_rating' in params:
            query_params.append(('MinCriticRating', params['min_critic_rating']))  # noqa: E501
        if 'aired_during_season' in params:
            query_params.append(('AiredDuringSeason', params['aired_during_season']))  # noqa: E501
        if 'min_premiere_date' in params:
            query_params.append(('MinPremiereDate', params['min_premiere_date']))  # noqa: E501
        if 'min_date_last_saved' in params:
            query_params.append(('MinDateLastSaved', params['min_date_last_saved']))  # noqa: E501
        if 'min_date_last_saved_for_user' in params:
            query_params.append(('MinDateLastSavedForUser', params['min_date_last_saved_for_user']))  # noqa: E501
        if 'max_premiere_date' in params:
            query_params.append(('MaxPremiereDate', params['max_premiere_date']))  # noqa: E501
        if 'has_overview' in params:
            query_params.append(('HasOverview', params['has_overview']))  # noqa: E501
        if 'has_imdb_id' in params:
            query_params.append(('HasImdbId', params['has_imdb_id']))  # noqa: E501
        if 'has_tmdb_id' in params:
            query_params.append(('HasTmdbId', params['has_tmdb_id']))  # noqa: E501
        if 'has_tvdb_id' in params:
            query_params.append(('HasTvdbId', params['has_tvdb_id']))  # noqa: E501
        if 'exclude_item_ids' in params:
            query_params.append(('ExcludeItemIds', params['exclude_item_ids']))  # noqa: E501
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'recursive' in params:
            query_params.append(('Recursive', params['recursive']))  # noqa: E501
        if 'search_term' in params:
            query_params.append(('SearchTerm', params['search_term']))  # noqa: E501
        if 'sort_order' in params:
            query_params.append(('SortOrder', params['sort_order']))  # noqa: E501
        if 'parent_id' in params:
            query_params.append(('ParentId', params['parent_id']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501
        if 'exclude_item_types' in params:
            query_params.append(('ExcludeItemTypes', params['exclude_item_types']))  # noqa: E501
        if 'include_item_types' in params:
            query_params.append(('IncludeItemTypes', params['include_item_types']))  # noqa: E501
        if 'any_provider_id_equals' in params:
            query_params.append(('AnyProviderIdEquals', params['any_provider_id_equals']))  # noqa: E501
        if 'filters' in params:
            query_params.append(('Filters', params['filters']))  # noqa: E501
        if 'is_favorite' in params:
            query_params.append(('IsFavorite', params['is_favorite']))  # noqa: E501
        if 'is_movie' in params:
            query_params.append(('IsMovie', params['is_movie']))  # noqa: E501
        if 'is_series' in params:
            query_params.append(('IsSeries', params['is_series']))  # noqa: E501
        if 'is_folder' in params:
            query_params.append(('IsFolder', params['is_folder']))  # noqa: E501
        if 'is_news' in params:
            query_params.append(('IsNews', params['is_news']))  # noqa: E501
        if 'is_kids' in params:
            query_params.append(('IsKids', params['is_kids']))  # noqa: E501
        if 'is_sports' in params:
            query_params.append(('IsSports', params['is_sports']))  # noqa: E501
        if 'is_new' in params:
            query_params.append(('IsNew', params['is_new']))  # noqa: E501
        if 'is_premiere' in params:
            query_params.append(('IsPremiere', params['is_premiere']))  # noqa: E501
        if 'is_new_or_premiere' in params:
            query_params.append(('IsNewOrPremiere', params['is_new_or_premiere']))  # noqa: E501
        if 'is_repeat' in params:
            query_params.append(('IsRepeat', params['is_repeat']))  # noqa: E501
        if 'project_to_media' in params:
            query_params.append(('ProjectToMedia', params['project_to_media']))  # noqa: E501
        if 'media_types' in params:
            query_params.append(('MediaTypes', params['media_types']))  # noqa: E501
        if 'image_types' in params:
            query_params.append(('ImageTypes', params['image_types']))  # noqa: E501
        if 'sort_by' in params:
            query_params.append(('SortBy', params['sort_by']))  # noqa: E501
        if 'is_played' in params:
            query_params.append(('IsPlayed', params['is_played']))  # noqa: E501
        if 'genres' in params:
            query_params.append(('Genres', params['genres']))  # noqa: E501
        if 'official_ratings' in params:
            query_params.append(('OfficialRatings', params['official_ratings']))  # noqa: E501
        if 'tags' in params:
            query_params.append(('Tags', params['tags']))  # noqa: E501
        if 'exclude_tags' in params:
            query_params.append(('ExcludeTags', params['exclude_tags']))  # noqa: E501
        if 'years' in params:
            query_params.append(('Years', params['years']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'person' in params:
            query_params.append(('Person', params['person']))  # noqa: E501
        if 'person_ids' in params:
            query_params.append(('PersonIds', params['person_ids']))  # noqa: E501
        if 'person_types' in params:
            query_params.append(('PersonTypes', params['person_types']))  # noqa: E501
        if 'studios' in params:
            query_params.append(('Studios', params['studios']))  # noqa: E501
        if 'studio_ids' in params:
            query_params.append(('StudioIds', params['studio_ids']))  # noqa: E501
        if 'artists' in params:
            query_params.append(('Artists', params['artists']))  # noqa: E501
        if 'artist_ids' in params:
            query_params.append(('ArtistIds', params['artist_ids']))  # noqa: E501
        if 'albums' in params:
            query_params.append(('Albums', params['albums']))  # noqa: E501
        if 'ids' in params:
            query_params.append(('Ids', params['ids']))  # noqa: E501
        if 'video_types' in params:
            query_params.append(('VideoTypes', params['video_types']))  # noqa: E501
        if 'containers' in params:
            query_params.append(('Containers', params['containers']))  # noqa: E501
        if 'audio_codecs' in params:
            query_params.append(('AudioCodecs', params['audio_codecs']))  # noqa: E501
        if 'audio_layouts' in params:
            query_params.append(('AudioLayouts', params['audio_layouts']))  # noqa: E501
        if 'video_codecs' in params:
            query_params.append(('VideoCodecs', params['video_codecs']))  # noqa: E501
        if 'extended_video_types' in params:
            query_params.append(('ExtendedVideoTypes', params['extended_video_types']))  # noqa: E501
        if 'subtitle_codecs' in params:
            query_params.append(('SubtitleCodecs', params['subtitle_codecs']))  # noqa: E501
        if 'path' in params:
            query_params.append(('Path', params['path']))  # noqa: E501
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'min_official_rating' in params:
            query_params.append(('MinOfficialRating', params['min_official_rating']))  # noqa: E501
        if 'is_locked' in params:
            query_params.append(('IsLocked', params['is_locked']))  # noqa: E501
        if 'is_place_holder' in params:
            query_params.append(('IsPlaceHolder', params['is_place_holder']))  # noqa: E501
        if 'has_official_rating' in params:
            query_params.append(('HasOfficialRating', params['has_official_rating']))  # noqa: E501
        if 'group_items_into_collections' in params:
            query_params.append(('GroupItemsIntoCollections', params['group_items_into_collections']))  # noqa: E501
        if 'is3_d' in params:
            query_params.append(('Is3D', params['is3_d']))  # noqa: E501
        if 'series_status' in params:
            query_params.append(('SeriesStatus', params['series_status']))  # noqa: E501
        if 'name_starts_with_or_greater' in params:
            query_params.append(('NameStartsWithOrGreater', params['name_starts_with_or_greater']))  # noqa: E501
        if 'artist_starts_with_or_greater' in params:
            query_params.append(('ArtistStartsWithOrGreater', params['artist_starts_with_or_greater']))  # noqa: E501
        if 'album_artist_starts_with_or_greater' in params:
            query_params.append(('AlbumArtistStartsWithOrGreater', params['album_artist_starts_with_or_greater']))  # noqa: E501
        if 'name_starts_with' in params:
            query_params.append(('NameStartsWith', params['name_starts_with']))  # noqa: E501
        if 'name_less_than' in params:
            query_params.append(('NameLessThan', params['name_less_than']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/Recordings', 'GET',
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

    def get_livetv_recordings_by_id(self, id, **kwargs):  # noqa: E501
        """Gets a live tv recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_recordings_by_id(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Recording Id (required)
        :param str user_id: Optional attach user data.
        :return: BaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_recordings_by_id_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_recordings_by_id_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_livetv_recordings_by_id_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a live tv recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_recordings_by_id_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Recording Id (required)
        :param str user_id: Optional attach user data.
        :return: BaseItemDto
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
                    " to method get_livetv_recordings_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_livetv_recordings_by_id`")  # noqa: E501

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
            '/LiveTv/Recordings/{Id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='BaseItemDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_recordings_folders(self, **kwargs):  # noqa: E501
        """Gets recording folders  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_recordings_folders(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: Optional filter by user and attach user data.
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :param bool enable_images: Optional, include image information in output
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param bool enable_user_data: Optional, include user data
        :return: list[BaseItemDto]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_recordings_folders_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_recordings_folders_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_recordings_folders_with_http_info(self, **kwargs):  # noqa: E501
        """Gets recording folders  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_recordings_folders_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: Optional filter by user and attach user data.
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :param bool enable_images: Optional, include image information in output
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param bool enable_user_data: Optional, include user data
        :return: list[BaseItemDto]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['user_id', 'fields', 'enable_images', 'image_type_limit', 'enable_image_types', 'enable_user_data']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_recordings_folders" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501

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
            '/LiveTv/Recordings/Folders', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[BaseItemDto]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_recordings_groups(self, **kwargs):  # noqa: E501
        """Gets live tv recording groups  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_recordings_groups(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_recordings_groups_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_recordings_groups_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_recordings_groups_with_http_info(self, **kwargs):  # noqa: E501
        """Gets live tv recording groups  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_recordings_groups_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: QueryResultBaseItemDto
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
                    " to method get_livetv_recordings_groups" % key
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
            '/LiveTv/Recordings/Groups', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultBaseItemDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_recordings_series(self, **kwargs):  # noqa: E501
        """Gets live tv recordings  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_recordings_series(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_recordings_series_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_recordings_series_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_recordings_series_with_http_info(self, **kwargs):  # noqa: E501
        """Gets live tv recordings  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_recordings_series_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: QueryResultBaseItemDto
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
                    " to method get_livetv_recordings_series" % key
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
            '/LiveTv/Recordings/Series', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultBaseItemDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_seriestimers(self, **kwargs):  # noqa: E501
        """Gets live tv series timers  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_seriestimers(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str sort_by: Optional. Sort by SortName or Priority
        :param SortOrder sort_order: Optional. Sort in Ascending or Descending order
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :return: QueryResultLiveTvSeriesTimerInfoDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_seriestimers_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_seriestimers_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_seriestimers_with_http_info(self, **kwargs):  # noqa: E501
        """Gets live tv series timers  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_seriestimers_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str sort_by: Optional. Sort by SortName or Priority
        :param SortOrder sort_order: Optional. Sort in Ascending or Descending order
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :return: QueryResultLiveTvSeriesTimerInfoDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['sort_by', 'sort_order', 'start_index', 'limit']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_seriestimers" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'sort_by' in params:
            query_params.append(('SortBy', params['sort_by']))  # noqa: E501
        if 'sort_order' in params:
            query_params.append(('SortOrder', params['sort_order']))  # noqa: E501
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501

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
            '/LiveTv/SeriesTimers', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultLiveTvSeriesTimerInfoDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_seriestimers_by_id(self, id, **kwargs):  # noqa: E501
        """Gets a live tv series timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_seriestimers_by_id(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Timer Id (required)
        :return: LiveTvTimerInfoDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_seriestimers_by_id_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_seriestimers_by_id_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_livetv_seriestimers_by_id_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a live tv series timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_seriestimers_by_id_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Timer Id (required)
        :return: LiveTvTimerInfoDto
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
                    " to method get_livetv_seriestimers_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_livetv_seriestimers_by_id`")  # noqa: E501

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
            '/LiveTv/SeriesTimers/{Id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='LiveTvTimerInfoDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_timers(self, **kwargs):  # noqa: E501
        """Gets live tv timers  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_timers(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str channel_id: Optional filter by channel id.
        :param str series_timer_id: Optional filter by timers belonging to a series timer
        :return: QueryResultLiveTvTimerInfoDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_timers_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_timers_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_timers_with_http_info(self, **kwargs):  # noqa: E501
        """Gets live tv timers  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_timers_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str channel_id: Optional filter by channel id.
        :param str series_timer_id: Optional filter by timers belonging to a series timer
        :return: QueryResultLiveTvTimerInfoDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['channel_id', 'series_timer_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_timers" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'channel_id' in params:
            query_params.append(('ChannelId', params['channel_id']))  # noqa: E501
        if 'series_timer_id' in params:
            query_params.append(('SeriesTimerId', params['series_timer_id']))  # noqa: E501

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
            '/LiveTv/Timers', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultLiveTvTimerInfoDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_timers_by_id(self, id, **kwargs):  # noqa: E501
        """Gets a live tv timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_timers_by_id(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Timer Id (required)
        :return: LiveTvTimerInfoDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_timers_by_id_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_timers_by_id_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_livetv_timers_by_id_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets a live tv timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_timers_by_id_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Timer Id (required)
        :return: LiveTvTimerInfoDto
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
                    " to method get_livetv_timers_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_livetv_timers_by_id`")  # noqa: E501

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
            '/LiveTv/Timers/{Id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='LiveTvTimerInfoDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_timers_defaults(self, **kwargs):  # noqa: E501
        """Gets default values for a new timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_timers_defaults(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str program_id: Optional, to attach default values based on a program.
        :return: LiveTvSeriesTimerInfoDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_timers_defaults_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_timers_defaults_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_timers_defaults_with_http_info(self, **kwargs):  # noqa: E501
        """Gets default values for a new timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_timers_defaults_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str program_id: Optional, to attach default values based on a program.
        :return: LiveTvSeriesTimerInfoDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['program_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_timers_defaults" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'program_id' in params:
            query_params.append(('ProgramId', params['program_id']))  # noqa: E501

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
            '/LiveTv/Timers/Defaults', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='LiveTvSeriesTimerInfoDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_tunerhosts(self, **kwargs):  # noqa: E501
        """Gets tuner hosts  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_tunerhosts(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[LiveTvTunerHostInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_tunerhosts_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_tunerhosts_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_tunerhosts_with_http_info(self, **kwargs):  # noqa: E501
        """Gets tuner hosts  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_tunerhosts_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[LiveTvTunerHostInfo]
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
                    " to method get_livetv_tunerhosts" % key
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
            '/LiveTv/TunerHosts', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[LiveTvTunerHostInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_tunerhosts_default_by_type(self, type, **kwargs):  # noqa: E501
        """Gets tuner hosts  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_tunerhosts_default_by_type(type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str type: Type (required)
        :return: LiveTvTunerHostInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_tunerhosts_default_by_type_with_http_info(type, **kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_tunerhosts_default_by_type_with_http_info(type, **kwargs)  # noqa: E501
            return data

    def get_livetv_tunerhosts_default_by_type_with_http_info(self, type, **kwargs):  # noqa: E501
        """Gets tuner hosts  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_tunerhosts_default_by_type_with_http_info(type, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str type: Type (required)
        :return: LiveTvTunerHostInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_livetv_tunerhosts_default_by_type" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'type' is set
        if ('type' not in params or
                params['type'] is None):
            raise ValueError("Missing the required parameter `type` when calling `get_livetv_tunerhosts_default_by_type`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'type' in params:
            path_params['Type'] = params['type']  # noqa: E501

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
            '/LiveTv/TunerHosts/Default/{Type}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='LiveTvTunerHostInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_tunerhosts_types(self, **kwargs):  # noqa: E501
        """get_livetv_tunerhosts_types  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_tunerhosts_types(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[NameIdPair]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_tunerhosts_types_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_tunerhosts_types_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_tunerhosts_types_with_http_info(self, **kwargs):  # noqa: E501
        """get_livetv_tunerhosts_types  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_tunerhosts_types_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[NameIdPair]
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
                    " to method get_livetv_tunerhosts_types" % key
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
            '/LiveTv/TunerHosts/Types', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[NameIdPair]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_tuners_discover(self, **kwargs):  # noqa: E501
        """get_livetv_tuners_discover  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_tuners_discover(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[LiveTvTunerHostInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_tuners_discover_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_tuners_discover_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_tuners_discover_with_http_info(self, **kwargs):  # noqa: E501
        """get_livetv_tuners_discover  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_tuners_discover_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[LiveTvTunerHostInfo]
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
                    " to method get_livetv_tuners_discover" % key
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
            '/LiveTv/Tuners/Discover', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[LiveTvTunerHostInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_livetv_tuners_discvover(self, **kwargs):  # noqa: E501
        """get_livetv_tuners_discvover  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_tuners_discvover(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[LiveTvTunerHostInfo]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_livetv_tuners_discvover_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_livetv_tuners_discvover_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_livetv_tuners_discvover_with_http_info(self, **kwargs):  # noqa: E501
        """get_livetv_tuners_discvover  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_livetv_tuners_discvover_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[LiveTvTunerHostInfo]
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
                    " to method get_livetv_tuners_discvover" % key
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
            '/LiveTv/Tuners/Discvover', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[LiveTvTunerHostInfo]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def head_livetv_channelmappingoptions(self, provider_id, **kwargs):  # noqa: E501
        """head_livetv_channelmappingoptions  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_channelmappingoptions(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_livetv_channelmappingoptions_with_http_info(provider_id, **kwargs)  # noqa: E501
        else:
            (data) = self.head_livetv_channelmappingoptions_with_http_info(provider_id, **kwargs)  # noqa: E501
            return data

    def head_livetv_channelmappingoptions_with_http_info(self, provider_id, **kwargs):  # noqa: E501
        """head_livetv_channelmappingoptions  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_channelmappingoptions_with_http_info(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['provider_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_livetv_channelmappingoptions" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'provider_id' is set
        if ('provider_id' not in params or
                params['provider_id'] is None):
            raise ValueError("Missing the required parameter `provider_id` when calling `head_livetv_channelmappingoptions`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'provider_id' in params:
            query_params.append(('ProviderId', params['provider_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/ChannelMappingOptions', 'HEAD',
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

    def head_livetv_channelmappings(self, provider_id, **kwargs):  # noqa: E501
        """head_livetv_channelmappings  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_channelmappings(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.head_livetv_channelmappings_with_http_info(provider_id, **kwargs)  # noqa: E501
        else:
            (data) = self.head_livetv_channelmappings_with_http_info(provider_id, **kwargs)  # noqa: E501
            return data

    def head_livetv_channelmappings_with_http_info(self, provider_id, **kwargs):  # noqa: E501
        """head_livetv_channelmappings  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.head_livetv_channelmappings_with_http_info(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['provider_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method head_livetv_channelmappings" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'provider_id' is set
        if ('provider_id' not in params or
                params['provider_id'] is None):
            raise ValueError("Missing the required parameter `provider_id` when calling `head_livetv_channelmappings`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'provider_id' in params:
            query_params.append(('ProviderId', params['provider_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/ChannelMappings', 'HEAD',
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

    def post_livetv_channelmappingoptions(self, provider_id, **kwargs):  # noqa: E501
        """post_livetv_channelmappingoptions  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_channelmappingoptions(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_channelmappingoptions_with_http_info(provider_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_channelmappingoptions_with_http_info(provider_id, **kwargs)  # noqa: E501
            return data

    def post_livetv_channelmappingoptions_with_http_info(self, provider_id, **kwargs):  # noqa: E501
        """post_livetv_channelmappingoptions  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_channelmappingoptions_with_http_info(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['provider_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_livetv_channelmappingoptions" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'provider_id' is set
        if ('provider_id' not in params or
                params['provider_id'] is None):
            raise ValueError("Missing the required parameter `provider_id` when calling `post_livetv_channelmappingoptions`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'provider_id' in params:
            query_params.append(('ProviderId', params['provider_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/ChannelMappingOptions', 'POST',
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

    def post_livetv_channelmappings(self, body, provider_id, **kwargs):  # noqa: E501
        """post_livetv_channelmappings  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_channelmappings(body, provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ApiSetChannelMapping body: SetChannelMapping (required)
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_channelmappings_with_http_info(body, provider_id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_channelmappings_with_http_info(body, provider_id, **kwargs)  # noqa: E501
            return data

    def post_livetv_channelmappings_with_http_info(self, body, provider_id, **kwargs):  # noqa: E501
        """post_livetv_channelmappings  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_channelmappings_with_http_info(body, provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ApiSetChannelMapping body: SetChannelMapping (required)
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'provider_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_livetv_channelmappings" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_livetv_channelmappings`")  # noqa: E501
        # verify the required parameter 'provider_id' is set
        if ('provider_id' not in params or
                params['provider_id'] is None):
            raise ValueError("Missing the required parameter `provider_id` when calling `post_livetv_channelmappings`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'provider_id' in params:
            query_params.append(('ProviderId', params['provider_id']))  # noqa: E501

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
            '/LiveTv/ChannelMappings', 'POST',
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

    def post_livetv_listingproviders(self, body, **kwargs):  # noqa: E501
        """Adds a listing provider  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_listingproviders(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvListingsProviderInfo body: ListingsProviderInfo:  (required)
        :return: LiveTvListingsProviderInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_listingproviders_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_listingproviders_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_livetv_listingproviders_with_http_info(self, body, **kwargs):  # noqa: E501
        """Adds a listing provider  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_listingproviders_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvListingsProviderInfo body: ListingsProviderInfo:  (required)
        :return: LiveTvListingsProviderInfo
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
                    " to method post_livetv_listingproviders" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_livetv_listingproviders`")  # noqa: E501

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
            '/LiveTv/ListingProviders', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='LiveTvListingsProviderInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_livetv_listingproviders_delete(self, **kwargs):  # noqa: E501
        """Deletes a listing provider  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_listingproviders_delete(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Provider id
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_listingproviders_delete_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_listingproviders_delete_with_http_info(**kwargs)  # noqa: E501
            return data

    def post_livetv_listingproviders_delete_with_http_info(self, **kwargs):  # noqa: E501
        """Deletes a listing provider  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_listingproviders_delete_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Provider id
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
                    " to method post_livetv_listingproviders_delete" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'id' in params:
            query_params.append(('Id', params['id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/ListingProviders/Delete', 'POST',
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

    def post_livetv_manage_channels_by_id_disabled(self, body, id, **kwargs):  # noqa: E501
        """Sets a channel disabled or not  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_manage_channels_by_id_disabled(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ApiSetChannelDisabled body: SetChannelDisabled (required)
        :param str id: (required)
        :return: QueryResultChannelManagementInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_manage_channels_by_id_disabled_with_http_info(body, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_manage_channels_by_id_disabled_with_http_info(body, id, **kwargs)  # noqa: E501
            return data

    def post_livetv_manage_channels_by_id_disabled_with_http_info(self, body, id, **kwargs):  # noqa: E501
        """Sets a channel disabled or not  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_manage_channels_by_id_disabled_with_http_info(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ApiSetChannelDisabled body: SetChannelDisabled (required)
        :param str id: (required)
        :return: QueryResultChannelManagementInfo
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
                    " to method post_livetv_manage_channels_by_id_disabled" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_livetv_manage_channels_by_id_disabled`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_livetv_manage_channels_by_id_disabled`")  # noqa: E501

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
            '/LiveTv/Manage/Channels/{Id}/Disabled', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultChannelManagementInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_livetv_manage_channels_by_id_sortindex(self, body, id, **kwargs):  # noqa: E501
        """Sets a channel sort index  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_manage_channels_by_id_sortindex(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ApiSetChannelSortIndex body: SetChannelSortIndex (required)
        :param str id: (required)
        :return: QueryResultChannelManagementInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_manage_channels_by_id_sortindex_with_http_info(body, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_manage_channels_by_id_sortindex_with_http_info(body, id, **kwargs)  # noqa: E501
            return data

    def post_livetv_manage_channels_by_id_sortindex_with_http_info(self, body, id, **kwargs):  # noqa: E501
        """Sets a channel sort index  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_manage_channels_by_id_sortindex_with_http_info(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ApiSetChannelSortIndex body: SetChannelSortIndex (required)
        :param str id: (required)
        :return: QueryResultChannelManagementInfo
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
                    " to method post_livetv_manage_channels_by_id_sortindex" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_livetv_manage_channels_by_id_sortindex`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_livetv_manage_channels_by_id_sortindex`")  # noqa: E501

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
            '/LiveTv/Manage/Channels/{Id}/SortIndex', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='QueryResultChannelManagementInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_livetv_programs(self, body, **kwargs):  # noqa: E501
        """Gets available live tv epgs..  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_programs(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ApiBaseItemsRequest body: BaseItemsRequest:  (required)
        :param str channel_ids: The channels to return guide information for.
        :param str artist_type: Artist or AlbumArtist
        :param str max_official_rating: Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
        :param bool has_theme_song: Optional filter by items with theme songs.
        :param bool has_theme_video: Optional filter by items with theme videos.
        :param bool has_subtitles: Optional filter by items with subtitles.
        :param bool has_special_feature: Optional filter by items with special features.
        :param bool has_trailer: Optional filter by items with trailers.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
        :param int min_index_number: Optional filter by minimum index number.
        :param str min_start_date: Optional. The minimum premiere date. Format = ISO
        :param str max_start_date: Optional. The maximum premiere date. Format = ISO
        :param str min_end_date: Optional. The minimum premiere date. Format = ISO
        :param str max_end_date: Optional. The maximum premiere date. Format = ISO
        :param int min_players: Optional filter by minimum number of game players.
        :param int max_players: Optional filter by maximum number of game players.
        :param int parent_index_number: Optional filter by parent index number.
        :param bool has_parental_rating: Optional filter by items that have or do not have a parental rating
        :param bool is_hd: Optional filter by items that are HD or not.
        :param bool is_unaired: Optional filter by items that are unaired episodes or not.
        :param float min_community_rating: Optional filter by minimum community rating.
        :param float min_critic_rating: Optional filter by minimum critic rating.
        :param int aired_during_season: Gets all episodes that aired during a season, including specials.
        :param str min_premiere_date: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved_for_user: Optional. The minimum premiere date. Format = ISO
        :param str max_premiere_date: Optional. The maximum premiere date. Format = ISO
        :param bool has_overview: Optional filter by items that have an overview or not.
        :param bool has_imdb_id: Optional filter by items that have an imdb id or not.
        :param bool has_tmdb_id: Optional filter by items that have a tmdb id or not.
        :param bool has_tvdb_id: Optional filter by items that have a tvdb id or not.
        :param str exclude_item_ids: Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param bool recursive: When searching within folders, this determines whether or not the search will be recursive. true/false
        :param str search_term: Enter a search term to perform a search request
        :param str sort_order: Sort Order - Ascending,Descending
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param str exclude_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str any_provider_id_equals: Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form 'prov.id', e.g. 'imdb.tt123456'. This allows multiple, comma delimeted value pairs.
        :param str filters: Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
        :param bool is_favorite: Optional filter by items that are marked as favorite, or not.
        :param bool is_movie: Optional filter for movies.
        :param bool is_series: Optional filter for series.
        :param bool is_folder: Optional filter for folders.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool is_new: Optional filter for IsNew.
        :param bool is_premiere: Optional filter for IsPremiere.
        :param bool is_new_or_premiere: Optional filter for IsNewOrPremiere.
        :param bool is_repeat: Optional filter for IsRepeat.
        :param bool project_to_media: ProjectToMedia
        :param str media_types: Optional filter by MediaType. Allows multiple, comma delimited.
        :param str image_types: Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
        :param bool is_played: Optional filter by items that are played, or not.
        :param str genres: Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
        :param str official_ratings: Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
        :param str tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str exclude_tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str years: Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str person: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_ids: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_types: Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
        :param str studios: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str studio_ids: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str artists: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str artist_ids: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str albums: Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
        :param str ids: Optional. If specific items are needed, specify a list of item id's to retrieve. This allows multiple, comma delimited.
        :param str video_types: Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
        :param str containers: Optional filter by Container. Allows multiple, comma delimeted.
        :param str audio_codecs: Optional filter by AudioCodec. Allows multiple, comma delimeted.
        :param str audio_layouts: Optional filter by AudioLayout. Allows multiple, comma delimeted.
        :param str video_codecs: Optional filter by VideoCodec. Allows multiple, comma delimeted.
        :param str extended_video_types: Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
        :param str subtitle_codecs: Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
        :param str path: Optional filter by Path.
        :param str user_id: User Id
        :param str min_official_rating: Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
        :param bool is_locked: Optional filter by items that are locked.
        :param bool is_place_holder: Optional filter by items that are placeholders
        :param bool has_official_rating: Optional filter by items that have official ratings
        :param bool group_items_into_collections: Whether or not to hide items behind their boxsets.
        :param bool is3_d: Optional filter by items that are 3D, or not.
        :param str series_status: Optional filter by Series Status. Allows multiple, comma delimeted.
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str album_artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str name_starts_with: Optional filter by items whose name is sorted equally than a given input string.
        :param str name_less_than: Optional filter by items whose name is equally or lesser than a given input string.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_programs_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_programs_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_livetv_programs_with_http_info(self, body, **kwargs):  # noqa: E501
        """Gets available live tv epgs..  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_programs_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ApiBaseItemsRequest body: BaseItemsRequest:  (required)
        :param str channel_ids: The channels to return guide information for.
        :param str artist_type: Artist or AlbumArtist
        :param str max_official_rating: Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
        :param bool has_theme_song: Optional filter by items with theme songs.
        :param bool has_theme_video: Optional filter by items with theme videos.
        :param bool has_subtitles: Optional filter by items with subtitles.
        :param bool has_special_feature: Optional filter by items with special features.
        :param bool has_trailer: Optional filter by items with trailers.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
        :param int min_index_number: Optional filter by minimum index number.
        :param str min_start_date: Optional. The minimum premiere date. Format = ISO
        :param str max_start_date: Optional. The maximum premiere date. Format = ISO
        :param str min_end_date: Optional. The minimum premiere date. Format = ISO
        :param str max_end_date: Optional. The maximum premiere date. Format = ISO
        :param int min_players: Optional filter by minimum number of game players.
        :param int max_players: Optional filter by maximum number of game players.
        :param int parent_index_number: Optional filter by parent index number.
        :param bool has_parental_rating: Optional filter by items that have or do not have a parental rating
        :param bool is_hd: Optional filter by items that are HD or not.
        :param bool is_unaired: Optional filter by items that are unaired episodes or not.
        :param float min_community_rating: Optional filter by minimum community rating.
        :param float min_critic_rating: Optional filter by minimum critic rating.
        :param int aired_during_season: Gets all episodes that aired during a season, including specials.
        :param str min_premiere_date: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved: Optional. The minimum premiere date. Format = ISO
        :param str min_date_last_saved_for_user: Optional. The minimum premiere date. Format = ISO
        :param str max_premiere_date: Optional. The maximum premiere date. Format = ISO
        :param bool has_overview: Optional filter by items that have an overview or not.
        :param bool has_imdb_id: Optional filter by items that have an imdb id or not.
        :param bool has_tmdb_id: Optional filter by items that have a tmdb id or not.
        :param bool has_tvdb_id: Optional filter by items that have a tvdb id or not.
        :param str exclude_item_ids: Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param bool recursive: When searching within folders, this determines whether or not the search will be recursive. true/false
        :param str search_term: Enter a search term to perform a search request
        :param str sort_order: Sort Order - Ascending,Descending
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
        :param str exclude_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
        :param str any_provider_id_equals: Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form 'prov.id', e.g. 'imdb.tt123456'. This allows multiple, comma delimeted value pairs.
        :param str filters: Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
        :param bool is_favorite: Optional filter by items that are marked as favorite, or not.
        :param bool is_movie: Optional filter for movies.
        :param bool is_series: Optional filter for series.
        :param bool is_folder: Optional filter for folders.
        :param bool is_news: Optional filter for news.
        :param bool is_kids: Optional filter for kids.
        :param bool is_sports: Optional filter for sports.
        :param bool is_new: Optional filter for IsNew.
        :param bool is_premiere: Optional filter for IsPremiere.
        :param bool is_new_or_premiere: Optional filter for IsNewOrPremiere.
        :param bool is_repeat: Optional filter for IsRepeat.
        :param bool project_to_media: ProjectToMedia
        :param str media_types: Optional filter by MediaType. Allows multiple, comma delimited.
        :param str image_types: Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
        :param str sort_by: Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
        :param bool is_played: Optional filter by items that are played, or not.
        :param str genres: Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
        :param str official_ratings: Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
        :param str tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str exclude_tags: Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
        :param str years: Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
        :param bool enable_images: Optional, include image information in output
        :param bool enable_user_data: Optional, include user data
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param str person: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_ids: Optional. If specified, results will be filtered to include only those containing the specified person.
        :param str person_types: Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
        :param str studios: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str studio_ids: Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
        :param str artists: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str artist_ids: Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
        :param str albums: Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
        :param str ids: Optional. If specific items are needed, specify a list of item id's to retrieve. This allows multiple, comma delimited.
        :param str video_types: Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
        :param str containers: Optional filter by Container. Allows multiple, comma delimeted.
        :param str audio_codecs: Optional filter by AudioCodec. Allows multiple, comma delimeted.
        :param str audio_layouts: Optional filter by AudioLayout. Allows multiple, comma delimeted.
        :param str video_codecs: Optional filter by VideoCodec. Allows multiple, comma delimeted.
        :param str extended_video_types: Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
        :param str subtitle_codecs: Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
        :param str path: Optional filter by Path.
        :param str user_id: User Id
        :param str min_official_rating: Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
        :param bool is_locked: Optional filter by items that are locked.
        :param bool is_place_holder: Optional filter by items that are placeholders
        :param bool has_official_rating: Optional filter by items that have official ratings
        :param bool group_items_into_collections: Whether or not to hide items behind their boxsets.
        :param bool is3_d: Optional filter by items that are 3D, or not.
        :param str series_status: Optional filter by Series Status. Allows multiple, comma delimeted.
        :param str name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str album_artist_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
        :param str name_starts_with: Optional filter by items whose name is sorted equally than a given input string.
        :param str name_less_than: Optional filter by items whose name is equally or lesser than a given input string.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'channel_ids', 'artist_type', 'max_official_rating', 'has_theme_song', 'has_theme_video', 'has_subtitles', 'has_special_feature', 'has_trailer', 'adjacent_to', 'min_index_number', 'min_start_date', 'max_start_date', 'min_end_date', 'max_end_date', 'min_players', 'max_players', 'parent_index_number', 'has_parental_rating', 'is_hd', 'is_unaired', 'min_community_rating', 'min_critic_rating', 'aired_during_season', 'min_premiere_date', 'min_date_last_saved', 'min_date_last_saved_for_user', 'max_premiere_date', 'has_overview', 'has_imdb_id', 'has_tmdb_id', 'has_tvdb_id', 'exclude_item_ids', 'start_index', 'limit', 'recursive', 'search_term', 'sort_order', 'parent_id', 'fields', 'exclude_item_types', 'include_item_types', 'any_provider_id_equals', 'filters', 'is_favorite', 'is_movie', 'is_series', 'is_folder', 'is_news', 'is_kids', 'is_sports', 'is_new', 'is_premiere', 'is_new_or_premiere', 'is_repeat', 'project_to_media', 'media_types', 'image_types', 'sort_by', 'is_played', 'genres', 'official_ratings', 'tags', 'exclude_tags', 'years', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types', 'person', 'person_ids', 'person_types', 'studios', 'studio_ids', 'artists', 'artist_ids', 'albums', 'ids', 'video_types', 'containers', 'audio_codecs', 'audio_layouts', 'video_codecs', 'extended_video_types', 'subtitle_codecs', 'path', 'user_id', 'min_official_rating', 'is_locked', 'is_place_holder', 'has_official_rating', 'group_items_into_collections', 'is3_d', 'series_status', 'name_starts_with_or_greater', 'artist_starts_with_or_greater', 'album_artist_starts_with_or_greater', 'name_starts_with', 'name_less_than']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method post_livetv_programs" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_livetv_programs`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'channel_ids' in params:
            query_params.append(('ChannelIds', params['channel_ids']))  # noqa: E501
        if 'artist_type' in params:
            query_params.append(('ArtistType', params['artist_type']))  # noqa: E501
        if 'max_official_rating' in params:
            query_params.append(('MaxOfficialRating', params['max_official_rating']))  # noqa: E501
        if 'has_theme_song' in params:
            query_params.append(('HasThemeSong', params['has_theme_song']))  # noqa: E501
        if 'has_theme_video' in params:
            query_params.append(('HasThemeVideo', params['has_theme_video']))  # noqa: E501
        if 'has_subtitles' in params:
            query_params.append(('HasSubtitles', params['has_subtitles']))  # noqa: E501
        if 'has_special_feature' in params:
            query_params.append(('HasSpecialFeature', params['has_special_feature']))  # noqa: E501
        if 'has_trailer' in params:
            query_params.append(('HasTrailer', params['has_trailer']))  # noqa: E501
        if 'adjacent_to' in params:
            query_params.append(('AdjacentTo', params['adjacent_to']))  # noqa: E501
        if 'min_index_number' in params:
            query_params.append(('MinIndexNumber', params['min_index_number']))  # noqa: E501
        if 'min_start_date' in params:
            query_params.append(('MinStartDate', params['min_start_date']))  # noqa: E501
        if 'max_start_date' in params:
            query_params.append(('MaxStartDate', params['max_start_date']))  # noqa: E501
        if 'min_end_date' in params:
            query_params.append(('MinEndDate', params['min_end_date']))  # noqa: E501
        if 'max_end_date' in params:
            query_params.append(('MaxEndDate', params['max_end_date']))  # noqa: E501
        if 'min_players' in params:
            query_params.append(('MinPlayers', params['min_players']))  # noqa: E501
        if 'max_players' in params:
            query_params.append(('MaxPlayers', params['max_players']))  # noqa: E501
        if 'parent_index_number' in params:
            query_params.append(('ParentIndexNumber', params['parent_index_number']))  # noqa: E501
        if 'has_parental_rating' in params:
            query_params.append(('HasParentalRating', params['has_parental_rating']))  # noqa: E501
        if 'is_hd' in params:
            query_params.append(('IsHD', params['is_hd']))  # noqa: E501
        if 'is_unaired' in params:
            query_params.append(('IsUnaired', params['is_unaired']))  # noqa: E501
        if 'min_community_rating' in params:
            query_params.append(('MinCommunityRating', params['min_community_rating']))  # noqa: E501
        if 'min_critic_rating' in params:
            query_params.append(('MinCriticRating', params['min_critic_rating']))  # noqa: E501
        if 'aired_during_season' in params:
            query_params.append(('AiredDuringSeason', params['aired_during_season']))  # noqa: E501
        if 'min_premiere_date' in params:
            query_params.append(('MinPremiereDate', params['min_premiere_date']))  # noqa: E501
        if 'min_date_last_saved' in params:
            query_params.append(('MinDateLastSaved', params['min_date_last_saved']))  # noqa: E501
        if 'min_date_last_saved_for_user' in params:
            query_params.append(('MinDateLastSavedForUser', params['min_date_last_saved_for_user']))  # noqa: E501
        if 'max_premiere_date' in params:
            query_params.append(('MaxPremiereDate', params['max_premiere_date']))  # noqa: E501
        if 'has_overview' in params:
            query_params.append(('HasOverview', params['has_overview']))  # noqa: E501
        if 'has_imdb_id' in params:
            query_params.append(('HasImdbId', params['has_imdb_id']))  # noqa: E501
        if 'has_tmdb_id' in params:
            query_params.append(('HasTmdbId', params['has_tmdb_id']))  # noqa: E501
        if 'has_tvdb_id' in params:
            query_params.append(('HasTvdbId', params['has_tvdb_id']))  # noqa: E501
        if 'exclude_item_ids' in params:
            query_params.append(('ExcludeItemIds', params['exclude_item_ids']))  # noqa: E501
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'recursive' in params:
            query_params.append(('Recursive', params['recursive']))  # noqa: E501
        if 'search_term' in params:
            query_params.append(('SearchTerm', params['search_term']))  # noqa: E501
        if 'sort_order' in params:
            query_params.append(('SortOrder', params['sort_order']))  # noqa: E501
        if 'parent_id' in params:
            query_params.append(('ParentId', params['parent_id']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501
        if 'exclude_item_types' in params:
            query_params.append(('ExcludeItemTypes', params['exclude_item_types']))  # noqa: E501
        if 'include_item_types' in params:
            query_params.append(('IncludeItemTypes', params['include_item_types']))  # noqa: E501
        if 'any_provider_id_equals' in params:
            query_params.append(('AnyProviderIdEquals', params['any_provider_id_equals']))  # noqa: E501
        if 'filters' in params:
            query_params.append(('Filters', params['filters']))  # noqa: E501
        if 'is_favorite' in params:
            query_params.append(('IsFavorite', params['is_favorite']))  # noqa: E501
        if 'is_movie' in params:
            query_params.append(('IsMovie', params['is_movie']))  # noqa: E501
        if 'is_series' in params:
            query_params.append(('IsSeries', params['is_series']))  # noqa: E501
        if 'is_folder' in params:
            query_params.append(('IsFolder', params['is_folder']))  # noqa: E501
        if 'is_news' in params:
            query_params.append(('IsNews', params['is_news']))  # noqa: E501
        if 'is_kids' in params:
            query_params.append(('IsKids', params['is_kids']))  # noqa: E501
        if 'is_sports' in params:
            query_params.append(('IsSports', params['is_sports']))  # noqa: E501
        if 'is_new' in params:
            query_params.append(('IsNew', params['is_new']))  # noqa: E501
        if 'is_premiere' in params:
            query_params.append(('IsPremiere', params['is_premiere']))  # noqa: E501
        if 'is_new_or_premiere' in params:
            query_params.append(('IsNewOrPremiere', params['is_new_or_premiere']))  # noqa: E501
        if 'is_repeat' in params:
            query_params.append(('IsRepeat', params['is_repeat']))  # noqa: E501
        if 'project_to_media' in params:
            query_params.append(('ProjectToMedia', params['project_to_media']))  # noqa: E501
        if 'media_types' in params:
            query_params.append(('MediaTypes', params['media_types']))  # noqa: E501
        if 'image_types' in params:
            query_params.append(('ImageTypes', params['image_types']))  # noqa: E501
        if 'sort_by' in params:
            query_params.append(('SortBy', params['sort_by']))  # noqa: E501
        if 'is_played' in params:
            query_params.append(('IsPlayed', params['is_played']))  # noqa: E501
        if 'genres' in params:
            query_params.append(('Genres', params['genres']))  # noqa: E501
        if 'official_ratings' in params:
            query_params.append(('OfficialRatings', params['official_ratings']))  # noqa: E501
        if 'tags' in params:
            query_params.append(('Tags', params['tags']))  # noqa: E501
        if 'exclude_tags' in params:
            query_params.append(('ExcludeTags', params['exclude_tags']))  # noqa: E501
        if 'years' in params:
            query_params.append(('Years', params['years']))  # noqa: E501
        if 'enable_images' in params:
            query_params.append(('EnableImages', params['enable_images']))  # noqa: E501
        if 'enable_user_data' in params:
            query_params.append(('EnableUserData', params['enable_user_data']))  # noqa: E501
        if 'image_type_limit' in params:
            query_params.append(('ImageTypeLimit', params['image_type_limit']))  # noqa: E501
        if 'enable_image_types' in params:
            query_params.append(('EnableImageTypes', params['enable_image_types']))  # noqa: E501
        if 'person' in params:
            query_params.append(('Person', params['person']))  # noqa: E501
        if 'person_ids' in params:
            query_params.append(('PersonIds', params['person_ids']))  # noqa: E501
        if 'person_types' in params:
            query_params.append(('PersonTypes', params['person_types']))  # noqa: E501
        if 'studios' in params:
            query_params.append(('Studios', params['studios']))  # noqa: E501
        if 'studio_ids' in params:
            query_params.append(('StudioIds', params['studio_ids']))  # noqa: E501
        if 'artists' in params:
            query_params.append(('Artists', params['artists']))  # noqa: E501
        if 'artist_ids' in params:
            query_params.append(('ArtistIds', params['artist_ids']))  # noqa: E501
        if 'albums' in params:
            query_params.append(('Albums', params['albums']))  # noqa: E501
        if 'ids' in params:
            query_params.append(('Ids', params['ids']))  # noqa: E501
        if 'video_types' in params:
            query_params.append(('VideoTypes', params['video_types']))  # noqa: E501
        if 'containers' in params:
            query_params.append(('Containers', params['containers']))  # noqa: E501
        if 'audio_codecs' in params:
            query_params.append(('AudioCodecs', params['audio_codecs']))  # noqa: E501
        if 'audio_layouts' in params:
            query_params.append(('AudioLayouts', params['audio_layouts']))  # noqa: E501
        if 'video_codecs' in params:
            query_params.append(('VideoCodecs', params['video_codecs']))  # noqa: E501
        if 'extended_video_types' in params:
            query_params.append(('ExtendedVideoTypes', params['extended_video_types']))  # noqa: E501
        if 'subtitle_codecs' in params:
            query_params.append(('SubtitleCodecs', params['subtitle_codecs']))  # noqa: E501
        if 'path' in params:
            query_params.append(('Path', params['path']))  # noqa: E501
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'min_official_rating' in params:
            query_params.append(('MinOfficialRating', params['min_official_rating']))  # noqa: E501
        if 'is_locked' in params:
            query_params.append(('IsLocked', params['is_locked']))  # noqa: E501
        if 'is_place_holder' in params:
            query_params.append(('IsPlaceHolder', params['is_place_holder']))  # noqa: E501
        if 'has_official_rating' in params:
            query_params.append(('HasOfficialRating', params['has_official_rating']))  # noqa: E501
        if 'group_items_into_collections' in params:
            query_params.append(('GroupItemsIntoCollections', params['group_items_into_collections']))  # noqa: E501
        if 'is3_d' in params:
            query_params.append(('Is3D', params['is3_d']))  # noqa: E501
        if 'series_status' in params:
            query_params.append(('SeriesStatus', params['series_status']))  # noqa: E501
        if 'name_starts_with_or_greater' in params:
            query_params.append(('NameStartsWithOrGreater', params['name_starts_with_or_greater']))  # noqa: E501
        if 'artist_starts_with_or_greater' in params:
            query_params.append(('ArtistStartsWithOrGreater', params['artist_starts_with_or_greater']))  # noqa: E501
        if 'album_artist_starts_with_or_greater' in params:
            query_params.append(('AlbumArtistStartsWithOrGreater', params['album_artist_starts_with_or_greater']))  # noqa: E501
        if 'name_starts_with' in params:
            query_params.append(('NameStartsWith', params['name_starts_with']))  # noqa: E501
        if 'name_less_than' in params:
            query_params.append(('NameLessThan', params['name_less_than']))  # noqa: E501

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
            '/LiveTv/Programs', 'POST',
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

    def post_livetv_recordings_by_id_delete(self, id, **kwargs):  # noqa: E501
        """Deletes a live tv recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_recordings_by_id_delete(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Recording Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_recordings_by_id_delete_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_recordings_by_id_delete_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def post_livetv_recordings_by_id_delete_with_http_info(self, id, **kwargs):  # noqa: E501
        """Deletes a live tv recording  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_recordings_by_id_delete_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Recording Id (required)
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
                    " to method post_livetv_recordings_by_id_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_livetv_recordings_by_id_delete`")  # noqa: E501

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
            '/LiveTv/Recordings/{Id}/Delete', 'POST',
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

    def post_livetv_seriestimers(self, body, **kwargs):  # noqa: E501
        """Creates a live tv series timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_seriestimers(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvSeriesTimerInfo body: SeriesTimerInfo:  (required)
        :return: LiveTvSeriesTimerInfoDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_seriestimers_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_seriestimers_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_livetv_seriestimers_with_http_info(self, body, **kwargs):  # noqa: E501
        """Creates a live tv series timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_seriestimers_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvSeriesTimerInfo body: SeriesTimerInfo:  (required)
        :return: LiveTvSeriesTimerInfoDto
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
                    " to method post_livetv_seriestimers" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_livetv_seriestimers`")  # noqa: E501

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
            '/LiveTv/SeriesTimers', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='LiveTvSeriesTimerInfoDto',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_livetv_seriestimers_by_id(self, body, id, **kwargs):  # noqa: E501
        """Updates a live tv series timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_seriestimers_by_id(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvSeriesTimerInfo body: SeriesTimerInfo:  (required)
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_seriestimers_by_id_with_http_info(body, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_seriestimers_by_id_with_http_info(body, id, **kwargs)  # noqa: E501
            return data

    def post_livetv_seriestimers_by_id_with_http_info(self, body, id, **kwargs):  # noqa: E501
        """Updates a live tv series timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_seriestimers_by_id_with_http_info(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvSeriesTimerInfo body: SeriesTimerInfo:  (required)
        :param str id: (required)
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
                    " to method post_livetv_seriestimers_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_livetv_seriestimers_by_id`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_livetv_seriestimers_by_id`")  # noqa: E501

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
            '/LiveTv/SeriesTimers/{Id}', 'POST',
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

    def post_livetv_seriestimers_by_id_delete(self, id, **kwargs):  # noqa: E501
        """Cancels a live tv series timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_seriestimers_by_id_delete(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Timer Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_seriestimers_by_id_delete_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_seriestimers_by_id_delete_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def post_livetv_seriestimers_by_id_delete_with_http_info(self, id, **kwargs):  # noqa: E501
        """Cancels a live tv series timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_seriestimers_by_id_delete_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Timer Id (required)
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
                    " to method post_livetv_seriestimers_by_id_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_livetv_seriestimers_by_id_delete`")  # noqa: E501

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
            '/LiveTv/SeriesTimers/{Id}/Delete', 'POST',
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

    def post_livetv_timers(self, body, **kwargs):  # noqa: E501
        """Creates a live tv timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_timers(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvTimerInfoDto body: TimerInfoDto:  (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_timers_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_timers_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_livetv_timers_with_http_info(self, body, **kwargs):  # noqa: E501
        """Creates a live tv timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_timers_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvTimerInfoDto body: TimerInfoDto:  (required)
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
                    " to method post_livetv_timers" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_livetv_timers`")  # noqa: E501

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
            '/LiveTv/Timers', 'POST',
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

    def post_livetv_timers_by_id(self, body, id, **kwargs):  # noqa: E501
        """Updates a live tv timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_timers_by_id(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvTimerInfoDto body: TimerInfoDto:  (required)
        :param str id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_timers_by_id_with_http_info(body, id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_timers_by_id_with_http_info(body, id, **kwargs)  # noqa: E501
            return data

    def post_livetv_timers_by_id_with_http_info(self, body, id, **kwargs):  # noqa: E501
        """Updates a live tv timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_timers_by_id_with_http_info(body, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvTimerInfoDto body: TimerInfoDto:  (required)
        :param str id: (required)
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
                    " to method post_livetv_timers_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_livetv_timers_by_id`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_livetv_timers_by_id`")  # noqa: E501

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
            '/LiveTv/Timers/{Id}', 'POST',
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

    def post_livetv_timers_by_id_delete(self, id, **kwargs):  # noqa: E501
        """Cancels a live tv timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_timers_by_id_delete(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Timer Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_timers_by_id_delete_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_timers_by_id_delete_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def post_livetv_timers_by_id_delete_with_http_info(self, id, **kwargs):  # noqa: E501
        """Cancels a live tv timer  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_timers_by_id_delete_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Timer Id (required)
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
                    " to method post_livetv_timers_by_id_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_livetv_timers_by_id_delete`")  # noqa: E501

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
            '/LiveTv/Timers/{Id}/Delete', 'POST',
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

    def post_livetv_tunerhosts(self, body, **kwargs):  # noqa: E501
        """Adds a tuner host  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_tunerhosts(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvTunerHostInfo body: TunerHostInfo:  (required)
        :return: LiveTvTunerHostInfo
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_tunerhosts_with_http_info(body, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_tunerhosts_with_http_info(body, **kwargs)  # noqa: E501
            return data

    def post_livetv_tunerhosts_with_http_info(self, body, **kwargs):  # noqa: E501
        """Adds a tuner host  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_tunerhosts_with_http_info(body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param LiveTvTunerHostInfo body: TunerHostInfo:  (required)
        :return: LiveTvTunerHostInfo
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
                    " to method post_livetv_tunerhosts" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `post_livetv_tunerhosts`")  # noqa: E501

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
            '/LiveTv/TunerHosts', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='LiveTvTunerHostInfo',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def post_livetv_tunerhosts_delete(self, **kwargs):  # noqa: E501
        """Deletes a tuner host  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_tunerhosts_delete(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Tuner host id
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_tunerhosts_delete_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_tunerhosts_delete_with_http_info(**kwargs)  # noqa: E501
            return data

    def post_livetv_tunerhosts_delete_with_http_info(self, **kwargs):  # noqa: E501
        """Deletes a tuner host  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_tunerhosts_delete_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Tuner host id
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
                    " to method post_livetv_tunerhosts_delete" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'id' in params:
            query_params.append(('Id', params['id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/TunerHosts/Delete', 'POST',
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

    def post_livetv_tuners_by_id_reset(self, id, **kwargs):  # noqa: E501
        """Resets a tv tuner  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_tuners_by_id_reset(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Tuner Id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.post_livetv_tuners_by_id_reset_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.post_livetv_tuners_by_id_reset_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def post_livetv_tuners_by_id_reset_with_http_info(self, id, **kwargs):  # noqa: E501
        """Resets a tv tuner  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.post_livetv_tuners_by_id_reset_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Tuner Id (required)
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
                    " to method post_livetv_tuners_by_id_reset" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `post_livetv_tuners_by_id_reset`")  # noqa: E501

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
            '/LiveTv/Tuners/{Id}/Reset', 'POST',
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

    def put_livetv_channelmappingoptions(self, provider_id, **kwargs):  # noqa: E501
        """put_livetv_channelmappingoptions  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.put_livetv_channelmappingoptions(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.put_livetv_channelmappingoptions_with_http_info(provider_id, **kwargs)  # noqa: E501
        else:
            (data) = self.put_livetv_channelmappingoptions_with_http_info(provider_id, **kwargs)  # noqa: E501
            return data

    def put_livetv_channelmappingoptions_with_http_info(self, provider_id, **kwargs):  # noqa: E501
        """put_livetv_channelmappingoptions  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.put_livetv_channelmappingoptions_with_http_info(provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['provider_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method put_livetv_channelmappingoptions" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'provider_id' is set
        if ('provider_id' not in params or
                params['provider_id'] is None):
            raise ValueError("Missing the required parameter `provider_id` when calling `put_livetv_channelmappingoptions`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'provider_id' in params:
            query_params.append(('ProviderId', params['provider_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/LiveTv/ChannelMappingOptions', 'PUT',
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

    def put_livetv_channelmappings(self, body, provider_id, **kwargs):  # noqa: E501
        """put_livetv_channelmappings  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.put_livetv_channelmappings(body, provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ApiSetChannelMapping body: SetChannelMapping (required)
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.put_livetv_channelmappings_with_http_info(body, provider_id, **kwargs)  # noqa: E501
        else:
            (data) = self.put_livetv_channelmappings_with_http_info(body, provider_id, **kwargs)  # noqa: E501
            return data

    def put_livetv_channelmappings_with_http_info(self, body, provider_id, **kwargs):  # noqa: E501
        """put_livetv_channelmappings  # noqa: E501

        Requires authentication as administrator  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.put_livetv_channelmappings_with_http_info(body, provider_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param ApiSetChannelMapping body: SetChannelMapping (required)
        :param str provider_id: Provider id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'provider_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method put_livetv_channelmappings" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `put_livetv_channelmappings`")  # noqa: E501
        # verify the required parameter 'provider_id' is set
        if ('provider_id' not in params or
                params['provider_id'] is None):
            raise ValueError("Missing the required parameter `provider_id` when calling `put_livetv_channelmappings`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'provider_id' in params:
            query_params.append(('ProviderId', params['provider_id']))  # noqa: E501

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
            '/LiveTv/ChannelMappings', 'PUT',
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
