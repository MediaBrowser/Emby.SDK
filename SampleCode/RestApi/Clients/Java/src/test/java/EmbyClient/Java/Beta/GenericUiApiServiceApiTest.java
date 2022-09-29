/*
 * Emby Server REST API (BETA)
 * 
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.EmbyWebGenericUIApiEndpointsRunUICommand;
import io.swagger.client.model.EmbyWebGenericUIModelUIViewInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for GenericUiApiServiceApi
 */
@Ignore
public class GenericUiApiServiceApiTest {

    private final GenericUiApiServiceApi api = new GenericUiApiServiceApi();

    /**
     * Gets UI view data
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUIViewTest() throws Exception {
        String pageId = null;
        String clientLocale = null;
        EmbyWebGenericUIModelUIViewInfo response = api.getUIView(pageId, clientLocale);

        // TODO: test validations
    }
    /**
     * Execute a command in the context of tv setup
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUICommandTest() throws Exception {
        EmbyWebGenericUIApiEndpointsRunUICommand body = null;
        EmbyWebGenericUIModelUIViewInfo response = api.postUICommand(body);

        // TODO: test validations
    }
}
