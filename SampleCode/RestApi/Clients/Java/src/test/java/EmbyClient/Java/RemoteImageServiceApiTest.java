/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.ImageProviderInfo;
import io.swagger.client.model.ImageType;
import io.swagger.client.model.RemoteImageResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RemoteImageServiceApi
 */
@Ignore
public class RemoteImageServiceApiTest {

    private final RemoteImageServiceApi api = new RemoteImageServiceApi();

    /**
     * Gets a remote image
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getImagesRemoteTest() throws Exception {
        String imageUrl = null;
        api.getImagesRemote(imageUrl);

        // TODO: test validations
    }
    /**
     * Gets available remote images for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdRemoteimagesTest() throws Exception {
        String id = null;
        ImageType type = null;
        Integer startIndex = null;
        Integer limit = null;
        String providerName = null;
        Boolean includeAllLanguages = null;
        RemoteImageResult response = api.getItemsByIdRemoteimages(id, type, startIndex, limit, providerName, includeAllLanguages);

        // TODO: test validations
    }
    /**
     * Gets available remote image providers for an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdRemoteimagesProvidersTest() throws Exception {
        String id = null;
        List<ImageProviderInfo> response = api.getItemsByIdRemoteimagesProviders(id);

        // TODO: test validations
    }
    /**
     * Downloads a remote image for an item
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsByIdRemoteimagesDownloadTest() throws Exception {
        String id = null;
        ImageType type = null;
        String providerName = null;
        String imageUrl = null;
        api.postItemsByIdRemoteimagesDownload(id, type, providerName, imageUrl);

        // TODO: test validations
    }
}
