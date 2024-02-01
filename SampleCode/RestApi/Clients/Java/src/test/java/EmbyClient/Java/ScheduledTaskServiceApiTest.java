/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.TaskInfo;
import io.swagger.client.model.TaskTriggerInfo;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ScheduledTaskServiceApi
 */
@Ignore
public class ScheduledTaskServiceApiTest {

    private final ScheduledTaskServiceApi api = new ScheduledTaskServiceApi();

    /**
     * Stops a scheduled task
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteScheduledtasksRunningByIdTest() throws Exception {
        String id = null;
        api.deleteScheduledtasksRunningById(id);

        // TODO: test validations
    }
    /**
     * Gets scheduled tasks
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getScheduledtasksTest() throws Exception {
        Boolean isHidden = null;
        Boolean isEnabled = null;
        List<TaskInfo> response = api.getScheduledtasks(isHidden, isEnabled);

        // TODO: test validations
    }
    /**
     * Gets a scheduled task, by Id
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getScheduledtasksByIdTest() throws Exception {
        String id = null;
        TaskInfo response = api.getScheduledtasksById(id);

        // TODO: test validations
    }
    /**
     * Updates the triggers for a scheduled task
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postScheduledtasksByIdTriggersTest() throws Exception {
        List<TaskTriggerInfo> body = null;
        String id = null;
        api.postScheduledtasksByIdTriggers(body, id);

        // TODO: test validations
    }
    /**
     * Starts a scheduled task
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postScheduledtasksRunningByIdTest() throws Exception {
        String id = null;
        api.postScheduledtasksRunningById(id);

        // TODO: test validations
    }
    /**
     * Stops a scheduled task
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postScheduledtasksRunningByIdDeleteTest() throws Exception {
        String id = null;
        api.postScheduledtasksRunningByIdDelete(id);

        // TODO: test validations
    }
}
