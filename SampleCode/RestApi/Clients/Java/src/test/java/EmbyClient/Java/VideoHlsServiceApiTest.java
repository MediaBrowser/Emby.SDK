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
 * API tests for VideoHlsServiceApi
 */
@Ignore
public class VideoHlsServiceApiTest {

    private final VideoHlsServiceApi api = new VideoHlsServiceApi();

    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainerTest() throws Exception {
        String segmentContainer = null;
        String segmentId = null;
        String id = null;
        String playlistId = null;
        api.getAudioByIdHlsByPlaylistidBySegmentidBySegmentcontainer(segmentContainer, segmentId, id, playlistId);

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
    public void getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainerTest() throws Exception {
        String segmentContainer = null;
        String segmentId = null;
        String id = null;
        String playlistId = null;
        api.getVideosByIdHlsByPlaylistidBySegmentidBySegmentcontainer(segmentContainer, segmentId, id, playlistId);

        // TODO: test validations
    }
}
