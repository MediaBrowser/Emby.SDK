/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.EditObjectContainer;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SubtitleOptionsServiceApi
 */
@Ignore
public class SubtitleOptionsServiceApiTest {

    private final SubtitleOptionsServiceApi api = new SubtitleOptionsServiceApi();

    /**
     * Gets the subtitle options
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEncodingSubtitleoptionsTest() throws Exception {
        EditObjectContainer response = api.getEncodingSubtitleoptions();

        // TODO: test validations
    }
    /**
     * Updates the subtitle options
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingSubtitleoptionsTest() throws Exception {
        Object body = null;
        api.postEncodingSubtitleoptions(body);

        // TODO: test validations
    }
}
