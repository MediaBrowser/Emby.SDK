# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class SuggestionsServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_users_by_userid_suggestions(self, user_id, **kwargs):  # noqa: E501
        """Gets items based on a query.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_by_userid_suggestions(user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: (required)
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :param bool enable_images: Optional, include image information in output
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param bool enable_user_data: Optional, include user data
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_users_by_userid_suggestions_with_http_info(user_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_users_by_userid_suggestions_with_http_info(user_id, **kwargs)  # noqa: E501
            return data

    def get_users_by_userid_suggestions_with_http_info(self, user_id, **kwargs):  # noqa: E501
        """Gets items based on a query.  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_users_by_userid_suggestions_with_http_info(user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: (required)
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :param bool enable_images: Optional, include image information in output
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param bool enable_user_data: Optional, include user data
        :return: QueryResultBaseItemDto
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
                    " to method get_users_by_userid_suggestions" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `get_users_by_userid_suggestions`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'user_id' in params:
            path_params['UserId'] = params['user_id']  # noqa: E501

        query_params = []
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
            '/Users/{UserId}/Suggestions', 'GET',
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
