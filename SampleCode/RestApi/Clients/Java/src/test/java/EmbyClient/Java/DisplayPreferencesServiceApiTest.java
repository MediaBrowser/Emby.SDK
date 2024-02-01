/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.DisplayPreferences;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DisplayPreferencesServiceApi
 */
@Ignore
public class DisplayPreferencesServiceApiTest {

    private final DisplayPreferencesServiceApi api = new DisplayPreferencesServiceApi();

    /**
     * Gets a user&#x27;s display preferences for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDisplaypreferencesByIdTest() throws Exception {
        String id = null;
        String userId = null;
        String client = null;
        DisplayPreferences response = api.getDisplaypreferencesById(id, userId, client);

        // TODO: test validations
    }
    /**
     * Updates a user&#x27;s display preferences for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postDisplaypreferencesByDisplaypreferencesidTest() throws Exception {
        DisplayPreferences body = null;
        String userId = null;
        String displayPreferencesId = null;
        api.postDisplaypreferencesByDisplaypreferencesid(body, userId, displayPreferencesId);

        // TODO: test validations
    }
}
