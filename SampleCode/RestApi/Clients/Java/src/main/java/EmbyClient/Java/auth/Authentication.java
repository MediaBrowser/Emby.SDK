/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package EmbyClient.Java.auth;

import EmbyClient.Java.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
