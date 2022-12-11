/*
 * Emby Server REST API (BETA)
 * 
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.EmbyNotificationsUserNotificationInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UserNotificationsServiceApi
 */
@Ignore
public class UserNotificationsServiceApiTest {

    private final UserNotificationsServiceApi api = new UserNotificationsServiceApi();

    /**
     * Gets default notification info
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNotificationsServicesDefaultsTest() throws Exception {
        EmbyNotificationsUserNotificationInfo response = api.getNotificationsServicesDefaults();

        // TODO: test validations
    }
    /**
     * Sends a test notification
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postNotificationsServicesTestTest() throws Exception {
        EmbyNotificationsUserNotificationInfo body = null;
        api.postNotificationsServicesTest(body);

        // TODO: test validations
    }
}
