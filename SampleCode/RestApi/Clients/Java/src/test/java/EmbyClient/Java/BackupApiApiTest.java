/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.MBBackupApiAllBackupsInfo;
import io.swagger.client.model.MBBackupApiDataRestoreOptions;
import io.swagger.client.model.MBBackupApiRestoreOptions;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for BackupApiApi
 */
@Ignore
public class BackupApiApiTest {

    private final BackupApiApi api = new BackupApiApi();

    /**
     * 
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBackuprestoreBackupinfoTest() throws Exception {
        MBBackupApiAllBackupsInfo response = api.getBackuprestoreBackupinfo();

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
    public void postBackuprestoreRestoreTest() throws Exception {
        MBBackupApiRestoreOptions body = null;
        api.postBackuprestoreRestore(body);

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
    public void postBackuprestoreRestoredataTest() throws Exception {
        MBBackupApiDataRestoreOptions body = null;
        api.postBackuprestoreRestoredata(body);

        // TODO: test validations
    }
}
