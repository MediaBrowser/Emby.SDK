/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.9.0.29
 * 
 *
 * NOTE: This file is auto generated.
 * Do not edit the file manually.
 */

import * as api from "./api"
import { Configuration } from "./configuration"

const config: Configuration = {}

describe("ActivityLogServiceApi", () => {
  let instance: api.ActivityLogServiceApi
  beforeEach(function() {
    instance = new api.ActivityLogServiceApi(config)
  });

  test("getSystemActivitylogEntries", () => {
    const StartIndex: number = 56
    const Limit: number = 56
    const MinDate: string = "MinDate_example"
    return expect(instance.getSystemActivitylogEntries(StartIndex, Limit, MinDate, {})).resolves.toBe(null)
  })
})

describe("ArtistsServiceApi", () => {
  let instance: api.ArtistsServiceApi
  beforeEach(function() {
    instance = new api.ArtistsServiceApi(config)
  });

  test("getArtists", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getArtists(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getArtistsAlbumartists", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getArtistsAlbumartists(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getArtistsByName", () => {
    const Name: string = "Name_example"
    const UserId: string = "UserId_example"
    return expect(instance.getArtistsByName(Name, UserId, {})).resolves.toBe(null)
  })
})

describe("AudioServiceApi", () => {
  let instance: api.AudioServiceApi
  beforeEach(function() {
    instance = new api.AudioServiceApi(config)
  });

  test("getAudioByIdByStreamfilename", () => {
    const StreamFileName: string = "StreamFileName_example"
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.getAudioByIdByStreamfilename(StreamFileName, Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("getAudioByIdStream", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.getAudioByIdStream(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("getAudioByIdStreamByContainer", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.getAudioByIdStreamByContainer(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("headAudioByIdByStreamfilename", () => {
    const StreamFileName: string = "StreamFileName_example"
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.headAudioByIdByStreamfilename(StreamFileName, Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("headAudioByIdStream", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.headAudioByIdStream(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("headAudioByIdStreamByContainer", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.headAudioByIdStreamByContainer(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
})

describe("BackupApiApi", () => {
  let instance: api.BackupApiApi
  beforeEach(function() {
    instance = new api.BackupApiApi(config)
  });

  test("getBackuprestoreBackupinfo", () => {
    return expect(instance.getBackuprestoreBackupinfo({})).resolves.toBe(null)
  })
  test("postBackuprestoreRestore", () => {
    const body: api.MBBackupApiRestoreOptions = undefined
    return expect(instance.postBackuprestoreRestore(body, {})).resolves.toBe(null)
  })
  test("postBackuprestoreRestoredata", () => {
    const body: api.MBBackupApiDataRestoreOptions = undefined
    return expect(instance.postBackuprestoreRestoredata(body, {})).resolves.toBe(null)
  })
})

describe("BifServiceApi", () => {
  let instance: api.BifServiceApi
  beforeEach(function() {
    instance = new api.BifServiceApi(config)
  });

  test("getItemsByIdThumbnailset", () => {
    const Width: number = 56
    const Id: string = "Id_example"
    return expect(instance.getItemsByIdThumbnailset(Width, Id, {})).resolves.toBe(null)
  })
  test("getVideosByIdIndexBif", () => {
    const Width: number = 56
    const Id: string = "Id_example"
    return expect(instance.getVideosByIdIndexBif(Width, Id, {})).resolves.toBe(null)
  })
})

describe("BrandingServiceApi", () => {
  let instance: api.BrandingServiceApi
  beforeEach(function() {
    instance = new api.BrandingServiceApi(config)
  });

  test("getBrandingConfiguration", () => {
    return expect(instance.getBrandingConfiguration({})).resolves.toBe(null)
  })
  test("getBrandingCss", () => {
    return expect(instance.getBrandingCss({})).resolves.toBe(null)
  })
  test("getBrandingCssCss", () => {
    return expect(instance.getBrandingCssCss({})).resolves.toBe(null)
  })
})

describe("ChannelServiceApi", () => {
  let instance: api.ChannelServiceApi
  beforeEach(function() {
    instance = new api.ChannelServiceApi(config)
  });

  test("getChannels", () => {
    const UserId: string = "UserId_example"
    const StartIndex: number = 56
    const Fields: string = "Fields_example"
    const Limit: number = 56
    const EnableImages: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const EnableUserData: boolean = true
    return expect(instance.getChannels(UserId, StartIndex, Fields, Limit, EnableImages, ImageTypeLimit, EnableImageTypes, EnableUserData, {})).resolves.toBe(null)
  })
})

describe("CodecParameterServiceApi", () => {
  let instance: api.CodecParameterServiceApi
  beforeEach(function() {
    instance = new api.CodecParameterServiceApi(config)
  });

  test("getEncodingCodecparameters", () => {
    const CodecId: string = "CodecId_example"
    const ParameterContext: MediaEncodingCodecParameterContext = undefined
    return expect(instance.getEncodingCodecparameters(CodecId, ParameterContext, {})).resolves.toBe(null)
  })
  test("postEncodingCodecparameters", () => {
    const body: Object = undefined
    const CodecId: string = "CodecId_example"
    const ParameterContext: MediaEncodingCodecParameterContext = undefined
    return expect(instance.postEncodingCodecparameters(body, CodecId, ParameterContext, {})).resolves.toBe(null)
  })
})

describe("CollectionServiceApi", () => {
  let instance: api.CollectionServiceApi
  beforeEach(function() {
    instance = new api.CollectionServiceApi(config)
  });

  test("deleteCollectionsByIdItems", () => {
    const Ids: string = "Ids_example"
    const Id: string = "Id_example"
    return expect(instance.deleteCollectionsByIdItems(Ids, Id, {})).resolves.toBe(null)
  })
  test("postCollections", () => {
    const IsLocked: boolean = true
    const Name: string = "Name_example"
    const ParentId: string = "ParentId_example"
    const Ids: string = "Ids_example"
    return expect(instance.postCollections(IsLocked, Name, ParentId, Ids, {})).resolves.toBe(null)
  })
  test("postCollectionsByIdItems", () => {
    const Ids: string = "Ids_example"
    const Id: string = "Id_example"
    return expect(instance.postCollectionsByIdItems(Ids, Id, {})).resolves.toBe(null)
  })
  test("postCollectionsByIdItemsDelete", () => {
    const Ids: string = "Ids_example"
    const Id: string = "Id_example"
    return expect(instance.postCollectionsByIdItemsDelete(Ids, Id, {})).resolves.toBe(null)
  })
})

describe("ConfigurationServiceApi", () => {
  let instance: api.ConfigurationServiceApi
  beforeEach(function() {
    instance = new api.ConfigurationServiceApi(config)
  });

  test("getSystemConfiguration", () => {
    return expect(instance.getSystemConfiguration({})).resolves.toBe(null)
  })
  test("getSystemConfigurationByKey", () => {
    const Key: string = "Key_example"
    return expect(instance.getSystemConfigurationByKey(Key, {})).resolves.toBe(null)
  })
  test("postSystemConfiguration", () => {
    const body: api.ServerConfiguration = undefined
    return expect(instance.postSystemConfiguration(body, {})).resolves.toBe(null)
  })
  test("postSystemConfigurationByKey", () => {
    const body: Object = undefined
    const Key: string = "Key_example"
    return expect(instance.postSystemConfigurationByKey(body, Key, {})).resolves.toBe(null)
  })
  test("postSystemConfigurationPartial", () => {
    const body: Object = undefined
    return expect(instance.postSystemConfigurationPartial(body, {})).resolves.toBe(null)
  })
})

describe("ConnectServiceApi", () => {
  let instance: api.ConnectServiceApi
  beforeEach(function() {
    instance = new api.ConnectServiceApi(config)
  });

  test("deleteUsersByIdConnectLink", () => {
    const Id: string = "Id_example"
    return expect(instance.deleteUsersByIdConnectLink(Id, {})).resolves.toBe(null)
  })
  test("getConnectExchange", () => {
    const ConnectUserId: string = "ConnectUserId_example"
    return expect(instance.getConnectExchange(ConnectUserId, {})).resolves.toBe(null)
  })
  test("getConnectPending", () => {
    return expect(instance.getConnectPending({})).resolves.toBe(null)
  })
  test("postUsersByIdConnectLink", () => {
    const Id: string = "Id_example"
    const ConnectUsername: string = "ConnectUsername_example"
    return expect(instance.postUsersByIdConnectLink(Id, ConnectUsername, {})).resolves.toBe(null)
  })
  test("postUsersByIdConnectLinkDelete", () => {
    const Id: string = "Id_example"
    return expect(instance.postUsersByIdConnectLinkDelete(Id, {})).resolves.toBe(null)
  })
})

describe("DeviceServiceApi", () => {
  let instance: api.DeviceServiceApi
  beforeEach(function() {
    instance = new api.DeviceServiceApi(config)
  });

  test("deleteDevices", () => {
    const Id: string = "Id_example"
    return expect(instance.deleteDevices(Id, {})).resolves.toBe(null)
  })
  test("getDevices", () => {
    const SortOrder: string = "SortOrder_example"
    return expect(instance.getDevices(SortOrder, {})).resolves.toBe(null)
  })
  test("getDevicesCamerauploads", () => {
    return expect(instance.getDevicesCamerauploads({})).resolves.toBe(null)
  })
  test("getDevicesInfo", () => {
    const Id: string = "Id_example"
    return expect(instance.getDevicesInfo(Id, {})).resolves.toBe(null)
  })
  test("getDevicesOptions", () => {
    const Id: string = "Id_example"
    return expect(instance.getDevicesOptions(Id, {})).resolves.toBe(null)
  })
  test("postDevicesCamerauploads", () => {
    const body: Object = undefined
    const Album: string = "Album_example"
    const Name: string = "Name_example"
    const Id: string = "Id_example"
    return expect(instance.postDevicesCamerauploads(body, Album, Name, Id, {})).resolves.toBe(null)
  })
  test("postDevicesDelete", () => {
    const Id: string = "Id_example"
    return expect(instance.postDevicesDelete(Id, {})).resolves.toBe(null)
  })
  test("postDevicesOptions", () => {
    const body: api.DevicesDeviceOptions = undefined
    const Id: string = "Id_example"
    return expect(instance.postDevicesOptions(body, Id, {})).resolves.toBe(null)
  })
})

describe("DisplayPreferencesServiceApi", () => {
  let instance: api.DisplayPreferencesServiceApi
  beforeEach(function() {
    instance = new api.DisplayPreferencesServiceApi(config)
  });

  test("getDisplaypreferencesById", () => {
    const Id: string = "Id_example"
    const UserId: string = "UserId_example"
    const Client: string = "Client_example"
    return expect(instance.getDisplaypreferencesById(Id, UserId, Client, {})).resolves.toBe(null)
  })
  test("getUsersettingsByUserid", () => {
    const UserId: string = "UserId_example"
    return expect(instance.getUsersettingsByUserid(UserId, {})).resolves.toBe(null)
  })
  test("postDisplaypreferencesByDisplaypreferencesid", () => {
    const body: api.DisplayPreferences = undefined
    const UserId: string = "UserId_example"
    const DisplayPreferencesId: string = "DisplayPreferencesId_example"
    return expect(instance.postDisplaypreferencesByDisplaypreferencesid(body, UserId, DisplayPreferencesId, {})).resolves.toBe(null)
  })
  test("postUsersettingsByUserid", () => {
    const body: Array<string> = undefined
    const UserId: string = "UserId_example"
    return expect(instance.postUsersettingsByUserid(body, UserId, {})).resolves.toBe(null)
  })
  test("postUsersettingsByUseridPartial", () => {
    const body: Object = undefined
    const UserId: string = "UserId_example"
    return expect(instance.postUsersettingsByUseridPartial(body, UserId, {})).resolves.toBe(null)
  })
})

describe("DlnaServerServiceApi", () => {
  let instance: api.DlnaServerServiceApi
  beforeEach(function() {
    instance = new api.DlnaServerServiceApi(config)
  });

  test("getDlnaByUuidConnectionmanagerConnectionmanager", () => {
    const UuId: string = "UuId_example"
    return expect(instance.getDlnaByUuidConnectionmanagerConnectionmanager(UuId, {})).resolves.toBe(null)
  })
  test("getDlnaByUuidConnectionmanagerConnectionmanagerXml", () => {
    const UuId: string = "UuId_example"
    return expect(instance.getDlnaByUuidConnectionmanagerConnectionmanagerXml(UuId, {})).resolves.toBe(null)
  })
  test("getDlnaByUuidContentdirectoryContentdirectory", () => {
    const UuId: string = "UuId_example"
    return expect(instance.getDlnaByUuidContentdirectoryContentdirectory(UuId, {})).resolves.toBe(null)
  })
  test("getDlnaByUuidContentdirectoryContentdirectoryXml", () => {
    const UuId: string = "UuId_example"
    return expect(instance.getDlnaByUuidContentdirectoryContentdirectoryXml(UuId, {})).resolves.toBe(null)
  })
  test("getDlnaByUuidDescription", () => {
    const UuId: string = "UuId_example"
    return expect(instance.getDlnaByUuidDescription(UuId, {})).resolves.toBe(null)
  })
  test("getDlnaByUuidDescriptionXml", () => {
    const UuId: string = "UuId_example"
    return expect(instance.getDlnaByUuidDescriptionXml(UuId, {})).resolves.toBe(null)
  })
  test("getDlnaByUuidIconsByFilename", () => {
    const UuId: string = "UuId_example"
    const Filename: string = "Filename_example"
    return expect(instance.getDlnaByUuidIconsByFilename(UuId, Filename, {})).resolves.toBe(null)
  })
  test("getDlnaIconsByFilename", () => {
    const Filename: string = "Filename_example"
    const UuId: string = "UuId_example"
    return expect(instance.getDlnaIconsByFilename(Filename, UuId, {})).resolves.toBe(null)
  })
  test("headDlnaByUuidConnectionmanagerConnectionmanager", () => {
    const UuId: string = "UuId_example"
    return expect(instance.headDlnaByUuidConnectionmanagerConnectionmanager(UuId, {})).resolves.toBe(null)
  })
  test("headDlnaByUuidConnectionmanagerConnectionmanagerXml", () => {
    const UuId: string = "UuId_example"
    return expect(instance.headDlnaByUuidConnectionmanagerConnectionmanagerXml(UuId, {})).resolves.toBe(null)
  })
  test("headDlnaByUuidContentdirectoryContentdirectory", () => {
    const UuId: string = "UuId_example"
    return expect(instance.headDlnaByUuidContentdirectoryContentdirectory(UuId, {})).resolves.toBe(null)
  })
  test("headDlnaByUuidContentdirectoryContentdirectoryXml", () => {
    const UuId: string = "UuId_example"
    return expect(instance.headDlnaByUuidContentdirectoryContentdirectoryXml(UuId, {})).resolves.toBe(null)
  })
  test("headDlnaByUuidDescription", () => {
    const UuId: string = "UuId_example"
    return expect(instance.headDlnaByUuidDescription(UuId, {})).resolves.toBe(null)
  })
  test("headDlnaByUuidDescriptionXml", () => {
    const UuId: string = "UuId_example"
    return expect(instance.headDlnaByUuidDescriptionXml(UuId, {})).resolves.toBe(null)
  })
  test("postDlnaByUuidConnectionmanagerControl", () => {
    const body: Object = undefined
    const UuId: string = "UuId_example"
    return expect(instance.postDlnaByUuidConnectionmanagerControl(body, UuId, {})).resolves.toBe(null)
  })
  test("postDlnaByUuidContentdirectoryControl", () => {
    const body: Object = undefined
    const UuId: string = "UuId_example"
    return expect(instance.postDlnaByUuidContentdirectoryControl(body, UuId, {})).resolves.toBe(null)
  })
})

describe("DlnaServiceApi", () => {
  let instance: api.DlnaServiceApi
  beforeEach(function() {
    instance = new api.DlnaServiceApi(config)
  });

  test("deleteDlnaProfilesById", () => {
    const Id: string = "Id_example"
    return expect(instance.deleteDlnaProfilesById(Id, {})).resolves.toBe(null)
  })
  test("getDlnaProfileinfos", () => {
    return expect(instance.getDlnaProfileinfos({})).resolves.toBe(null)
  })
  test("getDlnaProfilesById", () => {
    const Id: string = "Id_example"
    return expect(instance.getDlnaProfilesById(Id, {})).resolves.toBe(null)
  })
  test("getDlnaProfilesDefault", () => {
    return expect(instance.getDlnaProfilesDefault({})).resolves.toBe(null)
  })
  test("postDlnaProfiles", () => {
    const body: api.DlnaProfilesDlnaProfile = undefined
    return expect(instance.postDlnaProfiles(body, {})).resolves.toBe(null)
  })
  test("postDlnaProfilesById", () => {
    const body: api.DlnaProfilesDlnaProfile = undefined
    const Id: string = "Id_example"
    return expect(instance.postDlnaProfilesById(body, Id, {})).resolves.toBe(null)
  })
})

describe("DynamicHlsServiceApi", () => {
  let instance: api.DynamicHlsServiceApi
  beforeEach(function() {
    instance = new api.DynamicHlsServiceApi(config)
  });

  test("getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", () => {
    const SegmentContainer: string = "SegmentContainer_example"
    const SegmentId: string = "SegmentId_example"
    const Id: string = "Id_example"
    const PlaylistId: string = "PlaylistId_example"
    return expect(instance.getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(SegmentContainer, SegmentId, Id, PlaylistId, {})).resolves.toBe(null)
  })
  test("getAudioByIdLiveM3u8", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.getAudioByIdLiveM3u8(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("getAudioByIdMainM3u8", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.getAudioByIdMainM3u8(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("getAudioByIdMasterM3u8", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.getAudioByIdMasterM3u8(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", () => {
    const SegmentContainer: string = "SegmentContainer_example"
    const SegmentId: string = "SegmentId_example"
    const Id: string = "Id_example"
    const PlaylistId: string = "PlaylistId_example"
    return expect(instance.getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(SegmentContainer, SegmentId, Id, PlaylistId, {})).resolves.toBe(null)
  })
  test("getVideosByIdLiveM3u8", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.getVideosByIdLiveM3u8(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("getVideosByIdLiveSubtitlesM3u8", () => {
    const Id: string = "Id_example"
    const SubtitleSegmentLength: number = 56
    const ManifestSubtitles: string = "ManifestSubtitles_example"
    return expect(instance.getVideosByIdLiveSubtitlesM3u8(Id, SubtitleSegmentLength, ManifestSubtitles, {})).resolves.toBe(null)
  })
  test("getVideosByIdMainM3u8", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.getVideosByIdMainM3u8(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("getVideosByIdMasterM3u8", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.getVideosByIdMasterM3u8(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("getVideosByIdSubtitlesM3u8", () => {
    const Id: string = "Id_example"
    const SubtitleSegmentLength: number = 56
    const ManifestSubtitles: string = "ManifestSubtitles_example"
    return expect(instance.getVideosByIdSubtitlesM3u8(Id, SubtitleSegmentLength, ManifestSubtitles, {})).resolves.toBe(null)
  })
  test("headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", () => {
    const SegmentContainer: string = "SegmentContainer_example"
    const SegmentId: string = "SegmentId_example"
    const Id: string = "Id_example"
    const PlaylistId: string = "PlaylistId_example"
    return expect(instance.headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(SegmentContainer, SegmentId, Id, PlaylistId, {})).resolves.toBe(null)
  })
  test("headAudioByIdMasterM3u8", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.headAudioByIdMasterM3u8(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", () => {
    const SegmentContainer: string = "SegmentContainer_example"
    const SegmentId: string = "SegmentId_example"
    const Id: string = "Id_example"
    const PlaylistId: string = "PlaylistId_example"
    return expect(instance.headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(SegmentContainer, SegmentId, Id, PlaylistId, {})).resolves.toBe(null)
  })
  test("headVideosByIdMasterM3u8", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.headVideosByIdMasterM3u8(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
})

describe("EncodingInfoServiceApi", () => {
  let instance: api.EncodingInfoServiceApi
  beforeEach(function() {
    instance = new api.EncodingInfoServiceApi(config)
  });

  test("getEncodingCodecconfigurationDefaults", () => {
    return expect(instance.getEncodingCodecconfigurationDefaults({})).resolves.toBe(null)
  })
  test("getEncodingCodecinformationVideo", () => {
    return expect(instance.getEncodingCodecinformationVideo({})).resolves.toBe(null)
  })
  test("getEncodingTonemapoptions", () => {
    return expect(instance.getEncodingTonemapoptions({})).resolves.toBe(null)
  })
})

describe("EnvironmentServiceApi", () => {
  let instance: api.EnvironmentServiceApi
  beforeEach(function() {
    instance = new api.EnvironmentServiceApi(config)
  });

  test("getEnvironmentDefaultdirectorybrowser", () => {
    return expect(instance.getEnvironmentDefaultdirectorybrowser({})).resolves.toBe(null)
  })
  test("getEnvironmentDirectorycontents", () => {
    const Path: string = "Path_example"
    const IncludeFiles: boolean = true
    const IncludeDirectories: boolean = true
    return expect(instance.getEnvironmentDirectorycontents(Path, IncludeFiles, IncludeDirectories, {})).resolves.toBe(null)
  })
  test("getEnvironmentDrives", () => {
    return expect(instance.getEnvironmentDrives({})).resolves.toBe(null)
  })
  test("getEnvironmentNetworkdevices", () => {
    return expect(instance.getEnvironmentNetworkdevices({})).resolves.toBe(null)
  })
  test("getEnvironmentNetworkshares", () => {
    const Path: string = "Path_example"
    return expect(instance.getEnvironmentNetworkshares(Path, {})).resolves.toBe(null)
  })
  test("getEnvironmentParentpath", () => {
    const Path: string = "Path_example"
    return expect(instance.getEnvironmentParentpath(Path, {})).resolves.toBe(null)
  })
  test("postEnvironmentDirectorycontents", () => {
    const body: api.GetDirectoryContents = undefined
    const Path: string = "Path_example"
    const IncludeFiles: boolean = true
    const IncludeDirectories: boolean = true
    return expect(instance.postEnvironmentDirectorycontents(body, Path, IncludeFiles, IncludeDirectories, {})).resolves.toBe(null)
  })
  test("postEnvironmentValidatepath", () => {
    const body: api.ValidatePath = undefined
    const Path: string = "Path_example"
    return expect(instance.postEnvironmentValidatepath(body, Path, {})).resolves.toBe(null)
  })
})

describe("FeatureServiceApi", () => {
  let instance: api.FeatureServiceApi
  beforeEach(function() {
    instance = new api.FeatureServiceApi(config)
  });

  test("getFeatures", () => {
    return expect(instance.getFeatures({})).resolves.toBe(null)
  })
})

describe("FfmpegOptionsServiceApi", () => {
  let instance: api.FfmpegOptionsServiceApi
  beforeEach(function() {
    instance = new api.FfmpegOptionsServiceApi(config)
  });

  test("getEncodingFfmpegoptions", () => {
    return expect(instance.getEncodingFfmpegoptions({})).resolves.toBe(null)
  })
  test("postEncodingFfmpegoptions", () => {
    const body: Object = undefined
    return expect(instance.postEncodingFfmpegoptions(body, {})).resolves.toBe(null)
  })
})

describe("GameGenresServiceApi", () => {
  let instance: api.GameGenresServiceApi
  beforeEach(function() {
    instance = new api.GameGenresServiceApi(config)
  });

  test("getGamegenres", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getGamegenres(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getGamegenresByName", () => {
    const Name: string = "Name_example"
    const UserId: string = "UserId_example"
    return expect(instance.getGamegenresByName(Name, UserId, {})).resolves.toBe(null)
  })
})

describe("GenericUIApiServiceApi", () => {
  let instance: api.GenericUIApiServiceApi
  beforeEach(function() {
    instance = new api.GenericUIApiServiceApi(config)
  });

  test("getUIView", () => {
    const PageId: string = "PageId_example"
    const ClientLocale: string = "ClientLocale_example"
    return expect(instance.getUIView(PageId, ClientLocale, {})).resolves.toBe(null)
  })
  test("postUICommand", () => {
    const body: api.RunUICommand = undefined
    return expect(instance.postUICommand(body, {})).resolves.toBe(null)
  })
})

describe("GenresServiceApi", () => {
  let instance: api.GenresServiceApi
  beforeEach(function() {
    instance = new api.GenresServiceApi(config)
  });

  test("getGenres", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getGenres(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getGenresByName", () => {
    const Name: string = "Name_example"
    const UserId: string = "UserId_example"
    return expect(instance.getGenresByName(Name, UserId, {})).resolves.toBe(null)
  })
})

describe("HlsSegmentServiceApi", () => {
  let instance: api.HlsSegmentServiceApi
  beforeEach(function() {
    instance = new api.HlsSegmentServiceApi(config)
  });

  test("deleteVideosActiveencodings", () => {
    const DeviceId: string = "DeviceId_example"
    const PlaySessionId: string = "PlaySessionId_example"
    return expect(instance.deleteVideosActiveencodings(DeviceId, PlaySessionId, {})).resolves.toBe(null)
  })
  test("postVideosActiveencodingsDelete", () => {
    const DeviceId: string = "DeviceId_example"
    const PlaySessionId: string = "PlaySessionId_example"
    return expect(instance.postVideosActiveencodingsDelete(DeviceId, PlaySessionId, {})).resolves.toBe(null)
  })
})

describe("ImageServiceApi", () => {
  let instance: api.ImageServiceApi
  beforeEach(function() {
    instance = new api.ImageServiceApi(config)
  });

  test("deleteItemsByIdImagesByType", () => {
    const Id: string = "Id_example"
    const Type: ImageType = undefined
    const Index: number = 56
    return expect(instance.deleteItemsByIdImagesByType(Id, Type, Index, {})).resolves.toBe(null)
  })
  test("deleteItemsByIdImagesByTypeByIndex", () => {
    const Id: string = "Id_example"
    const Index: number = 56
    const Type: ImageType = undefined
    return expect(instance.deleteItemsByIdImagesByTypeByIndex(Id, Index, Type, {})).resolves.toBe(null)
  })
  test("deleteUsersByIdImagesByType", () => {
    const Id: string = "Id_example"
    const Type: ImageType = undefined
    const Index: number = 56
    return expect(instance.deleteUsersByIdImagesByType(Id, Type, Index, {})).resolves.toBe(null)
  })
  test("deleteUsersByIdImagesByTypeByIndex", () => {
    const Id: string = "Id_example"
    const Index: number = 56
    const Type: ImageType = undefined
    return expect(instance.deleteUsersByIdImagesByTypeByIndex(Id, Index, Type, {})).resolves.toBe(null)
  })
  test("getArtistsByNameImagesByType", () => {
    const Name: string = "Name_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.getArtistsByNameImagesByType(Name, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("getArtistsByNameImagesByTypeByIndex", () => {
    const Name: string = "Name_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.getArtistsByNameImagesByTypeByIndex(Name, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("getGamegenresByNameImagesByType", () => {
    const Name: string = "Name_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.getGamegenresByNameImagesByType(Name, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("getGamegenresByNameImagesByTypeByIndex", () => {
    const Name: string = "Name_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.getGamegenresByNameImagesByTypeByIndex(Name, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("getGenresByNameImagesByType", () => {
    const Name: string = "Name_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.getGenresByNameImagesByType(Name, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("getGenresByNameImagesByTypeByIndex", () => {
    const Name: string = "Name_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.getGenresByNameImagesByTypeByIndex(Name, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("getItemsByIdImages", () => {
    const Id: string = "Id_example"
    return expect(instance.getItemsByIdImages(Id, {})).resolves.toBe(null)
  })
  test("getItemsByIdImagesByType", () => {
    const Id: string = "Id_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.getItemsByIdImagesByType(Id, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("getItemsByIdImagesByTypeByIndex", () => {
    const Id: string = "Id_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.getItemsByIdImagesByTypeByIndex(Id, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount", () => {
    const PercentPlayed: number = 56
    const UnPlayedCount: number = 56
    const Id: string = "Id_example"
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Tag: string = "Tag_example"
    const Format: string = "Format_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(PercentPlayed, UnPlayedCount, Id, MaxWidth, MaxHeight, Tag, Format, Index, Type, Width, Height, Quality, CropWhitespace, EnableImageEnhancers, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("getMusicgenresByNameImagesByType", () => {
    const Name: string = "Name_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.getMusicgenresByNameImagesByType(Name, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("getMusicgenresByNameImagesByTypeByIndex", () => {
    const Name: string = "Name_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.getMusicgenresByNameImagesByTypeByIndex(Name, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("getPersonsByNameImagesByType", () => {
    const Name: string = "Name_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.getPersonsByNameImagesByType(Name, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("getPersonsByNameImagesByTypeByIndex", () => {
    const Name: string = "Name_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.getPersonsByNameImagesByTypeByIndex(Name, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("getStudiosByNameImagesByType", () => {
    const Name: string = "Name_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.getStudiosByNameImagesByType(Name, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("getStudiosByNameImagesByTypeByIndex", () => {
    const Name: string = "Name_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.getStudiosByNameImagesByTypeByIndex(Name, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("getUsersByIdImagesByType", () => {
    const Id: string = "Id_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.getUsersByIdImagesByType(Id, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("getUsersByIdImagesByTypeByIndex", () => {
    const Id: string = "Id_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.getUsersByIdImagesByTypeByIndex(Id, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("headArtistsByNameImagesByType", () => {
    const Name: string = "Name_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.headArtistsByNameImagesByType(Name, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("headArtistsByNameImagesByTypeByIndex", () => {
    const Name: string = "Name_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.headArtistsByNameImagesByTypeByIndex(Name, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("headGamegenresByNameImagesByType", () => {
    const Name: string = "Name_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.headGamegenresByNameImagesByType(Name, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("headGamegenresByNameImagesByTypeByIndex", () => {
    const Name: string = "Name_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.headGamegenresByNameImagesByTypeByIndex(Name, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("headGenresByNameImagesByType", () => {
    const Name: string = "Name_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.headGenresByNameImagesByType(Name, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("headGenresByNameImagesByTypeByIndex", () => {
    const Name: string = "Name_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.headGenresByNameImagesByTypeByIndex(Name, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("headItemsByIdImagesByType", () => {
    const Id: string = "Id_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.headItemsByIdImagesByType(Id, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("headItemsByIdImagesByTypeByIndex", () => {
    const Id: string = "Id_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.headItemsByIdImagesByTypeByIndex(Id, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount", () => {
    const PercentPlayed: number = 56
    const UnPlayedCount: number = 56
    const Id: string = "Id_example"
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Tag: string = "Tag_example"
    const Format: string = "Format_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(PercentPlayed, UnPlayedCount, Id, MaxWidth, MaxHeight, Tag, Format, Index, Type, Width, Height, Quality, CropWhitespace, EnableImageEnhancers, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("headMusicgenresByNameImagesByType", () => {
    const Name: string = "Name_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.headMusicgenresByNameImagesByType(Name, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("headMusicgenresByNameImagesByTypeByIndex", () => {
    const Name: string = "Name_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.headMusicgenresByNameImagesByTypeByIndex(Name, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("headPersonsByNameImagesByType", () => {
    const Name: string = "Name_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.headPersonsByNameImagesByType(Name, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("headPersonsByNameImagesByTypeByIndex", () => {
    const Name: string = "Name_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.headPersonsByNameImagesByTypeByIndex(Name, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("headStudiosByNameImagesByType", () => {
    const Name: string = "Name_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.headStudiosByNameImagesByType(Name, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("headStudiosByNameImagesByTypeByIndex", () => {
    const Name: string = "Name_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.headStudiosByNameImagesByTypeByIndex(Name, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("headUsersByIdImagesByType", () => {
    const Id: string = "Id_example"
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    const Index: number = 56
    return expect(instance.headUsersByIdImagesByType(Id, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, Index, {})).resolves.toBe(null)
  })
  test("headUsersByIdImagesByTypeByIndex", () => {
    const Id: string = "Id_example"
    const Index: number = 56
    const Type: ImageType = undefined
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const Width: number = 56
    const Height: number = 56
    const Quality: number = 56
    const Tag: string = "Tag_example"
    const CropWhitespace: boolean = true
    const EnableImageEnhancers: boolean = true
    const Format: string = "Format_example"
    const BackgroundColor: string = "BackgroundColor_example"
    const ForegroundLayer: string = "ForegroundLayer_example"
    const AutoOrient: boolean = true
    const KeepAnimation: boolean = true
    return expect(instance.headUsersByIdImagesByTypeByIndex(Id, Index, Type, MaxWidth, MaxHeight, Width, Height, Quality, Tag, CropWhitespace, EnableImageEnhancers, Format, BackgroundColor, ForegroundLayer, AutoOrient, KeepAnimation, {})).resolves.toBe(null)
  })
  test("postItemsByIdImagesByType", () => {
    const body: Object = undefined
    const Id: string = "Id_example"
    const Type: ImageType = undefined
    const Index: number = 56
    return expect(instance.postItemsByIdImagesByType(body, Id, Type, Index, {})).resolves.toBe(null)
  })
  test("postItemsByIdImagesByTypeByIndex", () => {
    const body: Object = undefined
    const Id: string = "Id_example"
    const Index: number = 56
    const Type: ImageType = undefined
    return expect(instance.postItemsByIdImagesByTypeByIndex(body, Id, Index, Type, {})).resolves.toBe(null)
  })
  test("postItemsByIdImagesByTypeByIndexDelete", () => {
    const Id: string = "Id_example"
    const Index: number = 56
    const Type: ImageType = undefined
    return expect(instance.postItemsByIdImagesByTypeByIndexDelete(Id, Index, Type, {})).resolves.toBe(null)
  })
  test("postItemsByIdImagesByTypeByIndexIndex", () => {
    const Id: string = "Id_example"
    const Type: ImageType = undefined
    const Index: number = 56
    const NewIndex: number = 56
    return expect(instance.postItemsByIdImagesByTypeByIndexIndex(Id, Type, Index, NewIndex, {})).resolves.toBe(null)
  })
  test("postItemsByIdImagesByTypeByIndexUrl", () => {
    const Id: string = "Id_example"
    const Type: ImageType = undefined
    const Index: number = 56
    const Url: string = "Url_example"
    return expect(instance.postItemsByIdImagesByTypeByIndexUrl(Id, Type, Index, Url, {})).resolves.toBe(null)
  })
  test("postItemsByIdImagesByTypeDelete", () => {
    const Id: string = "Id_example"
    const Type: ImageType = undefined
    const Index: number = 56
    return expect(instance.postItemsByIdImagesByTypeDelete(Id, Type, Index, {})).resolves.toBe(null)
  })
  test("postUsersByIdImagesByType", () => {
    const body: Object = undefined
    const Id: string = "Id_example"
    const Type: ImageType = undefined
    return expect(instance.postUsersByIdImagesByType(body, Id, Type, {})).resolves.toBe(null)
  })
  test("postUsersByIdImagesByTypeByIndex", () => {
    const body: Object = undefined
    const Id: string = "Id_example"
    const Type: ImageType = undefined
    return expect(instance.postUsersByIdImagesByTypeByIndex(body, Id, Type, {})).resolves.toBe(null)
  })
  test("postUsersByIdImagesByTypeByIndexDelete", () => {
    const Id: string = "Id_example"
    const Index: number = 56
    const Type: ImageType = undefined
    return expect(instance.postUsersByIdImagesByTypeByIndexDelete(Id, Index, Type, {})).resolves.toBe(null)
  })
  test("postUsersByIdImagesByTypeDelete", () => {
    const Id: string = "Id_example"
    const Type: ImageType = undefined
    const Index: number = 56
    return expect(instance.postUsersByIdImagesByTypeDelete(Id, Type, Index, {})).resolves.toBe(null)
  })
})

describe("InstantMixServiceApi", () => {
  let instance: api.InstantMixServiceApi
  beforeEach(function() {
    instance = new api.InstantMixServiceApi(config)
  });

  test("getAlbumsByIdInstantmix", () => {
    const Id: string = "Id_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const Fields: string = "Fields_example"
    return expect(instance.getAlbumsByIdInstantmix(Id, IncludeItemTypes, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, UserId, Limit, Fields, {})).resolves.toBe(null)
  })
  test("getArtistsInstantmix", () => {
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const Fields: string = "Fields_example"
    return expect(instance.getArtistsInstantmix(IncludeItemTypes, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, UserId, Limit, Fields, {})).resolves.toBe(null)
  })
  test("getAudiobooksNextup", () => {
    const UserId: string = "UserId_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Fields: string = "Fields_example"
    const AlbumId: string = "AlbumId_example"
    const ParentId: string = "ParentId_example"
    const EnableImages: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const EnableUserData: boolean = true
    return expect(instance.getAudiobooksNextup(UserId, StartIndex, Limit, Fields, AlbumId, ParentId, EnableImages, ImageTypeLimit, EnableImageTypes, EnableUserData, {})).resolves.toBe(null)
  })
  test("getItemsByIdInstantmix", () => {
    const Id: string = "Id_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const Fields: string = "Fields_example"
    return expect(instance.getItemsByIdInstantmix(Id, IncludeItemTypes, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, UserId, Limit, Fields, {})).resolves.toBe(null)
  })
  test("getMusicgenresByNameInstantmix", () => {
    const Name: string = "Name_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const Fields: string = "Fields_example"
    return expect(instance.getMusicgenresByNameInstantmix(Name, IncludeItemTypes, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, UserId, Limit, Fields, {})).resolves.toBe(null)
  })
  test("getMusicgenresInstantmix", () => {
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const Fields: string = "Fields_example"
    return expect(instance.getMusicgenresInstantmix(IncludeItemTypes, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, UserId, Limit, Fields, {})).resolves.toBe(null)
  })
  test("getPlaylistsByIdInstantmix", () => {
    const Id: string = "Id_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const Fields: string = "Fields_example"
    return expect(instance.getPlaylistsByIdInstantmix(Id, IncludeItemTypes, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, UserId, Limit, Fields, {})).resolves.toBe(null)
  })
  test("getSongsByIdInstantmix", () => {
    const Id: string = "Id_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const Fields: string = "Fields_example"
    return expect(instance.getSongsByIdInstantmix(Id, IncludeItemTypes, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, UserId, Limit, Fields, {})).resolves.toBe(null)
  })
})

describe("ItemLookupServiceApi", () => {
  let instance: api.ItemLookupServiceApi
  beforeEach(function() {
    instance = new api.ItemLookupServiceApi(config)
  });

  test("getItemsByIdExternalidinfos", () => {
    const Id: string = "Id_example"
    return expect(instance.getItemsByIdExternalidinfos(Id, {})).resolves.toBe(null)
  })
  test("getItemsRemotesearchImage", () => {
    const ImageUrl: string = "ImageUrl_example"
    const ProviderName: string = "ProviderName_example"
    return expect(instance.getItemsRemotesearchImage(ImageUrl, ProviderName, {})).resolves.toBe(null)
  })
  test("postItemsMetadataReset", () => {
    const ItemIds: string = "ItemIds_example"
    return expect(instance.postItemsMetadataReset(ItemIds, {})).resolves.toBe(null)
  })
  test("postItemsRemotesearchApplyById", () => {
    const body: api.RemoteSearchResult = undefined
    const Id: string = "Id_example"
    const ReplaceAllImages: boolean = true
    return expect(instance.postItemsRemotesearchApplyById(body, Id, ReplaceAllImages, {})).resolves.toBe(null)
  })
  test("postItemsRemotesearchBook", () => {
    const body: api.RemoteSearchQueryBookInfo = undefined
    return expect(instance.postItemsRemotesearchBook(body, {})).resolves.toBe(null)
  })
  test("postItemsRemotesearchBoxset", () => {
    const body: api.RemoteSearchQueryItemLookupInfo = undefined
    return expect(instance.postItemsRemotesearchBoxset(body, {})).resolves.toBe(null)
  })
  test("postItemsRemotesearchGame", () => {
    const body: api.RemoteSearchQueryGameInfo = undefined
    return expect(instance.postItemsRemotesearchGame(body, {})).resolves.toBe(null)
  })
  test("postItemsRemotesearchMovie", () => {
    const body: api.RemoteSearchQueryMovieInfo = undefined
    return expect(instance.postItemsRemotesearchMovie(body, {})).resolves.toBe(null)
  })
  test("postItemsRemotesearchMusicalbum", () => {
    const body: api.RemoteSearchQueryAlbumInfo = undefined
    return expect(instance.postItemsRemotesearchMusicalbum(body, {})).resolves.toBe(null)
  })
  test("postItemsRemotesearchMusicartist", () => {
    const body: api.RemoteSearchQueryArtistInfo = undefined
    return expect(instance.postItemsRemotesearchMusicartist(body, {})).resolves.toBe(null)
  })
  test("postItemsRemotesearchMusicvideo", () => {
    const body: api.RemoteSearchQueryMusicVideoInfo = undefined
    return expect(instance.postItemsRemotesearchMusicvideo(body, {})).resolves.toBe(null)
  })
  test("postItemsRemotesearchPerson", () => {
    const body: api.RemoteSearchQueryPersonLookupInfo = undefined
    return expect(instance.postItemsRemotesearchPerson(body, {})).resolves.toBe(null)
  })
  test("postItemsRemotesearchSeries", () => {
    const body: api.RemoteSearchQuerySeriesInfo = undefined
    return expect(instance.postItemsRemotesearchSeries(body, {})).resolves.toBe(null)
  })
  test("postItemsRemotesearchTrailer", () => {
    const body: api.RemoteSearchQueryTrailerInfo = undefined
    return expect(instance.postItemsRemotesearchTrailer(body, {})).resolves.toBe(null)
  })
})

describe("ItemRefreshServiceApi", () => {
  let instance: api.ItemRefreshServiceApi
  beforeEach(function() {
    instance = new api.ItemRefreshServiceApi(config)
  });

  test("postItemsByIdRefresh", () => {
    const Id: string = "Id_example"
    const Recursive: boolean = true
    const MetadataRefreshMode: MetadataRefreshMode = undefined
    const ImageRefreshMode: MetadataRefreshMode = undefined
    const ReplaceAllMetadata: boolean = true
    const ReplaceAllImages: boolean = true
    return expect(instance.postItemsByIdRefresh(Id, Recursive, MetadataRefreshMode, ImageRefreshMode, ReplaceAllMetadata, ReplaceAllImages, {})).resolves.toBe(null)
  })
})

describe("ItemUpdateServiceApi", () => {
  let instance: api.ItemUpdateServiceApi
  beforeEach(function() {
    instance = new api.ItemUpdateServiceApi(config)
  });

  test("getItemsByItemidMetadataeditor", () => {
    const ItemId: string = "ItemId_example"
    return expect(instance.getItemsByItemidMetadataeditor(ItemId, {})).resolves.toBe(null)
  })
  test("postItemsByItemid", () => {
    const body: api.BaseItemDto = undefined
    const ItemId: string = "ItemId_example"
    return expect(instance.postItemsByItemid(body, ItemId, {})).resolves.toBe(null)
  })
})

describe("ItemsServiceApi", () => {
  let instance: api.ItemsServiceApi
  beforeEach(function() {
    instance = new api.ItemsServiceApi(config)
  });

  test("getItems", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getItems(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItems", () => {
    const UserId: string = "UserId_example"
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getUsersByUseridItems(UserId, ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItemsResume", () => {
    const UserId: string = "UserId_example"
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getUsersByUseridItemsResume(UserId, ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
})

describe("LibraryServiceApi", () => {
  let instance: api.LibraryServiceApi
  beforeEach(function() {
    instance = new api.LibraryServiceApi(config)
  });

  test("deleteItems", () => {
    const Ids: string = "Ids_example"
    return expect(instance.deleteItems(Ids, {})).resolves.toBe(null)
  })
  test("deleteItemsById", () => {
    const Id: string = "Id_example"
    return expect(instance.deleteItemsById(Id, {})).resolves.toBe(null)
  })
  test("getAlbumsByIdSimilar", () => {
    const Id: string = "Id_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const Fields: string = "Fields_example"
    return expect(instance.getAlbumsByIdSimilar(Id, IncludeItemTypes, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, UserId, Limit, Fields, {})).resolves.toBe(null)
  })
  test("getArtistsByIdSimilar", () => {
    const Id: string = "Id_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const Fields: string = "Fields_example"
    return expect(instance.getArtistsByIdSimilar(Id, IncludeItemTypes, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, UserId, Limit, Fields, {})).resolves.toBe(null)
  })
  test("getGamesByIdSimilar", () => {
    const Id: string = "Id_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const Fields: string = "Fields_example"
    return expect(instance.getGamesByIdSimilar(Id, IncludeItemTypes, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, UserId, Limit, Fields, {})).resolves.toBe(null)
  })
  test("getItemsByIdAncestors", () => {
    const Id: string = "Id_example"
    const UserId: string = "UserId_example"
    return expect(instance.getItemsByIdAncestors(Id, UserId, {})).resolves.toBe(null)
  })
  test("getItemsByIdCriticreviews", () => {
    const Id: string = "Id_example"
    const StartIndex: number = 56
    const Limit: number = 56
    return expect(instance.getItemsByIdCriticreviews(Id, StartIndex, Limit, {})).resolves.toBe(null)
  })
  test("getItemsByIdDeleteinfo", () => {
    const Id: string = "Id_example"
    return expect(instance.getItemsByIdDeleteinfo(Id, {})).resolves.toBe(null)
  })
  test("getItemsByIdDownload", () => {
    const Id: string = "Id_example"
    return expect(instance.getItemsByIdDownload(Id, {})).resolves.toBe(null)
  })
  test("getItemsByIdFile", () => {
    const Id: string = "Id_example"
    return expect(instance.getItemsByIdFile(Id, {})).resolves.toBe(null)
  })
  test("getItemsByIdSimilar", () => {
    const Id: string = "Id_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const Fields: string = "Fields_example"
    return expect(instance.getItemsByIdSimilar(Id, IncludeItemTypes, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, UserId, Limit, Fields, {})).resolves.toBe(null)
  })
  test("getItemsByIdThememedia", () => {
    const Id: string = "Id_example"
    const UserId: string = "UserId_example"
    const InheritFromParent: boolean = true
    const EnableImages: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const EnableUserData: boolean = true
    const Fields: string = "Fields_example"
    return expect(instance.getItemsByIdThememedia(Id, UserId, InheritFromParent, EnableImages, ImageTypeLimit, EnableImageTypes, EnableUserData, Fields, {})).resolves.toBe(null)
  })
  test("getItemsByIdThemesongs", () => {
    const Id: string = "Id_example"
    const UserId: string = "UserId_example"
    const InheritFromParent: boolean = true
    const EnableImages: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const EnableUserData: boolean = true
    const Fields: string = "Fields_example"
    return expect(instance.getItemsByIdThemesongs(Id, UserId, InheritFromParent, EnableImages, ImageTypeLimit, EnableImageTypes, EnableUserData, Fields, {})).resolves.toBe(null)
  })
  test("getItemsByIdThemevideos", () => {
    const Id: string = "Id_example"
    const UserId: string = "UserId_example"
    const InheritFromParent: boolean = true
    const EnableImages: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const EnableUserData: boolean = true
    const Fields: string = "Fields_example"
    return expect(instance.getItemsByIdThemevideos(Id, UserId, InheritFromParent, EnableImages, ImageTypeLimit, EnableImageTypes, EnableUserData, Fields, {})).resolves.toBe(null)
  })
  test("getItemsCounts", () => {
    const UserId: string = "UserId_example"
    const IsFavorite: boolean = true
    return expect(instance.getItemsCounts(UserId, IsFavorite, {})).resolves.toBe(null)
  })
  test("getItemsIntros", () => {
    return expect(instance.getItemsIntros({})).resolves.toBe(null)
  })
  test("getLibrariesAvailableoptions", () => {
    return expect(instance.getLibrariesAvailableoptions({})).resolves.toBe(null)
  })
  test("getLibraryMediafolders", () => {
    const IsHidden: boolean = true
    return expect(instance.getLibraryMediafolders(IsHidden, {})).resolves.toBe(null)
  })
  test("getLibraryPhysicalpaths", () => {
    return expect(instance.getLibraryPhysicalpaths({})).resolves.toBe(null)
  })
  test("getLibrarySelectablemediafolders", () => {
    return expect(instance.getLibrarySelectablemediafolders({})).resolves.toBe(null)
  })
  test("getMoviesByIdSimilar", () => {
    const Id: string = "Id_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const Fields: string = "Fields_example"
    return expect(instance.getMoviesByIdSimilar(Id, IncludeItemTypes, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, UserId, Limit, Fields, {})).resolves.toBe(null)
  })
  test("getShowsByIdSimilar", () => {
    const Id: string = "Id_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const Fields: string = "Fields_example"
    return expect(instance.getShowsByIdSimilar(Id, IncludeItemTypes, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, UserId, Limit, Fields, {})).resolves.toBe(null)
  })
  test("getTrailersByIdSimilar", () => {
    const Id: string = "Id_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const Fields: string = "Fields_example"
    return expect(instance.getTrailersByIdSimilar(Id, IncludeItemTypes, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, UserId, Limit, Fields, {})).resolves.toBe(null)
  })
  test("postItemsByIdDelete", () => {
    const Id: string = "Id_example"
    return expect(instance.postItemsByIdDelete(Id, {})).resolves.toBe(null)
  })
  test("postItemsDelete", () => {
    const Ids: string = "Ids_example"
    return expect(instance.postItemsDelete(Ids, {})).resolves.toBe(null)
  })
  test("postLibraryMediaUpdated", () => {
    const body: api.LibraryPostUpdatedMedia = undefined
    return expect(instance.postLibraryMediaUpdated(body, {})).resolves.toBe(null)
  })
  test("postLibraryMoviesAdded", () => {
    return expect(instance.postLibraryMoviesAdded({})).resolves.toBe(null)
  })
  test("postLibraryMoviesUpdated", () => {
    return expect(instance.postLibraryMoviesUpdated({})).resolves.toBe(null)
  })
  test("postLibraryRefresh", () => {
    return expect(instance.postLibraryRefresh({})).resolves.toBe(null)
  })
  test("postLibrarySeriesAdded", () => {
    return expect(instance.postLibrarySeriesAdded({})).resolves.toBe(null)
  })
  test("postLibrarySeriesUpdated", () => {
    return expect(instance.postLibrarySeriesUpdated({})).resolves.toBe(null)
  })
})

describe("LibraryStructureServiceApi", () => {
  let instance: api.LibraryStructureServiceApi
  beforeEach(function() {
    instance = new api.LibraryStructureServiceApi(config)
  });

  test("deleteLibraryVirtualfolders", () => {
    return expect(instance.deleteLibraryVirtualfolders({})).resolves.toBe(null)
  })
  test("deleteLibraryVirtualfoldersPaths", () => {
    return expect(instance.deleteLibraryVirtualfoldersPaths({})).resolves.toBe(null)
  })
  test("getLibraryVirtualfoldersQuery", () => {
    const StartIndex: number = 56
    const Limit: number = 56
    return expect(instance.getLibraryVirtualfoldersQuery(StartIndex, Limit, {})).resolves.toBe(null)
  })
  test("postLibraryVirtualfolders", () => {
    const body: api.LibraryAddVirtualFolder = undefined
    return expect(instance.postLibraryVirtualfolders(body, {})).resolves.toBe(null)
  })
  test("postLibraryVirtualfoldersDelete", () => {
    const body: api.LibraryRemoveVirtualFolder = undefined
    return expect(instance.postLibraryVirtualfoldersDelete(body, {})).resolves.toBe(null)
  })
  test("postLibraryVirtualfoldersLibraryoptions", () => {
    const body: api.LibraryUpdateLibraryOptions = undefined
    return expect(instance.postLibraryVirtualfoldersLibraryoptions(body, {})).resolves.toBe(null)
  })
  test("postLibraryVirtualfoldersName", () => {
    const body: api.LibraryRenameVirtualFolder = undefined
    return expect(instance.postLibraryVirtualfoldersName(body, {})).resolves.toBe(null)
  })
  test("postLibraryVirtualfoldersPaths", () => {
    const body: api.LibraryAddMediaPath = undefined
    return expect(instance.postLibraryVirtualfoldersPaths(body, {})).resolves.toBe(null)
  })
  test("postLibraryVirtualfoldersPathsDelete", () => {
    const body: api.LibraryRemoveMediaPath = undefined
    return expect(instance.postLibraryVirtualfoldersPathsDelete(body, {})).resolves.toBe(null)
  })
  test("postLibraryVirtualfoldersPathsUpdate", () => {
    const body: api.LibraryUpdateMediaPath = undefined
    return expect(instance.postLibraryVirtualfoldersPathsUpdate(body, {})).resolves.toBe(null)
  })
})

describe("LiveStreamServiceApi", () => {
  let instance: api.LiveStreamServiceApi
  beforeEach(function() {
    instance = new api.LiveStreamServiceApi(config)
  });

  test("getLivetvLiverecordingsByIdHlsBySegment", () => {
    const Id: string = "Id_example"
    const Segment: string = "Segment_example"
    return expect(instance.getLivetvLiverecordingsByIdHlsBySegment(Id, Segment, {})).resolves.toBe(null)
  })
  test("getLivetvLiverecordingsByIdHlsLiveM3u8", () => {
    const Id: string = "Id_example"
    return expect(instance.getLivetvLiverecordingsByIdHlsLiveM3u8(Id, {})).resolves.toBe(null)
  })
  test("getLivetvLiverecordingsByIdHlsMasterM3u8", () => {
    const Id: string = "Id_example"
    return expect(instance.getLivetvLiverecordingsByIdHlsMasterM3u8(Id, {})).resolves.toBe(null)
  })
  test("getLivetvLiverecordingsByIdStream", () => {
    const Id: string = "Id_example"
    return expect(instance.getLivetvLiverecordingsByIdStream(Id, {})).resolves.toBe(null)
  })
  test("getLivetvLivestreamfilesByIdHlsBySegment", () => {
    const Id: string = "Id_example"
    const Segment: string = "Segment_example"
    return expect(instance.getLivetvLivestreamfilesByIdHlsBySegment(Id, Segment, {})).resolves.toBe(null)
  })
  test("getLivetvLivestreamfilesByIdHlsLiveM3u8", () => {
    const Id: string = "Id_example"
    return expect(instance.getLivetvLivestreamfilesByIdHlsLiveM3u8(Id, {})).resolves.toBe(null)
  })
  test("getLivetvLivestreamfilesByIdHlsMasterM3u8", () => {
    const Id: string = "Id_example"
    return expect(instance.getLivetvLivestreamfilesByIdHlsMasterM3u8(Id, {})).resolves.toBe(null)
  })
  test("getLivetvLivestreamfilesByIdStreamByContainer", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    return expect(instance.getLivetvLivestreamfilesByIdStreamByContainer(Id, Container, {})).resolves.toBe(null)
  })
  test("headLivetvLiverecordingsByIdHlsBySegment", () => {
    const Id: string = "Id_example"
    const Segment: string = "Segment_example"
    return expect(instance.headLivetvLiverecordingsByIdHlsBySegment(Id, Segment, {})).resolves.toBe(null)
  })
  test("headLivetvLiverecordingsByIdHlsLiveM3u8", () => {
    const Id: string = "Id_example"
    return expect(instance.headLivetvLiverecordingsByIdHlsLiveM3u8(Id, {})).resolves.toBe(null)
  })
  test("headLivetvLiverecordingsByIdHlsMasterM3u8", () => {
    const Id: string = "Id_example"
    return expect(instance.headLivetvLiverecordingsByIdHlsMasterM3u8(Id, {})).resolves.toBe(null)
  })
  test("headLivetvLivestreamfilesByIdHlsBySegment", () => {
    const Id: string = "Id_example"
    const Segment: string = "Segment_example"
    return expect(instance.headLivetvLivestreamfilesByIdHlsBySegment(Id, Segment, {})).resolves.toBe(null)
  })
  test("headLivetvLivestreamfilesByIdHlsLiveM3u8", () => {
    const Id: string = "Id_example"
    return expect(instance.headLivetvLivestreamfilesByIdHlsLiveM3u8(Id, {})).resolves.toBe(null)
  })
  test("headLivetvLivestreamfilesByIdHlsMasterM3u8", () => {
    const Id: string = "Id_example"
    return expect(instance.headLivetvLivestreamfilesByIdHlsMasterM3u8(Id, {})).resolves.toBe(null)
  })
})

describe("LiveTvServiceApi", () => {
  let instance: api.LiveTvServiceApi
  beforeEach(function() {
    instance = new api.LiveTvServiceApi(config)
  });

  test("deleteLivetvChannelmappingoptions", () => {
    const ProviderId: string = "ProviderId_example"
    return expect(instance.deleteLivetvChannelmappingoptions(ProviderId, {})).resolves.toBe(null)
  })
  test("deleteLivetvChannelmappings", () => {
    const ProviderId: string = "ProviderId_example"
    return expect(instance.deleteLivetvChannelmappings(ProviderId, {})).resolves.toBe(null)
  })
  test("deleteLivetvListingproviders", () => {
    const Id: string = "Id_example"
    return expect(instance.deleteLivetvListingproviders(Id, {})).resolves.toBe(null)
  })
  test("deleteLivetvRecordingsById", () => {
    const Id: string = "Id_example"
    return expect(instance.deleteLivetvRecordingsById(Id, {})).resolves.toBe(null)
  })
  test("deleteLivetvSeriestimersById", () => {
    const Id: string = "Id_example"
    return expect(instance.deleteLivetvSeriestimersById(Id, {})).resolves.toBe(null)
  })
  test("deleteLivetvTimersById", () => {
    const Id: string = "Id_example"
    return expect(instance.deleteLivetvTimersById(Id, {})).resolves.toBe(null)
  })
  test("deleteLivetvTunerhosts", () => {
    const Id: string = "Id_example"
    return expect(instance.deleteLivetvTunerhosts(Id, {})).resolves.toBe(null)
  })
  test("getLivetvAvailablerecordingoptions", () => {
    return expect(instance.getLivetvAvailablerecordingoptions({})).resolves.toBe(null)
  })
  test("getLivetvChannelmappingoptions", () => {
    const ProviderId: string = "ProviderId_example"
    return expect(instance.getLivetvChannelmappingoptions(ProviderId, {})).resolves.toBe(null)
  })
  test("getLivetvChannelmappings", () => {
    const ProviderId: string = "ProviderId_example"
    return expect(instance.getLivetvChannelmappings(ProviderId, {})).resolves.toBe(null)
  })
  test("getLivetvChannels", () => {
    const Type: LiveTvChannelType = undefined
    const IsLiked: boolean = true
    const IsDisliked: boolean = true
    const EnableFavoriteSorting: boolean = true
    const AddCurrentProgram: boolean = true
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getLivetvChannels(Type, IsLiked, IsDisliked, EnableFavoriteSorting, AddCurrentProgram, ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getLivetvChannelsById", () => {
    const Id: string = "Id_example"
    const UserId: string = "UserId_example"
    return expect(instance.getLivetvChannelsById(Id, UserId, {})).resolves.toBe(null)
  })
  test("getLivetvChanneltags", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getLivetvChanneltags(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getLivetvChanneltagsPrefixes", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getLivetvChanneltagsPrefixes(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getLivetvEPG", () => {
    const Type: LiveTvChannelType = undefined
    const IsLiked: boolean = true
    const IsDisliked: boolean = true
    const EnableFavoriteSorting: boolean = true
    const AddCurrentProgram: boolean = true
    const ChannelIds: string = "ChannelIds_example"
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getLivetvEPG(Type, IsLiked, IsDisliked, EnableFavoriteSorting, AddCurrentProgram, ChannelIds, ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getLivetvFolder", () => {
    return expect(instance.getLivetvFolder({})).resolves.toBe(null)
  })
  test("getLivetvGuideinfo", () => {
    return expect(instance.getLivetvGuideinfo({})).resolves.toBe(null)
  })
  test("getLivetvInfo", () => {
    return expect(instance.getLivetvInfo({})).resolves.toBe(null)
  })
  test("getLivetvListingproviders", () => {
    const ChannelId: string = "ChannelId_example"
    return expect(instance.getLivetvListingproviders(ChannelId, {})).resolves.toBe(null)
  })
  test("getLivetvListingprovidersAvailable", () => {
    return expect(instance.getLivetvListingprovidersAvailable({})).resolves.toBe(null)
  })
  test("getLivetvListingprovidersDefault", () => {
    return expect(instance.getLivetvListingprovidersDefault({})).resolves.toBe(null)
  })
  test("getLivetvListingprovidersLineups", () => {
    const Id: string = "Id_example"
    const Type: string = "Type_example"
    const Location: string = "Location_example"
    const Country: string = "Country_example"
    return expect(instance.getLivetvListingprovidersLineups(Id, Type, Location, Country, {})).resolves.toBe(null)
  })
  test("getLivetvListingprovidersSchedulesdirectCountries", () => {
    return expect(instance.getLivetvListingprovidersSchedulesdirectCountries({})).resolves.toBe(null)
  })
  test("getLivetvManageChannels", () => {
    const StartIndex: number = 56
    const Limit: number = 56
    const SortBy: string = "SortBy_example"
    const SortOrder: string = "SortOrder_example"
    return expect(instance.getLivetvManageChannels(StartIndex, Limit, SortBy, SortOrder, {})).resolves.toBe(null)
  })
  test("getLivetvPrograms", () => {
    const ChannelIds: string = "ChannelIds_example"
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getLivetvPrograms(ChannelIds, ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getLivetvProgramsRecommended", () => {
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const IsAiring: boolean = true
    const HasAired: boolean = true
    const IsSeries: boolean = true
    const IsMovie: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const EnableImages: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const GenreIds: string = "GenreIds_example"
    const Fields: string = "Fields_example"
    const EnableUserData: boolean = true
    return expect(instance.getLivetvProgramsRecommended(UserId, Limit, IsAiring, HasAired, IsSeries, IsMovie, IsNews, IsKids, IsSports, EnableImages, ImageTypeLimit, EnableImageTypes, GenreIds, Fields, EnableUserData, {})).resolves.toBe(null)
  })
  test("getLivetvRecordings", () => {
    const ChannelId: string = "ChannelId_example"
    const Status: LiveTvRecordingStatus = undefined
    const IsInProgress: boolean = true
    const SeriesTimerId: string = "SeriesTimerId_example"
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getLivetvRecordings(ChannelId, Status, IsInProgress, SeriesTimerId, ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getLivetvRecordingsById", () => {
    const Id: string = "Id_example"
    const UserId: string = "UserId_example"
    return expect(instance.getLivetvRecordingsById(Id, UserId, {})).resolves.toBe(null)
  })
  test("getLivetvRecordingsFolders", () => {
    const UserId: string = "UserId_example"
    const Fields: string = "Fields_example"
    const EnableImages: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const EnableUserData: boolean = true
    return expect(instance.getLivetvRecordingsFolders(UserId, Fields, EnableImages, ImageTypeLimit, EnableImageTypes, EnableUserData, {})).resolves.toBe(null)
  })
  test("getLivetvRecordingsGroups", () => {
    return expect(instance.getLivetvRecordingsGroups({})).resolves.toBe(null)
  })
  test("getLivetvRecordingsSeries", () => {
    return expect(instance.getLivetvRecordingsSeries({})).resolves.toBe(null)
  })
  test("getLivetvSeriestimers", () => {
    const SortBy: string = "SortBy_example"
    const SortOrder: SortOrder = undefined
    const StartIndex: number = 56
    const Limit: number = 56
    return expect(instance.getLivetvSeriestimers(SortBy, SortOrder, StartIndex, Limit, {})).resolves.toBe(null)
  })
  test("getLivetvSeriestimersById", () => {
    const Id: string = "Id_example"
    return expect(instance.getLivetvSeriestimersById(Id, {})).resolves.toBe(null)
  })
  test("getLivetvTimers", () => {
    const ChannelId: string = "ChannelId_example"
    const SeriesTimerId: string = "SeriesTimerId_example"
    return expect(instance.getLivetvTimers(ChannelId, SeriesTimerId, {})).resolves.toBe(null)
  })
  test("getLivetvTimersById", () => {
    const Id: string = "Id_example"
    return expect(instance.getLivetvTimersById(Id, {})).resolves.toBe(null)
  })
  test("getLivetvTimersDefaults", () => {
    const ProgramId: string = "ProgramId_example"
    return expect(instance.getLivetvTimersDefaults(ProgramId, {})).resolves.toBe(null)
  })
  test("getLivetvTunerhosts", () => {
    return expect(instance.getLivetvTunerhosts({})).resolves.toBe(null)
  })
  test("getLivetvTunerhostsDefaultByType", () => {
    const Type: string = "Type_example"
    return expect(instance.getLivetvTunerhostsDefaultByType(Type, {})).resolves.toBe(null)
  })
  test("getLivetvTunerhostsTypes", () => {
    return expect(instance.getLivetvTunerhostsTypes({})).resolves.toBe(null)
  })
  test("getLivetvTunersDiscover", () => {
    return expect(instance.getLivetvTunersDiscover({})).resolves.toBe(null)
  })
  test("getLivetvTunersDiscvover", () => {
    return expect(instance.getLivetvTunersDiscvover({})).resolves.toBe(null)
  })
  test("headLivetvChannelmappingoptions", () => {
    const ProviderId: string = "ProviderId_example"
    return expect(instance.headLivetvChannelmappingoptions(ProviderId, {})).resolves.toBe(null)
  })
  test("headLivetvChannelmappings", () => {
    const ProviderId: string = "ProviderId_example"
    return expect(instance.headLivetvChannelmappings(ProviderId, {})).resolves.toBe(null)
  })
  test("postLivetvChannelmappingoptions", () => {
    const ProviderId: string = "ProviderId_example"
    return expect(instance.postLivetvChannelmappingoptions(ProviderId, {})).resolves.toBe(null)
  })
  test("postLivetvChannelmappings", () => {
    const body: api.ApiSetChannelMapping = undefined
    const ProviderId: string = "ProviderId_example"
    return expect(instance.postLivetvChannelmappings(body, ProviderId, {})).resolves.toBe(null)
  })
  test("postLivetvListingproviders", () => {
    const body: api.LiveTvListingsProviderInfo = undefined
    return expect(instance.postLivetvListingproviders(body, {})).resolves.toBe(null)
  })
  test("postLivetvListingprovidersDelete", () => {
    const Id: string = "Id_example"
    return expect(instance.postLivetvListingprovidersDelete(Id, {})).resolves.toBe(null)
  })
  test("postLivetvManageChannelsByIdDisabled", () => {
    const body: api.ApiSetChannelDisabled = undefined
    const Id: string = "Id_example"
    return expect(instance.postLivetvManageChannelsByIdDisabled(body, Id, {})).resolves.toBe(null)
  })
  test("postLivetvManageChannelsByIdSortindex", () => {
    const body: api.ApiSetChannelSortIndex = undefined
    const Id: string = "Id_example"
    return expect(instance.postLivetvManageChannelsByIdSortindex(body, Id, {})).resolves.toBe(null)
  })
  test("postLivetvPrograms", () => {
    const body: api.ApiBaseItemsRequest = undefined
    const ChannelIds: string = "ChannelIds_example"
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.postLivetvPrograms(body, ChannelIds, ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("postLivetvRecordingsByIdDelete", () => {
    const Id: string = "Id_example"
    return expect(instance.postLivetvRecordingsByIdDelete(Id, {})).resolves.toBe(null)
  })
  test("postLivetvSeriestimers", () => {
    const body: api.LiveTvSeriesTimerInfo = undefined
    return expect(instance.postLivetvSeriestimers(body, {})).resolves.toBe(null)
  })
  test("postLivetvSeriestimersById", () => {
    const body: api.LiveTvSeriesTimerInfo = undefined
    const Id: string = "Id_example"
    return expect(instance.postLivetvSeriestimersById(body, Id, {})).resolves.toBe(null)
  })
  test("postLivetvSeriestimersByIdDelete", () => {
    const Id: string = "Id_example"
    return expect(instance.postLivetvSeriestimersByIdDelete(Id, {})).resolves.toBe(null)
  })
  test("postLivetvTimers", () => {
    const body: api.LiveTvTimerInfoDto = undefined
    return expect(instance.postLivetvTimers(body, {})).resolves.toBe(null)
  })
  test("postLivetvTimersById", () => {
    const body: api.LiveTvTimerInfoDto = undefined
    const Id: string = "Id_example"
    return expect(instance.postLivetvTimersById(body, Id, {})).resolves.toBe(null)
  })
  test("postLivetvTimersByIdDelete", () => {
    const Id: string = "Id_example"
    return expect(instance.postLivetvTimersByIdDelete(Id, {})).resolves.toBe(null)
  })
  test("postLivetvTunerhosts", () => {
    const body: api.LiveTvTunerHostInfo = undefined
    return expect(instance.postLivetvTunerhosts(body, {})).resolves.toBe(null)
  })
  test("postLivetvTunerhostsDelete", () => {
    const Id: string = "Id_example"
    return expect(instance.postLivetvTunerhostsDelete(Id, {})).resolves.toBe(null)
  })
  test("postLivetvTunersByIdReset", () => {
    const Id: string = "Id_example"
    return expect(instance.postLivetvTunersByIdReset(Id, {})).resolves.toBe(null)
  })
  test("putLivetvChannelmappingoptions", () => {
    const ProviderId: string = "ProviderId_example"
    return expect(instance.putLivetvChannelmappingoptions(ProviderId, {})).resolves.toBe(null)
  })
  test("putLivetvChannelmappings", () => {
    const body: api.ApiSetChannelMapping = undefined
    const ProviderId: string = "ProviderId_example"
    return expect(instance.putLivetvChannelmappings(body, ProviderId, {})).resolves.toBe(null)
  })
})

describe("LocalizationServiceApi", () => {
  let instance: api.LocalizationServiceApi
  beforeEach(function() {
    instance = new api.LocalizationServiceApi(config)
  });

  test("getLocalizationCountries", () => {
    return expect(instance.getLocalizationCountries({})).resolves.toBe(null)
  })
  test("getLocalizationCultures", () => {
    return expect(instance.getLocalizationCultures({})).resolves.toBe(null)
  })
  test("getLocalizationOptions", () => {
    return expect(instance.getLocalizationOptions({})).resolves.toBe(null)
  })
  test("getLocalizationParentalratings", () => {
    return expect(instance.getLocalizationParentalratings({})).resolves.toBe(null)
  })
})

describe("MediaInfoServiceApi", () => {
  let instance: api.MediaInfoServiceApi
  beforeEach(function() {
    instance = new api.MediaInfoServiceApi(config)
  });

  test("getItemsByIdPlaybackinfo", () => {
    const Id: string = "Id_example"
    const UserId: string = "UserId_example"
    return expect(instance.getItemsByIdPlaybackinfo(Id, UserId, {})).resolves.toBe(null)
  })
  test("getPlaybackBitratetest", () => {
    const Size: number = 789
    return expect(instance.getPlaybackBitratetest(Size, {})).resolves.toBe(null)
  })
  test("postItemsByIdPlaybackinfo", () => {
    const body: api.PlaybackInfoRequest = undefined
    const Id: string = "Id_example"
    return expect(instance.postItemsByIdPlaybackinfo(body, Id, {})).resolves.toBe(null)
  })
  test("postLivestreamsClose", () => {
    const LiveStreamId: string = "LiveStreamId_example"
    return expect(instance.postLivestreamsClose(LiveStreamId, {})).resolves.toBe(null)
  })
  test("postLivestreamsMediainfo", () => {
    const LiveStreamId: string = "LiveStreamId_example"
    return expect(instance.postLivestreamsMediainfo(LiveStreamId, {})).resolves.toBe(null)
  })
  test("postLivestreamsOpen", () => {
    const body: api.LiveStreamRequest = undefined
    return expect(instance.postLivestreamsOpen(body, {})).resolves.toBe(null)
  })
})

describe("MoviesServiceApi", () => {
  let instance: api.MoviesServiceApi
  beforeEach(function() {
    instance = new api.MoviesServiceApi(config)
  });

  test("getMoviesRecommendations", () => {
    const CategoryLimit: number = 56
    const ItemLimit: number = 56
    const UserId: string = "UserId_example"
    const ParentId: string = "ParentId_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    return expect(instance.getMoviesRecommendations(CategoryLimit, ItemLimit, UserId, ParentId, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, {})).resolves.toBe(null)
  })
})

describe("MusicGenresServiceApi", () => {
  let instance: api.MusicGenresServiceApi
  beforeEach(function() {
    instance = new api.MusicGenresServiceApi(config)
  });

  test("getMusicgenres", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getMusicgenres(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getMusicgenresByName", () => {
    const Name: string = "Name_example"
    const UserId: string = "UserId_example"
    return expect(instance.getMusicgenresByName(Name, UserId, {})).resolves.toBe(null)
  })
})

describe("NotificationsServiceApi", () => {
  let instance: api.NotificationsServiceApi
  beforeEach(function() {
    instance = new api.NotificationsServiceApi(config)
  });

  test("getNotificationsTypes", () => {
    return expect(instance.getNotificationsTypes({})).resolves.toBe(null)
  })
  test("postNotificationsAdmin", () => {
    const Name: string = "Name_example"
    const Description: string = "Description_example"
    const ImageUrl: string = "ImageUrl_example"
    const Url: string = "Url_example"
    const Level: string = "Level_example"
    return expect(instance.postNotificationsAdmin(Name, Description, ImageUrl, Url, Level, {})).resolves.toBe(null)
  })
})

describe("OfficialRatingServiceApi", () => {
  let instance: api.OfficialRatingServiceApi
  beforeEach(function() {
    instance = new api.OfficialRatingServiceApi(config)
  });

  test("getOfficialratings", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getOfficialratings(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
})

describe("OpenApiServiceApi", () => {
  let instance: api.OpenApiServiceApi
  beforeEach(function() {
    instance = new api.OpenApiServiceApi(config)
  });

  test("getOpenapi", () => {
    return expect(instance.getOpenapi({})).resolves.toBe(null)
  })
  test("getOpenapiJson", () => {
    return expect(instance.getOpenapiJson({})).resolves.toBe(null)
  })
  test("getSwagger", () => {
    return expect(instance.getSwagger({})).resolves.toBe(null)
  })
  test("getSwaggerJson", () => {
    return expect(instance.getSwaggerJson({})).resolves.toBe(null)
  })
})

describe("PackageServiceApi", () => {
  let instance: api.PackageServiceApi
  beforeEach(function() {
    instance = new api.PackageServiceApi(config)
  });

  test("deletePackagesInstallingById", () => {
    const Id: string = "Id_example"
    return expect(instance.deletePackagesInstallingById(Id, {})).resolves.toBe(null)
  })
  test("getPackages", () => {
    const PackageType: string = "PackageType_example"
    const TargetSystems: string = "TargetSystems_example"
    const IsPremium: boolean = true
    const IsAdult: boolean = true
    return expect(instance.getPackages(PackageType, TargetSystems, IsPremium, IsAdult, {})).resolves.toBe(null)
  })
  test("getPackagesByName", () => {
    const Name: string = "Name_example"
    const AssemblyGuid: string = "AssemblyGuid_example"
    return expect(instance.getPackagesByName(Name, AssemblyGuid, {})).resolves.toBe(null)
  })
  test("getPackagesUpdates", () => {
    const PackageType: string = "PackageType_example"
    return expect(instance.getPackagesUpdates(PackageType, {})).resolves.toBe(null)
  })
  test("postPackagesInstalledByName", () => {
    const Name: string = "Name_example"
    const AssemblyGuid: string = "AssemblyGuid_example"
    const Version: string = "Version_example"
    const UpdateClass: PackageVersionClass = undefined
    return expect(instance.postPackagesInstalledByName(Name, AssemblyGuid, Version, UpdateClass, {})).resolves.toBe(null)
  })
  test("postPackagesInstallingByIdDelete", () => {
    const Id: string = "Id_example"
    return expect(instance.postPackagesInstallingByIdDelete(Id, {})).resolves.toBe(null)
  })
})

describe("PersonsServiceApi", () => {
  let instance: api.PersonsServiceApi
  beforeEach(function() {
    instance = new api.PersonsServiceApi(config)
  });

  test("getPersons", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getPersons(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getPersonsByName", () => {
    const Name: string = "Name_example"
    const UserId: string = "UserId_example"
    return expect(instance.getPersonsByName(Name, UserId, {})).resolves.toBe(null)
  })
})

describe("PlaylistServiceApi", () => {
  let instance: api.PlaylistServiceApi
  beforeEach(function() {
    instance = new api.PlaylistServiceApi(config)
  });

  test("deletePlaylistsByIdItems", () => {
    const Id: string = "Id_example"
    const EntryIds: string = "EntryIds_example"
    return expect(instance.deletePlaylistsByIdItems(Id, EntryIds, {})).resolves.toBe(null)
  })
  test("getPlaylistsByIdAddtoplaylistinfo", () => {
    const Ids: string = "Ids_example"
    const Id: string = "Id_example"
    const UserId: string = "UserId_example"
    return expect(instance.getPlaylistsByIdAddtoplaylistinfo(Ids, Id, UserId, {})).resolves.toBe(null)
  })
  test("getPlaylistsByIdItems", () => {
    const Id: string = "Id_example"
    const UserId: string = "UserId_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Fields: string = "Fields_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    return expect(instance.getPlaylistsByIdItems(Id, UserId, StartIndex, Limit, Fields, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, {})).resolves.toBe(null)
  })
  test("postPlaylists", () => {
    const Name: string = "Name_example"
    const Ids: string = "Ids_example"
    const MediaType: string = "MediaType_example"
    return expect(instance.postPlaylists(Name, Ids, MediaType, {})).resolves.toBe(null)
  })
  test("postPlaylistsByIdItems", () => {
    const Ids: string = "Ids_example"
    const Id: string = "Id_example"
    const UserId: string = "UserId_example"
    return expect(instance.postPlaylistsByIdItems(Ids, Id, UserId, {})).resolves.toBe(null)
  })
  test("postPlaylistsByIdItemsByItemidMoveByNewindex", () => {
    const ItemId: number = 789
    const Id: string = "Id_example"
    const NewIndex: number = 56
    return expect(instance.postPlaylistsByIdItemsByItemidMoveByNewindex(ItemId, Id, NewIndex, {})).resolves.toBe(null)
  })
  test("postPlaylistsByIdItemsDelete", () => {
    const Id: string = "Id_example"
    const EntryIds: string = "EntryIds_example"
    return expect(instance.postPlaylistsByIdItemsDelete(Id, EntryIds, {})).resolves.toBe(null)
  })
})

describe("PlaystateServiceApi", () => {
  let instance: api.PlaystateServiceApi
  beforeEach(function() {
    instance = new api.PlaystateServiceApi(config)
  });

  test("deleteUsersByUseridPlayeditemsById", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    return expect(instance.deleteUsersByUseridPlayeditemsById(UserId, Id, {})).resolves.toBe(null)
  })
  test("deleteUsersByUseridPlayingitemsById", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const NextMediaType: string = "NextMediaType_example"
    const PositionTicks: number = 789
    const LiveStreamId: string = "LiveStreamId_example"
    const PlaySessionId: string = "PlaySessionId_example"
    return expect(instance.deleteUsersByUseridPlayingitemsById(UserId, Id, MediaSourceId, NextMediaType, PositionTicks, LiveStreamId, PlaySessionId, {})).resolves.toBe(null)
  })
  test("postSessionsPlaying", () => {
    const body: api.PlaybackStartInfo = undefined
    return expect(instance.postSessionsPlaying(body, {})).resolves.toBe(null)
  })
  test("postSessionsPlayingPing", () => {
    const PlaySessionId: string = "PlaySessionId_example"
    return expect(instance.postSessionsPlayingPing(PlaySessionId, {})).resolves.toBe(null)
  })
  test("postSessionsPlayingProgress", () => {
    const body: api.PlaybackProgressInfo = undefined
    return expect(instance.postSessionsPlayingProgress(body, {})).resolves.toBe(null)
  })
  test("postSessionsPlayingStopped", () => {
    const body: api.PlaybackStopInfo = undefined
    return expect(instance.postSessionsPlayingStopped(body, {})).resolves.toBe(null)
  })
  test("postUsersByUseridItemsByItemidUserdata", () => {
    const body: api.UserItemDataDto = undefined
    const UserId: string = "UserId_example"
    const ItemId: string = "ItemId_example"
    return expect(instance.postUsersByUseridItemsByItemidUserdata(body, UserId, ItemId, {})).resolves.toBe(null)
  })
  test("postUsersByUseridPlayeditemsById", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    const DatePlayed: string = "DatePlayed_example"
    return expect(instance.postUsersByUseridPlayeditemsById(UserId, Id, DatePlayed, {})).resolves.toBe(null)
  })
  test("postUsersByUseridPlayeditemsByIdDelete", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    return expect(instance.postUsersByUseridPlayeditemsByIdDelete(UserId, Id, {})).resolves.toBe(null)
  })
  test("postUsersByUseridPlayingitemsById", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const CanSeek: boolean = true
    const AudioStreamIndex: number = 56
    const SubtitleStreamIndex: number = 56
    const PlayMethod: PlayMethod = undefined
    const LiveStreamId: string = "LiveStreamId_example"
    const PlaySessionId: string = "PlaySessionId_example"
    return expect(instance.postUsersByUseridPlayingitemsById(UserId, Id, MediaSourceId, CanSeek, AudioStreamIndex, SubtitleStreamIndex, PlayMethod, LiveStreamId, PlaySessionId, {})).resolves.toBe(null)
  })
  test("postUsersByUseridPlayingitemsByIdDelete", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const NextMediaType: string = "NextMediaType_example"
    const PositionTicks: number = 789
    const LiveStreamId: string = "LiveStreamId_example"
    const PlaySessionId: string = "PlaySessionId_example"
    return expect(instance.postUsersByUseridPlayingitemsByIdDelete(UserId, Id, MediaSourceId, NextMediaType, PositionTicks, LiveStreamId, PlaySessionId, {})).resolves.toBe(null)
  })
  test("postUsersByUseridPlayingitemsByIdProgress", () => {
    const body: api.ApiOnPlaybackProgress = undefined
    const MediaSourceId: string = "MediaSourceId_example"
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    const PositionTicks: number = 789
    const IsPaused: boolean = true
    const IsMuted: boolean = true
    const AudioStreamIndex: number = 56
    const SubtitleStreamIndex: number = 56
    const VolumeLevel: number = 56
    const PlayMethod: PlayMethod = undefined
    const LiveStreamId: string = "LiveStreamId_example"
    const PlaySessionId: string = "PlaySessionId_example"
    const RepeatMode: RepeatMode = undefined
    const SubtitleOffset: number = 56
    const PlaybackRate: number = 1.2
    return expect(instance.postUsersByUseridPlayingitemsByIdProgress(body, MediaSourceId, UserId, Id, PositionTicks, IsPaused, IsMuted, AudioStreamIndex, SubtitleStreamIndex, VolumeLevel, PlayMethod, LiveStreamId, PlaySessionId, RepeatMode, SubtitleOffset, PlaybackRate, {})).resolves.toBe(null)
  })
})

describe("PluginServiceApi", () => {
  let instance: api.PluginServiceApi
  beforeEach(function() {
    instance = new api.PluginServiceApi(config)
  });

  test("deletePluginsById", () => {
    const Id: string = "Id_example"
    return expect(instance.deletePluginsById(Id, {})).resolves.toBe(null)
  })
  test("getPlugins", () => {
    return expect(instance.getPlugins({})).resolves.toBe(null)
  })
  test("getPluginsByIdConfiguration", () => {
    const Id: string = "Id_example"
    return expect(instance.getPluginsByIdConfiguration(Id, {})).resolves.toBe(null)
  })
  test("getPluginsByIdThumb", () => {
    const Id: string = "Id_example"
    return expect(instance.getPluginsByIdThumb(Id, {})).resolves.toBe(null)
  })
  test("postPluginsByIdConfiguration", () => {
    const body: Object = undefined
    const Id: string = "Id_example"
    return expect(instance.postPluginsByIdConfiguration(body, Id, {})).resolves.toBe(null)
  })
  test("postPluginsByIdDelete", () => {
    const Id: string = "Id_example"
    return expect(instance.postPluginsByIdDelete(Id, {})).resolves.toBe(null)
  })
})

describe("RemoteImageServiceApi", () => {
  let instance: api.RemoteImageServiceApi
  beforeEach(function() {
    instance = new api.RemoteImageServiceApi(config)
  });

  test("getImagesRemote", () => {
    const ImageUrl: string = "ImageUrl_example"
    return expect(instance.getImagesRemote(ImageUrl, {})).resolves.toBe(null)
  })
  test("getItemsByIdRemoteimages", () => {
    const Id: string = "Id_example"
    const Type: ImageType = undefined
    const StartIndex: number = 56
    const Limit: number = 56
    const ProviderName: string = "ProviderName_example"
    const IncludeAllLanguages: boolean = true
    return expect(instance.getItemsByIdRemoteimages(Id, Type, StartIndex, Limit, ProviderName, IncludeAllLanguages, {})).resolves.toBe(null)
  })
  test("getItemsByIdRemoteimagesProviders", () => {
    const Id: string = "Id_example"
    return expect(instance.getItemsByIdRemoteimagesProviders(Id, {})).resolves.toBe(null)
  })
  test("postItemsByIdRemoteimagesDownload", () => {
    const body: api.ImagesBaseDownloadRemoteImage = undefined
    const Type: ImageType = undefined
    const Id: string = "Id_example"
    const ProviderName: string = "ProviderName_example"
    const ImageUrl: string = "ImageUrl_example"
    return expect(instance.postItemsByIdRemoteimagesDownload(body, Type, Id, ProviderName, ImageUrl, {})).resolves.toBe(null)
  })
})

describe("ScheduledTaskServiceApi", () => {
  let instance: api.ScheduledTaskServiceApi
  beforeEach(function() {
    instance = new api.ScheduledTaskServiceApi(config)
  });

  test("deleteScheduledtasksRunningById", () => {
    const Id: string = "Id_example"
    return expect(instance.deleteScheduledtasksRunningById(Id, {})).resolves.toBe(null)
  })
  test("getScheduledtasks", () => {
    const IsHidden: boolean = true
    const IsEnabled: boolean = true
    return expect(instance.getScheduledtasks(IsHidden, IsEnabled, {})).resolves.toBe(null)
  })
  test("getScheduledtasksById", () => {
    const Id: string = "Id_example"
    return expect(instance.getScheduledtasksById(Id, {})).resolves.toBe(null)
  })
  test("postScheduledtasksByIdTriggers", () => {
    const body: Array<api.TaskTriggerInfo> = undefined
    const Id: string = "Id_example"
    return expect(instance.postScheduledtasksByIdTriggers(body, Id, {})).resolves.toBe(null)
  })
  test("postScheduledtasksRunningById", () => {
    const Id: string = "Id_example"
    return expect(instance.postScheduledtasksRunningById(Id, {})).resolves.toBe(null)
  })
  test("postScheduledtasksRunningByIdDelete", () => {
    const Id: string = "Id_example"
    return expect(instance.postScheduledtasksRunningByIdDelete(Id, {})).resolves.toBe(null)
  })
})

describe("SessionsServiceApi", () => {
  let instance: api.SessionsServiceApi
  beforeEach(function() {
    instance = new api.SessionsServiceApi(config)
  });

  test("deleteAuthKeysByKey", () => {
    const Key: string = "Key_example"
    return expect(instance.deleteAuthKeysByKey(Key, {})).resolves.toBe(null)
  })
  test("deleteSessionsByIdUsersByUserid", () => {
    const Id: string = "Id_example"
    const UserId: string = "UserId_example"
    return expect(instance.deleteSessionsByIdUsersByUserid(Id, UserId, {})).resolves.toBe(null)
  })
  test("getAuthKeys", () => {
    const StartIndex: number = 56
    const Limit: number = 56
    return expect(instance.getAuthKeys(StartIndex, Limit, {})).resolves.toBe(null)
  })
  test("getAuthProviders", () => {
    return expect(instance.getAuthProviders({})).resolves.toBe(null)
  })
  test("getSessions", () => {
    const ControllableByUserId: string = "ControllableByUserId_example"
    const DeviceId: string = "DeviceId_example"
    const Id: string = "Id_example"
    return expect(instance.getSessions(ControllableByUserId, DeviceId, Id, {})).resolves.toBe(null)
  })
  test("getSessionsPlayqueue", () => {
    const Id: string = "Id_example"
    const DeviceId: string = "DeviceId_example"
    return expect(instance.getSessionsPlayqueue(Id, DeviceId, {})).resolves.toBe(null)
  })
  test("postAuthKeys", () => {
    const App: string = "App_example"
    return expect(instance.postAuthKeys(App, {})).resolves.toBe(null)
  })
  test("postAuthKeysByKeyDelete", () => {
    const Key: string = "Key_example"
    return expect(instance.postAuthKeysByKeyDelete(Key, {})).resolves.toBe(null)
  })
  test("postSessionsByIdCommand", () => {
    const body: api.GeneralCommand = undefined
    const Id: string = "Id_example"
    return expect(instance.postSessionsByIdCommand(body, Id, {})).resolves.toBe(null)
  })
  test("postSessionsByIdCommandByCommand", () => {
    const Id: string = "Id_example"
    const Command: string = "Command_example"
    return expect(instance.postSessionsByIdCommandByCommand(Id, Command, {})).resolves.toBe(null)
  })
  test("postSessionsByIdMessage", () => {
    const Id: string = "Id_example"
    const Text: string = "Text_example"
    const Header: string = "Header_example"
    const TimeoutMs: number = 789
    return expect(instance.postSessionsByIdMessage(Id, Text, Header, TimeoutMs, {})).resolves.toBe(null)
  })
  test("postSessionsByIdPlaying", () => {
    const body: api.PlayRequest = undefined
    const ItemIds: Array<number> = undefined
    const PlayCommand: PlayCommand = undefined
    const Id: string = "Id_example"
    const StartPositionTicks: number = 789
    return expect(instance.postSessionsByIdPlaying(body, ItemIds, PlayCommand, Id, StartPositionTicks, {})).resolves.toBe(null)
  })
  test("postSessionsByIdPlayingByCommand", () => {
    const body: api.PlaystateRequest = undefined
    const Id: string = "Id_example"
    const Command: PlaystateCommand = undefined
    return expect(instance.postSessionsByIdPlayingByCommand(body, Id, Command, {})).resolves.toBe(null)
  })
  test("postSessionsByIdSystemByCommand", () => {
    const Id: string = "Id_example"
    const Command: string = "Command_example"
    return expect(instance.postSessionsByIdSystemByCommand(Id, Command, {})).resolves.toBe(null)
  })
  test("postSessionsByIdUsersByUserid", () => {
    const Id: string = "Id_example"
    const UserId: string = "UserId_example"
    return expect(instance.postSessionsByIdUsersByUserid(Id, UserId, {})).resolves.toBe(null)
  })
  test("postSessionsByIdUsersByUseridDelete", () => {
    const Id: string = "Id_example"
    const UserId: string = "UserId_example"
    return expect(instance.postSessionsByIdUsersByUseridDelete(Id, UserId, {})).resolves.toBe(null)
  })
  test("postSessionsByIdViewing", () => {
    const Id: string = "Id_example"
    const ItemType: string = "ItemType_example"
    const ItemId: string = "ItemId_example"
    const ItemName: string = "ItemName_example"
    return expect(instance.postSessionsByIdViewing(Id, ItemType, ItemId, ItemName, {})).resolves.toBe(null)
  })
  test("postSessionsCapabilities", () => {
    const Id: string = "Id_example"
    const PlayableMediaTypes: string = "PlayableMediaTypes_example"
    const SupportedCommands: string = "SupportedCommands_example"
    const SupportsMediaControl: boolean = true
    const SupportsSync: boolean = true
    return expect(instance.postSessionsCapabilities(Id, PlayableMediaTypes, SupportedCommands, SupportsMediaControl, SupportsSync, {})).resolves.toBe(null)
  })
  test("postSessionsCapabilitiesFull", () => {
    const body: api.ClientCapabilities = undefined
    const Id: string = "Id_example"
    return expect(instance.postSessionsCapabilitiesFull(body, Id, {})).resolves.toBe(null)
  })
  test("postSessionsLogout", () => {
    return expect(instance.postSessionsLogout({})).resolves.toBe(null)
  })
})

describe("StudiosServiceApi", () => {
  let instance: api.StudiosServiceApi
  beforeEach(function() {
    instance = new api.StudiosServiceApi(config)
  });

  test("getStudios", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getStudios(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getStudiosByName", () => {
    const Name: string = "Name_example"
    const UserId: string = "UserId_example"
    return expect(instance.getStudiosByName(Name, UserId, {})).resolves.toBe(null)
  })
})

describe("SubtitleOptionsServiceApi", () => {
  let instance: api.SubtitleOptionsServiceApi
  beforeEach(function() {
    instance = new api.SubtitleOptionsServiceApi(config)
  });

  test("getEncodingSubtitleoptions", () => {
    return expect(instance.getEncodingSubtitleoptions({})).resolves.toBe(null)
  })
  test("postEncodingSubtitleoptions", () => {
    const body: Object = undefined
    return expect(instance.postEncodingSubtitleoptions(body, {})).resolves.toBe(null)
  })
})

describe("SubtitleServiceApi", () => {
  let instance: api.SubtitleServiceApi
  beforeEach(function() {
    instance = new api.SubtitleServiceApi(config)
  });

  test("deleteItemsByIdSubtitlesByIndex", () => {
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const Index: number = 56
    return expect(instance.deleteItemsByIdSubtitlesByIndex(Id, MediaSourceId, Index, {})).resolves.toBe(null)
  })
  test("deleteVideosByIdSubtitlesByIndex", () => {
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const Index: number = 56
    return expect(instance.deleteVideosByIdSubtitlesByIndex(Id, MediaSourceId, Index, {})).resolves.toBe(null)
  })
  test("getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", () => {
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const Index: number = 56
    const Format: string = "Format_example"
    const StartPositionTicks: number = 789
    const EndPositionTicks: number = 789
    const CopyTimestamps: boolean = true
    return expect(instance.getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Id, MediaSourceId, Index, Format, StartPositionTicks, EndPositionTicks, CopyTimestamps, {})).resolves.toBe(null)
  })
  test("getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat", () => {
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const Index: number = 56
    const Format: string = "Format_example"
    const StartPositionTicks: number = 789
    const EndPositionTicks: number = 789
    const CopyTimestamps: boolean = true
    return expect(instance.getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(Id, MediaSourceId, Index, Format, StartPositionTicks, EndPositionTicks, CopyTimestamps, {})).resolves.toBe(null)
  })
  test("getItemsByIdRemotesearchSubtitlesByLanguage", () => {
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const Language: string = "Language_example"
    const IsPerfectMatch: boolean = true
    const IsForced: boolean = true
    const IsHearingImpaired: boolean = true
    return expect(instance.getItemsByIdRemotesearchSubtitlesByLanguage(Id, MediaSourceId, Language, IsPerfectMatch, IsForced, IsHearingImpaired, {})).resolves.toBe(null)
  })
  test("getProvidersSubtitlesSubtitlesById", () => {
    const Id: string = "Id_example"
    return expect(instance.getProvidersSubtitlesSubtitlesById(Id, {})).resolves.toBe(null)
  })
  test("getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", () => {
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const Index: number = 56
    const Format: string = "Format_example"
    const StartPositionTicks: number = 789
    const EndPositionTicks: number = 789
    const CopyTimestamps: boolean = true
    return expect(instance.getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Id, MediaSourceId, Index, Format, StartPositionTicks, EndPositionTicks, CopyTimestamps, {})).resolves.toBe(null)
  })
  test("getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat", () => {
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const Index: number = 56
    const Format: string = "Format_example"
    const StartPositionTicks: number = 789
    const EndPositionTicks: number = 789
    const CopyTimestamps: boolean = true
    return expect(instance.getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(Id, MediaSourceId, Index, Format, StartPositionTicks, EndPositionTicks, CopyTimestamps, {})).resolves.toBe(null)
  })
  test("headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", () => {
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const Index: number = 56
    const Format: string = "Format_example"
    const StartPositionTicks: number = 789
    const EndPositionTicks: number = 789
    const CopyTimestamps: boolean = true
    return expect(instance.headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Id, MediaSourceId, Index, Format, StartPositionTicks, EndPositionTicks, CopyTimestamps, {})).resolves.toBe(null)
  })
  test("headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat", () => {
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const Index: number = 56
    const Format: string = "Format_example"
    const StartPositionTicks: number = 789
    const EndPositionTicks: number = 789
    const CopyTimestamps: boolean = true
    return expect(instance.headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(Id, MediaSourceId, Index, Format, StartPositionTicks, EndPositionTicks, CopyTimestamps, {})).resolves.toBe(null)
  })
  test("headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", () => {
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const Index: number = 56
    const Format: string = "Format_example"
    const StartPositionTicks: number = 789
    const EndPositionTicks: number = 789
    const CopyTimestamps: boolean = true
    return expect(instance.headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(Id, MediaSourceId, Index, Format, StartPositionTicks, EndPositionTicks, CopyTimestamps, {})).resolves.toBe(null)
  })
  test("headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat", () => {
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const Index: number = 56
    const Format: string = "Format_example"
    const StartPositionTicks: number = 789
    const EndPositionTicks: number = 789
    const CopyTimestamps: boolean = true
    return expect(instance.headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(Id, MediaSourceId, Index, Format, StartPositionTicks, EndPositionTicks, CopyTimestamps, {})).resolves.toBe(null)
  })
  test("postItemsByIdRemotesearchSubtitlesBySubtitleid", () => {
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const SubtitleId: string = "SubtitleId_example"
    return expect(instance.postItemsByIdRemotesearchSubtitlesBySubtitleid(Id, MediaSourceId, SubtitleId, {})).resolves.toBe(null)
  })
  test("postItemsByIdSubtitlesByIndexDelete", () => {
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const Index: number = 56
    return expect(instance.postItemsByIdSubtitlesByIndexDelete(Id, MediaSourceId, Index, {})).resolves.toBe(null)
  })
  test("postVideosByIdSubtitlesByIndexDelete", () => {
    const Id: string = "Id_example"
    const MediaSourceId: string = "MediaSourceId_example"
    const Index: number = 56
    return expect(instance.postVideosByIdSubtitlesByIndexDelete(Id, MediaSourceId, Index, {})).resolves.toBe(null)
  })
})

describe("SuggestionsServiceApi", () => {
  let instance: api.SuggestionsServiceApi
  beforeEach(function() {
    instance = new api.SuggestionsServiceApi(config)
  });

  test("getUsersByUseridSuggestions", () => {
    const UserId: string = "UserId_example"
    const Fields: string = "Fields_example"
    const EnableImages: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const EnableUserData: boolean = true
    return expect(instance.getUsersByUseridSuggestions(UserId, Fields, EnableImages, ImageTypeLimit, EnableImageTypes, EnableUserData, {})).resolves.toBe(null)
  })
})

describe("SyncServiceApi", () => {
  let instance: api.SyncServiceApi
  beforeEach(function() {
    instance = new api.SyncServiceApi(config)
  });

  test("deleteSyncByTargetidItems", () => {
    const TargetId: string = "TargetId_example"
    const ItemIds: string = "ItemIds_example"
    return expect(instance.deleteSyncByTargetidItems(TargetId, ItemIds, {})).resolves.toBe(null)
  })
  test("deleteSyncJobitemsById", () => {
    const Id: string = "Id_example"
    return expect(instance.deleteSyncJobitemsById(Id, {})).resolves.toBe(null)
  })
  test("deleteSyncJobsById", () => {
    const Id: string = "Id_example"
    return expect(instance.deleteSyncJobsById(Id, {})).resolves.toBe(null)
  })
  test("getSyncItemsReady", () => {
    const TargetId: string = "TargetId_example"
    return expect(instance.getSyncItemsReady(TargetId, {})).resolves.toBe(null)
  })
  test("getSyncJobitems", () => {
    const TargetId: string = "TargetId_example"
    return expect(instance.getSyncJobitems(TargetId, {})).resolves.toBe(null)
  })
  test("getSyncJobitemsByIdAdditionalfiles", () => {
    const Id: string = "Id_example"
    const Name: string = "Name_example"
    return expect(instance.getSyncJobitemsByIdAdditionalfiles(Id, Name, {})).resolves.toBe(null)
  })
  test("getSyncJobitemsByIdFile", () => {
    const Id: string = "Id_example"
    return expect(instance.getSyncJobitemsByIdFile(Id, {})).resolves.toBe(null)
  })
  test("getSyncJobs", () => {
    return expect(instance.getSyncJobs({})).resolves.toBe(null)
  })
  test("getSyncJobsById", () => {
    const Id: string = "Id_example"
    return expect(instance.getSyncJobsById(Id, {})).resolves.toBe(null)
  })
  test("getSyncOptions", () => {
    const UserId: string = "UserId_example"
    const ItemIds: string = "ItemIds_example"
    const ParentId: string = "ParentId_example"
    const TargetId: string = "TargetId_example"
    const Category: SyncCategory = undefined
    return expect(instance.getSyncOptions(UserId, ItemIds, ParentId, TargetId, Category, {})).resolves.toBe(null)
  })
  test("getSyncTargets", () => {
    const UserId: string = "UserId_example"
    return expect(instance.getSyncTargets(UserId, {})).resolves.toBe(null)
  })
  test("headSyncJobitemsByIdFile", () => {
    const Id: string = "Id_example"
    return expect(instance.headSyncJobitemsByIdFile(Id, {})).resolves.toBe(null)
  })
  test("postSyncByItemidStatus", () => {
    const body: api.SyncedItemProgress = undefined
    const ItemId: string = "ItemId_example"
    return expect(instance.postSyncByItemidStatus(body, ItemId, {})).resolves.toBe(null)
  })
  test("postSyncByTargetidItemsDelete", () => {
    const TargetId: string = "TargetId_example"
    const ItemIds: string = "ItemIds_example"
    return expect(instance.postSyncByTargetidItemsDelete(TargetId, ItemIds, {})).resolves.toBe(null)
  })
  test("postSyncData", () => {
    const body: api.SyncDataRequest = undefined
    const TargetId: string = "TargetId_example"
    return expect(instance.postSyncData(body, TargetId, {})).resolves.toBe(null)
  })
  test("postSyncItemsCancel", () => {
    const ItemIds: string = "ItemIds_example"
    return expect(instance.postSyncItemsCancel(ItemIds, {})).resolves.toBe(null)
  })
  test("postSyncJobitemsByIdDelete", () => {
    const Id: string = "Id_example"
    return expect(instance.postSyncJobitemsByIdDelete(Id, {})).resolves.toBe(null)
  })
  test("postSyncJobitemsByIdEnable", () => {
    const Id: string = "Id_example"
    return expect(instance.postSyncJobitemsByIdEnable(Id, {})).resolves.toBe(null)
  })
  test("postSyncJobitemsByIdMarkforremoval", () => {
    const Id: string = "Id_example"
    return expect(instance.postSyncJobitemsByIdMarkforremoval(Id, {})).resolves.toBe(null)
  })
  test("postSyncJobitemsByIdTransferred", () => {
    const Id: string = "Id_example"
    return expect(instance.postSyncJobitemsByIdTransferred(Id, {})).resolves.toBe(null)
  })
  test("postSyncJobitemsByIdUnmarkforremoval", () => {
    const Id: string = "Id_example"
    return expect(instance.postSyncJobitemsByIdUnmarkforremoval(Id, {})).resolves.toBe(null)
  })
  test("postSyncJobs", () => {
    const body: api.SyncJobRequest = undefined
    return expect(instance.postSyncJobs(body, {})).resolves.toBe(null)
  })
  test("postSyncJobsById", () => {
    const body: api.SyncJob = undefined
    const Id: number = 789
    return expect(instance.postSyncJobsById(body, Id, {})).resolves.toBe(null)
  })
  test("postSyncJobsByIdDelete", () => {
    const Id: string = "Id_example"
    return expect(instance.postSyncJobsByIdDelete(Id, {})).resolves.toBe(null)
  })
  test("postSyncOfflineactions", () => {
    const body: Array<api.UserAction> = undefined
    return expect(instance.postSyncOfflineactions(body, {})).resolves.toBe(null)
  })
})

describe("SystemServiceApi", () => {
  let instance: api.SystemServiceApi
  beforeEach(function() {
    instance = new api.SystemServiceApi(config)
  });

  test("getSystemEndpoint", () => {
    return expect(instance.getSystemEndpoint({})).resolves.toBe(null)
  })
  test("getSystemInfo", () => {
    return expect(instance.getSystemInfo({})).resolves.toBe(null)
  })
  test("getSystemInfoPublic", () => {
    return expect(instance.getSystemInfoPublic({})).resolves.toBe(null)
  })
  test("getSystemLogsByName", () => {
    const Name: string = "Name_example"
    const Sanitize: boolean = true
    return expect(instance.getSystemLogsByName(Name, Sanitize, {})).resolves.toBe(null)
  })
  test("getSystemLogsByNameLines", () => {
    const Name: string = "Name_example"
    return expect(instance.getSystemLogsByNameLines(Name, {})).resolves.toBe(null)
  })
  test("getSystemLogsQuery", () => {
    const StartIndex: number = 56
    const Limit: number = 56
    return expect(instance.getSystemLogsQuery(StartIndex, Limit, {})).resolves.toBe(null)
  })
  test("getSystemPing", () => {
    return expect(instance.getSystemPing({})).resolves.toBe(null)
  })
  test("getSystemReleasenotes", () => {
    return expect(instance.getSystemReleasenotes({})).resolves.toBe(null)
  })
  test("getSystemReleasenotesVersions", () => {
    return expect(instance.getSystemReleasenotesVersions({})).resolves.toBe(null)
  })
  test("getSystemWakeonlaninfo", () => {
    return expect(instance.getSystemWakeonlaninfo({})).resolves.toBe(null)
  })
  test("postSystemPing", () => {
    return expect(instance.postSystemPing({})).resolves.toBe(null)
  })
  test("postSystemRestart", () => {
    return expect(instance.postSystemRestart({})).resolves.toBe(null)
  })
  test("postSystemShutdown", () => {
    return expect(instance.postSystemShutdown({})).resolves.toBe(null)
  })
})

describe("TagServiceApi", () => {
  let instance: api.TagServiceApi
  beforeEach(function() {
    instance = new api.TagServiceApi(config)
  });

  test("getArtistsPrefixes", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getArtistsPrefixes(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getAudiocodecs", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getAudiocodecs(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getAudiolayouts", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getAudiolayouts(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getContainers", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getContainers(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getExtendedvideotypes", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getExtendedvideotypes(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getItemsPrefixes", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getItemsPrefixes(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getItemtypes", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getItemtypes(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getStreamlanguages", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getStreamlanguages(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getSubtitlecodecs", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getSubtitlecodecs(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getTags", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getTags(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getVideocodecs", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getVideocodecs(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getYears", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getYears(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("postItemsByIdTagsAdd", () => {
    const body: api.UserLibraryAddTags = undefined
    const Id: string = "Id_example"
    return expect(instance.postItemsByIdTagsAdd(body, Id, {})).resolves.toBe(null)
  })
  test("postItemsByIdTagsDelete", () => {
    const body: api.UserLibraryRemoveTags = undefined
    const Id: string = "Id_example"
    return expect(instance.postItemsByIdTagsDelete(body, Id, {})).resolves.toBe(null)
  })
})

describe("ToneMapOptionsServiceApi", () => {
  let instance: api.ToneMapOptionsServiceApi
  beforeEach(function() {
    instance = new api.ToneMapOptionsServiceApi(config)
  });

  test("getEncodingFulltonemapoptions", () => {
    return expect(instance.getEncodingFulltonemapoptions({})).resolves.toBe(null)
  })
  test("getEncodingPublictonemapoptions", () => {
    return expect(instance.getEncodingPublictonemapoptions({})).resolves.toBe(null)
  })
  test("postEncodingFulltonemapoptions", () => {
    const body: Object = undefined
    return expect(instance.postEncodingFulltonemapoptions(body, {})).resolves.toBe(null)
  })
  test("postEncodingPublictonemapoptions", () => {
    const body: Object = undefined
    return expect(instance.postEncodingPublictonemapoptions(body, {})).resolves.toBe(null)
  })
})

describe("TrailersServiceApi", () => {
  let instance: api.TrailersServiceApi
  beforeEach(function() {
    instance = new api.TrailersServiceApi(config)
  });

  test("getTrailers", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getTrailers(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
})

describe("TvShowsServiceApi", () => {
  let instance: api.TvShowsServiceApi
  beforeEach(function() {
    instance = new api.TvShowsServiceApi(config)
  });

  test("getShowsByIdEpisodes", () => {
    const Id: string = "Id_example"
    const Season: number = 56
    const SeasonId: string = "SeasonId_example"
    const StartItemId: string = "StartItemId_example"
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getShowsByIdEpisodes(Id, Season, SeasonId, StartItemId, ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getShowsByIdSeasons", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    const Fields: string = "Fields_example"
    const IsSpecialSeason: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const EnableImages: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const EnableUserData: boolean = true
    return expect(instance.getShowsByIdSeasons(UserId, Id, Fields, IsSpecialSeason, AdjacentTo, EnableImages, ImageTypeLimit, EnableImageTypes, EnableUserData, {})).resolves.toBe(null)
  })
  test("getShowsMissing", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getShowsMissing(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
  test("getShowsNextup", () => {
    const UserId: string = "UserId_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Fields: string = "Fields_example"
    const SeriesId: string = "SeriesId_example"
    const ParentId: string = "ParentId_example"
    const EnableImages: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const EnableUserData: boolean = true
    return expect(instance.getShowsNextup(UserId, StartIndex, Limit, Fields, SeriesId, ParentId, EnableImages, ImageTypeLimit, EnableImageTypes, EnableUserData, {})).resolves.toBe(null)
  })
  test("getShowsUpcoming", () => {
    const ArtistType: string = "ArtistType_example"
    const MaxOfficialRating: string = "MaxOfficialRating_example"
    const HasThemeSong: boolean = true
    const HasThemeVideo: boolean = true
    const HasSubtitles: boolean = true
    const HasSpecialFeature: boolean = true
    const HasTrailer: boolean = true
    const AdjacentTo: string = "AdjacentTo_example"
    const MinIndexNumber: number = 56
    const MinStartDate: string = "MinStartDate_example"
    const MaxStartDate: string = "MaxStartDate_example"
    const MinEndDate: string = "MinEndDate_example"
    const MaxEndDate: string = "MaxEndDate_example"
    const MinPlayers: number = 56
    const MaxPlayers: number = 56
    const ParentIndexNumber: number = 56
    const HasParentalRating: boolean = true
    const IsHD: boolean = true
    const IsUnaired: boolean = true
    const MinCommunityRating: number = 1.2
    const MinCriticRating: number = 1.2
    const AiredDuringSeason: number = 56
    const MinPremiereDate: string = "MinPremiereDate_example"
    const MinDateLastSaved: string = "MinDateLastSaved_example"
    const MinDateLastSavedForUser: string = "MinDateLastSavedForUser_example"
    const MaxPremiereDate: string = "MaxPremiereDate_example"
    const HasOverview: boolean = true
    const HasImdbId: boolean = true
    const HasTmdbId: boolean = true
    const HasTvdbId: boolean = true
    const ExcludeItemIds: string = "ExcludeItemIds_example"
    const StartIndex: number = 56
    const Limit: number = 56
    const Recursive: boolean = true
    const SearchTerm: string = "SearchTerm_example"
    const SortOrder: string = "SortOrder_example"
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const ExcludeItemTypes: string = "ExcludeItemTypes_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const AnyProviderIdEquals: string = "AnyProviderIdEquals_example"
    const Filters: string = "Filters_example"
    const IsFavorite: boolean = true
    const IsMovie: boolean = true
    const IsSeries: boolean = true
    const IsFolder: boolean = true
    const IsNews: boolean = true
    const IsKids: boolean = true
    const IsSports: boolean = true
    const IsNew: boolean = true
    const IsPremiere: boolean = true
    const IsNewOrPremiere: boolean = true
    const IsRepeat: boolean = true
    const ProjectToMedia: boolean = true
    const MediaTypes: string = "MediaTypes_example"
    const ImageTypes: string = "ImageTypes_example"
    const SortBy: string = "SortBy_example"
    const IsPlayed: boolean = true
    const Genres: string = "Genres_example"
    const OfficialRatings: string = "OfficialRatings_example"
    const Tags: string = "Tags_example"
    const ExcludeTags: string = "ExcludeTags_example"
    const Years: string = "Years_example"
    const EnableImages: boolean = true
    const EnableUserData: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const Person: string = "Person_example"
    const PersonIds: string = "PersonIds_example"
    const PersonTypes: string = "PersonTypes_example"
    const Studios: string = "Studios_example"
    const StudioIds: string = "StudioIds_example"
    const Artists: string = "Artists_example"
    const ArtistIds: string = "ArtistIds_example"
    const Albums: string = "Albums_example"
    const Ids: string = "Ids_example"
    const VideoTypes: string = "VideoTypes_example"
    const Containers: string = "Containers_example"
    const AudioCodecs: string = "AudioCodecs_example"
    const AudioLayouts: string = "AudioLayouts_example"
    const VideoCodecs: string = "VideoCodecs_example"
    const ExtendedVideoTypes: string = "ExtendedVideoTypes_example"
    const SubtitleCodecs: string = "SubtitleCodecs_example"
    const Path: string = "Path_example"
    const UserId: string = "UserId_example"
    const MinOfficialRating: string = "MinOfficialRating_example"
    const IsLocked: boolean = true
    const IsPlaceHolder: boolean = true
    const HasOfficialRating: boolean = true
    const GroupItemsIntoCollections: boolean = true
    const Is3D: boolean = true
    const SeriesStatus: string = "SeriesStatus_example"
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const ArtistStartsWithOrGreater: string = "ArtistStartsWithOrGreater_example"
    const AlbumArtistStartsWithOrGreater: string = "AlbumArtistStartsWithOrGreater_example"
    const NameStartsWith: string = "NameStartsWith_example"
    const NameLessThan: string = "NameLessThan_example"
    return expect(instance.getShowsUpcoming(ArtistType, MaxOfficialRating, HasThemeSong, HasThemeVideo, HasSubtitles, HasSpecialFeature, HasTrailer, AdjacentTo, MinIndexNumber, MinStartDate, MaxStartDate, MinEndDate, MaxEndDate, MinPlayers, MaxPlayers, ParentIndexNumber, HasParentalRating, IsHD, IsUnaired, MinCommunityRating, MinCriticRating, AiredDuringSeason, MinPremiereDate, MinDateLastSaved, MinDateLastSavedForUser, MaxPremiereDate, HasOverview, HasImdbId, HasTmdbId, HasTvdbId, ExcludeItemIds, StartIndex, Limit, Recursive, SearchTerm, SortOrder, ParentId, Fields, ExcludeItemTypes, IncludeItemTypes, AnyProviderIdEquals, Filters, IsFavorite, IsMovie, IsSeries, IsFolder, IsNews, IsKids, IsSports, IsNew, IsPremiere, IsNewOrPremiere, IsRepeat, ProjectToMedia, MediaTypes, ImageTypes, SortBy, IsPlayed, Genres, OfficialRatings, Tags, ExcludeTags, Years, EnableImages, EnableUserData, ImageTypeLimit, EnableImageTypes, Person, PersonIds, PersonTypes, Studios, StudioIds, Artists, ArtistIds, Albums, Ids, VideoTypes, Containers, AudioCodecs, AudioLayouts, VideoCodecs, ExtendedVideoTypes, SubtitleCodecs, Path, UserId, MinOfficialRating, IsLocked, IsPlaceHolder, HasOfficialRating, GroupItemsIntoCollections, Is3D, SeriesStatus, NameStartsWithOrGreater, ArtistStartsWithOrGreater, AlbumArtistStartsWithOrGreater, NameStartsWith, NameLessThan, {})).resolves.toBe(null)
  })
})

describe("UniversalAudioServiceApi", () => {
  let instance: api.UniversalAudioServiceApi
  beforeEach(function() {
    instance = new api.UniversalAudioServiceApi(config)
  });

  test("getAudioByIdUniversal", () => {
    const Id: string = "Id_example"
    const DeviceId: string = "DeviceId_example"
    const StartTimeTicks: number = 789
    return expect(instance.getAudioByIdUniversal(Id, DeviceId, StartTimeTicks, {})).resolves.toBe(null)
  })
  test("getAudioByIdUniversalByContainer", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceId: string = "DeviceId_example"
    const StartTimeTicks: number = 789
    return expect(instance.getAudioByIdUniversalByContainer(Id, Container, DeviceId, StartTimeTicks, {})).resolves.toBe(null)
  })
  test("headAudioByIdUniversal", () => {
    const Id: string = "Id_example"
    const DeviceId: string = "DeviceId_example"
    const StartTimeTicks: number = 789
    return expect(instance.headAudioByIdUniversal(Id, DeviceId, StartTimeTicks, {})).resolves.toBe(null)
  })
  test("headAudioByIdUniversalByContainer", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceId: string = "DeviceId_example"
    const StartTimeTicks: number = 789
    return expect(instance.headAudioByIdUniversalByContainer(Id, Container, DeviceId, StartTimeTicks, {})).resolves.toBe(null)
  })
})

describe("UserLibraryServiceApi", () => {
  let instance: api.UserLibraryServiceApi
  beforeEach(function() {
    instance = new api.UserLibraryServiceApi(config)
  });

  test("deleteUsersByUseridFavoriteitemsById", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    return expect(instance.deleteUsersByUseridFavoriteitemsById(UserId, Id, {})).resolves.toBe(null)
  })
  test("deleteUsersByUseridItemsByIdRating", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    return expect(instance.deleteUsersByUseridItemsByIdRating(UserId, Id, {})).resolves.toBe(null)
  })
  test("getLivetvProgramsById", () => {
    const Id: string = "Id_example"
    return expect(instance.getLivetvProgramsById(Id, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItemsById", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    return expect(instance.getUsersByUseridItemsById(UserId, Id, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItemsByIdIntros", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    const Fields: string = "Fields_example"
    const EnableImages: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const EnableUserData: boolean = true
    return expect(instance.getUsersByUseridItemsByIdIntros(UserId, Id, Fields, EnableImages, ImageTypeLimit, EnableImageTypes, EnableUserData, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItemsByIdLocaltrailers", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    const Fields: string = "Fields_example"
    const EnableImages: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const EnableUserData: boolean = true
    return expect(instance.getUsersByUseridItemsByIdLocaltrailers(UserId, Id, Fields, EnableImages, ImageTypeLimit, EnableImageTypes, EnableUserData, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItemsByIdSpecialfeatures", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    const Fields: string = "Fields_example"
    const EnableImages: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const EnableUserData: boolean = true
    return expect(instance.getUsersByUseridItemsByIdSpecialfeatures(UserId, Id, Fields, EnableImages, ImageTypeLimit, EnableImageTypes, EnableUserData, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItemsLatest", () => {
    const UserId: string = "UserId_example"
    const Limit: number = 56
    const ParentId: string = "ParentId_example"
    const Fields: string = "Fields_example"
    const IncludeItemTypes: string = "IncludeItemTypes_example"
    const MediaTypes: string = "MediaTypes_example"
    const IsFolder: boolean = true
    const IsPlayed: boolean = true
    const GroupItems: boolean = true
    const EnableImages: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const EnableUserData: boolean = true
    return expect(instance.getUsersByUseridItemsLatest(UserId, Limit, ParentId, Fields, IncludeItemTypes, MediaTypes, IsFolder, IsPlayed, GroupItems, EnableImages, ImageTypeLimit, EnableImageTypes, EnableUserData, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItemsRoot", () => {
    const UserId: string = "UserId_example"
    return expect(instance.getUsersByUseridItemsRoot(UserId, {})).resolves.toBe(null)
  })
  test("getVideosByIdAdditionalparts", () => {
    const Id: string = "Id_example"
    const UserId: string = "UserId_example"
    const Fields: string = "Fields_example"
    const EnableImages: boolean = true
    const ImageTypeLimit: number = 56
    const EnableImageTypes: string = "EnableImageTypes_example"
    const EnableUserData: boolean = true
    return expect(instance.getVideosByIdAdditionalparts(Id, UserId, Fields, EnableImages, ImageTypeLimit, EnableImageTypes, EnableUserData, {})).resolves.toBe(null)
  })
  test("postItemsAccess", () => {
    const body: api.UserLibraryUpdateUserItemAccess = undefined
    return expect(instance.postItemsAccess(body, {})).resolves.toBe(null)
  })
  test("postItemsByIdMakeprivate", () => {
    const Id: string = "Id_example"
    return expect(instance.postItemsByIdMakeprivate(Id, {})).resolves.toBe(null)
  })
  test("postItemsByIdMakepublic", () => {
    const Id: string = "Id_example"
    return expect(instance.postItemsByIdMakepublic(Id, {})).resolves.toBe(null)
  })
  test("postItemsSharedLeave", () => {
    const body: api.UserLibraryLeaveSharedItems = undefined
    return expect(instance.postItemsSharedLeave(body, {})).resolves.toBe(null)
  })
  test("postUsersByUseridFavoriteitemsById", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    return expect(instance.postUsersByUseridFavoriteitemsById(UserId, Id, {})).resolves.toBe(null)
  })
  test("postUsersByUseridFavoriteitemsByIdDelete", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    return expect(instance.postUsersByUseridFavoriteitemsByIdDelete(UserId, Id, {})).resolves.toBe(null)
  })
  test("postUsersByUseridItemsByIdHidefromresume", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    const Hide: boolean = true
    return expect(instance.postUsersByUseridItemsByIdHidefromresume(UserId, Id, Hide, {})).resolves.toBe(null)
  })
  test("postUsersByUseridItemsByIdRating", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    const Likes: boolean = true
    return expect(instance.postUsersByUseridItemsByIdRating(UserId, Id, Likes, {})).resolves.toBe(null)
  })
  test("postUsersByUseridItemsByIdRatingDelete", () => {
    const UserId: string = "UserId_example"
    const Id: string = "Id_example"
    return expect(instance.postUsersByUseridItemsByIdRatingDelete(UserId, Id, {})).resolves.toBe(null)
  })
})

describe("UserNotificationsServiceApi", () => {
  let instance: api.UserNotificationsServiceApi
  beforeEach(function() {
    instance = new api.UserNotificationsServiceApi(config)
  });

  test("getNotificationsServicesDefaults", () => {
    return expect(instance.getNotificationsServicesDefaults({})).resolves.toBe(null)
  })
  test("postNotificationsServicesTest", () => {
    const body: api.UserNotificationInfo = undefined
    return expect(instance.postNotificationsServicesTest(body, {})).resolves.toBe(null)
  })
})

describe("UserServiceApi", () => {
  let instance: api.UserServiceApi
  beforeEach(function() {
    instance = new api.UserServiceApi(config)
  });

  test("deleteUsersById", () => {
    const Id: string = "Id_example"
    return expect(instance.deleteUsersById(Id, {})).resolves.toBe(null)
  })
  test("deleteUsersByIdTrackselectionsByTracktype", () => {
    const Id: string = "Id_example"
    const TrackType: string = "TrackType_example"
    return expect(instance.deleteUsersByIdTrackselectionsByTracktype(Id, TrackType, {})).resolves.toBe(null)
  })
  test("getUsersById", () => {
    const Id: string = "Id_example"
    return expect(instance.getUsersById(Id, {})).resolves.toBe(null)
  })
  test("getUsersByUseridTypedsettingsByKey", () => {
    const Key: string = "Key_example"
    const UserId: string = "UserId_example"
    return expect(instance.getUsersByUseridTypedsettingsByKey(Key, UserId, {})).resolves.toBe(null)
  })
  test("getUsersItemaccess", () => {
    const IsHidden: boolean = true
    const IsDisabled: boolean = true
    const StartIndex: number = 56
    const Limit: number = 56
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const SortOrder: string = "SortOrder_example"
    return expect(instance.getUsersItemaccess(IsHidden, IsDisabled, StartIndex, Limit, NameStartsWithOrGreater, SortOrder, {})).resolves.toBe(null)
  })
  test("getUsersPrefixes", () => {
    const IsHidden: boolean = true
    const IsDisabled: boolean = true
    const StartIndex: number = 56
    const Limit: number = 56
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const SortOrder: string = "SortOrder_example"
    return expect(instance.getUsersPrefixes(IsHidden, IsDisabled, StartIndex, Limit, NameStartsWithOrGreater, SortOrder, {})).resolves.toBe(null)
  })
  test("getUsersPublic", () => {
    return expect(instance.getUsersPublic({})).resolves.toBe(null)
  })
  test("getUsersQuery", () => {
    const IsHidden: boolean = true
    const IsDisabled: boolean = true
    const StartIndex: number = 56
    const Limit: number = 56
    const NameStartsWithOrGreater: string = "NameStartsWithOrGreater_example"
    const SortOrder: string = "SortOrder_example"
    return expect(instance.getUsersQuery(IsHidden, IsDisabled, StartIndex, Limit, NameStartsWithOrGreater, SortOrder, {})).resolves.toBe(null)
  })
  test("postUsersAuthenticatebyname", () => {
    const body: api.AuthenticateUserByName = undefined
    const X_Emby_Authorization: string = "X_Emby_Authorization_example"
    return expect(instance.postUsersAuthenticatebyname(body, X_Emby_Authorization, {})).resolves.toBe(null)
  })
  test("postUsersById", () => {
    const body: api.UserDto = undefined
    const Id: string = "Id_example"
    return expect(instance.postUsersById(body, Id, {})).resolves.toBe(null)
  })
  test("postUsersByIdAuthenticate", () => {
    const body: api.AuthenticateUser = undefined
    const Id: string = "Id_example"
    return expect(instance.postUsersByIdAuthenticate(body, Id, {})).resolves.toBe(null)
  })
  test("postUsersByIdConfiguration", () => {
    const body: api.UserConfiguration = undefined
    const Id: string = "Id_example"
    return expect(instance.postUsersByIdConfiguration(body, Id, {})).resolves.toBe(null)
  })
  test("postUsersByIdConfigurationPartial", () => {
    const body: Object = undefined
    const Id: string = "Id_example"
    return expect(instance.postUsersByIdConfigurationPartial(body, Id, {})).resolves.toBe(null)
  })
  test("postUsersByIdDelete", () => {
    const Id: string = "Id_example"
    return expect(instance.postUsersByIdDelete(Id, {})).resolves.toBe(null)
  })
  test("postUsersByIdPassword", () => {
    const body: api.UpdateUserPassword = undefined
    const Id: string = "Id_example"
    return expect(instance.postUsersByIdPassword(body, Id, {})).resolves.toBe(null)
  })
  test("postUsersByIdPolicy", () => {
    const body: api.UserPolicy = undefined
    const Id: string = "Id_example"
    return expect(instance.postUsersByIdPolicy(body, Id, {})).resolves.toBe(null)
  })
  test("postUsersByIdTrackselectionsByTracktypeDelete", () => {
    const Id: string = "Id_example"
    const TrackType: string = "TrackType_example"
    return expect(instance.postUsersByIdTrackselectionsByTracktypeDelete(Id, TrackType, {})).resolves.toBe(null)
  })
  test("postUsersByUseridTypedsettingsByKey", () => {
    const body: Object = undefined
    const UserId: string = "UserId_example"
    const Key: string = "Key_example"
    return expect(instance.postUsersByUseridTypedsettingsByKey(body, UserId, Key, {})).resolves.toBe(null)
  })
  test("postUsersForgotpassword", () => {
    const body: api.ForgotPassword = undefined
    return expect(instance.postUsersForgotpassword(body, {})).resolves.toBe(null)
  })
  test("postUsersForgotpasswordPin", () => {
    const body: api.ForgotPasswordPin = undefined
    return expect(instance.postUsersForgotpasswordPin(body, {})).resolves.toBe(null)
  })
  test("postUsersNew", () => {
    const body: api.CreateUserByName = undefined
    return expect(instance.postUsersNew(body, {})).resolves.toBe(null)
  })
})

describe("UserViewsServiceApi", () => {
  let instance: api.UserViewsServiceApi
  beforeEach(function() {
    instance = new api.UserViewsServiceApi(config)
  });

  test("getUsersByUseridViews", () => {
    const UserId: string = "UserId_example"
    const IncludeExternalContent: boolean = true
    return expect(instance.getUsersByUseridViews(UserId, IncludeExternalContent, {})).resolves.toBe(null)
  })
})

describe("VideoHlsServiceApi", () => {
  let instance: api.VideoHlsServiceApi
  beforeEach(function() {
    instance = new api.VideoHlsServiceApi(config)
  });

  test("getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer", () => {
    const SegmentContainer: string = "SegmentContainer_example"
    const SegmentId: string = "SegmentId_example"
    const Id: string = "Id_example"
    const PlaylistId: string = "PlaylistId_example"
    return expect(instance.getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer(SegmentContainer, SegmentId, Id, PlaylistId, {})).resolves.toBe(null)
  })
  test("getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer", () => {
    const SegmentContainer: string = "SegmentContainer_example"
    const SegmentId: string = "SegmentId_example"
    const Id: string = "Id_example"
    const PlaylistId: string = "PlaylistId_example"
    return expect(instance.getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer(SegmentContainer, SegmentId, Id, PlaylistId, {})).resolves.toBe(null)
  })
})

describe("VideoServiceApi", () => {
  let instance: api.VideoServiceApi
  beforeEach(function() {
    instance = new api.VideoServiceApi(config)
  });

  test("getVideosByIdByStreamfilename", () => {
    const StreamFileName: string = "StreamFileName_example"
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.getVideosByIdByStreamfilename(StreamFileName, Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("getVideosByIdStream", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.getVideosByIdStream(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("getVideosByIdStreamByContainer", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.getVideosByIdStreamByContainer(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("headVideosByIdByStreamfilename", () => {
    const StreamFileName: string = "StreamFileName_example"
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.headVideosByIdByStreamfilename(StreamFileName, Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("headVideosByIdStream", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.headVideosByIdStream(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
  test("headVideosByIdStreamByContainer", () => {
    const Id: string = "Id_example"
    const Container: string = "Container_example"
    const DeviceProfileId: string = "DeviceProfileId_example"
    const DeviceId: string = "DeviceId_example"
    const AudioCodec: string = "AudioCodec_example"
    const EnableAutoStreamCopy: boolean = true
    const AudioSampleRate: number = 56
    const AudioBitRate: number = 56
    const AudioChannels: number = 56
    const MaxAudioChannels: number = 56
    const _Static: boolean = true
    const CopyTimestamps: boolean = true
    const StartTimeTicks: number = 789
    const Width: number = 56
    const Height: number = 56
    const MaxWidth: number = 56
    const MaxHeight: number = 56
    const VideoBitRate: number = 56
    const SubtitleStreamIndex: number = 56
    const SubtitleMethod: SubtitleDeliveryMethod = undefined
    const MaxVideoBitDepth: number = 56
    const VideoCodec: string = "VideoCodec_example"
    const AudioStreamIndex: number = 56
    const VideoStreamIndex: number = 56
    return expect(instance.headVideosByIdStreamByContainer(Id, Container, DeviceProfileId, DeviceId, AudioCodec, EnableAutoStreamCopy, AudioSampleRate, AudioBitRate, AudioChannels, MaxAudioChannels, _Static, CopyTimestamps, StartTimeTicks, Width, Height, MaxWidth, MaxHeight, VideoBitRate, SubtitleStreamIndex, SubtitleMethod, MaxVideoBitDepth, VideoCodec, AudioStreamIndex, VideoStreamIndex, {})).resolves.toBe(null)
  })
})

describe("VideosServiceApi", () => {
  let instance: api.VideosServiceApi
  beforeEach(function() {
    instance = new api.VideosServiceApi(config)
  });

  test("deleteVideosByIdAlternatesources", () => {
    const Id: string = "Id_example"
    return expect(instance.deleteVideosByIdAlternatesources(Id, {})).resolves.toBe(null)
  })
  test("postVideosByIdAlternatesourcesDelete", () => {
    const Id: string = "Id_example"
    return expect(instance.postVideosByIdAlternatesourcesDelete(Id, {})).resolves.toBe(null)
  })
  test("postVideosMergeversions", () => {
    const Ids: string = "Ids_example"
    return expect(instance.postVideosMergeversions(Ids, {})).resolves.toBe(null)
  })
})

describe("WebAppServiceApi", () => {
  let instance: api.WebAppServiceApi
  beforeEach(function() {
    instance = new api.WebAppServiceApi(config)
  });

  test("getWebConfigurationpage", () => {
    return expect(instance.getWebConfigurationpage({})).resolves.toBe(null)
  })
  test("getWebConfigurationpages", () => {
    return expect(instance.getWebConfigurationpages({})).resolves.toBe(null)
  })
  test("getWebStrings", () => {
    return expect(instance.getWebStrings({})).resolves.toBe(null)
  })
  test("getWebStringset", () => {
    return expect(instance.getWebStringset({})).resolves.toBe(null)
  })
})

