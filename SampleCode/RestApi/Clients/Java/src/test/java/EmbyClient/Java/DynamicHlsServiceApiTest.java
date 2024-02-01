/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.SubtitleDeliveryMethod;
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
     * Requires authentication as user
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
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAudioByIdLiveM3u8Test() throws Exception {
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
        Boolean copyTimestamps = null;
        Long startTimeTicks = null;
        Integer width = null;
        Integer height = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer videoBitRate = null;
        Integer subtitleStreamIndex = null;
        SubtitleDeliveryMethod subtitleMethod = null;
        Integer maxVideoBitDepth = null;
        String videoCodec = null;
        Integer audioStreamIndex = null;
        Integer videoStreamIndex = null;
        api.getAudioByIdLiveM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

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
        Boolean copyTimestamps = null;
        Long startTimeTicks = null;
        Integer width = null;
        Integer height = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer videoBitRate = null;
        Integer subtitleStreamIndex = null;
        SubtitleDeliveryMethod subtitleMethod = null;
        Integer maxVideoBitDepth = null;
        String videoCodec = null;
        Integer audioStreamIndex = null;
        Integer videoStreamIndex = null;
        api.getAudioByIdMainM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

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
        Boolean copyTimestamps = null;
        Long startTimeTicks = null;
        Integer width = null;
        Integer height = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer videoBitRate = null;
        Integer subtitleStreamIndex = null;
        SubtitleDeliveryMethod subtitleMethod = null;
        Integer maxVideoBitDepth = null;
        String videoCodec = null;
        Integer audioStreamIndex = null;
        Integer videoStreamIndex = null;
        api.getAudioByIdMasterM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
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
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVideosByIdLiveM3u8Test() throws Exception {
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
        Boolean copyTimestamps = null;
        Long startTimeTicks = null;
        Integer width = null;
        Integer height = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer videoBitRate = null;
        Integer subtitleStreamIndex = null;
        SubtitleDeliveryMethod subtitleMethod = null;
        Integer maxVideoBitDepth = null;
        String videoCodec = null;
        Integer audioStreamIndex = null;
        Integer videoStreamIndex = null;
        api.getVideosByIdLiveM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

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
        Boolean copyTimestamps = null;
        Long startTimeTicks = null;
        Integer width = null;
        Integer height = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer videoBitRate = null;
        Integer subtitleStreamIndex = null;
        SubtitleDeliveryMethod subtitleMethod = null;
        Integer maxVideoBitDepth = null;
        String videoCodec = null;
        Integer audioStreamIndex = null;
        Integer videoStreamIndex = null;
        api.getVideosByIdMainM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

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
        Boolean copyTimestamps = null;
        Long startTimeTicks = null;
        Integer width = null;
        Integer height = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer videoBitRate = null;
        Integer subtitleStreamIndex = null;
        SubtitleDeliveryMethod subtitleMethod = null;
        Integer maxVideoBitDepth = null;
        String videoCodec = null;
        Integer audioStreamIndex = null;
        Integer videoStreamIndex = null;
        api.getVideosByIdMasterM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

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
     * Requires authentication as user
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
        Boolean copyTimestamps = null;
        Long startTimeTicks = null;
        Integer width = null;
        Integer height = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer videoBitRate = null;
        Integer subtitleStreamIndex = null;
        SubtitleDeliveryMethod subtitleMethod = null;
        Integer maxVideoBitDepth = null;
        String videoCodec = null;
        Integer audioStreamIndex = null;
        Integer videoStreamIndex = null;
        api.headAudioByIdMasterM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
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
        Boolean copyTimestamps = null;
        Long startTimeTicks = null;
        Integer width = null;
        Integer height = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer videoBitRate = null;
        Integer subtitleStreamIndex = null;
        SubtitleDeliveryMethod subtitleMethod = null;
        Integer maxVideoBitDepth = null;
        String videoCodec = null;
        Integer audioStreamIndex = null;
        Integer videoStreamIndex = null;
        api.headVideosByIdMasterM3u8(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
}
