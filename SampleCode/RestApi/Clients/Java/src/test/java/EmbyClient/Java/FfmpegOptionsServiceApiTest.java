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
 * API tests for FfmpegOptionsServiceApi
 */
@Ignore
public class FfmpegOptionsServiceApiTest {

    private final FfmpegOptionsServiceApi api = new FfmpegOptionsServiceApi();

    /**
     * Gets the ffmpeg options
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEncodingFfmpegoptionsTest() throws Exception {
        EditObjectContainer response = api.getEncodingFfmpegoptions();

        // TODO: test validations
    }
    /**
     * Updates the ffmpeg options
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingFfmpegoptionsTest() throws Exception {
        Object body = null;
        api.postEncodingFfmpegoptions(body);

        // TODO: test validations
    }
}
