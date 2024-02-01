/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.DevicesContentUploadHistory;
import io.swagger.client.model.DevicesDeviceInfo;
import io.swagger.client.model.DevicesDeviceOptions;
import io.swagger.client.model.QueryResultDevicesDeviceInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DeviceServiceApi
 */
@Ignore
public class DeviceServiceApiTest {

    private final DeviceServiceApi api = new DeviceServiceApi();

    /**
     * Deletes a device
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteDevicesTest() throws Exception {
        String id = null;
        api.deleteDevices(id);

        // TODO: test validations
    }
    /**
     * Gets all devices
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDevicesTest() throws Exception {
        String sortOrder = null;
        QueryResultDevicesDeviceInfo response = api.getDevices(sortOrder);

        // TODO: test validations
    }
    /**
     * Gets camera upload history for a device
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDevicesCamerauploadsTest() throws Exception {
        DevicesContentUploadHistory response = api.getDevicesCamerauploads();

        // TODO: test validations
    }
    /**
     * Gets info for a device
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDevicesInfoTest() throws Exception {
        String id = null;
        DevicesDeviceInfo response = api.getDevicesInfo(id);

        // TODO: test validations
    }
    /**
     * Gets options for a device
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDevicesOptionsTest() throws Exception {
        String id = null;
        DevicesDeviceOptions response = api.getDevicesOptions(id);

        // TODO: test validations
    }
    /**
     * Uploads content
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postDevicesCamerauploadsTest() throws Exception {
        Object body = null;
        String album = null;
        String name = null;
        String id = null;
        api.postDevicesCamerauploads(body, album, name, id);

        // TODO: test validations
    }
    /**
     * Deletes a device
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postDevicesDeleteTest() throws Exception {
        String id = null;
        api.postDevicesDelete(id);

        // TODO: test validations
    }
    /**
     * Updates device options
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postDevicesOptionsTest() throws Exception {
        DevicesDeviceOptions body = null;
        String id = null;
        api.postDevicesOptions(body, id);

        // TODO: test validations
    }
}
