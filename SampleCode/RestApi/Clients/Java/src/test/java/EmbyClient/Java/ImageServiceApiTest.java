/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.ImageInfo;
import io.swagger.client.model.ImageType;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ImageServiceApi
 */
@Ignore
public class ImageServiceApiTest {

    private final ImageServiceApi api = new ImageServiceApi();

    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteItemsByIdImagesByTypeTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer index = null;
        api.deleteItemsByIdImagesByType(id, type, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteItemsByIdImagesByTypeByIndexTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer index = null;
        api.deleteItemsByIdImagesByTypeByIndex(id, type, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteUsersByIdImagesByTypeTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer index = null;
        api.deleteUsersByIdImagesByType(id, type, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteUsersByIdImagesByTypeByIndexTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer index = null;
        api.deleteUsersByIdImagesByTypeByIndex(id, type, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getArtistsByNameImagesByTypeTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.getArtistsByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getArtistsByNameImagesByTypeByIndexTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.getArtistsByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getGamegenresByNameImagesByTypeTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.getGamegenresByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getGamegenresByNameImagesByTypeByIndexTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.getGamegenresByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getGenresByNameImagesByTypeTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.getGenresByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getGenresByNameImagesByTypeByIndexTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.getGenresByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * Gets information about an item&#x27;s images
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdImagesTest() throws Exception {
        String id = null;
        List<ImageInfo> response = api.getItemsByIdImages(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdImagesByTypeTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.getItemsByIdImagesByType(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdImagesByTypeByIndexTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.getItemsByIdImagesByTypeByIndex(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountTest() throws Exception {
        Integer percentPlayed = null;
        Integer unPlayedCount = null;
        String id = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        String tag = null;
        String format = null;
        ImageType type = null;
        Integer index = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.getItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(percentPlayed, unPlayedCount, id, maxWidth, maxHeight, tag, format, type, index, width, height, quality, cropWhitespace, enableImageEnhancers, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMusicgenresByNameImagesByTypeTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.getMusicgenresByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMusicgenresByNameImagesByTypeByIndexTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.getMusicgenresByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPersonsByNameImagesByTypeTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.getPersonsByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPersonsByNameImagesByTypeByIndexTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.getPersonsByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getStudiosByNameImagesByTypeTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.getStudiosByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getStudiosByNameImagesByTypeByIndexTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.getStudiosByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersByIdImagesByTypeTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.getUsersByIdImagesByType(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersByIdImagesByTypeByIndexTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.getUsersByIdImagesByTypeByIndex(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headArtistsByNameImagesByTypeTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.headArtistsByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headArtistsByNameImagesByTypeByIndexTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.headArtistsByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headGamegenresByNameImagesByTypeTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.headGamegenresByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headGamegenresByNameImagesByTypeByIndexTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.headGamegenresByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headGenresByNameImagesByTypeTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.headGenresByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headGenresByNameImagesByTypeByIndexTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.headGenresByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headItemsByIdImagesByTypeTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.headItemsByIdImagesByType(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headItemsByIdImagesByTypeByIndexTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.headItemsByIdImagesByTypeByIndex(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountTest() throws Exception {
        Integer percentPlayed = null;
        Integer unPlayedCount = null;
        String id = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        String tag = null;
        String format = null;
        ImageType type = null;
        Integer index = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.headItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(percentPlayed, unPlayedCount, id, maxWidth, maxHeight, tag, format, type, index, width, height, quality, cropWhitespace, enableImageEnhancers, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headMusicgenresByNameImagesByTypeTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.headMusicgenresByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headMusicgenresByNameImagesByTypeByIndexTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.headMusicgenresByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headPersonsByNameImagesByTypeTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.headPersonsByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headPersonsByNameImagesByTypeByIndexTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.headPersonsByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headStudiosByNameImagesByTypeTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.headStudiosByNameImagesByType(name, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headStudiosByNameImagesByTypeByIndexTest() throws Exception {
        String name = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.headStudiosByNameImagesByTypeByIndex(name, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headUsersByIdImagesByTypeTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        Integer index = null;
        api.headUsersByIdImagesByType(id, type, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headUsersByIdImagesByTypeByIndexTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer index = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Integer width = null;
        Integer height = null;
        Integer quality = null;
        String tag = null;
        Boolean cropWhitespace = null;
        Boolean enableImageEnhancers = null;
        String format = null;
        String backgroundColor = null;
        String foregroundLayer = null;
        Boolean autoOrient = null;
        Boolean keepAnimation = null;
        api.headUsersByIdImagesByTypeByIndex(id, type, index, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, enableImageEnhancers, format, backgroundColor, foregroundLayer, autoOrient, keepAnimation);

        // TODO: test validations
    }
    /**
     * Uploads an image for an item, must be base64 encoded.
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsByIdImagesByTypeTest() throws Exception {
        Object body = null;
        String id = null;
        ImageType type = null;
        Integer index = null;
        api.postItemsByIdImagesByType(body, id, type, index);

        // TODO: test validations
    }
    /**
     * Uploads an image for an item, must be base64 encoded.
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsByIdImagesByTypeByIndexTest() throws Exception {
        Object body = null;
        String id = null;
        ImageType type = null;
        Integer index = null;
        api.postItemsByIdImagesByTypeByIndex(body, id, type, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsByIdImagesByTypeByIndexDeleteTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer index = null;
        api.postItemsByIdImagesByTypeByIndexDelete(id, type, index);

        // TODO: test validations
    }
    /**
     * Updates the index for an item image
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsByIdImagesByTypeByIndexIndexTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer index = null;
        Integer newIndex = null;
        api.postItemsByIdImagesByTypeByIndexIndex(id, type, index, newIndex);

        // TODO: test validations
    }
    /**
     * Updates the index for an item image
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsByIdImagesByTypeByIndexUrlTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer index = null;
        String url = null;
        api.postItemsByIdImagesByTypeByIndexUrl(id, type, index, url);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsByIdImagesByTypeDeleteTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer index = null;
        api.postItemsByIdImagesByTypeDelete(id, type, index);

        // TODO: test validations
    }
    /**
     * Uploads an image for an item, must be base64 encoded.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByIdImagesByTypeTest() throws Exception {
        Object body = null;
        String id = null;
        ImageType type = null;
        Integer index = null;
        api.postUsersByIdImagesByType(body, id, type, index);

        // TODO: test validations
    }
    /**
     * Uploads an image for an item, must be base64 encoded.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByIdImagesByTypeByIndexTest() throws Exception {
        Object body = null;
        String id = null;
        ImageType type = null;
        Integer index = null;
        api.postUsersByIdImagesByTypeByIndex(body, id, type, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByIdImagesByTypeByIndexDeleteTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer index = null;
        api.postUsersByIdImagesByTypeByIndexDelete(id, type, index);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByIdImagesByTypeDeleteTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer index = null;
        api.postUsersByIdImagesByTypeDelete(id, type, index);

        // TODO: test validations
    }
}
