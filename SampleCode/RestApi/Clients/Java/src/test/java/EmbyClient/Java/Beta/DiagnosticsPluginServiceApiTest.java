/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.3
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.EmbyWebGenericEditEditObjectContainer;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DiagnosticsPluginServiceApi
 */
@Ignore
public class DiagnosticsPluginServiceApiTest {

    private final DiagnosticsPluginServiceApi api = new DiagnosticsPluginServiceApi();

    /**
     * Gets the EncodingDiagnosticOptions for generic editor
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEncodingdiagnosticsDiagnosticoptionsTest() throws Exception {
        EmbyWebGenericEditEditObjectContainer response = api.getEncodingdiagnosticsDiagnosticoptions();

        // TODO: test validations
    }
    /**
     * Updates EncodingDiagnosticOptions from generic editor
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingdiagnosticsDiagnosticoptionsTest() throws Exception {
        Object body = null;
        api.postEncodingdiagnosticsDiagnosticoptions(body);

        // TODO: test validations
    }
}
