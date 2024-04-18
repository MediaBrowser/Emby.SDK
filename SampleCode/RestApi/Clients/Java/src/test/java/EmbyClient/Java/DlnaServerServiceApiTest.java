/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DlnaServerServiceApi
 */
@Ignore
public class DlnaServerServiceApiTest {

    private final DlnaServerServiceApi api = new DlnaServerServiceApi();

    /**
     * Gets dlna connection manager xml
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDlnaByUuidConnectionmanagerConnectionmanagerTest() throws Exception {
        String uuId = null;
        api.getDlnaByUuidConnectionmanagerConnectionmanager(uuId);

        // TODO: test validations
    }
    /**
     * Gets dlna connection manager xml
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDlnaByUuidConnectionmanagerConnectionmanagerXmlTest() throws Exception {
        String uuId = null;
        api.getDlnaByUuidConnectionmanagerConnectionmanagerXml(uuId);

        // TODO: test validations
    }
    /**
     * Gets dlna content directory xml
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDlnaByUuidContentdirectoryContentdirectoryTest() throws Exception {
        String uuId = null;
        api.getDlnaByUuidContentdirectoryContentdirectory(uuId);

        // TODO: test validations
    }
    /**
     * Gets dlna content directory xml
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDlnaByUuidContentdirectoryContentdirectoryXmlTest() throws Exception {
        String uuId = null;
        api.getDlnaByUuidContentdirectoryContentdirectoryXml(uuId);

        // TODO: test validations
    }
    /**
     * Gets dlna server info
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDlnaByUuidDescriptionTest() throws Exception {
        String uuId = null;
        api.getDlnaByUuidDescription(uuId);

        // TODO: test validations
    }
    /**
     * Gets dlna server info
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDlnaByUuidDescriptionXmlTest() throws Exception {
        String uuId = null;
        api.getDlnaByUuidDescriptionXml(uuId);

        // TODO: test validations
    }
    /**
     * Gets a server icon
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDlnaByUuidIconsByFilenameTest() throws Exception {
        String uuId = null;
        String filename = null;
        api.getDlnaByUuidIconsByFilename(uuId, filename);

        // TODO: test validations
    }
    /**
     * Gets a server icon
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDlnaIconsByFilenameTest() throws Exception {
        String filename = null;
        String uuId = null;
        api.getDlnaIconsByFilename(filename, uuId);

        // TODO: test validations
    }
    /**
     * Gets dlna connection manager xml
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headDlnaByUuidConnectionmanagerConnectionmanagerTest() throws Exception {
        String uuId = null;
        api.headDlnaByUuidConnectionmanagerConnectionmanager(uuId);

        // TODO: test validations
    }
    /**
     * Gets dlna connection manager xml
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headDlnaByUuidConnectionmanagerConnectionmanagerXmlTest() throws Exception {
        String uuId = null;
        api.headDlnaByUuidConnectionmanagerConnectionmanagerXml(uuId);

        // TODO: test validations
    }
    /**
     * Gets dlna content directory xml
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headDlnaByUuidContentdirectoryContentdirectoryTest() throws Exception {
        String uuId = null;
        api.headDlnaByUuidContentdirectoryContentdirectory(uuId);

        // TODO: test validations
    }
    /**
     * Gets dlna content directory xml
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headDlnaByUuidContentdirectoryContentdirectoryXmlTest() throws Exception {
        String uuId = null;
        api.headDlnaByUuidContentdirectoryContentdirectoryXml(uuId);

        // TODO: test validations
    }
    /**
     * Gets dlna server info
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headDlnaByUuidDescriptionTest() throws Exception {
        String uuId = null;
        api.headDlnaByUuidDescription(uuId);

        // TODO: test validations
    }
    /**
     * Gets dlna server info
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headDlnaByUuidDescriptionXmlTest() throws Exception {
        String uuId = null;
        api.headDlnaByUuidDescriptionXml(uuId);

        // TODO: test validations
    }
    /**
     * Processes a control request
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postDlnaByUuidConnectionmanagerControlTest() throws Exception {
        Object body = null;
        String uuId = null;
        api.postDlnaByUuidConnectionmanagerControl(body, uuId);

        // TODO: test validations
    }
    /**
     * Processes a control request
     *
     * No authentication required
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postDlnaByUuidContentdirectoryControlTest() throws Exception {
        Object body = null;
        String uuId = null;
        api.postDlnaByUuidContentdirectoryControl(body, uuId);

        // TODO: test validations
    }
}
