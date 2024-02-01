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
 * API tests for UniversalAudioServiceApi
 */
@Ignore
public class UniversalAudioServiceApiTest {

    private final UniversalAudioServiceApi api = new UniversalAudioServiceApi();

    /**
     * Gets an audio stream
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAudioByIdUniversalTest() throws Exception {
        String id = null;
        String deviceId = null;
        Long startTimeTicks = null;
        api.getAudioByIdUniversal(id, deviceId, startTimeTicks);

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
    public void getAudioByIdUniversalByContainerTest() throws Exception {
        String id = null;
        String container = null;
        String deviceId = null;
        Long startTimeTicks = null;
        api.getAudioByIdUniversalByContainer(id, container, deviceId, startTimeTicks);

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
    public void headAudioByIdUniversalTest() throws Exception {
        String id = null;
        String deviceId = null;
        Long startTimeTicks = null;
        api.headAudioByIdUniversal(id, deviceId, startTimeTicks);

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
    public void headAudioByIdUniversalByContainerTest() throws Exception {
        String id = null;
        String container = null;
        String deviceId = null;
        Long startTimeTicks = null;
        api.headAudioByIdUniversalByContainer(id, container, deviceId, startTimeTicks);

        // TODO: test validations
    }
}
