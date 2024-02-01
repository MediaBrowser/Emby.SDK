/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.ApiOnPlaybackProgress;
import io.swagger.client.model.PlayMethod;
import io.swagger.client.model.PlaybackProgressInfo;
import io.swagger.client.model.PlaybackStartInfo;
import io.swagger.client.model.PlaybackStopInfo;
import io.swagger.client.model.RepeatMode;
import io.swagger.client.model.UserItemDataDto;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PlaystateServiceApi
 */
@Ignore
public class PlaystateServiceApiTest {

    private final PlaystateServiceApi api = new PlaystateServiceApi();

    /**
     * Marks an item as unplayed
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteUsersByUseridPlayeditemsByIdTest() throws Exception {
        String userId = null;
        String id = null;
        UserItemDataDto response = api.deleteUsersByUseridPlayeditemsById(userId, id);

        // TODO: test validations
    }
    /**
     * Reports that a user has stopped playing an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteUsersByUseridPlayingitemsByIdTest() throws Exception {
        String userId = null;
        String id = null;
        String mediaSourceId = null;
        String nextMediaType = null;
        Long positionTicks = null;
        String liveStreamId = null;
        String playSessionId = null;
        api.deleteUsersByUseridPlayingitemsById(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId);

        // TODO: test validations
    }
    /**
     * Reports playback has started within a session
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsPlayingTest() throws Exception {
        PlaybackStartInfo body = null;
        api.postSessionsPlaying(body);

        // TODO: test validations
    }
    /**
     * Pings a playback session
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsPlayingPingTest() throws Exception {
        String playSessionId = null;
        api.postSessionsPlayingPing(playSessionId);

        // TODO: test validations
    }
    /**
     * Reports playback progress within a session
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsPlayingProgressTest() throws Exception {
        PlaybackProgressInfo body = null;
        api.postSessionsPlayingProgress(body);

        // TODO: test validations
    }
    /**
     * Reports playback has stopped within a session
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsPlayingStoppedTest() throws Exception {
        PlaybackStopInfo body = null;
        api.postSessionsPlayingStopped(body);

        // TODO: test validations
    }
    /**
     * Updates userdata for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByUseridItemsByItemidUserdataTest() throws Exception {
        UserItemDataDto body = null;
        String userId = null;
        String itemId = null;
        api.postUsersByUseridItemsByItemidUserdata(body, userId, itemId);

        // TODO: test validations
    }
    /**
     * Marks an item as played
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByUseridPlayeditemsByIdTest() throws Exception {
        String userId = null;
        String id = null;
        String datePlayed = null;
        UserItemDataDto response = api.postUsersByUseridPlayeditemsById(userId, id, datePlayed);

        // TODO: test validations
    }
    /**
     * Marks an item as unplayed
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByUseridPlayeditemsByIdDeleteTest() throws Exception {
        String userId = null;
        String id = null;
        UserItemDataDto response = api.postUsersByUseridPlayeditemsByIdDelete(userId, id);

        // TODO: test validations
    }
    /**
     * Reports that a user has begun playing an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByUseridPlayingitemsByIdTest() throws Exception {
        String userId = null;
        String id = null;
        String mediaSourceId = null;
        Boolean canSeek = null;
        Integer audioStreamIndex = null;
        Integer subtitleStreamIndex = null;
        PlayMethod playMethod = null;
        String liveStreamId = null;
        String playSessionId = null;
        api.postUsersByUseridPlayingitemsById(userId, id, mediaSourceId, canSeek, audioStreamIndex, subtitleStreamIndex, playMethod, liveStreamId, playSessionId);

        // TODO: test validations
    }
    /**
     * Reports that a user has stopped playing an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByUseridPlayingitemsByIdDeleteTest() throws Exception {
        String userId = null;
        String id = null;
        String mediaSourceId = null;
        String nextMediaType = null;
        Long positionTicks = null;
        String liveStreamId = null;
        String playSessionId = null;
        api.postUsersByUseridPlayingitemsByIdDelete(userId, id, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId);

        // TODO: test validations
    }
    /**
     * Reports a user&#x27;s playback progress
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByUseridPlayingitemsByIdProgressTest() throws Exception {
        ApiOnPlaybackProgress body = null;
        String mediaSourceId = null;
        String userId = null;
        String id = null;
        Long positionTicks = null;
        Boolean isPaused = null;
        Boolean isMuted = null;
        Integer audioStreamIndex = null;
        Integer subtitleStreamIndex = null;
        Integer volumeLevel = null;
        PlayMethod playMethod = null;
        String liveStreamId = null;
        String playSessionId = null;
        RepeatMode repeatMode = null;
        Integer subtitleOffset = null;
        Double playbackRate = null;
        api.postUsersByUseridPlayingitemsByIdProgress(body, mediaSourceId, userId, id, positionTicks, isPaused, isMuted, audioStreamIndex, subtitleStreamIndex, volumeLevel, playMethod, liveStreamId, playSessionId, repeatMode, subtitleOffset, playbackRate);

        // TODO: test validations
    }
}
