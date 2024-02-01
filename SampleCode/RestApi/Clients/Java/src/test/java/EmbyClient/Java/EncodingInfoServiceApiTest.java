/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.CodecConfiguration;
import io.swagger.client.model.ConfigurationToneMappingToneMapOptionsVisibility;
import io.swagger.client.model.VideoCodecBase;
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
        List<CodecConfiguration> response = api.getEncodingCodecconfigurationDefaults();

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
        List<VideoCodecBase> response = api.getEncodingCodecinformationVideo();

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
        ConfigurationToneMappingToneMapOptionsVisibility response = api.getEncodingTonemapoptions();

        // TODO: test validations
    }
}
