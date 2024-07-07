/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.RemoteSubtitleInfo;
import io.swagger.client.model.SubtitlesSubtitleDownloadResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SubtitleServiceApi
 */
@Ignore
public class SubtitleServiceApiTest {

    private final SubtitleServiceApi api = new SubtitleServiceApi();

    /**
     * Deletes an external subtitle file
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteItemsByIdSubtitlesByIndexTest() throws Exception {
        String id = null;
        String mediaSourceId = null;
        Integer index = null;
        api.deleteItemsByIdSubtitlesByIndex(id, mediaSourceId, index);

        // TODO: test validations
    }
    /**
     * Deletes an external subtitle file
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteVideosByIdSubtitlesByIndexTest() throws Exception {
        String id = null;
        String mediaSourceId = null;
        Integer index = null;
        api.deleteVideosByIdSubtitlesByIndex(id, mediaSourceId, index);

        // TODO: test validations
    }
    /**
     * Gets subtitles in a specified format.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatTest() throws Exception {
        String id = null;
        String mediaSourceId = null;
        Integer index = null;
        String format = null;
        Long startPositionTicks = null;
        Long endPositionTicks = null;
        Boolean copyTimestamps = null;
        api.getItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

        // TODO: test validations
    }
    /**
     * Gets subtitles in a specified format.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatTest() throws Exception {
        String id = null;
        String mediaSourceId = null;
        Integer index = null;
        String format = null;
        Long startPositionTicks = null;
        Long endPositionTicks = null;
        Boolean copyTimestamps = null;
        api.getItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

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
    public void getItemsByIdRemotesearchSubtitlesByLanguageTest() throws Exception {
        String id = null;
        String mediaSourceId = null;
        String language = null;
        Boolean isPerfectMatch = null;
        Boolean isForced = null;
        Boolean isHearingImpaired = null;
        List<RemoteSubtitleInfo> response = api.getItemsByIdRemotesearchSubtitlesByLanguage(id, mediaSourceId, language, isPerfectMatch, isForced, isHearingImpaired);

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
    public void getProvidersSubtitlesSubtitlesByIdTest() throws Exception {
        String id = null;
        api.getProvidersSubtitlesSubtitlesById(id);

        // TODO: test validations
    }
    /**
     * Gets subtitles in a specified format.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatTest() throws Exception {
        String id = null;
        String mediaSourceId = null;
        Integer index = null;
        String format = null;
        Long startPositionTicks = null;
        Long endPositionTicks = null;
        Boolean copyTimestamps = null;
        api.getVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

        // TODO: test validations
    }
    /**
     * Gets subtitles in a specified format.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatTest() throws Exception {
        String id = null;
        String mediaSourceId = null;
        Integer index = null;
        String format = null;
        Long startPositionTicks = null;
        Long endPositionTicks = null;
        Boolean copyTimestamps = null;
        api.getVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

        // TODO: test validations
    }
    /**
     * Gets subtitles in a specified format.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatTest() throws Exception {
        String id = null;
        String mediaSourceId = null;
        Integer index = null;
        String format = null;
        Long startPositionTicks = null;
        Long endPositionTicks = null;
        Boolean copyTimestamps = null;
        api.headItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

        // TODO: test validations
    }
    /**
     * Gets subtitles in a specified format.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatTest() throws Exception {
        String id = null;
        String mediaSourceId = null;
        Integer index = null;
        String format = null;
        Long startPositionTicks = null;
        Long endPositionTicks = null;
        Boolean copyTimestamps = null;
        api.headItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

        // TODO: test validations
    }
    /**
     * Gets subtitles in a specified format.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatTest() throws Exception {
        String id = null;
        String mediaSourceId = null;
        Integer index = null;
        String format = null;
        Long startPositionTicks = null;
        Long endPositionTicks = null;
        Boolean copyTimestamps = null;
        api.headVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

        // TODO: test validations
    }
    /**
     * Gets subtitles in a specified format.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatTest() throws Exception {
        String id = null;
        String mediaSourceId = null;
        Integer index = null;
        String format = null;
        Long startPositionTicks = null;
        Long endPositionTicks = null;
        Boolean copyTimestamps = null;
        api.headVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(id, mediaSourceId, index, format, startPositionTicks, endPositionTicks, copyTimestamps);

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
    public void postItemsByIdRemotesearchSubtitlesBySubtitleidTest() throws Exception {
        String id = null;
        String mediaSourceId = null;
        String subtitleId = null;
        SubtitlesSubtitleDownloadResult response = api.postItemsByIdRemotesearchSubtitlesBySubtitleid(id, mediaSourceId, subtitleId);

        // TODO: test validations
    }
    /**
     * Deletes an external subtitle file
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsByIdSubtitlesByIndexDeleteTest() throws Exception {
        String id = null;
        String mediaSourceId = null;
        Integer index = null;
        api.postItemsByIdSubtitlesByIndexDelete(id, mediaSourceId, index);

        // TODO: test validations
    }
    /**
     * Deletes an external subtitle file
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postVideosByIdSubtitlesByIndexDeleteTest() throws Exception {
        String id = null;
        String mediaSourceId = null;
        Integer index = null;
        api.postVideosByIdSubtitlesByIndexDelete(id, mediaSourceId, index);

        // TODO: test validations
    }
}
