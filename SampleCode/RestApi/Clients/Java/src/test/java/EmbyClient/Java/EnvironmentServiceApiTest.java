/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.DefaultDirectoryBrowserInfo;
import io.swagger.client.model.GetDirectoryContents;
import io.swagger.client.model.IOFileSystemEntryInfo;
import io.swagger.client.model.ValidatePath;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for EnvironmentServiceApi
 */
@Ignore
public class EnvironmentServiceApiTest {

    private final EnvironmentServiceApi api = new EnvironmentServiceApi();

    /**
     * Gets the parent path of a given path
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentDefaultdirectorybrowserTest() throws Exception {
        DefaultDirectoryBrowserInfo response = api.getEnvironmentDefaultdirectorybrowser();

        // TODO: test validations
    }
    /**
     * Gets the contents of a given directory in the file system
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentDirectorycontentsTest() throws Exception {
        String path = null;
        Boolean includeFiles = null;
        Boolean includeDirectories = null;
        List<IOFileSystemEntryInfo> response = api.getEnvironmentDirectorycontents(path, includeFiles, includeDirectories);

        // TODO: test validations
    }
    /**
     * Gets available drives from the server&#x27;s file system
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentDrivesTest() throws Exception {
        List<IOFileSystemEntryInfo> response = api.getEnvironmentDrives();

        // TODO: test validations
    }
    /**
     * Gets a list of devices on the network
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentNetworkdevicesTest() throws Exception {
        List<IOFileSystemEntryInfo> response = api.getEnvironmentNetworkdevices();

        // TODO: test validations
    }
    /**
     * Gets shares from a network device
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentNetworksharesTest() throws Exception {
        String path = null;
        List<IOFileSystemEntryInfo> response = api.getEnvironmentNetworkshares(path);

        // TODO: test validations
    }
    /**
     * Gets the parent path of a given path
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentParentpathTest() throws Exception {
        String path = null;
        String response = api.getEnvironmentParentpath(path);

        // TODO: test validations
    }
    /**
     * Gets the contents of a given directory in the file system
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEnvironmentDirectorycontentsTest() throws Exception {
        GetDirectoryContents body = null;
        String path = null;
        Boolean includeFiles = null;
        Boolean includeDirectories = null;
        List<IOFileSystemEntryInfo> response = api.postEnvironmentDirectorycontents(body, path, includeFiles, includeDirectories);

        // TODO: test validations
    }
    /**
     * Gets the contents of a given directory in the file system
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEnvironmentValidatepathTest() throws Exception {
        ValidatePath body = null;
        String path = null;
        api.postEnvironmentValidatepath(body, path);

        // TODO: test validations
    }
}
