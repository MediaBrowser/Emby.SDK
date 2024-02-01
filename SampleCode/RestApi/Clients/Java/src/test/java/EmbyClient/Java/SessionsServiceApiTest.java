/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.ClientCapabilities;
import io.swagger.client.model.GeneralCommand;
import io.swagger.client.model.NameIdPair;
import io.swagger.client.model.PlayCommand;
import io.swagger.client.model.PlayRequest;
import io.swagger.client.model.PlaystateCommand;
import io.swagger.client.model.PlaystateRequest;
import io.swagger.client.model.QueryResultBaseItemDto;
import io.swagger.client.model.SessionSessionInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SessionsServiceApi
 */
@Ignore
public class SessionsServiceApiTest {

    private final SessionsServiceApi api = new SessionsServiceApi();

    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAuthKeysByKeyTest() throws Exception {
        String key = null;
        api.deleteAuthKeysByKey(key);

        // TODO: test validations
    }
    /**
     * Removes an additional user from a session
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteSessionsByIdUsersByUseridTest() throws Exception {
        String id = null;
        String userId = null;
        api.deleteSessionsByIdUsersByUserid(id, userId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAuthKeysTest() throws Exception {
        Integer startIndex = null;
        Integer limit = null;
        api.getAuthKeys(startIndex, limit);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAuthProvidersTest() throws Exception {
        List<NameIdPair> response = api.getAuthProviders();

        // TODO: test validations
    }
    /**
     * Gets a list of sessions
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSessionsTest() throws Exception {
        String controllableByUserId = null;
        String deviceId = null;
        String id = null;
        List<SessionSessionInfo> response = api.getSessions(controllableByUserId, deviceId, id);

        // TODO: test validations
    }
    /**
     * Gets a the current play queue from a session
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSessionsPlayqueueTest() throws Exception {
        String id = null;
        String deviceId = null;
        QueryResultBaseItemDto response = api.getSessionsPlayqueue(id, deviceId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAuthKeysTest() throws Exception {
        String app = null;
        api.postAuthKeys(app);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAuthKeysByKeyDeleteTest() throws Exception {
        String key = null;
        api.postAuthKeysByKeyDelete(key);

        // TODO: test validations
    }
    /**
     * Issues a system command to a client
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsByIdCommandTest() throws Exception {
        GeneralCommand body = null;
        String id = null;
        api.postSessionsByIdCommand(body, id);

        // TODO: test validations
    }
    /**
     * Issues a system command to a client
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsByIdCommandByCommandTest() throws Exception {
        String id = null;
        String command = null;
        api.postSessionsByIdCommandByCommand(id, command);

        // TODO: test validations
    }
    /**
     * Issues a command to a client to display a message to the user
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsByIdMessageTest() throws Exception {
        String id = null;
        String text = null;
        String header = null;
        Long timeoutMs = null;
        api.postSessionsByIdMessage(id, text, header, timeoutMs);

        // TODO: test validations
    }
    /**
     * Instructs a session to play an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsByIdPlayingTest() throws Exception {
        PlayRequest body = null;
        List<Long> itemIds = null;
        PlayCommand playCommand = null;
        String id = null;
        Long startPositionTicks = null;
        api.postSessionsByIdPlaying(body, itemIds, playCommand, id, startPositionTicks);

        // TODO: test validations
    }
    /**
     * Issues a playstate command to a client
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsByIdPlayingByCommandTest() throws Exception {
        PlaystateRequest body = null;
        String id = null;
        PlaystateCommand command = null;
        api.postSessionsByIdPlayingByCommand(body, id, command);

        // TODO: test validations
    }
    /**
     * Issues a system command to a client
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsByIdSystemByCommandTest() throws Exception {
        String id = null;
        String command = null;
        api.postSessionsByIdSystemByCommand(id, command);

        // TODO: test validations
    }
    /**
     * Adds an additional user to a session
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsByIdUsersByUseridTest() throws Exception {
        String id = null;
        String userId = null;
        api.postSessionsByIdUsersByUserid(id, userId);

        // TODO: test validations
    }
    /**
     * Removes an additional user from a session
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsByIdUsersByUseridDeleteTest() throws Exception {
        String id = null;
        String userId = null;
        api.postSessionsByIdUsersByUseridDelete(id, userId);

        // TODO: test validations
    }
    /**
     * Instructs a session to browse to an item or view
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsByIdViewingTest() throws Exception {
        String id = null;
        String itemType = null;
        String itemId = null;
        String itemName = null;
        api.postSessionsByIdViewing(id, itemType, itemId, itemName);

        // TODO: test validations
    }
    /**
     * Updates capabilities for a device
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsCapabilitiesTest() throws Exception {
        String id = null;
        String playableMediaTypes = null;
        String supportedCommands = null;
        Boolean supportsMediaControl = null;
        Boolean supportsSync = null;
        api.postSessionsCapabilities(id, playableMediaTypes, supportedCommands, supportsMediaControl, supportsSync);

        // TODO: test validations
    }
    /**
     * Updates capabilities for a device
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsCapabilitiesFullTest() throws Exception {
        ClientCapabilities body = null;
        String id = null;
        api.postSessionsCapabilitiesFull(body, id);

        // TODO: test validations
    }
    /**
     * Reports that a session has ended
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSessionsLogoutTest() throws Exception {
        api.postSessionsLogout();

        // TODO: test validations
    }
}
