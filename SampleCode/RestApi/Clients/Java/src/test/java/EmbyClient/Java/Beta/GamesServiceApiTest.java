/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.GameSystemSummary;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for GamesServiceApi
 */
@Ignore
public class GamesServiceApiTest {

    private final GamesServiceApi api = new GamesServiceApi();

    /**
     * Finds games similar to a given game.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getGamesSystemsummariesTest() throws Exception {
        String userId = null;
        List<GameSystemSummary> response = api.getGamesSystemsummaries(userId);

        // TODO: test validations
    }
}
