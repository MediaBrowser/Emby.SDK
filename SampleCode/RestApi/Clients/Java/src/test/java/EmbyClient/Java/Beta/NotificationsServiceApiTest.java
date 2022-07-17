/*
 * Emby Server REST API (BETA)
 * 
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.EmbyNotificationsApiNotificationResult;
import io.swagger.client.model.EmbyNotificationsApiNotificationsSummary;
import io.swagger.client.model.NameIdPair;
import io.swagger.client.model.NotificationsNotificationLevel;
import io.swagger.client.model.NotificationsNotificationTypeInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for NotificationsServiceApi
 */
@Ignore
public class NotificationsServiceApiTest {

    private final NotificationsServiceApi api = new NotificationsServiceApi();

    /**
     * Gets notifications
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNotificationsByUseridTest() throws Exception {
        String userId = null;
        Boolean isRead = null;
        Integer startIndex = null;
        Integer limit = null;
        EmbyNotificationsApiNotificationResult response = api.getNotificationsByUserid(userId, isRead, startIndex, limit);

        // TODO: test validations
    }
    /**
     * Gets a notification summary for a user
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNotificationsByUseridSummaryTest() throws Exception {
        String userId = null;
        EmbyNotificationsApiNotificationsSummary response = api.getNotificationsByUseridSummary(userId);

        // TODO: test validations
    }
    /**
     * Gets notification types
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNotificationsServicesTest() throws Exception {
        List<NameIdPair> response = api.getNotificationsServices();

        // TODO: test validations
    }
    /**
     * Gets notification types
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNotificationsTypesTest() throws Exception {
        List<NotificationsNotificationTypeInfo> response = api.getNotificationsTypes();

        // TODO: test validations
    }
    /**
     * Sends a notification to all admin users
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postNotificationsAdminTest() throws Exception {
        String name = null;
        String description = null;
        String imageUrl = null;
        String url = null;
        NotificationsNotificationLevel level = null;
        api.postNotificationsAdmin(name, description, imageUrl, url, level);

        // TODO: test validations
    }
    /**
     * Marks notifications as read
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postNotificationsByUseridReadTest() throws Exception {
        String userId = null;
        String ids = null;
        api.postNotificationsByUseridRead(userId, ids);

        // TODO: test validations
    }
    /**
     * Marks notifications as unread
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postNotificationsByUseridUnreadTest() throws Exception {
        String userId = null;
        String ids = null;
        api.postNotificationsByUseridUnread(userId, ids);

        // TODO: test validations
    }
}
