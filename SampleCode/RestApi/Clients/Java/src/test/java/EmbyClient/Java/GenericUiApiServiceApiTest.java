/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.RunUICommand;
import io.swagger.client.model.UIViewInfo;
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
        UIViewInfo response = api.getUIView(pageId, clientLocale);

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
        RunUICommand body = null;
        UIViewInfo response = api.postUICommand(body);

        // TODO: test validations
    }
}
