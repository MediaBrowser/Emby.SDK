/*
 * Emby Server REST API (BETA)
 * 
 */

package embyclient.api;

import embyclient.model.MediaEncodingSettingsApiHwaCancelHwaNodeOptions;
import embyclient.model.MediaEncodingSettingsApiHwaExecuteHwaConfigCommand;
import embyclient.model.MediaEncodingSettingsApiHwaSaveHwaConfig;
import embyclient.model.MediaEncodingSettingsApiHwaSaveHwaConfigResult;
import embyclient.model.MediaEncodingSettingsApiHwaSelectHwaBasicDevice;
import embyclient.model.MediaEncodingSettingsHwaEditingNodeOptionsForm;
import embyclient.model.MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType;
import embyclient.model.MediaEncodingSettingsHwaProjectionHwaConfigView;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for HwaConfigServiceApi
 */
@Ignore
public class HwaConfigServiceApiTest {

    private final HwaConfigServiceApi api = new HwaConfigServiceApi();

    /**
     * Gets the transcoding configuration graph
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEncodingHwaconfigTest() throws Exception {
        MediaEncodingSettingsHwaProjectionHwaConfigView response = api.getEncodingHwaconfig();

        // TODO: test validations
    }
    /**
     * Gets whether the active configuration has unsaved changes
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEncodingHwaconfighaschangesTest() throws Exception {
        Boolean response = api.getEncodingHwaconfighaschanges();

        // TODO: test validations
    }
    /**
     * Gets an options form for a graph node
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEncodingHwanodeoptionsTest() throws Exception {
        String nodeId = null;
        MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType = null;
        MediaEncodingSettingsHwaEditingNodeOptionsForm response = api.getEncodingHwanodeoptions(nodeId, editorType);

        // TODO: test validations
    }
    /**
     * Chooses the device Basic mode uses
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingHwabasicdeviceTest() throws Exception {
        MediaEncodingSettingsApiHwaSelectHwaBasicDevice body = null;
        MediaEncodingSettingsHwaProjectionHwaConfigView response = api.postEncodingHwabasicdevice(body);

        // TODO: test validations
    }
    /**
     * Runs a command against the transcoding configuration graph
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingHwaconfigcommandTest() throws Exception {
        MediaEncodingSettingsApiHwaExecuteHwaConfigCommand body = null;
        MediaEncodingSettingsHwaProjectionHwaConfigView response = api.postEncodingHwaconfigcommand(body);

        // TODO: test validations
    }
    /**
     * Discards the in-progress edit and reloads the active transcoding configuration
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingHwaconfigdiscardchangesTest() throws Exception {
        MediaEncodingSettingsHwaProjectionHwaConfigView response = api.postEncodingHwaconfigdiscardchanges();

        // TODO: test validations
    }
    /**
     * Saves the transcoding configuration
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingHwaconfigsaveTest() throws Exception {
        MediaEncodingSettingsApiHwaSaveHwaConfig body = null;
        MediaEncodingSettingsApiHwaSaveHwaConfigResult response = api.postEncodingHwaconfigsave(body);

        // TODO: test validations
    }
    /**
     * Stores an options form for a graph node
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingHwanodeoptionsTest() throws Exception {
        Object body = null;
        String nodeId = null;
        MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType = null;
        api.postEncodingHwanodeoptions(body, nodeId, editorType);

        // TODO: test validations
    }
    /**
     * Discards an open options form
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingHwanodeoptionscancelTest() throws Exception {
        MediaEncodingSettingsApiHwaCancelHwaNodeOptions body = null;
        api.postEncodingHwanodeoptionscancel(body);

        // TODO: test validations
    }
    /**
     * Runs a postback within an open options form
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingHwanodeoptionscommandTest() throws Exception {
        Object body = null;
        String nodeId = null;
        MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType = null;
        String commandId = null;
        String itemId = null;
        String data = null;
        MediaEncodingSettingsHwaEditingNodeOptionsForm response = api.postEncodingHwanodeoptionscommand(body, nodeId, editorType, commandId, itemId, data);

        // TODO: test validations
    }
    /**
     * Closes a form opened from within another one
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postEncodingHwanodesuboptionsTest() throws Exception {
        Object body = null;
        String nodeId = null;
        MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType editorType = null;
        Boolean isAccepted = null;
        MediaEncodingSettingsHwaEditingNodeOptionsForm response = api.postEncodingHwanodesuboptions(body, nodeId, editorType, isAccepted);

        // TODO: test validations
    }
}
