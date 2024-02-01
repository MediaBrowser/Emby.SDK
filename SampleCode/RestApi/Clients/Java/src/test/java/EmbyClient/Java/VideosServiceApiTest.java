/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for VideosServiceApi
 */
@Ignore
public class VideosServiceApiTest {

    private final VideosServiceApi api = new VideosServiceApi();

    /**
     * Removes alternate video sources.
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteVideosByIdAlternatesourcesTest() throws Exception {
        String id = null;
        api.deleteVideosByIdAlternatesources(id);

        // TODO: test validations
    }
    /**
     * Removes alternate video sources.
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postVideosByIdAlternatesourcesDeleteTest() throws Exception {
        String id = null;
        api.postVideosByIdAlternatesourcesDelete(id);

        // TODO: test validations
    }
    /**
     * Merges videos into a single record
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postVideosMergeversionsTest() throws Exception {
        String ids = null;
        api.postVideosMergeversions(ids);

        // TODO: test validations
    }
}
