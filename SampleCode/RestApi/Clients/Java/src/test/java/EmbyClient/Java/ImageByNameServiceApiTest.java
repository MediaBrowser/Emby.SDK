/*
 * Emby REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.ImageByNameInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ImageByNameServiceApi
 */
@Ignore
public class ImageByNameServiceApiTest {

    private final ImageByNameServiceApi api = new ImageByNameServiceApi();

    /**
     * Gets all general images by name
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImagesGeneralTest() throws Exception {
        List<ImageByNameInfo> response = api.getImagesGeneral();

        // TODO: test validations
    }
    /**
     * Gets a general image by name
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImagesGeneralByNameByTypeTest() throws Exception {
        String name = null;
        String type = null;
        api.getImagesGeneralByNameByType(name, type);

        // TODO: test validations
    }
    /**
     * Gets all media info image by name
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImagesMediainfoTest() throws Exception {
        List<ImageByNameInfo> response = api.getImagesMediainfo();

        // TODO: test validations
    }
    /**
     * Gets a media info image by name
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImagesMediainfoByThemeByNameTest() throws Exception {
        String name = null;
        String theme = null;
        api.getImagesMediainfoByThemeByName(name, theme);

        // TODO: test validations
    }
    /**
     * Gets all rating images by name
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImagesRatingsTest() throws Exception {
        List<ImageByNameInfo> response = api.getImagesRatings();

        // TODO: test validations
    }
    /**
     * Gets a rating image by name
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImagesRatingsByThemeByNameTest() throws Exception {
        String name = null;
        String theme = null;
        api.getImagesRatingsByThemeByName(name, theme);

        // TODO: test validations
    }
}
