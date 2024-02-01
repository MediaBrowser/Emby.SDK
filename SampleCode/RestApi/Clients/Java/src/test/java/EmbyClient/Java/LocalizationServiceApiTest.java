/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.GlobalizationCountryInfo;
import io.swagger.client.model.GlobalizationCultureDto;
import io.swagger.client.model.GlobalizationLocalizatonOption;
import io.swagger.client.model.ParentalRating;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for LocalizationServiceApi
 */
@Ignore
public class LocalizationServiceApiTest {

    private final LocalizationServiceApi api = new LocalizationServiceApi();

    /**
     * Gets known countries
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLocalizationCountriesTest() throws Exception {
        List<GlobalizationCountryInfo> response = api.getLocalizationCountries();

        // TODO: test validations
    }
    /**
     * Gets known cultures
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLocalizationCulturesTest() throws Exception {
        List<GlobalizationCultureDto> response = api.getLocalizationCultures();

        // TODO: test validations
    }
    /**
     * Gets localization options
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLocalizationOptionsTest() throws Exception {
        List<GlobalizationLocalizatonOption> response = api.getLocalizationOptions();

        // TODO: test validations
    }
    /**
     * Gets known parental ratings
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLocalizationParentalratingsTest() throws Exception {
        List<ParentalRating> response = api.getLocalizationParentalratings();

        // TODO: test validations
    }
}
