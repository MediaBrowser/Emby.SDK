/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for LiveStreamServiceApi
 */
@Ignore
public class LiveStreamServiceApiTest {

    private final LiveStreamServiceApi api = new LiveStreamServiceApi();

    /**
     * Gets a live recording
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvLiverecordingsByIdHlsBySegmentTest() throws Exception {
        String id = null;
        String segment = null;
        api.getLivetvLiverecordingsByIdHlsBySegment(id, segment);

        // TODO: test validations
    }
    /**
     * Gets a live recording
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvLiverecordingsByIdHlsLiveM3u8Test() throws Exception {
        String id = null;
        api.getLivetvLiverecordingsByIdHlsLiveM3u8(id);

        // TODO: test validations
    }
    /**
     * Gets a live recording
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvLiverecordingsByIdHlsMasterM3u8Test() throws Exception {
        String id = null;
        api.getLivetvLiverecordingsByIdHlsMasterM3u8(id);

        // TODO: test validations
    }
    /**
     * Gets a live tv channel
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvLiverecordingsByIdStreamTest() throws Exception {
        String id = null;
        api.getLivetvLiverecordingsByIdStream(id);

        // TODO: test validations
    }
    /**
     * Gets a live tv channel
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvLivestreamfilesByIdHlsBySegmentTest() throws Exception {
        String id = null;
        String segment = null;
        api.getLivetvLivestreamfilesByIdHlsBySegment(id, segment);

        // TODO: test validations
    }
    /**
     * Gets a live tv channel
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvLivestreamfilesByIdHlsLiveM3u8Test() throws Exception {
        String id = null;
        api.getLivetvLivestreamfilesByIdHlsLiveM3u8(id);

        // TODO: test validations
    }
    /**
     * Gets a live tv channel
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvLivestreamfilesByIdHlsMasterM3u8Test() throws Exception {
        String id = null;
        api.getLivetvLivestreamfilesByIdHlsMasterM3u8(id);

        // TODO: test validations
    }
    /**
     * Gets a live tv channel
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLivetvLivestreamfilesByIdStreamByContainerTest() throws Exception {
        String id = null;
        String container = null;
        api.getLivetvLivestreamfilesByIdStreamByContainer(id, container);

        // TODO: test validations
    }
    /**
     * Gets a live recording
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headLivetvLiverecordingsByIdHlsBySegmentTest() throws Exception {
        String id = null;
        String segment = null;
        api.headLivetvLiverecordingsByIdHlsBySegment(id, segment);

        // TODO: test validations
    }
    /**
     * Gets a live recording
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headLivetvLiverecordingsByIdHlsLiveM3u8Test() throws Exception {
        String id = null;
        api.headLivetvLiverecordingsByIdHlsLiveM3u8(id);

        // TODO: test validations
    }
    /**
     * Gets a live recording
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headLivetvLiverecordingsByIdHlsMasterM3u8Test() throws Exception {
        String id = null;
        api.headLivetvLiverecordingsByIdHlsMasterM3u8(id);

        // TODO: test validations
    }
    /**
     * Gets a live tv channel
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headLivetvLivestreamfilesByIdHlsBySegmentTest() throws Exception {
        String id = null;
        String segment = null;
        api.headLivetvLivestreamfilesByIdHlsBySegment(id, segment);

        // TODO: test validations
    }
    /**
     * Gets a live tv channel
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headLivetvLivestreamfilesByIdHlsLiveM3u8Test() throws Exception {
        String id = null;
        api.headLivetvLivestreamfilesByIdHlsLiveM3u8(id);

        // TODO: test validations
    }
    /**
     * Gets a live tv channel
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headLivetvLivestreamfilesByIdHlsMasterM3u8Test() throws Exception {
        String id = null;
        api.headLivetvLivestreamfilesByIdHlsMasterM3u8(id);

        // TODO: test validations
    }
}
