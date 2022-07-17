/*
 * Emby Server REST API (BETA)
 * 
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.EmbyDlnaProfilesDlnaProfile;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DlnaServiceApi
 */
@Ignore
public class DlnaServiceApiTest {

    private final DlnaServiceApi api = new DlnaServiceApi();

    /**
     * Deletes a profile
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteDlnaProfilesByIdTest() throws Exception {
        String id = null;
        api.deleteDlnaProfilesById(id);

        // TODO: test validations
    }
    /**
     * Gets a list of profiles
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDlnaProfileinfosTest() throws Exception {
        List<EmbyDlnaProfilesDlnaProfile> response = api.getDlnaProfileinfos();

        // TODO: test validations
    }
    /**
     * Gets a single profile
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDlnaProfilesByIdTest() throws Exception {
        String id = null;
        EmbyDlnaProfilesDlnaProfile response = api.getDlnaProfilesById(id);

        // TODO: test validations
    }
    /**
     * Gets the default profile
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDlnaProfilesDefaultTest() throws Exception {
        EmbyDlnaProfilesDlnaProfile response = api.getDlnaProfilesDefault();

        // TODO: test validations
    }
    /**
     * Creates a profile
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postDlnaProfilesTest() throws Exception {
        EmbyDlnaProfilesDlnaProfile body = null;
        api.postDlnaProfiles(body);

        // TODO: test validations
    }
    /**
     * Updates a profile
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postDlnaProfilesByIdTest() throws Exception {
        EmbyDlnaProfilesDlnaProfile body = null;
        String id = null;
        api.postDlnaProfilesById(body, id);

        // TODO: test validations
    }
}
