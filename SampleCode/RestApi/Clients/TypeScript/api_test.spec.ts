/**
 * Emby Server REST API
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.10.0
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
    const startIndex: number = 56
    const limit: number = 56
    const minDate: string = "minDate_example"
    return expect(instance.getSystemActivitylogEntries(startIndex, limit, minDate, {})).resolves.toBe(null)
  })
})

describe("ArtistsServiceApi", () => {
  let instance: api.ArtistsServiceApi
  beforeEach(function() {
    instance = new api.ArtistsServiceApi(config)
  });

  test("getArtists", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getArtists(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getArtistsAlbumartists", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getArtistsAlbumartists(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getArtistsByName", () => {
    const name: string = "name_example"
    const userId: string = "userId_example"
    return expect(instance.getArtistsByName(name, userId, {})).resolves.toBe(null)
  })
})

describe("AudioServiceApi", () => {
  let instance: api.AudioServiceApi
  beforeEach(function() {
    instance = new api.AudioServiceApi(config)
  });

  test("getAudioByIdByStreamfilename", () => {
    const streamFileName: string = "streamFileName_example"
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.getAudioByIdByStreamfilename(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("getAudioByIdStream", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.getAudioByIdStream(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("getAudioByIdStreamByContainer", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.getAudioByIdStreamByContainer(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("headAudioByIdByStreamfilename", () => {
    const streamFileName: string = "streamFileName_example"
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.headAudioByIdByStreamfilename(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("headAudioByIdStream", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.headAudioByIdStream(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("headAudioByIdStreamByContainer", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.headAudioByIdStreamByContainer(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
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
    const width: number = 56
    const id: string = "id_example"
    return expect(instance.getItemsByIdThumbnailset(width, id, {})).resolves.toBe(null)
  })
  test("getVideosByIdIndexBif", () => {
    const width: number = 56
    const id: string = "id_example"
    return expect(instance.getVideosByIdIndexBif(width, id, {})).resolves.toBe(null)
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
    const userId: string = "userId_example"
    const startIndex: number = 56
    const fields: string = "fields_example"
    const limit: number = 56
    const enableImages: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const enableUserData: boolean = true
    return expect(instance.getChannels(userId, startIndex, fields, limit, enableImages, imageTypeLimit, enableImageTypes, enableUserData, {})).resolves.toBe(null)
  })
})

describe("CodecParameterServiceApi", () => {
  let instance: api.CodecParameterServiceApi
  beforeEach(function() {
    instance = new api.CodecParameterServiceApi(config)
  });

  test("getEncodingCodecparameters", () => {
    const codecId: string = "codecId_example"
    const parameterContext: MediaEncodingCodecParameterContext = undefined
    return expect(instance.getEncodingCodecparameters(codecId, parameterContext, {})).resolves.toBe(null)
  })
  test("postEncodingCodecparameters", () => {
    const body: Object = undefined
    const codecId: string = "codecId_example"
    const parameterContext: MediaEncodingCodecParameterContext = undefined
    return expect(instance.postEncodingCodecparameters(body, codecId, parameterContext, {})).resolves.toBe(null)
  })
})

describe("CollectionServiceApi", () => {
  let instance: api.CollectionServiceApi
  beforeEach(function() {
    instance = new api.CollectionServiceApi(config)
  });

  test("deleteCollectionsByIdItems", () => {
    const ids: string = "ids_example"
    const id: string = "id_example"
    return expect(instance.deleteCollectionsByIdItems(ids, id, {})).resolves.toBe(null)
  })
  test("postCollections", () => {
    const isLocked: boolean = true
    const name: string = "name_example"
    const parentId: string = "parentId_example"
    const ids: string = "ids_example"
    return expect(instance.postCollections(isLocked, name, parentId, ids, {})).resolves.toBe(null)
  })
  test("postCollectionsByIdItems", () => {
    const ids: string = "ids_example"
    const id: string = "id_example"
    return expect(instance.postCollectionsByIdItems(ids, id, {})).resolves.toBe(null)
  })
  test("postCollectionsByIdItemsDelete", () => {
    const ids: string = "ids_example"
    const id: string = "id_example"
    return expect(instance.postCollectionsByIdItemsDelete(ids, id, {})).resolves.toBe(null)
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
    const key: string = "key_example"
    return expect(instance.getSystemConfigurationByKey(key, {})).resolves.toBe(null)
  })
  test("postSystemConfiguration", () => {
    const body: api.ServerConfiguration = undefined
    return expect(instance.postSystemConfiguration(body, {})).resolves.toBe(null)
  })
  test("postSystemConfigurationByKey", () => {
    const body: Object = undefined
    const key: string = "key_example"
    return expect(instance.postSystemConfigurationByKey(body, key, {})).resolves.toBe(null)
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
    const id: string = "id_example"
    return expect(instance.deleteUsersByIdConnectLink(id, {})).resolves.toBe(null)
  })
  test("getConnectExchange", () => {
    const connectUserId: string = "connectUserId_example"
    return expect(instance.getConnectExchange(connectUserId, {})).resolves.toBe(null)
  })
  test("getConnectPending", () => {
    return expect(instance.getConnectPending({})).resolves.toBe(null)
  })
  test("postUsersByIdConnectLink", () => {
    const id: string = "id_example"
    const connectUsername: string = "connectUsername_example"
    return expect(instance.postUsersByIdConnectLink(id, connectUsername, {})).resolves.toBe(null)
  })
  test("postUsersByIdConnectLinkDelete", () => {
    const id: string = "id_example"
    return expect(instance.postUsersByIdConnectLinkDelete(id, {})).resolves.toBe(null)
  })
})

describe("DeviceServiceApi", () => {
  let instance: api.DeviceServiceApi
  beforeEach(function() {
    instance = new api.DeviceServiceApi(config)
  });

  test("deleteDevices", () => {
    const id: string = "id_example"
    return expect(instance.deleteDevices(id, {})).resolves.toBe(null)
  })
  test("getDevices", () => {
    const sortOrder: string = "sortOrder_example"
    return expect(instance.getDevices(sortOrder, {})).resolves.toBe(null)
  })
  test("getDevicesCamerauploads", () => {
    return expect(instance.getDevicesCamerauploads({})).resolves.toBe(null)
  })
  test("getDevicesInfo", () => {
    const id: string = "id_example"
    return expect(instance.getDevicesInfo(id, {})).resolves.toBe(null)
  })
  test("getDevicesOptions", () => {
    const id: string = "id_example"
    return expect(instance.getDevicesOptions(id, {})).resolves.toBe(null)
  })
  test("postDevicesCamerauploads", () => {
    const body: Object = undefined
    const album: string = "album_example"
    const name: string = "name_example"
    const id: string = "id_example"
    return expect(instance.postDevicesCamerauploads(body, album, name, id, {})).resolves.toBe(null)
  })
  test("postDevicesDelete", () => {
    const id: string = "id_example"
    return expect(instance.postDevicesDelete(id, {})).resolves.toBe(null)
  })
  test("postDevicesOptions", () => {
    const body: api.DevicesDeviceOptions = undefined
    const id: string = "id_example"
    return expect(instance.postDevicesOptions(body, id, {})).resolves.toBe(null)
  })
})

describe("DisplayPreferencesServiceApi", () => {
  let instance: api.DisplayPreferencesServiceApi
  beforeEach(function() {
    instance = new api.DisplayPreferencesServiceApi(config)
  });

  test("getDisplaypreferencesById", () => {
    const id: string = "id_example"
    const userId: string = "userId_example"
    const client: string = "client_example"
    return expect(instance.getDisplaypreferencesById(id, userId, client, {})).resolves.toBe(null)
  })
  test("postDisplaypreferencesByDisplaypreferencesid", () => {
    const body: api.DisplayPreferences = undefined
    const userId: string = "userId_example"
    const displayPreferencesId: string = "displayPreferencesId_example"
    return expect(instance.postDisplaypreferencesByDisplaypreferencesid(body, userId, displayPreferencesId, {})).resolves.toBe(null)
  })
})

describe("DlnaServerServiceApi", () => {
  let instance: api.DlnaServerServiceApi
  beforeEach(function() {
    instance = new api.DlnaServerServiceApi(config)
  });

  test("getDlnaByUuidConnectionmanagerConnectionmanager", () => {
    const uuId: string = "uuId_example"
    return expect(instance.getDlnaByUuidConnectionmanagerConnectionmanager(uuId, {})).resolves.toBe(null)
  })
  test("getDlnaByUuidConnectionmanagerConnectionmanagerXml", () => {
    const uuId: string = "uuId_example"
    return expect(instance.getDlnaByUuidConnectionmanagerConnectionmanagerXml(uuId, {})).resolves.toBe(null)
  })
  test("getDlnaByUuidContentdirectoryContentdirectory", () => {
    const uuId: string = "uuId_example"
    return expect(instance.getDlnaByUuidContentdirectoryContentdirectory(uuId, {})).resolves.toBe(null)
  })
  test("getDlnaByUuidContentdirectoryContentdirectoryXml", () => {
    const uuId: string = "uuId_example"
    return expect(instance.getDlnaByUuidContentdirectoryContentdirectoryXml(uuId, {})).resolves.toBe(null)
  })
  test("getDlnaByUuidDescription", () => {
    const uuId: string = "uuId_example"
    return expect(instance.getDlnaByUuidDescription(uuId, {})).resolves.toBe(null)
  })
  test("getDlnaByUuidDescriptionXml", () => {
    const uuId: string = "uuId_example"
    return expect(instance.getDlnaByUuidDescriptionXml(uuId, {})).resolves.toBe(null)
  })
  test("getDlnaByUuidIconsByFilename", () => {
    const uuId: string = "uuId_example"
    const filename: string = "filename_example"
    return expect(instance.getDlnaByUuidIconsByFilename(uuId, filename, {})).resolves.toBe(null)
  })
  test("getDlnaIconsByFilename", () => {
    const filename: string = "filename_example"
    const uuId: string = "uuId_example"
    return expect(instance.getDlnaIconsByFilename(filename, uuId, {})).resolves.toBe(null)
  })
  test("headDlnaByUuidConnectionmanagerConnectionmanager", () => {
    const uuId: string = "uuId_example"
    return expect(instance.headDlnaByUuidConnectionmanagerConnectionmanager(uuId, {})).resolves.toBe(null)
  })
  test("headDlnaByUuidConnectionmanagerConnectionmanagerXml", () => {
    const uuId: string = "uuId_example"
    return expect(instance.headDlnaByUuidConnectionmanagerConnectionmanagerXml(uuId, {})).resolves.toBe(null)
  })
  test("headDlnaByUuidContentdirectoryContentdirectory", () => {
    const uuId: string = "uuId_example"
    return expect(instance.headDlnaByUuidContentdirectoryContentdirectory(uuId, {})).resolves.toBe(null)
  })
  test("headDlnaByUuidContentdirectoryContentdirectoryXml", () => {
    const uuId: string = "uuId_example"
    return expect(instance.headDlnaByUuidContentdirectoryContentdirectoryXml(uuId, {})).resolves.toBe(null)
  })
  test("headDlnaByUuidDescription", () => {
    const uuId: string = "uuId_example"
    return expect(instance.headDlnaByUuidDescription(uuId, {})).resolves.toBe(null)
  })
  test("headDlnaByUuidDescriptionXml", () => {
    const uuId: string = "uuId_example"
    return expect(instance.headDlnaByUuidDescriptionXml(uuId, {})).resolves.toBe(null)
  })
  test("postDlnaByUuidConnectionmanagerControl", () => {
    const body: Object = undefined
    const uuId: string = "uuId_example"
    return expect(instance.postDlnaByUuidConnectionmanagerControl(body, uuId, {})).resolves.toBe(null)
  })
  test("postDlnaByUuidContentdirectoryControl", () => {
    const body: Object = undefined
    const uuId: string = "uuId_example"
    return expect(instance.postDlnaByUuidContentdirectoryControl(body, uuId, {})).resolves.toBe(null)
  })
})

describe("DlnaServiceApi", () => {
  let instance: api.DlnaServiceApi
  beforeEach(function() {
    instance = new api.DlnaServiceApi(config)
  });

  test("deleteDlnaProfilesById", () => {
    const id: string = "id_example"
    return expect(instance.deleteDlnaProfilesById(id, {})).resolves.toBe(null)
  })
  test("getDlnaProfileinfos", () => {
    return expect(instance.getDlnaProfileinfos({})).resolves.toBe(null)
  })
  test("getDlnaProfilesById", () => {
    const id: string = "id_example"
    return expect(instance.getDlnaProfilesById(id, {})).resolves.toBe(null)
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
    const id: string = "id_example"
    return expect(instance.postDlnaProfilesById(body, id, {})).resolves.toBe(null)
  })
})

describe("DynamicHlsServiceApi", () => {
  let instance: api.DynamicHlsServiceApi
  beforeEach(function() {
    instance = new api.DynamicHlsServiceApi(config)
  });

  test("getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", () => {
    const segmentContainer: string = "segmentContainer_example"
    const segmentId: string = "segmentId_example"
    const id: string = "id_example"
    const playlistId: string = "playlistId_example"
    return expect(instance.getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(segmentContainer, segmentId, id, playlistId, {})).resolves.toBe(null)
  })
  test("getAudioByIdLiveM3u8", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.getAudioByIdLiveM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("getAudioByIdMainM3u8", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.getAudioByIdMainM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("getAudioByIdMasterM3u8", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.getAudioByIdMasterM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", () => {
    const segmentContainer: string = "segmentContainer_example"
    const segmentId: string = "segmentId_example"
    const id: string = "id_example"
    const playlistId: string = "playlistId_example"
    return expect(instance.getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(segmentContainer, segmentId, id, playlistId, {})).resolves.toBe(null)
  })
  test("getVideosByIdLiveM3u8", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.getVideosByIdLiveM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("getVideosByIdLiveSubtitlesM3u8", () => {
    const id: string = "id_example"
    const subtitleSegmentLength: number = 56
    const manifestSubtitles: string = "manifestSubtitles_example"
    return expect(instance.getVideosByIdLiveSubtitlesM3u8(id, subtitleSegmentLength, manifestSubtitles, {})).resolves.toBe(null)
  })
  test("getVideosByIdMainM3u8", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.getVideosByIdMainM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("getVideosByIdMasterM3u8", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.getVideosByIdMasterM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("getVideosByIdSubtitlesM3u8", () => {
    const id: string = "id_example"
    const subtitleSegmentLength: number = 56
    const manifestSubtitles: string = "manifestSubtitles_example"
    return expect(instance.getVideosByIdSubtitlesM3u8(id, subtitleSegmentLength, manifestSubtitles, {})).resolves.toBe(null)
  })
  test("headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", () => {
    const segmentContainer: string = "segmentContainer_example"
    const segmentId: string = "segmentId_example"
    const id: string = "id_example"
    const playlistId: string = "playlistId_example"
    return expect(instance.headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(segmentContainer, segmentId, id, playlistId, {})).resolves.toBe(null)
  })
  test("headAudioByIdMasterM3u8", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.headAudioByIdMasterM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer", () => {
    const segmentContainer: string = "segmentContainer_example"
    const segmentId: string = "segmentId_example"
    const id: string = "id_example"
    const playlistId: string = "playlistId_example"
    return expect(instance.headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(segmentContainer, segmentId, id, playlistId, {})).resolves.toBe(null)
  })
  test("headVideosByIdMasterM3u8", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.headVideosByIdMasterM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
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
    const path: string = "path_example"
    const includeFiles: boolean = true
    const includeDirectories: boolean = true
    return expect(instance.getEnvironmentDirectorycontents(path, includeFiles, includeDirectories, {})).resolves.toBe(null)
  })
  test("getEnvironmentDrives", () => {
    return expect(instance.getEnvironmentDrives({})).resolves.toBe(null)
  })
  test("getEnvironmentNetworkdevices", () => {
    return expect(instance.getEnvironmentNetworkdevices({})).resolves.toBe(null)
  })
  test("getEnvironmentNetworkshares", () => {
    const path: string = "path_example"
    return expect(instance.getEnvironmentNetworkshares(path, {})).resolves.toBe(null)
  })
  test("getEnvironmentParentpath", () => {
    const path: string = "path_example"
    return expect(instance.getEnvironmentParentpath(path, {})).resolves.toBe(null)
  })
  test("postEnvironmentDirectorycontents", () => {
    const body: api.GetDirectoryContents = undefined
    const path: string = "path_example"
    const includeFiles: boolean = true
    const includeDirectories: boolean = true
    return expect(instance.postEnvironmentDirectorycontents(body, path, includeFiles, includeDirectories, {})).resolves.toBe(null)
  })
  test("postEnvironmentValidatepath", () => {
    const body: api.ValidatePath = undefined
    const path: string = "path_example"
    return expect(instance.postEnvironmentValidatepath(body, path, {})).resolves.toBe(null)
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
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getGamegenres(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getGamegenresByName", () => {
    const name: string = "name_example"
    const userId: string = "userId_example"
    return expect(instance.getGamegenresByName(name, userId, {})).resolves.toBe(null)
  })
})

describe("GenericUIApiServiceApi", () => {
  let instance: api.GenericUIApiServiceApi
  beforeEach(function() {
    instance = new api.GenericUIApiServiceApi(config)
  });

  test("getUIView", () => {
    const pageId: string = "pageId_example"
    const clientLocale: string = "clientLocale_example"
    return expect(instance.getUIView(pageId, clientLocale, {})).resolves.toBe(null)
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
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getGenres(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getGenresByName", () => {
    const name: string = "name_example"
    const userId: string = "userId_example"
    return expect(instance.getGenresByName(name, userId, {})).resolves.toBe(null)
  })
})

describe("HlsSegmentServiceApi", () => {
  let instance: api.HlsSegmentServiceApi
  beforeEach(function() {
    instance = new api.HlsSegmentServiceApi(config)
  });

  test("deleteVideosActiveencodings", () => {
    const deviceId: string = "deviceId_example"
    const playSessionId: string = "playSessionId_example"
    return expect(instance.deleteVideosActiveencodings(deviceId, playSessionId, {})).resolves.toBe(null)
  })
  test("postVideosActiveencodingsDelete", () => {
    const deviceId: string = "deviceId_example"
    const playSessionId: string = "playSessionId_example"
    return expect(instance.postVideosActiveencodingsDelete(deviceId, playSessionId, {})).resolves.toBe(null)
  })
})

describe("ImageServiceApi", () => {
  let instance: api.ImageServiceApi
  beforeEach(function() {
    instance = new api.ImageServiceApi(config)
  });

  test("deleteItemsByIdImagesByType", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    return expect(instance.deleteItemsByIdImagesByType(id, type, index, {})).resolves.toBe(null)
  })
  test("deleteItemsByIdImagesByTypeByIndex", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    return expect(instance.deleteItemsByIdImagesByTypeByIndex(id, type, index, {})).resolves.toBe(null)
  })
  test("deleteUsersByIdImagesByType", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    return expect(instance.deleteUsersByIdImagesByType(id, type, index, {})).resolves.toBe(null)
  })
  test("deleteUsersByIdImagesByTypeByIndex", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    return expect(instance.deleteUsersByIdImagesByTypeByIndex(id, type, index, {})).resolves.toBe(null)
  })
  test("getArtistsByNameImagesByType", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.getArtistsByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("getArtistsByNameImagesByTypeByIndex", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.getArtistsByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("getGamegenresByNameImagesByType", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.getGamegenresByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("getGamegenresByNameImagesByTypeByIndex", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.getGamegenresByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("getGenresByNameImagesByType", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.getGenresByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("getGenresByNameImagesByTypeByIndex", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.getGenresByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("getItemsByIdImages", () => {
    const id: string = "id_example"
    return expect(instance.getItemsByIdImages(id, {})).resolves.toBe(null)
  })
  test("getItemsByIdImagesByType", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.getItemsByIdImagesByType(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("getItemsByIdImagesByTypeByIndex", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.getItemsByIdImagesByTypeByIndex(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount", () => {
    const percentPlayed: number = 56
    const unPlayedCount: number = 56
    const id: string = "id_example"
    const maxWidth: number = 56
    const maxHeight: number = 56
    const tag: string = "tag_example"
    const format: string = "format_example"
    const type: ImageType = undefined
    const index: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(percentPlayed, unPlayedCount, id, maxWidth, maxHeight, tag, format, type, index, width, height, quality, cropWhitespace, enableImageEnhancers, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("getMusicgenresByNameImagesByType", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.getMusicgenresByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("getMusicgenresByNameImagesByTypeByIndex", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.getMusicgenresByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("getPersonsByNameImagesByType", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.getPersonsByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("getPersonsByNameImagesByTypeByIndex", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.getPersonsByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("getStudiosByNameImagesByType", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.getStudiosByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("getStudiosByNameImagesByTypeByIndex", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.getStudiosByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("getUsersByIdImagesByType", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.getUsersByIdImagesByType(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("getUsersByIdImagesByTypeByIndex", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.getUsersByIdImagesByTypeByIndex(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("headArtistsByNameImagesByType", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.headArtistsByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("headArtistsByNameImagesByTypeByIndex", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.headArtistsByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("headGamegenresByNameImagesByType", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.headGamegenresByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("headGamegenresByNameImagesByTypeByIndex", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.headGamegenresByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("headGenresByNameImagesByType", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.headGenresByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("headGenresByNameImagesByTypeByIndex", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.headGenresByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("headItemsByIdImagesByType", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.headItemsByIdImagesByType(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("headItemsByIdImagesByTypeByIndex", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.headItemsByIdImagesByTypeByIndex(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount", () => {
    const percentPlayed: number = 56
    const unPlayedCount: number = 56
    const id: string = "id_example"
    const maxWidth: number = 56
    const maxHeight: number = 56
    const tag: string = "tag_example"
    const format: string = "format_example"
    const type: ImageType = undefined
    const index: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(percentPlayed, unPlayedCount, id, maxWidth, maxHeight, tag, format, type, index, width, height, quality, cropWhitespace, enableImageEnhancers, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("headMusicgenresByNameImagesByType", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.headMusicgenresByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("headMusicgenresByNameImagesByTypeByIndex", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.headMusicgenresByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("headPersonsByNameImagesByType", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.headPersonsByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("headPersonsByNameImagesByTypeByIndex", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.headPersonsByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("headStudiosByNameImagesByType", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.headStudiosByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("headStudiosByNameImagesByTypeByIndex", () => {
    const name: string = "name_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.headStudiosByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("headUsersByIdImagesByType", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    const index: number = 56
    return expect(instance.headUsersByIdImagesByType(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index, {})).resolves.toBe(null)
  })
  test("headUsersByIdImagesByTypeByIndex", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const width: number = 56
    const height: number = 56
    const quality: number = 56
    const tag: string = "tag_example"
    const cropWhitespace: boolean = true
    const enableImageEnhancers: boolean = true
    const format: string = "format_example"
    const backgroundColor: string = "backgroundColor_example"
    const foregroundLayer: string = "foregroundLayer_example"
    const autoOrient: boolean = true
    const keepAnimation: boolean = true
    return expect(instance.headUsersByIdImagesByTypeByIndex(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, {})).resolves.toBe(null)
  })
  test("postItemsByIdImagesByType", () => {
    const body: Object = undefined
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    return expect(instance.postItemsByIdImagesByType(body, id, type, index, {})).resolves.toBe(null)
  })
  test("postItemsByIdImagesByTypeByIndex", () => {
    const body: Object = undefined
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    return expect(instance.postItemsByIdImagesByTypeByIndex(body, id, type, index, {})).resolves.toBe(null)
  })
  test("postItemsByIdImagesByTypeByIndexDelete", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    return expect(instance.postItemsByIdImagesByTypeByIndexDelete(id, type, index, {})).resolves.toBe(null)
  })
  test("postItemsByIdImagesByTypeByIndexIndex", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    const newIndex: number = 56
    return expect(instance.postItemsByIdImagesByTypeByIndexIndex(id, type, index, newIndex, {})).resolves.toBe(null)
  })
  test("postItemsByIdImagesByTypeByIndexUrl", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    const url: string = "url_example"
    return expect(instance.postItemsByIdImagesByTypeByIndexUrl(id, type, index, url, {})).resolves.toBe(null)
  })
  test("postItemsByIdImagesByTypeDelete", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    return expect(instance.postItemsByIdImagesByTypeDelete(id, type, index, {})).resolves.toBe(null)
  })
  test("postUsersByIdImagesByType", () => {
    const body: Object = undefined
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    return expect(instance.postUsersByIdImagesByType(body, id, type, index, {})).resolves.toBe(null)
  })
  test("postUsersByIdImagesByTypeByIndex", () => {
    const body: Object = undefined
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    return expect(instance.postUsersByIdImagesByTypeByIndex(body, id, type, index, {})).resolves.toBe(null)
  })
  test("postUsersByIdImagesByTypeByIndexDelete", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    return expect(instance.postUsersByIdImagesByTypeByIndexDelete(id, type, index, {})).resolves.toBe(null)
  })
  test("postUsersByIdImagesByTypeDelete", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const index: number = 56
    return expect(instance.postUsersByIdImagesByTypeDelete(id, type, index, {})).resolves.toBe(null)
  })
})

describe("InstantMixServiceApi", () => {
  let instance: api.InstantMixServiceApi
  beforeEach(function() {
    instance = new api.InstantMixServiceApi(config)
  });

  test("getAlbumsByIdInstantmix", () => {
    const id: string = "id_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const userId: string = "userId_example"
    const limit: number = 56
    const fields: string = "fields_example"
    return expect(instance.getAlbumsByIdInstantmix(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, {})).resolves.toBe(null)
  })
  test("getArtistsInstantmix", () => {
    const includeItemTypes: string = "includeItemTypes_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const userId: string = "userId_example"
    const limit: number = 56
    const fields: string = "fields_example"
    return expect(instance.getArtistsInstantmix(includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, {})).resolves.toBe(null)
  })
  test("getAudiobooksNextup", () => {
    const userId: string = "userId_example"
    const startIndex: number = 56
    const limit: number = 56
    const fields: string = "fields_example"
    const albumId: string = "albumId_example"
    const parentId: string = "parentId_example"
    const enableImages: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const enableUserData: boolean = true
    return expect(instance.getAudiobooksNextup(userId, startIndex, limit, fields, albumId, parentId, enableImages, imageTypeLimit, enableImageTypes, enableUserData, {})).resolves.toBe(null)
  })
  test("getItemsByIdInstantmix", () => {
    const id: string = "id_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const userId: string = "userId_example"
    const limit: number = 56
    const fields: string = "fields_example"
    return expect(instance.getItemsByIdInstantmix(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, {})).resolves.toBe(null)
  })
  test("getMusicgenresByNameInstantmix", () => {
    const name: string = "name_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const userId: string = "userId_example"
    const limit: number = 56
    const fields: string = "fields_example"
    return expect(instance.getMusicgenresByNameInstantmix(name, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, {})).resolves.toBe(null)
  })
  test("getMusicgenresInstantmix", () => {
    const includeItemTypes: string = "includeItemTypes_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const userId: string = "userId_example"
    const limit: number = 56
    const fields: string = "fields_example"
    return expect(instance.getMusicgenresInstantmix(includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, {})).resolves.toBe(null)
  })
  test("getPlaylistsByIdInstantmix", () => {
    const id: string = "id_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const userId: string = "userId_example"
    const limit: number = 56
    const fields: string = "fields_example"
    return expect(instance.getPlaylistsByIdInstantmix(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, {})).resolves.toBe(null)
  })
  test("getSongsByIdInstantmix", () => {
    const id: string = "id_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const userId: string = "userId_example"
    const limit: number = 56
    const fields: string = "fields_example"
    return expect(instance.getSongsByIdInstantmix(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, {})).resolves.toBe(null)
  })
})

describe("ItemLookupServiceApi", () => {
  let instance: api.ItemLookupServiceApi
  beforeEach(function() {
    instance = new api.ItemLookupServiceApi(config)
  });

  test("getItemsByIdExternalidinfos", () => {
    const id: string = "id_example"
    return expect(instance.getItemsByIdExternalidinfos(id, {})).resolves.toBe(null)
  })
  test("getItemsRemotesearchImage", () => {
    const imageUrl: string = "imageUrl_example"
    const providerName: string = "providerName_example"
    return expect(instance.getItemsRemotesearchImage(imageUrl, providerName, {})).resolves.toBe(null)
  })
  test("postItemsMetadataReset", () => {
    const itemIds: string = "itemIds_example"
    return expect(instance.postItemsMetadataReset(itemIds, {})).resolves.toBe(null)
  })
  test("postItemsRemotesearchApplyById", () => {
    const body: api.RemoteSearchResult = undefined
    const id: string = "id_example"
    const replaceAllImages: boolean = true
    return expect(instance.postItemsRemotesearchApplyById(body, id, replaceAllImages, {})).resolves.toBe(null)
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
    const id: string = "id_example"
    const recursive: boolean = true
    const metadataRefreshMode: MetadataRefreshMode = undefined
    const imageRefreshMode: MetadataRefreshMode = undefined
    const replaceAllMetadata: boolean = true
    const replaceAllImages: boolean = true
    return expect(instance.postItemsByIdRefresh(id, recursive, metadataRefreshMode, imageRefreshMode, replaceAllMetadata, replaceAllImages, {})).resolves.toBe(null)
  })
})

describe("ItemUpdateServiceApi", () => {
  let instance: api.ItemUpdateServiceApi
  beforeEach(function() {
    instance = new api.ItemUpdateServiceApi(config)
  });

  test("getItemsByItemidMetadataeditor", () => {
    const itemId: string = "itemId_example"
    return expect(instance.getItemsByItemidMetadataeditor(itemId, {})).resolves.toBe(null)
  })
  test("postItemsByItemid", () => {
    const body: api.BaseItemDto = undefined
    const itemId: string = "itemId_example"
    return expect(instance.postItemsByItemid(body, itemId, {})).resolves.toBe(null)
  })
})

describe("ItemsServiceApi", () => {
  let instance: api.ItemsServiceApi
  beforeEach(function() {
    instance = new api.ItemsServiceApi(config)
  });

  test("getItems", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getItems(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItems", () => {
    const userId: string = "userId_example"
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getUsersByUseridItems(userId, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItemsResume", () => {
    const userId: string = "userId_example"
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getUsersByUseridItemsResume(userId, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
})

describe("LibraryServiceApi", () => {
  let instance: api.LibraryServiceApi
  beforeEach(function() {
    instance = new api.LibraryServiceApi(config)
  });

  test("deleteItems", () => {
    const ids: string = "ids_example"
    return expect(instance.deleteItems(ids, {})).resolves.toBe(null)
  })
  test("deleteItemsById", () => {
    const id: string = "id_example"
    return expect(instance.deleteItemsById(id, {})).resolves.toBe(null)
  })
  test("getAlbumsByIdSimilar", () => {
    const id: string = "id_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const userId: string = "userId_example"
    const limit: number = 56
    const fields: string = "fields_example"
    return expect(instance.getAlbumsByIdSimilar(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, {})).resolves.toBe(null)
  })
  test("getArtistsByIdSimilar", () => {
    const id: string = "id_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const userId: string = "userId_example"
    const limit: number = 56
    const fields: string = "fields_example"
    return expect(instance.getArtistsByIdSimilar(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, {})).resolves.toBe(null)
  })
  test("getGamesByIdSimilar", () => {
    const id: string = "id_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const userId: string = "userId_example"
    const limit: number = 56
    const fields: string = "fields_example"
    return expect(instance.getGamesByIdSimilar(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, {})).resolves.toBe(null)
  })
  test("getItemsByIdAncestors", () => {
    const id: string = "id_example"
    const userId: string = "userId_example"
    return expect(instance.getItemsByIdAncestors(id, userId, {})).resolves.toBe(null)
  })
  test("getItemsByIdCriticreviews", () => {
    const id: string = "id_example"
    const startIndex: number = 56
    const limit: number = 56
    return expect(instance.getItemsByIdCriticreviews(id, startIndex, limit, {})).resolves.toBe(null)
  })
  test("getItemsByIdDeleteinfo", () => {
    const id: string = "id_example"
    return expect(instance.getItemsByIdDeleteinfo(id, {})).resolves.toBe(null)
  })
  test("getItemsByIdDownload", () => {
    const id: string = "id_example"
    return expect(instance.getItemsByIdDownload(id, {})).resolves.toBe(null)
  })
  test("getItemsByIdFile", () => {
    const id: string = "id_example"
    return expect(instance.getItemsByIdFile(id, {})).resolves.toBe(null)
  })
  test("getItemsByIdSimilar", () => {
    const id: string = "id_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const userId: string = "userId_example"
    const limit: number = 56
    const fields: string = "fields_example"
    return expect(instance.getItemsByIdSimilar(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, {})).resolves.toBe(null)
  })
  test("getItemsByIdThememedia", () => {
    const id: string = "id_example"
    const userId: string = "userId_example"
    const inheritFromParent: boolean = true
    const enableImages: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const enableUserData: boolean = true
    const fields: string = "fields_example"
    return expect(instance.getItemsByIdThememedia(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields, {})).resolves.toBe(null)
  })
  test("getItemsByIdThemesongs", () => {
    const id: string = "id_example"
    const userId: string = "userId_example"
    const inheritFromParent: boolean = true
    const enableImages: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const enableUserData: boolean = true
    const fields: string = "fields_example"
    return expect(instance.getItemsByIdThemesongs(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields, {})).resolves.toBe(null)
  })
  test("getItemsByIdThemevideos", () => {
    const id: string = "id_example"
    const userId: string = "userId_example"
    const inheritFromParent: boolean = true
    const enableImages: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const enableUserData: boolean = true
    const fields: string = "fields_example"
    return expect(instance.getItemsByIdThemevideos(id, userId, inheritFromParent, enableImages, imageTypeLimit, enableImageTypes, enableUserData, fields, {})).resolves.toBe(null)
  })
  test("getItemsCounts", () => {
    const userId: string = "userId_example"
    const isFavorite: boolean = true
    return expect(instance.getItemsCounts(userId, isFavorite, {})).resolves.toBe(null)
  })
  test("getItemsIntros", () => {
    return expect(instance.getItemsIntros({})).resolves.toBe(null)
  })
  test("getLibrariesAvailableoptions", () => {
    return expect(instance.getLibrariesAvailableoptions({})).resolves.toBe(null)
  })
  test("getLibraryMediafolders", () => {
    const isHidden: boolean = true
    return expect(instance.getLibraryMediafolders(isHidden, {})).resolves.toBe(null)
  })
  test("getLibraryPhysicalpaths", () => {
    return expect(instance.getLibraryPhysicalpaths({})).resolves.toBe(null)
  })
  test("getLibrarySelectablemediafolders", () => {
    return expect(instance.getLibrarySelectablemediafolders({})).resolves.toBe(null)
  })
  test("getMoviesByIdSimilar", () => {
    const id: string = "id_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const userId: string = "userId_example"
    const limit: number = 56
    const fields: string = "fields_example"
    return expect(instance.getMoviesByIdSimilar(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, {})).resolves.toBe(null)
  })
  test("getShowsByIdSimilar", () => {
    const id: string = "id_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const userId: string = "userId_example"
    const limit: number = 56
    const fields: string = "fields_example"
    return expect(instance.getShowsByIdSimilar(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, {})).resolves.toBe(null)
  })
  test("getTrailersByIdSimilar", () => {
    const id: string = "id_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const userId: string = "userId_example"
    const limit: number = 56
    const fields: string = "fields_example"
    return expect(instance.getTrailersByIdSimilar(id, includeItemTypes, enableImages, enableUserData, imageTypeLimit, enableImageTypes, userId, limit, fields, {})).resolves.toBe(null)
  })
  test("postItemsByIdDelete", () => {
    const id: string = "id_example"
    return expect(instance.postItemsByIdDelete(id, {})).resolves.toBe(null)
  })
  test("postItemsDelete", () => {
    const ids: string = "ids_example"
    return expect(instance.postItemsDelete(ids, {})).resolves.toBe(null)
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
    const startIndex: number = 56
    const limit: number = 56
    return expect(instance.getLibraryVirtualfoldersQuery(startIndex, limit, {})).resolves.toBe(null)
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
    const id: string = "id_example"
    const segment: string = "segment_example"
    return expect(instance.getLivetvLiverecordingsByIdHlsBySegment(id, segment, {})).resolves.toBe(null)
  })
  test("getLivetvLiverecordingsByIdHlsLiveM3u8", () => {
    const id: string = "id_example"
    return expect(instance.getLivetvLiverecordingsByIdHlsLiveM3u8(id, {})).resolves.toBe(null)
  })
  test("getLivetvLiverecordingsByIdHlsMasterM3u8", () => {
    const id: string = "id_example"
    return expect(instance.getLivetvLiverecordingsByIdHlsMasterM3u8(id, {})).resolves.toBe(null)
  })
  test("getLivetvLiverecordingsByIdStream", () => {
    const id: string = "id_example"
    return expect(instance.getLivetvLiverecordingsByIdStream(id, {})).resolves.toBe(null)
  })
  test("getLivetvLivestreamfilesByIdHlsBySegment", () => {
    const id: string = "id_example"
    const segment: string = "segment_example"
    return expect(instance.getLivetvLivestreamfilesByIdHlsBySegment(id, segment, {})).resolves.toBe(null)
  })
  test("getLivetvLivestreamfilesByIdHlsLiveM3u8", () => {
    const id: string = "id_example"
    return expect(instance.getLivetvLivestreamfilesByIdHlsLiveM3u8(id, {})).resolves.toBe(null)
  })
  test("getLivetvLivestreamfilesByIdHlsMasterM3u8", () => {
    const id: string = "id_example"
    return expect(instance.getLivetvLivestreamfilesByIdHlsMasterM3u8(id, {})).resolves.toBe(null)
  })
  test("getLivetvLivestreamfilesByIdStreamByContainer", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    return expect(instance.getLivetvLivestreamfilesByIdStreamByContainer(id, container, {})).resolves.toBe(null)
  })
  test("headLivetvLiverecordingsByIdHlsBySegment", () => {
    const id: string = "id_example"
    const segment: string = "segment_example"
    return expect(instance.headLivetvLiverecordingsByIdHlsBySegment(id, segment, {})).resolves.toBe(null)
  })
  test("headLivetvLiverecordingsByIdHlsLiveM3u8", () => {
    const id: string = "id_example"
    return expect(instance.headLivetvLiverecordingsByIdHlsLiveM3u8(id, {})).resolves.toBe(null)
  })
  test("headLivetvLiverecordingsByIdHlsMasterM3u8", () => {
    const id: string = "id_example"
    return expect(instance.headLivetvLiverecordingsByIdHlsMasterM3u8(id, {})).resolves.toBe(null)
  })
  test("headLivetvLivestreamfilesByIdHlsBySegment", () => {
    const id: string = "id_example"
    const segment: string = "segment_example"
    return expect(instance.headLivetvLivestreamfilesByIdHlsBySegment(id, segment, {})).resolves.toBe(null)
  })
  test("headLivetvLivestreamfilesByIdHlsLiveM3u8", () => {
    const id: string = "id_example"
    return expect(instance.headLivetvLivestreamfilesByIdHlsLiveM3u8(id, {})).resolves.toBe(null)
  })
  test("headLivetvLivestreamfilesByIdHlsMasterM3u8", () => {
    const id: string = "id_example"
    return expect(instance.headLivetvLivestreamfilesByIdHlsMasterM3u8(id, {})).resolves.toBe(null)
  })
})

describe("LiveTvServiceApi", () => {
  let instance: api.LiveTvServiceApi
  beforeEach(function() {
    instance = new api.LiveTvServiceApi(config)
  });

  test("deleteLivetvChannelmappingoptions", () => {
    const providerId: string = "providerId_example"
    return expect(instance.deleteLivetvChannelmappingoptions(providerId, {})).resolves.toBe(null)
  })
  test("deleteLivetvChannelmappings", () => {
    const providerId: string = "providerId_example"
    return expect(instance.deleteLivetvChannelmappings(providerId, {})).resolves.toBe(null)
  })
  test("deleteLivetvListingproviders", () => {
    const id: string = "id_example"
    return expect(instance.deleteLivetvListingproviders(id, {})).resolves.toBe(null)
  })
  test("deleteLivetvRecordingsById", () => {
    const id: string = "id_example"
    return expect(instance.deleteLivetvRecordingsById(id, {})).resolves.toBe(null)
  })
  test("deleteLivetvSeriestimersById", () => {
    const id: string = "id_example"
    return expect(instance.deleteLivetvSeriestimersById(id, {})).resolves.toBe(null)
  })
  test("deleteLivetvTimersById", () => {
    const id: string = "id_example"
    return expect(instance.deleteLivetvTimersById(id, {})).resolves.toBe(null)
  })
  test("deleteLivetvTunerhosts", () => {
    const id: string = "id_example"
    return expect(instance.deleteLivetvTunerhosts(id, {})).resolves.toBe(null)
  })
  test("getLivetvAvailablerecordingoptions", () => {
    return expect(instance.getLivetvAvailablerecordingoptions({})).resolves.toBe(null)
  })
  test("getLivetvChannelmappingoptions", () => {
    const providerId: string = "providerId_example"
    return expect(instance.getLivetvChannelmappingoptions(providerId, {})).resolves.toBe(null)
  })
  test("getLivetvChannelmappings", () => {
    const providerId: string = "providerId_example"
    return expect(instance.getLivetvChannelmappings(providerId, {})).resolves.toBe(null)
  })
  test("getLivetvChannels", () => {
    const type: LiveTvChannelType = undefined
    const isLiked: boolean = true
    const isDisliked: boolean = true
    const enableFavoriteSorting: boolean = true
    const addCurrentProgram: boolean = true
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getLivetvChannels(type, isLiked, isDisliked, enableFavoriteSorting, addCurrentProgram, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getLivetvChannelsById", () => {
    const id: string = "id_example"
    const userId: string = "userId_example"
    return expect(instance.getLivetvChannelsById(id, userId, {})).resolves.toBe(null)
  })
  test("getLivetvChanneltags", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getLivetvChanneltags(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getLivetvChanneltagsPrefixes", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getLivetvChanneltagsPrefixes(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getLivetvEPG", () => {
    const type: LiveTvChannelType = undefined
    const isLiked: boolean = true
    const isDisliked: boolean = true
    const enableFavoriteSorting: boolean = true
    const addCurrentProgram: boolean = true
    const channelIds: string = "channelIds_example"
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getLivetvEPG(type, isLiked, isDisliked, enableFavoriteSorting, addCurrentProgram, channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
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
    const channelId: string = "channelId_example"
    return expect(instance.getLivetvListingproviders(channelId, {})).resolves.toBe(null)
  })
  test("getLivetvListingprovidersAvailable", () => {
    return expect(instance.getLivetvListingprovidersAvailable({})).resolves.toBe(null)
  })
  test("getLivetvListingprovidersDefault", () => {
    return expect(instance.getLivetvListingprovidersDefault({})).resolves.toBe(null)
  })
  test("getLivetvListingprovidersLineups", () => {
    const id: string = "id_example"
    const type: string = "type_example"
    const location: string = "location_example"
    const country: string = "country_example"
    return expect(instance.getLivetvListingprovidersLineups(id, type, location, country, {})).resolves.toBe(null)
  })
  test("getLivetvListingprovidersSchedulesdirectCountries", () => {
    return expect(instance.getLivetvListingprovidersSchedulesdirectCountries({})).resolves.toBe(null)
  })
  test("getLivetvManageChannels", () => {
    const startIndex: number = 56
    const limit: number = 56
    const sortBy: string = "sortBy_example"
    const sortOrder: string = "sortOrder_example"
    return expect(instance.getLivetvManageChannels(startIndex, limit, sortBy, sortOrder, {})).resolves.toBe(null)
  })
  test("getLivetvPrograms", () => {
    const channelIds: string = "channelIds_example"
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getLivetvPrograms(channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getLivetvProgramsRecommended", () => {
    const userId: string = "userId_example"
    const limit: number = 56
    const isAiring: boolean = true
    const hasAired: boolean = true
    const isSeries: boolean = true
    const isMovie: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const enableImages: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const genreIds: string = "genreIds_example"
    const fields: string = "fields_example"
    const enableUserData: boolean = true
    return expect(instance.getLivetvProgramsRecommended(userId, limit, isAiring, hasAired, isSeries, isMovie, isNews, isKids, isSports, enableImages, imageTypeLimit, enableImageTypes, genreIds, fields, enableUserData, {})).resolves.toBe(null)
  })
  test("getLivetvRecordings", () => {
    const channelId: string = "channelId_example"
    const status: LiveTvRecordingStatus = undefined
    const isInProgress: boolean = true
    const seriesTimerId: string = "seriesTimerId_example"
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getLivetvRecordings(channelId, status, isInProgress, seriesTimerId, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getLivetvRecordingsById", () => {
    const id: string = "id_example"
    const userId: string = "userId_example"
    return expect(instance.getLivetvRecordingsById(id, userId, {})).resolves.toBe(null)
  })
  test("getLivetvRecordingsFolders", () => {
    const userId: string = "userId_example"
    const fields: string = "fields_example"
    const enableImages: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const enableUserData: boolean = true
    return expect(instance.getLivetvRecordingsFolders(userId, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, {})).resolves.toBe(null)
  })
  test("getLivetvRecordingsGroups", () => {
    return expect(instance.getLivetvRecordingsGroups({})).resolves.toBe(null)
  })
  test("getLivetvRecordingsSeries", () => {
    return expect(instance.getLivetvRecordingsSeries({})).resolves.toBe(null)
  })
  test("getLivetvSeriestimers", () => {
    const sortBy: string = "sortBy_example"
    const sortOrder: SortOrder = undefined
    const startIndex: number = 56
    const limit: number = 56
    return expect(instance.getLivetvSeriestimers(sortBy, sortOrder, startIndex, limit, {})).resolves.toBe(null)
  })
  test("getLivetvSeriestimersById", () => {
    const id: string = "id_example"
    return expect(instance.getLivetvSeriestimersById(id, {})).resolves.toBe(null)
  })
  test("getLivetvTimers", () => {
    const channelId: string = "channelId_example"
    const seriesTimerId: string = "seriesTimerId_example"
    return expect(instance.getLivetvTimers(channelId, seriesTimerId, {})).resolves.toBe(null)
  })
  test("getLivetvTimersById", () => {
    const id: string = "id_example"
    return expect(instance.getLivetvTimersById(id, {})).resolves.toBe(null)
  })
  test("getLivetvTimersDefaults", () => {
    const programId: string = "programId_example"
    return expect(instance.getLivetvTimersDefaults(programId, {})).resolves.toBe(null)
  })
  test("getLivetvTunerhosts", () => {
    return expect(instance.getLivetvTunerhosts({})).resolves.toBe(null)
  })
  test("getLivetvTunerhostsDefaultByType", () => {
    const type: string = "type_example"
    return expect(instance.getLivetvTunerhostsDefaultByType(type, {})).resolves.toBe(null)
  })
  test("getLivetvTunerhostsTypes", () => {
    return expect(instance.getLivetvTunerhostsTypes({})).resolves.toBe(null)
  })
  test("getLivetvTunersDiscvover", () => {
    return expect(instance.getLivetvTunersDiscvover({})).resolves.toBe(null)
  })
  test("headLivetvChannelmappingoptions", () => {
    const providerId: string = "providerId_example"
    return expect(instance.headLivetvChannelmappingoptions(providerId, {})).resolves.toBe(null)
  })
  test("headLivetvChannelmappings", () => {
    const providerId: string = "providerId_example"
    return expect(instance.headLivetvChannelmappings(providerId, {})).resolves.toBe(null)
  })
  test("postLivetvChannelmappingoptions", () => {
    const providerId: string = "providerId_example"
    return expect(instance.postLivetvChannelmappingoptions(providerId, {})).resolves.toBe(null)
  })
  test("postLivetvChannelmappings", () => {
    const body: api.ApiSetChannelMapping = undefined
    const providerId: string = "providerId_example"
    return expect(instance.postLivetvChannelmappings(body, providerId, {})).resolves.toBe(null)
  })
  test("postLivetvListingproviders", () => {
    const body: api.LiveTvListingsProviderInfo = undefined
    return expect(instance.postLivetvListingproviders(body, {})).resolves.toBe(null)
  })
  test("postLivetvListingprovidersDelete", () => {
    const id: string = "id_example"
    return expect(instance.postLivetvListingprovidersDelete(id, {})).resolves.toBe(null)
  })
  test("postLivetvManageChannelsByIdDisabled", () => {
    const body: api.ApiSetChannelDisabled = undefined
    const id: string = "id_example"
    return expect(instance.postLivetvManageChannelsByIdDisabled(body, id, {})).resolves.toBe(null)
  })
  test("postLivetvManageChannelsByIdSortindex", () => {
    const body: api.ApiSetChannelSortIndex = undefined
    const id: string = "id_example"
    return expect(instance.postLivetvManageChannelsByIdSortindex(body, id, {})).resolves.toBe(null)
  })
  test("postLivetvPrograms", () => {
    const body: api.ApiBaseItemsRequest = undefined
    const channelIds: string = "channelIds_example"
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.postLivetvPrograms(body, channelIds, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("postLivetvRecordingsByIdDelete", () => {
    const id: string = "id_example"
    return expect(instance.postLivetvRecordingsByIdDelete(id, {})).resolves.toBe(null)
  })
  test("postLivetvSeriestimers", () => {
    const body: api.LiveTvSeriesTimerInfo = undefined
    return expect(instance.postLivetvSeriestimers(body, {})).resolves.toBe(null)
  })
  test("postLivetvSeriestimersById", () => {
    const body: api.LiveTvSeriesTimerInfo = undefined
    const id: string = "id_example"
    return expect(instance.postLivetvSeriestimersById(body, id, {})).resolves.toBe(null)
  })
  test("postLivetvSeriestimersByIdDelete", () => {
    const id: string = "id_example"
    return expect(instance.postLivetvSeriestimersByIdDelete(id, {})).resolves.toBe(null)
  })
  test("postLivetvTimers", () => {
    const body: api.LiveTvTimerInfoDto = undefined
    return expect(instance.postLivetvTimers(body, {})).resolves.toBe(null)
  })
  test("postLivetvTimersById", () => {
    const body: api.LiveTvTimerInfoDto = undefined
    const id: string = "id_example"
    return expect(instance.postLivetvTimersById(body, id, {})).resolves.toBe(null)
  })
  test("postLivetvTimersByIdDelete", () => {
    const id: string = "id_example"
    return expect(instance.postLivetvTimersByIdDelete(id, {})).resolves.toBe(null)
  })
  test("postLivetvTunerhosts", () => {
    const body: api.LiveTvTunerHostInfo = undefined
    return expect(instance.postLivetvTunerhosts(body, {})).resolves.toBe(null)
  })
  test("postLivetvTunerhostsDelete", () => {
    const id: string = "id_example"
    return expect(instance.postLivetvTunerhostsDelete(id, {})).resolves.toBe(null)
  })
  test("postLivetvTunersByIdReset", () => {
    const id: string = "id_example"
    return expect(instance.postLivetvTunersByIdReset(id, {})).resolves.toBe(null)
  })
  test("putLivetvChannelmappingoptions", () => {
    const providerId: string = "providerId_example"
    return expect(instance.putLivetvChannelmappingoptions(providerId, {})).resolves.toBe(null)
  })
  test("putLivetvChannelmappings", () => {
    const body: api.ApiSetChannelMapping = undefined
    const providerId: string = "providerId_example"
    return expect(instance.putLivetvChannelmappings(body, providerId, {})).resolves.toBe(null)
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
    const id: string = "id_example"
    const userId: string = "userId_example"
    return expect(instance.getItemsByIdPlaybackinfo(id, userId, {})).resolves.toBe(null)
  })
  test("getPlaybackBitratetest", () => {
    const size: number = 789
    return expect(instance.getPlaybackBitratetest(size, {})).resolves.toBe(null)
  })
  test("postItemsByIdPlaybackinfo", () => {
    const body: api.PlaybackInfoRequest = undefined
    const id: string = "id_example"
    return expect(instance.postItemsByIdPlaybackinfo(body, id, {})).resolves.toBe(null)
  })
  test("postLivestreamsClose", () => {
    const liveStreamId: string = "liveStreamId_example"
    return expect(instance.postLivestreamsClose(liveStreamId, {})).resolves.toBe(null)
  })
  test("postLivestreamsMediainfo", () => {
    const liveStreamId: string = "liveStreamId_example"
    return expect(instance.postLivestreamsMediainfo(liveStreamId, {})).resolves.toBe(null)
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
    const categoryLimit: number = 56
    const itemLimit: number = 56
    const userId: string = "userId_example"
    const parentId: string = "parentId_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    return expect(instance.getMoviesRecommendations(categoryLimit, itemLimit, userId, parentId, enableImages, enableUserData, imageTypeLimit, enableImageTypes, {})).resolves.toBe(null)
  })
})

describe("MusicGenresServiceApi", () => {
  let instance: api.MusicGenresServiceApi
  beforeEach(function() {
    instance = new api.MusicGenresServiceApi(config)
  });

  test("getMusicgenres", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getMusicgenres(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getMusicgenresByName", () => {
    const name: string = "name_example"
    const userId: string = "userId_example"
    return expect(instance.getMusicgenresByName(name, userId, {})).resolves.toBe(null)
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
    const name: string = "name_example"
    const description: string = "description_example"
    const imageUrl: string = "imageUrl_example"
    const url: string = "url_example"
    const level: string = "level_example"
    return expect(instance.postNotificationsAdmin(name, description, imageUrl, url, level, {})).resolves.toBe(null)
  })
})

describe("OfficialRatingServiceApi", () => {
  let instance: api.OfficialRatingServiceApi
  beforeEach(function() {
    instance = new api.OfficialRatingServiceApi(config)
  });

  test("getOfficialratings", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getOfficialratings(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
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
    const id: string = "id_example"
    return expect(instance.deletePackagesInstallingById(id, {})).resolves.toBe(null)
  })
  test("getPackages", () => {
    const packageType: string = "packageType_example"
    const targetSystems: string = "targetSystems_example"
    const isPremium: boolean = true
    const isAdult: boolean = true
    return expect(instance.getPackages(packageType, targetSystems, isPremium, isAdult, {})).resolves.toBe(null)
  })
  test("getPackagesByName", () => {
    const name: string = "name_example"
    const assemblyGuid: string = "assemblyGuid_example"
    return expect(instance.getPackagesByName(name, assemblyGuid, {})).resolves.toBe(null)
  })
  test("getPackagesUpdates", () => {
    const packageType: string = "packageType_example"
    return expect(instance.getPackagesUpdates(packageType, {})).resolves.toBe(null)
  })
  test("postPackagesInstalledByName", () => {
    const name: string = "name_example"
    const assemblyGuid: string = "assemblyGuid_example"
    const version: string = "version_example"
    const updateClass: PackageVersionClass = undefined
    return expect(instance.postPackagesInstalledByName(name, assemblyGuid, version, updateClass, {})).resolves.toBe(null)
  })
  test("postPackagesInstallingByIdDelete", () => {
    const id: string = "id_example"
    return expect(instance.postPackagesInstallingByIdDelete(id, {})).resolves.toBe(null)
  })
})

describe("PersonsServiceApi", () => {
  let instance: api.PersonsServiceApi
  beforeEach(function() {
    instance = new api.PersonsServiceApi(config)
  });

  test("getPersons", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getPersons(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getPersonsByName", () => {
    const name: string = "name_example"
    const userId: string = "userId_example"
    return expect(instance.getPersonsByName(name, userId, {})).resolves.toBe(null)
  })
})

describe("PlaylistServiceApi", () => {
  let instance: api.PlaylistServiceApi
  beforeEach(function() {
    instance = new api.PlaylistServiceApi(config)
  });

  test("deletePlaylistsByIdItems", () => {
    const id: string = "id_example"
    const entryIds: string = "entryIds_example"
    return expect(instance.deletePlaylistsByIdItems(id, entryIds, {})).resolves.toBe(null)
  })
  test("getPlaylistsByIdAddtoplaylistinfo", () => {
    const ids: string = "ids_example"
    const id: string = "id_example"
    const userId: string = "userId_example"
    return expect(instance.getPlaylistsByIdAddtoplaylistinfo(ids, id, userId, {})).resolves.toBe(null)
  })
  test("getPlaylistsByIdItems", () => {
    const id: string = "id_example"
    const userId: string = "userId_example"
    const startIndex: number = 56
    const limit: number = 56
    const fields: string = "fields_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    return expect(instance.getPlaylistsByIdItems(id, userId, startIndex, limit, fields, enableImages, enableUserData, imageTypeLimit, enableImageTypes, {})).resolves.toBe(null)
  })
  test("postPlaylists", () => {
    const name: string = "name_example"
    const ids: string = "ids_example"
    const mediaType: string = "mediaType_example"
    return expect(instance.postPlaylists(name, ids, mediaType, {})).resolves.toBe(null)
  })
  test("postPlaylistsByIdItems", () => {
    const ids: string = "ids_example"
    const id: string = "id_example"
    const userId: string = "userId_example"
    return expect(instance.postPlaylistsByIdItems(ids, id, userId, {})).resolves.toBe(null)
  })
  test("postPlaylistsByIdItemsByItemidMoveByNewindex", () => {
    const itemId: number = 789
    const id: string = "id_example"
    const newIndex: number = 56
    return expect(instance.postPlaylistsByIdItemsByItemidMoveByNewindex(itemId, id, newIndex, {})).resolves.toBe(null)
  })
  test("postPlaylistsByIdItemsDelete", () => {
    const id: string = "id_example"
    const entryIds: string = "entryIds_example"
    return expect(instance.postPlaylistsByIdItemsDelete(id, entryIds, {})).resolves.toBe(null)
  })
})

describe("PlaystateServiceApi", () => {
  let instance: api.PlaystateServiceApi
  beforeEach(function() {
    instance = new api.PlaystateServiceApi(config)
  });

  test("deleteUsersByUseridPlayeditemsById", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    return expect(instance.deleteUsersByUseridPlayeditemsById(userId, id, {})).resolves.toBe(null)
  })
  test("deleteUsersByUseridPlayingitemsById", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const nextMediaType: string = "nextMediaType_example"
    const positionTicks: number = 789
    const liveStreamId: string = "liveStreamId_example"
    const playSessionId: string = "playSessionId_example"
    return expect(instance.deleteUsersByUseridPlayingitemsById(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId, {})).resolves.toBe(null)
  })
  test("postSessionsPlaying", () => {
    const body: api.PlaybackStartInfo = undefined
    return expect(instance.postSessionsPlaying(body, {})).resolves.toBe(null)
  })
  test("postSessionsPlayingPing", () => {
    const playSessionId: string = "playSessionId_example"
    return expect(instance.postSessionsPlayingPing(playSessionId, {})).resolves.toBe(null)
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
    const userId: string = "userId_example"
    const itemId: string = "itemId_example"
    return expect(instance.postUsersByUseridItemsByItemidUserdata(body, userId, itemId, {})).resolves.toBe(null)
  })
  test("postUsersByUseridPlayeditemsById", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    const datePlayed: string = "datePlayed_example"
    return expect(instance.postUsersByUseridPlayeditemsById(userId, id, datePlayed, {})).resolves.toBe(null)
  })
  test("postUsersByUseridPlayeditemsByIdDelete", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    return expect(instance.postUsersByUseridPlayeditemsByIdDelete(userId, id, {})).resolves.toBe(null)
  })
  test("postUsersByUseridPlayingitemsById", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const canSeek: boolean = true
    const audioStreamIndex: number = 56
    const subtitleStreamIndex: number = 56
    const playMethod: PlayMethod = undefined
    const liveStreamId: string = "liveStreamId_example"
    const playSessionId: string = "playSessionId_example"
    return expect(instance.postUsersByUseridPlayingitemsById(userId, id, mediaSourceId, canSeek, audioStreamIndex, subtitleStreamIndex, playMethod, liveStreamId, playSessionId, {})).resolves.toBe(null)
  })
  test("postUsersByUseridPlayingitemsByIdDelete", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const nextMediaType: string = "nextMediaType_example"
    const positionTicks: number = 789
    const liveStreamId: string = "liveStreamId_example"
    const playSessionId: string = "playSessionId_example"
    return expect(instance.postUsersByUseridPlayingitemsByIdDelete(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId, {})).resolves.toBe(null)
  })
  test("postUsersByUseridPlayingitemsByIdProgress", () => {
    const body: api.ApiOnPlaybackProgress = undefined
    const mediaSourceId: string = "mediaSourceId_example"
    const userId: string = "userId_example"
    const id: string = "id_example"
    const positionTicks: number = 789
    const isPaused: boolean = true
    const isMuted: boolean = true
    const audioStreamIndex: number = 56
    const subtitleStreamIndex: number = 56
    const volumeLevel: number = 56
    const playMethod: PlayMethod = undefined
    const liveStreamId: string = "liveStreamId_example"
    const playSessionId: string = "playSessionId_example"
    const repeatMode: RepeatMode = undefined
    const subtitleOffset: number = 56
    const playbackRate: number = 1.2
    return expect(instance.postUsersByUseridPlayingitemsByIdProgress(body, mediaSourceId, userId, id, positionTicks, isPaused, isMuted, audioStreamIndex, subtitleStreamIndex, volumeLevel, playMethod, liveStreamId, playSessionId, repeatMode, subtitleOffset, playbackRate, {})).resolves.toBe(null)
  })
})

describe("PluginServiceApi", () => {
  let instance: api.PluginServiceApi
  beforeEach(function() {
    instance = new api.PluginServiceApi(config)
  });

  test("deletePluginsById", () => {
    const id: string = "id_example"
    return expect(instance.deletePluginsById(id, {})).resolves.toBe(null)
  })
  test("getPlugins", () => {
    return expect(instance.getPlugins({})).resolves.toBe(null)
  })
  test("getPluginsByIdConfiguration", () => {
    const id: string = "id_example"
    return expect(instance.getPluginsByIdConfiguration(id, {})).resolves.toBe(null)
  })
  test("getPluginsByIdThumb", () => {
    const id: string = "id_example"
    return expect(instance.getPluginsByIdThumb(id, {})).resolves.toBe(null)
  })
  test("postPluginsByIdConfiguration", () => {
    const body: Object = undefined
    const id: string = "id_example"
    return expect(instance.postPluginsByIdConfiguration(body, id, {})).resolves.toBe(null)
  })
  test("postPluginsByIdDelete", () => {
    const id: string = "id_example"
    return expect(instance.postPluginsByIdDelete(id, {})).resolves.toBe(null)
  })
})

describe("RemoteImageServiceApi", () => {
  let instance: api.RemoteImageServiceApi
  beforeEach(function() {
    instance = new api.RemoteImageServiceApi(config)
  });

  test("getImagesRemote", () => {
    const imageUrl: string = "imageUrl_example"
    return expect(instance.getImagesRemote(imageUrl, {})).resolves.toBe(null)
  })
  test("getItemsByIdRemoteimages", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const startIndex: number = 56
    const limit: number = 56
    const providerName: string = "providerName_example"
    const includeAllLanguages: boolean = true
    return expect(instance.getItemsByIdRemoteimages(id, type, startIndex, limit, providerName, includeAllLanguages, {})).resolves.toBe(null)
  })
  test("getItemsByIdRemoteimagesProviders", () => {
    const id: string = "id_example"
    return expect(instance.getItemsByIdRemoteimagesProviders(id, {})).resolves.toBe(null)
  })
  test("postItemsByIdRemoteimagesDownload", () => {
    const id: string = "id_example"
    const type: ImageType = undefined
    const providerName: string = "providerName_example"
    const imageUrl: string = "imageUrl_example"
    return expect(instance.postItemsByIdRemoteimagesDownload(id, type, providerName, imageUrl, {})).resolves.toBe(null)
  })
})

describe("ScheduledTaskServiceApi", () => {
  let instance: api.ScheduledTaskServiceApi
  beforeEach(function() {
    instance = new api.ScheduledTaskServiceApi(config)
  });

  test("deleteScheduledtasksRunningById", () => {
    const id: string = "id_example"
    return expect(instance.deleteScheduledtasksRunningById(id, {})).resolves.toBe(null)
  })
  test("getScheduledtasks", () => {
    const isHidden: boolean = true
    const isEnabled: boolean = true
    return expect(instance.getScheduledtasks(isHidden, isEnabled, {})).resolves.toBe(null)
  })
  test("getScheduledtasksById", () => {
    const id: string = "id_example"
    return expect(instance.getScheduledtasksById(id, {})).resolves.toBe(null)
  })
  test("postScheduledtasksByIdTriggers", () => {
    const body: Array<api.TaskTriggerInfo> = undefined
    const id: string = "id_example"
    return expect(instance.postScheduledtasksByIdTriggers(body, id, {})).resolves.toBe(null)
  })
  test("postScheduledtasksRunningById", () => {
    const id: string = "id_example"
    return expect(instance.postScheduledtasksRunningById(id, {})).resolves.toBe(null)
  })
  test("postScheduledtasksRunningByIdDelete", () => {
    const id: string = "id_example"
    return expect(instance.postScheduledtasksRunningByIdDelete(id, {})).resolves.toBe(null)
  })
})

describe("SessionsServiceApi", () => {
  let instance: api.SessionsServiceApi
  beforeEach(function() {
    instance = new api.SessionsServiceApi(config)
  });

  test("deleteAuthKeysByKey", () => {
    const key: string = "key_example"
    return expect(instance.deleteAuthKeysByKey(key, {})).resolves.toBe(null)
  })
  test("deleteSessionsByIdUsersByUserid", () => {
    const id: string = "id_example"
    const userId: string = "userId_example"
    return expect(instance.deleteSessionsByIdUsersByUserid(id, userId, {})).resolves.toBe(null)
  })
  test("getAuthKeys", () => {
    const startIndex: number = 56
    const limit: number = 56
    return expect(instance.getAuthKeys(startIndex, limit, {})).resolves.toBe(null)
  })
  test("getAuthProviders", () => {
    return expect(instance.getAuthProviders({})).resolves.toBe(null)
  })
  test("getSessions", () => {
    const controllableByUserId: string = "controllableByUserId_example"
    const deviceId: string = "deviceId_example"
    const id: string = "id_example"
    return expect(instance.getSessions(controllableByUserId, deviceId, id, {})).resolves.toBe(null)
  })
  test("getSessionsPlayqueue", () => {
    const id: string = "id_example"
    const deviceId: string = "deviceId_example"
    return expect(instance.getSessionsPlayqueue(id, deviceId, {})).resolves.toBe(null)
  })
  test("postAuthKeys", () => {
    const app: string = "app_example"
    return expect(instance.postAuthKeys(app, {})).resolves.toBe(null)
  })
  test("postAuthKeysByKeyDelete", () => {
    const key: string = "key_example"
    return expect(instance.postAuthKeysByKeyDelete(key, {})).resolves.toBe(null)
  })
  test("postSessionsByIdCommand", () => {
    const body: api.GeneralCommand = undefined
    const id: string = "id_example"
    return expect(instance.postSessionsByIdCommand(body, id, {})).resolves.toBe(null)
  })
  test("postSessionsByIdCommandByCommand", () => {
    const id: string = "id_example"
    const command: string = "command_example"
    return expect(instance.postSessionsByIdCommandByCommand(id, command, {})).resolves.toBe(null)
  })
  test("postSessionsByIdMessage", () => {
    const id: string = "id_example"
    const text: string = "text_example"
    const header: string = "header_example"
    const timeoutMs: number = 789
    return expect(instance.postSessionsByIdMessage(id, text, header, timeoutMs, {})).resolves.toBe(null)
  })
  test("postSessionsByIdPlaying", () => {
    const body: api.PlayRequest = undefined
    const itemIds: Array<number> = undefined
    const playCommand: PlayCommand = undefined
    const id: string = "id_example"
    const startPositionTicks: number = 789
    return expect(instance.postSessionsByIdPlaying(body, itemIds, playCommand, id, startPositionTicks, {})).resolves.toBe(null)
  })
  test("postSessionsByIdPlayingByCommand", () => {
    const body: api.PlaystateRequest = undefined
    const id: string = "id_example"
    const command: PlaystateCommand = undefined
    return expect(instance.postSessionsByIdPlayingByCommand(body, id, command, {})).resolves.toBe(null)
  })
  test("postSessionsByIdSystemByCommand", () => {
    const id: string = "id_example"
    const command: string = "command_example"
    return expect(instance.postSessionsByIdSystemByCommand(id, command, {})).resolves.toBe(null)
  })
  test("postSessionsByIdUsersByUserid", () => {
    const id: string = "id_example"
    const userId: string = "userId_example"
    return expect(instance.postSessionsByIdUsersByUserid(id, userId, {})).resolves.toBe(null)
  })
  test("postSessionsByIdUsersByUseridDelete", () => {
    const id: string = "id_example"
    const userId: string = "userId_example"
    return expect(instance.postSessionsByIdUsersByUseridDelete(id, userId, {})).resolves.toBe(null)
  })
  test("postSessionsByIdViewing", () => {
    const id: string = "id_example"
    const itemType: string = "itemType_example"
    const itemId: string = "itemId_example"
    const itemName: string = "itemName_example"
    return expect(instance.postSessionsByIdViewing(id, itemType, itemId, itemName, {})).resolves.toBe(null)
  })
  test("postSessionsCapabilities", () => {
    const id: string = "id_example"
    const playableMediaTypes: string = "playableMediaTypes_example"
    const supportedCommands: string = "supportedCommands_example"
    const supportsMediaControl: boolean = true
    const supportsSync: boolean = true
    return expect(instance.postSessionsCapabilities(id, playableMediaTypes, supportedCommands, supportsMediaControl, supportsSync, {})).resolves.toBe(null)
  })
  test("postSessionsCapabilitiesFull", () => {
    const body: api.ClientCapabilities = undefined
    const id: string = "id_example"
    return expect(instance.postSessionsCapabilitiesFull(body, id, {})).resolves.toBe(null)
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
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getStudios(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getStudiosByName", () => {
    const name: string = "name_example"
    const userId: string = "userId_example"
    return expect(instance.getStudiosByName(name, userId, {})).resolves.toBe(null)
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
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const index: number = 56
    return expect(instance.deleteItemsByIdSubtitlesByIndex(id, mediaSourceId, index, {})).resolves.toBe(null)
  })
  test("deleteVideosByIdSubtitlesByIndex", () => {
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const index: number = 56
    return expect(instance.deleteVideosByIdSubtitlesByIndex(id, mediaSourceId, index, {})).resolves.toBe(null)
  })
  test("getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", () => {
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const index: number = 56
    const format: string = "format_example"
    const startPositionTicks: number = 789
    const endPositionTicks: number = 789
    const copyTimestamps: boolean = true
    return expect(instance.getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, {})).resolves.toBe(null)
  })
  test("getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat", () => {
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const index: number = 56
    const format: string = "format_example"
    const startPositionTicks: number = 789
    const endPositionTicks: number = 789
    const copyTimestamps: boolean = true
    return expect(instance.getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, {})).resolves.toBe(null)
  })
  test("getItemsByIdRemotesearchSubtitlesByLanguage", () => {
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const language: string = "language_example"
    const isPerfectMatch: boolean = true
    const isForced: boolean = true
    const isHearingImpaired: boolean = true
    return expect(instance.getItemsByIdRemotesearchSubtitlesByLanguage(id, mediaSourceId, language, isPerfectMatch, isForced, isHearingImpaired, {})).resolves.toBe(null)
  })
  test("getProvidersSubtitlesSubtitlesById", () => {
    const id: string = "id_example"
    return expect(instance.getProvidersSubtitlesSubtitlesById(id, {})).resolves.toBe(null)
  })
  test("getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", () => {
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const index: number = 56
    const format: string = "format_example"
    const startPositionTicks: number = 789
    const endPositionTicks: number = 789
    const copyTimestamps: boolean = true
    return expect(instance.getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, {})).resolves.toBe(null)
  })
  test("getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat", () => {
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const index: number = 56
    const format: string = "format_example"
    const startPositionTicks: number = 789
    const endPositionTicks: number = 789
    const copyTimestamps: boolean = true
    return expect(instance.getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, {})).resolves.toBe(null)
  })
  test("headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", () => {
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const index: number = 56
    const format: string = "format_example"
    const startPositionTicks: number = 789
    const endPositionTicks: number = 789
    const copyTimestamps: boolean = true
    return expect(instance.headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, {})).resolves.toBe(null)
  })
  test("headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat", () => {
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const index: number = 56
    const format: string = "format_example"
    const startPositionTicks: number = 789
    const endPositionTicks: number = 789
    const copyTimestamps: boolean = true
    return expect(instance.headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, {})).resolves.toBe(null)
  })
  test("headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat", () => {
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const index: number = 56
    const format: string = "format_example"
    const startPositionTicks: number = 789
    const endPositionTicks: number = 789
    const copyTimestamps: boolean = true
    return expect(instance.headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, {})).resolves.toBe(null)
  })
  test("headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat", () => {
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const index: number = 56
    const format: string = "format_example"
    const startPositionTicks: number = 789
    const endPositionTicks: number = 789
    const copyTimestamps: boolean = true
    return expect(instance.headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps, {})).resolves.toBe(null)
  })
  test("postItemsByIdRemotesearchSubtitlesBySubtitleid", () => {
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const subtitleId: string = "subtitleId_example"
    return expect(instance.postItemsByIdRemotesearchSubtitlesBySubtitleid(id, mediaSourceId, subtitleId, {})).resolves.toBe(null)
  })
  test("postItemsByIdSubtitlesByIndexDelete", () => {
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const index: number = 56
    return expect(instance.postItemsByIdSubtitlesByIndexDelete(id, mediaSourceId, index, {})).resolves.toBe(null)
  })
  test("postVideosByIdSubtitlesByIndexDelete", () => {
    const id: string = "id_example"
    const mediaSourceId: string = "mediaSourceId_example"
    const index: number = 56
    return expect(instance.postVideosByIdSubtitlesByIndexDelete(id, mediaSourceId, index, {})).resolves.toBe(null)
  })
})

describe("SuggestionsServiceApi", () => {
  let instance: api.SuggestionsServiceApi
  beforeEach(function() {
    instance = new api.SuggestionsServiceApi(config)
  });

  test("getUsersByUseridSuggestions", () => {
    const userId: string = "userId_example"
    const fields: string = "fields_example"
    const enableImages: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const enableUserData: boolean = true
    return expect(instance.getUsersByUseridSuggestions(userId, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, {})).resolves.toBe(null)
  })
})

describe("SyncServiceApi", () => {
  let instance: api.SyncServiceApi
  beforeEach(function() {
    instance = new api.SyncServiceApi(config)
  });

  test("deleteSyncByTargetidItems", () => {
    const targetId: string = "targetId_example"
    const itemIds: string = "itemIds_example"
    return expect(instance.deleteSyncByTargetidItems(targetId, itemIds, {})).resolves.toBe(null)
  })
  test("deleteSyncJobitemsById", () => {
    const id: string = "id_example"
    return expect(instance.deleteSyncJobitemsById(id, {})).resolves.toBe(null)
  })
  test("deleteSyncJobsById", () => {
    const id: string = "id_example"
    return expect(instance.deleteSyncJobsById(id, {})).resolves.toBe(null)
  })
  test("getSyncItemsReady", () => {
    const targetId: string = "targetId_example"
    return expect(instance.getSyncItemsReady(targetId, {})).resolves.toBe(null)
  })
  test("getSyncJobitems", () => {
    const targetId: string = "targetId_example"
    return expect(instance.getSyncJobitems(targetId, {})).resolves.toBe(null)
  })
  test("getSyncJobitemsByIdAdditionalfiles", () => {
    const id: string = "id_example"
    const name: string = "name_example"
    return expect(instance.getSyncJobitemsByIdAdditionalfiles(id, name, {})).resolves.toBe(null)
  })
  test("getSyncJobitemsByIdFile", () => {
    const id: string = "id_example"
    return expect(instance.getSyncJobitemsByIdFile(id, {})).resolves.toBe(null)
  })
  test("getSyncJobs", () => {
    return expect(instance.getSyncJobs({})).resolves.toBe(null)
  })
  test("getSyncJobsById", () => {
    const id: string = "id_example"
    return expect(instance.getSyncJobsById(id, {})).resolves.toBe(null)
  })
  test("getSyncOptions", () => {
    const userId: string = "userId_example"
    const itemIds: string = "itemIds_example"
    const parentId: string = "parentId_example"
    const targetId: string = "targetId_example"
    const category: SyncCategory = undefined
    return expect(instance.getSyncOptions(userId, itemIds, parentId, targetId, category, {})).resolves.toBe(null)
  })
  test("getSyncTargets", () => {
    const userId: string = "userId_example"
    return expect(instance.getSyncTargets(userId, {})).resolves.toBe(null)
  })
  test("headSyncJobitemsByIdFile", () => {
    const id: string = "id_example"
    return expect(instance.headSyncJobitemsByIdFile(id, {})).resolves.toBe(null)
  })
  test("postSyncByItemidStatus", () => {
    const body: api.SyncedItemProgress = undefined
    const itemId: string = "itemId_example"
    return expect(instance.postSyncByItemidStatus(body, itemId, {})).resolves.toBe(null)
  })
  test("postSyncByTargetidItemsDelete", () => {
    const targetId: string = "targetId_example"
    const itemIds: string = "itemIds_example"
    return expect(instance.postSyncByTargetidItemsDelete(targetId, itemIds, {})).resolves.toBe(null)
  })
  test("postSyncData", () => {
    const body: api.SyncDataRequest = undefined
    const targetId: string = "targetId_example"
    return expect(instance.postSyncData(body, targetId, {})).resolves.toBe(null)
  })
  test("postSyncItemsCancel", () => {
    const itemIds: string = "itemIds_example"
    return expect(instance.postSyncItemsCancel(itemIds, {})).resolves.toBe(null)
  })
  test("postSyncJobitemsByIdDelete", () => {
    const id: string = "id_example"
    return expect(instance.postSyncJobitemsByIdDelete(id, {})).resolves.toBe(null)
  })
  test("postSyncJobitemsByIdEnable", () => {
    const id: string = "id_example"
    return expect(instance.postSyncJobitemsByIdEnable(id, {})).resolves.toBe(null)
  })
  test("postSyncJobitemsByIdMarkforremoval", () => {
    const id: string = "id_example"
    return expect(instance.postSyncJobitemsByIdMarkforremoval(id, {})).resolves.toBe(null)
  })
  test("postSyncJobitemsByIdTransferred", () => {
    const id: string = "id_example"
    return expect(instance.postSyncJobitemsByIdTransferred(id, {})).resolves.toBe(null)
  })
  test("postSyncJobitemsByIdUnmarkforremoval", () => {
    const id: string = "id_example"
    return expect(instance.postSyncJobitemsByIdUnmarkforremoval(id, {})).resolves.toBe(null)
  })
  test("postSyncJobs", () => {
    const body: api.SyncJobRequest = undefined
    return expect(instance.postSyncJobs(body, {})).resolves.toBe(null)
  })
  test("postSyncJobsById", () => {
    const body: api.SyncJob = undefined
    const id: number = 789
    return expect(instance.postSyncJobsById(body, id, {})).resolves.toBe(null)
  })
  test("postSyncJobsByIdDelete", () => {
    const id: string = "id_example"
    return expect(instance.postSyncJobsByIdDelete(id, {})).resolves.toBe(null)
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
    const name: string = "name_example"
    const sanitize: boolean = true
    return expect(instance.getSystemLogsByName(name, sanitize, {})).resolves.toBe(null)
  })
  test("getSystemLogsByNameLines", () => {
    const name: string = "name_example"
    return expect(instance.getSystemLogsByNameLines(name, {})).resolves.toBe(null)
  })
  test("getSystemLogsQuery", () => {
    const startIndex: number = 56
    const limit: number = 56
    return expect(instance.getSystemLogsQuery(startIndex, limit, {})).resolves.toBe(null)
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
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getArtistsPrefixes(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getAudiocodecs", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getAudiocodecs(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getAudiolayouts", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getAudiolayouts(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getContainers", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getContainers(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getExtendedvideotypes", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getExtendedvideotypes(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getItemsPrefixes", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getItemsPrefixes(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getItemtypes", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getItemtypes(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getStreamlanguages", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getStreamlanguages(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getSubtitlecodecs", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getSubtitlecodecs(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getTags", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getTags(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getVideocodecs", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getVideocodecs(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getYears", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getYears(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("postItemsByIdTagsAdd", () => {
    const body: api.UserLibraryAddTags = undefined
    const id: string = "id_example"
    return expect(instance.postItemsByIdTagsAdd(body, id, {})).resolves.toBe(null)
  })
  test("postItemsByIdTagsDelete", () => {
    const body: api.UserLibraryRemoveTags = undefined
    const id: string = "id_example"
    return expect(instance.postItemsByIdTagsDelete(body, id, {})).resolves.toBe(null)
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
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getTrailers(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
})

describe("TvShowsServiceApi", () => {
  let instance: api.TvShowsServiceApi
  beforeEach(function() {
    instance = new api.TvShowsServiceApi(config)
  });

  test("getShowsByIdEpisodes", () => {
    const id: string = "id_example"
    const season: number = 56
    const seasonId: string = "seasonId_example"
    const startItemId: string = "startItemId_example"
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getShowsByIdEpisodes(id, season, seasonId, startItemId, artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getShowsByIdSeasons", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    const fields: string = "fields_example"
    const isSpecialSeason: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const enableImages: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const enableUserData: boolean = true
    return expect(instance.getShowsByIdSeasons(userId, id, fields, isSpecialSeason, adjacentTo, enableImages, imageTypeLimit, enableImageTypes, enableUserData, {})).resolves.toBe(null)
  })
  test("getShowsMissing", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getShowsMissing(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
  test("getShowsNextup", () => {
    const userId: string = "userId_example"
    const startIndex: number = 56
    const limit: number = 56
    const fields: string = "fields_example"
    const seriesId: string = "seriesId_example"
    const parentId: string = "parentId_example"
    const enableImages: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const enableUserData: boolean = true
    return expect(instance.getShowsNextup(userId, startIndex, limit, fields, seriesId, parentId, enableImages, imageTypeLimit, enableImageTypes, enableUserData, {})).resolves.toBe(null)
  })
  test("getShowsUpcoming", () => {
    const artistType: string = "artistType_example"
    const maxOfficialRating: string = "maxOfficialRating_example"
    const hasThemeSong: boolean = true
    const hasThemeVideo: boolean = true
    const hasSubtitles: boolean = true
    const hasSpecialFeature: boolean = true
    const hasTrailer: boolean = true
    const adjacentTo: string = "adjacentTo_example"
    const minIndexNumber: number = 56
    const minStartDate: string = "minStartDate_example"
    const maxStartDate: string = "maxStartDate_example"
    const minEndDate: string = "minEndDate_example"
    const maxEndDate: string = "maxEndDate_example"
    const minPlayers: number = 56
    const maxPlayers: number = 56
    const parentIndexNumber: number = 56
    const hasParentalRating: boolean = true
    const isHD: boolean = true
    const isUnaired: boolean = true
    const minCommunityRating: number = 1.2
    const minCriticRating: number = 1.2
    const airedDuringSeason: number = 56
    const minPremiereDate: string = "minPremiereDate_example"
    const minDateLastSaved: string = "minDateLastSaved_example"
    const minDateLastSavedForUser: string = "minDateLastSavedForUser_example"
    const maxPremiereDate: string = "maxPremiereDate_example"
    const hasOverview: boolean = true
    const hasImdbId: boolean = true
    const hasTmdbId: boolean = true
    const hasTvdbId: boolean = true
    const excludeItemIds: string = "excludeItemIds_example"
    const startIndex: number = 56
    const limit: number = 56
    const recursive: boolean = true
    const searchTerm: string = "searchTerm_example"
    const sortOrder: string = "sortOrder_example"
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const excludeItemTypes: string = "excludeItemTypes_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const anyProviderIdEquals: string = "anyProviderIdEquals_example"
    const filters: string = "filters_example"
    const isFavorite: boolean = true
    const isMovie: boolean = true
    const isSeries: boolean = true
    const isFolder: boolean = true
    const isNews: boolean = true
    const isKids: boolean = true
    const isSports: boolean = true
    const isNew: boolean = true
    const isPremiere: boolean = true
    const isNewOrPremiere: boolean = true
    const isRepeat: boolean = true
    const projectToMedia: boolean = true
    const mediaTypes: string = "mediaTypes_example"
    const imageTypes: string = "imageTypes_example"
    const sortBy: string = "sortBy_example"
    const isPlayed: boolean = true
    const genres: string = "genres_example"
    const officialRatings: string = "officialRatings_example"
    const tags: string = "tags_example"
    const excludeTags: string = "excludeTags_example"
    const years: string = "years_example"
    const enableImages: boolean = true
    const enableUserData: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const person: string = "person_example"
    const personIds: string = "personIds_example"
    const personTypes: string = "personTypes_example"
    const studios: string = "studios_example"
    const studioIds: string = "studioIds_example"
    const artists: string = "artists_example"
    const artistIds: string = "artistIds_example"
    const albums: string = "albums_example"
    const ids: string = "ids_example"
    const videoTypes: string = "videoTypes_example"
    const containers: string = "containers_example"
    const audioCodecs: string = "audioCodecs_example"
    const audioLayouts: string = "audioLayouts_example"
    const videoCodecs: string = "videoCodecs_example"
    const extendedVideoTypes: string = "extendedVideoTypes_example"
    const subtitleCodecs: string = "subtitleCodecs_example"
    const path: string = "path_example"
    const userId: string = "userId_example"
    const minOfficialRating: string = "minOfficialRating_example"
    const isLocked: boolean = true
    const isPlaceHolder: boolean = true
    const hasOfficialRating: boolean = true
    const groupItemsIntoCollections: boolean = true
    const is3D: boolean = true
    const seriesStatus: string = "seriesStatus_example"
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const artistStartsWithOrGreater: string = "artistStartsWithOrGreater_example"
    const albumArtistStartsWithOrGreater: string = "albumArtistStartsWithOrGreater_example"
    const nameStartsWith: string = "nameStartsWith_example"
    const nameLessThan: string = "nameLessThan_example"
    return expect(instance.getShowsUpcoming(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minStartDate, maxStartDate, minEndDate, maxEndDate, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isFolder, isNews, isKids, isSports, isNew, isPremiere, isNewOrPremiere, isRepeat, projectToMedia, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, excludeTags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, audioLayouts, videoCodecs, extendedVideoTypes, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan, {})).resolves.toBe(null)
  })
})

describe("UniversalAudioServiceApi", () => {
  let instance: api.UniversalAudioServiceApi
  beforeEach(function() {
    instance = new api.UniversalAudioServiceApi(config)
  });

  test("getAudioByIdUniversal", () => {
    const id: string = "id_example"
    const deviceId: string = "deviceId_example"
    const startTimeTicks: number = 789
    return expect(instance.getAudioByIdUniversal(id, deviceId, startTimeTicks, {})).resolves.toBe(null)
  })
  test("getAudioByIdUniversalByContainer", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceId: string = "deviceId_example"
    const startTimeTicks: number = 789
    return expect(instance.getAudioByIdUniversalByContainer(id, container, deviceId, startTimeTicks, {})).resolves.toBe(null)
  })
  test("headAudioByIdUniversal", () => {
    const id: string = "id_example"
    const deviceId: string = "deviceId_example"
    const startTimeTicks: number = 789
    return expect(instance.headAudioByIdUniversal(id, deviceId, startTimeTicks, {})).resolves.toBe(null)
  })
  test("headAudioByIdUniversalByContainer", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceId: string = "deviceId_example"
    const startTimeTicks: number = 789
    return expect(instance.headAudioByIdUniversalByContainer(id, container, deviceId, startTimeTicks, {})).resolves.toBe(null)
  })
})

describe("UserLibraryServiceApi", () => {
  let instance: api.UserLibraryServiceApi
  beforeEach(function() {
    instance = new api.UserLibraryServiceApi(config)
  });

  test("deleteUsersByUseridFavoriteitemsById", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    return expect(instance.deleteUsersByUseridFavoriteitemsById(userId, id, {})).resolves.toBe(null)
  })
  test("deleteUsersByUseridItemsByIdRating", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    return expect(instance.deleteUsersByUseridItemsByIdRating(userId, id, {})).resolves.toBe(null)
  })
  test("getLivetvProgramsById", () => {
    const id: string = "id_example"
    return expect(instance.getLivetvProgramsById(id, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItemsById", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    return expect(instance.getUsersByUseridItemsById(userId, id, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItemsByIdIntros", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    const fields: string = "fields_example"
    const enableImages: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const enableUserData: boolean = true
    return expect(instance.getUsersByUseridItemsByIdIntros(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItemsByIdLocaltrailers", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    const fields: string = "fields_example"
    const enableImages: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const enableUserData: boolean = true
    return expect(instance.getUsersByUseridItemsByIdLocaltrailers(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItemsByIdSpecialfeatures", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    const fields: string = "fields_example"
    const enableImages: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const enableUserData: boolean = true
    return expect(instance.getUsersByUseridItemsByIdSpecialfeatures(userId, id, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItemsLatest", () => {
    const userId: string = "userId_example"
    const limit: number = 56
    const parentId: string = "parentId_example"
    const fields: string = "fields_example"
    const includeItemTypes: string = "includeItemTypes_example"
    const mediaTypes: string = "mediaTypes_example"
    const isFolder: boolean = true
    const isPlayed: boolean = true
    const groupItems: boolean = true
    const enableImages: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const enableUserData: boolean = true
    return expect(instance.getUsersByUseridItemsLatest(userId, limit, parentId, fields, includeItemTypes, mediaTypes, isFolder, isPlayed, groupItems, enableImages, imageTypeLimit, enableImageTypes, enableUserData, {})).resolves.toBe(null)
  })
  test("getUsersByUseridItemsRoot", () => {
    const userId: string = "userId_example"
    return expect(instance.getUsersByUseridItemsRoot(userId, {})).resolves.toBe(null)
  })
  test("getVideosByIdAdditionalparts", () => {
    const id: string = "id_example"
    const userId: string = "userId_example"
    const fields: string = "fields_example"
    const enableImages: boolean = true
    const imageTypeLimit: number = 56
    const enableImageTypes: string = "enableImageTypes_example"
    const enableUserData: boolean = true
    return expect(instance.getVideosByIdAdditionalparts(id, userId, fields, enableImages, imageTypeLimit, enableImageTypes, enableUserData, {})).resolves.toBe(null)
  })
  test("postItemsAccess", () => {
    const body: api.UserLibraryUpdateUserItemAccess = undefined
    return expect(instance.postItemsAccess(body, {})).resolves.toBe(null)
  })
  test("postItemsByIdMakeprivate", () => {
    const id: string = "id_example"
    return expect(instance.postItemsByIdMakeprivate(id, {})).resolves.toBe(null)
  })
  test("postItemsByIdMakepublic", () => {
    const id: string = "id_example"
    return expect(instance.postItemsByIdMakepublic(id, {})).resolves.toBe(null)
  })
  test("postItemsSharedLeave", () => {
    const body: api.UserLibraryLeaveSharedItems = undefined
    return expect(instance.postItemsSharedLeave(body, {})).resolves.toBe(null)
  })
  test("postUsersByUseridFavoriteitemsById", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    return expect(instance.postUsersByUseridFavoriteitemsById(userId, id, {})).resolves.toBe(null)
  })
  test("postUsersByUseridFavoriteitemsByIdDelete", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    return expect(instance.postUsersByUseridFavoriteitemsByIdDelete(userId, id, {})).resolves.toBe(null)
  })
  test("postUsersByUseridItemsByIdHidefromresume", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    const hide: boolean = true
    return expect(instance.postUsersByUseridItemsByIdHidefromresume(userId, id, hide, {})).resolves.toBe(null)
  })
  test("postUsersByUseridItemsByIdRating", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    const likes: boolean = true
    return expect(instance.postUsersByUseridItemsByIdRating(userId, id, likes, {})).resolves.toBe(null)
  })
  test("postUsersByUseridItemsByIdRatingDelete", () => {
    const userId: string = "userId_example"
    const id: string = "id_example"
    return expect(instance.postUsersByUseridItemsByIdRatingDelete(userId, id, {})).resolves.toBe(null)
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
    const id: string = "id_example"
    return expect(instance.deleteUsersById(id, {})).resolves.toBe(null)
  })
  test("deleteUsersByIdTrackselectionsByTracktype", () => {
    const id: string = "id_example"
    const trackType: string = "trackType_example"
    return expect(instance.deleteUsersByIdTrackselectionsByTracktype(id, trackType, {})).resolves.toBe(null)
  })
  test("getUsersById", () => {
    const id: string = "id_example"
    return expect(instance.getUsersById(id, {})).resolves.toBe(null)
  })
  test("getUsersByUseridTypedsettingsByKey", () => {
    const key: string = "key_example"
    const userId: string = "userId_example"
    return expect(instance.getUsersByUseridTypedsettingsByKey(key, userId, {})).resolves.toBe(null)
  })
  test("getUsersItemaccess", () => {
    const isHidden: boolean = true
    const isDisabled: boolean = true
    const startIndex: number = 56
    const limit: number = 56
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const sortOrder: string = "sortOrder_example"
    return expect(instance.getUsersItemaccess(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder, {})).resolves.toBe(null)
  })
  test("getUsersPrefixes", () => {
    const isHidden: boolean = true
    const isDisabled: boolean = true
    const startIndex: number = 56
    const limit: number = 56
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const sortOrder: string = "sortOrder_example"
    return expect(instance.getUsersPrefixes(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder, {})).resolves.toBe(null)
  })
  test("getUsersPublic", () => {
    return expect(instance.getUsersPublic({})).resolves.toBe(null)
  })
  test("getUsersQuery", () => {
    const isHidden: boolean = true
    const isDisabled: boolean = true
    const startIndex: number = 56
    const limit: number = 56
    const nameStartsWithOrGreater: string = "nameStartsWithOrGreater_example"
    const sortOrder: string = "sortOrder_example"
    return expect(instance.getUsersQuery(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder, {})).resolves.toBe(null)
  })
  test("postUsersAuthenticatebyname", () => {
    const body: api.AuthenticateUserByName = undefined
    const xEmbyAuthorization: string = "xEmbyAuthorization_example"
    return expect(instance.postUsersAuthenticatebyname(body, xEmbyAuthorization, {})).resolves.toBe(null)
  })
  test("postUsersById", () => {
    const body: api.UserDto = undefined
    const id: string = "id_example"
    return expect(instance.postUsersById(body, id, {})).resolves.toBe(null)
  })
  test("postUsersByIdAuthenticate", () => {
    const body: api.AuthenticateUser = undefined
    const id: string = "id_example"
    return expect(instance.postUsersByIdAuthenticate(body, id, {})).resolves.toBe(null)
  })
  test("postUsersByIdConfiguration", () => {
    const body: api.UserConfiguration = undefined
    const id: string = "id_example"
    return expect(instance.postUsersByIdConfiguration(body, id, {})).resolves.toBe(null)
  })
  test("postUsersByIdConfigurationPartial", () => {
    const body: Object = undefined
    const id: string = "id_example"
    return expect(instance.postUsersByIdConfigurationPartial(body, id, {})).resolves.toBe(null)
  })
  test("postUsersByIdDelete", () => {
    const id: string = "id_example"
    return expect(instance.postUsersByIdDelete(id, {})).resolves.toBe(null)
  })
  test("postUsersByIdPassword", () => {
    const body: api.UpdateUserPassword = undefined
    const id: string = "id_example"
    return expect(instance.postUsersByIdPassword(body, id, {})).resolves.toBe(null)
  })
  test("postUsersByIdPolicy", () => {
    const body: api.UserPolicy = undefined
    const id: string = "id_example"
    return expect(instance.postUsersByIdPolicy(body, id, {})).resolves.toBe(null)
  })
  test("postUsersByIdTrackselectionsByTracktypeDelete", () => {
    const id: string = "id_example"
    const trackType: string = "trackType_example"
    return expect(instance.postUsersByIdTrackselectionsByTracktypeDelete(id, trackType, {})).resolves.toBe(null)
  })
  test("postUsersByUseridTypedsettingsByKey", () => {
    const body: Object = undefined
    const userId: string = "userId_example"
    const key: string = "key_example"
    return expect(instance.postUsersByUseridTypedsettingsByKey(body, userId, key, {})).resolves.toBe(null)
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
    const userId: string = "userId_example"
    const includeExternalContent: boolean = true
    return expect(instance.getUsersByUseridViews(userId, includeExternalContent, {})).resolves.toBe(null)
  })
})

describe("VideoHlsServiceApi", () => {
  let instance: api.VideoHlsServiceApi
  beforeEach(function() {
    instance = new api.VideoHlsServiceApi(config)
  });

  test("getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer", () => {
    const segmentContainer: string = "segmentContainer_example"
    const segmentId: string = "segmentId_example"
    const id: string = "id_example"
    const playlistId: string = "playlistId_example"
    return expect(instance.getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer(segmentContainer, segmentId, id, playlistId, {})).resolves.toBe(null)
  })
  test("getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer", () => {
    const segmentContainer: string = "segmentContainer_example"
    const segmentId: string = "segmentId_example"
    const id: string = "id_example"
    const playlistId: string = "playlistId_example"
    return expect(instance.getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer(segmentContainer, segmentId, id, playlistId, {})).resolves.toBe(null)
  })
})

describe("VideoServiceApi", () => {
  let instance: api.VideoServiceApi
  beforeEach(function() {
    instance = new api.VideoServiceApi(config)
  });

  test("getVideosByIdByStreamfilename", () => {
    const streamFileName: string = "streamFileName_example"
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.getVideosByIdByStreamfilename(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("getVideosByIdStream", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.getVideosByIdStream(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("getVideosByIdStreamByContainer", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.getVideosByIdStreamByContainer(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("headVideosByIdByStreamfilename", () => {
    const streamFileName: string = "streamFileName_example"
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.headVideosByIdByStreamfilename(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("headVideosByIdStream", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.headVideosByIdStream(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
  test("headVideosByIdStreamByContainer", () => {
    const id: string = "id_example"
    const container: string = "container_example"
    const deviceProfileId: string = "deviceProfileId_example"
    const deviceId: string = "deviceId_example"
    const audioCodec: string = "audioCodec_example"
    const enableAutoStreamCopy: boolean = true
    const audioSampleRate: number = 56
    const audioBitRate: number = 56
    const audioChannels: number = 56
    const maxAudioChannels: number = 56
    const _static: boolean = true
    const copyTimestamps: boolean = true
    const startTimeTicks: number = 789
    const width: number = 56
    const height: number = 56
    const maxWidth: number = 56
    const maxHeight: number = 56
    const videoBitRate: number = 56
    const subtitleStreamIndex: number = 56
    const subtitleMethod: SubtitleDeliveryMethod = undefined
    const maxVideoBitDepth: number = 56
    const videoCodec: string = "videoCodec_example"
    const audioStreamIndex: number = 56
    const videoStreamIndex: number = 56
    return expect(instance.headVideosByIdStreamByContainer(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex, {})).resolves.toBe(null)
  })
})

describe("VideosServiceApi", () => {
  let instance: api.VideosServiceApi
  beforeEach(function() {
    instance = new api.VideosServiceApi(config)
  });

  test("deleteVideosByIdAlternatesources", () => {
    const id: string = "id_example"
    return expect(instance.deleteVideosByIdAlternatesources(id, {})).resolves.toBe(null)
  })
  test("postVideosByIdAlternatesourcesDelete", () => {
    const id: string = "id_example"
    return expect(instance.postVideosByIdAlternatesourcesDelete(id, {})).resolves.toBe(null)
  })
  test("postVideosMergeversions", () => {
    const ids: string = "ids_example"
    return expect(instance.postVideosMergeversions(ids, {})).resolves.toBe(null)
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

