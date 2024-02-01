/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.LiveStreamRequest;
import io.swagger.client.model.LiveStreamResponse;
import io.swagger.client.model.PlaybackInfoRequest;
import io.swagger.client.model.PlaybackInfoResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for MediaInfoServiceApi
 */
@Ignore
public class MediaInfoServiceApiTest {

    private final MediaInfoServiceApi api = new MediaInfoServiceApi();

    /**
     * Gets live playback media info for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdPlaybackinfoTest() throws Exception {
        String id = null;
        String userId = null;
        PlaybackInfoResponse response = api.getItemsByIdPlaybackinfo(id, userId);

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
    public void getPlaybackBitratetestTest() throws Exception {
        Long size = null;
        api.getPlaybackBitratetest(size);

        // TODO: test validations
    }
    /**
     * Gets live playback media info for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsByIdPlaybackinfoTest() throws Exception {
        PlaybackInfoRequest body = null;
        String id = null;
        PlaybackInfoResponse response = api.postItemsByIdPlaybackinfo(body, id);

        // TODO: test validations
    }
    /**
     * Closes a media source
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivestreamsCloseTest() throws Exception {
        String liveStreamId = null;
        api.postLivestreamsClose(liveStreamId);

        // TODO: test validations
    }
    /**
     * Closes a media source
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivestreamsMediainfoTest() throws Exception {
        String liveStreamId = null;
        api.postLivestreamsMediainfo(liveStreamId);

        // TODO: test validations
    }
    /**
     * Opens a media source
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLivestreamsOpenTest() throws Exception {
        LiveStreamRequest body = null;
        LiveStreamResponse response = api.postLivestreamsOpen(body);

        // TODO: test validations
    }
}
