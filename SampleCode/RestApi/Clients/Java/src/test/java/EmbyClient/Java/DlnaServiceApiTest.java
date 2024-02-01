/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.DlnaProfilesDlnaProfile;
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
        List<DlnaProfilesDlnaProfile> response = api.getDlnaProfileinfos();

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
        DlnaProfilesDlnaProfile response = api.getDlnaProfilesById(id);

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
        DlnaProfilesDlnaProfile response = api.getDlnaProfilesDefault();

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
        DlnaProfilesDlnaProfile body = null;
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
        DlnaProfilesDlnaProfile body = null;
        String id = null;
        api.postDlnaProfilesById(body, id);

        // TODO: test validations
    }
}
