/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.api;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for LogDownloadServiceApi
 */
@Ignore
public class LogDownloadServiceApiTest {

    private final LogDownloadServiceApi api = new LogDownloadServiceApi();

    /**
     * Downloads logs for the ticket of a download link
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEncodingLogsDownloadTest() throws Exception {
        String ticket = null;
        api.getEncodingLogsDownload(ticket);

        // TODO: test validations
    }
}
