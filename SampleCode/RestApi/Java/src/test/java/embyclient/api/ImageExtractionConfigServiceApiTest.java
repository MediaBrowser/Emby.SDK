/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.api;

import embyclient.model.MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ImageExtractionConfigServiceApi
 */
@Ignore
public class ImageExtractionConfigServiceApiTest {

    private final ImageExtractionConfigServiceApi api = new ImageExtractionConfigServiceApi();

    /**
     * Gets the image-extraction tone-mapping settings
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEncodingImageextractiontonemapparametersTest() throws Exception {
        MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm response = api.getEncodingImageextractiontonemapparameters();

        // TODO: test validations
    }
    /**
     * Updates the image-extraction tone-mapping settings
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingImageextractiontonemapparametersTest() throws Exception {
        Object body = null;
        api.postEncodingImageextractiontonemapparameters(body);

        // TODO: test validations
    }
    /**
     * Runs an image-extraction settings command
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingImageextractiontonemapparametersCommandTest() throws Exception {
        Object body = null;
        MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm response = api.postEncodingImageextractiontonemapparametersCommand(body);

        // TODO: test validations
    }
    /**
     * Closes an image-extraction filter options dialog
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingImageextractiontonemapparametersSuboptionsTest() throws Exception {
        Object body = null;
        MediaEncodingSettingsUIImageExtractionImageExtractionToneMappingForm response = api.postEncodingImageextractiontonemapparametersSuboptions(body);

        // TODO: test validations
    }
}
