/*
 * Emby Server REST API (BETA)
 * 
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.EmbyNotificationsNotificationCategoryInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for NotificationsApiApi
 */
@Ignore
public class NotificationsApiApiTest {

    private final NotificationsApiApi api = new NotificationsApiApi();

    /**
     * Gets notification types
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNotificationsAllTest() throws Exception {
        List<EmbyNotificationsNotificationCategoryInfo> response = api.getNotificationsAll();

        // TODO: test validations
    }
}
