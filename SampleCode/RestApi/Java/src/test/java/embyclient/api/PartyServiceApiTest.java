/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.api;

import embyclient.model.SessionPartyInfoResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PartyServiceApi
 */
@Ignore
public class PartyServiceApiTest {

    private final PartyServiceApi api = new PartyServiceApi();

    /**
     * Gets a list of active parties
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPartiesTest() throws Exception {
        api.getParties();

        // TODO: test validations
    }
    /**
     * Gets info about the session&#x27;s current party
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPartiesInfoTest() throws Exception {
        SessionPartyInfoResult response = api.getPartiesInfo();

        // TODO: test validations
    }
    /**
     * Creates a party
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postPartiesTest() throws Exception {
        SessionPartyInfoResult response = api.postParties();

        // TODO: test validations
    }
    /**
     * Joins a party
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postPartiesByIdJoinTest() throws Exception {
        String id = null;
        SessionPartyInfoResult response = api.postPartiesByIdJoin(id);

        // TODO: test validations
    }
    /**
     * Leaves a party
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postPartiesLeaveTest() throws Exception {
        api.postPartiesLeave();

        // TODO: test validations
    }
}
