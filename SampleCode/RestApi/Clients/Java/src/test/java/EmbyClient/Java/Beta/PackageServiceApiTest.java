/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.UpdatesPackageInfo;
import io.swagger.client.model.UpdatesPackageVersionClass;
import io.swagger.client.model.UpdatesPackageVersionInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PackageServiceApi
 */
@Ignore
public class PackageServiceApiTest {

    private final PackageServiceApi api = new PackageServiceApi();

    /**
     * Cancels a package installation
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deletePackagesInstallingByIdTest() throws Exception {
        String id = null;
        api.deletePackagesInstallingById(id);

        // TODO: test validations
    }
    /**
     * Gets available packages
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPackagesTest() throws Exception {
        String packageType = null;
        String targetSystems = null;
        Boolean isPremium = null;
        Boolean isAdult = null;
        List<UpdatesPackageInfo> response = api.getPackages(packageType, targetSystems, isPremium, isAdult);

        // TODO: test validations
    }
    /**
     * Gets a package, by name or assembly guid
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPackagesByNameTest() throws Exception {
        String name = null;
        String assemblyGuid = null;
        UpdatesPackageInfo response = api.getPackagesByName(name, assemblyGuid);

        // TODO: test validations
    }
    /**
     * Gets available package updates for currently installed packages
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPackagesUpdatesTest() throws Exception {
        String packageType = null;
        List<UpdatesPackageVersionInfo> response = api.getPackagesUpdates(packageType);

        // TODO: test validations
    }
    /**
     * Installs a package
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postPackagesInstalledByNameTest() throws Exception {
        String name = null;
        String assemblyGuid = null;
        String version = null;
        UpdatesPackageVersionClass updateClass = null;
        api.postPackagesInstalledByName(name, assemblyGuid, version, updateClass);

        // TODO: test validations
    }
    /**
     * Cancels a package installation
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postPackagesInstallingByIdDeleteTest() throws Exception {
        String id = null;
        api.postPackagesInstallingByIdDelete(id);

        // TODO: test validations
    }
}
