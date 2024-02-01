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
    public void getAudioByIdByStreamfilenameTest() throws Exception {
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
        api.getAudioByIdByStreamfilename(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

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
        api.getAudioByIdStream(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

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
        api.getAudioByIdStreamByContainer(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

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
    public void headAudioByIdByStreamfilenameTest() throws Exception {
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
        api.headAudioByIdByStreamfilename(streamFileName, id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

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
        api.headAudioByIdStream(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

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
        api.headAudioByIdStreamByContainer(id, container, deviceProfileId, deviceId, audioCodec, enableAutoStreamCopy, audioSampleRate, audioBitRate, audioChannels, maxAudioChannels, _static, copyTimestamps, startTimeTicks, width, height, maxWidth, maxHeight, videoBitRate, subtitleStreamIndex, subtitleMethod, maxVideoBitDepth, videoCodec, audioStreamIndex, videoStreamIndex);

        // TODO: test validations
    }
}
