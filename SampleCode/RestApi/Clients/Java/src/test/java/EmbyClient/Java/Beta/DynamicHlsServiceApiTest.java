/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.6
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.DlnaSubtitleDeliveryMethod;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DynamicHlsServiceApi
 */
@Ignore
public class DynamicHlsServiceApiTest {

    private final DynamicHlsServiceApi api = new DynamicHlsServiceApi();

    /**
     * 
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerTest() throws Exception {
        String segmentContainer = null;
        String segmentId = null;
        String id = null;
        String playlistId = null;
        api.getAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(segmentContainer, segmentId, id, playlistId);

        // TODO: test validations
    }
    /**
     * Gets an audio stream using HTTP live streaming.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAudioByIdMainM3u8Test() throws Exception {
        String id = null;
        String container = null;
        String deviceProfileId = null;
        String deviceId = null;
        String audioCodec = null;
        Boolean enableAutoStreamCopy = null;
        Integer audioSampleRate = null;
        Integer audioBitRate = null;
        Integer audioChannels = null;
        Integer maxAudioChannels = null;
        Boolean _static = null;
        String profile = null;
        String level = null;
        Float framerate = null;
        Float maxFramerate = null;
        Boolean copyTimestamps = null;
        Long startTimeTicks = null;
        Integer width = null;
        Integer height = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer videoBitRate = null;
        Integer subtitleStreamIndex = null;
        DlnaSubtitleDeliveryMethod subtitleMethod = null;
        Integer maxRefFrames = null;
        Integer maxVideoBitDepth = null;
        String videoCodec = null;
        Integer audioStreamIndex = null;
        Integer videoStreamIndex = null;
        api.getAudioByIdMainM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
    /**
     * Gets an audio stream using HTTP live streaming.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAudioByIdMasterM3u8Test() throws Exception {
        String id = null;
        String container = null;
        String deviceProfileId = null;
        String deviceId = null;
        String audioCodec = null;
        Boolean enableAutoStreamCopy = null;
        Integer audioSampleRate = null;
        Integer audioBitRate = null;
        Integer audioChannels = null;
        Integer maxAudioChannels = null;
        Boolean _static = null;
        String profile = null;
        String level = null;
        Float framerate = null;
        Float maxFramerate = null;
        Boolean copyTimestamps = null;
        Long startTimeTicks = null;
        Integer width = null;
        Integer height = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer videoBitRate = null;
        Integer subtitleStreamIndex = null;
        DlnaSubtitleDeliveryMethod subtitleMethod = null;
        Integer maxRefFrames = null;
        Integer maxVideoBitDepth = null;
        String videoCodec = null;
        Integer audioStreamIndex = null;
        Integer videoStreamIndex = null;
        api.getAudioByIdMasterM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
    /**
     * 
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerTest() throws Exception {
        String segmentContainer = null;
        String segmentId = null;
        String id = null;
        String playlistId = null;
        api.getVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(segmentContainer, segmentId, id, playlistId);

        // TODO: test validations
    }
    /**
     * Gets an HLS subtitle playlist.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVideosByIdLiveSubtitlesM3u8Test() throws Exception {
        String id = null;
        Integer subtitleSegmentLength = null;
        String manifestSubtitles = null;
        api.getVideosByIdLiveSubtitlesM3u8(id, subtitleSegmentLength, manifestSubtitles);

        // TODO: test validations
    }
    /**
     * Gets a video stream using HTTP live streaming.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVideosByIdMainM3u8Test() throws Exception {
        String id = null;
        String container = null;
        String deviceProfileId = null;
        String deviceId = null;
        String audioCodec = null;
        Boolean enableAutoStreamCopy = null;
        Integer audioSampleRate = null;
        Integer audioBitRate = null;
        Integer audioChannels = null;
        Integer maxAudioChannels = null;
        Boolean _static = null;
        String profile = null;
        String level = null;
        Float framerate = null;
        Float maxFramerate = null;
        Boolean copyTimestamps = null;
        Long startTimeTicks = null;
        Integer width = null;
        Integer height = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer videoBitRate = null;
        Integer subtitleStreamIndex = null;
        DlnaSubtitleDeliveryMethod subtitleMethod = null;
        Integer maxRefFrames = null;
        Integer maxVideoBitDepth = null;
        String videoCodec = null;
        Integer audioStreamIndex = null;
        Integer videoStreamIndex = null;
        api.getVideosByIdMainM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
    /**
     * Gets a video stream using HTTP live streaming.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVideosByIdMasterM3u8Test() throws Exception {
        String id = null;
        String container = null;
        String deviceProfileId = null;
        String deviceId = null;
        String audioCodec = null;
        Boolean enableAutoStreamCopy = null;
        Integer audioSampleRate = null;
        Integer audioBitRate = null;
        Integer audioChannels = null;
        Integer maxAudioChannels = null;
        Boolean _static = null;
        String profile = null;
        String level = null;
        Float framerate = null;
        Float maxFramerate = null;
        Boolean copyTimestamps = null;
        Long startTimeTicks = null;
        Integer width = null;
        Integer height = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer videoBitRate = null;
        Integer subtitleStreamIndex = null;
        DlnaSubtitleDeliveryMethod subtitleMethod = null;
        Integer maxRefFrames = null;
        Integer maxVideoBitDepth = null;
        String videoCodec = null;
        Integer audioStreamIndex = null;
        Integer videoStreamIndex = null;
        api.getVideosByIdMasterM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
    /**
     * Gets an HLS subtitle playlist.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVideosByIdSubtitlesM3u8Test() throws Exception {
        String id = null;
        Integer subtitleSegmentLength = null;
        String manifestSubtitles = null;
        api.getVideosByIdSubtitlesM3u8(id, subtitleSegmentLength, manifestSubtitles);

        // TODO: test validations
    }
    /**
     * 
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainerTest() throws Exception {
        String segmentContainer = null;
        String segmentId = null;
        String id = null;
        String playlistId = null;
        api.headAudioByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(segmentContainer, segmentId, id, playlistId);

        // TODO: test validations
    }
    /**
     * Gets an audio stream using HTTP live streaming.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headAudioByIdMasterM3u8Test() throws Exception {
        String id = null;
        String container = null;
        String deviceProfileId = null;
        String deviceId = null;
        String audioCodec = null;
        Boolean enableAutoStreamCopy = null;
        Integer audioSampleRate = null;
        Integer audioBitRate = null;
        Integer audioChannels = null;
        Integer maxAudioChannels = null;
        Boolean _static = null;
        String profile = null;
        String level = null;
        Float framerate = null;
        Float maxFramerate = null;
        Boolean copyTimestamps = null;
        Long startTimeTicks = null;
        Integer width = null;
        Integer height = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer videoBitRate = null;
        Integer subtitleStreamIndex = null;
        DlnaSubtitleDeliveryMethod subtitleMethod = null;
        Integer maxRefFrames = null;
        Integer maxVideoBitDepth = null;
        String videoCodec = null;
        Integer audioStreamIndex = null;
        Integer videoStreamIndex = null;
        api.headAudioByIdMasterM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
    /**
     * 
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainerTest() throws Exception {
        String segmentContainer = null;
        String segmentId = null;
        String id = null;
        String playlistId = null;
        api.headVideosByIdHls1ByPlaylistidBySegmentidBySegmentcontainer(segmentContainer, segmentId, id, playlistId);

        // TODO: test validations
    }
    /**
     * Gets a video stream using HTTP live streaming.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headVideosByIdMasterM3u8Test() throws Exception {
        String id = null;
        String container = null;
        String deviceProfileId = null;
        String deviceId = null;
        String audioCodec = null;
        Boolean enableAutoStreamCopy = null;
        Integer audioSampleRate = null;
        Integer audioBitRate = null;
        Integer audioChannels = null;
        Integer maxAudioChannels = null;
        Boolean _static = null;
        String profile = null;
        String level = null;
        Float framerate = null;
        Float maxFramerate = null;
        Boolean copyTimestamps = null;
        Long startTimeTicks = null;
        Integer width = null;
        Integer height = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer videoBitRate = null;
        Integer subtitleStreamIndex = null;
        DlnaSubtitleDeliveryMethod subtitleMethod = null;
        Integer maxRefFrames = null;
        Integer maxVideoBitDepth = null;
        String videoCodec = null;
        Integer audioStreamIndex = null;
        Integer videoStreamIndex = null;
        api.headVideosByIdMasterM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
}