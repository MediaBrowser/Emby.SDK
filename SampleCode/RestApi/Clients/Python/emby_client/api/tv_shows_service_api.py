# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from emby_client.api_client import ApiClient


class TvShowsServiceApi(object):
    """NOTE: This class is auto generated.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_shows_by_id_episodes(self, id, **kwargs):  # noqa: E501
        """Gets episodes for a tv season  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_shows_by_id_episodes(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: The series id (required)
        :param int season: Optional filter by season number.
        :param str season_id: Optional. Filter by season id
        :param str start_item_id: Optional. Skip through the list until a given item is found.
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
            return self.get_shows_by_id_episodes_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_shows_by_id_episodes_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_shows_by_id_episodes_with_http_info(self, id, **kwargs):  # noqa: E501
        """Gets episodes for a tv season  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_shows_by_id_episodes_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: The series id (required)
        :param int season: Optional filter by season number.
        :param str season_id: Optional. Filter by season id
        :param str start_item_id: Optional. Skip through the list until a given item is found.
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

        all_params = ['id', 'season', 'season_id', 'start_item_id', 'artist_type', 'max_official_rating', 'has_theme_song', 'has_theme_video', 'has_subtitles', 'has_special_feature', 'has_trailer', 'adjacent_to', 'min_index_number', 'min_start_date', 'max_start_date', 'min_end_date', 'max_end_date', 'min_players', 'max_players', 'parent_index_number', 'has_parental_rating', 'is_hd', 'is_unaired', 'min_community_rating', 'min_critic_rating', 'aired_during_season', 'min_premiere_date', 'min_date_last_saved', 'min_date_last_saved_for_user', 'max_premiere_date', 'has_overview', 'has_imdb_id', 'has_tmdb_id', 'has_tvdb_id', 'exclude_item_ids', 'start_index', 'limit', 'recursive', 'search_term', 'sort_order', 'parent_id', 'fields', 'exclude_item_types', 'include_item_types', 'any_provider_id_equals', 'filters', 'is_favorite', 'is_movie', 'is_series', 'is_folder', 'is_news', 'is_kids', 'is_sports', 'is_new', 'is_premiere', 'is_new_or_premiere', 'is_repeat', 'project_to_media', 'media_types', 'image_types', 'sort_by', 'is_played', 'genres', 'official_ratings', 'tags', 'exclude_tags', 'years', 'enable_images', 'enable_user_data', 'image_type_limit', 'enable_image_types', 'person', 'person_ids', 'person_types', 'studios', 'studio_ids', 'artists', 'artist_ids', 'albums', 'ids', 'video_types', 'containers', 'audio_codecs', 'audio_layouts', 'video_codecs', 'extended_video_types', 'subtitle_codecs', 'path', 'user_id', 'min_official_rating', 'is_locked', 'is_place_holder', 'has_official_rating', 'group_items_into_collections', 'is3_d', 'series_status', 'name_starts_with_or_greater', 'artist_starts_with_or_greater', 'album_artist_starts_with_or_greater', 'name_starts_with', 'name_less_than']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_shows_by_id_episodes" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_shows_by_id_episodes`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'season' in params:
            query_params.append(('Season', params['season']))  # noqa: E501
        if 'season_id' in params:
            query_params.append(('SeasonId', params['season_id']))  # noqa: E501
        if 'start_item_id' in params:
            query_params.append(('StartItemId', params['start_item_id']))  # noqa: E501
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
            '/Shows/{Id}/Episodes', 'GET',
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

    def get_shows_by_id_seasons(self, user_id, id, **kwargs):  # noqa: E501
        """Gets seasons for a tv series  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_shows_by_id_seasons(user_id, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param str id: The series id (required)
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :param bool is_special_season: Optional. Filter by special season.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
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
            return self.get_shows_by_id_seasons_with_http_info(user_id, id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_shows_by_id_seasons_with_http_info(user_id, id, **kwargs)  # noqa: E501
            return data

    def get_shows_by_id_seasons_with_http_info(self, user_id, id, **kwargs):  # noqa: E501
        """Gets seasons for a tv series  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_shows_by_id_seasons_with_http_info(user_id, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param str id: The series id (required)
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :param bool is_special_season: Optional. Filter by special season.
        :param str adjacent_to: Optional. Return items that are siblings of a supplied item.
        :param bool enable_images: Optional, include image information in output
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param bool enable_user_data: Optional, include user data
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['user_id', 'id', 'fields', 'is_special_season', 'adjacent_to', 'enable_images', 'image_type_limit', 'enable_image_types', 'enable_user_data']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_shows_by_id_seasons" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `get_shows_by_id_seasons`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `get_shows_by_id_seasons`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['Id'] = params['id']  # noqa: E501

        query_params = []
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501
        if 'is_special_season' in params:
            query_params.append(('IsSpecialSeason', params['is_special_season']))  # noqa: E501
        if 'adjacent_to' in params:
            query_params.append(('AdjacentTo', params['adjacent_to']))  # noqa: E501
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
            '/Shows/{Id}/Seasons', 'GET',
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

    def get_shows_missing(self, **kwargs):  # noqa: E501
        """Gets a list of missing episodes  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_shows_missing(async_req=True)
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
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_shows_missing_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_shows_missing_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_shows_missing_with_http_info(self, **kwargs):  # noqa: E501
        """Gets a list of missing episodes  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_shows_missing_with_http_info(async_req=True)
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
        :return: None
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
                    " to method get_shows_missing" % key
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
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Shows/Missing', 'GET',
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

    def get_shows_nextup(self, user_id, **kwargs):  # noqa: E501
        """Gets a list of next up episodes  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_shows_nextup(user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :param str series_id: Optional. Filter by series id
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
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
            return self.get_shows_nextup_with_http_info(user_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_shows_nextup_with_http_info(user_id, **kwargs)  # noqa: E501
            return data

    def get_shows_nextup_with_http_info(self, user_id, **kwargs):  # noqa: E501
        """Gets a list of next up episodes  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_shows_nextup_with_http_info(user_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str user_id: User Id (required)
        :param int start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
        :param int limit: Optional. The maximum number of records to return
        :param str fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
        :param str series_id: Optional. Filter by series id
        :param str parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root
        :param bool enable_images: Optional, include image information in output
        :param int image_type_limit: Optional, the max number of images to return, per image type
        :param str enable_image_types: Optional. The image types to include in the output.
        :param bool enable_user_data: Optional, include user data
        :return: QueryResultBaseItemDto
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['user_id', 'start_index', 'limit', 'fields', 'series_id', 'parent_id', 'enable_images', 'image_type_limit', 'enable_image_types', 'enable_user_data']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_shows_nextup" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params or
                params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `get_shows_nextup`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'user_id' in params:
            query_params.append(('UserId', params['user_id']))  # noqa: E501
        if 'start_index' in params:
            query_params.append(('StartIndex', params['start_index']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('Limit', params['limit']))  # noqa: E501
        if 'fields' in params:
            query_params.append(('Fields', params['fields']))  # noqa: E501
        if 'series_id' in params:
            query_params.append(('SeriesId', params['series_id']))  # noqa: E501
        if 'parent_id' in params:
            query_params.append(('ParentId', params['parent_id']))  # noqa: E501
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
            '/Shows/NextUp', 'GET',
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

    def get_shows_upcoming(self, **kwargs):  # noqa: E501
        """Gets a list of upcoming episodes  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_shows_upcoming(async_req=True)
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
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_shows_upcoming_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_shows_upcoming_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_shows_upcoming_with_http_info(self, **kwargs):  # noqa: E501
        """Gets a list of upcoming episodes  # noqa: E501

        Requires authentication as user  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_shows_upcoming_with_http_info(async_req=True)
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
        :return: None
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
                    " to method get_shows_upcoming" % key
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
        # Authentication setting
        auth_settings = ['apikeyauth', 'embyauth']  # noqa: E501

        return self.api_client.call_api(
            '/Shows/Upcoming', 'GET',
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
