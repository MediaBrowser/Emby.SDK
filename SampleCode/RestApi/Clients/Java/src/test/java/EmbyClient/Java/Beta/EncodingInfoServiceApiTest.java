/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.ConfigurationCodecConfiguration;
import io.swagger.client.model.MediaEncodingCodecsVideoCodecsVideoCodecBase;
import io.swagger.client.model.MediaEncodingConfigurationToneMappingToneMapOptionsVisibility;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for EncodingInfoServiceApi
 */
@Ignore
public class EncodingInfoServiceApiTest {

    private final EncodingInfoServiceApi api = new EncodingInfoServiceApi();

    /**
     * Gets default codec configurations
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEncodingCodecconfigurationDefaultsTest() throws Exception {
        List<ConfigurationCodecConfiguration> response = api.getEncodingCodecconfigurationDefaults();

        // TODO: test validations
    }
    /**
     * Gets details about available video encoders and decoders
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEncodingCodecinformationVideoTest() throws Exception {
        List<MediaEncodingCodecsVideoCodecsVideoCodecBase> response = api.getEncodingCodecinformationVideo();

        // TODO: test validations
    }
    /**
     * Gets available tone mapping options
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEncodingTonemapoptionsTest() throws Exception {
        MediaEncodingConfigurationToneMappingToneMapOptionsVisibility response = api.getEncodingTonemapoptions();

        // TODO: test validations
    }
}
