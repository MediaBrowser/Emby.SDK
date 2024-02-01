/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.LibraryAddMediaPath;
import io.swagger.client.model.LibraryAddVirtualFolder;
import io.swagger.client.model.LibraryRemoveMediaPath;
import io.swagger.client.model.LibraryRemoveVirtualFolder;
import io.swagger.client.model.LibraryRenameVirtualFolder;
import io.swagger.client.model.LibraryUpdateLibraryOptions;
import io.swagger.client.model.LibraryUpdateMediaPath;
import io.swagger.client.model.QueryResultVirtualFolderInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for LibraryStructureServiceApi
 */
@Ignore
public class LibraryStructureServiceApiTest {

    private final LibraryStructureServiceApi api = new LibraryStructureServiceApi();

    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteLibraryVirtualfoldersTest() throws Exception {
        api.deleteLibraryVirtualfolders();

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteLibraryVirtualfoldersPathsTest() throws Exception {
        api.deleteLibraryVirtualfoldersPaths();

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLibraryVirtualfoldersQueryTest() throws Exception {
        Integer startIndex = null;
        Integer limit = null;
        QueryResultVirtualFolderInfo response = api.getLibraryVirtualfoldersQuery(startIndex, limit);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLibraryVirtualfoldersTest() throws Exception {
        LibraryAddVirtualFolder body = null;
        api.postLibraryVirtualfolders(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLibraryVirtualfoldersDeleteTest() throws Exception {
        LibraryRemoveVirtualFolder body = null;
        api.postLibraryVirtualfoldersDelete(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLibraryVirtualfoldersLibraryoptionsTest() throws Exception {
        LibraryUpdateLibraryOptions body = null;
        api.postLibraryVirtualfoldersLibraryoptions(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLibraryVirtualfoldersNameTest() throws Exception {
        LibraryRenameVirtualFolder body = null;
        api.postLibraryVirtualfoldersName(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLibraryVirtualfoldersPathsTest() throws Exception {
        LibraryAddMediaPath body = null;
        api.postLibraryVirtualfoldersPaths(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLibraryVirtualfoldersPathsDeleteTest() throws Exception {
        LibraryRemoveMediaPath body = null;
        api.postLibraryVirtualfoldersPathsDelete(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postLibraryVirtualfoldersPathsUpdateTest() throws Exception {
        LibraryUpdateMediaPath body = null;
        api.postLibraryVirtualfoldersPathsUpdate(body);

        // TODO: test validations
    }
}
