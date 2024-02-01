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
 * API tests for VideoServiceApi
 */
@Ignore
public class VideoServiceApiTest {

    private final VideoServiceApi api = new VideoServiceApi();

    /**
     * Gets a video stream
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVideosByIdByStreamfilenameTest() throws Exception {
        String streamFileName = null;
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
        api.getVideosByIdByStreamfilename(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
    /**
     * Gets a video stream
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVideosByIdStreamTest() throws Exception {
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
        api.getVideosByIdStream(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
    /**
     * Gets a video stream
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVideosByIdStreamByContainerTest() throws Exception {
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
        api.getVideosByIdStreamByContainer(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
    /**
     * Gets a video stream
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headVideosByIdByStreamfilenameTest() throws Exception {
        String streamFileName = null;
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
        api.headVideosByIdByStreamfilename(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
    /**
     * Gets a video stream
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headVideosByIdStreamTest() throws Exception {
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
        api.headVideosByIdStream(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
    /**
     * Gets a video stream
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headVideosByIdStreamByContainerTest() throws Exception {
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
        api.headVideosByIdStreamByContainer(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
}
