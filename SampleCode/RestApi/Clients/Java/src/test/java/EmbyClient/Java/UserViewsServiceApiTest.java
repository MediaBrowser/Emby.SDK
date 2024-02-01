/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.QueryResultBaseItemDto;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UserViewsServiceApi
 */
@Ignore
public class UserViewsServiceApiTest {

    private final UserViewsServiceApi api = new UserViewsServiceApi();

    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersByUseridViewsTest() throws Exception {
        String userId = null;
        Boolean includeExternalContent = null;
        QueryResultBaseItemDto response = api.getUsersByUseridViews(userId, includeExternalContent);

        // TODO: test validations
    }
}
