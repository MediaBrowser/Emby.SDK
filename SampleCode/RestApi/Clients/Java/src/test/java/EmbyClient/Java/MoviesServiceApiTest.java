/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.RecommendationDto;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for MoviesServiceApi
 */
@Ignore
public class MoviesServiceApiTest {

    private final MoviesServiceApi api = new MoviesServiceApi();

    /**
     * Gets movie recommendations
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMoviesRecommendationsTest() throws Exception {
        Integer categoryLimit = null;
        Integer itemLimit = null;
        String userId = null;
        String parentId = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        List<RecommendationDto> response = api.getMoviesRecommendations(categoryLimit, itemLimit, userId, parentId, enableImages, enableUserData, imageTypeLimit, enableImageTypes);

        // TODO: test validations
    }
}
