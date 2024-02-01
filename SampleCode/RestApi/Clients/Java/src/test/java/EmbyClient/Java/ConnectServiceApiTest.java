/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.ConnectConnectAuthenticationExchangeResult;
import io.swagger.client.model.ConnectUserLinkResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ConnectServiceApi
 */
@Ignore
public class ConnectServiceApiTest {

    private final ConnectServiceApi api = new ConnectServiceApi();

    /**
     * Removes a Connect link for a user
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteUsersByIdConnectLinkTest() throws Exception {
        String id = null;
        api.deleteUsersByIdConnectLink(id);

        // TODO: test validations
    }
    /**
     * Gets the corresponding local user from a connect user id
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getConnectExchangeTest() throws Exception {
        String connectUserId = null;
        ConnectConnectAuthenticationExchangeResult response = api.getConnectExchange(connectUserId);

        // TODO: test validations
    }
    /**
     * Creates a Connect link for a user
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getConnectPendingTest() throws Exception {
        api.getConnectPending();

        // TODO: test validations
    }
    /**
     * Creates a Connect link for a user
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByIdConnectLinkTest() throws Exception {
        String id = null;
        String connectUsername = null;
        ConnectUserLinkResult response = api.postUsersByIdConnectLink(id, connectUsername);

        // TODO: test validations
    }
    /**
     * Removes a Connect link for a user
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByIdConnectLinkDeleteTest() throws Exception {
        String id = null;
        api.postUsersByIdConnectLinkDelete(id);

        // TODO: test validations
    }
}
