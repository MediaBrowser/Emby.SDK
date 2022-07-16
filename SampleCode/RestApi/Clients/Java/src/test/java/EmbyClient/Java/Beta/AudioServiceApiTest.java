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
 * API tests for AudioServiceApi
 */
@Ignore
public class AudioServiceApiTest {

    private final AudioServiceApi api = new AudioServiceApi();

    /**
     * Gets an audio stream
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAudioByIdStreamTest() throws Exception {
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
        api.getAudioByIdStream(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
    /**
     * Gets an audio stream
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAudioByIdStreamByContainerTest() throws Exception {
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
        api.getAudioByIdStreamByContainer(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
    /**
     * Gets an audio stream
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headAudioByIdStreamTest() throws Exception {
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
        api.headAudioByIdStream(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
    /**
     * Gets an audio stream
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headAudioByIdStreamByContainerTest() throws Exception {
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
        api.headAudioByIdStreamByContainer(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
}
