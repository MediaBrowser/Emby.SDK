/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.QueryResultActivityLogEntry;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ActivityLogServiceApi
 */
@Ignore
public class ActivityLogServiceApiTest {

    private final ActivityLogServiceApi api = new ActivityLogServiceApi();

    /**
     * Gets activity log entries
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSystemActivitylogEntriesTest() throws Exception {
        Integer startIndex = null;
        Integer limit = null;
        String minDate = null;
        QueryResultActivityLogEntry response = api.getSystemActivitylogEntries(startIndex, limit, minDate);

        // TODO: test validations
    }
}
