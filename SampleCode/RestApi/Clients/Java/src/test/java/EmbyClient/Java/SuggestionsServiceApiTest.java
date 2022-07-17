/*
 * Emby REST API
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
 * API tests for SuggestionsServiceApi
 */
@Ignore
public class SuggestionsServiceApiTest {

    private final SuggestionsServiceApi api = new SuggestionsServiceApi();

    /**
     * Gets items based on a query.
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersByUseridSuggestionsTest() throws Exception {
        String userId = null;
        QueryResultBaseItemDto response = api.getUsersByUseridSuggestions(userId);

        // TODO: test validations
    }
}
